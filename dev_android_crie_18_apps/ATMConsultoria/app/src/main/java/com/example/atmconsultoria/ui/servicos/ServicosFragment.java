package com.example.atmconsultoria.ui.servicos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.atmconsultoria.R;

public class ServicosFragment extends Fragment {

    private ServicosViewModel servicosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        servicosViewModel =
                ViewModelProviders.of(this).get(ServicosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_servicos, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);
        servicosViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });
        return root;
    }
}