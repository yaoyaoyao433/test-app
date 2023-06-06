package com.dianping.nvnetwork.shark;

import android.content.Context;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.shark.e;
import com.dianping.nvtunnelkit.core.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f implements com.dianping.nvnetwork.http.a {
    public static ChangeQuickRedirect a;
    private final Context b;
    private volatile e c;

    public f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21381db197cd025fae51e7288a61e030", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21381db197cd025fae51e7288a61e030");
        } else {
            this.b = context;
        }
    }

    @Override // com.dianping.nvnetwork.http.a
    public rx.d<q> exec(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08e4fd33ed13a9a0d0c3139b940a66de", 6917529027641081856L) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08e4fd33ed13a9a0d0c3139b940a66de") : a(request).exec(request);
    }

    public e a(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "384810cc7b54ac51debd17771a244068", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "384810cc7b54ac51debd17771a244068");
        }
        if (this.c == null) {
            synchronized (f.class) {
                if (this.c == null) {
                    this.c = new e(this.b, e.c.TCP_OLD);
                }
            }
        }
        return this.c;
    }

    public final void b(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b40b7adb52b786f4c235eb0d99a0e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b40b7adb52b786f4c235eb0d99a0e6");
            return;
        }
        e a2 = a(request);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "df2d148b152b56dc5dcb06adcf48b39d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "df2d148b152b56dc5dcb06adcf48b39d");
        } else {
            a2.a();
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "364fc45f6a10378b8bbc1bc732835222", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "364fc45f6a10378b8bbc1bc732835222")).intValue();
        }
        try {
            e a2 = a(null);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0ce409109b8b5be282ab89d73a5fec3f", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0ce409109b8b5be282ab89d73a5fec3f")).intValue();
            }
            List b = a2.c.a().b();
            if (b.isEmpty()) {
                return Integer.MAX_VALUE;
            }
            c cVar = (c) b.get(0);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvnetwork.tnold.a.d;
            i.a b2 = PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "60a2f8b56e763433211d52b0b64b91e1", 6917529027641081856L) ? (i.a) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "60a2f8b56e763433211d52b0b64b91e1") : ((com.dianping.nvnetwork.tnold.a) cVar).f.b();
            c cVar2 = (c) b.get(0);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.dianping.nvtunnelkit.conn.b.j;
            i.a b3 = PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "2704e1c89ccc2a832428ba068bcb2983", RobustBitConfig.DEFAULT_VALUE) ? (i.a) PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "2704e1c89ccc2a832428ba068bcb2983") : cVar2.u.b();
            return b2.b > b3.b ? b2.a : b3.a;
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }
}
