public class FarmField {
    private int fieldSize;
    private char field1;
    private char field2;
    private char field3;
    private char field4;
    private char field5;
    private char field6;
    private char field7;
    private char field8;
    private char field9;
    private String field10;
    private String field11;
    private String field12;
    private String field13;
    private String field14;
    private String field15;
    private String field16;

    public void initializeField() {
        field1 = '1';
        field2 = '2';
        field3 = '3';
        field4 = '4';
        field5 = '5';
        field6 = '6';
        field7 = '7';
        field8 = '8';
        field9 = '9';
        field10 = "10";
        field11 = "11";
        field12 = "12";
        field13 = "13";
        field14 = "14";
        field15 = "15";
        field16 = "16";
    }

    public void printField(){
        System.out.println(" " + field1 + " | " + field2 + " | " + field3 + " | " + field4 + " ");
        System.out.println("---+---+---+---");
        System.out.println(" " + field5 + " | " + field6 + " | " + field7 + " | " + field8 + " ");
        System.out.println("---+---+---+---");
        System.out.println(" " + field9 + " | " + field10 + " | " + field11 + " | " + field12 + " ");
        System.out.println("---+---+---+---");
        System.out.println(" " + field13 + " | " + field14 + " | " + field15 + " | " + field16 + " ");
    }

}
