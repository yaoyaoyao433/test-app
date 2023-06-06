package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.map.tools.Callback;
import com.tencent.mapsdk.internal.jy;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pi {
    private static void a(final Context context, final String str, final Callback<Boolean> callback) {
        jy.a((jy.g) new jy.g<Boolean>() { // from class: com.tencent.mapsdk.internal.pi.2
            private Boolean a() throws Exception {
                pi.a(context, str);
                return Boolean.TRUE;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                pi.a(context, str);
                return Boolean.TRUE;
            }
        }).a((jy.b.a) Boolean.FALSE, (jy.a<jy.b.a>) (callback != null ? new jy.a<Boolean>() { // from class: com.tencent.mapsdk.internal.pi.1
            @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
            public final /* bridge */ /* synthetic */ void callback(Object obj) {
                Callback.this.callback((Boolean) obj);
            }

            private void a(Boolean bool) {
                Callback.this.callback(bool);
            }
        } : null));
    }

    private static void a(me meVar) {
        if (gy.b(meVar.a("sdkVersion"), "4.0.9.1") < 0) {
            meVar.a(new String[]{ej.q, ej.s});
        }
    }

    public static void a(Context context, String str) {
        if (context == null) {
            return;
        }
        String a = mi.a(context, (TencentMapOptions) null).a(str);
        mh a2 = mh.a(context);
        if (gy.b(a2.a("sdkVersion"), "4.0.9.1") < 0) {
            a2.a(new String[]{ej.q, ej.s});
        }
        int b = gy.b(gy.m(), a2.a("sdkVersion"));
        me a3 = mg.a(context, str);
        mf.a(a3, a);
        mf.a(context, a3, a, eh.a);
        mf.a(context, a3, a, eh.d);
        mf.a(context, a3, a, eh.b);
        mf.a(context, a3, a, eh.c);
        mf.a(context, a3, a, eh.e);
        mf.a(context, a3, a, eh.f);
        mf.a(context, a3, a, eh.g);
        mf.a(context, a3, a, eh.h);
        if (b > 0) {
            a2.a("sdkVersion", gy.m());
        }
    }
}
