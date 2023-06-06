package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
/* loaded from: classes6.dex */
public class jl {
    private static volatile Handler a;
    private static volatile Handler b;
    private static final Object c = new Object();

    public static Handler a() {
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    HandlerThread handlerThread = new HandlerThread("receiver_task");
                    handlerThread.start();
                    b = new Handler(handlerThread.getLooper());
                }
            }
        }
        return b;
    }

    private static Handler b() {
        if (a == null) {
            synchronized (jl.class) {
                if (a == null) {
                    HandlerThread handlerThread = new HandlerThread("handle_receiver");
                    handlerThread.start();
                    a = new Handler(handlerThread.getLooper());
                }
            }
        }
        return a;
    }

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return null;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, null, b());
    }

    public static void a(Context context, Class<?> cls) {
        if (context == null) {
            return;
        }
        b().post(new jm(context, new ComponentName(context, cls)));
    }
}
