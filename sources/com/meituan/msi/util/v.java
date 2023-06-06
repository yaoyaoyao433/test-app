package com.meituan.msi.util;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class v {
    public static ChangeQuickRedirect a;

    public static String a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "378ba1bebb11d236a4a51eb971ac19d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "378ba1bebb11d236a4a51eb971ac19d9");
        }
        if (!URLUtil.isNetworkUrl(str) || map == null || map.size() == 0) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (TextUtils.isEmpty(parse.getQueryParameter(entry.getKey()))) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }
}
