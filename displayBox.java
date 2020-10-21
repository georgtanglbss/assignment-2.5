class displayBox {
    int width;
    int height;
    public static void main(String[] args) {
        displayBox(9,5);
    }
    
    public static void displayBox(int width, int height) {
        for (int i = 0; i < height; i++) {
            System.out.println("");
            for (int j = 0; j < width; j++) {
                System.out.print("$");
            }
        }
    }
}