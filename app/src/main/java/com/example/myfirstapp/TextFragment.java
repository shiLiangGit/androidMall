package com.example.myfirstapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TextFragment extends Fragment {
    public static final String TEXT_CONT = "content";
    private String mCont;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mCont = getArguments().getString(TEXT_CONT);
        }
    }

    public static TextFragment newInstance(String cont) {
        Bundle args = new Bundle();
        args.putString(TEXT_CONT, cont);
        TextFragment fragment = new TextFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text,null);
        TextView textFragment = view.findViewById(R.id.textFragment);
        textFragment.setText(mCont);
//        ImageView imageFragment = view.findViewById(R.id.imageFragment);
//        imageFragment.setImageResource(Integer.parseInt(mCont));

        return view;
    }
}

