public class UrlFixer {

    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        String url1 = "https://";
        String url2 = "odds";
        String url3 = "www.reddit.com/r/nevertellme";


        System.out.println(url1 + url3 + url2);


        //url.concat("https:" + "//www.reddit.com/r/nevertellme" + "theodds");
        //System.out.println("https:" + "//www.reddit.com/r/nevertellme" + "theodds");

    }
}
