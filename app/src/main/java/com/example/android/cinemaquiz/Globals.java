package com.example.android.cinemaquiz;

/**
 * Created by yiantzi on 9/4/2017.
 */

public class Globals {

    private static Globals instance;
    private static String answers ="";
    private static int score = 0;
    private static boolean q01 = true;
    private static boolean q02 = true;
    private static boolean q03 = true;
    private static boolean q04 = true;
    private static boolean q05 = true;
    private static boolean q06 = true;
    private static boolean q07 = true;
    private static boolean q08 = true;
    private static boolean q09 = true;
    private static boolean q10 = true;


    public void increaseScore(){
        score = score + 1;
    }


    public void setAnswer(String t){
        Globals.answers = answers + t;
    }

    public String getAnswers(){
        return Globals.answers;
    }

    public int getScore()  {return Globals.score;}

    public static synchronized Globals getInstance(){
        if(instance == null){
            instance = new Globals();
        }
        return instance;
    }

    public Boolean isTrueq01(){
        return Globals.q01;
    }
    public Boolean isTrueq02(){
        return Globals.q02;
    }
    public Boolean isTrueq03(){
        return Globals.q03;
    }
    public Boolean isTrueq04(){
        return Globals.q04;
    }
    public Boolean isTrueq05(){
        return Globals.q05;
    }
    public Boolean isTrueq06(){
        return Globals.q06;
    }
    public Boolean isTrueq07(){
        return Globals.q07;
    }
    public Boolean isTrueq08(){
        return Globals.q08;
    }
    public Boolean isTrueq09(){
        return Globals.q09;
    }
    public Boolean isTrueq10(){
        return Globals.q10;
    }


    public void setFalseq01(){
        Globals.q01 = false;
    }
    public void setFalseq02(){
        Globals.q02 = false;
    }
    public void setFalseq03(){
        Globals.q03 = false;
    }
    public void setFalseq04(){
        Globals.q04 = false;
    }
    public void setFalseq05(){
        Globals.q05 = false;
    }
    public void setFalseq06(){
        Globals.q06 = false;
    }
    public void setFalseq07(){
        Globals.q07 = false;
    }
    public void setFalseq08(){
        Globals.q08 = false;
    }
    public void setFalseq09(){
        Globals.q09 = false;
    }
    public void setFalseq10(){
        Globals.q10 = false;
    }






}
