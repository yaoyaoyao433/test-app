package com.meituan.msi.api.extension.medicine.home;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IHome implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract EmptyResponse a(MsiCustomContext msiCustomContext, SwitchHomeTabBarByIndexParam switchHomeTabBarByIndexParam);

    @MsiApiMethod(name = "switchHomeTabBarByIndex", request = SwitchHomeTabBarByIndexParam.class, scope = "medicine")
    public EmptyResponse msiSwitchHomeTabBarByIndex(SwitchHomeTabBarByIndexParam switchHomeTabBarByIndexParam, MsiCustomContext msiCustomContext) {
        Object[] objArr = {switchHomeTabBarByIndexParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b686601784fb3ad960e510cf0f9285a7", RobustBitConfig.DEFAULT_VALUE) ? (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b686601784fb3ad960e510cf0f9285a7") : a(msiCustomContext, switchHomeTabBarByIndexParam);
    }
}
