package com.colin.GoodGirlReads.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.colin.GoodGirlReads.Models.Book;
import com.colin.GoodGirlReads.Repository.BookRepository;

import java.util.List;

public class BookViewModel extends AndroidViewModel {
    private BookRepository bookRepository;
    private LiveData<List<Book>> bookList;
    public BookViewModel(@NonNull Application application) {
        super(application);
        this.bookRepository = new BookRepository(application);
        this.bookList = bookRepository.getBookList();
    }
    public void insert(Book book){bookRepository.insert(book);}
    public LiveData<List<Book>> getBooks(){ return this.bookList; }
}
