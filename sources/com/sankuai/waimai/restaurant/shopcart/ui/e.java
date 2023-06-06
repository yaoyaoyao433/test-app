package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.ShopCartMemberInfo;
import com.sankuai.waimai.mach.node.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    Activity b;
    com.sankuai.waimai.business.restaurant.base.manager.order.g c;
    com.sankuai.waimai.restaurant.shopcart.config.a d;
    ViewGroup e;
    ViewGroup f;
    View g;
    com.sankuai.waimai.restaurant.shopcart.ui.a h;
    int i;
    WeakReference<View> j;
    com.sankuai.waimai.platform.mach.a k;
    private p l;
    private boolean m;

    public e(Activity activity, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar, p pVar) {
        Object[] objArr = {activity, gVar, aVar, pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df49f185e2dff664d4f7d66948b7bec0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df49f185e2dff664d4f7d66948b7bec0");
            return;
        }
        this.b = activity;
        this.c = gVar;
        this.d = aVar;
        this.l = pVar;
        this.h = new com.sankuai.waimai.restaurant.shopcart.ui.a();
        this.k = new a(activity, null);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8073e26e702b2e60a13a5b360b3641a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8073e26e702b2e60a13a5b360b3641a8");
        } else if (!com.sankuai.waimai.foundation.core.lifecycle.b.a().a(this.b.hashCode())) {
            this.m = true;
        } else {
            h();
        }
    }

    private void h() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9228dedbeebddab7cd81274929c5c88c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9228dedbeebddab7cd81274929c5c88c");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.c.f());
        if (n != null && n.v != null && !TextUtils.isEmpty(n.v.memberFloatingLayerInfo)) {
            n.v.setSelfDelivery(this.c.k ? 1 : 0);
            try {
                str = new JSONObject(n.v.memberFloatingLayerInfo).optString("template_id");
            } catch (Exception unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(n.v.memberFloatingLayerInfo);
                a2.put("scroller_offset", Integer.valueOf(this.i));
                this.k.a(str, str, a2, 0, 0);
                return;
            }
            this.e.setVisibility(4);
            return;
        }
        this.e.setVisibility(4);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2262cfea1d9a1f7d597e78257b7bd50d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2262cfea1d9a1f7d597e78257b7bd50d");
        } else if (this.m) {
            h();
            this.m = false;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cd10c912cb59f7dac97fcbb912f9af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cd10c912cb59f7dac97fcbb912f9af");
        } else if (this.c.u() && !this.c.a()) {
            a();
        } else {
            this.e.setVisibility(4);
        }
    }

    public final void d() {
        com.sankuai.waimai.business.restaurant.base.shopcart.b n;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e11b076f9186a313a0a98bae1681c8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e11b076f9186a313a0a98bae1681c8e");
            return;
        }
        if (this.d.a() && (n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.c.f())) != null && n.v != null) {
            n.v = null;
            n.a(0.0d);
        }
        this.k.o();
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb8932e052d25150f506c7c59f42edb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb8932e052d25150f506c7c59f42edb");
            return;
        }
        this.e.setVisibility(0);
        this.f.post(new Runnable() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.e.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb2a9353c82eaa298de3baf739f1800c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb2a9353c82eaa298de3baf739f1800c");
                } else {
                    e.this.k.b();
                }
            }
        });
        this.l.a();
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "220c2c1fca5309056b9a1e838a3b2a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "220c2c1fca5309056b9a1e838a3b2a11");
            return;
        }
        this.e.setVisibility(4);
        if (this.k != null) {
            this.k.b("on_member_dialog_close", null);
        }
        this.l.b();
    }

    public final boolean g() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e762be16ec69b023ce8988b76b746e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e762be16ec69b023ce8988b76b746e")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85d139dec6acaa300bbd957fe02d302a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85d139dec6acaa300bbd957fe02d302a")).booleanValue();
        } else {
            z = this.e.getVisibility() == 0;
        }
        if (z) {
            f();
            return true;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.platform.mach.a {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.platform.mach.a
        public final boolean a() {
            return false;
        }

        public a(Activity activity, String str) {
            super(activity, null);
            Object[] objArr = {e.this, activity, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f5c74d1e453057cf776024343d3df2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f5c74d1e453057cf776024343d3df2");
            } else {
                a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.e.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7af84a8dec91fcc251b47c48305390b4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7af84a8dec91fcc251b47c48305390b4");
                        } else {
                            e.this.f();
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "986e18ee00f5aa8edf1616f5636fc793", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "986e18ee00f5aa8edf1616f5636fc793");
                        } else {
                            e.this.f();
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc8d8c2789f3916ad323b39ccc237e80", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc8d8c2789f3916ad323b39ccc237e80");
                        } else {
                            e.this.f();
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1d0d2262b5a1cfc9db0861c47b197f0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1d0d2262b5a1cfc9db0861c47b197f0");
                        } else {
                            super.d();
                        }
                    }
                });
            }
        }

        @Override // com.sankuai.waimai.platform.mach.a
        public final com.sankuai.waimai.mach.d d() {
            String str;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80b3f9cb11c4e90a1e820876f9a7b3b", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80b3f9cb11c4e90a1e820876f9a7b3b");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "625a418b47fdd184608ecbab1c767c5e", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "625a418b47fdd184608ecbab1c767c5e");
            } else {
                str = "";
                if (e.this.d.a()) {
                    str = "c_CijEL";
                } else if (e.this.d.b()) {
                    str = "c_u4fk4kw";
                } else if (e.this.d.e()) {
                    str = "c_1b9anm4";
                } else if (e.this.d.d()) {
                    str = "c_5y4tc0m";
                }
            }
            return new com.sankuai.waimai.platform.dynamic.b(str, AppUtil.generatePageInfoKey(this.j));
        }

        @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
        public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
            ShopCartMemberInfo.MemberVpParam memberVpParam;
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70973fab717539dc0ed88c9be008fda4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70973fab717539dc0ed88c9be008fda4");
            } else if ("toast".equals(str)) {
            } else {
                if ("save_scroller_offset".equals(str)) {
                    try {
                        e.this.i = ((Long) map.get("scroller_offset")).intValue();
                        return;
                    } catch (Exception unused) {
                        e.this.i = 0;
                        return;
                    }
                }
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "388a2befdf721c1d7729b2e803aac0fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "388a2befdf721c1d7729b2e803aac0fe");
                    return;
                }
                List<ShopCartMemberInfo.ProductParam> b = b(map);
                if (com.sankuai.waimai.foundation.utils.d.a(b)) {
                    memberVpParam = null;
                } else {
                    memberVpParam = new ShopCartMemberInfo.MemberVpParam();
                    memberVpParam.productParams = b;
                }
                com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(e.this.c.f());
                if (n != null && n.v != null) {
                    n.v.setSelfDelivery(e.this.c.k ? 1 : 0);
                    n.v.setMemberVpParam(memberVpParam);
                }
                Object obj = map == null ? null : map.get("machClickTag");
                final String obj2 = obj != null ? obj.toString() : null;
                final View[] viewArr = new View[1];
                if (!TextUtils.isEmpty(obj2)) {
                    com.sankuai.waimai.mach.node.a.a(l(), new a.InterfaceC1019a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.e.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                        public final void a(com.sankuai.waimai.mach.node.a aVar) {
                            Object[] objArr3 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19bb87d26e085ac8e9c1db6daa896e1a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19bb87d26e085ac8e9c1db6daa896e1a");
                            } else if (aVar.h().containsKey("mach-click-tag") && obj2.equals(aVar.h().get("mach-click-tag"))) {
                                viewArr[0] = aVar.g();
                            }
                        }
                    });
                }
                com.sankuai.waimai.business.restaurant.base.manager.order.k.a().b(e.this.c.f(), new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.e.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "08288338649d0e6d428a346b04005a26", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "08288338649d0e6d428a346b04005a26");
                        }
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "931763ad8998b2785494fcbf4cd1410d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "931763ad8998b2785494fcbf4cd1410d");
                        } else if (viewArr[0] != null) {
                            e.this.h.a(e.this.b, viewArr[0], e.this.j == null ? null : e.this.j.get(), (ViewGroup) e.this.b.getWindow().getDecorView());
                        }
                    }
                });
            }
        }

        private List<ShopCartMemberInfo.ProductParam> b(@Nullable Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ad587660b8ae0a7017866fd887373f", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ad587660b8ae0a7017866fd887373f");
            }
            try {
                List<Map> list = (List) map.get("params");
                if (com.sankuai.waimai.foundation.utils.d.a(list)) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Map map2 : list) {
                    ShopCartMemberInfo.ProductParam productParam = new ShopCartMemberInfo.ProductParam();
                    productParam.productId = (String) map2.get("product_id");
                    productParam.selected = ((Boolean) map2.get(DMKeys.KEY_SELECTED)).booleanValue() ? 1 : 0;
                    if (map2.containsKey("product_type")) {
                        productParam.type = ((Long) map2.get("product_type")).intValue();
                    }
                    arrayList.add(productParam);
                }
                return arrayList;
            } catch (Exception unused) {
                return Collections.emptyList();
            }
        }
    }
}
