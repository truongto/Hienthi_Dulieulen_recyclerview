package com.d.httprequest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.Holder> {
    private Context context;
    HttpGetTask httpGetTask;
    private List<Post> postList;

    PostAdapter(Context context,List<Post> postList){
        this.context=context;
        this.postList=postList;
    }
    @NonNull
    @Override
    public PostAdapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.post_adapter, viewGroup, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.Holder holder, int i) {
       Post post = postList.get(i);
       holder.text1.setText(post.getId()+"");
        holder.text2.setText(post.getDate());
        holder.text3.setText(post.getTitle());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }



    public class Holder extends RecyclerView.ViewHolder {
        TextView text1,text2,text3;
        public Holder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.id);
            text2 = itemView.findViewById(R.id.date);
            text3 = itemView.findViewById(R.id.title);
        }
    }
}
