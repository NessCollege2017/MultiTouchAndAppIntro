package ness.edu.multitouchandappintro.appintro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import ness.edu.multitouchandappintro.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AppIntroFragment extends Fragment {
    //newInstance -> ctrl+space:
    //also added args.putInt(...)

    public static AppIntroFragment newInstance(int position) {
        Bundle args = new Bundle();
        args.putInt("position", position);
        AppIntroFragment fragment = new AppIntroFragment();
        fragment.setArguments(args);
        return fragment;
    }

    //properties:
    private ImageView ivAppIntro;

    private int[] imageResources = {
            R.drawable.app_intro_1,
            R.drawable.app_intro_2,
            R.drawable.app_intro_3,
            R.drawable.app_intro_4
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_app_intro, container, false);
        ivAppIntro = v.findViewById(R.id.ivIntro);

        //in which position are we in? (viewPager position argument)
        int position = getArguments().getInt("position");
        //get the image by position
        int imgResource = imageResources[position];

        ivAppIntro.setImageResource(imgResource);
        return v;
    }
}
