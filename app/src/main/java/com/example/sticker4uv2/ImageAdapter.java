package com.example.sticker4uv2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4,
            R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9,
    };

    // Prices corresponding to each image
    public double[] prices = {10.00, 8.00, 12.00, 14.00, 9.00, 11.00, 13.00, 7.00, 15.00};

    public ImageAdapter(Context c){ mContext = c; }

    @Override
    public int getCount(){ return thumbImages.length; }

    @Override
    public Object getItem(int position){ return thumbImages[position]; }

    @Override
    public long getItemId(int position){ return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250, 250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }

    public double getPriceForPosition(int position) {
        if (position >= 0 && position < prices.length) {
            return prices[position];
        } else {
            // Return a default value if position is out of bounds
            return 0.0;
        }
    }
}
