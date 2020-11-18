package br.com.rperatello.booklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import br.com.rperatello.booklist.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Data source de Adapter
    private List<Book> bookList;

    //Adapter do ListView
    private ArrayAdapter<String> bookListAdapter;

    // View Binding
    private ActivityMainBinding activityMainBinding;

    //Constante para extra de Book

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Infla layout com view bilding e setar o root como layout
        activityMainBinding = ActivityMainBinding.inflate((getLayoutInflater()));
        setContentView(activityMainBinding.getRoot());

        // Instanciar a bookList
        bookList = new ArrayList();
        initializeBookList();

        // Instanciar bookListAdapter
        bookListAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, bookList);

        //Setando bookListAdapter como Adapter do bookList
        activityMainBinding.bookListLv.setAdapter(bookListAdapter);

    }

    // Método que popula o bookList para teste
    private void initializeBookList() {
        for (int i = 0; i < 10; i++) {
            bookList.add(
                    new Book(
                            "Titulo" + i,
                            "ISBN" + i,
                            "Autor" + i,
                            "Editora" + i,
                            i,
                            i
                    )
            );
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater
        return super.onCreateOptionsMenu(menu);
    }

}