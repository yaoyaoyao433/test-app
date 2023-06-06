package com.sankuai.meituan.kernel.net.msi.okhttp3;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static Map<String, com.sankuai.meituan.kernel.net.msi.okhttp3.a> b = new ConcurrentHashMap();
    private static Map<String, String> c = new ConcurrentHashMap();

    public static com.sankuai.meituan.kernel.net.msi.okhttp3.a a(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a8d712ca95308a33e4ccba3d2bbae93", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.kernel.net.msi.okhttp3.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a8d712ca95308a33e4ccba3d2bbae93");
        }
        String valueOf = String.valueOf(call.hashCode());
        if (b.containsKey(valueOf)) {
            return b.get(valueOf);
        }
        return null;
    }

    public static void a(String str, Call call) {
        Object[] objArr = {str, call};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94b5a09e0c68241cfc782f8ebdd292e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94b5a09e0c68241cfc782f8ebdd292e8");
        } else if (TextUtils.isEmpty(str) || call == null) {
        } else {
            c.put(str, String.valueOf(call.hashCode()));
        }
    }

    public static com.sankuai.meituan.kernel.net.msi.okhttp3.a a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        com.sankuai.meituan.kernel.net.msi.okhttp3.a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "804b8c73f4de570a99cb834576ce4131", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.kernel.net.msi.okhttp3.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "804b8c73f4de570a99cb834576ce4131");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (c.containsKey(str)) {
            str2 = c.get(str);
            c.remove(str);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar = b.get(str2);
            b.remove(str2);
        }
        com.sankuai.meituan.kernel.net.msi.log.a.b("call map size " + b.size());
        return aVar;
    }

    public static void a(Call call, com.sankuai.meituan.kernel.net.msi.okhttp3.a aVar) {
        Object[] objArr = {call, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aba30578a14f6326ae604a1dda4aa8bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aba30578a14f6326ae604a1dda4aa8bc");
        } else {
            b.put(String.valueOf(call.hashCode()), aVar);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa297bbe07222ddf6ba8289fbe939c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa297bbe07222ddf6ba8289fbe939c06");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (c.containsKey(str)) {
                str2 = c.get(str);
                c.remove(str);
            }
            if (TextUtils.isEmpty(str2) || b == null || !b.containsKey(str2)) {
                return;
            }
            b.remove(str2);
        }
    }

    public static void b(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28c63c9061e6af2679897296831a1749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28c63c9061e6af2679897296831a1749");
        } else if (call == null) {
        } else {
            String valueOf = String.valueOf(call.hashCode());
            if (TextUtils.isEmpty(valueOf) || b == null || !b.containsKey(valueOf)) {
                return;
            }
            b.remove(valueOf);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends EventListener {
        public static ChangeQuickRedirect a;

        @Override // okhttp3.EventListener
        public final void callStart(Call call) {
            Object[] objArr = {call};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b1abe578c5fb94b23662bc5f666830", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b1abe578c5fb94b23662bc5f666830");
                return;
            }
            super.callStart(call);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a aVar = new com.sankuai.meituan.kernel.net.msi.okhttp3.a();
            aVar.b = SystemClock.elapsedRealtime();
            c.a(call, aVar);
        }

        @Override // okhttp3.EventListener
        public final void dnsStart(Call call, String str) {
            Object[] objArr = {call, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e937bc6e0d0daea107923e81845051f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e937bc6e0d0daea107923e81845051f3");
                return;
            }
            super.dnsStart(call, str);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.d = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void dnsEnd(Call call, String str, List<InetAddress> list) {
            Object[] objArr = {call, str, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d3f0664451e4426ec74b9cc539e8137", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d3f0664451e4426ec74b9cc539e8137");
                return;
            }
            super.dnsEnd(call, str, list);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.e = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            Object[] objArr = {call, inetSocketAddress, proxy};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b48b298c347c46386f871c932495be7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b48b298c347c46386f871c932495be7a");
                return;
            }
            super.connectStart(call, inetSocketAddress, proxy);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.f = SystemClock.elapsedRealtime();
                a2.o = false;
            }
        }

        @Override // okhttp3.EventListener
        public final void secureConnectStart(Call call) {
            Object[] objArr = {call};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93297c3ec1bbb4deeab0392462234872", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93297c3ec1bbb4deeab0392462234872");
                return;
            }
            super.secureConnectStart(call);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.h = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void secureConnectEnd(Call call, Handshake handshake) {
            Object[] objArr = {call, handshake};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c403a7b651f294e295b77e102da65f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c403a7b651f294e295b77e102da65f1");
                return;
            }
            super.secureConnectEnd(call, handshake);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.i = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            Object[] objArr = {call, inetSocketAddress, proxy, protocol};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32d00c86c1c30b4926410ac6be1379a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32d00c86c1c30b4926410ac6be1379a");
                return;
            }
            super.connectEnd(call, inetSocketAddress, proxy, protocol);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.g = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
            Object[] objArr = {call, inetSocketAddress, proxy, protocol, iOException};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12f4c5d16098d2ec9df6a79eb499725a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12f4c5d16098d2ec9df6a79eb499725a");
                return;
            }
            super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.g = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void connectionAcquired(Call call, Connection connection) {
            Socket socket;
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2;
            Object[] objArr = {call, connection};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b2fe8a9bfc3333cbb7db605b42757e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b2fe8a9bfc3333cbb7db605b42757e");
                return;
            }
            super.connectionAcquired(call, connection);
            if (connection == null || (socket = connection.socket()) == null || socket.getInetAddress() == null || (a2 = c.a(call)) == null) {
                return;
            }
            a2.m = socket.getInetAddress().getHostAddress();
            a2.n = socket.getPort();
            if (a2.f == 0) {
                a2.o = true;
            }
        }

        @Override // okhttp3.EventListener
        public final void connectionReleased(Call call, Connection connection) {
            Object[] objArr = {call, connection};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32d77a72c52a76652a1974b5228ad8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32d77a72c52a76652a1974b5228ad8c");
            } else {
                super.connectionReleased(call, connection);
            }
        }

        @Override // okhttp3.EventListener
        public final void requestHeadersStart(Call call) {
            Object[] objArr = {call};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "032edfab6564d25d09630a28290f2513", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "032edfab6564d25d09630a28290f2513");
                return;
            }
            super.requestHeadersStart(call);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.j = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void requestBodyEnd(Call call, long j) {
            Object[] objArr = {call, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa3a132ee3bc184beabcb51890413b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa3a132ee3bc184beabcb51890413b5");
                return;
            }
            super.requestBodyEnd(call, j);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.k = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void responseBodyEnd(Call call, long j) {
            Object[] objArr = {call, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae658cb544519bfda38d76a64cb1c558", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae658cb544519bfda38d76a64cb1c558");
                return;
            }
            super.responseBodyEnd(call, j);
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.l = SystemClock.elapsedRealtime();
            }
            com.sankuai.meituan.kernel.net.msi.log.a.b("Monitor responseBodyEnd");
        }

        @Override // okhttp3.EventListener
        public final void callEnd(Call call) {
            Object[] objArr = {call};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31746256965999bfac7a42da0d874107", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31746256965999bfac7a42da0d874107");
                return;
            }
            super.callEnd(call);
            com.sankuai.meituan.kernel.net.msi.log.a.b("Monitor callEnd");
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.c = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void callFailed(Call call, IOException iOException) {
            Object[] objArr = {call, iOException};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7a465afffad66f966671f13afa7fbf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7a465afffad66f966671f13afa7fbf");
                return;
            }
            super.callFailed(call, iOException);
            com.sankuai.meituan.kernel.net.msi.log.a.b("Monitor callFailed");
            com.sankuai.meituan.kernel.net.msi.okhttp3.a a2 = c.a(call);
            if (a2 != null) {
                a2.c = SystemClock.elapsedRealtime();
            }
        }
    }
}
