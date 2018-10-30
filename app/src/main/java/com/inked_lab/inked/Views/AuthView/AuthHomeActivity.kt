package com.inked_lab.inked.Views.AuthView

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.inked_lab.inked.R
import kotlinx.android.synthetic.main.activity_auth_home.*
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.ApiException
import android.util.Log
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignIn
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Toast
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseUser
import com.inked_lab.inked.Views.MainTabController.MainTabControllerActivity
import com.google.firebase.auth.AuthResult
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.AuthCredential
import java.util.*


class AuthHomeActivity : AppCompatActivity(), GoogleApiClient.OnConnectionFailedListener {
    val TAG = "AuthHomeActivity"


    // [START declare_auth]
    private var mAuth: FirebaseAuth? = null
    // [END declare_auth]

    private var mGoogleSignInClient: GoogleSignInClient? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_NoActionBar)
        setContentView(R.layout.activity_auth_home)
        initUI()

        initFirebaseAuth()
        initGoogleSingin()
        initFacebookLogin()
    }

    fun initUI(){
        button_LoginWithEmail.setOnClickListener {
            toggleEmailLogin()
        }

        button_LoginWithGoogle.setOnClickListener {
            toggleGoogleSignin()
        }

        policyViewToggle.setOnClickListener{
            val intent = Intent(this, TermsAndPrivacyPoliciesActivity::class.java)
            startActivity(intent)
        }

        focusToBottom()
    }

    private fun focusToBottom(){
        authHomeMainScrollView.postDelayed( { authHomeMainScrollView.fullScroll(View.FOCUS_DOWN) }, 500)
    }


    fun initFirebaseAuth(){
        // [START initialize_auth]
        mAuth = FirebaseAuth.getInstance()
        // [END initialize_auth]
    }


    // region Google sign in
    override fun onConnectionFailed(p0: ConnectionResult) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val RC_SIGN_IN = 9001

    fun initGoogleSingin(){
        // [START config_signin]
        // Configure Google Sign In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build()
        // [END config_signin]
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)

    }

    fun toggleGoogleSignin(){
        val signInIntent = mGoogleSignInClient!!.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    fun toggleEmailLogin(){
        Toast.makeText(this, "소셜 로그인을 이용해 주세요", Toast.LENGTH_SHORT).show()
    }

    // [START auth_with_google]
    private fun firebaseAuthWithGoogle(acct: GoogleSignInAccount) {
        Log.d(TAG, "firebaseAuthWithGoogle:" + acct.id!!)
        // [START_EXCLUDE silent]
//        showProgressDialog()
        // [END_EXCLUDE]

        val credential = GoogleAuthProvider.getCredential(acct.idToken, null)
        mAuth!!.signInWithCredential(credential)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d(TAG, "signInWithCredential:success")
                        val user = mAuth!!.currentUser
                                updateUser(user)
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w(TAG, "signInWithCredential:failure", task.exception)
                        Snackbar.make(findViewById<View>(R.id.main_layout), "Authentication Failed.", Snackbar.LENGTH_SHORT).show()
                                updateUser(null)
                    }

                    // [START_EXCLUDE]
        //                    hideProgressDialog()
                    // [END_EXCLUDE]
                }
    }
    // [END auth_with_google]
    // endregion



    // region Facebook login

    internal lateinit var mCallbackManager: CallbackManager
    internal lateinit var loginManager: LoginManager
    internal fun initFacebookLogin() {
        // Initialize Facebook LoginWithEmail button
        mCallbackManager = CallbackManager.Factory.create()

        button_loginWithFacebook.setOnClickListener { loginManager.logInWithReadPermissions(this, Arrays.asList("email", "public_profile")) }
        AccessToken.setCurrentAccessToken(null)

        loginManager = LoginManager.getInstance()

        val callback = object : FacebookCallback<LoginResult> {
            override fun onSuccess(loginResult: LoginResult) {
                Log.d(TAG, "facebook:onSuccess:$loginResult")
                handleFacebookAccessToken(loginResult.accessToken)
            }

            override fun onCancel() {
                Log.d(TAG, "facebook:onCancel")
                // ...
            }

            override fun onError(error: FacebookException) {

                Log.d(TAG, "facebook:onError", error)
                // ...
            }
        }

        loginManager.registerCallback(mCallbackManager, callback)
    }


    // [START auth_with_facebook]
    private fun handleFacebookAccessToken(token: AccessToken) {
        Log.d(TAG, "handleFacebookAccessToken:$token")
        // [START_EXCLUDE silent]
//        showProgressDialog()
        // [END_EXCLUDE]

        val credential = FacebookAuthProvider.getCredential(token.getToken())
        mAuth!!.signInWithCredential(credential)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d(TAG, "signInWithCredential:success")
                        val user = mAuth!!.currentUser
                        updateUser(user)
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w(TAG, "signInWithCredential:failure", task.exception)
                        Toast.makeText(this, "Authentication failed.",
                                Toast.LENGTH_SHORT).show()
                        updateUser(null)
                    }

                    // [START_EXCLUDE]
//                    hideProgressDialog()
                    // [END_EXCLUDE]
                }
    }
    // [END auth_with_facebook]


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        // Facebook callback
        mCallbackManager.onActivityResult(requestCode, resultCode, data);


        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                // Google Sign In was successful, authenticate with Firebase
                val account = task.getResult(ApiException::class.java)
                firebaseAuthWithGoogle(account!!)
            } catch (e: ApiException) {
                // Google Sign In failed, update UI appropriately
                Log.w(TAG, "Google sign in failed", e)
                // [START_EXCLUDE]
                updateUser(null)
                // [END_EXCLUDE]
            }

        }
    }

    private fun updateUser(user: FirebaseUser?) {
        if (user != null){
            finish()
            val intent = Intent(this, MainTabControllerActivity::class.java)
            Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }else{
            Toast.makeText(this, "Failed to login", Toast.LENGTH_SHORT).show()
        }

    }

    public override fun onPause() {
        super.onPause()
//        mGoogleSignInClient.s(this)
//        mGoogleSignInClient.disconnect()
    }


}
