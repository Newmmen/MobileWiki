package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:credentials.properties",
        "classpath:default.properties"
})

public interface LocalConfig extends Config {
    @Key("local.name")
    String getLocalDeviceName();

    @Key("local.platform")
    String getLocalPlatformName();

    @Key("local.version")
    String getLocalPlatformVersion();

    @Key("app.package")
    String getAppPackage();

    @Key("app.activity")
    String getAppActivity();

    @Key("app.url")
    String getAppUrl();

    @Key("app.path")
    String getAppPath();

    @Key("app.baseurl")
    String getBaseAppUrl();


}
