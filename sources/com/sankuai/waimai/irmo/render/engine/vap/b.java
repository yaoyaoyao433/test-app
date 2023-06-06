package com.sankuai.waimai.irmo.render.engine.vap;

import android.content.Context;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.b;
import com.sankuai.waimai.irmo.render.engine.g;
import com.sankuai.waimai.irmo.render.mrn.WrapMachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends WrapMachViewGroup implements b.a {
    public static ChangeQuickRedirect a;
    public a b;

    public b(Context context, boolean z) {
        super(context, z);
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a9bde7fa0542cfd4756896174132e20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a9bde7fa0542cfd4756896174132e20");
            return;
        }
        this.b = new a(context);
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.b);
        this.b.setVolumeControlUtil(new com.sankuai.waimai.irmo.mach.b(this, this));
    }

    @Override // com.sankuai.waimai.irmo.mach.b.a
    public final void setVolume(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ff08e3c300c91d528eee8af9d582b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ff08e3c300c91d528eee8af9d582b5");
        } else if (this.b != null) {
            this.b.a(f, f);
        }
    }

    public final void setPlaySuccessBlock(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d388a9127063720a194a0221c92722ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d388a9127063720a194a0221c92722ae");
        } else if (this.b != null) {
            this.b.setPlaySuccessBlock(gVar);
        }
    }
}
