package com.meituan.msi.api.network.okhttp3;

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
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static Map<String, b> b = new ConcurrentHashMap();
    private static Map<String, String> c = new ConcurrentHashMap();

    public static b a(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93796818f13df532f26055bea068d4c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93796818f13df532f26055bea068d4c8");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "593b02e3e3734ce9e9d599a35993fe0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "593b02e3e3734ce9e9d599a35993fe0c");
        } else if (TextUtils.isEmpty(str) || call == null) {
        } else {
            c.put(str, String.valueOf(call.hashCode()));
        }
    }

    public static b a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        b bVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0005a622eac9d99a786c4f97ecddb5ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0005a622eac9d99a786c4f97ecddb5ce");
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
            bVar = b.get(str2);
            b.remove(str2);
        }
        new StringBuilder("call map size ").append(b.size());
        return bVar;
    }

    public static void a(Call call, b bVar) {
        Object[] objArr = {call, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7993742f6f3892a77f9b4404310203e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7993742f6f3892a77f9b4404310203e");
        } else {
            b.put(String.valueOf(call.hashCode()), bVar);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fd55dd926c2b7141475459081ef9a71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fd55dd926c2b7141475459081ef9a71");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01542533e72163a4dee0420075097de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01542533e72163a4dee0420075097de4");
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
    /* loaded from: classes3.dex */
    public static class a extends EventListener {
        public static ChangeQuickRedirect a;

        @Override // okhttp3.EventListener
        public final void callStart(Call call) {
            Object[] objArr = {call};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a76a8366ed5fbc6d3286801dca5be6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a76a8366ed5fbc6d3286801dca5be6");
                return;
            }
            super.callStart(call);
            b bVar = new b();
            bVar.b = SystemClock.elapsedRealtime();
            c.a(call, bVar);
        }

        @Override // okhttp3.EventListener
        public final void dnsStart(Call call, String str) {
            Object[] objArr = {call, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0237939125094091f80985397e734869", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0237939125094091f80985397e734869");
                return;
            }
            super.dnsStart(call, str);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.d = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void dnsEnd(Call call, String str, List<InetAddress> list) {
            Object[] objArr = {call, str, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "039fa2d7ca57e08c55a639467c0100b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "039fa2d7ca57e08c55a639467c0100b8");
                return;
            }
            super.dnsEnd(call, str, list);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.e = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            Object[] objArr = {call, inetSocketAddress, proxy};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51f556e3bee26675e2cfe3fe4108a03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51f556e3bee26675e2cfe3fe4108a03");
                return;
            }
            super.connectStart(call, inetSocketAddress, proxy);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.f = SystemClock.elapsedRealtime();
                a2.o = false;
            }
        }

        @Override // okhttp3.EventListener
        public final void secureConnectStart(Call call) {
            Object[] objArr = {call};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ff5c9d8282fad39ad3be068434469c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ff5c9d8282fad39ad3be068434469c");
                return;
            }
            super.secureConnectStart(call);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.h = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void secureConnectEnd(Call call, Handshake handshake) {
            Object[] objArr = {call, handshake};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa3763598319e730f6bfc6b3ba0e2de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa3763598319e730f6bfc6b3ba0e2de");
                return;
            }
            super.secureConnectEnd(call, handshake);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.i = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            Object[] objArr = {call, inetSocketAddress, proxy, protocol};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be4140050d1c8261e36e4fba3fb0f558", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be4140050d1c8261e36e4fba3fb0f558");
                return;
            }
            super.connectEnd(call, inetSocketAddress, proxy, protocol);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.g = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
            Object[] objArr = {call, inetSocketAddress, proxy, protocol, iOException};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e7bfea69a52089c2534756d77fa2e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e7bfea69a52089c2534756d77fa2e3");
                return;
            }
            super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.g = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void connectionAcquired(Call call, Connection connection) {
            Socket socket;
            b a2;
            Object[] objArr = {call, connection};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee663d79fe18c7e58ee19a580510a2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee663d79fe18c7e58ee19a580510a2e");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b883db65a866def13b1515d1eedda01f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b883db65a866def13b1515d1eedda01f");
            } else {
                super.connectionReleased(call, connection);
            }
        }

        @Override // okhttp3.EventListener
        public final void requestHeadersStart(Call call) {
            Object[] objArr = {call};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df1c69327ddd0423428708e078e01762", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df1c69327ddd0423428708e078e01762");
                return;
            }
            super.requestHeadersStart(call);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.j = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void requestBodyEnd(Call call, long j) {
            Object[] objArr = {call, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3cba51981e51a1ba022c8761c7d7b05", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3cba51981e51a1ba022c8761c7d7b05");
                return;
            }
            super.requestBodyEnd(call, j);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.k = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void responseBodyEnd(Call call, long j) {
            Object[] objArr = {call, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aaf514a57a41d4a2c8d4513ec4265dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aaf514a57a41d4a2c8d4513ec4265dd");
                return;
            }
            super.responseBodyEnd(call, j);
            b a2 = c.a(call);
            if (a2 != null) {
                a2.l = SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.EventListener
        public final void callEnd(Call call) {
            Object[] objArr = {call};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bededd8f4be7d678e648c1685aa1f579", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bededd8f4be7d678e648c1685aa1f579");
            } else {
                super.callEnd(call);
            }
        }

        @Override // okhttp3.EventListener
        public final void callFailed(Call call, IOException iOException) {
            Object[] objArr = {call, iOException};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "719c6a51844e07963f0f12b42919459a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "719c6a51844e07963f0f12b42919459a");
            } else {
                super.callFailed(call, iOException);
            }
        }
    }
}
