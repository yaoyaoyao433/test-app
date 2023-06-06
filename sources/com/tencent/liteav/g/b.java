package com.tencent.liteav.g;

import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface b {
    public static final a a = new a() { // from class: com.tencent.liteav.g.b.1
        @Override // com.tencent.liteav.g.b.a
        public final void a(String str) {
            TXCLog.e("IMediaDecoder", "onDecoderError ->   msg = " + str);
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(String str);
    }

    void a();

    void a(MediaFormat mediaFormat);

    void a(MediaFormat mediaFormat, Surface surface);

    void a(com.tencent.liteav.d.e eVar);

    void b();

    com.tencent.liteav.d.e c();

    com.tencent.liteav.d.e d();
}
