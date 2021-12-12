package com.example.viewpager

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import org.w3c.dom.Text

class Fragment1 : Fragment(R.layout.fragment_1) {

    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var sport: EditText
    lateinit var music: EditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.enterText)
        sport = view.findViewById(R.id.enterText)
        music = view.findViewById(R.id.enterText)
        button = view.findViewById(R.id.enterButton)

        val navController = Navigation.findNavController(view)

        button.setOnClickListener {
            val text = editText.text.toString()
            val text2 = sport.text.toString()
            val text3 = music.text.toString()

            if(text.isEmpty()){
                return@setOnClickListener
            }

            val action = Fragment1Directions.actionFragment1ToFragment2(text,text2,text3)




    }

    }
}