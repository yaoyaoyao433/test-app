package com.huawei.hms.hatool;

import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class z {
    public boolean a = false;
    public int b = 4;

    public static String a() {
        return "HiAnalyticsSDK_2.2.0.308" + i1.a();
    }

    public void a(int i) {
        StringBuilder sb = new StringBuilder("\n");
        sb.append("=======================================\n ");
        sb.append(a());
        sb.append("\n=======================================");
        this.b = i;
        this.a = true;
    }

    public void a(int i, String str, String str2) {
        if (i == 3 || i == 5 || i != 6) {
            return;
        }
        Log.e(str, str2);
    }

    public void b(int i, String str, String str2) {
        a(i, "HiAnalyticsSDK", str + "=> " + str2);
    }

    public boolean b(int i) {
        return this.a && i >= this.b;
    }
}
