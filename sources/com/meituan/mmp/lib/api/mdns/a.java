package com.meituan.mmp.lib.api.mdns;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Map<InterfaceC0398a, NsdManager.DiscoveryListener> b;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.api.mdns.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0398a {
        void a();

        void a(b bVar);

        void b();

        void b(b bVar);

        void c();

        void d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface d {
        void a(b bVar);

        void b(b bVar);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c35b721ee07f57ee1a683b5c9ec4cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c35b721ee07f57ee1a683b5c9ec4cd");
        } else {
            this.b = new ConcurrentHashMap();
        }
    }

    public static NsdManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a63b250a0867482f99bc62f70669ed0f", RobustBitConfig.DEFAULT_VALUE) ? (NsdManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a63b250a0867482f99bc62f70669ed0f") : (NsdManager) MMPEnvHelper.getEnvInfo().getApplicationContext().getSystemService("servicediscovery");
    }

    public final void a(InterfaceC0398a interfaceC0398a) {
        Object[] objArr = {interfaceC0398a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99db7f79325a11d535c91ebb734fa07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99db7f79325a11d535c91ebb734fa07c");
            return;
        }
        synchronized (this.b) {
            if (this.b.containsKey(interfaceC0398a)) {
                try {
                    a().stopServiceDiscovery(this.b.get(interfaceC0398a));
                } catch (Throwable unused) {
                }
                this.b.remove(interfaceC0398a);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class c implements NsdManager.ResolveListener {
        public static ChangeQuickRedirect a;
        public final d b;

        public c(d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e37fe099328678e9a9b3e3a21675f4e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e37fe099328678e9a9b3e3a21675f4e8");
            } else {
                this.b = dVar;
            }
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
            Object[] objArr = {nsdServiceInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761976f709f29e5a9df9be241cb31281", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761976f709f29e5a9df9be241cb31281");
            } else if (i != 3) {
                this.b.a(new b(nsdServiceInfo));
            }
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
            Object[] objArr = {nsdServiceInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5db3b924826966f4f676deda50e9aae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5db3b924826966f4f676deda50e9aae");
            } else {
                this.b.b(new b(nsdServiceInfo));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class e implements NsdManager.DiscoveryListener {
        public static ChangeQuickRedirect a;
        public final InterfaceC0398a b;

        public e(InterfaceC0398a interfaceC0398a) {
            Object[] objArr = {interfaceC0398a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf8b5b2c1568def5727290632a104c48", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf8b5b2c1568def5727290632a104c48");
            } else {
                this.b = interfaceC0398a;
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onStartDiscoveryFailed(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6401f96bfe7160b9e9b3d41ea31258", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6401f96bfe7160b9e9b3d41ea31258");
            } else {
                this.b.a();
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onStopDiscoveryFailed(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a66b17305a8ef843f73a972694ef75", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a66b17305a8ef843f73a972694ef75");
            } else {
                this.b.b();
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onDiscoveryStarted(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3b82bc4f7faa9b9864b0ec570cfc94f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3b82bc4f7faa9b9864b0ec570cfc94f");
            } else {
                this.b.c();
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onDiscoveryStopped(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c3c234c8888fc57bad9ee385f86647", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c3c234c8888fc57bad9ee385f86647");
            } else {
                this.b.d();
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            Object[] objArr = {nsdServiceInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6eff6b04b5084effa342445bc17ff77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6eff6b04b5084effa342445bc17ff77");
            } else {
                this.b.a(new b(nsdServiceInfo));
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            Object[] objArr = {nsdServiceInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec7af12fa705253dc9cf8737c02aa1c3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec7af12fa705253dc9cf8737c02aa1c3");
            } else {
                this.b.b(new b(nsdServiceInfo));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public String a;
        public String b;
        public String c;
        public int d;

        public b(NsdServiceInfo nsdServiceInfo) {
            InetAddress host = nsdServiceInfo.getHost();
            if (host != null) {
                this.c = host.getHostAddress();
            }
            this.d = nsdServiceInfo.getPort();
            this.a = nsdServiceInfo.getServiceName();
            this.b = nsdServiceInfo.getServiceType();
        }
    }
}
