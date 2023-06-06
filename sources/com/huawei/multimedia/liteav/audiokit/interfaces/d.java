package com.huawei.multimedia.liteav.audiokit.interfaces;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.multimedia.liteav.audioengine.IHwAudioEngine;
import com.tencent.liteav.basic.log.TXCLog;
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
    private ServiceConnection g = new ServiceConnection() { // from class: com.huawei.multimedia.liteav.audiokit.interfaces.d.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.this.c = IHwAudioEngine.Stub.asInterface(iBinder);
            TXCLog.i("HwAudioKit.HwAudioKit", "onServiceConnected");
            if (d.this.c != null) {
                d.this.d = true;
                TXCLog.i("HwAudioKit.HwAudioKit", "onServiceConnected, mIHwAudioEngine is not null");
                d.this.e.a(0);
                d.a(d.this, d.this.b.getPackageName(), "1.0.1");
                d.a(d.this, iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            TXCLog.i("HwAudioKit.HwAudioKit", "onServiceDisconnected");
            d.this.c = null;
            d.this.d = false;
            d.this.e.a(4);
        }
    };
    private IBinder.DeathRecipient h = new IBinder.DeathRecipient() { // from class: com.huawei.multimedia.liteav.audiokit.interfaces.d.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d.this.f.unlinkToDeath(d.this.h, 0);
            d.this.e.a(6);
            TXCLog.e("HwAudioKit.HwAudioKit", "service binder died");
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
        TXCLog.i("HwAudioKit.HwAudioKit", "initialize");
        if (this.b == null) {
            TXCLog.i("HwAudioKit.HwAudioKit", "mContext is null");
            this.e.a(7);
        } else if (!b.a(this.b)) {
            TXCLog.i("HwAudioKit.HwAudioKit", "not install AudioKitEngine");
            this.e.a(2);
        } else {
            Context context = this.b;
            TXCLog.i("HwAudioKit.HwAudioKit", "bindService, mIsServiceConnected = %b", Boolean.valueOf(this.d));
            if (this.e == null || this.d) {
                return;
            }
            b.a(context, this.g, "com.huawei.multimedia.audioengine.HwAudioEngineService");
        }
    }

    public final void b() {
        TXCLog.i("HwAudioKit.HwAudioKit", "destroy, mIsServiceConnected = %b", Boolean.valueOf(this.d));
        if (this.d) {
            this.d = false;
            b.a(this.b, this.g);
        }
    }

    public final boolean a(a aVar) {
        if (aVar == null) {
            return false;
        }
        TXCLog.i("HwAudioKit.HwAudioKit", "isFeatureSupported, type = %d", Integer.valueOf(aVar.b));
        try {
            if (this.c != null && this.d) {
                return this.c.isFeatureSupported(aVar.b);
            }
        } catch (RemoteException e) {
            TXCLog.e("HwAudioKit.HwAudioKit", "isFeatureSupported,RemoteException ex : %s", e.getMessage());
        }
        return false;
    }

    public final <T extends com.huawei.multimedia.liteav.audiokit.interfaces.a> T b(a aVar) {
        if (this.e == null || aVar == null) {
            return null;
        }
        return (T) b.a(aVar.b, this.b);
    }

    static /* synthetic */ void a(d dVar, String str, String str2) {
        TXCLog.i("HwAudioKit.HwAudioKit", "serviceInit");
        try {
            if (dVar.c == null || !dVar.d) {
                return;
            }
            dVar.c.init(str, str2);
        } catch (RemoteException e) {
            TXCLog.e("HwAudioKit.HwAudioKit", "isFeatureSupported,RemoteException ex : %s", e.getMessage());
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
            TXCLog.e("HwAudioKit.HwAudioKit", "serviceLinkToDeath, RemoteException");
        }
    }
}
