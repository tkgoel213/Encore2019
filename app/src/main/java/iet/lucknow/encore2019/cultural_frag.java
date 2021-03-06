package iet.lucknow.encore2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import iet.lucknow.encore2019.R;

import iet.lucknow.encore2019.cultural_events.torque;


public class cultural_frag extends Fragment {
    public CardView dance;
    public CardView skit;
    public CardView bike;
    public CardView nukkad;
    public CardView sing;
    public CardView final_year;
    public CardView vogue;
    public TextView dance1;
    public TextView skit1;
    public TextView bike1;
    public TextView nukkad1;
    public TextView sing1;
    public TextView final_year1;
    public TextView vogue1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cultural_frag, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("CULTURAL");

        dance = view.findViewById(R.id.dance_card);
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.dance.class);
                startActivity(intentLoadNewActivity);
            }

        });
        dance1 = view.findViewById(R.id.dance);
        dance1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.dance.class);
                startActivity(intentLoadNewActivity);
            }

        });

        skit = view.findViewById(R.id.skit_card);
        skit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.skit.class);
                startActivity(intentLoadNewActivity);
            }
        });
        skit1 = view.findViewById(R.id.skit);
        skit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.skit.class);
                startActivity(intentLoadNewActivity);
            }

        });

        bike = view.findViewById(R.id.bike_card);
        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), torque.class);
                startActivity(intentLoadNewActivity);
            }
        });
        bike1 = view.findViewById(R.id.bike);
        bike1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), torque.class);
                startActivity(intentLoadNewActivity);
            }

        });
        vogue = view.findViewById(R.id.vogue_card);
        vogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.vogue.class);
                startActivity(intentLoadNewActivity);
            }
        });
        vogue1 = view.findViewById(R.id.vogue);
        vogue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.vogue.class);
                startActivity(intentLoadNewActivity);
            }

        });
        nukkad = view.findViewById(R.id.nukkad_card);
        nukkad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.nukkad.class);
                startActivity(intentLoadNewActivity);
            }
        });
        nukkad1 = view.findViewById(R.id.nukkad);
        nukkad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.nukkad.class);
                startActivity(intentLoadNewActivity);
            }

        });

        sing = view.findViewById(R.id.sing_card);
        sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.sing.class);
                startActivity(intentLoadNewActivity);
            }
        });
        sing1 = view.findViewById(R.id.sing);
        sing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(getActivity(), iet.lucknow.encore2019.cultural_events.sing.class);
                startActivity(intentLoadNewActivity);
            }

        });
    }
}
