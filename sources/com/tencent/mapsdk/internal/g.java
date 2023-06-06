package com.tencent.mapsdk.internal;

import java.io.InputStream;
import java.util.Properties;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {
    private static String a;
    private static String b;
    private static String c;

    static {
        try {
            InputStream resourceAsStream = g.class.getResourceAsStream("/com/qq/jce/wup/wup.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            resourceAsStream.close();
            a = properties.getProperty("client.info");
            b = properties.getProperty("client.built");
            c = properties.getProperty("client.number");
        } catch (Throwable unused) {
        }
        if (a == null) {
            a = "Tencent Taf";
        }
        if (b == null) {
            b = "unknown";
        }
        if (c == null) {
            c = "unknown";
        }
    }

    private static String a() {
        return a;
    }

    private static String b() {
        return b;
    }

    private static String c() {
        return c;
    }

    private static String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client version: " + a + "\n");
        sb.append("Client built:   " + b + "\n");
        sb.append("Client number:  " + c + "\n");
        sb.append("OS Name:        " + System.getProperty("os.name") + "\n");
        sb.append("OS Version:     " + System.getProperty("os.version") + "\n");
        sb.append("Architecture:   " + System.getProperty("os.arch") + "\n");
        sb.append("JVM Version:    " + System.getProperty("java.runtime.version") + "\n");
        sb.append("JVM Vendor:     " + System.getProperty("java.vm.vendor") + "\n");
        return sb.toString();
    }
}
