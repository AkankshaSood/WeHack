package com.developer.harshi.quiz;

public class QuestionLibrary {
    private String mQuestions [] ={"Which cooking method is the LEAST healthiest?",
    "Which disorders are associated with eating too much fried food?",
            "Should you decide to fry your food, which methods are the best?",
            "What types of cooking utensils/equipment can be used to reduce fat?",
            "How many teaspoons are in a tablespoon?",
            "How many ounces in a cup?",
            "How many cups are in a quart?",
            "How many quarts are in a gallon?",
            "How long does it take to boil water?",
            "A mixture of rough cut or diced vegetables, herbs, and spices, used for seasoning is called"};

    private String mchoices [] [] = {
            {"Grilling","Baking","Frying"},
            {"Obesity","High Blood Pressure","Extreme Happiness"},
            {"Use copious amounts of peanut oil","Thoroughly coat the pan with lard","Use oils low in non-saturated fat"},
            {"deep fryer","Non-stick cooking pan","Oven/Broiler"},
            {"Three","Five","Six"},
            {"Five","Eight","Two"},
            {"One","Four","Eight"},
            {"Six","Four","Nine"},
            {"1-2 minutes","3-5 minutes","5-8 minutes"},
            {"Mirepox","Saute","Sear"}
    };

    private String mCorrectAnswers [] = {"Frying",
            "High Blood Pressure",
            "Use oils low in non-saturated fat",
            "Oven/Broiler","Three","Eight","Four","Four","5-8 minutes","Mirepox"
    };

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    };

    public String getchoice1(int a) {
        String choice1 = mchoices[a][0];
        return choice1;
    };

    public String getchoice2(int a) {
        String choice2 = mchoices[a][1];
        return choice2;
    };

    public String getchoice3(int a) {
        String choice3 = mchoices[a][2];
        return choice3;
    };

    public String getCorrectAnswers(int a) {
        String correctanswer = mCorrectAnswers[a];
        return correctanswer;

    }
}
