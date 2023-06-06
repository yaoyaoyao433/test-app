package com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.e;
import com.sankuai.waimai.bussiness.order.rocks.n;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d, a, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c6f2218e153d77ef54ad0363cbdaa1", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c6f2218e153d77ef54ad0363cbdaa1") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0813243dbb39d795d3dbbb3d6b3dee9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0813243dbb39d795d3dbbb3d6b3dee9") : new com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d(m());
    }

    public d(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9782dd133d02c12b40ee2e7c4b9b0c9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9782dd133d02c12b40ee2e7c4b9b0c9e");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7771c89066ff9189675fb8a6ad0479a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7771c89066ff9189675fb8a6ad0479a");
            return;
        }
        super.I();
        ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d) this.g).a(((a) this.n).p.b);
        ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d) this.g).a(((a) this.n).p);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<n> {
        public static ChangeQuickRedirect o;
        @NonNull
        e p;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b69a60e19b2d27b5825ed1282e3948", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b69a60e19b2d27b5825ed1282e3948");
            } else {
                this.p = new e();
            }
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08ec2f1815782edeecd0e6004937cbb6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08ec2f1815782edeecd0e6004937cbb6");
                return;
            }
            super.d();
            if (this.c == 0 || ((n) this.c).moduleHeader == null) {
                return;
            }
            this.p.b = ((n) this.c).moduleHeader.moduleId;
            this.p.c = ((n) this.c).moduleHeader.templateId;
            this.p.h = ((n) this.c).moduleHeader.jsonData;
        }
    }
}
