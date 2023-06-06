package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends g implements c.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect c;

    public b(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar, BaseModuleDesc baseModuleDesc) {
        super(cVar, baseModuleDesc);
        boolean z = false;
        Object[] objArr = {cVar, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f2ec0d8aafd0169009102ef7e0aa374", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f2ec0d8aafd0169009102ef7e0aa374");
            return;
        }
        Object[] objArr2 = {cVar, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c7b5b400c35a13cfa1c4565bb5924bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c7b5b400c35a13cfa1c4565bb5924bf");
        } else if (baseModuleDesc != null) {
            String str = baseModuleDesc.templateId;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "beef4c088794f45cbc03205fa7cc216d", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "beef4c088794f45cbc03205fa7cc216d")).booleanValue();
            } else if (TextUtils.equals(str, "supermarket-drug-poi-header-coupon") || TextUtils.equals(str, "drug-poi-compose-header-coupon")) {
                z = true;
            }
            if (z) {
                com.sankuai.waimai.store.manager.coupon.c.a().a(this);
                com.sankuai.waimai.store.order.a.e().a(this);
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.g
    public final void a(BaseModuleDesc baseModuleDesc, int i, boolean z) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac5890fe7c919b85324d21f8be4a394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac5890fe7c919b85324d21f8be4a394");
        } else {
            super.a(baseModuleDesc, i, z);
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae8fde6532e03bcac2c81e2cc92988e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae8fde6532e03bcac2c81e2cc92988e");
        } else if (this.f == null || this.e.d == null || poiCouponItem == null) {
        } else {
            SCBaseActivity sCBaseActivity = (SCBaseActivity) this.e.d.getContext();
            HashMap hashMap = new HashMap();
            try {
                String a = i.a(poiCouponItem);
                hashMap.put("coupon_item", i.a(a) ? new JSONObject(a) : new JSONObject());
                if (sCBaseActivity == null || sCBaseActivity.d == null) {
                    return;
                }
                sCBaseActivity.d.a(this.f, "drug_refresh_header_coupon_info_module", hashMap);
            } catch (JSONException e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95fd8a1e237aea34db0f4194a4966b65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95fd8a1e237aea34db0f4194a4966b65");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        com.sankuai.waimai.store.order.a.e().b(this);
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01ac26ec6058003cbb91ad0ff270742", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01ac26ec6058003cbb91ad0ff270742");
        } else if (this.f == null || this.e == null || this.e.d == null) {
        } else {
            Map<String, Object> a = h.a(this.b);
            SCBaseActivity sCBaseActivity = (SCBaseActivity) this.e.d.getContext();
            if (sCBaseActivity != null) {
                try {
                    if (sCBaseActivity.d != null) {
                        sCBaseActivity.d.a(this.f, "poi_update_shopcart_account", a);
                    }
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                }
            }
        }
    }
}
