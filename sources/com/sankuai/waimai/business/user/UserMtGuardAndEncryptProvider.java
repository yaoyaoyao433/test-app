package com.sankuai.waimai.business.user;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider;
import com.sankuai.waimai.platform.provider.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UserMtGuardAndEncryptProvider implements MtGuardAndEncryptProvider {
    public static final String FOOTPRINT_LIST_RELATIVE_URL = "/footprint/list";
    public static final String USER_FAVORITES_LIST_RELATIVE_URL = "/user/favorites/list";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider
    public void registerEncryptProvider(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6947fba5fa9de363bc382806806129c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6947fba5fa9de363bc382806806129c");
        } else {
            aVar.a("/comment/submit");
        }
    }
}
