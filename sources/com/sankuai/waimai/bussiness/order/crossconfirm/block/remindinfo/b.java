package com.sankuai.waimai.bussiness.order.crossconfirm.block.remindinfo;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private ViewGroup e;
    private boolean f;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_cross_order_confirm_remind_layout;
    }

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a6b67f7e555eb0d98b2973af57449d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a6b67f7e555eb0d98b2973af57449d");
        } else {
            this.f = true;
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29a729a3927dc11dd613cccf23a92a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29a729a3927dc11dd613cccf23a92a2");
            return;
        }
        super.b();
        this.e = (ViewGroup) this.b.findViewById(R.id.layout_remind);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf731b05a4c5042f74d4d6fe57ff519d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf731b05a4c5042f74d4d6fe57ff519d");
            return;
        }
        if (cVar.a == null || cVar.a.size() == 0) {
            this.e.setVisibility(8);
        } else {
            com.sankuai.waimai.platform.widget.dialog.b.a(cVar.a, (Activity) this.c, this.e, (TextView) this.e.findViewById(R.id.txt_remind), null, this.f);
        }
        if (z && this.e.getVisibility() == 0) {
            JudasManualManager.b("b_7kV7d").a("c_ykhs39e").a(this.c).a();
        }
        this.f = false;
    }
}
