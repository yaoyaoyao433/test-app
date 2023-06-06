package com.meituan.mmp.lib.utils;

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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "beac6e684132f58c4ab869d190b3e20a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "beac6e684132f58c4ab869d190b3e20a");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae9032bf814862bdcff312fd3abbe9eb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae9032bf814862bdcff312fd3abbe9eb") : b.getExtensionFromMimeType(str);
    }
}
