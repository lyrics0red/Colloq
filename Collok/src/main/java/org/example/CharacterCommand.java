package org.example;

public class CharacterCommand implements ICommand {
    private Character ch;

    public Direction orientation;

    public CharacterCommand(Character ch, Direction dir) {
        this.ch = ch;
        orientation = dir;
    }

    public void Execute()
    {
        if (orientation == Direction.Forward) {
            ch.MoveForward();
        } else if (orientation == Direction.Back) {
            ch.MoveBack();
        } else if (orientation == Direction.Left) {
            ch.MoveLeft();
        } else if (orientation == Direction.Right) {
            ch.MoveRight();
        }
    }
}
