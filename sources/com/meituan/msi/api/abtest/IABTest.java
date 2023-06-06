package com.meituan.msi.api.abtest;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IABTest implements IMsiApi {
    public static ChangeQuickRedirect a;

    public abstract GetABResponse a(GetABParam getABParam, MsiContext msiContext);

    @MsiApiMethod(name = "getABSync", request = GetABParam.class, response = GetABResponse.class)
    public GetABResponse msiGetABSync(GetABParam getABParam, MsiContext msiContext) {
        Object[] objArr = {getABParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202e735b68f592e183a7605605067d1a", RobustBitConfig.DEFAULT_VALUE) ? (GetABResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202e735b68f592e183a7605605067d1a") : a(getABParam, msiContext);
    }

    @MsiApiMethod(name = "getAB", request = GetABParam.class, response = GetABResponse.class)
    public void msiGetAB(GetABParam getABParam, MsiContext msiContext) {
        Object[] objArr = {getABParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2591bd2bec474103b4c0bb0dab5cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2591bd2bec474103b4c0bb0dab5cdd");
        } else {
            a(getABParam, msiContext);
        }
    }
}
