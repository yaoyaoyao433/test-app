package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pv {
    public final String a;
    public final String b;
    public final int c;
    public final String[] d;

    public pv(String str, String str2, String[] strArr, int i) {
        String[] strArr2;
        this.a = str;
        this.b = str2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[strArr.length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr2.length);
        }
        this.d = strArr2;
        this.c = i;
    }

    private static String[] a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        String[] strArr2 = new String[strArr.length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr2.length);
        return strArr2;
    }
}
