package com.sankuai.waimai.store.search.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider;
import com.sankuai.waimai.platform.provider.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NoxMtGuardAndEncryptProvider implements MtGuardAndEncryptProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider
    public void registerEncryptProvider(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67dc21848811cb6da7d40abfab111bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67dc21848811cb6da7d40abfab111bd7");
        } else {
            aVar.a("/poi/search/poiwithfilter");
        }
    }
}
