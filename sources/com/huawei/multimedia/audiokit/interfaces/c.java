package com.huawei.multimedia.audiokit.interfaces;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends com.huawei.multimedia.audiokit.interfaces.a {
    Context a;
    b b;
    IHwAudioKaraokeFeature d;
    boolean c = false;
    IBinder e = null;
    private ServiceConnection g = new ServiceConnection() { // from class: com.huawei.multimedia.audiokit.interfaces.c.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c.this.d = IHwAudioKaraokeFeature.Stub.asInterface(iBinder);
            if (c.this.d != null) {
                c.this.c = true;
                c.this.b.a(1000);
                c cVar = c.this;
                String packageName = c.this.a.getPackageName();
                try {
                    if (cVar.d != null && cVar.c) {
                        cVar.d.init(packageName);
                    }
                } catch (RemoteException e) {
                    com.huawei.multimedia.audiokit.utils.a.a("HwAudioKit.HwAudioKaraokeFeatureKit", "isFeatureSupported,RemoteException ex : {}", e.getMessage());
                }
                c.a(c.this, iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            c.this.c = false;
            if (c.this.b != null) {
                c.this.b.a(1001);
            }
        }
    };
    IBinder.DeathRecipient f = new IBinder.DeathRecipient() { // from class: com.huawei.multimedia.audiokit.interfaces.c.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            Log.e("HwAudioKit.HwAudioKaraokeFeatureKit", "binderDied");
            c.this.e.unlinkToDeath(c.this.f, 0);
            c.this.b.a(1003);
            c.this.e = null;
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        CMD_SET_AUDIO_EFFECT_MODE_BASE("Karaoke_reverb_mode="),
        CMD_SET_VOCAL_VOLUME_BASE("Karaoke_volume="),
        CMD_SET_VOCAL_EQUALIZER_MODE("Karaoke_eq_mode=");
        
        String d;

        a(String str) {
            this.d = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context) {
        this.b = null;
        this.b = b.a();
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Context context) {
        if (context == null) {
            return;
        }
        if (!b.a(context)) {
            this.b.a(2);
        } else if (this.b == null || this.c) {
        } else {
            b.a(context, this.g, "com.huawei.multimedia.audioengine.HwAudioKaraokeFeatureService");
        }
    }

    public final void a() {
        com.huawei.multimedia.audiokit.utils.a.a("destroy, mIsServiceConnected = {}", new Boolean[]{Boolean.valueOf(this.c)});
        if (this.c) {
            this.c = false;
            b.a(this.a, this.g);
        }
    }

    public final boolean b() {
        try {
            if (this.d != null && this.c) {
                return this.d.isKaraokeFeatureSupport();
            }
        } catch (RemoteException e) {
            com.huawei.multimedia.audiokit.utils.a.a("HwAudioKit.HwAudioKaraokeFeatureKit", "isFeatureSupported,RemoteException ex : {}", e.getMessage());
        }
        return false;
    }

    public final int a(boolean z) {
        com.huawei.multimedia.audiokit.utils.a.a("enableKaraokeFeature, enable = {}", new Boolean[]{Boolean.valueOf(z)});
        try {
            if (this.d == null || !this.c) {
                return -2;
            }
            return this.d.enableKaraokeFeature(z);
        } catch (RemoteException e) {
            com.huawei.multimedia.audiokit.utils.a.a("HwAudioKit.HwAudioKaraokeFeatureKit", "enableKaraokeFeature,RemoteException ex : {}", e.getMessage());
            return -2;
        }
    }

    public final int c() {
        try {
            if (this.d == null || !this.c) {
                return -1;
            }
            return this.d.getKaraokeLatency();
        } catch (RemoteException e) {
            com.huawei.multimedia.audiokit.utils.a.a("HwAudioKit.HwAudioKaraokeFeatureKit", "getKaraokeLatency,RemoteException ex : {}", e.getMessage());
            return -1;
        }
    }

    public final int a(a aVar, int i) {
        try {
            com.huawei.multimedia.audiokit.utils.a.a("parame.getParameName() = {}, parameValue = {}", new Serializable[]{aVar.d, Integer.valueOf(i)});
            if (this.d == null || !this.c) {
                return -2;
            }
            return this.d.setParameter(aVar.d, i);
        } catch (RemoteException e) {
            com.huawei.multimedia.audiokit.utils.a.a("HwAudioKit.HwAudioKaraokeFeatureKit", "setParameter,RemoteException ex : {}", e.getMessage());
            return -2;
        }
    }

    static /* synthetic */ void a(c cVar, IBinder iBinder) {
        cVar.e = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(cVar.f, 0);
            } catch (RemoteException unused) {
                cVar.b.a(1002);
                Log.e("HwAudioKit.HwAudioKaraokeFeatureKit", "serviceLinkToDeath, RemoteException");
            }
        }
    }
}
