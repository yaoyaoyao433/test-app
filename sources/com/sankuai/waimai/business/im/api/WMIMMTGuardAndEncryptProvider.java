package com.sankuai.waimai.business.im.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMIMMTGuardAndEncryptProvider implements MtGuardAndEncryptProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider
    public void registerEncryptProvider(com.sankuai.waimai.platform.provider.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88f4cf3b4191ba2a7af2cbf311d9c418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88f4cf3b4191ba2a7af2cbf311d9c418");
            return;
        }
        aVar.a("/im/getinfo");
        aVar.a("/im/getpoiiminfo");
    }
}
