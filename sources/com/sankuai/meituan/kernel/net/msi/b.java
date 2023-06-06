package com.sankuai.meituan.kernel.net.msi;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.t;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final t b = t.e("http://localhost/");
    private static final MimeTypeMap c = MimeTypeMap.getSingleton();

    public static String a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1b3b5395acffe593b243aca334062ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1b3b5395acffe593b243aca334062ae");
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

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2dde9bac003e7abcb118a059e63139d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2dde9bac003e7abcb118a059e63139d");
        }
        if (str == null) {
            return null;
        }
        return str.replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a27622bdd9e806ab1741f5d4626465af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a27622bdd9e806ab1741f5d4626465af");
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = TextUtils.isEmpty(fileExtensionFromUrl) ? null : c.getMimeTypeFromExtension(fileExtensionFromUrl);
        return mimeTypeFromExtension == null ? "application/octet-stream" : mimeTypeFromExtension;
    }

    public static String c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76dc2dca5228d39c1558f22e769e61f3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76dc2dca5228d39c1558f22e769e61f3") : c.getExtensionFromMimeType(str);
    }
}
