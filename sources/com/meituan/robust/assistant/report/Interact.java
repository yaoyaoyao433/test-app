package com.meituan.robust.assistant.report;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Interact extends BroadcastReceiver {
    private static final String ACTION = "com.meituan.robust.action.ITERACT";
    public static int CountMax = 50;
    static final String PRE = "robust interact ";
    private static int counter = 0;
    static boolean isRegistered = false;
    private static Interact self;

    Interact() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i = counter + 1;
        counter = i;
        if (i > CountMax) {
            return;
        }
        if (intent.hasExtra("test")) {
            if (f.a(intent, "test", false)) {
                DevOperate.openTest(context.getApplicationContext());
            } else {
                DevOperate.closeTest(context.getApplicationContext());
            }
        }
        if (intent.hasExtra("state") && f.a(intent, "state", false)) {
            DevOperate.displayState(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void initInteract(final Context context) {
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() { // from class: com.meituan.robust.assistant.report.Interact.1
            @Override // java.lang.Runnable
            public final void run() {
                if (Interact.isRegistered) {
                    return;
                }
                synchronized (Interact.class) {
                    if (!Interact.isRegistered) {
                        Interact unused = Interact.self = new Interact();
                        try {
                            context.registerReceiver(Interact.self, new IntentFilter(Interact.ACTION));
                            Interact.isRegistered = true;
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }, 10000L);
        handler.postDelayed(new Runnable() { // from class: com.meituan.robust.assistant.report.Interact.2
            @Override // java.lang.Runnable
            public final void run() {
                if (Interact.counter == 0 && Interact.isRegistered && Interact.self != null) {
                    try {
                        context.unregisterReceiver(Interact.self);
                        Interact.isRegistered = false;
                    } catch (Throwable unused) {
                    }
                }
            }
        }, LocationStrategy.LOCATION_TIMEOUT);
    }
}
