package com.facebook.react;

import android.net.Uri;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o {
    public static final boolean a;
    private static final Set<String> b = new HashSet(Arrays.asList("p0.meituan.net", "p1.meituan.net", "img.meituan.net", "osp.meituan.net", "vfile.meituan.net", "p0.meituan.com", "p1.meituan.com", "vfile.meituan.com"));
    private static final Pattern c;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 17 && !Build.MODEL.contains("Nokia_X")) {
            z = true;
        }
        a = z;
        c = Pattern.compile("/\\d+\\.\\d+/", 2);
    }

    public static boolean a(Uri uri) {
        if (uri == null || uri.getHost() == null || uri.getPath() == null) {
            return false;
        }
        if (b.contains(uri.getHost().toLowerCase())) {
            String path = uri.getPath();
            if (path.indexOf(64) < 0) {
                return b(uri) && c.matcher(path).find();
            }
            return true;
        }
        return false;
    }

    private static boolean b(Uri uri) {
        return (uri == null || uri.getPath() == null || !uri.getPath().toLowerCase().contains(".gif")) ? false : true;
    }

    public static Uri a(Uri uri, int i, int i2, boolean z, boolean z2) {
        if (uri == null || i < 0 || i2 < 0 || uri.getHost() == null || a(uri)) {
            return uri;
        }
        if ((!b(uri) || z) && b.contains(uri.getHost().toLowerCase())) {
            if (i > 0 || i2 > 0) {
                Uri.Builder buildUpon = uri.buildUpon();
                uri = buildUpon.path(uri.getPath() + String.format("@%sw_%sh_1e_1l", Integer.valueOf(i), Integer.valueOf(i2))).build();
            }
            if (!a || !z2 || uri == null || uri.getPath() == null || uri.getPath().toLowerCase().contains("webp")) {
                return uri;
            }
            Uri.Builder buildUpon2 = uri.buildUpon();
            return buildUpon2.path(uri.getPath() + ".webp").build();
        }
        return uri;
    }
}
