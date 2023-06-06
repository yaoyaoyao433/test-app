package com.tencent.liteav.muxer;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c implements a {
    private int a;
    private a b;

    public c(Context context, int i) {
        this.a = 0;
        switch (i) {
            case 0:
                this.a = 0;
                this.b = new d();
                TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
                return;
            case 1:
                this.a = 1;
                this.b = new b();
                TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
                return;
            default:
                if (a(context)) {
                    this.a = 0;
                    this.b = new d();
                    TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
                    return;
                }
                this.a = 1;
                this.b = new b();
                TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
                return;
        }
    }

    public static boolean a(Context context) {
        com.tencent.liteav.basic.d.c.a().a(context);
        return com.tencent.liteav.basic.d.c.a().f() == 1;
    }

    @Override // com.tencent.liteav.muxer.a
    public void a(MediaFormat mediaFormat) {
        this.b.a(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.a
    public void b(MediaFormat mediaFormat) {
        this.b.b(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.a
    public void a(String str) {
        this.b.a(str);
    }

    @Override // com.tencent.liteav.muxer.a
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.b.a(byteBuffer, bufferInfo);
    }

    @Override // com.tencent.liteav.muxer.a
    public void a(byte[] bArr, int i, int i2, long j, int i3) {
        this.b.a(bArr, i, i2, j, i3);
    }

    @Override // com.tencent.liteav.muxer.a
    public void b(byte[] bArr, int i, int i2, long j, int i3) {
        this.b.b(bArr, i, i2, j, i3);
    }

    @Override // com.tencent.liteav.muxer.a
    public int a() {
        return this.b.a();
    }

    @Override // com.tencent.liteav.muxer.a
    public int b() {
        return this.b.b();
    }

    @Override // com.tencent.liteav.muxer.a
    public void a(int i) {
        this.b.a(i);
    }

    @Override // com.tencent.liteav.muxer.a
    public boolean c() {
        return this.b.c();
    }

    @Override // com.tencent.liteav.muxer.a
    public boolean d() {
        return this.b.d();
    }
}
