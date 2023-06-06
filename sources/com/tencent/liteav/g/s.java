package com.tencent.liteav.g;

import android.media.MediaFormat;
import android.os.Build;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.mapsdk.internal.jw;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class s extends com.tencent.liteav.c.i {
    private static s w;
    public int u;
    public int v;

    public static s r() {
        if (w == null) {
            w = new s();
        }
        return w;
    }

    private s() {
    }

    public com.tencent.liteav.d.g a(boolean z) {
        com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
        gVar.c = 0;
        switch (this.v) {
            case 0:
                gVar.a = 360;
                gVar.b = jw.h;
                break;
            case 1:
                gVar.a = jw.g;
                gVar.b = jw.h;
                break;
            case 2:
                gVar.a = 540;
                gVar.b = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                break;
            case 3:
                gVar.a = 720;
                gVar.b = 1280;
                break;
        }
        return z ? f(gVar) : gVar;
    }

    private com.tencent.liteav.d.g f(com.tencent.liteav.d.g gVar) {
        int i = gVar.b;
        gVar.b = gVar.a;
        gVar.a = i;
        return gVar;
    }

    public void d(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a = mediaFormat.getInteger("sample-rate");
            this.b = mediaFormat.getInteger("channel-count");
        }
    }
}
