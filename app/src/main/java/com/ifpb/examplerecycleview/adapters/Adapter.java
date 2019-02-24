package com.ifpb.examplerecycleview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ifpb.examplerecycleview.R;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private Context context;

    public Adapter(Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_layout, viewGroup, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder myViewHolder, final int i) {

        myViewHolder.item.setText("Item: " + i);
        myViewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Item " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView item;
        Button button;

        public MyViewHolder(View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.textItem);
            button = (Button) itemView.findViewById(R.id.button);
        }
    }
}
