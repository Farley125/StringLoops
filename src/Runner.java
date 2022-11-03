public class Runner {
    public static void main(String[] args) {
        StringLoops loops = new StringLoops();
        System.out.println(loops.removeString("an", "Apples and bananas"));
        System.out.println(loops.removeString("tat", "Ratatattat"));
        System.out.println(loops.removeString("lower", "sunflower"));
        System.out.println(loops.removeString("haha", "Hahahahaha"));
        System.out.println(loops.removeString("HAHA", "Hahahahaha"));
        System.out.println(loops.removeString("rain", "it’s the brain drain pain train"));
        System.out.println(loops.removeString("lol", "lolololol"));
        System.out.println(loops.removeString("was", "I was about to call you"));
        System.out.println(loops.removeString("but", "I was about to call you"));
        System.out.println(loops.removeString("AB", "ABABABABABC"));
        System.out.println(loops.removeString("AB", "AAAAABBBBBC"));


    }
}
