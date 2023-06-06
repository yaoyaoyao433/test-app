package com.meituan.passport;

import android.support.annotation.RestrictTo;
import android.view.View;
import com.meituan.passport.PassportConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PassportUIConfig extends PassportConfig {
    public static ChangeQuickRedirect d = null;
    private static boolean e = true;
    private static String f = null;
    private static boolean g = true;
    private static boolean h = true;
    private static boolean i = true;
    private static boolean j = true;
    private static boolean k = true;
    private static boolean l = true;
    private static boolean m = true;
    private static boolean n = true;
    private static View.OnClickListener o = null;
    private static boolean p = true;
    private static String q;
    private static String r;
    private static String s;
    private static String t;
    private static int u;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DisplayPriorityType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a extends PassportConfig.a<a> {
        public static ChangeQuickRedirect c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String u() {
        return f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean v() {
        return g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean w() {
        return h;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean x() {
        return j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean y() {
        return k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean z() {
        return l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean A() {
        return m;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean B() {
        return n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static String C() {
        return t;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static String D() {
        return s;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static String E() {
        return q;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static String F() {
        return r;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean G() {
        return p;
    }

    public static int H() {
        return u;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static View.OnClickListener I() {
        return o;
    }

    public static a J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c678b116e2f7fdc0bb9a9870941f7c5e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c678b116e2f7fdc0bb9a9870941f7c5e") : new a();
    }
}
