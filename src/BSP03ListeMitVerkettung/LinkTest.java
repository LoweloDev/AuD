package BSP03ListeMitVerkettung;

public class LinkTest
{
    public static void main(String[] args)
    {
        Link<String> letztesElement = new Link<>("Letzter", null);
        Link<String> mittleresElement = new Link<>("Test", letztesElement);
        Link<String> anfang = new Link<>("Erster", mittleresElement);

        System.out.println(anfang);
        System.out.println(anfang.naechster);
        System.out.println(mittleresElement.naechster);
    }
}