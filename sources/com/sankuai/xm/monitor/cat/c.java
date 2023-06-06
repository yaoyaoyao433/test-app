package com.sankuai.xm.monitor.cat;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private d b;
    private boolean c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final c a = new c();
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c4a146c49279fd0a981521a3127cf97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c4a146c49279fd0a981521a3127cf97");
        } else {
            this.c = true;
        }
    }

    public final synchronized void a(Context context, int i, String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee7e9069519f2b44430f59643591bf5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee7e9069519f2b44430f59643591bf5");
            return;
        }
        if (this.b == null) {
            this.b = new d(context, i, str);
            if (this.c) {
                a();
                return;
            }
            b();
        }
    }

    private synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99181268085ecd2715cb2783befddf62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99181268085ecd2715cb2783befddf62");
            return;
        }
        this.c = true;
        if (this.b != null && !this.b.a()) {
            d dVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "e40c4c3404cc269def4a813791e1c49e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "e40c4c3404cc269def4a813791e1c49e");
            } else {
                dVar.c.set(true);
                com.sankuai.xm.threadpool.scheduler.a.b().a(22, d.b, 300000L);
            }
        }
    }

    private synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc50ac729e2db36af9e92e83d0abd1f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc50ac729e2db36af9e92e83d0abd1f1");
            return;
        }
        this.c = false;
        if (this.b != null && this.b.a()) {
            d dVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "66b8aeb6814c9c4e6f830b15f7f30a45", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "66b8aeb6814c9c4e6f830b15f7f30a45");
                return;
            }
            dVar.c.set(false);
        }
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6f0c5c7602747c57a2cdfff48b02b94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6f0c5c7602747c57a2cdfff48b02b94");
        } else if (this.c) {
            b bVar = new b();
            if (map.containsKey("time")) {
                bVar.g = ((Long) map.get("time")).longValue();
            }
            if (map.containsKey("code")) {
                bVar.c = ((Integer) map.get("code")).intValue();
            }
            if (map.containsKey(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE)) {
                bVar.d = ((Integer) map.get(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE)).intValue();
            }
            if (map.containsKey("url")) {
                bVar.b = (String) map.get("url");
            }
            if (map.containsKey("request_size")) {
                bVar.e = ((Integer) map.get("request_size")).intValue();
            }
            if (map.containsKey("response_size")) {
                bVar.f = ((Integer) map.get("response_size")).intValue();
            }
            if (map.containsKey("extraData")) {
                bVar.h = (String) map.get("extraData");
            }
            if (map.containsKey("tunnel")) {
                bVar.i = ((Integer) map.get("tunnel")).intValue();
            }
            if (this.b != null) {
                this.b.a(bVar);
            }
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86cddc270a751a6f8b266a9fee7f7610", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86cddc270a751a6f8b266a9fee7f7610");
        } else if (this.b != null) {
            this.b.a(bVar);
        }
    }
}
