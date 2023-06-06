package com.sankuai.waimai.store.goods.list.viewblocks.embed;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.mach.extension.nestedv2.e;
import com.sankuai.waimai.platform.mach.extension.nestedv2.f;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.SCSuperMarketActivity;
import com.sankuai.waimai.store.goods.list.mach.event.c;
import com.sankuai.waimai.store.goods.list.viewblocks.embed.b;
import com.sankuai.waimai.store.mach.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends d implements e, b.a {
    public static ChangeQuickRedirect a;
    public static final List<String> e = Arrays.asList("supermarket-poi-spu-card-A-tags", "supermarket-poi-spu-card-B-tags", "sg-common-embed-creator");
    public Map<String, Object> b;
    public b c;
    public String d;
    private boolean t;
    private boolean u;

    @Override // com.sankuai.waimai.platform.mach.extension.nestedv2.e
    public final void e() {
    }

    public a(com.sankuai.waimai.store.expose.v2.a aVar, String str) {
        super(aVar, str);
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e72880c47c172cbdd96a61ba160d69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e72880c47c172cbdd96a61ba160d69");
            return;
        }
        this.b = null;
        this.d = null;
        this.t = false;
        this.u = false;
        this.c = new b(this);
        a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.embed.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44bf435721be317a0b2fe8511e6da8c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44bf435721be317a0b2fe8511e6da8c2");
                } else {
                    a.this.r().post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.embed.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "734961db03f7be0665354dd708d93b57", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "734961db03f7be0665354dd708d93b57");
                            } else {
                                a.this.g();
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.mach.d
    public final com.sankuai.waimai.mach.d aZ_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ecc8d9f3b55f8e6b5fa813a7cfbb249", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ecc8d9f3b55f8e6b5fa813a7cfbb249");
        }
        return new com.sankuai.waimai.store.mach.logger.a(a(), a() instanceof SCBaseActivity ? ((SCBaseActivity) a()).b() : null);
    }

    @Override // com.sankuai.waimai.platform.mach.extension.nestedv2.e
    public final void a(ViewGroup viewGroup, com.sankuai.waimai.mach.manager.cache.e eVar, Map<String, Object> map, Map<String, Object> map2) {
        ArrayList arrayList;
        Object[] objArr = {viewGroup, eVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c9ee8604ec1700c940b4e66d66e5681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c9ee8604ec1700c940b4e66d66e5681");
            return;
        }
        this.b = map2;
        a(new com.sankuai.waimai.store.mach.clickhandler.a());
        a(viewGroup, "supermarketEmbed", "shangou");
        a(eVar, map);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34f4b2f19e1b4ec4c770a445b778110c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34f4b2f19e1b4ec4c770a445b778110c");
        } else {
            Activity a2 = a();
            if (this.b != null) {
                String valueOf = String.valueOf(this.b.get("poi_id"));
                if (com.sankuai.waimai.store.platform.domain.manager.poi.a.b(valueOf)) {
                    if (a2 != null && !com.sankuai.waimai.store.util.b.a(a2) && (a2 instanceof BaseActivity)) {
                        SCSuperMarketActivity sCSuperMarketActivity = (SCSuperMarketActivity) a2;
                        if ((sCSuperMarketActivity.h() instanceof com.sankuai.waimai.store.goods.list.delegate.d) && sCSuperMarketActivity.h() != null) {
                            this.d = sCSuperMarketActivity.h().l();
                            c cVar = new c();
                            cVar.a(new com.sankuai.waimai.store.goods.list.mach.event.a(sCSuperMarketActivity.h(), (BaseActivity) a2, valueOf)).a(new com.sankuai.waimai.store.goods.list.mach.event.b((BaseActivity) this.j, sCSuperMarketActivity.h().d())).a(new c() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.embed.a.3
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.goods.list.mach.event.c
                                public final List a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66a328bacd45394c667e0092207560e2", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66a328bacd45394c667e0092207560e2") : Arrays.asList("goods_detail_load_shopcart_account", "std_trigger_expose_event");
                                }

                                @Override // com.sankuai.waimai.store.goods.list.mach.event.c
                                public final void a(String str, Map<String, Object> map3) {
                                    Object[] objArr3 = {str, map3};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b78c059f61cf26096c45b66d3fc187d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b78c059f61cf26096c45b66d3fc187d");
                                    } else if ("goods_detail_load_shopcart_account".equals(str)) {
                                        a.this.c.ba_();
                                    } else if ("std_trigger_expose_event".equals(str)) {
                                        a.this.g();
                                    }
                                }
                            });
                            f().registerJsEventCallback(cVar.b());
                        }
                    }
                    Object obj = this.b.get("events");
                    if ((obj instanceof ArrayList) && (arrayList = (ArrayList) obj) != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if ("shopcart_food_update".equals(str)) {
                                this.t = true;
                            } else if ("coupon_update".equals(str)) {
                                this.u = true;
                            }
                        }
                    }
                }
            }
        }
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.embed.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8666408616b2abf176a49c3ab20ffcc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8666408616b2abf176a49c3ab20ffcc3");
                    return;
                }
                if (a.this.t) {
                    com.sankuai.waimai.store.order.a.e().a(a.this.c);
                }
                if (a.this.u) {
                    com.sankuai.waimai.store.manager.coupon.c.a().a(a.this.c);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "724503b0eda353c965d48509aa9b482d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "724503b0eda353c965d48509aa9b482d");
                    return;
                }
                try {
                    if (a.this.t) {
                        com.sankuai.waimai.store.order.a.e().b(a.this.c);
                    }
                    if (a.this.u) {
                        com.sankuai.waimai.store.manager.coupon.c.a().b(a.this.c);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.mach.extension.nestedv2.e
    public final void a_(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88827e343eb821b8f48001292b001201", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88827e343eb821b8f48001292b001201");
        } else {
            g();
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "868406ae5d4e848ca5ae91ce411986ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "868406ae5d4e848ca5ae91ce411986ff");
        } else if (!e.isEmpty() && f.a().a(e.get(0)) == null) {
            com.sankuai.waimai.platform.mach.extension.nestedv2.d dVar = new com.sankuai.waimai.platform.mach.extension.nestedv2.d() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.embed.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.extension.nestedv2.d
                public final e a(Activity activity, String str) {
                    Object[] objArr2 = {activity, str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4993cf506d4ea85c8473fa72fcffd3cf", RobustBitConfig.DEFAULT_VALUE)) {
                        return (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4993cf506d4ea85c8473fa72fcffd3cf");
                    }
                    if (activity instanceof com.sankuai.waimai.store.expose.v2.a) {
                        return new a((com.sankuai.waimai.store.expose.v2.a) activity, str);
                    }
                    return null;
                }
            };
            for (String str : e) {
                f.a().a(str, dVar);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.embed.b.a
    public final String c() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.embed.b.a
    public final Map<String, Object> d() {
        return this.b;
    }
}
