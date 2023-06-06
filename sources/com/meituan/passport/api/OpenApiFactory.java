package com.meituan.passport.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OpenApiFactory extends AbsApiFactory<OpenApi> {
    private static final String PASSPORT_OPEN_URL = "https://open.meituan.com/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static OpenApiFactory instance;

    public static OpenApiFactory getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e073a8dd6216b110f4e3ce1d60480e1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (OpenApiFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e073a8dd6216b110f4e3ce1d60480e1c");
        }
        if (instance == null) {
            instance = new OpenApiFactory();
        }
        return instance;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public Class<OpenApi> getApiClass() {
        return OpenApi.class;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public String getBaseUrl(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "982f59a7229d64df40edc2b758157a6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "982f59a7229d64df40edc2b758157a6b");
        }
        switch (i) {
            case 2:
                return PASSPORT_OPEN_URL.replace(AbsApiFactory.PASSPORT_ONLINE_URL, AbsApiFactory.PASSPORT_TEST_ONLINE_URL).replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
            case 3:
                return PASSPORT_OPEN_URL.replace(AbsApiFactory.PASSPORT_ONLINE_URL, AbsApiFactory.PASSPORT_TEST_OFFLINE_URL).replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
            default:
                return PASSPORT_OPEN_URL;
        }
    }
}
