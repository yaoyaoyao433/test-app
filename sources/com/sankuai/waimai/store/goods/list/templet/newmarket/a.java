package com.sankuai.waimai.store.goods.list.templet.newmarket;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends ShopContentRootBlock {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock
    public final boolean g() {
        return false;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final boolean h() {
        return true;
    }

    public a(com.sankuai.waimai.store.goods.list.delegate.d dVar, @Nullable a.InterfaceC1266a interfaceC1266a) {
        super(dVar, null, 2);
        Object[] objArr = {dVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4e084096e7dc8cc3166abfe4126c937", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4e084096e7dc8cc3166abfe4126c937");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.a, com.sankuai.waimai.store.goods.list.templet.newmarket.g
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b9a15ed0fcb715db17873e55cf92bb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b9a15ed0fcb715db17873e55cf92bb6");
        }
        View a2 = super.a(layoutInflater, viewGroup);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cffd6e09044a100c42dfc550195c77e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cffd6e09044a100c42dfc550195c77e9");
        } else {
            a2.findViewById(R.id.poi_dish_categories).setBackgroundColor(ContextCompat.getColor(a2.getContext(), R.color.wm_sg_color_F7F7F7));
        }
        return a2;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock
    public final com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d a(@NonNull Context context, @NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, @NonNull e eVar) {
        Object[] objArr = {context, dVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206b25923c5cb06d612cf0c31a8118fa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206b25923c5cb06d612cf0c31a8118fa") : new com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.a(context, dVar, eVar);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock
    public final com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7218ba73ee56ac0c4304aacfb390d935", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7218ba73ee56ac0c4304aacfb390d935") : new com.sankuai.waimai.store.goods.list.templet.newmarket.dot.a(this, this.k);
    }
}
