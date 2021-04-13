package me.darkeyedragon.randomtp.common.config.section;

import me.darkeyedragon.randomtp.api.config.RandomBlacklist;
import me.darkeyedragon.randomtp.api.config.section.SectionBlacklist;
import me.darkeyedragon.randomtp.common.config.datatype.Blacklist;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;

@ConfigSerializable
public class CommonSectionBlacklist implements SectionBlacklist {

    private Blacklist blacklist;

    @Override
    public RandomBlacklist getBlacklist() {
        return blacklist;
    }
}
