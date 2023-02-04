package org.example;

import java.util.Random;

public class WannaPlay {
    public static void main(String[] args) {
        System.out.println("Управляю своим персонажем\n");
        GamePad gp = new GamePad();
        Character ch = new Character();
        gp.SetCommand(Direction.Forward, new CharacterCommand(ch, Direction.Forward));
        gp.SetCommand(Direction.Back, new CharacterCommand(ch, Direction.Back));
        gp.SetCommand(Direction.Left, new CharacterCommand(ch, Direction.Left));
        gp.SetCommand(Direction.Right, new CharacterCommand(ch, Direction.Right));

        for (int i = 0; i < 10; ++i) {
            int rand = (int)(Math.random() * 5);
            if (rand == 0) {
                gp.MoveJoystick(Direction.Forward);
            } else if (rand == 1) {
                gp.MoveJoystick(Direction.Back);
            } else if (rand == 2) {
                gp.MoveJoystick(Direction.Left);
            } else {
                gp.MoveJoystick(Direction.Right);
            }
        }
    }
}