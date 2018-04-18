package com.gmail.ahmadqorib97.pertemuan6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager =new LinearLayoutManager(getApplicationContext());
        recyclerView =
                findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015", "8.4", R.drawable.cover1);
            movieList.add(movie);
        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015", "7.2", R.drawable.cover2);
            movieList.add(movie);
        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015", "8.1", R.drawable.cover1);
            movieList.add(movie);
        movie = new Movie("Shaun the Sheep", "Animation", "2015", "6.6", R.drawable.cover2);
            movieList.add(movie);
        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015", "5.3", R.drawable.cover1);
            movieList.add(movie);
        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015", "7.8", R.drawable.cover2);
            movieList.add(movie);
        movie = new Movie("Up", "Animation", "2009", "7.7", R.drawable.cover1);
            movieList.add(movie);
        movie = new Movie("Star Trek", "Science Fiction", "2009", "9.3", R.drawable.cover2);
            movieList.add(movie);
        movie = new Movie("The LEGO Movie", "Animation", "2014", "9.1", R.drawable.cover1);
            movieList.add(movie);
        movie = new Movie("Iron Man", "Action & Adventure", "2008", "5.5", R.drawable.cover2);
            movieList.add(movie);
        movie = new Movie("Aliens", "Science Fiction", "1986", "7.6", R.drawable.cover1);
            movieList.add(movie);
        movie = new Movie("Chicken Run", "Animation", "2000", "6.7", R.drawable.cover2);
            movieList.add(movie);
        movie = new Movie("Back to the Future", "Science Fiction", "1985", "6.6", R.drawable.cover1);
            movieList.add(movie);
        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981", "8.9", R.drawable.cover2);
            movieList.add(movie);
        movie = new Movie("Goldfinger", "Action & Adventure", "1965", "9.5", R.drawable.cover1);
            movieList.add(movie);
        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014", "7.2", R.drawable.cover2);
            movieList.add(movie);
        mAdapter.notifyDataSetChanged();
    }
}
