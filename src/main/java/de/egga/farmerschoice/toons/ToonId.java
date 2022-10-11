package de.egga.farmerschoice.toons;

public class ToonId {

    private final String id;

    public ToonId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToonId toonId = (ToonId) o;

        return id != null ? id.equals(toonId.id) : toonId.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
