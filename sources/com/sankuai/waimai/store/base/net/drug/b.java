package com.sankuai.waimai.store.base.net.drug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.drug.DrugConfigPath;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.net.a {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.store.base.net.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8597fb937471b19058fc4a951bdd56af", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8597fb937471b19058fc4a951bdd56af") : com.sankuai.waimai.store.config.d.h().a(DrugConfigPath.DRUG_API_SWITCH, true) ? "http://hcapi.waimai.meituan.com" : "http://scapi.waimai.meituan.com";
    }
}
