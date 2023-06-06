package com.sankuai.waimai.landing.util;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.landing.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static a.EnumC0984a a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd8532aff4016674836e1e3abce4c0b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.EnumC0984a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd8532aff4016674836e1e3abce4c0b5");
        }
        if (uri == null) {
            return a.EnumC0984a.UNKNOWN;
        }
        if (b(uri)) {
            return a.EnumC0984a.H5;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return a.EnumC0984a.UNKNOWN;
        }
        if ("/mrn".equals(path) || "/rn".equals(path)) {
            return a.EnumC0984a.MRN;
        }
        if ("/mmp".equals(path)) {
            return a.EnumC0984a.MMP;
        }
        return a.EnumC0984a.Native;
    }

    private static boolean b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e6ac82ad6446cdcde577fed7ecabf68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e6ac82ad6446cdcde577fed7ecabf68")).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        if (scheme.startsWith("http")) {
            return true;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.contains("/browser") || path.contains("/web");
    }
}
