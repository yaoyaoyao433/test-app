package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class AmazonFireDeviceConnectivityPoller {
    final Context b;
    final a c;
    Handler e;
    final Receiver a = new Receiver();
    final Runnable d = new b();
    boolean f = false;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void onAmazonFireDeviceConnectivityChanged(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AmazonFireDeviceConnectivityPoller(Context context, a aVar) {
        this.b = context;
        this.c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            return Build.MODEL.startsWith("AF") || Build.MODEL.startsWith("KF");
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class Receiver extends BroadcastReceiver {
        boolean a;
        private Boolean c;

        private Receiver() {
            this.a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z = false;
            } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                return;
            } else {
                z = true;
            }
            if (this.c == null || this.c.booleanValue() != z) {
                this.c = Boolean.valueOf(z);
                AmazonFireDeviceConnectivityPoller.this.c.onAmazonFireDeviceConnectivityChanged(z);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (AmazonFireDeviceConnectivityPoller.this.f) {
                com.sankuai.meituan.takeoutnew.util.aop.b.a(AmazonFireDeviceConnectivityPoller.this.b, new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                AmazonFireDeviceConnectivityPoller.this.e.postDelayed(AmazonFireDeviceConnectivityPoller.this.d, 10000L);
            }
        }
    }
}
