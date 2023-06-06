package com.meituan.android.common.aidata.jsengine.common;

import android.content.Context;
import com.dianping.jscore.SOLibraryLoader;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SoLoaderWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "028fde36c91e066ece6e1b52a6713601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "028fde36c91e066ece6e1b52a6713601");
            return;
        }
        if (SOLibraryLoader.sContext == null) {
            SOLibraryLoader.sContext = context;
        }
        k.a(context, false);
    }
}
