package com.example.exoplayer;

import android.media.PlaybackParams;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SpeedOptions extends Fragment {
//    TextView speed025, speed05, speed075, speed1, speed125, speed15, speed175, speed2;
    TextView btn;
    PlaybackParams pp;
    FragmentInterface fragmentInterface;

    void setFragmentInterface(FragmentInterface fragmentInterface) {
        this.fragmentInterface = fragmentInterface;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_speed_options, container, false);
//        speed025 = view.findViewById(R.id.subitemSpeed0_25);
//        speed05 = view.findViewById(R.id.subitemSpeed0_5);
//        speed075 = view.findViewById(R.id.subitemSpeed0_75);
//        speed1 = view.findViewById(R.id.subitemSpeed1);
//        speed125 = view.findViewById(R.id.subitemSpeed1_25);
//        speed15 = view.findViewById(R.id.subitemSpeed1_5);
//        speed175 = view.findViewById(R.id.subitemSpeed1_75);
//        speed2 = view.findViewById(R.id.subitemSpeed2);
//
//        speed025.setOnClickListener(new Click());
//        speed05.setOnClickListener(new Click());
//        speed075.setOnClickListener(new Click());
//        speed1.setOnClickListener(new Click());
//        speed125.setOnClickListener(new Click());
//        speed15.setOnClickListener(new Click());
//        speed175.setOnClickListener(new Click());
//        speed2.setOnClickListener(new Click());
        btn=view.findViewById(R.id.subitemSpeed0_25);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pp.setSpeed(0.25f);
                fragmentInterface.getSimpleExoPlayer().setPlaybackParams(pp);
            }
        });
        return view;
    }

    public class Click implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id) {
                case (R.id.subitemSpeed0_25): {
                    pp.setSpeed(0.25f);
                }
                case (R.id.subitemSpeed0_5): {
                    pp.setSpeed(0.5f);
                }
                case (R.id.subitemSpeed0_75): {
                    pp.setSpeed(0.75f);
                }
                case (R.id.subitemSpeed1): {
                    pp.setSpeed(1f);
                }
            }
            fragmentInterface.getSimpleExoPlayer().setPlaybackParams(pp);
        }
    }
}
