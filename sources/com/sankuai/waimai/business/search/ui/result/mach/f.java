package com.sankuai.waimai.business.search.ui.result.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c7b37986cf9580b4ef6ac78155839e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c7b37986cf9580b4ef6ac78155839e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b70a538a7ec535f0c1a3f4304e830c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b70a538a7ec535f0c1a3f4304e830c9");
            return;
        }
        String th2 = th.toString();
        Object[] objArr2 = {Integer.valueOf(i), th2};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "10bae104034e0c080bb1c80cefba3bd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "10bae104034e0c080bb1c80cefba3bd6");
            return;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "eacd4f6a0701f20ec694d4fc29f8ad9f", RobustBitConfig.DEFAULT_VALUE)) {
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
                str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "eacd4f6a0701f20ec694d4fc29f8ad9f");
            }
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_render_search").b(str).d(th2).b());
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f181bd68ebb3167fb92b7f2e4548cfa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f181bd68ebb3167fb92b7f2e4548cfa5");
        } else {
            this.c.a("", this.b, str, str2);
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd6fb661ee2ea3120b1ab7970e915336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd6fb661ee2ea3120b1ab7970e915336");
        } else {
            this.c.a("", this.b, th);
        }
    }
}
