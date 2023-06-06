package com.meituan.android.mtplayer.video.proxy;

import android.text.TextUtils;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;
    final Object b;
    final ExecutorService c;
    final Map<String, k> d;
    final Map<String, Set<Integer>> e;
    final ServerSocket f;
    private final int g;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd97f0c2f4f3d98a44d98d485c20ce08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd97f0c2f4f3d98a44d98d485c20ce08");
            return;
        }
        this.b = new Object();
        this.c = com.sankuai.android.jarvis.c.a("mtplayer-video-proxycache", 16);
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        try {
            this.f = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.g = this.f.getLocalPort();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            com.sankuai.android.jarvis.c.a("mtplayer_video-proxycache-init", new b(countDownLatch)).start();
            countDownLatch.await();
        } catch (IOException | InterruptedException e) {
            this.c.shutdown();
            Object[] objArr2 = {"mtplayer_video_proxy", "server_start_fail"};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mtplayer.video.sniffer.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a2892fd17d2368141f7e7fd6214b5ebc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a2892fd17d2368141f7e7fd6214b5ebc");
            } else {
                Sniffer.smell("mt_mtplayer_video_sdk", "mtplayer_video_proxy", "server_start_fail", "", "");
            }
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    public final k a(String str, d dVar, c cVar, String str2, r rVar, int i) {
        k kVar;
        Object[] objArr = {str, dVar, cVar, str2, rVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ee0674a3d13a0e9694eb50fc7074fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ee0674a3d13a0e9694eb50fc7074fd");
        }
        n.a(str);
        synchronized (this.b) {
            kVar = this.d.get(str);
            if (!str.startsWith("source://")) {
                a(str, i);
                if (kVar instanceof f) {
                    ((f) kVar).b = cVar;
                }
            }
            if (kVar == null) {
                if (str.startsWith("source://")) {
                    kVar = new u(str, rVar);
                } else {
                    kVar = new f(str, str2, dVar, cVar);
                }
                this.d.put(str, kVar);
            }
        }
        return kVar;
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cab662852c88b2f5057642cd39cee61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cab662852c88b2f5057642cd39cee61");
            return;
        }
        synchronized (this.b) {
            Set<Integer> set = this.e.get(str);
            if (set == null) {
                set = new HashSet<>();
                this.e.put(str, set);
            }
            set.add(Integer.valueOf(i));
        }
    }

    public final String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dcd1fd31adac3b42d75241c4eaa3a92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dcd1fd31adac3b42d75241c4eaa3a92");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("http://127.0.0.1");
        stringBuffer.append(CommonConstant.Symbol.COLON);
        stringBuffer.append(this.g);
        stringBuffer.append("/url");
        stringBuffer.append("=");
        stringBuffer.append(str);
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append("&cachepath");
            stringBuffer.append("=");
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        int size;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01ae6d1f496ab64f9df81558fd035c50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01ae6d1f496ab64f9df81558fd035c50")).intValue();
        }
        synchronized (this.b) {
            size = this.d.size();
        }
        return size;
    }

    void a(Socket socket) {
        Object[] objArr = {socket};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a8d38eace443c2547eaf0f5ec567609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a8d38eace443c2547eaf0f5ec567609");
            return;
        }
        b(socket);
        c(socket);
        d(socket);
    }

    private void b(Socket socket) {
        Object[] objArr = {socket};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede2a38d925fa237b795f4dade76b0a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede2a38d925fa237b795f4dade76b0a6");
            return;
        }
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException unused) {
            com.meituan.android.mtplayer.video.utils.c.b("Proxy", "HttpProxyCacheServer: Releasing input stream… Socket is closed by client.");
        } catch (IOException e) {
            a(new p("Error closing socket input stream", e));
        }
    }

    private void c(Socket socket) {
        Object[] objArr = {socket};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19c488c272fbad830290e8da692fa2e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19c488c272fbad830290e8da692fa2e0");
            return;
        }
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            com.meituan.android.mtplayer.video.utils.c.b("Proxy", "HttpProxyCacheServer: Failed to close socket on proxy side: {}. It seems client have already closed connection.", e);
        }
    }

    private void d(Socket socket) {
        Object[] objArr = {socket};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a2784ecf5d5a346101d0b5071c21ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a2784ecf5d5a346101d0b5071c21ac");
            return;
        }
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e) {
            a(new p("Error closing socket", e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075ea357bf4d3aa4e6bab7d56373461e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075ea357bf4d3aa4e6bab7d56373461e");
        } else {
            com.meituan.android.mtplayer.video.utils.c.a("Proxy", "HttpProxyCacheServer: HttpProxyCacheServer error", th);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public final class b implements Runnable {
        public static ChangeQuickRedirect a;
        private final CountDownLatch c;

        public b(CountDownLatch countDownLatch) {
            Object[] objArr = {h.this, countDownLatch};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0015f8ebf59547353981962148eef83a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0015f8ebf59547353981962148eef83a");
            } else {
                this.c = countDownLatch;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1b7b06fb73068773f61fb6564da722", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1b7b06fb73068773f61fb6564da722");
                return;
            }
            this.c.countDown();
            h hVar = h.this;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "33c2a51ed48e2990fc575f9caccd19d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "33c2a51ed48e2990fc575f9caccd19d0");
                return;
            }
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket accept = hVar.f.accept();
                    com.meituan.android.mtplayer.video.utils.c.b("Proxy", "HttpProxyCacheServer: Accept new socket " + accept);
                    hVar.c.submit(new a(accept));
                } catch (IOException e) {
                    hVar.a(new p("Error during waiting connection", e));
                    return;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    final class a implements Runnable {
        public static ChangeQuickRedirect a;
        private final Socket c;

        public a(Socket socket) {
            Object[] objArr = {h.this, socket};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2501fd27e1773acb35c58deab734264a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2501fd27e1773acb35c58deab734264a");
            } else {
                this.c = socket;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            StringBuilder sb;
            k kVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15020293a80097e6c44474d923294375", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15020293a80097e6c44474d923294375");
                return;
            }
            h hVar = h.this;
            Socket socket = this.c;
            Object[] objArr2 = {socket};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            try {
                if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "b6bd20a810dd62bd5e33010bd5bcf9e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "b6bd20a810dd62bd5e33010bd5bcf9e3");
                    return;
                }
                try {
                    try {
                        try {
                            e a2 = e.a(socket.getInputStream());
                            com.meituan.android.mtplayer.video.utils.c.b("Proxy", "HttpProxyCacheServer: Request to cache proxy:" + a2);
                            synchronized (hVar.b) {
                                kVar = hVar.d.get(a2.b);
                            }
                            if (kVar != null) {
                                kVar.a(a2, socket);
                            }
                            hVar.a(socket);
                            str = "Proxy";
                            sb = new StringBuilder("HttpProxyCacheServer: Opened connections: ");
                        } catch (p e) {
                            com.meituan.android.mtplayer.video.utils.c.a("Proxy", "HttpProxyCacheServer: network error in processSocket", e);
                            hVar.a(socket);
                            str = "Proxy";
                            sb = new StringBuilder("HttpProxyCacheServer: Opened connections: ");
                        }
                    } catch (IOException unused) {
                        com.meituan.android.mtplayer.video.utils.c.b("Proxy", "HttpProxyCacheServer: socket.getInputStream() error");
                        hVar.a(socket);
                        str = "Proxy";
                        sb = new StringBuilder("HttpProxyCacheServer: Opened connections: ");
                    }
                } catch (j e2) {
                    com.meituan.android.mtplayer.video.utils.c.a("Proxy", "HttpProxyCacheServer: ioexception in processSocket , upload to trace", e2);
                    com.meituan.android.mtplayer.video.sniffer.c.a("mtplayer_video_proxy", "server_process_request", com.meituan.android.mtplayer.video.sniffer.b.a(e2.toString(), e2.getStackTrace(), e2.getCause()));
                    hVar.a(socket);
                    str = "Proxy";
                    sb = new StringBuilder("HttpProxyCacheServer: Opened connections: ");
                } catch (SocketException unused2) {
                    com.meituan.android.mtplayer.video.utils.c.b("Proxy", "HttpProxyCacheServer: Closing socket… Socket is closed by client.");
                    hVar.a(socket);
                    str = "Proxy";
                    sb = new StringBuilder("HttpProxyCacheServer: Opened connections: ");
                }
                sb.append(hVar.a());
                com.meituan.android.mtplayer.video.utils.c.b(str, sb.toString());
            } catch (Throwable th) {
                hVar.a(socket);
                com.meituan.android.mtplayer.video.utils.c.b("Proxy", "HttpProxyCacheServer: Opened connections: " + hVar.a());
                throw th;
            }
        }
    }
}
