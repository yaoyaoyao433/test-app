package com.unionpay.utils;

import java.util.Locale;
/* loaded from: classes6.dex */
public class k {
    private static k g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    public static k a() {
        if (g == null) {
            g = Locale.getDefault().toString().startsWith("zh") ? new l() : new m();
        }
        return g;
    }
}
