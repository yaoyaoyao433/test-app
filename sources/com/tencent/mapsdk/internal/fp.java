package com.tencent.mapsdk.internal;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fp {
    public static final int a = 0;
    public static final int b = 1;
    public int c;
    public int d;
    public JSONArray e;
    public String[] f;

    public fp() {
        this.f = new String[0];
    }

    public fp(int i, int i2, JSONArray jSONArray) {
        this.f = new String[0];
        this.c = i;
        this.d = i2;
        this.e = jSONArray;
        if (this.e == null) {
            this.f = null;
            return;
        }
        int length = this.e.length();
        this.f = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            try {
                this.f[i3] = this.e.getString(i3);
            } catch (JSONException e) {
                this.f = null;
                kj.c(Log.getStackTraceString(e));
                return;
            }
        }
    }

    private int c() {
        return this.c;
    }

    public final boolean a() {
        return this.c == 1;
    }

    public final boolean b() {
        return this.d == 1;
    }

    private int d() {
        return this.d;
    }

    private JSONArray e() {
        return this.e;
    }

    private String[] f() {
        return this.f;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("IndoorAuth{");
        stringBuffer.append("mEnabled=");
        stringBuffer.append(this.c);
        stringBuffer.append(", mType=");
        stringBuffer.append(this.d);
        stringBuffer.append(", mBuildingJsonArray=");
        stringBuffer.append(this.e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
