package config;

import org.aeonbits.owner.ConfigFactory;

public class Credential {

    public static CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class, System.getProperties());

}
