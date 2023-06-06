package com.tencent.mapsdk.internal;

import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class o {
    private static HashMap<String, String> a = new HashMap<>();

    private o() {
    }

    public static <T extends p> void a(Class<T> cls) {
        try {
            T newInstance = cls.newInstance();
            if (newInstance != null) {
                String className = newInstance.className();
                if ("".equals(className)) {
                    className = cls.getName();
                }
                a.put(className, cls.getName());
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        }
    }

    public static String a(String str) {
        return a.get(str);
    }
}
