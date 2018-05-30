package com.example.dunk.netrunercards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class RunnerCardsAdapter extends ArrayAdapter<Card> {

    public RunnerCardsAdapter(Context context, ArrayList<Card> cards) {
        super(context, 0, cards);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cards_item, parent, false);
        }

        Card currentCard = getItem(position);


        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentCard.getName());

        TextView type = listItemView.findViewById(R.id.type);
        type.setText(currentCard.getType().toString());

        TextView faction = listItemView.findViewById((R.id.faction));
        faction.setText(currentCard.getFaction().toString());

        listItemView.setTag(currentCard);

        return listItemView;
    }
}
