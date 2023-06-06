package com.sankuai.waimai.platform.net.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73ec737c68a34f9399c61780b06189f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73ec737c68a34f9399c61780b06189f7")).booleanValue();
        }
        IMainActivityLoadedPlatform iMainActivityLoadedPlatform = (IMainActivityLoadedPlatform) com.sankuai.waimai.router.a.a(IMainActivityLoadedPlatform.class, IMainActivityLoadedPlatform.MAIN_ACTIVITY_LOADED);
        return iMainActivityLoadedPlatform != null && iMainActivityLoadedPlatform.getMainActivityLoaded();
    }
}
