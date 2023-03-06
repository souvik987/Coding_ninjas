import java.util.Scanner;

 class polygon {
    int n;
    int sides[];

    public polygon(int no_of_sides) {
        this.n = no_of_sides;
        this.sides = new int[no_of_sides];
 }

    void inputSides(){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < this.n; i++){
            System.out.print("Enter Sides : ");
            this.sides[i] = s.nextInt();
        }
    }

    void displaySides() {
        for(int i = 0; i < this.n; i++){
            System.out.println("Sides" + i + 1 + "is" + this.sides[i]);
        }
}
}
