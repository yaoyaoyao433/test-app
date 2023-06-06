package com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.util.mach.SGCommonMachReportInfo;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private boolean b;
    private com.sankuai.waimai.store.mach.d c;
    private ViewGroup d;
    private SCBaseActivity e;
    private final com.sankuai.waimai.store.param.a f;
    private final ViewGroup g;
    private a.C1279a h;
    private a i;
    private com.sankuai.waimai.store.poi.list.logreport.c j;
    private com.sankuai.waimai.store.mach.medhod.a k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(String str, boolean z);
    }

    public static /* synthetic */ void b(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "8703571332c2d549c5251425ae34310c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "8703571332c2d549c5251425ae34310c");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(dVar.d);
        aVar.a(new c.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.d.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f14335bff3e7f17506904e601faa286e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f14335bff3e7f17506904e601faa286e");
                    return;
                }
                com.sankuai.shangou.stone.util.log.a.b("mach test#addExposeListener" + d.this.j.toString(), new Object[0]);
                d.this.c.g();
            }
        });
        com.sankuai.waimai.store.expose.v2.b.a().a(dVar.e, aVar);
    }

    private d(@NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup.getContext());
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c361f3330468dc0b5af13ce04e259cce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c361f3330468dc0b5af13ce04e259cce");
            return;
        }
        this.b = false;
        this.h = new a.C1279a();
        this.k = new com.sankuai.waimai.store.mach.medhod.a();
        this.g = viewGroup;
        this.f = aVar;
    }

    public d(@NonNull SCBaseActivity sCBaseActivity, @NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar, a aVar2) {
        this(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecf15f225df2322689170590badec1ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecf15f225df2322689170590badec1ed");
            return;
        }
        this.e = sCBaseActivity;
        this.i = aVar2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "966397d26a1c876f1f056bc2003f0c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "966397d26a1c876f1f056bc2003f0c7b");
            return;
        }
        this.c = new com.sankuai.waimai.store.mach.d(this.e, this.e.w()) { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "84f0482408d377e1682dcf99b5a0acc3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "84f0482408d377e1682dcf99b5a0acc3");
                }
                com.sankuai.shangou.stone.util.log.a.b("mach test#getLogReporter" + d.this.j.toString(), new Object[0]);
                return d.this.j;
            }
        };
        this.j = new com.sankuai.waimai.store.poi.list.logreport.c(this.f.G);
        this.c.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "00f850f1a85da73e9659c359ae007441", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "00f850f1a85da73e9659c359ae007441");
                } else {
                    d.b(d.this);
                }
            }
        });
        this.c.g = this.k;
        this.k.a("coupon_filter_click_event", new com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.jsevent.a(this.i));
    }

    public final void a(@NonNull BaseModuleDesc baseModuleDesc) {
        Map hashMap;
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "780b7ee8f7b31aee6fde00808564c8cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "780b7ee8f7b31aee6fde00808564c8cb");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e803ca61c156a8100c1f5422734438e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e803ca61c156a8100c1f5422734438e5");
        } else if (!this.b) {
            this.b = true;
            bindView(this.mInflater.inflate(R.layout.wm_sc_home_tile, this.g, false));
        }
        a.C1279a c1279a = this.h;
        Object[] objArr3 = {c1279a};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f7bad50d363cec3901d41c74364126dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f7bad50d363cec3901d41c74364126dd");
        } else {
            int a2 = c1279a.a(getContext());
            int b = c1279a.b(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
            if (a2 >= 0) {
                marginLayoutParams.topMargin = a2;
            }
            if (b >= 0) {
                marginLayoutParams.bottomMargin = b;
            }
            marginLayoutParams.width = -1;
            this.d.setLayoutParams(marginLayoutParams);
        }
        u.a(this.mView);
        try {
            this.c.a(this.d, String.format("sm_home_%s", baseModuleDesc.moduleId), this.e.t());
            Object obj = baseModuleDesc.moduleId;
            final String str = baseModuleDesc.templateId;
            final Map<String, Object> map = baseModuleDesc.jsonData;
            Object[] objArr4 = {obj, str, map};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d0d8bd8c343b2f9b712ff87d4d36db73", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d0d8bd8c343b2f9b712ff87d4d36db73");
                return;
            }
            if (map != null && !map.isEmpty() && !TextUtils.isEmpty(str)) {
                this.c.a(String.format("sm_home_%s", obj));
                a.C1015a c1015a = new a.C1015a();
                c1015a.c = str;
                c1015a.b = str;
                c1015a.d = String.format("sm_home_%s", obj);
                c1015a.e = this.e.t();
                com.sankuai.waimai.mach.manager.load.a a3 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c9235511040e288a19254956f3b1acea", RobustBitConfig.DEFAULT_VALUE)) {
                    hashMap = (Map) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c9235511040e288a19254956f3b1acea");
                } else {
                    hashMap = new HashMap();
                    hashMap.put("cat_id", Long.valueOf(this.f.c));
                    hashMap.put("sec_cat_id", this.f.f);
                    hashMap.put("api_stids", this.f.T);
                    hashMap.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
                    hashMap.put("scheme_params", this.f.aA);
                }
                map.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap);
                this.c.a(a3, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.d.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.container.c
                    public final void a(@NonNull @NotNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                        Object[] objArr6 = {eVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e018ba64912754139943230a326ed6ac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e018ba64912754139943230a326ed6ac");
                        } else {
                            d.this.c.a(eVar, map);
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.c
                    public final void a(@NonNull @NotNull com.sankuai.waimai.mach.manager.load.b bVar) {
                        Object[] objArr6 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3ca98ee7e34a824209c247ce4f64842a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3ca98ee7e34a824209c247ce4f64842a");
                            return;
                        }
                        SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(d.class.getSimpleName());
                        sGCommonMachReportInfo.e = str;
                        sGCommonMachReportInfo.d = 4;
                        sGCommonMachReportInfo.i = bVar.a();
                        com.sankuai.waimai.store.util.mach.a.a(sGCommonMachReportInfo);
                        d.this.hide();
                    }
                });
            }
        } catch (Exception e) {
            u.c(this.mView);
            com.sankuai.shangou.stone.util.log.a.a("%s", e.getMessage());
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae28a033753a48090f2594d702144573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae28a033753a48090f2594d702144573");
            return;
        }
        super.onViewCreated();
        this.d = (ViewGroup) this.mView.findViewById(R.id.fl_tile_container);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5489d50d6b46539d6baa5e8097660fd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5489d50d6b46539d6baa5e8097660fd0");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.mach.medhod.a aVar = this.k;
        Object[] objArr2 = {"coupon_filter_click_event"};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.mach.medhod.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d9f24836af81ae0fc04b9a75f2020901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d9f24836af81ae0fc04b9a75f2020901");
        } else {
            aVar.b.remove("coupon_filter_click_event");
        }
    }
}
