package LinkedList.Music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("StromBringer", 4.6);
        album.addSong("Love Dont mean a thing", 4.8);
        album.addSong("Holy Man", 3.6);
        album.addSong("Hold On", 4.2);
        album.addSong("Lady Double Dealer", 2.6);
        album.addSong("You cant do it right", 5.4);
        album.addSong("High Ball Shooter", 3.2);
        album.addSong("The Gyspy", 3.9);
        album.addSong("Soldier of fortune", 5.0);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.3);
        album.addSong("I put the finger on you", 3.6);
        album.addSong("Lets go", 4.6);
        album.addSong("Inject the Venom",   5.6);
        album.addSong("Snowballed", 2.6);
        album.addSong("Evil Walks", 4.9);
        album.addSong("C.O.D", 6.6);
        album.addSong("Breaking the Rules", 4.9);
        album.addSong("Night of the long Knives", 2.5);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You cant do it right", playList);
        albums.get(0).addToPlayList("Holy Man", playList);
        albums.get(0).addToPlayList("SpeedKing", playList);
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner sc= new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No Songs in Playlist");
            return;
        }else{
            System.out.println("Now Playing "+listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch(action){
                case 0:
                System.out.println("Playlist Complete");
                quit = true;
                break;

                case 1:

                if(!forward){
                    if(listIterator.hasNext()){
                        listIterator.next();
                    }
                    forward = true;
                }
                if(listIterator.hasNext()){
                    System.out.println("Now Playing "+listIterator.next().toString());
                }else{
                    System.out.println("We have reached the end of the Playlist");
                    forward = false;
                }
                break;

                case 2:

                if(forward){
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    forward = false;
                }
                if(listIterator.hasPrevious()){
                    System.out.println("Now Playing "+listIterator.previous().toString());
                }else{
                    System.out.println("We are at the Start of the Playlist");
                    forward = true; 
                }
                break;

                case 3:
                if(forward){
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Replaying "+listIterator.previous().toString());
                        forward = false;
                    }else{
                        System.out.println("We are at the Start of the List");
                    }
                }else{
                    if(listIterator.hasNext()){
                        System.out.println("Now Replaying "+listIterator.next().toString());
                        forward = true;
                    }else{
                        System.out.println("We have reached the end of the List");
                    }
                }
                break;

                case 4:
                printList(playList);
                break;

                case 5:
                printMenu();
                break;

                case 6:
                if(playList.size() > 0){
                    listIterator.remove();
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing "+listIterator.next());
                    }else if(listIterator.hasPrevious()){
                        System.out.println("Now Playing "+listIterator.previous());     
                    }
                }
                break;

            }
        }
    }

    private static void printMenu(){
        System.out.println("Available Actions: \nPress");
        System.out.println("0 - To Quit\n" +
                           "1 - To Play next Song\n" +
                           "2 - To Play Previous Song\n"+
                           "3 - To replay the current Song\n"+
                           "4 - List Songs in the Playlist\n"+
                           "5 - Print Available Options\n"+
                           "6 - Delete Current Song from Playlist");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }

}
