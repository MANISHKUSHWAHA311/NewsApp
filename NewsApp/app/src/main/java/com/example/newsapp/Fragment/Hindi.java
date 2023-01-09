package com.example.newsapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.newsapp.Fragment.hindiClass.aajtak;
import com.example.newsapp.Fragment.hindiClass.abpnews;
import com.example.newsapp.Fragment.hindiClass.indiatv;
import com.example.newsapp.Fragment.hindiClass.news24;
import com.example.newsapp.Fragment.hindiClass.newsnation;
import com.example.newsapp.Fragment.hindiClass.zeenews;
import com.example.newsapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Hindi#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Hindi extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Hindi() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Hindi.
     */
    // TODO: Rename and change types and number of parameters
    public static Hindi newInstance(String param1, String param2) {
        Hindi fragment = new Hindi();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.hindi, container, false);
       ImageButton aajtakbtn=(ImageButton) view.findViewById(R.id.aajtakbtn);
       aajtakbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(getActivity(), aajtak.class);
               startActivity(intent);

           }
       });
        ImageButton zeenewsbtn=(ImageButton) view.findViewById(R.id.zeenewsbtn);
        zeenewsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), zeenews.class);
                startActivity(intent);

            }
        });
        ImageButton abpnewsbtn=(ImageButton) view.findViewById(R.id.abpnewsbtn);
        abpnewsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), abpnews.class);
                startActivity(intent);

            }
        });
        ImageButton indiatvbtn=(ImageButton) view.findViewById(R.id.indiatvbtn);
        indiatvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), indiatv.class);
                startActivity(intent);

            }
        });
        ImageButton newsnation=(ImageButton) view.findViewById(R.id.newsnationbtn);
        newsnation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),newsnation.class);
                startActivity(intent);

            }
        });
        ImageButton news24=(ImageButton) view.findViewById(R.id.news24btn);
        news24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), news24.class);
                startActivity(intent);

            }
        });


        return view;
    }

}