package com.sankuai.titans.protocol.utils;

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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "997cd8e810978ad4801637b4af624dea", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "997cd8e810978ad4801637b4af624dea") : Privacy.createContentResolver(context, str);
    }
}
