package com.reactnativecommunity.netinfo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;
/* compiled from: ProGuard */
@TargetApi(24)
/* loaded from: classes3.dex */
public final class e extends b {
    Network c;
    NetworkCapabilities d;
    private final a e;

    public e(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.c = null;
        this.d = null;
        this.e = new a();
    }

    @SuppressLint({"MissingPermission"})
    final void c() {
        boolean z;
        com.reactnativecommunity.netinfo.types.b bVar = com.reactnativecommunity.netinfo.types.b.UNKNOWN;
        com.reactnativecommunity.netinfo.types.a aVar = null;
        boolean z2 = false;
        if (this.d != null) {
            if (this.d.hasTransport(2)) {
                bVar = com.reactnativecommunity.netinfo.types.b.BLUETOOTH;
            } else if (this.d.hasTransport(0)) {
                bVar = com.reactnativecommunity.netinfo.types.b.CELLULAR;
            } else if (this.d.hasTransport(3)) {
                bVar = com.reactnativecommunity.netinfo.types.b.ETHERNET;
            } else if (this.d.hasTransport(1)) {
                bVar = com.reactnativecommunity.netinfo.types.b.WIFI;
            } else if (this.d.hasTransport(4)) {
                bVar = com.reactnativecommunity.netinfo.types.b.VPN;
            }
            NetworkInfo networkInfo = this.c != null ? this.a.getNetworkInfo(this.c) : null;
            if (Build.VERSION.SDK_INT >= 28) {
                z = !this.d.hasCapability(21);
            } else {
                z = (this.c == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            }
            if (this.d.hasCapability(12) && this.d.hasCapability(16) && !z) {
                z2 = true;
            }
            if (this.c != null && bVar == com.reactnativecommunity.netinfo.types.b.CELLULAR && z2) {
                aVar = com.reactnativecommunity.netinfo.types.a.a(networkInfo);
            }
        } else {
            bVar = com.reactnativecommunity.netinfo.types.b.NONE;
        }
        a(bVar, aVar, z2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a extends ConnectivityManager.NetworkCallback {
        private a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            e.this.c = network;
            e.this.d = e.this.a.getNetworkCapabilities(network);
            e.this.c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLosing(Network network, int i) {
            e.this.c = network;
            e.this.d = e.this.a.getNetworkCapabilities(network);
            e.this.c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            e.this.c = null;
            e.this.d = null;
            e.this.c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onUnavailable() {
            e.this.c = null;
            e.this.d = null;
            e.this.c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            e.this.c = network;
            e.this.d = networkCapabilities;
            e.this.c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (e.this.c != null) {
                e.this.c = network;
                e.this.d = e.this.a.getNetworkCapabilities(network);
            }
            e.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.reactnativecommunity.netinfo.b
    @SuppressLint({"MissingPermission"})
    public final void a() {
        try {
            this.a.registerDefaultNetworkCallback(this.e);
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("NetworkCallbackConnectivityReceiver@register", null, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.reactnativecommunity.netinfo.b
    public final void b() {
        try {
            this.a.unregisterNetworkCallback(this.e);
        } catch (IllegalArgumentException unused) {
        } catch (SecurityException unused2) {
        }
    }
}
