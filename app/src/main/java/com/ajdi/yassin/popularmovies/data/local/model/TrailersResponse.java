package com.ajdi.yassin.popularmovies.data.local.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Yassin Ajdi.
 */
public class TrailersResponse {

    @SerializedName("results")
    private List<Trailer> trailers;

    public List<Trailer> getTrailers() {
        return trailers;
    }

    public void setTrailers(List<Trailer> trailers) {
        this.trailers = trailers;
    }
}
