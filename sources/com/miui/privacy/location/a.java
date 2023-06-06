package com.miui.privacy.location;

import android.net.Uri;
/* loaded from: classes3.dex */
public final class a {
    private static final Uri a = Uri.parse("content://com.lbe.security.miui.autostartmgr");
    private static boolean b;

    /* renamed from: com.miui.privacy.location.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0533a {
    }

    static {
        b = false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            b = ((Integer) cls.getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.ui.version.code", 0)).intValue() >= 11;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
