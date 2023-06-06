package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.touchmatrix.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class x extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "TMatrixInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c8011214ad252bf2b0d2c27a1c6c1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c8011214ad252bf2b0d2c27a1c6c1b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("waimai_homepage", "c_m84bv26");
        hashMap.put("waimai_membership", "c_vt3zp1ef");
        hashMap.put("waimai_order_list", "c_48pltlz");
        hashMap.put("waimai_mine", "c_ul2elkn");
        hashMap.put("waimai_subcategory", "c_i5kxn8l");
        hashMap.put("waimai_search_result", "c_nfqbfvw");
        hashMap.put("waimai_restaurant", "c_CijEL");
        hashMap.put("waimai_confirm_order", "c_ykhs39e");
        hashMap.put("waimai_order_status", "c_hgowsqb");
        hashMap.put("waimai_goods_detail", "c_u4fk4kw");
        a.C1348a c1348a = new a.C1348a("marketing_dsp_pop", hashMap);
        c1348a.h = "waimai";
        c1348a.b = new a.c() { // from class: com.sankuai.waimai.launcher.init.secondary.x.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.touchmatrix.a.c
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0a4064f4504e19ea7852f76c3c7ac1d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0a4064f4504e19ea7852f76c3c7ac1d");
                } else {
                    com.sankuai.waimai.foundation.router.a.a(com.sankuai.waimai.foundation.utils.activity.a.a().c(), str);
                }
            }

            @Override // com.sankuai.waimai.touchmatrix.a.c
            public final void a(String str, Bundle bundle) {
                Object[] objArr2 = {str, bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b81be2b64220818d8d8697679064f384", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b81be2b64220818d8d8697679064f384");
                } else {
                    com.sankuai.waimai.foundation.router.a.a(com.sankuai.waimai.foundation.utils.activity.a.a().c(), str, bundle);
                }
            }

            @Override // com.sankuai.waimai.touchmatrix.a.c
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a99e02a73f6dbd1f26ab3f599ce96515", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a99e02a73f6dbd1f26ab3f599ce96515");
                } else {
                    com.sankuai.waimai.foundation.router.a.a(com.sankuai.waimai.foundation.utils.activity.a.a().c(), str);
                }
            }
        };
        c1348a.f = new com.sankuai.waimai.touchmatrix.show.e() { // from class: com.sankuai.waimai.launcher.init.secondary.x.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.touchmatrix.show.e
            public final Mach.a a(Mach.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bf2d3e8bd59267378060c6df0420229", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Mach.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bf2d3e8bd59267378060c6df0420229");
                }
                aVar.a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.launcher.init.secondary.x.2.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
                    public final void httpRequest(String str, Map<String, String> map, rx.j<ap> jVar) {
                        Object[] objArr3 = {str, map, jVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8607ada13e4e8c2d25546e7acb78ea8b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8607ada13e4e8c2d25546e7acb78ea8b");
                        } else {
                            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str, map), jVar, "");
                        }
                    }
                });
                return aVar;
            }
        };
        com.sankuai.waimai.touchmatrix.a a2 = com.sankuai.waimai.touchmatrix.a.a();
        Object[] objArr2 = {"waimai", c1348a};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.touchmatrix.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "20d00a27ffc10cac4b997070585310ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "20d00a27ffc10cac4b997070585310ea");
            return;
        }
        a2.b.put("waimai", c1348a);
        com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(c1348a.d);
        com.sankuai.waimai.touchmatrix.rebuild.biz.a.a("waimai", c1348a.d);
        com.sankuai.waimai.touchmatrix.rebuild.biz.a.a(c1348a.j);
    }
}
