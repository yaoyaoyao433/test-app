package com.sankuai.waimai.store.poi.list.refactor.card.float_card;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.mach.SGCommonMachReportInfo;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.store.poi.list.newp.sg.a<PoiVerticalityDataResponse.FloatingData> {
    public static ChangeQuickRedirect a = null;
    private static final String k = "d";
    com.sankuai.waimai.store.mach.d i;
    String j;
    private SCBaseActivity l;
    private com.sankuai.waimai.mach.d m;
    private String n;
    private boolean o;
    private com.sankuai.waimai.store.mach.medhod.a p;
    private a q;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final void a(@NonNull a.C1279a c1279a) {
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final int b() {
        return -1;
    }

    public static /* synthetic */ void c(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "c340c06c4441530e4d4d4862eab6dfc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "c340c06c4441530e4d4d4862eab6dfc5");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(dVar.d);
        aVar.a(new c.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.d.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c310e1f4fc25df31eca929126974d25f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c310e1f4fc25df31eca929126974d25f");
                } else {
                    d.this.i.g();
                }
            }
        });
        com.sankuai.waimai.store.expose.v2.b.a().a(dVar.l, aVar);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final /* synthetic */ void a(@NonNull PoiVerticalityDataResponse.FloatingData floatingData) {
        Map hashMap;
        PoiVerticalityDataResponse.FloatingData floatingData2 = floatingData;
        Object[] objArr = {floatingData2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4f58edac34e9597f9323846df8f6685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4f58edac34e9597f9323846df8f6685");
            return;
        }
        final String str = floatingData2.templateId;
        final Map<String, Object> map = floatingData2.jsonData;
        Object[] objArr2 = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fc85ab2c199c83ee16fda631f6a6019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fc85ab2c199c83ee16fda631f6a6019");
        } else if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            hide();
        } else {
            this.n = str;
            this.i.a(this.j);
            show();
            a.C1015a c1015a = new a.C1015a();
            c1015a.c = str;
            c1015a.b = str;
            c1015a.d = this.j;
            c1015a.e = "supermarket";
            com.sankuai.waimai.mach.manager.load.a a2 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
            Object[] objArr3 = {map};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "652fc806807b24cda3078effa044cfe1", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap = (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "652fc806807b24cda3078effa044cfe1");
            } else {
                hashMap = new HashMap();
                hashMap.put("cat_id", Long.valueOf(this.c.c));
                hashMap.put("sub_category_code", this.c.f);
                hashMap.put("stid", this.c.T);
                hashMap.put("api_extra", this.c.S);
                hashMap.put("scheme_params", this.c.aA);
            }
            map.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap);
            this.i.a(a2, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.d.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr4 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "384b7f6365597f15ffe896932a5b6d8a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "384b7f6365597f15ffe896932a5b6d8a");
                        return;
                    }
                    d.this.i.a(eVar, map);
                    if (d.this.q != null) {
                        a unused = d.this.q;
                    }
                }

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                    Object[] objArr4 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3dd42ec31145e946fd4cacf8d20f6001", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3dd42ec31145e946fd4cacf8d20f6001");
                        return;
                    }
                    d.this.hide();
                    if (d.this.q != null) {
                        a unused = d.this.q;
                    }
                    SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(d.this.j);
                    sGCommonMachReportInfo.e = str;
                    sGCommonMachReportInfo.d = 4;
                    sGCommonMachReportInfo.i = bVar.a();
                    com.sankuai.waimai.store.util.mach.a.a(sGCommonMachReportInfo);
                }
            });
        }
    }

    public d(@NonNull SCBaseActivity sCBaseActivity, @NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad76a7b27b3a2c9da7f75a0afeea8db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad76a7b27b3a2c9da7f75a0afeea8db");
            return;
        }
        this.n = "";
        this.j = "";
        this.o = false;
        this.p = new com.sankuai.waimai.store.mach.medhod.a();
        this.l = sCBaseActivity;
        this.m = new com.sankuai.waimai.store.poi.list.logreport.c(this.c.G);
        this.i = new com.sankuai.waimai.store.mach.d(sCBaseActivity, sCBaseActivity.w()) { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "249882ef31440618450b8caf90f4e3e0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "249882ef31440618450b8caf90f4e3e0") : d.this.m;
            }
        };
        this.i.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b29fe61fa5c8e8494cb34ed597ca3b1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b29fe61fa5c8e8494cb34ed597ca3b1");
                    return;
                }
                super.e();
                if (d.this.q != null) {
                    a unused = d.this.q;
                }
            }
        });
        this.i.g = this.p;
        this.p.a("user_coupon_refrsh", new com.sankuai.waimai.store.poi.list.newp.methods.c());
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a390460723c43e0bb900689d76cd43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a390460723c43e0bb900689d76cd43");
            return;
        }
        super.onViewCreated();
        this.i.a(this.d, this.j, "supermarket");
        this.i.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.d.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "561348385d402611b75bef66197d70c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "561348385d402611b75bef66197d70c6");
                } else {
                    d.c(d.this);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593386eeef07ac595e4300a1ae80119c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593386eeef07ac595e4300a1ae80119c");
        } else {
            super.onResume();
        }
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95f262a66c8b27311068b40b165b6cef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95f262a66c8b27311068b40b165b6cef");
        } else if (this.i == null) {
        } else {
            this.i.b(str, map);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68a1dee3163333b97d2178392fdf26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68a1dee3163333b97d2178392fdf26e");
        } else {
            super.onDestroy();
        }
    }
}
