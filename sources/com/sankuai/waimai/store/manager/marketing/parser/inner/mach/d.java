package com.sankuai.waimai.store.manager.marketing.parser.inner.mach;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.mach.SGCommonMachReportInfo;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class d {
    public static ChangeQuickRedirect e;
    private com.sankuai.waimai.store.platform.marketing.a a;
    private Map<String, Object> b;
    private String c;
    private String d;
    com.sankuai.waimai.store.mach.d f;

    public void a() {
    }

    public void a(Exception exc) {
    }

    public void b() {
    }

    public d(final com.sankuai.waimai.store.expose.v2.a aVar, final String str, ViewGroup viewGroup, e eVar, @NonNull com.sankuai.waimai.store.platform.marketing.a aVar2) {
        Object[] objArr = {aVar, str, viewGroup, eVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "536f6c3ba69b5069b6fd2f69ad63e426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "536f6c3ba69b5069b6fd2f69ad63e426");
            return;
        }
        this.c = "supermarket";
        this.d = "sm_mach_alert";
        String str2 = "";
        if (aVar.bB_() instanceof SCBaseActivity) {
            str2 = ((SCBaseActivity) aVar.bB_()).w();
            if (!TextUtils.isEmpty(((SCBaseActivity) aVar.bB_()).t())) {
                this.c = ((SCBaseActivity) aVar.bB_()).t();
                if (DefaultHeaderService.KEY_DRUG.equals(this.c)) {
                    this.d = "MachDrugFullLinkDialog";
                }
            }
        } else if (aVar.bB_() != null) {
            Activity bB_ = aVar.bB_();
            str2 = bB_.getClass().getSimpleName() + bB_.hashCode();
        }
        this.f = new com.sankuai.waimai.store.mach.d(aVar, str2) { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef9e0d7b799f2b025d7448c2c65a7b77", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef9e0d7b799f2b025d7448c2c65a7b77") : new com.sankuai.waimai.store.mach.logger.a(aVar.bB_(), str);
            }
        };
        this.a = aVar2;
        try {
            if (aVar2 == null) {
                com.sankuai.waimai.store.util.monitor.c.a(StoreException.SetContentViewStepException, "templateError", "template is null");
            } else {
                this.b = (Map) i.a(aVar2.c, new TypeToken<HashMap<String, Object>>() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.d.2
                }.getType());
                this.f.g = new f(aVar2.b, aVar2.c, eVar);
            }
        } catch (Throwable th) {
            ae.a("TemplateErrorData", th.toString());
        }
        this.f.a(viewGroup, this.d, this.c);
        this.f.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.d.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32a76deb353612ed8a8b54918e92c043", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32a76deb353612ed8a8b54918e92c043");
                    return;
                }
                super.d();
                d.this.a();
            }
        });
    }

    public final String c() {
        return this.a != null ? this.a.b : "";
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4842b1ff86cae32951d53eee1a324de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4842b1ff86cae32951d53eee1a324de8");
        } else {
            this.f.g();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f28ab40196d1b56855c3cab2e65b144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f28ab40196d1b56855c3cab2e65b144");
        } else if (this.a == null) {
            a(new Exception("template is null"));
        } else {
            a.C1015a c1015a = new a.C1015a();
            c1015a.c = this.a.a();
            c1015a.b = this.a.b;
            c1015a.d = this.d;
            c1015a.e = this.c;
            com.sankuai.waimai.mach.manager.load.a a = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
            final Map<String, Object> map = this.b;
            if (map == null) {
                a(new Exception("apiJson is null"));
            } else {
                this.f.a(a, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.d.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.container.c
                    public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                        Object[] objArr2 = {eVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8f6d4258489fd977f893a2827635cd7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8f6d4258489fd977f893a2827635cd7");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
                        map.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap);
                        d.this.f.a(eVar, map);
                        d.this.b();
                    }

                    @Override // com.sankuai.waimai.mach.container.c
                    public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45cde7ed369d6685d782ffb998fbe731", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45cde7ed369d6685d782ffb998fbe731");
                            return;
                        }
                        d.this.a(bVar);
                        SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(d.class.getSimpleName());
                        sGCommonMachReportInfo.e = d.this.a.b;
                        sGCommonMachReportInfo.d = 4;
                        sGCommonMachReportInfo.i = bVar.a();
                        com.sankuai.waimai.store.util.mach.a.a(sGCommonMachReportInfo);
                    }
                });
            }
        }
    }
}
