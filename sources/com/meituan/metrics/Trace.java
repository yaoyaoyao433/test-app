package com.meituan.metrics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Trace {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean enable;
    private String name;

    public Trace(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4248410891406c6b4c1b7537658a52a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4248410891406c6b4c1b7537658a52a");
            return;
        }
        this.enable = false;
        this.name = str;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public String getName() {
        return this.name;
    }
}
