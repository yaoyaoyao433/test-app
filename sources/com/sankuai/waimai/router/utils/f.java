package com.sankuai.waimai.router.utils;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74c938e40638869508f93ea4b1e5fba8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74c938e40638869508f93ea4b1e5fba8") : TextUtils.isEmpty(str) ? str : str.toLowerCase();
    }

    @NonNull
    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "248910f5cbc7f87abd83146cf282d518", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "248910f5cbc7f87abd83146cf282d518");
        }
        return b(a(str)) + "://" + b(a(str2));
    }

    public static String a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ed8c0edbfed8b7e0e3729e1e1d3b542", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ed8c0edbfed8b7e0e3729e1e1d3b542");
        }
        if (uri == null) {
            return null;
        }
        return a(uri.getScheme(), uri.getHost());
    }

    public static Uri a(Uri uri, Map<String, String> map) {
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca79e50bb55e6623103da1f34642dde3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca79e50bb55e6623103da1f34642dde3");
        }
        if (uri != null && map != null && !map.isEmpty()) {
            Uri.Builder buildUpon = uri.buildUpon();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str) && uri.getQueryParameter(str) == null) {
                        buildUpon.appendQueryParameter(str, map.get(str));
                    }
                }
                return buildUpon.build();
            } catch (Exception e) {
                com.sankuai.waimai.router.core.d.b(e);
            }
        }
        return uri;
    }
}
