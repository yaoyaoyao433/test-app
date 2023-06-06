package com.sankuai.meituan.riverrunplayer.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    int b;
    int c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77304347a8066ef5dc195ba64c05ffcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77304347a8066ef5dc195ba64c05ffcc");
            return;
        }
        this.b = 0;
        this.c = 0;
    }

    public final void a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean a() {
        return this.b >= 2 && this.b <= 8;
    }

    public final boolean b() {
        return this.c == 3;
    }
}
