package com.sankuai.waimai.business.page.kingkong.view.privacy;

import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect r;
    long s;

    public b(com.sankuai.waimai.business.page.kingkong.a aVar, @Nullable ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6dd0bf174cc483fbde5b5e04595a8a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6dd0bf174cc483fbde5b5e04595a8a8");
        } else {
            this.s = 0L;
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da3fdf6c4050d5fc68ee37f1c15a705c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da3fdf6c4050d5fc68ee37f1c15a705c") : new com.meituan.android.cube.pga.view.a(m(), this.h) { // from class: com.sankuai.waimai.business.page.kingkong.view.privacy.b.1
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_page_fkk_privacy_dialog;
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c12d27b3508c01d3f19157a8f847514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c12d27b3508c01d3f19157a8f847514");
            return;
        }
        super.s();
        i().findViewById(R.id.tv_privacy).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.view.privacy.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z = true;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2ddd49db42bd12cae50a221425dff84", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2ddd49db42bd12cae50a221425dff84");
                    return;
                }
                b bVar = b.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.r;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "340e961eef80550f7ac585d6ba365f45", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "340e961eef80550f7ac585d6ba365f45")).booleanValue();
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - bVar.s >= 500) {
                        bVar.s = currentTimeMillis;
                        z = false;
                    }
                }
                if (z) {
                    return;
                }
                com.sankuai.waimai.platform.privacy.a.a().a(b.this.l());
            }
        });
    }
}
