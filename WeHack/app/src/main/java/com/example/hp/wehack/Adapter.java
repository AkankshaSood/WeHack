package com.example.hp.wehack;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * Created by akanksha on 10/4/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private Context mContext;
    private List<Video> videoList;
    private SparseBooleanArray expandState = new SparseBooleanArray();

    public class MyViewHolder extends RecyclerView.ViewHolder  {
        public TextView title,views,likes,duration,channel,date;
        public ImageView thumbnail;
        LinearLayout ParentLayout,expandableLayout;
        CardView cv;
        Button btn;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            views = (TextView) view.findViewById(R.id.views);
            likes = (TextView) view.findViewById(R.id.likes);
            date = (TextView) view.findViewById(R.id.date);
            channel = (TextView) view.findViewById(R.id.channel);
            duration = (TextView) view.findViewById(R.id.duration);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            ParentLayout = (LinearLayout)view.findViewById(R.id.parent_layout);
            cv = (CardView)view.findViewById(R.id.video_card);
            expandableLayout = (LinearLayout)view.findViewById(R.id.expanded);
            btn= (Button) view.findViewById(R.id.btn);
        }

    }


    public Adapter(Context mContext, List<Video> VideoList) {
        this.mContext = mContext;
        this.videoList = VideoList;
        for (int i = 0; i < VideoList.size(); i++) {
            expandState.append(i, false);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Video video = videoList.get(position);
        final boolean isExpanded = expandState.get(position);
        String sourceString = "</b>Channel: " + "<b> " + video.getChannel();
        holder.title.setText(video.getName());
        holder.views.setText(video.getViews());
        holder.likes.setText(video.getLikes());
        holder.duration.setText(video.getDuration());
        holder.channel.setText(Html.fromHtml(sourceString));
        sourceString = "</b>Upload Date: " + "<b> " + video.getDate();
        holder.date.setText(Html.fromHtml(sourceString));

        holder.expandableLayout.setVisibility(isExpanded?View.VISIBLE:View.GONE);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                onClickButton(holder.expandableLayout, holder.btn,  position);
            }
        });

        new DownLoadImageTask(holder.thumbnail).execute(video.getImgURL());
        holder.cv.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext,YouTubeActivity.class);
                i.putExtra("id",video.getId());
                mContext.startActivity(i);
            }
        });
    }
    @Override
    public int getItemCount() {
        return videoList.size();
    }

    private void onClickButton(final LinearLayout expandableLayout, final Button buttonLayout, final  int i) {

        if (expandableLayout.getVisibility() == View.VISIBLE){
            expandableLayout.setVisibility(View.GONE);
            expandState.put(i, false);
        }else{
            expandableLayout.setVisibility(View.VISIBLE);
            expandState.put(i, true);
        }
    }



    private class DownLoadImageTask extends AsyncTask<String,Void,Bitmap> {
        ImageView imageView;

        public DownLoadImageTask(ImageView imageView){
            this.imageView = imageView;
        }

        /*
            doInBackground(Params... params)
                Override this method to perform a computation on a background thread.
         */
        protected Bitmap doInBackground(String...urls){
            String urlOfImage = urls[0];
            Bitmap logo = null;
            try{
                InputStream is = new URL(urlOfImage).openStream();
                /*
                    decodeStream(InputStream is)
                        Decode an input stream into a bitmap.
                 */
                logo = BitmapFactory.decodeStream(is);
            }catch(Exception e){ // Catch the download exception
                e.printStackTrace();
            }
            return logo;
        }

        /*
            onPostExecute(Result result)
                Runs on the UI thread after doInBackground(Params...).
         */
        protected void onPostExecute(Bitmap result){
            imageView.setImageBitmap(result);
        }


    }
}

