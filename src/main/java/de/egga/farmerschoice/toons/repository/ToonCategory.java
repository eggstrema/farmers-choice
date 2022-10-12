package de.egga.farmerschoice.toons.repository;

public enum ToonCategory {
    _501st,
    Attacker,
    BadBatch,
    BountyHunter,
    CloneTrooper,
    Droid,
    Empire,
    Ewok,
    FirstOrder,
    FleetCommander,
    GalacticLegend,
    GalacticRepublic,
    Geonosian,
    Healer,
    HuttCartel,
    ImperialRemnant,
    ImperialTrooper,
    Inquisitorius,
    Jawa,
    Jedi,
    Leader,
    Mandalorian,
    Nightsister,
    OldRepublic,
    Phoenix,
    Rebel,
    RebelFighter,
    Resistance,
    RogueOne,
    Scoundrel,
    Separatist,
    Sith,
    SithEmpire,
    Smuggler,
    Support,
    Tank,
    Tusken,
    UnalignedForceUser;

    public static ToonCategory of(String string) {
        String withoutWhiteSpace = string.replaceAll("\\s+", "");
        if (withoutWhiteSpace.matches("^\\d+.*")) {
            return valueOf("_" + withoutWhiteSpace);
        }
        return valueOf(withoutWhiteSpace);
    }
}
