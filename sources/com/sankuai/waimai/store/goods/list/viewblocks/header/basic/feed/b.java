package com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.manager.coupon.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends h implements a.InterfaceC1222a, c.a {
    public static ChangeQuickRedirect c;
    private com.sankuai.waimai.store.goods.list.helper.b g;

    public b(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, BaseModuleDesc baseModuleDesc) {
        super(dVar, baseModuleDesc);
        Object[] objArr = {dVar, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf098207f073330ba136ef9237870b6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf098207f073330ba136ef9237870b6a");
            return;
        }
        Object[] objArr2 = {dVar, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "957da3eeab4e69ad708ef7092dd2ee99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "957da3eeab4e69ad708ef7092dd2ee99");
        } else if (baseModuleDesc == null || !TextUtils.equals(baseModuleDesc.templateId, "supermarket-poi-header-coupon-info")) {
        } else {
            com.sankuai.waimai.store.manager.coupon.c.a().a(this);
            com.sankuai.waimai.store.manager.coupon.a a = com.sankuai.waimai.store.manager.coupon.a.a();
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.manager.coupon.a.a;
            if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "ee9c0496784cc6eb22df42bad6e3d96d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "ee9c0496784cc6eb22df42bad6e3d96d");
            } else {
                a.b.add(this);
            }
            if (dVar.k() == null || dVar.d() == null) {
                return;
            }
            this.g = new com.sankuai.waimai.store.goods.list.helper.b(dVar.k(), dVar.d().f());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.h
    public final void a(BaseModuleDesc baseModuleDesc, int i, boolean z) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99faa5aa7e8615d592f827e64783dbcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99faa5aa7e8615d592f827e64783dbcd");
            return;
        }
        super.a(baseModuleDesc, i, z);
        a(baseModuleDesc);
    }

    private void a(BaseModuleDesc baseModuleDesc) {
        Poi.PoiCouponEntity poiCoupon;
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c5f5a6aefb308bd99dcc40feb6e4dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c5f5a6aefb308bd99dcc40feb6e4dc");
        } else if (baseModuleDesc != null && TextUtils.equals(baseModuleDesc.templateId, "supermarket-poi-header-coupon-info") && this.a != null && this.a.d() != null && this.a.d().b != null && (poiCoupon = this.a.d().b.getPoiCoupon()) != null && !com.sankuai.shangou.stone.util.a.b(poiCoupon.getPoiCouponItems())) {
            for (int i = 0; i < poiCoupon.getPoiCouponItems().size(); i++) {
                Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) com.sankuai.shangou.stone.util.a.a((List<Object>) poiCoupon.getPoiCouponItems(), i);
                if (poiCouponItem != null && poiCouponItem.couponShowType == 4 && this.g != null) {
                    this.g.a(poiCouponItem);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4750c9a7b7ea2e676e86c8d1723c92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4750c9a7b7ea2e676e86c8d1723c92");
        } else if (this.f == null || this.e.d == null || poiCouponItem == null) {
        } else {
            SCBaseActivity sCBaseActivity = (SCBaseActivity) this.e.d.getContext();
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("coupon_item", new JSONObject(com.sankuai.waimai.store.util.i.a(poiCouponItem) == null ? "" : com.sankuai.waimai.store.util.i.a(poiCouponItem)));
                if (sCBaseActivity == null || sCBaseActivity.d == null) {
                    return;
                }
                sCBaseActivity.d.a(this.f, "refresh_header_coupon_info_module", hashMap);
            } catch (JSONException e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.a.InterfaceC1222a
    public final void a(long j, String str, int i) {
        SCBaseActivity sCBaseActivity;
        Object[] objArr = {new Long(j), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10abeef36608a552a7b8555ffa9d26db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10abeef36608a552a7b8555ffa9d26db");
        } else if (this.f == null || this.e.d == null || this.a == null || this.a.d() == null || !com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.a.d().d(), str, this.a.d().f(), j) || (sCBaseActivity = (SCBaseActivity) this.e.d.getContext()) == null) {
        } else {
            try {
                sCBaseActivity.d.a(this.f, i == 1 ? "header_member_coupon_exchange_success_event" : "header_member_coupon_repeal_success_event", new HashMap());
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d3c77fb014bc379be8372a306866cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d3c77fb014bc379be8372a306866cf");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        com.sankuai.waimai.store.manager.coupon.a a = com.sankuai.waimai.store.manager.coupon.a.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.coupon.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "503339de178b39308b9f3e11c0fb1991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "503339de178b39308b9f3e11c0fb1991");
        } else {
            a.b.remove(this);
        }
    }
}
