package com.sankuai.waimai.store.mach.page.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g implements com.sankuai.waimai.mach.g {
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

    public g(String str, com.sankuai.waimai.platform.mach.monitor.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4520c43515874e39a25afeebf829bc95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4520c43515874e39a25afeebf829bc95");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b4f0681e1caee85845e85024cb0b27f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b4f0681e1caee85845e85024cb0b27f");
            return;
        }
        String th2 = th.toString();
        Object[] objArr2 = {Integer.valueOf(i), th2};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f90e2b3cb5385e9ce071217f43ff3497", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f90e2b3cb5385e9ce071217f43ff3497");
            return;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d1169d77be7ee779a3f4d92a7949efd2", RobustBitConfig.DEFAULT_VALUE)) {
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
                str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d1169d77be7ee779a3f4d92a7949efd2");
            }
            i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_render_search").b(str).d(th2).b());
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3808f3feb287fb21540d0a0736b2e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3808f3feb287fb21540d0a0736b2e8");
        } else {
            this.c.a("", this.b, str, str2);
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5455d113ebb6d2b912dbbc3fa109ae3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5455d113ebb6d2b912dbbc3fa109ae3e");
        } else {
            this.c.a("", this.b, th);
        }
    }
}
