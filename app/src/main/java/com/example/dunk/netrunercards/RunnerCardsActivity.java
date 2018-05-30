package com.example.dunk.netrunercards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class RunnerCardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runner_cards);

        RunnerCards runnerCards = new RunnerCards();
        ArrayList<Card> list = runnerCards.getList();


        RunnerCardsAdapter cardsAdapter = new RunnerCardsAdapter(this, list);
        ListView listView= findViewById(R.id.list);
        listView.setAdapter(cardsAdapter);

    }

    public void onListItemClick(View listItem) {
        Card card = (Card)listItem.getTag();
        Log.d("Card Name: ", card.getName());

        Intent intent = new Intent(this, CardActivity.class);
        intent.putExtra("card", card);
        startActivity(intent);
    }
}
