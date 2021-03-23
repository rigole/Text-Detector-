package com.example.textdetector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {

    Context mcontentext;
    List<ScreenItem> screenItemList;

    public IntroViewPagerAdapter(Context mcontentext, List<ScreenItem> screenItemList) {
        this.mcontentext = mcontentext;
        this.screenItemList = screenItemList;
    }

    //Rendering elements on view
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mcontentext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layout_screen,null);

        ImageView imgslide = layoutScreen.findViewById(R.id.intro_img);
        TextView title = layoutScreen.findViewById(R.id.intro_title);
        TextView description = layoutScreen.findViewById(R.id.intro_desc);


        title.setText(screenItemList.get(position).getTitle());
        description.setText(screenItemList.get(position).getDescription());
        imgslide.setImageResource(screenItemList.get(position).getScreenImg());
        container.addView(layoutScreen);

        return  layoutScreen;
    }

    @Override
    public int getCount() {
        return screenItemList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
