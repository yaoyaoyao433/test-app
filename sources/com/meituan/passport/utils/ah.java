package com.meituan.passport.utils;

import com.meituan.passport.api.OperatorLoginDialogProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ah {
    public static ChangeQuickRedirect a;

    public static String a() {
        List list;
        OperatorLoginDialogProvider operatorLoginDialogProvider;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "745243126a3fe30270094e3300dd8204", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "745243126a3fe30270094e3300dd8204");
        }
        try {
            list = com.sankuai.meituan.serviceloader.b.a(OperatorLoginDialogProvider.class, "passport.operatorlogin.dialog", new Object[0]);
        } catch (Exception unused) {
            list = null;
        }
        return (CollectionUtils.isEmpty(list) || list.size() <= 0 || (operatorLoginDialogProvider = (OperatorLoginDialogProvider) list.get(0)) == null) ? "" : operatorLoginDialogProvider.getChinaMobileSecurityPhone();
    }
}
