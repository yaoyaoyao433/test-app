package com.sankuai.waimai.store.util;

import android.os.Build;
import android.support.annotation.NonNull;
import android.text.Html;
import android.text.Spanned;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static Spanned a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a6cb024cc02f7bcf6d0b01e61833191", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a6cb024cc02f7bcf6d0b01e61833191");
        }
        return a(str.replace("<highlight>", "<font color=" + str2 + ">").replace("</highlight>", "</font>"));
    }

    public static Spanned b(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc80536b86aa00acb3fadc59ed701f9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc80536b86aa00acb3fadc59ed701f9e");
        }
        return a(str.replace("<highlight>", "<b><font color=" + str2 + ">").replace("</highlight>", "</font></b>"));
    }

    public static Spanned a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34a3b13dddb98cdb812a05f9713f252e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34a3b13dddb98cdb812a05f9713f252e");
        }
        if (Build.VERSION.SDK_INT < 24) {
            return Html.fromHtml(str);
        }
        return Html.fromHtml(str, 0);
    }
}
