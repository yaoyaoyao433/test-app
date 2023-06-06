package com.sankuai.waimai.business.page.home.list.future.ad;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.MidAdBanner;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a<MidAdBanner> {
    public static ChangeQuickRedirect o;
    public static com.sankuai.waimai.mach.recycler.b p = new com.sankuai.waimai.mach.recycler.b("waimai");
    public static Boolean r;
    public com.sankuai.waimai.pouch.a q;
    private PouchDynamicAd s;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.viewmodel.a
    /* renamed from: n */
    public PouchDynamicAd f() {
        MidAdBanner midAdBanner;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7825746dd3735608761d0c70a2bf1876", RobustBitConfig.DEFAULT_VALUE)) {
            return (PouchDynamicAd) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7825746dd3735608761d0c70a2bf1876");
        }
        if (e() == null) {
            return null;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a161fc2fecabcbd27c4a6f1fb690df6", RobustBitConfig.DEFAULT_VALUE)) {
            return (PouchDynamicAd) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a161fc2fecabcbd27c4a6f1fb690df6");
        }
        if (!TextUtils.isEmpty(e().stringData)) {
            midAdBanner = e();
        } else {
            if (this.s == null) {
                this.s = new e().a(e());
            }
            midAdBanner = this.s;
            z = true;
        }
        if (z && midAdBanner != null) {
            com.sankuai.waimai.report.c.a().a("pouch_api_data_type_result", Collections.singletonList(Float.valueOf(1.0f))).a("business_name", midAdBanner.businessName).a("template_id", midAdBanner.adTemplateId).a();
        }
        return midAdBanner;
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void a() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a387a13cb663493bf18d6a234acf1778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a387a13cb663493bf18d6a234acf1778");
            return;
        }
        super.a();
        if (r == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ad.gray.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cb9516161f1a417b1c8daf094b61bace", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cb9516161f1a417b1c8daf094b61bace")).booleanValue();
            } else {
                String str = "homepage_platinum_prerender_waimai";
                if (com.sankuai.waimai.foundation.core.a.e()) {
                    str = "homepage_platinum_prerender_mt";
                } else if (com.sankuai.waimai.foundation.core.a.f()) {
                    str = "homepage_platinum_prerender_dp";
                }
                ABStrategy a = com.sankuai.waimai.ad.gray.c.a(str, null);
                z = a != null && TextUtils.equals("A", a.expName);
            }
            r = Boolean.valueOf(z);
        }
        com.sankuai.waimai.foundation.utils.log.a.b("PlatinumBannerRocksVM", "shouldPreRender:" + r, new Object[0]);
        if (r.booleanValue()) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = o;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dce2d9a867efb7363fa30269ec702f87", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dce2d9a867efb7363fa30269ec702f87");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("PlatinumBannerRocksVM", "try pre render", new Object[0]);
            if (!(this.d instanceof Activity)) {
                com.sankuai.waimai.foundation.utils.log.a.e("PlatinumBannerRocksVM", "context invalid", new Object[0]);
                return;
            }
            PouchDynamicAd f = f();
            if (f == null) {
                com.sankuai.waimai.foundation.utils.log.a.e("PlatinumBannerRocksVM", "data is null", new Object[0]);
                return;
            }
            com.sankuai.waimai.pouch.model.c cVar = new com.sankuai.waimai.pouch.model.c();
            cVar.f = "waimai";
            cVar.a = AppUtil.generatePageInfoKey(this.d);
            cVar.e = "platinum";
            cVar.b = "c_m84bv26";
            cVar.c = "首页_0";
            HashMap hashMap = new HashMap();
            hashMap.put("use_pouch", "1");
            hashMap.put("index", Integer.valueOf(f.index));
            hashMap.put("position", "homepage");
            cVar.h = hashMap;
            ArrayList arrayList = new ArrayList();
            arrayList.add("waimai_common_report_procedure");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("platinum-video");
            arrayList2.add("tile-swiper");
            arrayList2.add("dessert-drink-link");
            com.sankuai.waimai.pouch.plugin.b bVar = new com.sankuai.waimai.pouch.plugin.b();
            bVar.b = arrayList;
            bVar.a = arrayList2;
            a.C1112a c1112a = new a.C1112a();
            c1112a.b = this.d;
            c1112a.d = cVar;
            c1112a.g = bVar;
            this.q = c1112a.a();
            this.q.a((Activity) this.d, p, f);
        }
    }
}
