package com.example.exoplayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class VideoOptions extends Fragment {

    SpeedOptions speedOptions;
    LinearLayout ll;
    FragmentInterface fragmentInterface;

    void setFragmentInterface(FragmentInterface fragmentInterface) {
        this.fragmentInterface = fragmentInterface;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frame_options, container, false);
        ll = view.findViewById(R.id.tv_speed);
        speedOptions = new SpeedOptions();
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fragmentInterface != null){
                    fragmentInterface.runFragment(speedOptions).setCustomAnimations(R.anim.slide_down_exit, R.anim.slide_up_enter)
                            .addToBackStack(null).commit();
                }
            }
        });
        return view;
    }
}
