package com.sankuai.titans.result.util;

import android.content.Context;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ContentResolverProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static t getContentResolver(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a54531344ee97028135195c095fd498", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a54531344ee97028135195c095fd498") : Privacy.createContentResolver(context, str);
    }
}
