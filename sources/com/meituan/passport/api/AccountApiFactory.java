package com.meituan.passport.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AccountApiFactory extends AbsApiFactory<AccountApi> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AccountApiFactory instance;

    public static AccountApiFactory getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8c944e33d8e220c90e223e2238c3251", RobustBitConfig.DEFAULT_VALUE)) {
            return (AccountApiFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8c944e33d8e220c90e223e2238c3251");
        }
        if (instance == null) {
            instance = new AccountApiFactory();
        }
        return instance;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public Class<AccountApi> getApiClass() {
        return AccountApi.class;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public String getBaseUrl(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52a84420c9213e4b02a32906767eb94a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52a84420c9213e4b02a32906767eb94a");
        }
        switch (i) {
            case 2:
                return AbsApiFactory.PASSPORT_COMMON_URL.replace(AbsApiFactory.PASSPORT_ONLINE_URL, AbsApiFactory.PASSPORT_TEST_ONLINE_URL).replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
            case 3:
                return AbsApiFactory.PASSPORT_COMMON_URL.replace(AbsApiFactory.PASSPORT_ONLINE_URL, AbsApiFactory.PASSPORT_TEST_OFFLINE_URL).replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
            default:
                return AbsApiFactory.PASSPORT_COMMON_URL;
        }
    }
}
