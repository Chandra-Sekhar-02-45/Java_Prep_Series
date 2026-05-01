//import java.io.*;
//import java.util.*;
//
//
//public class LruCache {
//    public static void lruCache(int[] arr , int n , int k) {
//        HashMap<Integer,Node> hm = new HashMap<>();
//
//        Node dummy = new Node(-1);
//        Node head = dummy , tail = dummy ;
//
//        for(int i = 0 ; i < n ; i++) {
//            // NotPresent + NotFull
//            if(!hm.containsKey(arr[i]) && hm.size() < k) {
//                Node newNode = new Node(arr[i]);
//                tail.next = newNode ;
//                newNode.prev = tail ;
//                tail = tail.next ;
//                hm.put(arr[i] , newNode);
//            }
//            // Present
//            else if(hm.containsKey(arr[i])) {
//                Node newNode = hm.get(arr[i]);
//                if(newNode == tail) continue ;
//                newNode.prev.next = newNode.next ;
//                newNode.next.prev = newNode.prev ;
//                tail.next = newNode ;
//                newNode.next = null ;
//                tail = tail.next ;
//            }
//            // NotPresent + Full
//            else {
//                hm.remove(head.next.val);
//                head.next = head.next.next ;
//                if(head.next != null) head.next.prev = head ;
//                else tail = head ;
//                tail.next = new Node(arr[i]);
//                tail.next.prev = tail ;
//                tail = tail.next ;
//                hm.put(arr[i] , tail) ;
//            }
//        }
//
//        Node tempHead = dummy.next ;
//
//        while(tempHead != null) {
//            System.out.print(tempHead.val + " ");
//            tempHead = tempHead.next ;
//        }
//
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        while(T-- > 0) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//
//            int[] arr = new int[n];
//            for(int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();
//
//            lruCache(arr , n , k);
//        }
//    }
//}