package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bumptech.glide.manager.c;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements c {
    final c.a a;
    boolean b;
    private final Context c;
    private boolean d;
    private final BroadcastReceiver e = new BroadcastReceiver() { // from class: com.bumptech.glide.manager.DefaultConnectivityMonitor$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = e.this.b;
            e eVar = e.this;
            e eVar2 = e.this;
            eVar.b = e.a(context);
            if (z != e.this.b) {
                e.this.a.a(e.this.b);
            }
        }
    };

    @Override // com.bumptech.glide.manager.h
    public final void e() {
    }

    public e(Context context, c.a aVar) {
        this.c = context.getApplicationContext();
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    @Override // com.bumptech.glide.manager.h
    public final void c() {
        if (this.d) {
            return;
        }
        this.b = a(this.c);
        this.c.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.d = true;
    }

    @Override // com.bumptech.glide.manager.h
    public final void d() {
        if (this.d) {
            this.c.unregisterReceiver(this.e);
            this.d = false;
        }
    }
}
