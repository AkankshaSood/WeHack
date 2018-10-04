package com.developer.harshi.quiz;

public class QuestionLibrary2 {
    private String mQuestions [] ={" A light sensitive device that converts drawing, printed texts or other images into digital form is ",
            " Which protocol provides email facility among various hosts?",
            " In order to tell excel that we are entering a formula in a cell we must begin with this operator",
            " Which of the following groups consist of only output devices?",
            "____ is the process of carrying out commands.",
            " A (n) ____ contains commands that can be selected. ",
            " Microsoft Word is an example of: ",
            " A series of instructions that tells a computer what to do and how to do it is called a: ",
            " in how many generations can computers be divided ",
            "1 kb="};

    private String mchoices [] [] = {{"Scaner”,“Monitor”,“Keyboard"},
        { "SMTP","FTP","TELNET"},

        {"#","@","+"},

        {" Plotter, Printer, Monitor”,“Scanner, Printer, Monitor”,“Keyboard,Printer,Monitor "},

        {"Decoding" ,"Storing","Executing"},
        { "Menu"," Pointer”,” Icon"},
        {"Application Software","an operating system" ,"a processing device"},
        {" program”,“Command”,User"},
        {"5”,“4”,“3"},
        {"1024 bytes","1000 bytes”,”1042 bytes"}
        };

private String mCorrectAnswers [] = {" Scanner ",
        " SMTP ",
        "#",
        " Plotter, Printer, Monitor "," Decoding "," Menu "," application software "," program ","5","1024 bytes "
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

public String getCorrectAnswers() {
        String correctanswer = mCorrectAnswers[0];
        return correctanswer;

        }
        }

