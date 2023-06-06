package com.meituan.android.pike.inner;

import com.meituan.android.pike.PikeClient;
import com.meituan.android.pike.bean.PikeLog;
import com.meituan.android.pike.manager.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import io.socket.client.b;
import io.socket.client.c;
import io.socket.client.e;
import java.net.URISyntaxException;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public e b;
    public boolean c;
    public c d;
    private b e;

    public a(PikeClient.a aVar, String str) {
        int i;
        int i2;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03bd71db2fb508cd444d306a9f37fa2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03bd71db2fb508cd444d306a9f37fa2d");
            return;
        }
        this.b = null;
        this.c = false;
        if (this.c) {
            return;
        }
        com.meituan.android.pike.manager.a aVar2 = a.C0344a.a;
        PikeLog.debug("BaseSocket", "socket init with url " + str);
        b.a aVar3 = new b.a();
        if (aVar.e != -1) {
            i = aVar.e;
        } else {
            i = aVar2.m;
        }
        aVar3.h = i;
        aVar3.c = aVar.f;
        if (aVar.g != -1) {
            i2 = aVar.g;
        } else {
            i2 = aVar2.l;
        }
        aVar3.d = i2;
        aVar3.f = aVar.h > 0 ? aVar.h : aVar2.m;
        aVar3.i = new String[]{"websocket"};
        aVar3.o = "/pike";
        try {
            this.b = io.socket.client.b.a(str, aVar3);
            if (aVar.i != null) {
                b(aVar.i);
            }
            this.c = true;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            this.c = false;
        }
    }

    private void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b035a12e206c76276d401cad39666236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b035a12e206c76276d401cad39666236");
            return;
        }
        this.d = cVar;
        if (this.e == null) {
            this.e = new b();
        }
        this.e.a(this.b, cVar);
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ebe83125616b51ea72303649b630035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ebe83125616b51ea72303649b630035");
        } else {
            b(cVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab7124662f12182169bdb55366ded72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab7124662f12182169bdb55366ded72");
        } else if (d()) {
            final e eVar = this.b;
            io.socket.thread.a.a(new Runnable() { // from class: io.socket.client.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (eVar.e) {
                        return;
                    }
                    e.c(eVar);
                    eVar.h.a((c.b) null);
                    if (c.d.OPEN == eVar.h.c) {
                        e.a(eVar);
                    }
                    eVar.a("connecting", new Object[0]);
                }
            });
        }
    }

    public final void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "8dbe2364578de0ff20a0a09e19583c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "8dbe2364578de0ff20a0a09e19583c64");
        } else if (d()) {
            PikeLog.debug("socket ", "sendMessage" + Arrays.toString(objArr));
            this.b.a(str, objArr);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a0c4bdaaf302aa9f9f10022fa87871c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a0c4bdaaf302aa9f9f10022fa87871c");
        } else if (d()) {
            this.b.a();
            c();
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a011ee32ccc90e3ed506d911d300d03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a011ee32ccc90e3ed506d911d300d03");
        } else {
            this.e.a(this.b);
        }
    }

    public boolean d() {
        return this.b != null && this.c;
    }
}
