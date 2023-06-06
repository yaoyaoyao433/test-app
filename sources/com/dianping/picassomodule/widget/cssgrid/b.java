package com.dianping.picassomodule.widget.cssgrid;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements Cloneable {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;
    public boolean d;
    public h e;
    public h f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d9b20c824c33dbe95e8b062298c1723", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d9b20c824c33dbe95e8b062298c1723");
            return;
        }
        this.b = 0;
        this.c = false;
        this.d = false;
        this.e = new h();
        this.f = new h();
    }

    public final Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2ef11ffaa358e979724773e00ca03e0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2ef11ffaa358e979724773e00ca03e0");
        }
        try {
            b bVar = (b) super.clone();
            if (this.e != null) {
                bVar.e = (h) this.e.clone();
            }
            if (this.f != null) {
                bVar.f = (h) this.f.clone();
            }
            return bVar;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
