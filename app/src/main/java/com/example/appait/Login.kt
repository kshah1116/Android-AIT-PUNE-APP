package com.example.appait

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class Login : Fragment(),View.OnClickListener  {
    var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)



}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
        view.findViewById<Button>(R.id.loginbtn).setOnClickListener (this)


    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.loginbtn-> navController?.navigate(R.id.action_login_to_afterLoginChoice)
        }
    }


}
