package com.ghalym.databasesexample.sqliteExample.Note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ghalym.databasesexample.R
import com.ghalym.databasesexample.sqliteExample.Note.addNote.AddNoteActivity
import com.ghalym.databasesexample.sqliteExample.Note.displayNote.DisplayNotesActivity
import kotlinx.android.synthetic.main.activity_note.*

class NoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        supportActionBar?.title = getString(R.string.lbl_example_sqlite)

        btnGoToAddNote.setOnClickListener {

            val intent = Intent(this, AddNoteActivity::class.java);
            startActivity(intent)
        }


        btnGoToDisplayNotes.setOnClickListener {

            val intent = Intent(this, DisplayNotesActivity::class.java);
            startActivity(intent)
        }
    }
}
