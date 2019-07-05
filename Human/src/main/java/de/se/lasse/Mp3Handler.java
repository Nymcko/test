package de.se.lasse;

import com.mpatric.mp3agic.*;

import java.io.IOException;

public class Mp3Handler {
    Mp3File song ;
    Mp3Handler(String filename) throws InvalidDataException, IOException, UnsupportedTagException {
         song = new Mp3File(filename);
    }

    ID3v2 readV2Tag() throws InvalidDataException{
        if (song.hasId3v2Tag()) {
            return song.getId3v2Tag();
        } else {
            throw new InvalidDataException();
        }
    }

    ID3v1 readV1Tag() throws InvalidDataException {
        if (song.hasId3v1Tag()) {
            return song.getId3v1Tag();
        } else {
            throw new InvalidDataException();
        }
    }
    void writev1Tag(ID3v1 tag) throws IOException, NotSupportedException {
        song.setId3v1Tag(tag);
        song.save( song.getFilename()+".new");
    }
}
