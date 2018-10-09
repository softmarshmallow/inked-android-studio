package com.inked_lab.inked.Helpers

import com.google.firebase.auth.FirebaseAuth

object UserDataHelper{


    var UserUID: String
        get() {
            val uid = FirebaseAuth.getInstance().currentUser?.uid
            if (uid != null) {
                return uid
            }
            return ""
        }
        set(value) {}

}