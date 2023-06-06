package com.meituan.msi.service;

import com.meituan.android.paycommon.lib.VersionInfo;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ServiceApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "getServiceInfo", request = ServiceParam.class, response = ServiceResponse.class)
    public void getServiceInfo(ServiceParam serviceParam, MsiContext msiContext) {
        Object[] objArr = {serviceParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe81ac874bb64e0e3cf042d4c79f1ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe81ac874bb64e0e3cf042d4c79f1ede");
            return;
        }
        ServiceResponse serviceResponse = new ServiceResponse();
        String str = serviceParam.name;
        if (str.equals("payment")) {
            serviceResponse.version = VersionInfo.getVersion();
        } else if (str.equals("voip")) {
            serviceResponse.version = com.meituan.android.customerservice.utils.VersionInfo.getVersion();
        }
        if (serviceResponse.version.isEmpty()) {
            msiContext.onError("App has no " + str);
            return;
        }
        msiContext.onSuccess(serviceResponse);
    }
}
