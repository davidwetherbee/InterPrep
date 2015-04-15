package com.davezor.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.davezor.android.R;
import com.davezor.android.model.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Created by Flavadave on 4/12/2015.
 */
public class Adapter extends BaseAdapter {
    private List<Player> mPlayerList = new ArrayList<>();
    private LayoutInflater mLayoutInflater;
    // Context gives you access to system resources, gives a context for what you're working on.  Using context to access layout inflater in this case
    public Adapter(Context context){
        // Layout inflaters take xml references and create the views programmatically
        mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return mPlayerList.size();
    }

    @Override
    public Player getItem(int position) {
        return mPlayerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.list_item_player, parent, false);
            viewHolder = new ViewHolder(convertView);
            // setTag allows you to attach an object to a view
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();

        }
        Player player = getItem(position);
        viewHolder.playerImage.setImageResource(player.getImageResource());
        viewHolder.playerName.setText(player.getName());
        return convertView;
    }

    public void setData(Player[] playerArray) {
        //clears any existing data so it doesn't keep adding whats in the adapter
        mPlayerList.clear();
        mPlayerList.addAll(Arrays.asList(playerArray));
        //communicates back to listview, adapter's data has changed, re-render list b/c data has changed
        notifyDataSetChanged();
    }

    private static class ViewHolder {
        public ImageView playerImage;
        public TextView playerName;

        public ViewHolder(View view){
            playerImage = (ImageView) view.findViewById(R.id.player_image);
            playerName = (TextView) view.findViewById(R.id.player_name);
        }
    }

}

