package com.meituan.msc.common.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ai {
    public static ChangeQuickRedirect a;
    private static final MimeTypeMap b = MimeTypeMap.getSingleton();

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "192bedeae7816012241ce2b465654faf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "192bedeae7816012241ce2b465654faf");
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (!TextUtils.isEmpty(fileExtensionFromUrl)) {
            if ("js".equals(fileExtensionFromUrl)) {
                return "application/javascript";
            }
            if ("css".equals(fileExtensionFromUrl)) {
                return "text/css";
            }
            str2 = b.getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return str2 == null ? "application/octet-stream" : str2;
    }

    public static String b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6edbe2119df6c52649559890514d08f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6edbe2119df6c52649559890514d08f") : b.getExtensionFromMimeType(str);
    }
}
