package com.meituan.msi.lib.map.utils;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final Pattern b = Pattern.compile("data:base64,([a-zA-Z0-9\\+/=]+)");
    private static final int c = 22;
    private static Map<String, String> d = new HashMap();
    private static boolean e = false;

    public static File a(Context context, String str) {
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f53d6b0f0d2b730bd24a52bbcfb9f66b", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f53d6b0f0d2b730bd24a52bbcfb9f66b") : q.b(context, "map_mrnmap_sdk_file", null, u.b);
    }
}
