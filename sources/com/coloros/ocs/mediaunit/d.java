package com.coloros.ocs.mediaunit;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.coloros.ocs.base.common.api.a;
import com.coloros.ocs.base.common.api.g;
import com.coloros.ocs.mediaunit.IKaraokeService;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends com.coloros.ocs.base.common.api.c<Object, d> {
    private static final a.f<a> c = new a.f<>();
    private static final a.AbstractC0048a<a, Object> d = new b();
    private static final com.coloros.ocs.base.common.api.a<Object> e = new com.coloros.ocs.base.common.api.a<>("MediaClient.API", d, c);
    private static d j;
    private IKaraokeService f;
    private final IBinder g;
    private Context h;
    private ServiceConnection i;

    private d(@NonNull Context context) {
        super(context, e, null, new com.coloros.ocs.base.internal.a(context.getPackageName(), 1, new ArrayList()));
        this.g = new Binder();
        this.h = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized d a(@NonNull Context context) {
        synchronized (d.class) {
            if (j != null) {
                return j;
            }
            d dVar = new d(context);
            j = dVar;
            return dVar;
        }
    }

    public final int a() {
        new StringBuilder("requestAudioLoopback ").append(this.g);
        a(Looper.myLooper(), new g.b<Void>() { // from class: com.coloros.ocs.mediaunit.d.2
            @Override // com.coloros.ocs.base.common.api.g.b
            public final void a(com.coloros.ocs.base.task.b<Void> bVar) {
                if (d.this.f != null) {
                    try {
                        d.this.f.requestAudioLoopback(d.this.g, d.this.h.getPackageName());
                        return;
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                d.d(d.this);
            }
        }, new g.a<Void>() { // from class: com.coloros.ocs.mediaunit.d.3
            @Override // com.coloros.ocs.base.common.api.g.a
            public final void a(com.coloros.ocs.base.task.b<Void> bVar, int i, String str) {
                Log.e("MediaUnitClientImpl", "errorCode -- " + i);
            }
        });
        return 0;
    }

    public final int b() {
        a(Looper.myLooper(), new g.b<Void>() { // from class: com.coloros.ocs.mediaunit.d.4
            @Override // com.coloros.ocs.base.common.api.g.b
            public final void a(com.coloros.ocs.base.task.b<Void> bVar) {
                if (d.this.f != null) {
                    try {
                        d.this.f.abandonAudioLoopback(d.this.h.getPackageName());
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }, new g.a<Void>() { // from class: com.coloros.ocs.mediaunit.d.5
            @Override // com.coloros.ocs.base.common.api.g.a
            public final void a(com.coloros.ocs.base.task.b<Void> bVar, int i, String str) {
                Log.e("MediaUnitClientImpl", "errorCode -- " + i);
            }
        });
        return 0;
    }

    public static void c() {
        d dVar = j;
        dVar.h.unbindService(dVar.i);
    }

    static /* synthetic */ void d(d dVar) {
        dVar.i = new ServiceConnection() { // from class: com.coloros.ocs.mediaunit.d.1
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                d.this.f = IKaraokeService.Stub.asInterface(iBinder);
                try {
                    d.this.f.requestAudioLoopback(d.this.g, d.this.h.getPackageName());
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                d.this.f = null;
            }
        };
        Intent intent = new Intent("com.coloros.opencapabilityservice");
        intent.setComponent(new ComponentName("com.coloros.ocs.opencapabilityservice", "com.coloros.ocs.opencapabilityservice.capability.karaoke.KaraokeService"));
        dVar.h.bindService(intent, dVar.i, 1);
    }
}
