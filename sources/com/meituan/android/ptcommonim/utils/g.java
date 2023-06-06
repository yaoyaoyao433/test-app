package com.meituan.android.ptcommonim.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static String a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a51c248ae4a6bbc70a20580cec0ac269", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a51c248ae4a6bbc70a20580cec0ac269");
        }
        strArr[0] = TextUtils.isEmpty(strArr[0]) ? "" : strArr[0];
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < 2; i++) {
            sb.append(CommonConstant.Symbol.MINUS);
            sb.append(strArr[1]);
        }
        return sb.toString();
    }
}
