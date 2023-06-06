package com.sankuai.waimai.business.restaurant.poicontainer.modules.paged;

import android.text.TextUtils;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.action.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.framework.viewpager.design.PGABlockPagerAdapter;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.h;
import com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.c;
import com.sankuai.waimai.platform.widget.AbsTabLayout;
/* compiled from: ProGuard */
@DynamicBinder(modelType = a.class, nativeId = {"wm_r_sliding_bar"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes4.dex */
public class b extends com.sankuai.waimai.business.restaurant.base.config.b<c, com.meituan.android.cube.pga.viewmodel.a<a>, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> implements c.a {
    public static ChangeQuickRedirect t;

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db9aa674a327fa67c61ef329371f93e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db9aa674a327fa67c61ef329371f93e1");
        }
        return new c(l(), ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b, this);
    }

    public b(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c22823b377ef2dd4c429e72ed05c978", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c22823b377ef2dd4c429e72ed05c978");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void a(com.meituan.android.cube.pga.block.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3bc972c0a75b47d327673b6120d4761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3bc972c0a75b47d327673b6120d4761");
            return;
        }
        c cVar = (c) this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "87d3dcc0beb860d592abee552c0deaa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "87d3dcc0beb860d592abee552c0deaa6");
        } else {
            cVar.m.add(aVar);
        }
        q().add(aVar);
        aVar.c((com.meituan.android.cube.pga.block.b) this);
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void b(com.meituan.android.cube.pga.block.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b114a922c2b54003788bec5ba41660b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b114a922c2b54003788bec5ba41660b");
            return;
        }
        c cVar = (c) this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "129b5453987cd53811c4ccbc3c44592f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "129b5453987cd53811c4ccbc3c44592f");
        } else {
            cVar.m.remove(aVar);
        }
        q().remove(aVar);
        aVar.k = null;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee3e2a2e3613592b4bfb83012016524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee3e2a2e3613592b4bfb83012016524");
            return;
        }
        super.I();
        if (this.n.e() != null) {
            final c cVar = (c) this.g;
            a aVar = (a) this.n.e();
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.d;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "a2e30a86d442f22987f72ed706b5744b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "a2e30a86d442f22987f72ed706b5744b");
            } else {
                cVar.g = new PGABlockPagerAdapter(cVar.m);
                cVar.e.setAdapter(cVar.g);
                cVar.e.setCurrentItem(cVar.o);
                if (cVar.n != null) {
                    cVar.n.b(cVar.e.getCurrentItem());
                }
                cVar.f.a(aVar);
                cVar.g.c = cVar.f.a();
                if (cVar.f instanceof com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.b) {
                    com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.b bVar = (com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.b) cVar.f;
                    AbsTabLayout.a aVar2 = new AbsTabLayout.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.c.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.widget.AbsTabLayout.a
                        public final boolean a(int i, int i2) {
                            Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "88f7e571ee70193dcc1173c53cbe6afb", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "88f7e571ee70193dcc1173c53cbe6afb")).booleanValue();
                            }
                            if (i == cVar.l.b() && i2 == cVar.l.b()) {
                                c cVar2 = cVar;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = c.d;
                                if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "6e50b45428208e948bb40c37f74d908e", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "6e50b45428208e948bb40c37f74d908e")).booleanValue();
                                }
                                if (cVar2.n.aE_()) {
                                    cVar2.n.b(false);
                                    cVar2.n.M();
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                    };
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.b.c;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "75e47c627359a5466b086fd663053820", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "75e47c627359a5466b086fd663053820");
                    } else {
                        bVar.f.setTabClickCallBack(aVar2);
                    }
                }
                cVar.f.a(cVar.e);
                cVar.a(cVar.l.b() == cVar.e.getCurrentItem());
                boolean a = h.a(cVar.k, cVar.j.g);
                String str = aVar.g != null ? aVar.g.poiTabIcon : "";
                Object[] objArr4 = {Byte.valueOf(a ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect4 = c.d;
                if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "267eaba20dd86f861cb8c7d03aa1ccd9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "267eaba20dd86f861cb8c7d03aa1ccd9");
                } else if (a && !TextUtils.isEmpty(str)) {
                    cVar.f.a(str);
                }
            }
        }
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.s.b = new d<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "abd9796a764b843bdad581a1c872cdb7", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "abd9796a764b843bdad581a1c872cdb7") : Boolean.valueOf(((c) b.this.g).h);
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a<a> L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2472e5f10d00c32daf5bd90d211184c4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2472e5f10d00c32daf5bd90d211184c4") : new com.meituan.android.cube.pga.viewmodel.a<>();
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960ee77548ac778c40e88574ddffb977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960ee77548ac778c40e88574ddffb977");
            return;
        }
        super.s();
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.u.b = new d<com.sankuai.waimai.business.restaurant.poicontainer.helper.b>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.business.restaurant.poicontainer.helper.b a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8a130ca2263fe2aff115f796e1f0036", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.poicontainer.helper.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8a130ca2263fe2aff115f796e1f0036") : ((c) b.this.g).i;
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).L.a.a(new com.meituan.android.cube.pga.action.b<com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c cVar) {
                com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8f5026b2d72f2720a21a044200faf16", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8f5026b2d72f2720a21a044200faf16");
                    return;
                }
                com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a aVar = ((c) b.this.g).f;
                if (aVar != null && cVar2 != null) {
                    int i = cVar2.a;
                    int i2 = cVar2.c;
                    int i3 = cVar2.b;
                    com.sankuai.waimai.foundation.utils.log.a.e("ShopContentBlock", i + CommonConstant.Symbol.COMMA + i2 + CommonConstant.Symbol.COMMA + i3, new Object[0]);
                    aVar.a(i, i2, i3);
                }
                ((c) b.this.g).g();
            }
        });
        ((c) this.g).f();
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.c.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd35a28a06e0755c1dd28d6eb3e46888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd35a28a06e0755c1dd28d6eb3e46888");
        } else {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.v.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i));
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.c.a
    public final void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a48a5189605ecdf9f46cf51c8f13cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a48a5189605ecdf9f46cf51c8f13cdd");
        } else {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.p.a((com.meituan.android.cube.pga.common.b<Void>) null);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.interfaces.b
    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5178fc9c0ccc7843e24b3804c352fc72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5178fc9c0ccc7843e24b3804c352fc72");
        } else {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).H.a.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.interfaces.b
    public final void b(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6bc4e88fb73722dbccfa3218458153e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6bc4e88fb73722dbccfa3218458153e");
        } else {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).H.b.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.FALSE);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.interfaces.b
    public final boolean aE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc74ebdf0fda6e52193fdff2f086dede", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc74ebdf0fda6e52193fdff2f086dede")).booleanValue();
        }
        com.meituan.android.cube.pga.common.d<Boolean> a = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).H.d.a();
        if (a != null) {
            return a.b();
        }
        return false;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.c.a
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9daa9773abaf8d72337641bf90a99ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9daa9773abaf8d72337641bf90a99ea");
        } else {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.r.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.valueOf(z));
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.g, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06b4c4948c21a7b32c2aa08326f65fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06b4c4948c21a7b32c2aa08326f65fdf");
            return;
        }
        super.bE_();
        c cVar = (c) this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "3bfc282186afcb1d5ad7ed83c68465d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "3bfc282186afcb1d5ad7ed83c68465d0");
        } else {
            cVar.m.clear();
        }
    }
}
