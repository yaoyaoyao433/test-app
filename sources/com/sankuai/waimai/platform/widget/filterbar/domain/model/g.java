package com.sankuai.waimai.platform.widget.filterbar.domain.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c0c2dce2d9597cb2414d9c887b6f03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c0c2dce2d9597cb2414d9c887b6f03");
            return;
        }
        this.b = 0;
        this.c = 0;
    }

    public g(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5548181f66bb644e68fa674bf1d306a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5548181f66bb644e68fa674bf1d306a7");
            return;
        }
        this.b = i;
        this.c = i2;
    }

    public final boolean a() {
        return this.b <= this.c;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65607fb38b7e2a0498145db841c6ce27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65607fb38b7e2a0498145db841c6ce27")).booleanValue();
        }
        if (!super.equals(obj)) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.b != gVar.b || this.c != gVar.c) {
                }
            }
            return false;
        }
        return true;
    }
}
