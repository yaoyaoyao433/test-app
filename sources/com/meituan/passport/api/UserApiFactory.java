package com.meituan.passport.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UserApiFactory extends AbsApiFactory<UserApi> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static UserApiFactory userApiFactory;

    public static UserApiFactory getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e51ad929b93c8b50616b8050d013d30", RobustBitConfig.DEFAULT_VALUE)) {
            return (UserApiFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e51ad929b93c8b50616b8050d013d30");
        }
        if (userApiFactory == null) {
            synchronized (UserApiFactory.class) {
                if (userApiFactory == null) {
                    userApiFactory = new UserApiFactory();
                }
            }
        }
        return userApiFactory;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public Class<UserApi> getApiClass() {
        return UserApi.class;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public String getBaseUrl(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45dded3392e938875181d610fc0c2b8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45dded3392e938875181d610fc0c2b8e");
        }
        switch (i) {
            case 2:
                return AbsApiFactory.PASSPORT_USER_API_URL.replace(AbsApiFactory.PASSPORT_ONLINE_URL, AbsApiFactory.PASSPORT_TEST_ONLINE_URL).replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
            case 3:
                return AbsApiFactory.PASSPORT_USER_API_URL.replace(AbsApiFactory.PASSPORT_ONLINE_URL, AbsApiFactory.PASSPORT_TEST_OFFLINE_URL).replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
            default:
                return AbsApiFactory.PASSPORT_USER_API_URL;
        }
    }
}
