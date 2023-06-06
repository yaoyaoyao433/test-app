package com.tencent.mapsdk.internal;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class mg extends me {
    private static final String b = "Tencent_MapSDK_SUB_CONFIG";
    private static Map<String, me> c = new HashMap();

    public static me a(Context context, String str) {
        if (hb.a(str)) {
            return mh.a(context);
        }
        if (c.get(str) == null) {
            synchronized (mg.class) {
                if (c.get(str) == null) {
                    mg mgVar = new mg(context, str);
                    c.put(str, mgVar);
                    return mgVar;
                }
            }
        }
        return c.get(str);
    }

    private mg(Context context, String str) {
        this.a = context.getSharedPreferences("Tencent_MapSDK_SUB_CONFIG_".concat(String.valueOf(str)), 0);
    }

    private static boolean b(Context context, String str) {
        if (hb.a(str)) {
            return false;
        }
        try {
            File file = new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + "Tencent_MapSDK_SUB_CONFIG_" + str);
            if (file.exists()) {
                return file.delete();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void a(Context context) {
        try {
            File[] listFiles = new File(context.getFilesDir().getParent() + File.separator + "shared_prefs").listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                if (file.getName().startsWith(b)) {
                    file.delete();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b() {
        if (c != null) {
            c.clear();
        }
    }
}
