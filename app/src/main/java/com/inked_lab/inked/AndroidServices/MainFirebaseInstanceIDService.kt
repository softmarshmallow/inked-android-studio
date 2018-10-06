package com.inked_lab.inked.AndroidServices

import android.util.Log

import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import com.inked_lab.inked.Helpers.UserDataHelper
import com.inked_lab.inked.WebServices.RegisterFCMService.RegisterFCMToken
import java.io.Console

class MainFirebaseInstanceIDService : FirebaseInstanceIdService() {

    override fun onTokenRefresh() {
        // Get updated InstanceID token.
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d(TAG, "Refreshed token: " + refreshedToken!!)

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.

        sendRegistrationToServer(refreshedToken)
    }

    private fun sendRegistrationToServer(token: String?) {
        // TODO: Implement this method to send token to your app server.
        RegisterFCMToken(UserDataHelper.UserUID, token!!)
        Log.d(TAG, token)
    }

    companion object {
        private val TAG = "FCMInstanceIDService"
    }
}
