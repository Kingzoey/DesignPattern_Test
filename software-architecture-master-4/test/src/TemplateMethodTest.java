

import templatemethodpattern.*;
import tools.PrintTool;


    public static void main(String[] args) {

        PrintTool.print("here are some good shows in the carnival, and they are going to start!");

        PrintTool.print("comedy is going to show");
        Show comedy=new Comedy();
        comedy.playShow();

        PrintTool.print("dance is going to show");
        Show dance=new Dance();
        dance.playShow();

        PrintTool.print("song is going to show");
        Show song=new SingASong();
        song.playShow();

    }
}
