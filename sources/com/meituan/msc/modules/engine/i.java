package com.meituan.msc.modules.engine;

import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static String a(h hVar) {
        com.meituan.msc.modules.update.f fVar;
        AppMetaInfoWrapper appMetaInfoWrapper;
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4f73b5060ac764c43e67207b34dfb30", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4f73b5060ac764c43e67207b34dfb30");
        }
        if (hVar == null || (fVar = hVar.r) == null || (appMetaInfoWrapper = fVar.h) == null) {
            return null;
        }
        return appMetaInfoWrapper.getVersion();
    }
}
