package com.inked_lab.inked.Tests

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.inked_lab.inked.Models.AnalyzedNewsModel
import android.content.Context.MODE_PRIVATE
import android.R.id.edit
import android.app.PendingIntent.getActivity
import android.content.Context
import com.google.firebase.internal.FirebaseAppHelper.getToken




object Test{
    val TAG = "TestHost"

    fun TestSplash(){
        FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener {
            val token = it.result!!.token
            Log.d(TAG, token)
        }.addOnFailureListener {
            Log.d(TAG, it.localizedMessage)

        }
    }

}