package model;

public class ConstVariable {

    private char female = 'F';
    private char male = 'M';
    private char bigger = '>';
    private char younger = '<';

    public char getFemale() {
        return female;
    }

    public char getMale() {
        return male;
    }

    public char getBigger() {
        return bigger;
    }

    public char getYounger() {
        return younger;
    }

    public boolean isBiggerSign(char sign) {
        return sign == bigger;
    }

    public boolean isYoungerSign(char sign) {
        return sign == younger;
    }


}
