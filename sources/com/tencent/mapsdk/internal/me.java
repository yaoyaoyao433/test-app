package com.tencent.mapsdk.internal;

import android.content.SharedPreferences;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class me {
    private static final String b = "%s-%s-%s,%s-%s-%s,%s-%s-%s";
    protected SharedPreferences a = null;

    public final boolean a(String str, String str2) {
        if (this.a == null) {
            return false;
        }
        return this.a.edit().putString(str, str2).commit();
    }

    public final String a(String str) {
        return b(str, (String) null);
    }

    public final String b(String str, String str2) {
        if (this.a == null) {
            return null;
        }
        return this.a.getString(str, str2);
    }

    public final boolean a(String str, int i) {
        if (this.a == null) {
            return false;
        }
        return this.a.edit().putInt(str, i).commit();
    }

    public final int b(String str) {
        if (this.a == null) {
            return -1;
        }
        return this.a.getInt(str, -1);
    }

    public final int b(String str, int i) {
        return this.a == null ? i : this.a.getInt(str, i);
    }

    public final boolean a(String str, long j) {
        if (this.a == null) {
            return false;
        }
        return this.a.edit().putLong(str, j).commit();
    }

    private long d(String str) {
        if (this.a == null) {
            return -1L;
        }
        return this.a.getLong(str, -1L);
    }

    private boolean a(String str, boolean z) {
        if (this.a == null) {
            return false;
        }
        return this.a.edit().putBoolean(str, z).commit();
    }

    public final boolean c(String str) {
        if (this.a == null) {
            return false;
        }
        return this.a.getBoolean(str, false);
    }

    public final boolean a(String[] strArr) {
        if (this.a == null) {
            return false;
        }
        SharedPreferences.Editor edit = this.a.edit();
        for (String str : strArr) {
            edit.remove(str);
        }
        return edit.commit();
    }

    public final boolean a() {
        return a(new String[]{ej.a, ej.c, ej.d, ej.q, ej.r, ej.s, ej.t, ej.u, ej.v, ej.w, ej.x, ej.y});
    }

    private String b() {
        return String.format(b, eh.i, Integer.valueOf(b(ej.a)), b(ej.t, (String) null), eh.l, Integer.valueOf(b("indoormap_style_version")), b("indoormap_style_md5", (String) null), eh.m, Integer.valueOf(b("indoormap_style_night_version")), b("indoormap_style_night_md5", (String) null));
    }
}
