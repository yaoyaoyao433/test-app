package com.sankuai.meituan.animplayer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final j b;
    public boolean c;
    public boolean d;
    public boolean e;

    public b(j jVar) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68fedb580d6756a819bff13782010fc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68fedb580d6756a819bff13782010fc9");
            return;
        }
        this.d = true;
        this.e = true;
        this.b = null;
    }
}
