public class Main {

    public static void main(String[] args) {
        ListReferenceBased refBase = new ListReferenceBased();
        refBase.add(0,1);
        refBase.add(1,4);
        refBase.add(2,7);
        refBase.add(3,19);
        refBase.add(4,20);

        System.out.println("List: ");
        System.out.println(refBase.get(0));
        System.out.println(refBase.get(1));
        System.out.println(refBase.get(2));
        System.out.println(refBase.get(3));
        System.out.println(refBase.get(4));

        System.out.println("Removing element at index 3...");
        refBase.remove(3);
        System.out.print("Current element at index 3: ");
        System.out.print(refBase.get(3));





    }
}
