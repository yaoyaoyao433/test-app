package com.sankuai.waimai.store.drug.mmp.apis;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.extension.ExtensionPrivateApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.mmp.DrugBusinessModule;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PurchaseNowApi implements ExtensionPrivateApiFactory {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.extension.a
    public final String b() {
        return "privateAPI_purchaseNow";
    }

    @Override // com.meituan.mmp.lib.api.extension.a
    public final String[] c() {
        return new String[0];
    }

    @Override // com.meituan.mmp.lib.api.e
    public final ApiFunction<?, ?> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7cff029d1eb6c62b33c9acb042e4cda", RobustBitConfig.DEFAULT_VALUE) ? (ApiFunction) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7cff029d1eb6c62b33c9acb042e4cda") : new DrugBusinessModule.PurchaseNow();
    }
}
