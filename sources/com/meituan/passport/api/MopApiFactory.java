package com.meituan.passport.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MopApiFactory extends AbsApiFactory<MopApi> {
    private static final String MOP_PROD_URL = "https://gaea.meituan.com/";
    private static final String MOP_STAGING_URL = "http://gaea.wpt.st.sankuai.com/";
    private static final String MOP_TEST_URL = "http://gaea.wpt.test.sankuai.com/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static MopApiFactory instance;

    @Override // com.meituan.passport.api.AbsApiFactory
    public String getBaseUrl(int i) {
        switch (i) {
            case 2:
                return MOP_STAGING_URL;
            case 3:
                return MOP_TEST_URL;
            default:
                return MOP_PROD_URL;
        }
    }

    public static MopApiFactory getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c139c50de53be015d0cb351a5d85f39c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MopApiFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c139c50de53be015d0cb351a5d85f39c");
        }
        if (instance == null) {
            instance = new MopApiFactory();
        }
        return instance;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public Class<MopApi> getApiClass() {
        return MopApi.class;
    }
}
