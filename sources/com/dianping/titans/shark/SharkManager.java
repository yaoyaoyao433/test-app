package com.dianping.titans.shark;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class SharkManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ISharkModule mSharkModule;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ISharkModule {
        a.InterfaceC0637a getRawCallFactory();
    }

    public static ISharkModule getSharkModule() {
        return mSharkModule;
    }

    public static void setSharkModule(ISharkModule iSharkModule) {
        mSharkModule = iSharkModule;
    }
}
