package com.example.dunk.netrunercards;

import java.util.ArrayList;

import static enums.Factions.ANARCH;
import static enums.RunnerCardType.EVENT;
import static enums.RunnerCardType.HARDWARE;
import static enums.RunnerCardType.IDENTITY;
import static enums.RunnerCardType.PROGRAM;
import static enums.RunnerCardType.RESOURCE;

public class RunnerCards {

    private ArrayList<Card> list;

    public RunnerCards() {
        list = new ArrayList<>();
        list.add(new Card("Reina Roja: Freedom Fighter", IDENTITY, 0, ANARCH, 15, 1));
        list.add(new Card("Demolition Run", EVENT, 2, ANARCH, 2, 2));
        list.add(new Card("Retrieval Run", EVENT, 3, ANARCH, 2, 3));
        list.add(new Card("Singularity", EVENT, 4, ANARCH, 3, 4));
        list.add(new Card("Stimhack", EVENT, 0, ANARCH, 1, 5));
        list.add(new Card("Cyberfeeder", HARDWARE, 2, ANARCH, 1, 6));
        list.add(new Card("Spinal Modem", HARDWARE, 4, ANARCH, 2, 7));
        list.add(new Card("Darwin", PROGRAM, 3, ANARCH, 3, 8));
        list.add(new Card("Datasucker", PROGRAM, 3, ANARCH, 3, 9));
        list.add(new Card("Force Of Nature", PROGRAM, 5, ANARCH, 1, 10));
        list.add(new Card("Imp", PROGRAM, 2, ANARCH, 3, 11));
        list.add(new Card("Hemorrhage", PROGRAM, 3, ANARCH, 4, 12));
        list.add(new Card("Mimic", PROGRAM, 3, ANARCH, 1, 13));
        list.add(new Card("Morningstar", PROGRAM, 8, ANARCH, 4, 14));
        list.add(new Card("Ice Carver", RESOURCE, 3, ANARCH, 3, 15));
        list.add(new Card("Liberated Account", RESOURCE, 6, ANARCH, 2, 16));
        list.add(new Card("Scrubber", RESOURCE, 2, ANARCH, 1, 17));
        list.add(new Card("Xanadu", RESOURCE, 3, ANARCH, 2, 18));
        }

    public ArrayList<Card> getList() {
        return new ArrayList<Card>(list);
    }

}
