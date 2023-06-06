package com.sankuai.waimai.store.base.net.sg;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider;
import com.sankuai.waimai.store.config.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StoreGuardAndEncryptProvider implements MtGuardAndEncryptProvider {
    private static final String ENCRYPT_HORN_KEY = "fingerprint_whitelist";
    private static final String[] arrays = {"/poi/receivecoupon", "/activity/sendsharecoupon", "/poi/receivecoupon", "/poi/queryMemberCouponStatus", "/task/receivecoupon", "/payment/genpay"};
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider
    public void registerEncryptProvider(com.sankuai.waimai.platform.provider.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e604d0713a0599ce4e6fd2800f774282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e604d0713a0599ce4e6fd2800f774282");
            return;
        }
        List<String> list = (List) j.h().a(ENCRYPT_HORN_KEY, new TypeToken<ArrayList<String>>() { // from class: com.sankuai.waimai.store.base.net.sg.StoreGuardAndEncryptProvider.1
        }.getType());
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            list = Arrays.asList(arrays);
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    aVar.a(str);
                }
            }
        }
    }
}
