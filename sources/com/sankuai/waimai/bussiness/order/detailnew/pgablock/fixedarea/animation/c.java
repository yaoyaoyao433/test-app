package com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation;

import android.os.Handler;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.OrderFixAreaInfo;
import com.sankuai.waimai.foundation.utils.ad;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.block.a<e, f, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;
    private Handler s;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7b4866885509e70d3ff7fc52885a81", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7b4866885509e70d3ff7fc52885a81") : new f();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a613c97e1c75964615145a3d50469d", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a613c97e1c75964615145a3d50469d") : new e(m(), this.h);
    }

    public c(com.sankuai.waimai.bussiness.order.detailnew.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa0fd86f094274af35cb45f7c7eb409", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa0fd86f094274af35cb45f7c7eb409");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc681fffbd06c902e63097fcc82ac26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc681fffbd06c902e63097fcc82ac26");
            return;
        }
        super.I();
        com.sankuai.waimai.business.order.api.detail.model.a a = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).J.a();
        F();
        final boolean a2 = com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) F()).al.a().b);
        if (a == null || a.c != 1) {
            return;
        }
        ad.c(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a05c5d416d273478cff570b1caed188", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a05c5d416d273478cff570b1caed188");
                    return;
                }
                e eVar = (e) c.this.g;
                OrderFixAreaInfo e = ((f) c.this.n).e();
                Object[] objArr3 = {e};
                ChangeQuickRedirect changeQuickRedirect3 = e.d;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "cf7097fbcb6a965faf3d0bee07393c57", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "cf7097fbcb6a965faf3d0bee07393c57")).booleanValue();
                } else if (eVar.a(e)) {
                    eVar.g.setVisibility(0);
                    z = true;
                } else {
                    eVar.g.setVisibility(8);
                }
                if (z) {
                    ((com.sankuai.waimai.bussiness.order.detailnew.a) c.this.F()).Z.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.c.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.cube.pga.action.b
                        public final /* synthetic */ void a(Integer num) {
                            Integer num2 = num;
                            Object[] objArr4 = {num2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1b59e4c00f905fd50af2eeed3581a0be", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1b59e4c00f905fd50af2eeed3581a0be");
                                return;
                            }
                            e eVar2 = (e) c.this.g;
                            OrderFixAreaInfo e2 = ((f) c.this.n).e();
                            Object[] objArr5 = {e2, num2};
                            ChangeQuickRedirect changeQuickRedirect5 = e.d;
                            if (PatchProxy.isSupport(objArr5, eVar2, changeQuickRedirect5, false, "08dfde1c8594d69693fd39a3c011add6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, eVar2, changeQuickRedirect5, false, "08dfde1c8594d69693fd39a3c011add6");
                            } else if (num2.intValue() == 0) {
                                if (!eVar2.b(e2) || eVar2.f || eVar2.e == null) {
                                    return;
                                }
                                eVar2.e.a();
                                eVar2.f = !eVar2.f;
                            } else if (num2.intValue() == 1 && eVar2.b(e2) && eVar2.e != null) {
                                eVar2.e.a();
                                eVar2.f = !eVar2.f;
                            }
                        }
                    });
                    if (c.this.s == null) {
                        c.this.s = new Handler();
                    }
                    c.this.s.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.c.1.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "950d00c501286c9940d22ccd8dc89adc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "950d00c501286c9940d22ccd8dc89adc");
                                return;
                            }
                            c cVar = c.this;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = c.r;
                            if ((PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "cefda2a447c7714c03ba46002b8d7868", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "cefda2a447c7714c03ba46002b8d7868")).booleanValue() : com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) cVar.F()).aa.a().b)) && a2) {
                                return;
                            }
                            ((com.sankuai.waimai.bussiness.order.detailnew.a) c.this.F()).Z.a((com.meituan.android.cube.pga.common.b<Integer>) 1);
                        }
                    }, 300L);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48ceb598c95ed4b90c436295b0af788c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48ceb598c95ed4b90c436295b0af788c");
            return;
        }
        super.bc_();
        if (this.s != null) {
            this.s.removeCallbacksAndMessages(null);
        }
    }
}
