package com.sankuai.waimai.business.restaurant.poicontainer.share;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.share.a;
import com.sankuai.waimai.business.restaurant.framework.h;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends h<b, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect g;
    private g h;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e958c142071ac39b54c0206f2120a3c", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e958c142071ac39b54c0206f2120a3c") : new b();
    }

    public a(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef8be45ef8b67dd64ecf8e2082c92bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef8be45ef8b67dd64ecf8e2082c92bb");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562c37d38005b8baa392626e646f0365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562c37d38005b8baa392626e646f0365");
            return;
        }
        super.s();
        this.h = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b;
        ((b) this.n).q = l();
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).E.o.a(new com.meituan.android.cube.pga.action.b<com.meituan.android.cube.pga.action.b>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.share.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(com.meituan.android.cube.pga.action.b bVar) {
                final com.meituan.android.cube.pga.action.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d2545f06412cfb3c42ac573d02f68cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d2545f06412cfb3c42ac573d02f68cb");
                    return;
                }
                final b bVar3 = (b) a.this.n;
                Object[] objArr3 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = b.o;
                if (PatchProxy.isSupport(objArr3, bVar3, changeQuickRedirect3, false, "4b73fae70eacd41117ed59afc7abd51c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar3, changeQuickRedirect3, false, "4b73fae70eacd41117ed59afc7abd51c");
                    return;
                }
                if (!bVar3.r) {
                    bVar3.p = new c(bVar3.q.getWindow().getDecorView());
                    bVar3.r = true;
                }
                bVar3.p.a(bVar3.e().a, new a.InterfaceC0823a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.share.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.share.a.InterfaceC0823a
                    public final void a(boolean z) {
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "835ae56ad25fa17a786ae062e30cb04c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "835ae56ad25fa17a786ae062e30cb04c");
                            return;
                        }
                        b bVar4 = bVar3;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = b.o;
                        if (PatchProxy.isSupport(objArr5, bVar4, changeQuickRedirect5, false, "f6bcc154a8520aae31b4347c8ede3ed0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, bVar4, changeQuickRedirect5, false, "f6bcc154a8520aae31b4347c8ede3ed0");
                        } else {
                            ShareTip shareTip = bVar4.e().a;
                            if (shareTip != null && shareTip.getActivityId() != 0) {
                                Set a2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) bVar4.q, "has_clicked_activity_share_button", (Set<String>) null);
                                if (a2 == null) {
                                    a2 = new HashSet();
                                }
                                a2.add(String.valueOf(shareTip.getActivityId()));
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.b(bVar4.q, "has_clicked_activity_share_button", a2);
                            }
                            if (shareTip != null) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("source", 4);
                                if (bVar4.p != null) {
                                    bVar4.p.b();
                                    shareTip.setIcon(bVar4.p.c());
                                }
                                shareTip.setCid("c_CijEL");
                                com.sankuai.waimai.share.b.a(bVar4.q, shareTip, bVar4, (com.sankuai.waimai.foundation.core.service.share.listener.b) null, bundle);
                            }
                        }
                        if (bVar2 != null) {
                            bVar2.a(null);
                        }
                    }
                });
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0deef6c5d79d8464a6ac42f61501fc00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0deef6c5d79d8464a6ac42f61501fc00");
        } else {
            super.I();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7db48c55dce00e784cac47c451f5e508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7db48c55dce00e784cac47c451f5e508");
            return;
        }
        super.bE_();
        b bVar = (b) this.n;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.o;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "636fa39ffa78f4a980a505a9b9283e33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "636fa39ffa78f4a980a505a9b9283e33");
            return;
        }
        c cVar = bVar.p;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.share.a.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "0b7a26b445a371654b8742de01d59e4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "0b7a26b445a371654b8742de01d59e4a");
        } else if (cVar.f == null || cVar.f.isRecycled()) {
        } else {
            cVar.f.recycle();
        }
    }
}
