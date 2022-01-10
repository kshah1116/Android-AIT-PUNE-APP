package com.example.appait

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation



class afterLoginChoice : Fragment(),View.OnClickListener  {
    var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_after_login_choice, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
        view.findViewById<Button>(R.id.notice).setOnClickListener(this)
        view.findViewById<Button>(R.id.reviewbtn).setOnClickListener(this)


    }
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.notice-> navController?.navigate(R.id.action_afterLoginChoice_to_notice)
            R.id.reviewbtn-> navController?.navigate(R.id.action_afterLoginChoice_to_review_ait2)
        }
    }


}


