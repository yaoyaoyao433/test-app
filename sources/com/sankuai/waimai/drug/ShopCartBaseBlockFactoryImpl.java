package com.sankuai.waimai.drug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.shopping.cart.ShopCartBaseBlockFactory;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShopCartBaseBlockFactoryImpl implements ShopCartBaseBlockFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.shopping.cart.ShopCartBaseBlockFactory
    public com.sankuai.waimai.store.shopping.cart.ui.c create(com.sankuai.waimai.store.shopping.cart.contract.a aVar, com.sankuai.waimai.store.shopping.cart.a aVar2, String str) {
        Object[] objArr = {aVar, aVar2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d39b424f34a05d150fcacabc15275af9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.shopping.cart.ui.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d39b424f34a05d150fcacabc15275af9");
        }
        if (ShopCartBaseBlockFactory.SHOP_CART_BOTTOM_BLOCK_B2C.equals(str)) {
            return new com.sankuai.waimai.drug.b2c.a(aVar, aVar2);
        }
        if (ShopCartBaseBlockFactory.SHOP_CART_BOTTOM_BLOCK_O2O.equals(str)) {
            return new com.sankuai.waimai.drug.o2o.a(aVar, aVar2);
        }
        return null;
    }
}
