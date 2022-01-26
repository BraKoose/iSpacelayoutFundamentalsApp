package com.koose.layoutfundamentalsapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.frame_layout_example_one)
	}

	fun showSnackBar(view: View) {
		Snackbar.make(view, "Hey! I am Snackbar", Snackbar.LENGTH_LONG).show()
	}
}
