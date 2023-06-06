package com.meituan.msc.views.imagehelper;

import android.net.Uri;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static final boolean b;
    private static final Set<String> c = new HashSet(Arrays.asList("p0.meituan.net", "p1.meituan.net", "img.meituan.net", "osp.meituan.net", "vfile.meituan.net", "p0.meituan.com", "p1.meituan.com", "vfile.meituan.com"));
    private static final Pattern d;

    static {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adee294c394f8350eaf9b8b708931c5e", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adee294c394f8350eaf9b8b708931c5e")).booleanValue();
        } else if (Build.VERSION.SDK_INT >= 17 && !Build.MODEL.contains("Nokia_X")) {
            z = true;
        }
        b = z;
        d = Pattern.compile("/\\d+\\.\\d+/", 2);
    }

    private static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "825244364bf33615f463b72dc242d0a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "825244364bf33615f463b72dc242d0a8")).booleanValue() : (uri == null || uri.getPath() == null || !uri.getPath().toLowerCase().contains(".gif")) ? false : true;
    }

    public static Uri a(Uri uri, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        Uri build;
        Object[] objArr = {uri, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f85af174d5a20a12be8d91da1c7a6e06", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f85af174d5a20a12be8d91da1c7a6e06");
        }
        if (uri == null || i < 0 || i2 < 0 || uri.getHost() == null) {
            return uri;
        }
        Object[] objArr2 = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a627919a4a3b3c99d55aaef7f09db9f9", RobustBitConfig.DEFAULT_VALUE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a627919a4a3b3c99d55aaef7f09db9f9")).booleanValue();
        } else {
            if (uri != null && uri.getHost() != null && uri.getPath() != null && c.contains(uri.getHost().toLowerCase())) {
                String path = uri.getPath();
                if (path.indexOf(64) >= 0 || (a(uri) && d.matcher(path).find())) {
                    z3 = true;
                }
            }
            z3 = false;
        }
        if (z3) {
            return uri;
        }
        if ((!a(uri) || z) && c.contains(uri.getHost().toLowerCase())) {
            if (i > 0 || i2 > 0) {
                Uri.Builder buildUpon = uri.buildUpon();
                build = buildUpon.path(uri.getPath() + String.format("@%sw_%sh_1e_1l", Integer.valueOf(i), Integer.valueOf(i2))).build();
            } else {
                build = uri;
            }
            if (b && z2) {
                Object[] objArr3 = {build};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "611eafa781d83b8349a565c263924775", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Uri) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "611eafa781d83b8349a565c263924775");
                }
                if (build == null || build.getPath() == null || build.getPath().toLowerCase().contains("webp")) {
                    return build;
                }
                Uri.Builder buildUpon2 = build.buildUpon();
                return buildUpon2.path(build.getPath() + ".webp").build();
            }
            return build;
        }
        return uri;
    }
}
