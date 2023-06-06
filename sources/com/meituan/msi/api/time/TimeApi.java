package com.meituan.msi.api.time;

import com.meituan.android.time.c;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TimeApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "getNetworkTime", response = GetNetworkTimeResponse.class)
    public void getNetworkTime(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18bc02a9528e5728534d84f1a4a9c5ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18bc02a9528e5728534d84f1a4a9c5ef");
        } else {
            getNetworkTimeSync(msiContext);
        }
    }

    @MsiApiMethod(name = "getNetworkTimeSync", response = GetNetworkTimeResponse.class)
    public GetNetworkTimeResponse getNetworkTimeSync(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f43d432dfd146928f0cad043e28c676", RobustBitConfig.DEFAULT_VALUE)) {
            return (GetNetworkTimeResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f43d432dfd146928f0cad043e28c676");
        }
        GetNetworkTimeResponse getNetworkTimeResponse = new GetNetworkTimeResponse();
        c.a(a.f());
        getNetworkTimeResponse.timestamp = c.b();
        msiContext.onSuccess(getNetworkTimeResponse);
        return getNetworkTimeResponse;
    }
}
