package com.example.booksale.features.book;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.booksale.R;
import com.example.booksale.features.book.helper.BookPojo;

public class BookActivity extends AppCompatActivity implements BookContract.View {

    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        BookPresenter bookPresenter = new BookPresenter(this);
        bookPresenter.setBooks();

    }

    @SuppressLint("ShowToast")
    @Override
    public void successMessage(String success) {
        Toast.makeText(this, success, Toast.LENGTH_LONG);
    }

    @Override
    public void errorMessage(String error) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void setBooks(@NonNull BookPojo body) {
        recyclerView = findViewById(R.id.rvBooks);
        BookAdapter thisAdapter = new BookAdapter(BookActivity.this, body.getBooks());
        recyclerView.setAdapter(thisAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(BookActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        thisAdapter.notifyDataSetChanged();
    }
}
























//        arr = new ArrayList<>();
//        arr.add(new AuthorsItem("Hari",2022,2002));
//        arr.add(new AuthorsItem("Jun",2023,1999));
//        arr.add(new AuthorsItem("Man",2020,2003));
//        arr.add(new AuthorsItem("Kul",2019,1998));
//
//        courseArrayList=new ArrayList<>();
//        courseArrayList.add(new BookPojo("Java", arr,10));
//        courseArrayList.add(new BookPojo("Java", arr,10));
//        courseArrayList.add(new BookPojo("Java", arr,10));
//        courseArrayList.add(new BookPojo("Java", arr,10));
//        courseArrayList.add(new BookPojo("Java", arr,10));
//        courseArrayList.add(new BookPojo("Java", arr,10));

//        recyclerView = findViewById(R.id.rvBooks);
//        BookAdapter thisAdapter = new BookAdapter(BookActivity.this,courseArrayList);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(BookActivity.this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(thisAdapter);
