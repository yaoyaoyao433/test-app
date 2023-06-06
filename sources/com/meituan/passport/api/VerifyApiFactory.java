package com.meituan.passport.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VerifyApiFactory extends AbsApiFactory<VerifyApi> {
    private static final String PASSPORT_DEV_VERIFTY_URL = "http://verify.inf.test.sankuai.com/";
    private static final String PASSPORT_VERIFY_TEST_URL = "http://verify-test.meituan.com/";
    private static final String PASSPORT_VERIFY_URL = "https://verify.meituan.com/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static VerifyApiFactory instance;

    @Override // com.meituan.passport.api.AbsApiFactory
    public String getBaseUrl(int i) {
        switch (i) {
            case 2:
                return PASSPORT_VERIFY_TEST_URL;
            case 3:
                return PASSPORT_DEV_VERIFTY_URL;
            default:
                return PASSPORT_VERIFY_URL;
        }
    }

    public static VerifyApiFactory getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c804255550770bc89971c9a1e9cc8a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (VerifyApiFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c804255550770bc89971c9a1e9cc8a7");
        }
        if (instance == null) {
            instance = new VerifyApiFactory();
        }
        return instance;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public Class<VerifyApi> getApiClass() {
        return VerifyApi.class;
    }
}
