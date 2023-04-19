package com.example.booksale.features.book;

import com.example.booksale.features.api.ApiCallInstance;
import com.example.booksale.features.api.ApiServices;
import com.example.booksale.features.book.helper.BookPojo;

import retrofit2.Call;
import retrofit2.Retrofit;

public class BookModel implements BookContract.Model {

    @Override
    public Call<BookPojo> getBooks() {
        Retrofit retrofit = ApiCallInstance.getRetrofitInstance();
        return retrofit.create(ApiServices.class).getBooks();
    }
}
