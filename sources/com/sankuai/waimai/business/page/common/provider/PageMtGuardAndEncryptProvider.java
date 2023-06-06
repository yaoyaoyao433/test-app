package com.sankuai.waimai.business.page.common.provider;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider;
import com.sankuai.waimai.platform.provider.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PageMtGuardAndEncryptProvider implements MtGuardAndEncryptProvider {
    private static final String RELATIVE_URL = "/user/functions/list";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider
    public void registerEncryptProvider(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1983ceb975a4f76664da37978f6fe637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1983ceb975a4f76664da37978f6fe637");
        } else {
            aVar.a(RELATIVE_URL);
        }
    }
}
