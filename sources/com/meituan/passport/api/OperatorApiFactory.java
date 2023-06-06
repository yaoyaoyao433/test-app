package com.meituan.passport.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OperatorApiFactory extends AbsApiFactory<OperatorApi> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static OperatorApiFactory sInstance;

    @Override // com.meituan.passport.api.AbsApiFactory
    public String getBaseUrl(int i) {
        switch (i) {
            case 2:
            case 3:
                return "http://passport.sso.mtp.dev.sankuai.com/user/api/";
            default:
                return AbsApiFactory.PASSPORT_USER_API_URL;
        }
    }

    public static OperatorApiFactory getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0fa93326c08081039802686fbeb02d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (OperatorApiFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0fa93326c08081039802686fbeb02d5");
        }
        if (sInstance == null) {
            synchronized (OperatorApiFactory.class) {
                if (sInstance == null) {
                    sInstance = new OperatorApiFactory();
                }
            }
        }
        return sInstance;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public Class<OperatorApi> getApiClass() {
        return OperatorApi.class;
    }
}
