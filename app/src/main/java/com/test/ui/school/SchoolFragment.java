package com.test.ui.school;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.test.databinding.FragmentSchoolBinding;

public class SchoolFragment extends Fragment {

    private FragmentSchoolBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        com.test.ui.school.SchoolViewModel schoolViewModel =
                new ViewModelProvider(this).get(com.test.ui.school.SchoolViewModel.class);

        binding = FragmentSchoolBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSchool;
        schoolViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}