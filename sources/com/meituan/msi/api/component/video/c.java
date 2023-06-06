package com.meituan.msi.api.component.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;
    private com.meituan.msi.dispather.e b;
    private boolean c;
    private d d;

    public c(com.meituan.msi.dispather.e eVar, boolean z, d dVar) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45dc3bbb048fa81db9be413cf1b1364", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45dc3bbb048fa81db9be413cf1b1364");
            return;
        }
        this.c = false;
        this.d = null;
        this.b = eVar;
        this.c = z;
        this.d = dVar;
    }

    @Override // com.meituan.msi.api.component.video.a
    public final void a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0558bece78cd7a3d2174283d71308d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0558bece78cd7a3d2174283d71308d2");
        } else if (i != -1) {
            switch (i) {
                case 2:
                    a("onLoadedMetadata", this.d != null ? this.d.getMetaData() : null);
                    return;
                case 3:
                    a("onPlay");
                    return;
                case 4:
                    a("onPause");
                    return;
                case 5:
                case 6:
                    a("onWaiting");
                    return;
                case 7:
                    a("onEnded");
                    return;
                case 8:
                    a("onTimeUpdate", obj);
                    return;
                case 9:
                    a("onFullScreenChange", obj);
                    return;
                default:
                    return;
            }
        } else {
            a("onError");
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04323b105264149619ee4966693e4417", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04323b105264149619ee4966693e4417");
        } else {
            a(str, (Object) null);
        }
    }

    private void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf7f68fe1dbefe9b401fe0b3612b783e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf7f68fe1dbefe9b401fe0b3612b783e");
            return;
        }
        StringBuilder sb = new StringBuilder("eventName=");
        sb.append(str);
        sb.append(" data:");
        sb.append(obj);
        if (!this.c) {
            str = "video." + str;
        }
        if (this.b != null) {
            this.b.a(str, obj);
        }
    }
}
