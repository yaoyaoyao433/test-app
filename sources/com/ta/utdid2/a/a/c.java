package com.ta.utdid2.a.a;

import android.os.Build;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 29 || (Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'Q' && Build.VERSION.CODENAME.charAt(0) <= 'Z');
    }
}
