package com.example.darwis.androidcafeserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.darwis.androidcafeserver.Common.Common;
import com.example.darwis.androidcafeserver.Interface.ItemClickListener;
import com.example.darwis.androidcafeserver.R;

/**
 * Created by Dyah on 1/16/2018.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,
View.OnCreateContextMenuListener
{

    public TextView txtMenuName;
    public ImageView imageView;
    private ItemClickListener itemClickListener;

    public MenuViewHolder(View itemView) {
        super(itemView);

        txtMenuName = itemView.findViewById(R.id.menu_name);
        imageView = itemView.findViewById(R.id.menu_image);

        itemView.setOnCreateContextMenuListener(this);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {

        itemClickListener.onClick(v,getAdapterPosition(),false);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
          contextMenu.setHeaderTitle("Select the Action");
          contextMenu.add(0,0,getAdapterPosition(),Common.UPDATE);
          contextMenu.add(0,1,getAdapterPosition(),Common.DELETE);
//        menu.setHeaderTitle("Select the action");
//
//        menu.add(0,0,getAdapterPosition(), Common.UPDATE);
//        menu.add(0,1,getAdapterPosition(), Common.DELETE);
    }
}

