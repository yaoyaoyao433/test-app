package com.meituan.msc.views.text;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class h implements g {
    public static ChangeQuickRedirect a;
    public final int b;

    public h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0f1578abf6f9fe0db6f06adeb8ea40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0f1578abf6f9fe0db6f06adeb8ea40");
        } else {
            this.b = i;
        }
    }
}
