package com.dianping.nvnetwork.tunnel2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager;
import com.dianping.nvnetwork.tunnel2.e;
import com.dianping.nvnetwork.util.l;
import com.dianping.nvnetwork.util.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends e implements com.dianping.nvnetwork.http.a {
    public static ChangeQuickRedirect k;
    private static Handler l;
    private int m;

    public static /* synthetic */ void a(f fVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "75ddaafb6f2e496f22cdcaf3168df6a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "75ddaafb6f2e496f22cdcaf3168df6a5");
        } else if (com.dianping.nvnetwork.g.p()) {
            com.dianping.nvnetwork.util.g.a("tunnel_unsubscribed");
        }
    }

    public static /* synthetic */ int b(f fVar, Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "35f6ff8350840eb16b0fe186acc3516d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "35f6ff8350840eb16b0fe186acc3516d")).intValue();
        }
        if (request.h <= 0) {
            return com.dianping.nvnetwork.h.h().c();
        }
        return request.h;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("nio_tunnel_handler");
        handlerThread.start();
        l = new Handler(handlerThread.getLooper());
    }

    public f(Context context) {
        super(context);
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a50e8a1aa3df97af5102370d3eb953", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a50e8a1aa3df97af5102370d3eb953");
            return;
        }
        this.m = -1;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcd9f8a084c43dc136421bb9aeeddb35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcd9f8a084c43dc136421bb9aeeddb35");
        } else {
            String str2 = Build.MODEL;
            String valueOf = String.valueOf(Build.VERSION.SDK_INT);
            String str3 = "";
            if (context != null && context.getResources() != null) {
                if (context.getResources().getDisplayMetrics() == null) {
                    str = "";
                } else {
                    str = context.getResources().getDisplayMetrics().heightPixels + "*" + context.getResources().getDisplayMetrics().widthPixels;
                }
                str3 = str;
            }
            this.f.setDeviceInfo(str2, valueOf, "android", str3);
        }
        this.f.addOnSocketSecureManagerEventLisenter(new SocketSecureManager.OnSocketSecureManagerEventLisenter() { // from class: com.dianping.nvnetwork.tunnel2.f.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager.OnSocketSecureManagerEventLisenter
            public final void onCreateB2KeyInfoEvent(boolean z, String str4, int i) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str4, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4e036f00bd118ed134b2160728574c4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4e036f00bd118ed134b2160728574c4");
                } else if (com.dianping.nvnetwork.h.h().G) {
                    com.dianping.nvnetwork.g.d().pv3(0L, "tunnel_encrypt", 0, 1, z ? 200 : -145, 0, 0, i, str4);
                    if (z) {
                        f.this.b();
                        f.this.b("encrypt > callback : get encrypt success");
                        return;
                    }
                    f.this.b("encrypt > callback : get encrypt failure");
                }
            }

            @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager.OnSocketSecureManagerEventLisenter
            public final void onSignB2KeyEvent(boolean z, String str4, int i) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str4, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63fdda79bf10fc57ac1c9b1bcb48324e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63fdda79bf10fc57ac1c9b1bcb48324e");
                } else if (com.dianping.nvnetwork.h.h().G) {
                    com.dianping.nvnetwork.g.d().pv3(0L, "tunnel_encrypt_sign", 0, 1, z ? 200 : -147, 0, 0, i, str4);
                }
            }
        });
    }

    @Override // com.dianping.nvnetwork.tunnel2.e
    public final void a(com.dianping.nvnetwork.tunnel.c cVar, int i, Object obj) {
        Object[] objArr = {cVar, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f33e8a5c476dbec40296a2594ae5d5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f33e8a5c476dbec40296a2594ae5d5e");
            return;
        }
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c373e272ad784d618b88efe7c91c4aaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c373e272ad784d618b88efe7c91c4aaf");
        } else if (n.a(cVar.c)) {
            cVar.g = true;
        }
        super.a(cVar, i, obj);
        int b = com.dianping.nvnetwork.g.f().b();
        if (b != this.m) {
            if (this.m != -1) {
                this.g.a(true);
                l.a().a(new j(2, null));
            }
            this.m = b;
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.e
    public final e.b a(com.dianping.nvnetwork.tunnel.c cVar, Object obj) {
        a aVar = (a) obj;
        aVar.b = cVar;
        return aVar;
    }

    @Override // com.dianping.nvnetwork.tunnel2.e
    public final void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a51c3008ef9d35fbb436e16b21be309", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a51c3008ef9d35fbb436e16b21be309");
        } else {
            l.postDelayed(runnable, j);
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.e
    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af2703efc1c48e5576ab482c0311806", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af2703efc1c48e5576ab482c0311806");
        } else {
            l.removeCallbacks(runnable);
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.e
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9da65eb224f4be909decc1495ae3565", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9da65eb224f4be909decc1495ae3565")).booleanValue() : com.dianping.nvnetwork.util.g.a(3);
    }

    @Override // com.dianping.nvnetwork.tunnel2.e
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12f01d4112b8e67bfc738fecfe1a68b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12f01d4112b8e67bfc738fecfe1a68b0");
            return;
        }
        com.dianping.nvnetwork.util.g.a("tunnel:" + str);
    }

    @Override // com.dianping.nvnetwork.tunnel2.e
    public final void b(e.b bVar) {
        q b;
        InetAddress secureSocketAddress;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b200d3e01f64bbfaa87cd125cf624b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b200d3e01f64bbfaa87cd125cf624b");
            return;
        }
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bda6f75c19068d7503a6326229ad25f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bda6f75c19068d7503a6326229ad25f");
            return;
        }
        a aVar = (a) bVar;
        String str = null;
        if (bVar.c != null && (secureSocketAddress = bVar.c.getSecureSocketAddress()) != null) {
            str = secureSocketAddress.getHostAddress();
        }
        if (aVar.d == null || aVar.d.b <= 0) {
            if (aVar.d == null) {
                q.a aVar2 = new q.a();
                aVar2.c = -150;
                aVar2.j = StringUtil.NULL;
                b = aVar2.build();
            } else {
                b = b(aVar.d);
            }
            b.b = 1;
            b.d = str;
            b.k = bVar.h;
            aVar.a(b);
            return;
        }
        if (aVar.d.d != null && aVar.d.d.length > com.dianping.nvnetwork.h.h().y && com.dianping.nvnetwork.g.d() != null) {
            com.dianping.nvnetwork.g.d().pv4(0L, "tunnel_big_request", com.dianping.nvnetwork.g.f().b(), 2, 200, 0, aVar.d.d.length, (int) (d() - aVar.e), null, aVar.b.c);
        }
        q b2 = b(aVar.d);
        b2.b = 1;
        b2.d = str;
        b2.k = bVar.h;
        aVar.a(b2);
    }

    private q b(com.dianping.nvnetwork.tunnel.d dVar) {
        HashMap<String, String> hashMap;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e93ee0de0065d0b3f45cbc8746d8d72b", 6917529027641081856L)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e93ee0de0065d0b3f45cbc8746d8d72b");
        }
        if (dVar.c != null) {
            hashMap = new HashMap<>();
            Iterator<String> keys = dVar.c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, dVar.c.optString(next));
            }
        } else {
            hashMap = null;
        }
        q.a aVar = new q.a();
        aVar.c = dVar.b;
        aVar.b = dVar.d;
        aVar.e = hashMap;
        aVar.j = dVar.b <= 0 ? "error" : null;
        aVar.i = dVar.b > 0;
        return aVar.build();
    }

    @Override // com.dianping.nvnetwork.http.a
    public final rx.d<q> exec(final Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10122ce1c8cb998ac69926e314521461", 6917529027641081856L) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10122ce1c8cb998ac69926e314521461") : rx.d.a((d.a) new d.a<q>() { // from class: com.dianping.nvnetwork.tunnel2.f.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                rx.j jVar = (rx.j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e9ca5394ea95281177a720b696a7f84", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e9ca5394ea95281177a720b696a7f84");
                } else if (!jVar.isUnsubscribed()) {
                    f.this.a(f.this.a(request), f.b(f.this, request), new a(request, jVar));
                } else {
                    f.a(f.this, 400);
                }
            }
        });
    }

    private byte[] a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6060dd12610423e2b63d04a2af3e02e8", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6060dd12610423e2b63d04a2af3e02e8");
        }
        if (inputStream == null) {
            return null;
        }
        try {
            if (inputStream.markSupported()) {
                inputStream.mark(0);
            }
            int available = inputStream.available();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(available > 0 ? available : 4096);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            if (inputStream.markSupported()) {
                inputStream.reset();
            }
            if (byteArrayOutputStream.size() != available) {
                com.dianping.networklog.c.a("TransferBody available = " + available + ", bSize = " + byteArrayOutputStream.size(), 4);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.e
    public final void a(e.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f7b8d642be31972c0471664e16a27bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f7b8d642be31972c0471664e16a27bd");
        } else if (bVar instanceof a) {
            a aVar = (a) bVar;
            if (aVar.m == null || aVar.m.isUnsubscribed()) {
                return;
            }
            rx.j<? super q> jVar = aVar.m;
            q.a aVar2 = new q.a();
            aVar2.c = 9999;
            jVar.onNext(aVar2.build());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends e.b {
        public static ChangeQuickRedirect k;
        public Request l;
        public rx.j<? super q> m;

        public a(Request request, rx.j<? super q> jVar) {
            super();
            Object[] objArr = {f.this, request, jVar};
            ChangeQuickRedirect changeQuickRedirect = k;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a959f44503287b92e00d9bf8005336f4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a959f44503287b92e00d9bf8005336f4");
                return;
            }
            this.l = request;
            this.m = jVar;
        }

        public final void a(q qVar) {
            Object[] objArr = {qVar};
            ChangeQuickRedirect changeQuickRedirect = k;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ba5e84ad125ebb7951bbeb2e57a622", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ba5e84ad125ebb7951bbeb2e57a622");
            } else if (this.m != null && !this.m.isUnsubscribed()) {
                com.dianping.nvnetwork.c.a(this.d.a).b(System.nanoTime());
                this.m.onNext(qVar);
                this.m.onCompleted();
            } else {
                f.this.a(this.b.a);
                f.a(f.this, 200);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.dianping.nvnetwork.tunnel.c a(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96aacf0668e52e96f898e217fa57a113", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.tunnel.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96aacf0668e52e96f898e217fa57a113");
        }
        InputStream inputStream = request.i;
        HashMap<String, String> hashMap = request.g;
        com.dianping.nvnetwork.tunnel.c cVar = new com.dianping.nvnetwork.tunnel.c();
        cVar.a = request.b();
        cVar.j = request.c();
        cVar.b = request.f;
        cVar.c = request.d;
        cVar.i = request.b;
        cVar.h = com.dianping.nvnetwork.h.h().aq;
        if (com.dianping.nvnetwork.g.p()) {
            request.a("MKTunnelType", "tcp");
        }
        if (hashMap != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            cVar.d = jSONObject;
        }
        cVar.f = a(inputStream);
        if (cVar.f != null && cVar.f.length > com.dianping.nvnetwork.h.h().y && com.dianping.nvnetwork.g.d() != null) {
            com.dianping.nvnetwork.g.d().pv4(0L, "tunnel_big_request", com.dianping.nvnetwork.g.f().b(), 2, 400, cVar.f.length, 0, 0, null, cVar.c);
        }
        return cVar;
    }
}
