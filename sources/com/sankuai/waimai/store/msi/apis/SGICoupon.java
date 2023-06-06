package com.sankuai.waimai.store.msi.apis;

import android.app.Activity;
import android.content.Context;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.msi.api.extension.sgc.coupon.AddCouponStateChangeListenerParam;
import com.meituan.msi.api.extension.sgc.coupon.ICoupon;
import com.meituan.msi.api.extension.sgc.coupon.OnCouponStateChangeResponse;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.event.HeaderMemberCouponRefreshSuccessEvent;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.msi.listener.a;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGICoupon extends ICoupon {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.coupon.ICoupon
    public final void a(MsiCustomContext msiCustomContext, AddCouponStateChangeListenerParam addCouponStateChangeListenerParam, final j<OnCouponStateChangeResponse> jVar) {
        Object[] objArr = {msiCustomContext, addCouponStateChangeListenerParam, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d3d830803d6a7df19d221fb8703082b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d3d830803d6a7df19d221fb8703082b");
        } else if (a.a(msiCustomContext)) {
        } else {
            final c.a aVar = new c.a() { // from class: com.sankuai.waimai.store.msi.apis.SGICoupon.1
                public static ChangeQuickRedirect a;

                @Subscribe
                public void onHeaderMemberCouponRefreshSuccess(HeaderMemberCouponRefreshSuccessEvent headerMemberCouponRefreshSuccessEvent) {
                    Object[] objArr2 = {headerMemberCouponRefreshSuccessEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "909eda71c6996ba9c2052fc427a34b8e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "909eda71c6996ba9c2052fc427a34b8e");
                        return;
                    }
                    OnCouponStateChangeResponse onCouponStateChangeResponse = new OnCouponStateChangeResponse();
                    onCouponStateChangeResponse.state = "member-coupon-receive";
                    onCouponStateChangeResponse.data = headerMemberCouponRefreshSuccessEvent;
                    jVar.a(onCouponStateChangeResponse);
                }

                @Override // com.sankuai.waimai.store.manager.coupon.c.a
                public final void a(Poi.PoiCouponItem poiCouponItem) {
                    Object[] objArr2 = {poiCouponItem};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14a98e94cc88719afac52121a126eb2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14a98e94cc88719afac52121a126eb2c");
                        return;
                    }
                    OnCouponStateChangeResponse onCouponStateChangeResponse = new OnCouponStateChangeResponse();
                    onCouponStateChangeResponse.data = poiCouponItem;
                    onCouponStateChangeResponse.state = "change";
                    onCouponStateChangeResponse.poi_id = String.valueOf(poiCouponItem.poiId);
                    jVar.a(onCouponStateChangeResponse);
                }
            };
            final boolean optBoolean = new JSONObject((Map) addCouponStateChangeListenerParam.filter_data).optBoolean("anchor", false);
            final Object obj = optBoolean ? new Object() { // from class: com.sankuai.waimai.store.msi.apis.SGICoupon.2
                public static ChangeQuickRedirect a;

                @Subscribe(threadMode = ThreadMode.MAIN)
                public void onAnchorSecondCategoryEvent(com.sankuai.waimai.store.coupons.event.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3cb77cf4bf9498da4db6d800b475270", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3cb77cf4bf9498da4db6d800b475270");
                        return;
                    }
                    OnCouponStateChangeResponse onCouponStateChangeResponse = new OnCouponStateChangeResponse();
                    HashMap hashMap = new HashMap();
                    hashMap.put("category_code", aVar2.a);
                    onCouponStateChangeResponse.data = hashMap;
                    onCouponStateChangeResponse.state = "anchor";
                    onCouponStateChangeResponse.poi_id = "0";
                    jVar.a(onCouponStateChangeResponse);
                }
            } : null;
            com.sankuai.waimai.store.msi.listener.a.a((Context) msiCustomContext.getActivity()).a(msiCustomContext.getActivity(), new a.c() { // from class: com.sankuai.waimai.store.msi.apis.SGICoupon.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.msi.listener.a.c
                public final void a(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "febdae98086b37e948c25333d0927af3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "febdae98086b37e948c25333d0927af3");
                        return;
                    }
                    c.a().a(aVar);
                    if (optBoolean) {
                        com.meituan.android.bus.a.a().a(obj);
                    }
                    com.meituan.android.bus.a.a().a(aVar);
                }

                @Override // com.sankuai.waimai.store.msi.listener.a.c
                public final void b(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3e63316e4b10f4d646a4236f518cfc2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3e63316e4b10f4d646a4236f518cfc2");
                        return;
                    }
                    c.a().b(aVar);
                    if (optBoolean) {
                        com.meituan.android.bus.a.a().b(obj);
                    }
                    com.meituan.android.bus.a.a().b(aVar);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    @Override // com.meituan.msi.api.extension.sgc.coupon.ICoupon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.msi.bean.MsiCustomContext r18, com.meituan.msi.api.extension.sgc.coupon.NotifyNativeCouponStateChangeParam r19, com.meituan.msi.api.i<com.meituan.msi.bean.EmptyResponse> r20) {
        /*
            r17 = this;
            r8 = r17
            r0 = r19
            r9 = r20
            r1 = 3
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r11 = 0
            r10[r11] = r18
            r12 = 1
            r10[r12] = r0
            r13 = 2
            r10[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r14 = com.sankuai.waimai.store.msi.apis.SGICoupon.b
            java.lang.String r6 = "25747a87c05a66d56d06e841a2e6fea5"
            r4 = 0
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r10
            r2 = r17
            r3 = r14
            r5 = r6
            r12 = r6
            r6 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2a
            com.meituan.robust.PatchProxy.accessDispatch(r10, r8, r14, r11, r12)
            return
        L2a:
            java.lang.String r1 = "change"
            java.lang.String r2 = r0.state
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb4
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.Object r0 = r0.data
            java.util.Map r0 = (java.util.Map) r0
            r1.<init>(r0)
            java.lang.String r0 = "coupon_item_json"
            java.lang.String r10 = r1.optString(r0)
            java.lang.String r0 = "extra"
            org.json.JSONObject r0 = r1.optJSONObject(r0)
            java.lang.String r1 = "store_header"
            if (r0 == 0) goto L59
            java.lang.String r2 = "from_page"
            java.lang.String r0 = r0.getString(r2)     // Catch: org.json.JSONException -> L55
            goto L5a
        L55:
            r0 = move-exception
            r0.printStackTrace()
        L59:
            r0 = r1
        L5a:
            java.lang.Class<com.sankuai.waimai.store.platform.domain.core.poi.Poi$PoiCouponItem> r1 = com.sankuai.waimai.store.platform.domain.core.poi.Poi.PoiCouponItem.class
            java.lang.Object r1 = com.sankuai.waimai.store.util.i.a(r10, r1)
            r12 = r1
            com.sankuai.waimai.store.platform.domain.core.poi.Poi$PoiCouponItem r12 = (com.sankuai.waimai.store.platform.domain.core.poi.Poi.PoiCouponItem) r12
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r11] = r10
            r1 = 1
            r13[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = com.sankuai.waimai.store.msi.apis.SGICoupon.b
            java.lang.String r6 = "19d95ee031288dcc563df86df4aa2942"
            r4 = 0
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r13
            r2 = r17
            r3 = r14
            r5 = r6
            r11 = r6
            r6 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L83
            r1 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r8, r14, r1, r11)
            goto La8
        L83:
            boolean r1 = com.sankuai.shangou.stone.util.t.a(r10)
            if (r1 != 0) goto La8
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "action"
            java.lang.String r3 = "flashbuy-receive-coupon-from-KNB-Action"
            r1.put(r2, r3)     // Catch: java.lang.Exception -> La1
            java.lang.String r2 = "coupon_item_json_str"
            r1.put(r2, r10)     // Catch: java.lang.Exception -> La1
            java.lang.String r2 = "source"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> La1
            goto La5
        La1:
            r0 = move-exception
            r0.printStackTrace()
        La5:
            com.dianping.titans.js.JsHandlerFactory.publish(r1)
        La8:
            android.app.Activity r0 = r18.getActivity()
            com.sankuai.waimai.store.msi.apis.SGICoupon$4 r1 = new com.sankuai.waimai.store.msi.apis.SGICoupon$4
            r1.<init>()
            com.sankuai.waimai.store.msi.view.b.a(r0, r1)
        Lb4:
            com.meituan.msi.bean.EmptyResponse r0 = com.meituan.msi.bean.EmptyResponse.INSTANCE
            r9.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.msi.apis.SGICoupon.a(com.meituan.msi.bean.MsiCustomContext, com.meituan.msi.api.extension.sgc.coupon.NotifyNativeCouponStateChangeParam, com.meituan.msi.api.i):void");
    }
}
