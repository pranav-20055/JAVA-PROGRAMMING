class A {
    int x;

    public void setData() {
        x = 10;
    }
    public void setData(int y) {
        x = y;
    }
    public void display() {
        System.out.print(x);
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.setData();
        obj.display(); 
        System.out.println(); 
        obj.setData(4);
        obj.display(); 
    }
}