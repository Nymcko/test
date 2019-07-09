package de.se.lasse;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;

import java.io.IOException;

public class Mp3Search {
    public static void main(String[] params) {
        System.out.println(params[0]);
        Mp3Handler myMP3 = null;
        try {
            myMP3 = new Mp3Handler(params[0]);
            ID3v1 myMP3tag = myMP3.readV1Tag();
            System.out.println("Album Name:"+myMP3tag.getAlbum());
        } catch (InvalidDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedTagException e) {
            e.printStackTrace();
        }
    }
}
