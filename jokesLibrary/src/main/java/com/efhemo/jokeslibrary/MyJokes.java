package com.efhemo.jokeslibrary;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class MyJokes {

    List<String> list = asList(
            "Zulu was drivin an old Toyota, he was stopped by a traffic police officer.\n" +
                    "Officer: Where are the mirrors?\n" +
                    "Zulu: They are lost\n" +
                    "Officer: Insurance disc and certificate?\n" +
                    "Zulu: I dont have sir.\n" +
                    "Officer: What about indicators?\n" +
                    "Zulu: They don't work.\n" +
                    "Officer: Hooter?\n" +
                    "Zulu: It also doesn't work sir!\n" +
                    "Officer: Ok give me your licence!\n" +
                    "Zulu: Missing sir.\n" +
                    "Officer: kikikii, Just go now, U cannot afford to pay the fine, too much contravening.\n" +
                    "(Zulu doesn't leave but remains quiet in the car)\n" +
                    "Officer: I said go before I change my mind.\n" +
                    "Zulu.. Starter problem help me push sir...\n" +
                    "???????",
            "A GIRL DIRECTING HER NEW BOYFRIEND TO HER APARTMENT:\n" +
                    "\n" +
                    "GIRL: Come straight down the main road and stop at the flats on your left side. At the first floor, there is an elevator, get in and press button 8 with your elbow.\n" +
                    "When you arrive at room 8, press the bell (button) with your elbow and I will come and open.\n" +
                    "\n" +
                    "BOYFRIEND: Ok. But why do I have to press the buttons with my elbow?\n" +
                    "\n" +
                    "GIRLFRIEND: Are you coming empty handed?",
            "LITTLE JOHNNY AND GRANDFATHER\n" +
                    "\n" +
                    "Little Johnny sees his grandfather smoking and asks if can he try. The old man says \"can you touch your ass with your dick yet?\" \"No\" says Johnny. \"Then you can't have one\" says his grandad.\n" +
                    "\n" +
                    "Then the old geezer is drinking alcohol. Johnny asks can he have some. But he can't as he couldn't touch his ass with his dick yet.\n" +
                    "\n" +
                    "Later, Johnny was eating cookies and his grandfather asks if he can have some. Johnny asks,\"Can you touch your ass with your dick yet?\" Why of course I can replies says grandfather.\n" +
                    "Johnny quickly replied \"THEN GO F**K YOURSELF!\"\n" +
                    "???",
            "WHAT IS REUNION?\n" +
                    "\n" +
                    "Reunion is when you get up in the morning and tell your wife you are going to work.\n" +
                    "You secretly meet your neighbor to make love with her. Her husband comes and knocks on the door. You hurriedly hide under the bed.\n" +
                    "The husband enters and his wife says she wants to go to market to buy food items. The husband takes advantage of his wife's absence and calls your wife. Your wife arrives and they make love. Suddenly his wife (Your neighbour) who had gone to the market is back and knocks on the door. You're still under the bed and then your wife rushes to hide under the bed.\n" +
                    "This is REUNION.???",
            "Teacher: What is a baby lizard called?\n" +
                    "Akpos: a baby lizard is called lizzybaby.\n" +
                    "\n" +
                    "Read more: http://najoke.com/jokes?jt=short#ixzz5cGDFkCE7 \n" +
                    "Follow us: @naJokeO on Twitter | naJokeO on Facebook",
            "A Student Called his dad from school and he said\n" +
                    "“Dad the situation at school is very critical if you don't send me money am going to commit suicide ”\n" +
                    "Dad replied: Son the situation at home is also critical suicide approved\n" +
                    "\n" +
                    "Read more: http://najoke.com/jokes?jt=short#ixzz5cGDLyU5f \n" +
                    "Follow us: @naJokeO on Twitter | naJokeO on Facebook");

    public String getMyJoke(){

        Random random = new Random();

        return list.get(random.nextInt(list.size()));
    }

}
