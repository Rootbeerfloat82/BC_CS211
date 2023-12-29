import java.io.Console;

public class Trie211 {
    public static void main(String[] args) {
        tNode root = new tNode();

        addWord(root, "good");
        addWord(root, "go");
        addWord(root, "god");
        addWord(root, "gold");
        addWord(root, "golf");
        addWord(root, "gone");
        addWord(root, "goal");
        addWord(root, "goals");
        addWord(root, "goat");
        addWord(root, "goats");
        addWord(root, "goo");
        addWord(root, "goog");
        addWord(root, "googl");
        addWord(root, "google");
        addWord(root, "googles");
        addWord(root, "gopher");
        addWord(root, "gophers");
        addWord(root, "gat");
        addWord(root, "gate");
        addWord(root, "gates");
        addWord(root, "gator");
        addWord(root, "gators");
        addWord(root, "gatlin");
        addWord(root, "gatling");
        addWord(root, "gatlings");
        addWord(root, "gatlinburg");
        addWord(root, "gatlinburgs");
        addWord(root, "gatlinburgers");
        addWord(root, "gatlinburgerss");
        addWord(root, "git");
        addWord(root, "gits");
        addWord(root, "gitt");
        addWord(root, "gitte");
        addWord(root, "gittee");
        addWord(root, "gitten");
        addWord(root, "gittens");
        addWord(root, "gittin");
        addWord(root, "gitting");
        addWord(root, "gittins");
        addWord(root, "gittinss");
        
        System.out.println("List of Words:");
        printWord(root, "");
        System.out.println();

        Console console = System.console();
        
        String prefix = console.readLine();
        
        prefixWord(root, prefix);

        System.out.println(searchWord(root, prefix));
    }

    public static void addWord(tNode root, String word) {

        for (int j = 0; j < word.length(); j++) {

            char c = word.charAt(j);

            if (root.child[c - 'a'] != null) {
                if (word.length() - 1 == j) {
                    root.child[c - 'a'].isEnd = true;
                }
                root = root.child[c - 'a'];
            } else {
                tNode trie = new tNode();
                trie.isEnd = (word.length() - 1 == j ? true : false);
                root.child[c - 'a'] = trie;
                root = root.child[c - 'a'];
            }
        }

    }

    public static boolean searchWord(tNode root, String word) {
        boolean isFound = true;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (root.child[c - 'a'] != null) {
                if (word.length() - 1 != i) {
                    root = root.child[c - 'a'];
                } else {
                    if (!root.child[c - 'a'].isEnd) {
                        isFound = false;
                    }
                }
            } else {
                isFound = false;
                break;
            }
        }
        return isFound;
    }

    public static void printWord(tNode root, String toPrint) {
        if (root == null) {
            return;
        }
        if (root.isEnd) {
            System.out.println(toPrint);
        }

        for (int i = 0; i < root.child.length; i++) {
            tNode t = root.child[i];
            if (t != null) {
                printWord(t, toPrint + (char) ('a' + i));
            }
        }
    }

    public static void prefixWord(tNode root, String preFix) {
        tNode t = new tNode();
        t = root;
        System.out.println("prefix: " + preFix);

        for (int i = 0; i < preFix.length(); i++) {
            char c = preFix.charAt(i);
            t = t.child[c - 'a'];
        }
        printWord(t, preFix);
    }
    
}

class tNode {
    public boolean isEnd;
    public tNode[] child = new tNode[26];
}