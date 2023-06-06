package com.sankuai.waimai.store.marketing;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.manager.marketing.d;
import com.sankuai.waimai.store.manager.sequence.strategy.b;
import com.sankuai.waimai.store.order.a;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGMarketingAddShopCartAtLeastOneRule extends b<Object> {
    public static final String RULE_NAME = "marketing_rule_add_shopcart_at_least_one";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.manager.sequence.strategy.a
    public void rollback(@Nullable d dVar) {
    }

    @Override // com.sankuai.waimai.store.manager.sequence.strategy.a
    public void updateValidStatus(@Nullable d dVar) {
    }

    @Keep
    public SGMarketingAddShopCartAtLeastOneRule(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "254327e299d8b2b095c5f2bfc83bc086", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "254327e299d8b2b095c5f2bfc83bc086");
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.strategy.a
    public boolean isValid(@Nullable d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14b07272e2afb6202d55a0097ede9882", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14b07272e2afb6202d55a0097ede9882")).booleanValue() : a.e().d;
    }
}
