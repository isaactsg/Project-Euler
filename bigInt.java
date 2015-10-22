/* Isaac Wismer
 *  15-Sep-2015
 *
 *
 */

import java.util.LinkedList;

public class bigInt {

    private LinkedList l;

    public bigInt() {
        l = new LinkedList();
        l.add(0);
    }

    public void add(String n) {
        int j = n.length();
        while (n.length() > l.size()) {
            l.addFirst(0);
        }
        for (int i = l.size() - 1; i >= l.size() - n.length(); i--, j--) {
            int num = Integer.parseInt(n.substring(j - 1, j));
            l.set(i, (int) l.get(i) + num);
            for (int k = l.size() - 1; k >= 0; k--) {
                if ((int) l.get(k) > 9) {
                    if (k == 0) {
                        l.addFirst(0);
                        k++;
                        i++;
                    }
                    l.set(k, (int) l.get(k) % 10);
                    l.set(k - 1, (int) l.get(k - 1) + 1);
                }
            }
        }
    }

    public boolean sub(String n) {
        int j = n.length();
        if (n.length() > l.size()
                || (n.length() == l.size() && Integer.parseInt(n.substring(0, 1)) > (int) l.get(0))) {
            return false;
        }
        for (int i = l.size() - 1; i >= l.size() - n.length(); i--, j--) {
            int num = Integer.parseInt(n.substring(j - 1, j));
            //System.out.println(num);
            l.set(i, (int) l.get(i) - num);
            for (int k = l.size() - 1; k >= 0; k--) {
                if ((int) l.get(k) < 0) {
                    if (k == 0) {
                        //System.out.println("low");
                        return false;
                    }
                    //System.out.println("L:" + l.get(k) + "mod" + (int) l.get(k) % 10);
                    l.set(k, (int) l.get(k) + 10);
                    l.set(k - 1, (int) l.get(k - 1) - 1);
                }
            }
        }
        return true;
    }

    public void mult(String s) {
        String or = getNum();
        bigInt f = new bigInt(), g = new bigInt();
        f.add(s);
        while (g.lessThan(f)) {
            add(or);
            //System.out.println(g.getNum());
            g.add("1");
        }
//        for (long j = 1; j < i; j++) {
//            add(or);
//            //System.out.println(a.getNum());
//        }
    }

    public void div(String a) {
        bigInt top = new bigInt(), ans = new bigInt();
        //System.out.println(getNum());
        top.setList(l);
        //System.out.println("l" + l.toString() + " " + top.getNum());
        while (!top.isZero()) {
            top.sub(a);
            //System.out.println(top.getNum());
            ans.add("1");
            //System.out.println(ans.getNum());
        }
        l = ans.getList();
    }

    public String getNum() {
        String s = "";
        for (int i = 0; i < l.size(); i++) {
            s += l.get(i);
        }
        return s;
    }

    public LinkedList getList() {
        return l;
    }

    public void setList(LinkedList k) {
        l = k;
    }

    public boolean lessThan(bigInt b) {
        if (getNum().length() < b.getNum().length()) {
            return true;
        } else if (getNum().length() > b.getNum().length()) {
            return false;
        } else if (equals(b)) {
            return false;
        } else {
            for (int i = 0; i < getNum().length(); i++) {
                if ((int) l.get(i) < (int) b.getList().get(i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean greaterThan(bigInt b) {
        if (getNum().length() < b.getNum().length()) {
            return false;
        } else if (getNum().length() > b.getNum().length()) {
            return true;
        } else if (equals(b)) {
            return false;
        } else {
            for (int i = 0; i < getNum().length(); i++) {
                if ((int) l.get(i) < (int) b.getList().get(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(bigInt b) {
        for (int i = 0; i < getNum().length(); i++) {
            if ((int) l.get(i) != (int) b.getList().get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isZero() {
        System.out.println(getNum());
        for (int i = 0; i < getNum().length(); i++) {
            if ((int) l.get(i) < 0) {
                return true;
            } else if ((int) l.get(i) > 0) {
                return false;
            }
        }
        return true;
    }
}
