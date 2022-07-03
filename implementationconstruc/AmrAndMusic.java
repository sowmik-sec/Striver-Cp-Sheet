package striverCpSheet.implementationconstruc;

import java.util.*;

public class AmrAndMusic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        Map<Integer, ArrayList<Integer>> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if(mp.containsKey(a[i])) {
                ArrayList<Integer> b = mp.get(a[i]);
                b.add(i+1);
                mp.put(a[i],b);
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i+1);
                mp.put(a[i],list);
                list = null;
            }
        }
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>(mp);
        for(Integer key:map.keySet()) {
            //Map.Entry<Integer, ArrayList<Integer>> entry:mp.entrySet()
            //System.out.print(key+" ");
            //System.out.println(map.get(key));
            int val = key;
            ArrayList<Integer> list = map.get(key);
            if(sum+val<=k) {
                if(sum+val*list.size()<=k) {
                    for (int num:list) {
                        ans.add(num);
                    }
                    sum += val*list.size();
                }
                else{
                    int temp = k-sum;
                    int need = temp/val;
                    for (int i = 0; i < need; i++) {
                        sum+=val;
                        ans.add(list.get(i));
                    }
                }
            }
            else break;
        }
        System.out.println(ans.size());
        for(int nn:ans) System.out.print(nn+" ");
        System.out.println();
    }
}
