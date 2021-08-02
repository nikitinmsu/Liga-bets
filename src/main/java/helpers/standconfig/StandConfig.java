package helpers.standconfig;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

import static org.aeonbits.owner.Config.Sources;

@Sources({
        "classpath:config/stand.properties",
        "system:properties",
        "system:env"
})
public interface StandConfig extends Config {

    @Key("stand")
    @DefaultValue("")
    String stand();

    static StandConfig getInstance()  {
        return ConfigFactory.create(StandConfig.class, System.getProperties(), System.getenv());
    }
}
