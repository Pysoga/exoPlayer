package com.example.exoplayer;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.exoplayer2.SimpleExoPlayer;

public interface FragmentInterface {
    public FragmentTransaction runFragment(Fragment nextClass);
    public SimpleExoPlayer getSimpleExoPlayer();
}
