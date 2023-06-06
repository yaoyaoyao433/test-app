package com.meituan.passport.utils;

import com.meituan.passport.api.IPassportProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        IPassportProvider iPassportProvider;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8538f2d64492b682327f1370f08ba430", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8538f2d64492b682327f1370f08ba430")).booleanValue();
        }
        try {
            List a2 = com.sankuai.meituan.serviceloader.b.a(IPassportProvider.class, "passport.status.debug", new Object[0]);
            if (!CollectionUtils.isEmpty(a2) && a2.size() > 0 && (iPassportProvider = (IPassportProvider) a2.get(0)) != null) {
                iPassportProvider.isDebug();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Throwable th) {
        List list;
        IPassportProvider iPassportProvider;
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56c35ee1fc92f9a3f333498a07d84a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56c35ee1fc92f9a3f333498a07d84a4b");
            return;
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(IPassportProvider.class, "passport.status.debug", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list) || list.size() <= 0 || (iPassportProvider = (IPassportProvider) list.get(0)) == null) {
            return;
        }
        iPassportProvider.throwExceptionIfDebug(th);
    }
}
