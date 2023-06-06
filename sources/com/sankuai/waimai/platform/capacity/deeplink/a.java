package com.sankuai.waimai.platform.capacity.deeplink;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final String[] c = {"com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity", "com.meituan.mmp.lib.RouterCenterActivity"};
    public static boolean b = true;

    public static boolean a() {
        return b;
    }

    public static void b() {
        b = false;
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec39c1e9066170bbd5c897f75b32fb3c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec39c1e9066170bbd5c897f75b32fb3c")).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        for (String str : c) {
            if (str.equals(activity.getClass().getName())) {
                return true;
            }
        }
        return false;
    }

    public static int a(Uri uri) {
        String queryParameter;
        int i;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad8fff76a30a4a7d0eca270447fb54a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad8fff76a30a4a7d0eca270447fb54a5")).intValue();
        }
        if (uri == null || uri.isOpaque() || uri.isRelative() || (queryParameter = uri.getQueryParameter("_wm_dm_")) == null) {
            return 0;
        }
        try {
            i = Integer.parseInt(queryParameter);
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 1) {
            String queryParameter2 = uri.getQueryParameter("_dl_bz_");
            if (TextUtils.isEmpty(queryParameter2) || com.sankuai.waimai.platform.utils.sharedpreference.a.g(queryParameter2)) {
                return i;
            }
            return 0;
        }
        return 0;
    }

    public static boolean a(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90be017d5a6436e169c1478001d41935", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90be017d5a6436e169c1478001d41935")).booleanValue();
        }
        if (uri == null || uri.isOpaque() || uri.isRelative()) {
            return true;
        }
        String queryParameter = uri.getQueryParameter("_wm_dv_");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            String[] split = queryParameter.split("\\.");
            String[] split2 = str.split("\\.");
            for (int i = 0; i < split.length && i < split2.length; i++) {
                if (Integer.parseInt(split2[i]) < Integer.parseInt(split[i])) {
                    return false;
                }
            }
            return split.length <= split2.length;
        } catch (Exception unused) {
            return true;
        }
    }

    public static String b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95a6adcc919a1da48c07d0d47df22de2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95a6adcc919a1da48c07d0d47df22de2");
        }
        if (uri == null || uri.isOpaque() || uri.isRelative()) {
            return "main";
        }
        String queryParameter = uri.getQueryParameter("_wm_rta_");
        return TextUtils.isEmpty(queryParameter) ? "main" : queryParameter;
    }
}
