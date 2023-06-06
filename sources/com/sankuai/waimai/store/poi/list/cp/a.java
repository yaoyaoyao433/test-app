package com.sankuai.waimai.store.poi.list.cp;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.poi.list.cp.base.a {
    public static ChangeQuickRedirect g;
    private int D;

    public a(Context context, com.sankuai.waimai.store.param.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93dfd7be1aa392ceeb3e7e3d46cb42bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93dfd7be1aa392ceeb3e7e3d46cb42bd");
            return;
        }
        this.D = 62;
        a(context);
        this.z = aVar;
    }

    public final void setImageWidth(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e50ca7a3cc7bb82449e72f88ee3d6815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e50ca7a3cc7bb82449e72f88ee3d6815");
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) this.n.getLayoutParams();
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.o.getLayoutParams();
        if (aVar == null || aVar2 == null) {
            return;
        }
        aVar.width = h.a(this.i, this.D);
        aVar.height = h.a(this.i, this.D);
        float f = (i - 18) - 62;
        aVar2.width = h.a(this.i, f);
        aVar2.height = h.a(this.i, f);
        if (getLayoutParams() != null) {
            getLayoutParams().height = h.a(this.i, i2 + 42);
        }
    }
}
