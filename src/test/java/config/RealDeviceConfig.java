package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.Sources;

@Sources({
        "classpath:credentials.properties",
        "classpath:default.properties"
})

public interface RealDeviceConfig extends Config {
    @Key("local.name")
    String getLocalDeviceName();

    @Key("real.version")
    String getRealPlatformVersion();

    @Key("real.device")
    String getRealDevice();

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
