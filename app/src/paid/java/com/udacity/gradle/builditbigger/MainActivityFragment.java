package com.udacity.gradle.builditbigger;

public class MainActivityFragment extends Fragment {
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_activity_main, container, false);

        return root;
    }
}