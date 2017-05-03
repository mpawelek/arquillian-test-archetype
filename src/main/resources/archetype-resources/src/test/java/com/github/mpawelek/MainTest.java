package com.github.mpawelek;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

/**
 * Created by michal on 03.05.17.
 */
@RunWith(Arquillian.class)
public class MainTest {

    @Deployment public static JavaArchive deploy() {
        JavaArchive jar=ShrinkWrap.create(JavaArchive.class).
                addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(jar.toString(true));
        return jar;
    }

    @Test public void firstTest() {
    }
}