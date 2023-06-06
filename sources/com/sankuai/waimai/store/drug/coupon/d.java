package com.sankuai.waimai.store.drug.coupon;

import android.app.Dialog;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.drug.coupon.a;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberCouponStatusResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a.b {
    public static ChangeQuickRedirect c;

    public d(a.InterfaceC1146a interfaceC1146a) {
        super(interfaceC1146a);
        Object[] objArr = {interfaceC1146a};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fba486f33283b9793d73ffa0393df7ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fba486f33283b9793d73ffa0393df7ee");
        }
    }

    private void a(final long j, final String str, final String str2, final Dialog dialog, final int i, final List<com.sankuai.waimai.store.drug.coupon.model.a> list) {
        Object[] objArr = {new Long(j), str, str2, dialog, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "986baa8390ce911fc98012d87db2490e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "986baa8390ce911fc98012d87db2490e");
            return;
        }
        j<DrugMemberCouponStatusResponse> jVar = new j<DrugMemberCouponStatusResponse>() { // from class: com.sankuai.waimai.store.drug.coupon.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(DrugMemberCouponStatusResponse drugMemberCouponStatusResponse) {
                DrugMemberCouponStatusResponse drugMemberCouponStatusResponse2 = drugMemberCouponStatusResponse;
                Object[] objArr2 = {drugMemberCouponStatusResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbbc5e7dad1e41c20f4bf4787f1855d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbbc5e7dad1e41c20f4bf4787f1855d0");
                } else if (drugMemberCouponStatusResponse2.cardInfo != null) {
                    d.this.b.a(j, str, drugMemberCouponStatusResponse2, list, i, str2);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b3ff948cd071c61a0bcc04f9627ee89", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b3ff948cd071c61a0bcc04f9627ee89");
                } else {
                    d.this.b.a();
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf28fd3841edfad83e4acc2418f16fbb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf28fd3841edfad83e4acc2418f16fbb");
                } else {
                    d.this.b.a(bVar.b, dialog);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff5b7a4cef4e8b144520fe0a673e5072", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff5b7a4cef4e8b144520fe0a673e5072");
                } else {
                    d.this.b.b();
                }
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11f5393b092b0ed444ba14334931436d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11f5393b092b0ed444ba14334931436d")).booleanValue() : com.sankuai.waimai.store.config.d.h().a("marketingc/cardBindPop", true)) {
            com.sankuai.waimai.store.drug.base.net.b.a(str2).a(j, str, jVar);
        } else {
            com.sankuai.waimai.store.drug.base.net.c.a(str2).a(j, str, jVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.coupon.a.b
    public final void a(long j, String str, String str2, Dialog dialog, int i, Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {new Long(j), str, str2, dialog, Integer.valueOf(i), poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96559c3b404d7d54a91da95513fd9451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96559c3b404d7d54a91da95513fd9451");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (poiCouponItem != null) {
            arrayList.add(new com.sankuai.waimai.store.drug.coupon.model.a(poiCouponItem));
        }
        a(j, str, str2, dialog, i, arrayList);
    }

    @Override // com.sankuai.waimai.store.drug.coupon.a.b
    public final void a(long j, String str, String str2, Dialog dialog, int i, String str3) {
        Object[] objArr = {new Long(j), str, str2, null, 3, str3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f9c9ef2f4861ba3bf971b233bcf16a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f9c9ef2f4861ba3bf971b233bcf16a7");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str3)) {
            try {
                JSONArray optJSONArray = new JSONObject(str3).optJSONArray("vipCouponInfoList");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                        if (jSONObject != null) {
                            com.sankuai.waimai.store.drug.coupon.model.a aVar = new com.sankuai.waimai.store.drug.coupon.model.a();
                            aVar.b = jSONObject.optLong("couponId");
                            aVar.a = jSONObject.optLong("activityId");
                            arrayList.add(aVar);
                        }
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
        a(j, str, str2, (Dialog) null, 3, arrayList);
    }
}
