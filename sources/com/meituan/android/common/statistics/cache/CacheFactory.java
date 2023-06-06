package com.meituan.android.common.statistics.cache;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CacheFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static ICacheHandler getDBCacheHandler(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "26448fa7aeb902d17d52edc9d3e804cd", 6917529027641081856L) ? (ICacheHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "26448fa7aeb902d17d52edc9d3e804cd") : DBCacheHandler.getInstance(context);
    }
}
