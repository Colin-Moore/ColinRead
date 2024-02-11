package com.colin.GoodGirlReads.Views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.colin.GoodGirlReads.R;
import com.colin.GoodGirlReads.ViewModels.BookViewModel;
import com.colin.GoodGirlReads.ViewModels.UserViewModel;
import com.colin.GoodGirlReads.Models.Book;

import java.util.ArrayList;
import java.util.List;

public class UserHomeActivity extends AppCompatActivity {

    TextView txt_username;
    HorizontalScrollView sv_reading, sv_suggestions;
    UserViewModel userViewModel;
    BookViewModel bookViewModel;
    List<Book> suggestedBooks;
    List<Book> readingBooks;
    Button userBooks;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        setTitle("User Home");

        txt_username = findViewById(R.id.txt_username);
        sv_reading = findViewById(R.id.sv_readbooks);
        sv_suggestions = findViewById(R.id.sv_suggestions);

        suggestedBooks = new ArrayList<>();
        readingBooks = new ArrayList<>();

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        bookViewModel = new ViewModelProvider(this).get(BookViewModel.class);

        txt_username.setText(userViewModel.user.getUsername());

    }
}
