package com.sankuai.waimai.store.goods.list.templet.drugselfbusiness;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.waimai.store.goods.list.adapter.DrugComposeShopPageAdapter;
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.shopping.cart.d;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends DrugComposeShopPageBlock implements com.sankuai.waimai.store.shopping.cart.b {
    public static ChangeQuickRedirect a;
    private View f;
    private View g;
    private final ArgbEvaluator h;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock
    public final void a(boolean z) {
    }

    @Override // com.sankuai.waimai.store.shopping.cart.b
    public final String bg_() {
        return "type_get_shop_content_mrn_tab_data";
    }

    public b(e eVar) {
        super(eVar);
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be32ebe004f8e7282609faccc523d74f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be32ebe004f8e7282609faccc523d74f");
        } else {
            this.h = new ArgbEvaluator();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15778bb603022edceba071a8d2bd9a64", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15778bb603022edceba071a8d2bd9a64") : layoutInflater.inflate(R.layout.wm_sc_shop_content_drug_self_business_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee19b511504f302d05da0dc30254715", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee19b511504f302d05da0dc30254715");
            return;
        }
        super.onViewCreated();
        this.f = findView(R.id.tab_layout);
        this.g = findView(R.id.divider_line);
        d.a().a(this);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock
    public final void a(RestMenuResponse.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99feb4f288e937270e55b6084e20615b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99feb4f288e937270e55b6084e20615b");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.c.k(), "b_waimai_26bqtxhw_mc").a("poi_id", Long.valueOf(this.c.d().f())).a("tab_name", bVar.b).a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock
    public final DrugComposeShopPageAdapter a(final Context context, final e eVar, final FragmentManager fragmentManager) {
        Object[] objArr = {context, eVar, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8ee5d54b1719077304c1bc18a7fafb", RobustBitConfig.DEFAULT_VALUE) ? (DrugComposeShopPageAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8ee5d54b1719077304c1bc18a7fafb") : new DrugComposeShopPageAdapter(context, eVar, fragmentManager) { // from class: com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.DrugSelfBusinessPageBlock$1
            public static ChangeQuickRedirect f;

            @Override // com.sankuai.waimai.store.goods.list.adapter.DrugComposeShopPageAdapter
            public final com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = f;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a337202fec7074a852a71c61af5f382c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a337202fec7074a852a71c61af5f382c") : new com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.index.a(eVar, new a.InterfaceC1266a() { // from class: com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.DrugSelfBusinessPageBlock$1.1
                    @Override // com.sankuai.waimai.store.platform.shop.interfaces.a.InterfaceC1266a
                    public final void a(boolean z) {
                    }

                    @Override // com.sankuai.waimai.store.platform.shop.interfaces.a.InterfaceC1266a
                    public final void b(boolean z) {
                    }
                });
            }

            @Override // com.sankuai.waimai.store.goods.list.adapter.DrugComposeShopPageAdapter
            public final com.sankuai.waimai.store.goods.list.templet.newmarket.b a(@NonNull e eVar2, a.InterfaceC1266a interfaceC1266a, boolean z) {
                Object[] objArr2 = {eVar2, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = f;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78fba06f112dd149168fb9c07ff14276", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.templet.newmarket.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78fba06f112dd149168fb9c07ff14276") : new com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.spu.a(eVar2, null, z);
            }
        };
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock
    public final boolean a(RestMenuResponse.NavigateItem navigateItem) {
        Object[] objArr = {navigateItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a95588f8c2a7d52e403fe1f00634ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a95588f8c2a7d52e403fe1f00634ff")).booleanValue();
        }
        com.sankuai.waimai.store.router.d.a(getContext(), navigateItem.scheme);
        return false;
    }

    public final void a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37421425f26ea9fb9468a16348097b86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37421425f26ea9fb9468a16348097b86");
            return;
        }
        float a2 = n.a((f - 0.9f) / 0.100000024f, 0.0f, 1.0f);
        this.f.setBackgroundColor(a(a2, ViewCompat.MEASURED_SIZE_MASK, -1));
        this.g.setBackgroundColor(a(a2, ViewCompat.MEASURED_SIZE_MASK, -855310));
        this.d.setIndicatorColor(a(a2, -14539738, -13261));
    }

    private int a(float f, int i, int i2) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e361e4b2ed299b8c07cf97462d5911", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e361e4b2ed299b8c07cf97462d5911")).intValue() : ((Integer) this.h.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e628c4e113144e6ebea9c4358da3cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e628c4e113144e6ebea9c4358da3cc");
            return;
        }
        super.onDestroy();
        d.a().b(this);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.b
    public final void a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49bd755fbb2c5a00dfa0e2a956d099f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49bd755fbb2c5a00dfa0e2a956d099f2");
        } else if (this.e == null || jSONObject == null) {
        } else {
            jSONObject.put("mrn_tab_data", this.e.mMRNTabData);
        }
    }
}
