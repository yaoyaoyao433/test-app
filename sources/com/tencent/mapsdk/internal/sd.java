package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sd {
    public static final String a = "txmapengine";
    public static String b = "release";
    public static String c = "undefined";
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public static int i = 0;
    public static String j = "";
    public static String k = "";
    public static String l = "";
    public static String m = "";
    public static String n = "tms";
    public static String o = "undefined";
    public static List<b> p = new ArrayList(10);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(Context context, String str);

        void i();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface c {
        byte[] a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum b {
        PLUGIN("shell.adapter.LocPluginModular"),
        BUGLY("bugly.TMSBugly"),
        BEACON("beacon.TMSBeaconReport");
        
        public String d;

        b(String str) {
            this.d = str;
        }
    }

    public static void a(Context context) {
        Field[] declaredFields;
        try {
            String a2 = hc.a(context, context.getPackageName() + "_ShellConfig");
            if (TextUtils.isEmpty(a2)) {
                a2 = hc.a(context, "TMS_ShellConfig");
                if (TextUtils.isEmpty(a2)) {
                    try {
                        Properties properties = new Properties();
                        properties.load(context.getAssets().open("tencentmap/mapsdk_vector/sdkconfig.dat"));
                        a2 = properties.getProperty("classname");
                    } catch (IOException unused) {
                        a2 = "com.tencent.mapsdk.BuildConfig";
                    }
                }
            }
            Class<?> cls = Class.forName(a2);
            for (Field field : cls.getDeclaredFields()) {
                char c2 = 1;
                field.setAccessible(true);
                String name = field.getName();
                switch (name.hashCode()) {
                    case -2051118828:
                        if (name.equals("VERSION_CODE")) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2050804302:
                        if (name.equals("VERSION_NAME")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1781919750:
                        if (name.equals("SEARCH_ENABLE")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1256894524:
                        if (name.equals("BEACON_KEY")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -783990306:
                        if (name.equals("BEACON_ENABLE")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -758346991:
                        if (name.equals("SHEET_PROJECT_NAME")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -368721951:
                        if (name.equals("BUGLY_KEY")) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 44249739:
                        if (name.equals("BUILD_TYPE")) {
                            c2 = '\r';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 64921139:
                        if (name.equals("DEBUG")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 196363279:
                        if (name.equals("PLUGIN_ENABLE")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1766588577:
                        if (name.equals("BUGLY_ENABLE")) {
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2076249758:
                        if (name.equals("FLAVOR")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2095911147:
                        if (name.equals("REPO_VERSION")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2107919841:
                        if (name.equals("BUGLY_KEY_SHARE")) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        d = ((Boolean) field.get(cls)).booleanValue();
                        kj.b(ki.w, "[DEBUG]:" + d);
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) field.get(cls)).booleanValue();
                        e = booleanValue;
                        if (booleanValue) {
                            p.add(b.BUGLY);
                        }
                        kj.b(ki.w, "[BUGLY]:" + e);
                        break;
                    case 2:
                        c = (String) field.get(cls);
                        kj.b(ki.w, "[FLAVOR]:" + c);
                        break;
                    case 3:
                        f = ((Boolean) field.get(cls)).booleanValue();
                        kj.b(ki.w, "[SEARCH]:" + f);
                        break;
                    case 4:
                        boolean booleanValue2 = ((Boolean) field.get(cls)).booleanValue();
                        g = booleanValue2;
                        if (booleanValue2) {
                            p.add(b.PLUGIN);
                        }
                        kj.b(ki.w, "[PLUGIN]:" + g);
                        break;
                    case 5:
                        n = (String) field.get(cls);
                        break;
                    case 6:
                        o = (String) field.get(cls);
                        kj.b(ki.w, "[REPO]:" + o);
                        break;
                    case 7:
                        j = (String) field.get(cls);
                        kj.b(ki.w, "[VER]:" + j);
                        break;
                    case '\b':
                        boolean booleanValue3 = ((Boolean) field.get(cls)).booleanValue();
                        h = booleanValue3;
                        if (booleanValue3) {
                            p.add(b.BEACON);
                        }
                        kj.b(ki.w, "[BEACON]:" + h);
                        break;
                    case '\t':
                        k = (String) field.get(cls);
                        break;
                    case '\n':
                        l = (String) field.get(cls);
                        break;
                    case 11:
                        m = (String) field.get(cls);
                        break;
                    case '\f':
                        i = ((Integer) field.get(cls)).intValue();
                        kj.b(ki.w, "[VER_CODE]:" + i);
                        break;
                    case '\r':
                        b = (String) field.get(cls);
                        kj.b(ki.w, "[BUILD_TYPE]:" + b);
                        break;
                }
            }
        } catch (ClassNotFoundException e2) {
            kj.a(e2.getMessage(), e2);
        } catch (IllegalAccessException e3) {
            kj.a(e3.getMessage(), e3);
        }
    }

    private static String a() {
        return j + CommonConstant.Symbol.MINUS + o;
    }

    private static String b() {
        return c + CommonConstant.Symbol.MINUS + b;
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(c + CommonConstant.Symbol.MINUS + b);
        sb.append("!");
        sb.append(str);
        return sb.toString();
    }
}
