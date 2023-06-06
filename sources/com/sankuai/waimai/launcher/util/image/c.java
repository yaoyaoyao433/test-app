package com.sankuai.waimai.launcher.util.image;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static int d;
    private static int e;
    private static final boolean c = !com.sankuai.meituan.takeoutnew.a.f;
    public static boolean b = false;
    private static final Set<String> f = new HashSet();

    private static boolean b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5ac41e7d4762dc3d5275ecdc0035373", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5ac41e7d4762dc3d5275ecdc0035373")).booleanValue() : str.length() == 14 && str.charAt(0) == 'p' && Character.isDigit(str.charAt(1)) && str.endsWith(".meituan.net");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
        if ("sgc".equals(r8) == false) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r28, android.graphics.Bitmap r29, android.view.View r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.launcher.util.image.c.a(java.lang.String, android.graphics.Bitmap, android.view.View, java.lang.String):void");
    }

    private static boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23fefd882aa6468bc6d8ab6e8b86d2a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23fefd882aa6468bc6d8ab6e8b86d2a1")).booleanValue();
        }
        if (view.getVisibility() != 0 || view.getRootView() == null) {
            return false;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (((View) parent).getVisibility() != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "536df5d4f9d547b7db957a9d813a910f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "536df5d4f9d547b7db957a9d813a910f")).booleanValue() : b(str) || TextUtils.equals(str, "img.meituan.net");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public boolean a;
        public View b;
        public Bitmap c;
        public String d;
        public boolean e;
        public boolean f;
        public String g;
        public Point h;
        public Point i;

        public a(String str, Bitmap bitmap, View view, String str2, boolean z, boolean z2, boolean z3, Point point, Point point2) {
            this.g = str;
            this.b = view;
            this.c = bitmap;
            this.d = str2;
            this.e = z;
            this.f = z2;
            this.a = z3;
            this.i = point;
            this.h = point2;
        }
    }
}
