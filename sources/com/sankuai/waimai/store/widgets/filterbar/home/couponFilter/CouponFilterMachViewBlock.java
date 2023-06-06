package com.sankuai.waimai.store.widgets.filterbar.home.couponFilter;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.im.c;
import com.sankuai.waimai.store.mach.d;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.methods.h;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.util.mach.SGCommonMachReportInfo;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CouponFilterMachViewBlock extends com.sankuai.waimai.store.poi.list.newp.sg.a<BaseModuleDesc> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.mach.medhod.a i;
    public b j;
    private d k;
    private SCBaseActivity l;
    private com.sankuai.waimai.mach.d m;
    private boolean n;
    private String o;
    private boolean p;
    private c.a q;
    private a r;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(Map<String, Object> map);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final void a(@NonNull a.C1279a c1279a) {
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final int b() {
        return -1;
    }

    public static /* synthetic */ boolean a(CouponFilterMachViewBlock couponFilterMachViewBlock, boolean z) {
        couponFilterMachViewBlock.n = true;
        return true;
    }

    public static /* synthetic */ void c(CouponFilterMachViewBlock couponFilterMachViewBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, couponFilterMachViewBlock, changeQuickRedirect, false, "beb2b326f29be5c989781a9e39a1c5f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, couponFilterMachViewBlock, changeQuickRedirect, false, "beb2b326f29be5c989781a9e39a1c5f4");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(couponFilterMachViewBlock.d);
        aVar.a(new c.a() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.couponFilter.CouponFilterMachViewBlock.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92e992c8a90b26ff94185fd9f3d30ed2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92e992c8a90b26ff94185fd9f3d30ed2");
                    return;
                }
                CouponFilterMachViewBlock.this.k.g();
                CouponFilterMachViewBlock.a(CouponFilterMachViewBlock.this, true);
            }
        });
        com.sankuai.waimai.store.expose.v2.b.a().a(couponFilterMachViewBlock.l, aVar);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final /* synthetic */ void a(@NonNull BaseModuleDesc baseModuleDesc) {
        Map map;
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        Object[] objArr = {baseModuleDesc2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae2111a4916f4a5c665fae736195228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae2111a4916f4a5c665fae736195228");
            return;
        }
        this.n = false;
        baseModuleDesc2.moduleId = "coupon_filter_mach";
        String str = baseModuleDesc2.moduleId;
        final String str2 = baseModuleDesc2.templateId;
        final Map<String, Object> map2 = baseModuleDesc2.jsonData;
        Object[] objArr2 = {str, str2, map2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c209d0f41c2c598eb6978998249bb1ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c209d0f41c2c598eb6978998249bb1ce");
        } else if (map2 == null || map2.isEmpty() || TextUtils.isEmpty(str2)) {
            hide();
        } else {
            this.o = str2;
            this.k.a(String.format("sm_home_%s", str));
            show();
            a.C1015a c1015a = new a.C1015a();
            c1015a.c = str2;
            c1015a.b = str2;
            c1015a.d = String.format("sm_home_%s", str);
            c1015a.e = "supermarket";
            com.sankuai.waimai.mach.manager.load.a a2 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
            Object[] objArr3 = {map2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a3f080bf5bd59206162f41814e300726", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a3f080bf5bd59206162f41814e300726");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("cat_id", Long.valueOf(this.c.c));
                hashMap.put("sub_category_code", this.c.f);
                hashMap.put("stid", this.c.T);
                hashMap.put("api_extra", this.c.S);
                hashMap.put("selected_id", this.c.o());
                hashMap.put("is_float", Integer.valueOf(this.p ? 1 : 0));
                hashMap.put("scheme_params", this.c.aA);
                map = hashMap;
            }
            map2.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, map);
            this.k.a(a2, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.couponFilter.CouponFilterMachViewBlock.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull e eVar) {
                    Object[] objArr4 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d9ab009fb741306cf9a4deeac7419dab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d9ab009fb741306cf9a4deeac7419dab");
                        return;
                    }
                    CouponFilterMachViewBlock.this.k.a(eVar, map2);
                    if (CouponFilterMachViewBlock.this.r != null) {
                        a unused = CouponFilterMachViewBlock.this.r;
                    }
                }

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                    Object[] objArr4 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "92e142c2f2ef07dcd17dd8149f6f7fa8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "92e142c2f2ef07dcd17dd8149f6f7fa8");
                        return;
                    }
                    CouponFilterMachViewBlock.this.hide();
                    if (CouponFilterMachViewBlock.this.r != null) {
                        a unused = CouponFilterMachViewBlock.this.r;
                    }
                    SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(CouponFilterMachViewBlock.class.getSimpleName());
                    sGCommonMachReportInfo.e = str2;
                    sGCommonMachReportInfo.d = 4;
                    sGCommonMachReportInfo.i = bVar.a();
                    com.sankuai.waimai.store.util.mach.a.a(sGCommonMachReportInfo);
                }
            });
        }
    }

    public CouponFilterMachViewBlock(@NonNull SCBaseActivity sCBaseActivity, @NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed87ac38f36cc9f799ade5046fe94f5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed87ac38f36cc9f799ade5046fe94f5e");
            return;
        }
        this.n = false;
        this.o = "";
        this.p = false;
        this.i = new com.sankuai.waimai.store.mach.medhod.a();
        this.q = new c.a() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.couponFilter.CouponFilterMachViewBlock.4
        };
        this.l = sCBaseActivity;
        this.m = new com.sankuai.waimai.store.poi.list.logreport.c(this.c.G);
        this.k = new d(sCBaseActivity, sCBaseActivity.w()) { // from class: com.sankuai.waimai.store.widgets.filterbar.home.couponFilter.CouponFilterMachViewBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77ff651c43e1ae702b5c44e38d90bcbf", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77ff651c43e1ae702b5c44e38d90bcbf") : CouponFilterMachViewBlock.this.m;
            }
        };
        this.k.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.couponFilter.CouponFilterMachViewBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4aa73b11655cf6157528e1ac559e9862", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4aa73b11655cf6157528e1ac559e9862");
                    return;
                }
                super.e();
                if (CouponFilterMachViewBlock.this.r != null) {
                    a unused = CouponFilterMachViewBlock.this.r;
                }
            }
        });
        this.k.g = this.i;
        this.i.a("selectActivityFilter", new h(this.j));
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdfed7500d2dff543870599ffa45c7f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdfed7500d2dff543870599ffa45c7f1");
            return;
        }
        super.onViewCreated();
        this.k.a(this.d, "sm_home_%s", "supermarket");
        this.k.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.couponFilter.CouponFilterMachViewBlock.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c52af1ef63678ec9206ce2beb2171f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c52af1ef63678ec9206ce2beb2171f0");
                } else {
                    CouponFilterMachViewBlock.c(CouponFilterMachViewBlock.this);
                }
            }
        });
        try {
            com.meituan.android.bus.a.a().a(this);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7c555c5a494f3cdee3cb8408e6d9ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7c555c5a494f3cdee3cb8408e6d9ac9");
        } else {
            super.onResume();
        }
    }

    @Subscribe
    public void onCategoryBackgroundChanged(com.sankuai.waimai.store.widgets.filterbar.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b836a79535904f7335f393de2cadef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b836a79535904f7335f393de2cadef0");
        } else if (aVar == null || aVar.c != System.identityHashCode(this.mView.getContext())) {
        } else {
            this.p = aVar.a;
            HashMap hashMap = new HashMap();
            hashMap.put("is_float", Integer.valueOf(this.p ? 1 : 0));
            Object[] objArr2 = {"sync_float_status_from_native", hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "636e307359dc138b2e25af58ecd0f695", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "636e307359dc138b2e25af58ecd0f695");
            } else if (this.k == null) {
            } else {
                this.k.b("sync_float_status_from_native", hashMap);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a1f4e59559324a131909fd2037ac8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a1f4e59559324a131909fd2037ac8e");
            return;
        }
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
    }
}
