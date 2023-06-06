package com.reactnativecommunity.netinfo;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends b {
    private final C0534a c;

    @Override // com.reactnativecommunity.netinfo.b
    public final /* bridge */ /* synthetic */ void a(@Nullable String str, String str2, Promise promise) {
        super.a(str, str2, promise);
    }

    @Override // com.reactnativecommunity.netinfo.b
    public final /* bridge */ /* synthetic */ void a(boolean z) {
        super.a(z);
    }

    public a(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.c = new C0534a();
    }

    @Override // com.reactnativecommunity.netinfo.b
    public final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.b.registerReceiver(this.c, intentFilter);
        this.c.a = true;
        c();
    }

    @Override // com.reactnativecommunity.netinfo.b
    public final void b() {
        if (this.c.a) {
            this.b.unregisterReceiver(this.c);
            this.c.a = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    void c() {
        boolean z;
        NetworkInfo activeNetworkInfo;
        com.reactnativecommunity.netinfo.types.b bVar = com.reactnativecommunity.netinfo.types.b.UNKNOWN;
        com.reactnativecommunity.netinfo.types.a aVar = null;
        int i = null;
        try {
            activeNetworkInfo = this.a.getActiveNetworkInfo();
        } catch (SecurityException unused) {
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = activeNetworkInfo.isConnected();
            try {
                int type = activeNetworkInfo.getType();
                switch (type) {
                    case 0:
                    case 4:
                        bVar = com.reactnativecommunity.netinfo.types.b.CELLULAR;
                        com.reactnativecommunity.netinfo.types.a a = com.reactnativecommunity.netinfo.types.a.a(activeNetworkInfo);
                        aVar = a;
                        i = a;
                        break;
                    case 1:
                        bVar = com.reactnativecommunity.netinfo.types.b.WIFI;
                        i = type;
                        break;
                    case 6:
                        bVar = com.reactnativecommunity.netinfo.types.b.WIMAX;
                        i = type;
                        break;
                    case 7:
                        bVar = com.reactnativecommunity.netinfo.types.b.BLUETOOTH;
                        i = type;
                        break;
                    case 9:
                        bVar = com.reactnativecommunity.netinfo.types.b.ETHERNET;
                        i = type;
                        break;
                    case 17:
                        bVar = com.reactnativecommunity.netinfo.types.b.VPN;
                        i = type;
                        break;
                    default:
                        i = type;
                        break;
                }
            } catch (SecurityException unused2) {
                i = z;
                bVar = com.reactnativecommunity.netinfo.types.b.UNKNOWN;
                z = i;
                a(bVar, aVar, z);
            }
            a(bVar, aVar, z);
        }
        bVar = com.reactnativecommunity.netinfo.types.b.NONE;
        z = false;
        a(bVar, aVar, z);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.reactnativecommunity.netinfo.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0534a extends BroadcastReceiver {
        boolean a;

        private C0534a() {
            this.a = false;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            a.this.c();
        }
    }
}
