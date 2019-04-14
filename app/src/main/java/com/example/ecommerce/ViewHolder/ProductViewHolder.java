package com.example.ecommerce.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerce.Interface.ItemsClickListener;
import com.example.ecommerce.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtproductName,txtproductDescription,txtproductPrice;
    public ImageView imageView;
    public ItemsClickListener listener;

    public ProductViewHolder(@NonNull View itemView)
    {
        super(itemView);

        imageView=(ImageView)itemView.findViewById(R.id.product_image);
        txtproductName=(TextView)itemView.findViewById(R.id.product_name);
        txtproductDescription=(TextView)itemView.findViewById(R.id.product_description);
        txtproductPrice=(TextView)itemView.findViewById(R.id.product_price);

    }
    public void setItemsClickListener(ItemsClickListener listener)
    {
        this.listener=listener;
    }

    @Override
    public void onClick(View v)
    {
        listener.onClick(v, getAdapterPosition(),false);

    }
}
