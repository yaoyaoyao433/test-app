package com.sankuai.waimai.business.page.kingkong.future.tabfeed;

import android.graphics.Color;
import android.support.constraint.R;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout;
import com.sankuai.waimai.business.page.kingkong.future.tabfeed.c;
import com.sankuai.waimai.business.page.kingkong.future.tabfeed.e;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"waimai_native_kingkong_tab"}, viewModel = e.class)
/* loaded from: classes4.dex */
public class b extends com.meituan.android.cube.pga.block.a<c, e, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e983e699ac24c1b03702c753b92f354", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e983e699ac24c1b03702c753b92f354") : new e();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7543e8ce12777dacf905a0e7bb732d", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7543e8ce12777dacf905a0e7bb732d") : new c(((com.sankuai.waimai.business.page.kingkong.a) F()).a());
    }

    public b(com.sankuai.waimai.business.page.kingkong.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ff356389bfd3c67316ea8541347993c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ff356389bfd3c67316ea8541347993c");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13ede404963b2df43d70561d1f6c047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13ede404963b2df43d70561d1f6c047");
            return;
        }
        super.s();
        final int parseColor = Color.parseColor("#FFFFFF");
        final int color = ((com.sankuai.waimai.business.page.kingkong.a) F()).b().getResources().getColor(R.color.wm_page_kingkong_common_bg);
        ((com.sankuai.waimai.business.page.kingkong.a) F()).O.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc24ecfbf1d74d982cd93906b3a7b890", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc24ecfbf1d74d982cd93906b3a7b890");
                } else if (bool2 == null || b.this.g == null || ((c) b.this.g).a() == null) {
                } else {
                    if (bool2.booleanValue()) {
                        ((c) b.this.g).a().setBackgroundColor(parseColor);
                    } else {
                        ((c) b.this.g).a().setBackgroundColor(color);
                    }
                }
            }
        });
        r().f = new c.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.c.a
            public final void a(CustomTabLayout.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48d7c47e087179cdcc8e5ef3314fcaf8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48d7c47e087179cdcc8e5ef3314fcaf8");
                } else {
                    ((com.sankuai.waimai.business.page.kingkong.a) b.this.F()).bv.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(eVar.c));
                }
            }
        };
        ((com.sankuai.waimai.business.page.kingkong.a) F()).bu.b = new com.meituan.android.cube.pga.action.d<com.sankuai.waimai.rocks.page.tablist.tab.a>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.rocks.page.tablist.tab.a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27442f40900299edba5f3c9281d63a6e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.page.tablist.tab.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27442f40900299edba5f3c9281d63a6e") : b.this.r().a();
            }
        };
        ((com.sankuai.waimai.business.page.kingkong.a) F()).by.b = new com.meituan.android.cube.pga.action.c<String, com.sankuai.waimai.rocks.page.tablist.rocklist.e>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.b.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ com.sankuai.waimai.rocks.page.tablist.rocklist.e a(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "035c211c194692b5435c285a908cdcef", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.rocks.page.tablist.rocklist.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "035c211c194692b5435c285a908cdcef");
                }
                c cVar = (c) b.this.g;
                int parseInt = Integer.parseInt(str2);
                Object[] objArr3 = {Integer.valueOf(parseInt)};
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "ef9bdde5529747deaa072410130df931", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.rocks.page.tablist.rocklist.e) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "ef9bdde5529747deaa072410130df931");
                }
                if (parseInt >= cVar.e.size() || parseInt < 0) {
                    return null;
                }
                return cVar.e.get(parseInt);
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6082570a9238e508772c36b4f8a6e65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6082570a9238e508772c36b4f8a6e65");
            return;
        }
        super.c(obj);
        if (((e) this.n).e() instanceof e.a) {
            e.a aVar = (e.a) ((e) this.n).e();
            if (aVar.b == null || aVar.a == null) {
                return;
            }
            ((c) this.g).a((com.sankuai.waimai.business.page.kingkong.a) F(), aVar.b, aVar.a);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16066949c91a001806f35be9b74e1b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16066949c91a001806f35be9b74e1b9f");
        } else {
            super.y();
        }
    }
}
