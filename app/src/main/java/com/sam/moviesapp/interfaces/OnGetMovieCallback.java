package com.sam.moviesapp.interfaces;

import com.sam.moviesapp.models.Movie;

public interface OnGetMovieCallback {

    void onSuccess(Movie movie);

    void onError();
}
