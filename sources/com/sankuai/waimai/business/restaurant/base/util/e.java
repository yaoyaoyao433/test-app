package com.sankuai.waimai.business.restaurant.base.util;

import android.text.Html;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static CharSequence a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "936a47bd19b6ef956a37d03cf63d402c", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "936a47bd19b6ef956a37d03cf63d402c");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return Html.fromHtml(str.replace("<highlight>", "<font color=\"" + str2 + "\">").replace("</highlight>", "</font>"));
    }
}
