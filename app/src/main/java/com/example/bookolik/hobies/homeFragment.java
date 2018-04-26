package com.example.bookolik.hobies;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class homeFragment extends Fragment {

    Button paylas;
    public homeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        paylas= getActivity().findViewById(R.id.paylas);
        paylas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paylasintent=new Intent(getActivity(),paylasim.class);
                startActivity(paylasintent);


            }
        });



    }
}