package com.sankuai.waimai.bussiness.order.detailnew.util;

import android.support.annotation.Nullable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    @Nullable
    public static Spanned a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6ad247d21e0d8e8a24b1a15acb8166e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6ad247d21e0d8e8a24b1a15acb8166e");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Html.fromHtml(str.replace("<highlight>", "<font color=\"" + str2 + "\">").replace("</highlight>", "</font>"));
    }

    public static Spanned a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0eee2e655bc93d2022b528b95b70640", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0eee2e655bc93d2022b528b95b70640");
        }
        if (TextUtils.isEmpty(str)) {
            Html.fromHtml("");
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = "#FF8000";
            }
            if (str.contains("<highlight>")) {
                str4 = str.replace("<highlight>", "<font color=\"" + str2 + "\">").replace("</highlight>", "</font>");
            } else {
                str4 = str;
            }
            if (str4.contains("<time>")) {
                str4 = str4.replace("<time>", "<font color=\"" + str2 + "\">" + str3).replace("</time>", "</font>");
            }
            return Html.fromHtml(str4);
        } catch (Exception unused) {
            return Html.fromHtml(str);
        }
    }
}
