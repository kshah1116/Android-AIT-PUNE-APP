package com.example.appait

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class Notice : Fragment(),View.OnClickListener {
    var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notice, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
        view.findViewById<Button>(R.id.closure).setOnClickListener(this)
        view.findViewById<Button>(R.id.charge).setOnClickListener(this)
        view.findViewById<Button>(R.id.fee).setOnClickListener(this)


    }
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.closure-> navController?.navigate(R.id.action_notice_to_noticeOne)
            R.id.charge-> navController?.navigate(R.id.action_notice_to_noticeTwo)
            R.id.fee-> navController?.navigate(R.id.action_notice_to_noticeThree)
        }
    }
}