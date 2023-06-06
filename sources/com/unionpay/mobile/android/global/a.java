package com.unionpay.mobile.android.global;

import android.content.Context;
import com.unionpay.mobile.android.utils.g;
/* loaded from: classes6.dex */
public final class a {
    public static int a = 48;
    public static int b = 8;
    public static int c = 4;
    public static int d = 12;
    public static int e = 8;
    public static int f = 8;
    public static int g = 4;
    public static int h = 8;
    public static int i = 2;
    public static int j = 16;
    public static int k = 52;
    public static int l = 320;
    public static int m = 32;
    public static int o = 45;
    public static int p = 35;
    public static int q = 40;
    public static int r = 54;
    public static int s = 10;
    public static int t = 0;
    public static int u = 28;
    public static int v = 30;
    public static int w = 22;
    public static int x = 40;
    public static int n = 54;
    public static int y = n;
    public static int z = 46;
    public static int A = 45;
    public static int B = 32;
    public static int C = 6;
    public static int D = 25;
    public static int E = 95;
    public static int F = 25;
    public static int G = 25;
    public static int H = 1;
    public static int I = 0;
    public static int J = 5;
    public static int K = 1;
    private static boolean O = false;
    public static boolean L = true;
    public static int M = 0;
    public static int N = 0;

    public static void a(Context context) {
        b.a(context);
        if (O) {
            return;
        }
        a = g.a(context, a);
        b = g.a(context, b);
        c = g.a(context, c);
        d = g.a(context, d);
        e = g.a(context, e);
        f = g.a(context, f);
        g = g.a(context, g);
        h = g.a(context, h);
        i = g.a(context, i);
        j = g.a(context, j);
        k = g.a(context, k);
        m = g.a(context, m);
        n = g.a(context, n);
        o = g.a(context, o);
        p = g.a(context, p);
        q = g.a(context, q);
        r = g.a(context, r);
        s = g.a(context, s);
        u = g.a(context, u);
        v = g.a(context, v);
        w = g.a(context, w);
        z = g.a(context, z);
        x = g.a(context, x);
        A = g.a(context, A);
        B = g.a(context, B);
        C = g.a(context, C);
        y = g.a(context, y);
        D = g.a(context, D);
        E = g.a(context, E);
        F = g.a(context, F);
        G = g.a(context, G);
        H = g.a(context, H);
        K = (int) (context.getResources().getDisplayMetrics().density + 0.5d);
        I = context.getResources().getDisplayMetrics().widthPixels;
        t = context.getResources().getDisplayMetrics().heightPixels;
        if (I > t) {
            int i2 = I + t;
            I = i2;
            t = i2 - t;
            I -= t;
        }
        J = g.a(context, J);
        O = true;
    }

    public static int b(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("mz_action_button_min_height").get(cls.newInstance()).toString()));
        } catch (Exception unused) {
            return 0;
        }
    }
}
