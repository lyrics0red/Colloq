package org.example;

import java.util.HashMap;

public class GamePad {
    HashMap<Direction, ICommand> moves;

    public GamePad() {
        moves = new HashMap<Direction, ICommand>();
    }

    public void SetCommand(Direction dir, CharacterCommand command) {
        moves.put(dir, command);
    }

    public void MoveJoystick(Direction dir) {
        moves.get(dir).Execute();
    }
}
