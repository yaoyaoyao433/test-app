package com.sankuai.waimai.store.search.ui.result.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements com.sankuai.waimai.mach.g {
    public static ChangeQuickRedirect a;
    private String b;
    private com.sankuai.waimai.platform.mach.monitor.a c;

    @Override // com.sankuai.waimai.mach.g
    public final void a() {
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(int i) {
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(com.sankuai.waimai.mach.node.a aVar) {
    }

    @Override // com.sankuai.waimai.mach.g
    public final void b() {
    }

    public f(String str, com.sankuai.waimai.platform.mach.monitor.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d419facf8faf86e4903aa2a5237ba14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d419facf8faf86e4903aa2a5237ba14");
            return;
        }
        this.b = str;
        this.c = aVar;
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(int i, Throwable th) {
        String str;
        Object[] objArr = {Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fe0a842fae38188725623ec55a4e32a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fe0a842fae38188725623ec55a4e32a");
            return;
        }
        String th2 = th.toString();
        Object[] objArr2 = {Integer.valueOf(i), th2};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4526162d8e6a341047fdd62b12693357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4526162d8e6a341047fdd62b12693357");
            return;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cde053c7daa82b8cf91fcf8f0f802145", RobustBitConfig.DEFAULT_VALUE)) {
                switch (i) {
                    case 1:
                        str = "parse_template";
                        break;
                    case 2:
                        str = "expression";
                        break;
                    case 3:
                        str = "calculate_layout";
                        break;
                    case 4:
                        str = "create_view";
                        break;
                    case 5:
                        str = "data_empty";
                        break;
                    case 6:
                        str = "thread_pool_full";
                        break;
                    default:
                        str = "unknown";
                        break;
                }
            } else {
                str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cde053c7daa82b8cf91fcf8f0f802145");
            }
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_render_search").b(str).d(th2).b());
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7ef0ba78a83acc6a333ae6ead2bbe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7ef0ba78a83acc6a333ae6ead2bbe8");
        } else {
            this.c.a("", this.b, str, str2);
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff1b52bd15f955c92f1baf147d223ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff1b52bd15f955c92f1baf147d223ad");
        } else {
            this.c.a("", this.b, th);
        }
    }
}
