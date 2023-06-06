package com.sankuai.waimai.store.goods.list.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(String str, int i) {
        Object[] objArr = {str, 4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0da3b0e28233f77a713038dedff16181", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0da3b0e28233f77a713038dedff16181");
        }
        if (TextUtils.isEmpty(str) || str.length() <= 4) {
            return str;
        }
        return str.substring(0, 4) + "...";
    }
}
