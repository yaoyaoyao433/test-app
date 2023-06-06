package com.sankuai.meituan.mtimageloader.utils;

import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class CdnResizeUtil {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Mode {
    }

    public static String a(String str, int i, int i2, int i3, int i4, View view, boolean z) {
        boolean z2;
        String path;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb6d9346991e20fe4941a3febc9193b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb6d9346991e20fe4941a3febc9193b9");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        Object[] objArr2 = {host};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "df4bd83d228b1491ee1a7058d7508e2a", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "df4bd83d228b1491ee1a7058d7508e2a")).booleanValue();
        } else {
            z2 = !TextUtils.isEmpty(host) && host.length() == 14 && host.charAt(0) == 'p' && Character.isDigit(host.charAt(1)) && host.endsWith(".meituan.net");
        }
        if (z2) {
            if (i == 0) {
                if (a(z, parse.getPath())) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    return buildUpon.path(parse.getPath() + ".webp").build().toString();
                }
                return str;
            }
            Pair<Integer, Integer> a2 = a(i2, i3, view, i);
            int intValue = ((Integer) a2.first).intValue();
            int intValue2 = ((Integer) a2.second).intValue();
            int f = com.sankuai.meituan.mtimageloader.config.a.f();
            int g = com.sankuai.meituan.mtimageloader.config.a.g();
            if (f > 0 && (intValue == 0 || intValue > f)) {
                intValue = f;
            }
            if (g > 0 && (intValue2 == 0 || intValue2 > g)) {
                intValue2 = g;
            }
            int min = Math.min(100, Math.max(0, i4));
            try {
                Object[] objArr3 = {parse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "58bb24234a475d786bf41d0a572764c9", RobustBitConfig.DEFAULT_VALUE)) {
                    path = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "58bb24234a475d786bf41d0a572764c9");
                } else {
                    List<String> pathSegments = parse.getPathSegments();
                    if (pathSegments != null && pathSegments.size() >= 2) {
                        String str2 = pathSegments.get(0);
                        if (str2.length() > 1 && Character.isDigit(str2.charAt(0)) && str2.matches("^\\d+(\\.\\d+){1,2}(\\.[ao])?$")) {
                            path = parse.getPath().substring(str2.length() + 1);
                        } else {
                            path = parse.getPath();
                        }
                    }
                    path = parse.getPath();
                }
                Uri.Builder buildUpon2 = parse.buildUpon();
                Locale locale = Locale.US;
                Object[] objArr4 = new Object[5];
                objArr4[0] = Integer.valueOf(intValue);
                objArr4[1] = Integer.valueOf(intValue2);
                objArr4[2] = Integer.valueOf(min);
                objArr4[3] = path;
                objArr4[4] = a(z, parse.getPath()) ? ".webp" : "";
                return buildUpon2.path(String.format(locale, "/%d.%d.%d%s%s", objArr4)).build().toString();
            } catch (Exception unused) {
                return parse.toString();
            }
        }
        return str;
    }

    private static boolean a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a487a8822b4417aab387fd1b18095af", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a487a8822b4417aab387fd1b18095af")).booleanValue() : z && !str.endsWith(".webp") && (!str.endsWith(".png") || Build.VERSION.SDK_INT >= 17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r14 > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r14 > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        r13 = r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(int r12, int r13, android.view.View r14, int r15) {
        /*
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r9 = 1
            r0[r9] = r1
            r1 = 2
            r0[r1] = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2 = 3
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.mtimageloader.utils.CdnResizeUtil.a
            java.lang.String r11 = "0e1e16ce62d80d0ee49a4384ab123499"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L34
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r9, r11)
            android.util.Pair r12 = (android.util.Pair) r12
            return r12
        L34:
            if (r14 == 0) goto L57
            if (r15 != r9) goto L46
            int r15 = a(r14)
            if (r15 <= 0) goto L3f
            r12 = r15
        L3f:
            int r14 = b(r14)
            if (r14 <= 0) goto L57
            goto L56
        L46:
            r0 = 5
            if (r15 != r0) goto L57
            int r15 = c(r14)
            if (r15 <= 0) goto L50
            r12 = r15
        L50:
            int r14 = d(r14)
            if (r14 <= 0) goto L57
        L56:
            r13 = r14
        L57:
            int r12 = java.lang.Math.max(r12, r8)
            int r13 = java.lang.Math.max(r13, r8)
            android.util.Pair r14 = new android.util.Pair
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14.<init>(r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mtimageloader.utils.CdnResizeUtil.a(int, int, android.view.View, int):android.util.Pair");
    }

    private static int c(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60de4ba88c75bbcdeccea59e348a334d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60de4ba88c75bbcdeccea59e348a334d")).intValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width <= 0) {
            return 0;
        }
        return layoutParams.width;
    }

    private static int d(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b989ea30935b7a17859728fcec13372e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b989ea30935b7a17859728fcec13372e")).intValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height <= 0) {
            return 0;
        }
        return layoutParams.height;
    }

    public static int a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1b2fcfe20bdb6863f77c6eec1819040", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1b2fcfe20bdb6863f77c6eec1819040")).intValue();
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (width > 0) {
            return width;
        }
        if (layoutParams == null || layoutParams.width <= 0) {
            return 0;
        }
        return layoutParams.width;
    }

    public static int b(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92adc16aac70eced7d3d4d9581629fa4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92adc16aac70eced7d3d4d9581629fa4")).intValue();
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (height > 0) {
            return height;
        }
        if (layoutParams == null || layoutParams.height <= 0) {
            return 0;
        }
        return layoutParams.height;
    }
}
