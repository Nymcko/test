package de.se.lasse;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple Human.
 */
public class Mp3HandlerTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCheck() throws InvalidDataException, IOException, UnsupportedTagException, NotSupportedException {
       Mp3Handler myMP3 = new Mp3Handler("src/test/ressources/bensound-summer.mp3.new");
       ID3v1 myMP3tag = myMP3.readV1Tag();
       assertEquals("Summer",myMP3tag.getAlbum());


    }
}
