package com.example.hack.communityorganizer;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;




public class YoutubeFragment extends YouTubeBaseActivity {




    String videoURL = "https://www.youtube.com/watch?v=lL5GdkXIG64";


    /**private static final API_KEY = "AIzaSyBq0ZLKoXRq9TXST31ch-gv7tWzIND5hpY";

     public static string getApiKey(){
     return API_KEY;
     }**/


    public YoutubeFragment() {
        // Required empty public constructor
    }



    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    public static final String KEY = "AIzaSyBq0ZLKoXRq9TXST31ch-gv7tWzIND5hpY";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        youTubePlayerView = youTubePlayerView.findViewById(R.id.video1);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("lL5GdkXIG64");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        youTubePlayerView.initialize(KEY, onInitializedListener);

    }
}


