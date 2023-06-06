package com.meizu.cloud.pushsdk.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.d.b.a;
import com.meizu.cloud.pushsdk.d.b.f;
import com.meizu.cloud.pushsdk.d.e.a;
import com.meizu.cloud.pushsdk.d.e.c;
import com.meizu.cloud.pushsdk.d.f.b;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
/* loaded from: classes3.dex */
public class a {
    private static com.meizu.cloud.pushsdk.d.e.a a;
    private static BroadcastReceiver b;

    private static com.meizu.cloud.pushsdk.d.e.a a(com.meizu.cloud.pushsdk.d.b.a aVar, c cVar, Context context) {
        return new com.meizu.cloud.pushsdk.d.e.a.a(new a.C0530a(aVar, "PushAndroidTracker", context.getPackageCodePath(), context, com.meizu.cloud.pushsdk.d.e.a.a.class).a(b.VERBOSE).a(Boolean.FALSE).a((c) null).a(4));
    }

    private static String a() {
        String str = PushConstants.URL_STATICS_DOMAIN;
        if (MzSystemUtils.isOverseas()) {
            str = PushConstants.URL_ABROAD_STATICS_DOMAIN;
        }
        DebugLogger.e("QuickTracker", "current statics domain is " + str);
        return str;
    }

    public static com.meizu.cloud.pushsdk.d.e.a a(Context context, boolean z) {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = a(b(context, null, null), (c) null, context);
                }
            }
        }
        DebugLogger.i("PushAndroidTracker", "can upload subject " + z);
        if (z) {
            c.a aVar = new c.a();
            aVar.a = context;
            a.a(new c(aVar));
        }
        return a;
    }

    public static com.meizu.cloud.pushsdk.d.e.a a(Context context, com.meizu.cloud.pushsdk.c.c.a aVar, f fVar) {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = a(b(context, null, null), (c) null, context);
                    final com.meizu.cloud.pushsdk.d.e.a aVar2 = a;
                    if (b == null) {
                        b = new BroadcastReceiver() { // from class: com.meizu.cloud.pushsdk.d.a.1
                            @Override // android.content.BroadcastReceiver
                            public final void onReceive(Context context2, Intent intent) {
                                if (e.a(context2)) {
                                    com.meizu.cloud.pushsdk.d.f.c.a("QuickTracker", "restart track event: %s", "online true");
                                    com.meizu.cloud.pushsdk.d.e.a.this.a();
                                }
                            }
                        };
                        context.registerReceiver(b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    }
                }
            }
        }
        return a;
    }

    private static com.meizu.cloud.pushsdk.d.b.a b(Context context, com.meizu.cloud.pushsdk.c.c.a aVar, f fVar) {
        return new com.meizu.cloud.pushsdk.d.b.a.a(new a.C0527a(a(), context, com.meizu.cloud.pushsdk.d.b.a.a.class).a(fVar).a(aVar).a(1).a(com.meizu.cloud.pushsdk.d.b.b.DefaultGroup).b(com.meizu.cloud.pushsdk.d.b.b.DefaultGroup.d).c(2));
    }
}
