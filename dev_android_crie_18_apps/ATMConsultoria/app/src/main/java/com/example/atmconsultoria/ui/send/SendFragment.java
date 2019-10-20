package com.example.atmconsultoria.ui.send;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.atmconsultoria.SobreActivity;

public class SendFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(getContext(), SobreActivity.class));
    }
}