package com.sankuai.waimai.business.restaurant.poicontainer.mach;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    View e;
    private boolean f;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_restaurant_layout_content_vip_card_mach;
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b23f842cdd4f72fd7543039c329f04c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b23f842cdd4f72fd7543039c329f04c5");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7a313e08830cfe6d17566621b53e47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7a313e08830cfe6d17566621b53e47");
            return;
        }
        super.b();
        this.e = this.b.findViewById(R.id.layout_restaurant_vipcard_mach_rootview);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c437d88796ff05a7aa7f829275f1f90a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c437d88796ff05a7aa7f829275f1f90a");
            return;
        }
        this.f = z;
        if (this.f) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams.bottomMargin = g.a(this.c, 12.0f);
            this.e.setLayoutParams(layoutParams);
        }
    }
}
