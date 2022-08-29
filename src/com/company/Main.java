package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\t\t~My day~");
        System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
        done();
    }
    static void done(){
        Random random=new Random();
        int positive=0;
        int negative=0;
        int neutral=0;
        String[] action=new String[]{"\t-^-Start a new day-^-","*-->Get up with left side  *","*-->Get up with right side  *",
        "*-->Fell down from bed     *", "*-->Running in the park    *", "*-->Exercise on balkon     *", "*-->Drink a coffee       *","*-->Have a good breakfast  *",
        "*-->Eat old salad        *","*-->Car broken down        *","*-->Go to work by walking    *","*-->Go to work by bus     *","*-->Go to work by own car    *",
        "*-->Arrive work on time     *","*-->Come to work late     *","\t-^-The End-^-"};
        System.out.println(action[0]);
        System.out.println("------------------------------");
        int a= random.nextInt(1,3);
        if (a==1){
            System.out.println(action[1]);
            negative++;
            int b= random.nextInt(10);//sol jak`
            if (b<8){
                System.out.println(action[3]);//kravat jygyldy
                negative++;
                int c= random.nextInt(1,12);
                if (c<9){
                    System.out.println(action[6]);//kofe ichti
                    positive++;
                    int i= random.nextInt(5);
                    if (i<3){
                        System.out.println(action[9]);//koleso spustilo
                        negative++;
                        int q= random.nextInt(8);
                        if (q<3){
                            System.out.println(action[10]);//peshkom
                            negative++;
                            int aj= random.nextInt(8);
                            if (aj<3){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }else {
                            System.out.println(action[11]);//bus
                            neutral++;
                            int ba= random.nextInt(1,3);
                            if (ba<2){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }
                    }else {
                        System.out.println(action[12]);//svoem avto
                        positive++;
                        int y=random.nextInt(8);
                        if (y<6){
                            System.out.println(action[13]);//vovremya
                            positive++;
                        }else {
                            System.out.println(action[14]);//opozdal
                            negative++;
                        }
                    }
                }else {
                    System.out.println(action[7]);//zavtrek
                    neutral++;
                    int j= random.nextInt(5);
                    if (j<3){
                        System.out.println(action[9]);//koleso spustilo
                        negative++;
                        int r= random.nextInt(8);
                        if (r<3){
                            System.out.println(action[10]);//peshkom
                            negative++;
                            int ai= random.nextInt(8);
                            if (ai<3){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }else {
                            System.out.println(action[11]);//bus
                            int bb= random.nextInt(1,3);
                            if (bb<2){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }
                    }else {
                        System.out.println(action[12]);//svoem avto
                        positive++;
                        int z=random.nextInt(8);
                        if (z<6){
                            System.out.println(action[13]);//vovremya
                            positive++;
                        }else {
                            System.out.println(action[14]);//opozdal
                            negative++;
                        }
                    }
                }
            }else{
                System.out.println(action[4]);//churkap keldi
                neutral++;
                int d = random.nextInt(1,12);
                if (d<9){
                    System.out.println(action[6]);//kofe ichti
                    positive++;
                    int k= random.nextInt(5);
                    if (k<3){
                        System.out.println(action[9]);//koleso spustilo
                        negative++;
                        int s= random.nextInt(8);
                        if (s<3){
                            System.out.println(action[10]);//peshkom
                            negative++;
                            int ak= random.nextInt(8);
                            if (ak<3){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }else {
                            System.out.println(action[11]);//bus
                            neutral++;
                            int bc= random.nextInt(1,3);
                            if (bc<2){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }
                    }else {
                        System.out.println(action[12]);//svoem avto
                        positive++;
                        int ae=random.nextInt(8);
                        if (ae<6){
                            System.out.println(action[13]);//vovremya
                            positive++;
                        }else {
                            System.out.println(action[14]);//opozdal
                            negative++;
                        }
                    }
                }else {
                    System.out.println(action[7]);// zavtrak
                    neutral++;
                    int l= random.nextInt(5);
                    if (l<3){
                        System.out.println(action[9]);//koleso spustilo
                        negative++;
                        int t= random.nextInt(8);
                        if (t<3){
                            System.out.println(action[10]);//peshkom
                            negative++;
                            int al= random.nextInt(8);
                            if (al<3){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }else {
                            System.out.println(action[11]);//bus
                            neutral++;
                            int bd= random.nextInt(1,3);
                            if (bd<2){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }
                    }else {
                        System.out.println(action[12]);//svoem avto
                        positive++;
                        int ad=random.nextInt(8);
                        if (ad<6){
                            System.out.println(action[13]);//vovremya
                            positive++;
                        }else {
                            System.out.println(action[14]);//opozdal
                            positive++;
                        }
                    }
                }
            }
        }else {
            System.out.println(action[2]);
            int f= random.nextInt(1,6);//on jak
            positive++;
            if (f<5){
                System.out.println(action[5]);//churkkap keldi
                neutral++;
                int g= random.nextInt(1,12);
                if (g<9){
                    System.out.println(action[6]);//kofe ichti
                    positive++;
                    int p= random.nextInt(5);
                    if (p<3){
                        System.out.println(action[9]);//koleso spustilo
                        negative++;
                        int u= random.nextInt(8);
                        if (u<3){
                            System.out.println(action[10]);//peshkom
                            negative++;
                            int an= random.nextInt(8);
                            if (an<3){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }else {
                            System.out.println(action[11]);//bus
                            neutral++;
                            int be= random.nextInt(1,3);
                            if (be<2){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }
                    }else {
                        System.out.println(action[12]);//svoem avto
                        positive++;
                        int ac=random.nextInt(8);
                        if (ac<6){
                            System.out.println(action[13]);//vovremya
                            positive++;
                        }else {
                            System.out.println(action[14]);//opozdal
                            negative++;
                        }
                    }
                }else {
                    System.out.println(action[7]);// zavtrak
                    neutral++;
                    int m= random.nextInt(5);
                    if (m<3){
                        System.out.println(action[9]);//koleso spustilo
                        negative++;
                        int v= random.nextInt(8);
                        if (v<3){
                            System.out.println(action[10]);//peshkom
                            negative++;
                            int ao= random.nextInt(8);
                            if (ao<3){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }else {
                            System.out.println(action[11]);//bus
                            negative++;
                            int bf= random.nextInt(1,3);
                            if (bf<2){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }
                    }else {
                        System.out.println(action[12]);//svoem avto
                        positive++;
                        int af=random.nextInt(8);
                        if (af<6){
                            System.out.println(action[13]);//vovremya
                            positive++;
                        }else {
                            System.out.println(action[14]);//opozdal
                            negative++;
                        }
                    }
                }
            }else{
                System.out.println(action[4]);//balkondo
                neutral++;
                if (random.nextInt(1,4)<2){
                    System.out.println(action[7]);//zavtrak
                    neutral++;
                    int n= random.nextInt(5);
                    if (n<3){
                        System.out.println(action[9]);//koleso spustilo
                        negative++;
                        int w= random.nextInt(8);
                        if (w<3){
                            System.out.println(action[10]);//peshkom
                            negative++;
                            int ap= random.nextInt(8);
                            if (ap<3){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }else {
                            System.out.println(action[11]);//bus
                            neutral++;
                            int bg= random.nextInt(1,3);
                            if (bg<2){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }
                    }else {
                        System.out.println(action[12]);//svoem avto
                        positive++;
                        int ag=random.nextInt(8);
                        if (ag<6){
                            System.out.println(action[13]);//vovremya
                            positive++;
                        }else {
                            System.out.println(action[14]);//opozdal
                            negative++;
                        }
                    }
                }else {
                    System.out.println(action[8]);//salad
                    negative++;
                    int o= random.nextInt(5);
                    if (o<3){
                        System.out.println(action[9]);//koleso spustilo
                        negative++;
                        int x= random.nextInt(8);
                        if (x<3){
                            System.out.println(action[10]);//peshkom
                            negative++;
                            int aq= random.nextInt(8);
                            if (aq<3){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }else {
                            System.out.println(action[11]);//bus
                            neutral++;
                            int bh= random.nextInt(1,3);
                            if (bh<2){
                                System.out.println(action[13]);//vovremya
                                positive++;
                            }else {
                                System.out.println(action[14]);//opozdal
                                negative++;
                            }
                        }
                    }else {
                        System.out.println(action[12]);//svoem avto
                        positive++;
                        int ah=random.nextInt(8);
                        if (ah<6){
                            System.out.println(action[13]);//vovremya
                            positive++;
                        }else {
                            System.out.println(action[14]);//opozdal
                            negative++;
                        }
                    }
                }
            }
        }
        System.out.println("_______________________________");
        System.out.println(action[15]);
        System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
        System.out.println();
        System.out.println("Positive: "+"("+positive+")");
        System.out.println("Negative: "+"("+negative+")");
        System.out.println("Neutral: "+"("+neutral+")");
        System.out.println();

        if (positive>negative && positive>negative){
            System.out.println("My day was positive");
        }else if (negative>positive && negative>neutral){
            System.out.println("My day was negative");
        }else {
            System.out.println("My day was neutral");
        }
    }
}