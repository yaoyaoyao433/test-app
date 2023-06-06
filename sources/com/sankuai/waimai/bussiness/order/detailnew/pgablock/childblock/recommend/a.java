package com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend;

import android.graphics.Rect;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.util.g;
import java.util.Iterator;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"waimai_order_order_status_recommend_info_style_1"}, viewModel = C0914a.class)
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.block.a<b, C0914a, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c62e1036af5fbf7d5a5d1dd95675928", RobustBitConfig.DEFAULT_VALUE) ? (C0914a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c62e1036af5fbf7d5a5d1dd95675928") : new C0914a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86964a560ed351ab4379555867ebd359", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86964a560ed351ab4379555867ebd359") : new b(m());
    }

    public a(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2af0264ca4e673ea9811ff2b987b09b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2af0264ca4e673ea9811ff2b987b09b7");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e38e3379fd75bc399b7eefd330afc62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e38e3379fd75bc399b7eefd330afc62");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).az.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acadceb45079b352525e034c5cf09314", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acadceb45079b352525e034c5cf09314");
                } else if (com.sankuai.waimai.bussiness.order.detailnew.util.a.a(num2) != 1) {
                    ((b) a.this.g).e();
                } else {
                    ((b) a.this.g).a(((com.sankuai.waimai.bussiness.order.detailnew.a) a.this.F()).ay.a().b);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).t.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28b26a968338455ae36a137836488f8d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28b26a968338455ae36a137836488f8d");
                } else if (bool2 == null || !bool2.booleanValue()) {
                } else {
                    ((b) a.this.g).a(((com.sankuai.waimai.bussiness.order.detailnew.a) a.this.F()).ay.a().b);
                }
            }
        });
        g.a(((b) this.g).a(), 0);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0914a extends com.meituan.android.cube.pga.viewmodel.a {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca427761a1fec75bf6ad1465d2da6d67", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca427761a1fec75bf6ad1465d2da6d67");
            } else {
                super.d();
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112b432e4f7fb8f37c968f3e3c62eff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112b432e4f7fb8f37c968f3e3c62eff4");
            return;
        }
        Iterator<com.meituan.android.cube.pga.block.a> it = q().iterator();
        while (it.hasNext()) {
            it.next().a(rect);
        }
        y();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7acccc725e70b3ad75b5714b3cea140c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7acccc725e70b3ad75b5714b3cea140c");
            return;
        }
        super.y();
        ((b) this.g).f();
    }
}
