package com.cosmos.newsreaderapp.ui.search;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cosmos.newsreaderapp.R;
import com.cosmos.newsreaderapp.databinding.FragmentBookmarksBinding;
import com.cosmos.newsreaderapp.databinding.FragmentSearchBinding;
import com.cosmos.newsreaderapp.ui.bookmarks.BookmarksViewModel;
import com.cosmos.newsreaderapp.ui.settings.SettingsViewModel;

public class SearchFragment extends Fragment {


    private FragmentSearchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SearchViewModel searchViewModel = new ViewModelProvider(this).get(SearchViewModel.class);

        binding = FragmentSearchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSearch;
        searchViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}