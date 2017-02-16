package com.example.asheransari.waitlist;

import android.support.v7.app.AlertController;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by asher.ansari on 2/17/2017.
 */

public class GuestListAdapter extends RecyclerView.Adapter<GuestListAdapter.GuestViewHolder> {



class GuestViewHolder extends RecyclerView.ViewHolder{

    TextView nameTextView;
    TextView partySizeTextView;
    public GuestViewHolder(View itemView) {
        super(itemView);
        nameTextView = (TextView)itemView.findViewById(R.id.name_text_view);
        partySizeTextView = (TextView)itemView.findViewById(R.id.party_size_text_view);
    }

}
}
