import delegationpattern.*;

import tools.PrintTool;

public class DelegationTest {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        PrintTool.print("the dolphin is born with jumping:");
        dolphin.showSkill();
        Skill handshake = new Handshake();
        PrintTool.print("the dolphin can learn to handshake:");
        dolphin.learnSkill(handshake);
        dolphin.showSkill();
    }
}
