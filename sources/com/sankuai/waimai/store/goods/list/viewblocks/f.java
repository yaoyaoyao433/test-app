package com.sankuai.waimai.store.goods.list.viewblocks;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final SCBaseActivity b;
    public final com.sankuai.waimai.store.mach.d c;
    FrameLayout d;
    public final com.sankuai.waimai.mach.manager.load.a e;

    public f(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee53a02d370479dc0f135b5b68a0ae8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee53a02d370479dc0f135b5b68a0ae8");
            return;
        }
        this.b = sCBaseActivity;
        this.c = new com.sankuai.waimai.store.mach.d(this.b, this.b.w()) { // from class: com.sankuai.waimai.store.goods.list.viewblocks.f.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9c32db077f5cd35378cd206552702cb", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9c32db077f5cd35378cd206552702cb") : new com.sankuai.waimai.store.mach.page.mach.e(f.this.mContext);
            }
        };
        a.C1015a c1015a = new a.C1015a();
        c1015a.b = "supermarket-poi-live";
        c1015a.d = "sg";
        c1015a.e = "supermarket";
        this.e = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f5353396cb41c71ebf2aeca9f4534bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f5353396cb41c71ebf2aeca9f4534bb");
        }
        this.d = new FrameLayout(this.b);
        this.d.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return this.d;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f40ebc621bb755a380a00b3b9d45b8e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f40ebc621bb755a380a00b3b9d45b8e1");
            return;
        }
        super.onViewCreated();
        this.c.g = new com.sankuai.waimai.store.mach.event.b() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.f.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.event.b
            public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
                Object[] objArr2 = {aVar, str, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28a9357d97319a854f490a51d4f9eb46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28a9357d97319a854f490a51d4f9eb46");
                    return;
                }
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 3273774) {
                    if (hashCode == 94756344 && str.equals("close")) {
                        c = 1;
                    }
                } else if (str.equals("jump")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        String valueOf = String.valueOf(map != null ? map.get(NetLogConstants.Details.SCHEME) : "");
                        if (t.a(valueOf)) {
                            return;
                        }
                        com.sankuai.waimai.store.router.d.a(aVar.a(), valueOf);
                        return;
                    case 1:
                        f.this.setVisible(false);
                        return;
                    default:
                        return;
                }
            }
        };
        this.c.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.f.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fcbc46c77597272eb756faf0e45a463", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fcbc46c77597272eb756faf0e45a463");
                    return;
                }
                com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(f.this.d);
                aVar.a(new c.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.f.3.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "15bb868594318e5055680918ff0175ea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "15bb868594318e5055680918ff0175ea");
                        } else {
                            f.this.c.g();
                        }
                    }
                });
                com.sankuai.waimai.store.expose.v2.b.a().a(f.this.b, aVar);
            }
        });
        this.c.a(this.d, "sg", "supermarket");
    }
}
