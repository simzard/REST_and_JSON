/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Random;

/**
 *
 * @author simon
 */
public class DataGenerator {

    private static final Random random = new Random();

    private static final String[] fnames
            = {"karen", "hans", "poul", "ib", "klaus", "martin", "bob", "lene", "marlene", "rasums"};

    private static final String[] lnames
            = {"hansen", "poulsen", "jensen", "thomsen", "raoub", "steinaa", "routhe", "henriksen", "thomsen", "anthonisen"};

    private static final String[] streets
            = {"aagade 12", "amagerbrogade 45", "vesterbrogade 2", "kinavej 12", "japanvej 25", "persiensgade 17", "norgesgade 46", "sverigesgade 35", "roskildevej 1", "lyngbyvej 108"};

    private static final String[] cities
            = {"koebenhavn", "aalborg", "aarhus", "stockholm", "oslo", "paris", "berlin", "new york", "cambridge", "zimbabwe"};

    public static String getData(int amount, String properties) {
        JsonArray ja = new JsonArray();

        // parse the properties
        String tokens[] = properties.trim().split(",");

        for (int i = 0; i < amount; i++) {
            JsonObject quoteOutJSON = new JsonObject();

            for (String prop : tokens) {
                switch (prop) {
                    case "fname":
                        quoteOutJSON.addProperty(prop, fnames[random.nextInt(fnames.length)]);
                        break;
                    case "lname":
                        quoteOutJSON.addProperty(prop, lnames[random.nextInt(lnames.length)]);
                        break;
                    case "street":
                        quoteOutJSON.addProperty(prop, streets[random.nextInt(streets.length)]);
                        break;
                    case "city":
                        quoteOutJSON.addProperty(prop, cities[random.nextInt(cities.length)]);
                        break;
                }

            }
            ja.add(quoteOutJSON);
        }

        return ja.toString();
    }
}
