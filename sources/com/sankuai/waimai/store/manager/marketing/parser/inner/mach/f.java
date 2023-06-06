package com.sankuai.waimai.store.manager.marketing.parser.inner.mach;

import android.app.Activity;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SGDialogMachContainer;
import com.sankuai.waimai.store.event.i;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.monitor.monitor.StoreError;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    public Map<String, Object> b;
    private e c;
    private String d;
    private String e;

    public f(String str, String str2, e eVar) {
        Object[] objArr = {str, str2, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1939b15bcba44fed7cd4788683e60d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1939b15bcba44fed7cd4788683e60d1");
            return;
        }
        this.c = eVar;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(final com.sankuai.waimai.store.mach.event.a aVar, String str, final Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6df8c3951a2b0b6495a6579d946a5c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6df8c3951a2b0b6495a6579d946a5c3");
            return;
        }
        Activity a2 = aVar.a();
        if (t.a(str) || this.c == null || com.sankuai.waimai.store.util.b.a(a2) || t.a(this.d)) {
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -917921030:
                if (str.equals("ReceiveCouponSuccess")) {
                    c = 3;
                    break;
                }
                break;
            case 3127582:
                if (str.equals("exit")) {
                    c = 2;
                    break;
                }
                break;
            case 3273774:
                if (str.equals("jump")) {
                    c = 1;
                    break;
                }
                break;
            case 92899676:
                if (str.equals("alert")) {
                    c = 4;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.c.a();
                return;
            case 1:
                String valueOf = String.valueOf(map != null ? map.get(NetLogConstants.Details.SCHEME) : "");
                if (t.a(valueOf)) {
                    StoreError storeError = StoreError.RouterError;
                    ah.a(storeError, "templateID = " + this.d + ", templateData = " + this.e);
                    return;
                }
                com.sankuai.waimai.store.router.d.a(aVar.a(), valueOf);
                return;
            case 2:
                this.c.b();
                a2.finish();
                return;
            case 3:
                com.meituan.android.bus.a.a().c(new i(str, map));
                break;
            case 4:
                Object[] objArr2 = {aVar, str, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28572fb64061a78b429b3f2787e34697", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28572fb64061a78b429b3f2787e34697");
                    return;
                } else if (map == null || map.isEmpty()) {
                    return;
                } else {
                    al.a(new al.b<MarketingModel.ModuleItem>() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.f.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.util.al.b
                        public final /* synthetic */ MarketingModel.ModuleItem a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "48d80a5c0aac226d95ec9e3c58f0e979", RobustBitConfig.DEFAULT_VALUE) ? (MarketingModel.ModuleItem) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "48d80a5c0aac226d95ec9e3c58f0e979") : (MarketingModel.ModuleItem) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(map), MarketingModel.ModuleItem.class);
                        }

                        @Override // com.sankuai.waimai.store.util.al.b
                        public final /* synthetic */ void a(MarketingModel.ModuleItem moduleItem) {
                            MarketingModel.ModuleItem moduleItem2 = moduleItem;
                            Object[] objArr3 = {moduleItem2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b4dafb2c38f5e7077ced301d9c374de", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b4dafb2c38f5e7077ced301d9c374de");
                            } else if (moduleItem2 != null) {
                                SGDialogMachContainer.a(aVar.a(), moduleItem2, f.this.b);
                                aVar.b("dismiss", null);
                            }
                        }
                    }, "");
                    return;
                }
        }
        this.c.a(aVar, str, map);
    }
}
