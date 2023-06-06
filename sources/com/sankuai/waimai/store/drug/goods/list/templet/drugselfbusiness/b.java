package com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness;

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
import com.sankuai.waimai.store.drug.goods.list.adapter.DrugComposeShopPageAdapter;
import com.sankuai.waimai.store.drug.goods.list.delegate.d;
import com.sankuai.waimai.store.drug.goods.list.interfaces.b;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends DrugComposeShopPageBlock implements com.sankuai.waimai.store.shopping.cart.b {
    public static ChangeQuickRedirect a;
    private View b;
    private View g;
    private final ArgbEvaluator h;

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock
    public final void a(boolean z) {
    }

    @Override // com.sankuai.waimai.store.shopping.cart.b
    public final String bg_() {
        return "type_get_shop_content_mrn_tab_data";
    }

    public b(d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84cb60c812f0dd9a0d402b128e4cf321", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84cb60c812f0dd9a0d402b128e4cf321");
        } else {
            this.h = new ArgbEvaluator();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "385d3b3197c4609d91fac5e1e8f37f1e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "385d3b3197c4609d91fac5e1e8f37f1e") : layoutInflater.inflate(R.layout.wm_drug_shop_content_drug_self_business_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "610a3f2c256707182d499a4b3f3fcd05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "610a3f2c256707182d499a4b3f3fcd05");
            return;
        }
        super.onViewCreated();
        this.b = findView(R.id.tab_layout);
        this.g = findView(R.id.divider_line);
        com.sankuai.waimai.store.shopping.cart.d.a().a(this);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock
    public final void a(RestMenuResponse.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b02ceafb695db20c72e60ef45d48198d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b02ceafb695db20c72e60ef45d48198d");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.d.k(), "b_waimai_26bqtxhw_mc").a("poi_id", this.d.d().d()).a("tab_name", bVar.b).a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock
    public final DrugComposeShopPageAdapter a(final Context context, final d dVar, final FragmentManager fragmentManager) {
        Object[] objArr = {context, dVar, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eed9465889cfcd1bf7fa4131fd2dbe4", RobustBitConfig.DEFAULT_VALUE) ? (DrugComposeShopPageAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eed9465889cfcd1bf7fa4131fd2dbe4") : new DrugComposeShopPageAdapter(context, dVar, fragmentManager) { // from class: com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.DrugSelfBusinessPageBlock$1
            public static ChangeQuickRedirect e;

            @Override // com.sankuai.waimai.store.drug.goods.list.adapter.DrugComposeShopPageAdapter
            public final com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a a(@NonNull d dVar2, b.a aVar, boolean z) {
                Object[] objArr2 = {dVar2, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = e;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e517d4e432274b0e340a78b14aeb8eb6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e517d4e432274b0e340a78b14aeb8eb6") : new com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.spu.a(dVar2, null, z);
            }
        };
    }

    public final void a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a685a3caca769689b09f71a7e292421b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a685a3caca769689b09f71a7e292421b");
            return;
        }
        float a2 = n.a((f - 0.9f) / 0.100000024f, 0.0f, 1.0f);
        this.b.setBackgroundColor(a(a2, ViewCompat.MEASURED_SIZE_MASK, -1));
        this.g.setBackgroundColor(a(a2, ViewCompat.MEASURED_SIZE_MASK, -855310));
        this.e.setIndicatorColor(a(a2, -14539738, -13261));
    }

    private int a(float f, int i, int i2) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2e682321e2be795b00ab6a03e4f80a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2e682321e2be795b00ab6a03e4f80a")).intValue() : ((Integer) this.h.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36ab42a2b38d77b8c6caccb98755af58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36ab42a2b38d77b8c6caccb98755af58");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.shopping.cart.d.a().b(this);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.b
    public final void a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76a33ac65370222051f56f10eb01157f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76a33ac65370222051f56f10eb01157f");
        } else if (this.f == null || jSONObject == null) {
        } else {
            jSONObject.put("mrn_tab_data", this.f.mMRNTabData);
        }
    }
}
