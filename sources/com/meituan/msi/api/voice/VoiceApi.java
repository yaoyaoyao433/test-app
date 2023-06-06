package com.meituan.msi.api.voice;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import com.meituan.msi.api.IMsiApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VoiceApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    public MediaPlayer b;
    public String c;
    private final Handler d;
    private final Runnable e;

    public VoiceApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba5409c5161ac92ac9d10885c63f92ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba5409c5161ac92ac9d10885c63f92ea");
            return;
        }
        this.d = new Handler(Looper.getMainLooper());
        this.e = new Runnable() { // from class: com.meituan.msi.api.voice.VoiceApi.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d74de6d66fe9e15c7372e2ef82b2da72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d74de6d66fe9e15c7372e2ef82b2da72");
                } else {
                    VoiceApi.this.a();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "945c86fad5602f712d3a303d2204caca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "945c86fad5602f712d3a303d2204caca");
            return;
        }
        if (this.b != null) {
            this.b.stop();
            this.b.release();
        }
        this.d.removeCallbacks(this.e);
        this.b = null;
        this.c = null;
    }
}
