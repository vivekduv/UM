package app;

import java.util.Random;

public class DrawingApp {

    private static boolean isValidColor(char color) {

        if (color == 'R' || color == 'G' || color == 'B' || color == 'Y' || color == '*' || color == '.') {

            return true;
        } else {
            return false;
        }

    }

    public static String getRectangle(int maxRows, int maxCols, char symbol) {
        String rectangle = "";

        if (maxRows < 1 || maxCols < 1) {
            return null;
        }

        for (int outerLoop = 1; outerLoop <= maxRows; outerLoop++) {
            // System.out.println("outerloop :" + outerLoop);
            for (int innerLoop = 1; innerLoop <= maxCols; innerLoop++) {

                rectangle = rectangle + symbol;
                // System.out.println("Inner Loop" + innerLoop);

            }
            if (outerLoop != maxRows) {
                rectangle = rectangle + "\n";
            }
        }

        return rectangle;

    }

    public static char getRandomColor(Random random) {
        int value = random.nextInt(6);

        if (value == 0) {
            return 'R';
        } else if (value == 1) {
            return 'G';
        } else if (value == 2) {
            return 'B';
        } else if (value == 3) {
            return 'Y';
        } else if (value == 4) {
            return '*';
        } else if (value == 5) {
            return '.';
        }
        return '0';

    }

    public static String getHorizontalBars(int maxRows, int maxCols, int bars, char color1, char color2, char color3) {
        if (bars < 1) {
            return null;
        }
        int sizeOfBar = maxRows / bars;

        if (sizeOfBar < 1 || isValidColor(color1) == false || isValidColor(color2) == false
                || isValidColor(color3) == false) {
            return null;
        }
        String rectangle1 = "";

        char colorOfBar = color1;

        for (int barCounter = 0; barCounter < bars; barCounter++) {
            if (barCounter % 3 == 0) {
                colorOfBar = color1;
            } else if (barCounter % 3 == 1) {
                colorOfBar = color2;
            } else
                colorOfBar = color3;

            rectangle1 = rectangle1 + getRectangle(sizeOfBar, maxCols, colorOfBar);
            if (barCounter < bars - 1) {
                rectangle1 = rectangle1 + "\n";
            }
        }

        return rectangle1;

    }

    public static String getFlag(int size, char color1, char color2, char color3) {

        int maxRows = size * 2;
        int maxColumns = size * 5;

        StringBuilder flag = new StringBuilder();

        for (int rowCounter = 1; rowCounter <= maxRows; rowCounter++) {

            for (int colCounter = 1; colCounter <= maxColumns; colCounter++) {

                if (rowCounter <= maxRows / 2) {

                    if (rowCounter >= colCounter) {
                        flag.append(color1);
                    } else if (rowCounter == 1 || rowCounter == maxRows) {
                        flag.append(color2);
                    } else if (rowCounter == maxRows / 2) {
                        flag.append(color2);
                    }

                    else {
                        flag.append(color3);
                    }

                }
                else if  (rowCounter > maxRows / 2) {


                    if (rowCounter==(maxRows/2)+1 && rowCounter > colCounter) {

                        flag.append(color1);
                    }
                    else {
                        flag.append(color1);
                    }

                    //		else if (rowCounter == maxRows) {
                    //		flag.append(color2);
                    //	}
//					else if (colCounter>=rowCounter && rowCounter<=colCounter) {
//						flag.append(color2);
//					}
//
//					else {
//						flag.append(color3);
//					}



                }

            }

            if (rowCounter < maxRows) {
                flag.append('\n');
            }

        }

        return flag.toString();

    }

    private static void firstPrint(char color1, char color2, char color3, int maxRows, StringBuilder flag,
                                   int rowCounter, int colCounter) {
        if (rowCounter >= colCounter) {
            flag.append(color1);
        } else if (rowCounter == 1 || rowCounter == maxRows) {
            flag.append(color2);
        } else if (rowCounter == maxRows / 2) {
            flag.append(color2);
        }

        else {
            flag.append(color3);
        }
    }

    private static void secondPrint(char color1, char color2, char color3, int maxRows, StringBuilder flag,
                                    int rowCounter, int colCounter) {
        if (rowCounter <= colCounter) {
            flag.append(color3);
        } else if (rowCounter == maxRows) {
            flag.append(color2);
        } else if (rowCounter == maxRows / 2) {
            flag.append(color2);
        }

        else {
            flag.append(color1);
        }
    }

    public static String getVerticalBars(int maxRows, int maxCols, int bars, char color1, char color2, char color3) {
        if (maxCols / bars < 1) {
            return null;
        }

        String result = "";

        for (int rowCounter = 0; rowCounter < maxRows; rowCounter++) {
            for (int barCounter = 0; barCounter < bars; barCounter++) {
                char currentColor;
                if (barCounter % 3 == 0) {
                    currentColor = color1;
                } else if (barCounter % 3 == 1) {
                    currentColor = color2;
                } else {
                    currentColor = color3;
                }

                for (int columnCounter = 0; columnCounter < maxCols / bars; columnCounter++) {
                    result += currentColor;
                }
            }
            if (rowCounter < maxRows - 1) {
                result += '\n';
            }
        }

        return result;
    }

    public static String getVerticalBars3(int maxRows, int maxCols, int bars, char color1, char color2, char color3) {
        if (bars < 1) {
            return null;
        }
        int sizeOfBar = maxCols / bars;
        int remainder = maxCols % bars;

        if (sizeOfBar < 1 || isValidColor(color1) == false || isValidColor(color2) == false
                || isValidColor(color3) == false) {
            return null;
        }
        String line = "";

        char colorOfBar = color1;

        int colcounter1 = 0;
        for (int colCounter = 0; colCounter < maxCols - remainder; colCounter++) {

//
            if (colcounter1 >= sizeOfBar) {
                colorOfBar = color2;
            }

            if (colcounter1 >= 2 * sizeOfBar) {
                colorOfBar = color3;
            }
            if (colcounter1 >= 3 * sizeOfBar) {
                colcounter1 = 0;
                colorOfBar = color1;
            }

//
            line = line + colorOfBar;

            colcounter1++;
        }

        String line1 = "";
        for (int rowCounter = 0; rowCounter < maxRows; rowCounter++) {
            line1 = line1 + line;
            if (rowCounter < maxRows - 1)
                line1 = line1 + "\n";
        }
        return line1;

    }

    public static void main(String arr[]) {
        System.out.println(DrawingApp.getFlag(9, 'R', '.', 'Y'));

    }
};