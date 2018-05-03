package pl.mateuszzalewski;

public class Solution {

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        int horizontalPosition = position[1];
        int verticalPosition = position[0];
        String[] outputArray = new String[moves.length];
        for (int i = 0; i < moves.length; i++) {
            switch (moves[i]) {
                case "up":
                    verticalPosition = moveUp(verticalPosition);
                    break;
                case "down":
                    verticalPosition = moveDown(verticalPosition, fighters.length);
                    break;
                case "left":
                    horizontalPosition = moveLeft(horizontalPosition, fighters[0].length);
                    break;
                case "right":
                    horizontalPosition = moveRight(horizontalPosition, fighters[0].length);
                    break;
            }
            outputArray[i] = fighters[verticalPosition][horizontalPosition];
        }
        return outputArray;
    }

    private static int moveRight(int horizontalPosition, int maxHorizontal) {
        return horizontalPosition == maxHorizontal - 1 ? 0 : horizontalPosition + 1;
    }

    private static int moveLeft(int horizontalPosition, int maxHorizontal) {
        return horizontalPosition == 0 ? maxHorizontal - 1 : horizontalPosition - 1;
    }

    private static int moveDown(int verticalPosition, int maxVertical) {
        return verticalPosition == maxVertical - 1 ? maxVertical - 1 : verticalPosition + 1;
    }

    private static int moveUp(int verticalPosition) {
        return verticalPosition == 0 ? 0 : verticalPosition - 1;
    }
}
