package com.dianping.titans.utils;

import android.content.Context;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ContentResolverProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static t getContentResolver(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e221e2212951e995c0da2bf3a4035455", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e221e2212951e995c0da2bf3a4035455") : Privacy.createContentResolver(context, str);
    }
}
