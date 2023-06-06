package com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.widget.CustomDragExpandLayout;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.block.a<e, f, com.sankuai.waimai.bussiness.order.detailnew.a> implements a {
    public static ChangeQuickRedirect r;
    private String s;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "655567cd0424d72b21ba1d86278cd329", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "655567cd0424d72b21ba1d86278cd329") : new f();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40be22a6d726f816e55442c3a93327b8", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40be22a6d726f816e55442c3a93327b8") : new e(m(), this.h, this, ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).u.a().b);
    }

    public c(com.sankuai.waimai.bussiness.order.detailnew.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b7ecf059242626b72491588324b4079", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b7ecf059242626b72491588324b4079");
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14c7fbb2354e0edc368c25508560d68f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14c7fbb2354e0edc368c25508560d68f");
            return;
        }
        super.bE_();
        l.cancel(this.s);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.s);
        e eVar = (e) this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.d;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "80c6f0677154f5691da1f6e6668be42d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "80c6f0677154f5691da1f6e6668be42d");
            return;
        }
        if (eVar.h != null) {
            eVar.h.a();
        }
        if (eVar.e != null) {
            eVar.e.onDestroy();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f463a830ba0b4c3b572325b7cfd0cc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f463a830ba0b4c3b572325b7cfd0cc3");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ae.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce79f3b61cc9c5543e9ab2835bfd2e34", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce79f3b61cc9c5543e9ab2835bfd2e34");
                }
                e eVar = (e) c.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = e.d;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "c81d4aae3b37183373d617df20d0c056", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "c81d4aae3b37183373d617df20d0c056")).booleanValue();
                } else if (eVar.e != null && eVar.e.getVisibility() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).k.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72a5a903b5d3ac5189975736f6f128fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72a5a903b5d3ac5189975736f6f128fb");
                } else if (bool2.booleanValue()) {
                    e eVar = (e) c.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = e.d;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "1220a018bd1149f1dc3a6da82f0d3022", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "1220a018bd1149f1dc3a6da82f0d3022");
                    } else if (eVar.f) {
                        if (eVar.e != null) {
                            eVar.e.onResume();
                        }
                        if (eVar.h != null) {
                            eVar.h.h();
                        }
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).j.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.c.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f558c287fbb7710fc19b589d9854de60", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f558c287fbb7710fc19b589d9854de60");
                } else if (bool2.booleanValue()) {
                    e eVar = (e) c.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = e.d;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "eda14b488943e95f36b980dc78486330", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "eda14b488943e95f36b980dc78486330");
                    } else if (eVar.f) {
                        if (eVar.h != null) {
                            eVar.h.g();
                        }
                        if (eVar.e != null) {
                            eVar.e.onPause();
                        }
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).af.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.c.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Object[] objArr2 = {bool};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e75ec4843d855b91dd2f2cb23804826a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e75ec4843d855b91dd2f2cb23804826a");
                } else if (c.this.D() != null) {
                    ((e) c.this.g).a(((f) c.this.n).p, c.this.s, (ViewGroup) c.this.D().i());
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "072b6864a22b275d28cc98957a01aeaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "072b6864a22b275d28cc98957a01aeaf");
            return;
        }
        super.I();
        this.s = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).Y.a().b;
        ((f) this.n).p.k = com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) F()).v.a().b);
        b bVar = ((f) this.n).p;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d6f1571e0679bf0d77c90aeed852ff5", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d6f1571e0679bf0d77c90aeed852ff5")).booleanValue();
        } else if (bVar != null && bVar.j != null && (!TextUtils.isEmpty(bVar.j.desc) || !TextUtils.isEmpty(bVar.j.clickText))) {
            z = true;
        }
        ((e) this.g).a(z, ((f) this.n).p);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.a
    public final void a(boolean z, int i, boolean z2, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79608c3b3bc58f0a0e9db01fe04d3cd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79608c3b3bc58f0a0e9db01fe04d3cd3");
        } else {
            ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ab.a((com.meituan.android.cube.pga.common.b<i.a<Boolean, Integer, Boolean, Integer>>) i.a(Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2), Integer.valueOf(i2)));
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.a
    public final CustomDragExpandLayout aP_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4cb12691da6cbc67083542c2b73b78b", RobustBitConfig.DEFAULT_VALUE) ? (CustomDragExpandLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4cb12691da6cbc67083542c2b73b78b") : ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).W.a().b;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.a
    public final Integer b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05a7118aea3d3f47f12df167a972a28f", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05a7118aea3d3f47f12df167a972a28f") : Integer.valueOf(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ac.a().b));
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.a
    public final Integer c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e07c0637affb228057b8b4c2ab0a8cf4", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e07c0637affb228057b8b4c2ab0a8cf4") : Integer.valueOf(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ad.a().b));
    }
}
