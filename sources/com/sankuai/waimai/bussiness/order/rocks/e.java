package com.sankuai.waimai.bussiness.order.rocks;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.platform.mach.tag.DynamicTagProcessor;
import com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil;
import com.sankuai.waimai.platform.mach.webpimage.WebpImageTagProcessor;
import com.sankuai.waimai.rocks.view.a;
import com.sankuai.waimai.rocks.view.mach.c;
import com.sankuai.waimai.rocks.view.mach.d;
import com.sankuai.waimai.rocks.view.recyclerview.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class e {
    public static ChangeQuickRedirect a;
    Rect b;
    public k c;
    private Context d;

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e098f9e137af7b415b80522f5f0abe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e098f9e137af7b415b80522f5f0abe");
            return;
        }
        this.d = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.b = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d534c785df56a03576257afffcf68535", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d534c785df56a03576257afffcf68535") : new Rect(0, 0, com.sankuai.waimai.foundation.utils.g.a(this.d), com.sankuai.waimai.foundation.utils.g.b(this.d));
        this.c = new k();
    }

    public final com.sankuai.waimai.rocks.view.a a(com.sankuai.waimai.rocks.view.block.c cVar, RecyclerView recyclerView, com.sankuai.waimai.rocks.view.recyclerview.footer.a aVar, Mach.d dVar, c.b bVar, b.a aVar2) {
        Object[] objArr = {cVar, recyclerView, aVar, dVar, bVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bccea28949239076def9a3810e71e66b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bccea28949239076def9a3810e71e66b");
        }
        a.C1132a c1132a = new a.C1132a("waimai");
        c1132a.k = "order_status";
        c1132a.c = this.d;
        c1132a.q = cVar;
        c1132a.d = a();
        c1132a.f = recyclerView;
        c1132a.r = new HashMap();
        c1132a.l = this.b;
        c1132a.g = this.c;
        c1132a.s = new com.sankuai.waimai.platform.rocks.b();
        c1132a.t = aVar;
        c1132a.m = true;
        c1132a.o = true;
        c1132a.n = true;
        c1132a.y = false;
        c1132a.w = dVar;
        c1132a.e = bVar;
        c1132a.h = aVar2;
        return c1132a.a();
    }

    private com.sankuai.waimai.rocks.view.mach.d a() {
        final String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed17f46346fe4ba9bffd52fa5cc1390", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed17f46346fe4ba9bffd52fa5cc1390");
        }
        final com.sankuai.waimai.bussiness.order.base.mach.a aVar = new com.sankuai.waimai.bussiness.order.base.mach.a("c_hgowsqb", AppUtil.generatePageInfoKey(this.d));
        if (this.d instanceof BaseActivity) {
            str = ((BaseActivity) this.d).w();
        } else {
            str = e.class.getSimpleName() + System.currentTimeMillis();
        }
        return new com.sankuai.waimai.rocks.view.mach.d(new d.a() { // from class: com.sankuai.waimai.bussiness.order.rocks.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.mach.d.a
            public final Mach.a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bee5ea761dd0de4177396067514fe3e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Mach.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bee5ea761dd0de4177396067514fe3e");
                }
                Mach.a aVar2 = new Mach.a();
                aVar2.b = e.this.d;
                aVar2.l = new a((Activity) e.this.d);
                aVar2.e = new com.sankuai.waimai.mach.c() { // from class: com.sankuai.waimai.bussiness.order.rocks.e.1.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.c
                    public final void a(c.a aVar3, com.sankuai.waimai.mach.k kVar) {
                        Object[] objArr3 = {aVar3, kVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0e3f8c12ba1fa8571c0f6e9f7f051cc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0e3f8c12ba1fa8571c0f6e9f7f051cc");
                        } else {
                            WmMachImageLoaderUtil.a(aVar3, kVar);
                        }
                    }
                };
                aVar2.d = aVar;
                Mach.a a2 = aVar2.a(new WebpImageTagProcessor()).a(new DynamicTagProcessor()).a(new ScrollerTagProcessor()).a(new SwiperTagProcessor()).a(new RocksOrderNativeModule(e.this.d));
                String str2 = str;
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.h.a;
                JSInvokeNativeMethod jSInvokeNativeMethod = null;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1d07ebd04492491ff3d883e19e52b19e", RobustBitConfig.DEFAULT_VALUE)) {
                    jSInvokeNativeMethod = (JSInvokeNativeMethod) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1d07ebd04492491ff3d883e19e52b19e");
                } else {
                    IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                    if (iOrderBusinessService != null) {
                        jSInvokeNativeMethod = iOrderBusinessService.getRocksSGHttpMethod(str2);
                    }
                }
                return a2.a(jSInvokeNativeMethod).a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.bussiness.order.rocks.e.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
                    public final void httpRequest(String str3, Map<String, String> map, rx.j<ap> jVar) {
                        Object[] objArr4 = {str3, map, jVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3bf291c88d300f88ec05762fa71a288e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3bf291c88d300f88ec05762fa71a288e");
                        } else {
                            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str3, map), jVar, str);
                        }
                    }
                }).a(new com.sankuai.waimai.platform.mach.statistics.d(e.this.d));
            }
        });
    }
}
