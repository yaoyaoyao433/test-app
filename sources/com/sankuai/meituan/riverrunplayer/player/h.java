package com.sankuai.meituan.riverrunplayer.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;
    boolean d;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b720b0e9215f77d5341ba43a35134317", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b720b0e9215f77d5341ba43a35134317");
            return;
        }
        this.b = false;
        this.c = true;
        this.d = true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        h b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddc1f3f4ab98f7297bfb3daf3d8bd821", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddc1f3f4ab98f7297bfb3daf3d8bd821");
            } else {
                this.b = new h();
            }
        }
    }
}
