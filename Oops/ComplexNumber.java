package Oops;

public class ComplexNumber {
    private int real;
    private int imaginary;

public ComplexNumber(int real, int imaginary){
    this.real = real;
    this.imaginary = imaginary;
} 

public void plus(ComplexNumber c2){
    this.real = this.real + c2.real;
    this.imaginary = this.imaginary + c2.imaginary;
}

public void multiply(ComplexNumber c2){
    int temp = this.real; 
    this.real = (this.real * c2.real) - (this.imaginary * c2.imaginary);
    this.imaginary =temp * c2.imaginary + this.imaginary * c2.real;
}

public void print(){
    System.out.println(this.real + " " + "i" + this.imaginary);
}
}
