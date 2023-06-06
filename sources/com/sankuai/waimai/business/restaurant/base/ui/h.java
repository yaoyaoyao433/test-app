package com.sankuai.waimai.business.restaurant.base.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.ui.a;
import com.sankuai.waimai.business.restaurant.base.ui.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.goods.SpuPackageItem;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.tencent.connect.common.Constants;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends d.a implements a.InterfaceC0828a {
    public static ChangeQuickRedirect h;
    private i i;

    public h(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c49e71d26137329a18316ae6ddd19195", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c49e71d26137329a18316ae6ddd19195");
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.ui.d.a
    public final void a() {
        a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c95360980640fd5405647c70e4424a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c95360980640fd5405647c70e4424a83");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1625164fb9c83e9dcfed6f80353fe07d", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1625164fb9c83e9dcfed6f80353fe07d");
        } else {
            if (this.i == null) {
                this.i = new i(LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_spu_package_entrance, this.c, false), this.c);
            }
            aVar = this.i;
        }
        aVar.a(this.d.packageList.get(0), this);
        this.c.addView(aVar.a());
    }

    @Override // com.sankuai.waimai.business.restaurant.base.ui.a.InterfaceC0828a
    public final void a(SpuPackageItem spuPackageItem) {
        String sb;
        Object[] objArr = {spuPackageItem};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f0dbb6c90393b42cede3a3211252624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f0dbb6c90393b42cede3a3211252624");
            return;
        }
        if (this.f != null) {
            b(spuPackageItem);
            com.sankuai.waimai.business.restaurant.poicontainer.utils.b.b(this.e.f());
        }
        JudasManualManager.a a = JudasManualManager.a("b_waimai_6q5lokdt_mc").a("c_CijEL");
        a.b = AppUtil.generatePageInfoKey(this.b);
        JudasManualManager.a a2 = a.a("index", this.g).a("poi_id", this.e.f()).a("spu_id", this.d.getId()).a("group_id", spuPackageItem.groupId);
        Object[] objArr2 = {spuPackageItem};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c150722e14fdc2ddde8f5a296c726d1", RobustBitConfig.DEFAULT_VALUE)) {
            sb = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c150722e14fdc2ddde8f5a296c726d1");
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (!com.sankuai.waimai.restaurant.shopcart.utils.b.a(spuPackageItem.productList)) {
                for (GoodsSpu goodsSpu : spuPackageItem.productList) {
                    if (!com.sankuai.waimai.restaurant.shopcart.utils.b.a(goodsSpu.getSkus())) {
                        sb2.append(goodsSpu.getSkus().get(0).id);
                        sb2.append(',');
                    }
                }
            }
            sb = sb2.toString();
            if (!TextUtils.isEmpty(sb)) {
                sb = sb.substring(0, sb.length() - 1);
            }
        }
        a2.a("sku_id", sb).a("price", String.valueOf(this.d.getMinPrice())).a("current_price", String.valueOf(spuPackageItem.price)).a("orig_price", String.valueOf(spuPackageItem.originPrice)).a("rank_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok")).a("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok_ref")).a();
    }

    @NonNull
    private String b(SpuPackageItem spuPackageItem) {
        Object[] objArr = {spuPackageItem};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e024af8b2be927a769155b7799ccaff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e024af8b2be927a769155b7799ccaff");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.PACKAGE_ID, spuPackageItem.groupId);
            jSONObject.put("product_list", com.sankuai.waimai.business.restaurant.poicontainer.utils.b.a(spuPackageItem.productList));
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Exception unused) {
            return jSONArray.toString();
        }
    }
}
