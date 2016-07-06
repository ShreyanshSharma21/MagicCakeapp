package com.example.myapplication.magiccakeapp;

/**
 * Created by Alin on 6/19/2016.
 */
public class Facts {
    String facts[]={"The world's most expensive dessert costs $25,000.It’s a chocolate sundae with the most expensive varieties of cocoa along with edible 23-karat gold, in an edible golden goblet.",
            "Cupcakes got their name because they were cakes made from ingredients measured by the cupful.",
            "According to calacademy.org, an average Swiss person eats more than 24 pounds of chocolate per year.",
            "The verb ‘to pie’ which means 'to throw a custard pie' was first recorded in 1977.",
            "Before ice creams made with milk were created in the 10th century, the delicious dessert was in fact, made from ice.",
            "Strudel was create as early as 1696.",
            "Popsicles were invented by an eleven-year-old.",
            "Baklava was popular in the Ottoman Empire.",
            "There is a sundae that costs $25.000. It consists of a blend of 28 world's rarest varieties of cocoas along with 5 grams of edible 23-karat gold.",
            "The biggest gingerbread house was 2,520 square feet.",
            "Cannoli means \"little tube\".",
            "Candy apples are translated to \"apples of love\" in French.",
            "Jell-o had some less than appetizing flavors like cellery, italian salad or seasoned tomatoes.",
            "The inventor of the chocolate-chip cookies sold the rights to her recepies to Nestle in 1939 for 1 dollar.",
            "Cotton candy was invented by a dentist.",
            "The first pie ever thrown in ones face in Hollywood movies was in 1909 in the movie called \"Mr. Flip\".",
            "There is a thing as The World Custard Pie Throwing Championship.",
            "The chocolate river in Willy Wonka & the Chocolate Factory was actually made of chocolate. It Contained 150,000 gallons of water mixed with chocolate and cream.",
            "McDonald's offers wedding packages in Hong Kong, and the wedding cake is made out of baked apple pies.",
            "According to the legend, the candy cane was invented in Germany with the specific purpouse of keeping children quiet in church.",
            "New York City really loves Dunkin' Donuts. There are more of those than there are Starbucks and McDonald's combined.",
            "There is a fruit called Black Sapote that tastes just like chocolate pudding, but has four times the Vitamin C of an orange.",
            "In 2005, fortune cookies coincidentally predicted Powerball Lottery numbers, causing there to be 110 winning tickets. The total payout was 19,400,000 dollars split among the winners.",
            "Contrary to popular belief, croissants are not French. They were invented by a baker in Vienna to warn the military of Turks taking over the city",
            "The popsicle was invented by mistake. After stirring up a cup of powdered soda and water with a stick, eleven year old Frank Epperson left it outside overnight, causing it to freeze.",
            "Ice cream you see in ice cream commercials is often mashed potatoes to avoid melting during long production hours.",
            "It's believed the holes in donuts were invented in 1846 because of indigestion. When Hanson Crockett's mother would make donuts, the middle would always be undercooked, so he removed the donuts centers.",
            "There are over 87,000 drink combination possibilities at Starbucks. The most popular is a \"tall two pump pepper-mint, two pump mocha blended frappuccino \"."
    };
    int i = 0;

    public String nextFact()
    {
        i++;
        if(i >= facts.length)
        {
            i = 0;
        }
        return facts[i];
    }
    public String prevFact()
    {
        i--;
        return facts[i];
    }
}
