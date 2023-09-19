package com.suvai.realandroidappdevcourse.noteApplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.suvai.realandroidappdevcourse.databinding.ActivityNoteBinding

class NoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.toolbar)
//
//        val navController = findNavController(R.id.nav_host_fragment_content_note)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)
//
//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }

        val myNewJanuaryNote = MyNote("Course Lecture","How to make android application?")
        myNewJanuaryNote.toString()

//        val myNewMarchNote = myNewJanuaryNote
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_note)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }
}