package com.huawei.multimedia.audiokit.interfaces;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.multimedia.audioengine.IHwAudioEngine;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    private static final List<Integer> a = new ArrayList(0);
    private Context b;
    private IHwAudioEngine c = null;
    private boolean d = false;
    private IBinder f = null;
    private ServiceConnection g = new ServiceConnection() { // from class: com.huawei.multimedia.audiokit.interfaces.d.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.this.c = IHwAudioEngine.Stub.asInterface(iBinder);
            if (d.this.c != null) {
                d.this.d = true;
                d.this.e.a(0);
                d.a(d.this, d.this.b.getPackageName(), "1.0.1");
                d.a(d.this, iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            d.this.c = null;
            d.this.d = false;
            d.this.e.a(4);
        }
    };
    private IBinder.DeathRecipient h = new IBinder.DeathRecipient() { // from class: com.huawei.multimedia.audiokit.interfaces.d.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d.this.f.unlinkToDeath(d.this.h, 0);
            d.this.e.a(6);
            Log.e("HwAudioKit.HwAudioKit", "service binder died");
            d.b(d.this, null);
        }
    };
    private b e = b.a();

    static /* synthetic */ IBinder b(d dVar, IBinder iBinder) {
        dVar.f = null;
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        HWAUDIO_FEATURE_KARAOKE(1);
        
        int b = 1;

        a(int i) {
        }
    }

    public d(Context context, e eVar) {
        this.b = null;
        this.e.a = eVar;
        this.b = context;
    }

    public final void a() {
        if (this.b == null) {
            this.e.a(7);
        } else if (!b.a(this.b)) {
            this.e.a(2);
        } else {
            Context context = this.b;
            com.huawei.multimedia.audiokit.utils.a.a("bindService, mIsServiceConnected = {}", new Boolean[]{Boolean.valueOf(this.d)});
            if (this.e == null || this.d) {
                return;
            }
            b.a(context, this.g, "com.huawei.multimedia.audioengine.HwAudioEngineService");
        }
    }

    public final void b() {
        com.huawei.multimedia.audiokit.utils.a.a("destroy, mIsServiceConnected = {}", new Boolean[]{Boolean.valueOf(this.d)});
        if (this.d) {
            this.d = false;
            b.a(this.b, this.g);
        }
    }

    public final <T extends com.huawei.multimedia.audiokit.interfaces.a> T a(a aVar) {
        return (T) b.a(aVar.b, this.b);
    }

    static /* synthetic */ void a(d dVar, String str, String str2) {
        try {
            if (dVar.c == null || !dVar.d) {
                return;
            }
            dVar.c.init(str, str2);
        } catch (RemoteException e) {
            com.huawei.multimedia.audiokit.utils.a.a("HwAudioKit.HwAudioKit", "isFeatureSupported,RemoteException ex : {}", e.getMessage());
        }
    }

    static /* synthetic */ void a(d dVar, IBinder iBinder) {
        dVar.f = iBinder;
        try {
            if (dVar.f != null) {
                dVar.f.linkToDeath(dVar.h, 0);
            }
        } catch (RemoteException unused) {
            dVar.e.a(5);
            Log.e("HwAudioKit.HwAudioKit", "serviceLinkToDeath, RemoteException");
        }
    }
}
