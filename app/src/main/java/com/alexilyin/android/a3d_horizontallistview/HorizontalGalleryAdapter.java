package com.alexilyin.android.a3d_horizontallistview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by user on 25.03.16.
 */
public class HorizontalGalleryAdapter extends RecyclerView.Adapter<HorizontalGalleryAdapter.Holder> {

    int[] images;
    Context context;

    final Random random = new Random();

    public HorizontalGalleryAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.horizontal_gallery_view, parent, false);
        Holder holder = new Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.preview.setImageDrawable(ContextCompat.getDrawable(context, images[position]));
        holder.rating.setText(random.nextInt(1000) + "/" + random.nextInt(1000));
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class Holder extends RecyclerView.ViewHolder {

        ImageView preview;
        TextView rating;

        public Holder(View itemView) {
            super(itemView);
            preview = (ImageView) itemView.findViewById(R.id.horizontal_gallery_view_preview);
            rating = (TextView) itemView.findViewById(R.id.horizontal_gallery_view_text);
        }
    }
}
