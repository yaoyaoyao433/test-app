package com.dianping.picassomodule.widget.cssgrid;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j implements Cloneable {
    public static ChangeQuickRedirect a;
    public i b;
    public float c;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e98b9fd8d22cba8b3aeac7c29fbe2a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e98b9fd8d22cba8b3aeac7c29fbe2a5");
            return;
        }
        this.b = new i();
        this.c = 0.0f;
    }

    public final Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3859433a39ba9741ab0ed06aa98a6c59", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3859433a39ba9741ab0ed06aa98a6c59");
        }
        try {
            j jVar = (j) super.clone();
            if (this.b != null) {
                jVar.b = (i) this.b.clone();
            }
            return jVar;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
