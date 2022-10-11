package de.egga.farmerschoice.toons;

import org.junit.jupiter.api.Test;

import static de.egga.farmerschoice.toons.ToonFactory.anyToon;

class ToonListTest {

    @Test
    void name() {
        Toon jango = anyToon();
        ToonList toonList = new ToonList(jango);
    }
}