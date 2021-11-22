package com.harshit.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.bookviewHolder> {
    private Context context;
    private ArrayList<BookData> arrayList;

    public BookAdapter(Context context, ArrayList<BookData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public bookviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new bookviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull bookviewHolder holder, int position) {
    holder.textView.setText(arrayList.get(position).getTitle());
    holder.cardView.setOnClickListener(v->{
        Intent intent=new Intent(context,PDFViewer.class);
        intent.putExtra("type",arrayList.get(position).getName());
        context.startActivity(intent);
    });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class bookviewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private CardView cardView;
        public bookviewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.bookName);
            cardView=itemView.findViewById(R.id.mycardview);
        }
    }
}
