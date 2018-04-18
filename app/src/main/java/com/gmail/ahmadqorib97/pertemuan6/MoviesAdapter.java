package com.gmail.ahmadqorib97.pertemuan6;

import android.media.Image;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by aqor on 17/04/18.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<Movie> moviesList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre, rating;
        public ImageView cover;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            rating = (TextView) view.findViewById(R.id.rating);
            cover = (ImageView) view.findViewById(R.id.cover);
        }
    }
    public MoviesAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.movie_items, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle()+" ("+movie.getYear()+")");
        holder.genre.setText(movie.getGenre());
        holder.rating.setText(movie.getRating());
        holder.cover.setImageResource(movie.getCover());
    }
    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}