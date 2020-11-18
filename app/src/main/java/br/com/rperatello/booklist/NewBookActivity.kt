package br.com.rperatello.booklist

import android.content.Intent
import android.os.Bundle
import android.view.View
import br.com.rperatello.booklist.databinding.ActivityNewBookBinding
import androidx.appcompat.app.AppCompatActivity as AppCompatActivity

class NewBookActivity : AppCompatActivity() {
    // View Binding
    private lateinit var activityNewBookBinding: ActivityNewBookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflar layout com view binding
        activityNewBookBinding = ActivityNewBookBinding.inflate(layoutInflater)
        setContentView(activityNewBookBinding.root)
    }

    fun onClick(view: View){
        if (view.id == R.id.saveBt){
            val book = Book(
                    activityNewBookBinding.titleEt.text.toString();
                    activityNewBookBinding.isbnEt.text.toString();
                    activityNewBookBinding.firstAuthorEt.text.toString();
                    activityNewBookBinding.publishingCompanyEt.text.toString();
                    activityNewBookBinding.editionEt.text.toInt();
                    activityNewBookBinding.pageEt.text.toInt();
            )
            var resultintent = Intent();
            resultintent.putExtra(MainActivity.EXTRA_BOOK)
        }
    }
}