package com.sankuai.xm.integration.imageloader.utils;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.integration.crypto.CryptoProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Uri a(@NonNull Context context, @DrawableRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb618ae53d1a701f2e5558cfd4c9bb08", 6917529027641081856L)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb618ae53d1a701f2e5558cfd4c9bb08");
        }
        if (context == null) {
            return Uri.parse("");
        }
        Resources resources = context.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i)).appendPath(resources.getResourceTypeName(i)).appendPath(resources.getResourceEntryName(i)).build();
    }

    public static Uri a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "046550952e1cbf13d9f956fb5702d4f5", 6917529027641081856L) ? (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "046550952e1cbf13d9f956fb5702d4f5") : k.b(str);
    }

    public static Uri b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b6af3c9fedad16fabafd91ecca0ed44", 6917529027641081856L)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b6af3c9fedad16fabafd91ecca0ed44");
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return Uri.parse(str);
    }

    public static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90eabb16b7c59e0db1c24480972ff5bf", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90eabb16b7c59e0db1c24480972ff5bf")).booleanValue() : uri != null && TextUtils.equals(uri.getScheme(), "file") && CryptoProxy.c().d(uri.getPath());
    }
}
