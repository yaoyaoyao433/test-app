package com.sankuai.waimai.globalcart.biz;

import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.globalcart.response.c;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.poi.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.GlobalCartBrief;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static a c;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
        if (r1 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.globalcart.biz.a r17, java.util.List r18) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.globalcart.biz.a.a
            java.lang.String r11 = "5d262e7694bc78bcd424399810d9b36a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r17
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r8, r1, r10, r9, r11)
            return
        L1e:
            java.lang.Object[] r8 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.globalcart.ab.a.a
            java.lang.String r11 = "b47c3e15c8e7bb9a4c556b31e4601e2a"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L3c
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L7a
        L3c:
            boolean r1 = com.sankuai.waimai.platform.capacity.abtest.c.a()
            if (r1 == 0) goto L79
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = com.sankuai.waimai.globalcart.ab.a.a
            java.lang.String r4 = "4298d601e4be40b16adfb56c31ef8d2c"
            r11 = 0
            r13 = 1
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            r10 = r1
            r12 = r3
            r14 = r4
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15)
            if (r5 == 0) goto L60
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r0, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L76
        L60:
            java.lang.String r1 = "wm_cartcheck_abtest"
            com.sankuai.waimai.foundation.core.service.abtest.ABStrategy r1 = com.sankuai.waimai.globalcart.ab.a.a(r1, r2)
            if (r1 == 0) goto L75
            java.lang.String r2 = "B"
            java.lang.String r1 = r1.expName
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L75
            r1 = 1
            goto L76
        L75:
            r1 = 0
        L76:
            if (r1 == 0) goto L79
            goto L7a
        L79:
            r0 = 0
        L7a:
            if (r0 == 0) goto L98
            boolean r0 = com.sankuai.waimai.foundation.utils.d.a(r18)
            if (r0 != 0) goto L98
            java.util.Iterator r0 = r18.iterator()
        L86:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r0.next()
            com.sankuai.waimai.globalcart.model.GlobalCart r1 = (com.sankuai.waimai.globalcart.model.GlobalCart) r1
            if (r1 == 0) goto L86
            r1.cancleAllCheck()
            goto L86
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.globalcart.biz.a.a(com.sankuai.waimai.globalcart.biz.a, java.util.List):void");
    }

    public static /* synthetic */ void b(a aVar, List list) {
        List<GlobalCart.g> list2;
        char c2 = 1;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a5cde9619ce39d3df0fdeb286cda8acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a5cde9619ce39d3df0fdeb286cda8acf");
        } else if (list == null || list.size() <= 0) {
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GlobalCart globalCart = (GlobalCart) it.next();
                if (globalCart != null && (list2 = globalCart.productList) != null && list2.size() > 0) {
                    String str = globalCart.poiIdStr;
                    b.a(globalCart.poiId, globalCart.poiIdStr);
                    com.sankuai.waimai.foundation.core.service.globalcart.b b2 = aVar.b(globalCart.getBizType());
                    if (b2 != null && b2.j(str) <= 0) {
                        int bizType = globalCart.getBizType();
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = str;
                        objArr2[c2] = Integer.valueOf(bizType);
                        objArr2[2] = list2;
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "77aaf4d8acadef58a7b76d453fc8c61a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "77aaf4d8acadef58a7b76d453fc8c61a");
                        } else {
                            com.sankuai.waimai.foundation.core.service.globalcart.b b3 = aVar.b(bizType);
                            if (b3 != null) {
                                b3.e(str, list2);
                            }
                        }
                    }
                    c2 = 1;
                }
            }
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "090fcab3db668b3a77e5ea4a8201dca4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "090fcab3db668b3a77e5ea4a8201dca4");
        }
        if (c == null) {
            c = new a();
        }
        return c;
    }

    public final void a(int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180debd99920ee18ad99eba6d16a1769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180debd99920ee18ad99eba6d16a1769");
        } else {
            a(1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d87a330acaedd2c9edda7fb7cb7ec01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d87a330acaedd2c9edda7fb7cb7ec01");
        } else if (i < 0 || GlobalCartManager.getInstance().isLocalCartDataEmpty()) {
        } else {
            final List<GlobalCartBrief> a2 = a(true, c());
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((GlobalCartApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) GlobalCartApi.class)).globalChangeStatus(a(a2)), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.globalcart.response.b>>() { // from class: com.sankuai.waimai.globalcart.biz.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f52e8c761809033e1cecb8284c5b5b23", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f52e8c761809033e1cecb8284c5b5b23");
                    } else if (baseResponse != null && baseResponse.code == 0 && baseResponse.data != 0) {
                        com.sankuai.waimai.globalcart.a.a().b(System.currentTimeMillis());
                        GlobalCartManager.getInstance().refreshPoiId(z, a2, ((com.sankuai.waimai.globalcart.response.b) baseResponse.data).a);
                    } else if (baseResponse == null || baseResponse.code != 1) {
                        a.this.a(i - 1, true);
                    } else {
                        if (z) {
                            GlobalCartManager.getInstance().reportCat(6);
                        } else {
                            GlobalCartManager.getInstance().reportCat(1);
                        }
                        if (UserCenter.getInstance(com.meituan.android.singleton.b.a).isLogin()) {
                            GlobalCartManager.getInstance().clearPoiShopCart();
                            a.this.b();
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5dc8c24676129ea25158c653c1fcdd1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5dc8c24676129ea25158c653c1fcdd1");
                        return;
                    }
                    a.this.a(i - 1, true);
                    if (z) {
                        GlobalCartManager.getInstance().reportCat(10);
                    }
                }
            }, "");
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03fd75a3ac7c0027d10a983ffca51e3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03fd75a3ac7c0027d10a983ffca51e3c");
            return;
        }
        final List<GlobalCartBrief> a2 = a(false, c());
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((GlobalCartApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) GlobalCartApi.class)).globalCartSync(a(c(), true)), new b.AbstractC1042b<BaseResponse<c>>() { // from class: com.sankuai.waimai.globalcart.biz.a.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d66cdca0a0fd2af48fbdd27291bc342e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d66cdca0a0fd2af48fbdd27291bc342e");
                } else if (baseResponse != null && baseResponse.data != 0) {
                    GlobalCartManager.getInstance().refreshPoiId(false, a2, ((c) baseResponse.data).c);
                    a.a(a.this, ((c) baseResponse.data).a);
                    a.b(a.this, ((c) baseResponse.data).a);
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "global_cart_is_new_user", ((c) baseResponse.data).d);
                    a.b = true;
                } else {
                    a.b = false;
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                a.b = false;
            }
        }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b, true);
    }

    private List<com.sankuai.waimai.globalcart.model.a> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9a720264c1b2c419f6dd1eb15a9b1b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9a720264c1b2c419f6dd1eb15a9b1b") : GlobalCartManager.getInstance().getLocalCartData();
    }

    private String a(List<com.sankuai.waimai.globalcart.model.a> list, boolean z) {
        Object[] objArr = {list, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43aeb7e792bd18c4212d2c995161a8e0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43aeb7e792bd18c4212d2c995161a8e0") : com.sankuai.waimai.globalcart.model.a.a(list, true).toString();
    }

    private String a(List<GlobalCartBrief> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56dde09ea0daad8f6ef867b7424d21d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56dde09ea0daad8f6ef867b7424d21d0");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("global_shopping_status_list", b(list));
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return jSONObject.toString();
    }

    private JSONArray b(List<GlobalCartBrief> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75298a5f2269586fdb9cee5d8f80718b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75298a5f2269586fdb9cee5d8f80718b");
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (GlobalCartBrief globalCartBrief : list) {
                if (globalCartBrief != null) {
                    jSONArray.put(globalCartBrief.toJson());
                }
            }
        }
        return jSONArray;
    }

    private List<GlobalCartBrief> a(boolean z, List<com.sankuai.waimai.globalcart.model.a> list) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d888f41506c412c729961a795791954", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d888f41506c412c729961a795791954");
        }
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
            for (com.sankuai.waimai.globalcart.model.a aVar : list) {
                if (aVar != null && !com.sankuai.waimai.foundation.utils.b.b(aVar.e)) {
                    arrayList.add(new GlobalCartBrief().fromPoiShopcart(aVar, z));
                }
            }
        }
        return arrayList;
    }

    private com.sankuai.waimai.foundation.core.service.globalcart.b b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f97cd7a35fb8503df24e76ffb55a4d16", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.foundation.core.service.globalcart.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f97cd7a35fb8503df24e76ffb55a4d16") : GlobalCartManager.getInstance().getOrderManager(i);
    }
}
