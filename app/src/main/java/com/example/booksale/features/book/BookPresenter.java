package com.example.booksale.features.book;

import android.util.Log;
import androidx.annotation.NonNull;

import com.example.booksale.features.book.helper.BookPojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookPresenter implements BookContract.Presenter {

    private final BookContract.View mView;
    private final BookModel bookModel = new BookModel();

    public BookPresenter(BookContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void setBooks() {
        bookModel.getBooks().enqueue(new Callback<BookPojo>() {
            @Override
            public void onResponse(@NonNull Call<BookPojo> call, @NonNull Response<BookPojo> response) {
                if (response.isSuccessful()) {
                    mView.setBooks(response.body());
                    mView.successMessage("Api call Success.");
                } else {
                    mView.errorMessage("Api call BookPojo is error.");
                }
            }

            @Override
            public void onFailure(@NonNull Call<BookPojo> call, @NonNull Throwable throwable) {
                throwable.printStackTrace();
                Log.d("onFailure", "Api call BookPojo is fails: " + throwable);
            }
        });
    }
}
