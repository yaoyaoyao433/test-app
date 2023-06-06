package com.meituan.android.mtplayer.video.proxy;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f implements k {
    public static ChangeQuickRedirect a;
    c b;
    private final AtomicInteger c;
    private final String d;
    private final String e;
    private volatile g f;
    private final d g;
    private a h;

    public f(String str, String str2, d dVar, c cVar) {
        Object[] objArr = {str, str2, dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78bf5caae5a2b8d19d06a5d3d2edaff8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78bf5caae5a2b8d19d06a5d3d2edaff8");
            return;
        }
        this.c = new AtomicInteger(0);
        this.d = (String) n.a(str);
        this.g = (d) n.a(dVar);
        this.e = str2;
        this.b = cVar;
        this.h = new a(str);
    }

    private synchronized void b() throws j {
        g gVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe673c8b1b721fc50a20170cc6361ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe673c8b1b721fc50a20170cc6361ba");
            return;
        }
        if (this.f == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9847045d9e1c1e8e258fbb867503d82", RobustBitConfig.DEFAULT_VALUE)) {
                gVar = (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9847045d9e1c1e8e258fbb867503d82");
            } else {
                g gVar2 = new g(new i(this.d, this.g.f), new com.meituan.android.mtplayer.video.proxy.file.b(this.g.a(this.d, this.e), this.g.e));
                gVar2.d = this.h;
                gVar = gVar2;
            }
        } else {
            gVar = this.f;
        }
        this.f = gVar;
        if (this.f != null) {
            g gVar3 = this.f;
            c cVar = this.b;
            Object[] objArr3 = {cVar};
            ChangeQuickRedirect changeQuickRedirect3 = o.e;
            if (PatchProxy.isSupport(objArr3, gVar3, changeQuickRedirect3, false, "be911c8c95b7fbf8a02ae07bc477b51b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, gVar3, changeQuickRedirect3, false, "be911c8c95b7fbf8a02ae07bc477b51b");
            } else {
                com.meituan.android.mtplayer.video.utils.c.a("ProxyCache", "setCacheOptConfig: ");
                gVar3.j = cVar;
            }
        }
    }

    private synchronized void c() throws j {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a36556a6f1f92158a4cc34bb41f2c524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a36556a6f1f92158a4cc34bb41f2c524");
            return;
        }
        if (this.c.decrementAndGet() <= 0) {
            this.f.a();
            this.f = null;
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final void a(e eVar, Socket socket) throws p, j {
        String sb;
        boolean z = false;
        Object[] objArr = {eVar, socket};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e56bb058854eca47b53412adb49ff6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e56bb058854eca47b53412adb49ff6ed");
            return;
        }
        b();
        try {
            this.c.incrementAndGet();
            g gVar = this.f;
            Object[] objArr2 = {eVar, socket};
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "129f60f306f89dbd896c268cdedf3008", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "129f60f306f89dbd896c268cdedf3008");
            } else {
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                    Object[] objArr3 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "4d120128cd280a11345752d35701cd8b", RobustBitConfig.DEFAULT_VALUE)) {
                        sb = (String) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "4d120128cd280a11345752d35701cd8b");
                    } else {
                        String c = gVar.b.c();
                        boolean z2 = !TextUtils.isEmpty(c);
                        long a2 = gVar.c.d() ? gVar.c.a() : gVar.b.a();
                        boolean z3 = a2 >= 0;
                        long j = eVar.d ? a2 - eVar.c : a2;
                        boolean z4 = z3 && eVar.d;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(eVar.d ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
                        sb2.append("Accept-Ranges: bytes\n");
                        sb2.append(z3 ? gVar.a("Content-Length: %d\n", Long.valueOf(j)) : "");
                        sb2.append(z4 ? gVar.a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(eVar.c), Long.valueOf(a2 - 1), Long.valueOf(a2)) : "");
                        sb2.append(z2 ? gVar.a("Content-Type: %s\n", c) : "");
                        sb2.append("\n");
                        sb = sb2.toString();
                    }
                    bufferedOutputStream.write(sb.getBytes("UTF-8"));
                    long j2 = eVar.c;
                    Object[] objArr4 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                    if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "3826933badc5bbbb711898d0a3434e5d", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "3826933badc5bbbb711898d0a3434e5d")).booleanValue();
                    } else {
                        long a3 = gVar.b.a();
                        boolean z5 = a3 > 0;
                        long a4 = gVar.c.a();
                        if (!z5 || !eVar.d || ((float) eVar.c) <= ((float) a4) + (((float) a3) * 0.2f)) {
                            z = true;
                        }
                    }
                    if (z) {
                        gVar.a(bufferedOutputStream, j2);
                    } else {
                        gVar.b(bufferedOutputStream, j2);
                    }
                } catch (IOException e) {
                    throw new j("error when getOutputStream()", e);
                }
            }
        } finally {
            c();
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "812a044f8f6c864d1c6acfc5e83b2899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "812a044f8f6c864d1c6acfc5e83b2899");
            return;
        }
        this.c.set(0);
        if (this.h != null) {
            a.a(this.h);
        }
        if (this.f != null) {
            try {
                this.f.a();
            } catch (j e) {
                com.meituan.android.mtplayer.video.sniffer.c.a("mtplayer_video_proxy", "server_process_request", com.meituan.android.mtplayer.video.sniffer.b.a(e.toString(), e.getStackTrace(), e.getCause()));
            }
        }
        this.f = null;
    }

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd355e5ae5e2c7d98594f8be47242ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd355e5ae5e2c7d98594f8be47242ac");
        } else {
            a.a(this.h, bVar);
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fa330197882d767d022183e827e1e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fa330197882d767d022183e827e1e2");
        } else {
            a.b(this.h, bVar);
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37af892614891ad0ff32b2448bdacae8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37af892614891ad0ff32b2448bdacae8");
        }
        String str2 = TextUtils.isEmpty(str) ? "default" : str;
        d dVar = this.g;
        String str3 = this.d;
        Object[] objArr2 = {str3, str2};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        File file = null;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "a10e064e32ef841679f60b40f54ff98f", RobustBitConfig.DEFAULT_VALUE)) {
            file = (File) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "a10e064e32ef841679f60b40f54ff98f");
        } else {
            String a2 = dVar.d.a(str3);
            File file2 = new File(new File(dVar.c, str2), a2);
            if (file2.exists()) {
                file = file2;
            } else if (dVar.b != null && !dVar.b.equals(dVar.c)) {
                File file3 = new File(new File(dVar.b, str2), a2);
                if (file3.exists()) {
                    file = file3;
                }
            }
        }
        if (file != null && file.exists()) {
            Object[] objArr3 = {file};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4221c0f8825a9c11437c4a4fb1d300e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4221c0f8825a9c11437c4a4fb1d300e");
            } else {
                try {
                    this.g.e.a(file);
                } catch (IOException e) {
                    com.meituan.android.mtplayer.video.utils.c.a("Proxy", "Error touching file " + file, e);
                }
            }
            return Uri.fromFile(file).toString();
        }
        h b = l.a().b();
        if (b != null) {
            return b.a(this.d, str2);
        }
        return this.d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a extends Handler implements b {
        public static ChangeQuickRedirect a;
        private final String b;
        private final Set<b> c;
        private int d;
        private long e;

        public static /* synthetic */ void a(a aVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "61b28443f27c0a76b48f8c81c4843221", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "61b28443f27c0a76b48f8c81c4843221");
            } else {
                aVar.sendMessage(aVar.obtainMessage(0));
            }
        }

        public static /* synthetic */ void a(a aVar, b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "0c0e80b70afbddaf0194a7b8358bce9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "0c0e80b70afbddaf0194a7b8358bce9e");
            } else {
                aVar.sendMessage(aVar.obtainMessage(1, bVar));
            }
        }

        public static /* synthetic */ void b(a aVar, b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "935dd32c270fdcd69e58d37f0ee6ca11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "935dd32c270fdcd69e58d37f0ee6ca11");
            } else {
                aVar.sendMessage(aVar.obtainMessage(2, bVar));
            }
        }

        public a(String str) {
            super(Looper.getMainLooper());
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a69cb27b4835841f0056733f2a01410", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a69cb27b4835841f0056733f2a01410");
                return;
            }
            this.d = 0;
            this.e = 0L;
            this.b = str;
            this.c = Collections.synchronizedSet(new HashSet());
        }

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.android.mtplayer.video.proxy.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0299a {
            public static ChangeQuickRedirect a;
            final int b;
            final long c;

            private C0299a(int i, long j) {
                Object[] objArr = {Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8619a7fcfdea62d22fab4b2f6164a96c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8619a7fcfdea62d22fab4b2f6164a96c");
                    return;
                }
                this.b = i;
                this.c = j;
            }
        }

        @Override // com.meituan.android.mtplayer.video.proxy.b
        public final void a(String str, int i, long j) {
            Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d294a700c62286c514d5a508b2a5391f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d294a700c62286c514d5a508b2a5391f");
                return;
            }
            this.d = i;
            this.e = j;
            sendMessage(obtainMessage(3, new C0299a(i, j)));
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46c2994f27c52b2ea2b120eb8bc66ac0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46c2994f27c52b2ea2b120eb8bc66ac0");
                return;
            }
            switch (message.what) {
                case 0:
                    this.c.clear();
                    return;
                case 1:
                    if (!(message.obj instanceof b) || this.c.contains(message.obj)) {
                        return;
                    }
                    b bVar = (b) message.obj;
                    this.c.add(bVar);
                    if (this.d > 0 || this.e > 0) {
                        bVar.a(this.b, this.d, this.e);
                        return;
                    }
                    return;
                case 2:
                    if ((message.obj instanceof b) && this.c.contains(message.obj)) {
                        this.c.remove(message.obj);
                        return;
                    }
                    return;
                case 3:
                    if (message.obj instanceof C0299a) {
                        C0299a c0299a = (C0299a) message.obj;
                        for (b bVar2 : this.c) {
                            if (bVar2 != null) {
                                bVar2.a(this.b, c0299a.b, c0299a.c);
                            }
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
