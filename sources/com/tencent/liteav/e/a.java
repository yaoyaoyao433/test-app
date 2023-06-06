package com.tencent.liteav.e;

import android.media.MediaFormat;
import android.opengl.GLES20;
import com.dianping.titans.service.FileUtil;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.basic.opengl.l;
import com.tencent.liteav.basic.opengl.m;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.liteav.videoencoder.b;
import com.tencent.liteav.videoencoder.d;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private b c;
    private int d;
    private int[] e;
    private LinkedBlockingDeque<Integer> f;
    private LinkedBlockingDeque<C1451a> g;
    private d i;
    private int k;
    private int l;
    private j m;
    private boolean n;
    private final int a = 5;
    private String b = a.class.getSimpleName();
    private int h = -1;
    private boolean j = false;

    public a(int i, boolean z) {
        this.d = 2;
        this.n = false;
        this.d = i > 5 ? 5 : i;
        this.f = new LinkedBlockingDeque<>();
        this.g = new LinkedBlockingDeque<>();
        this.n = z;
        this.c = new b(z ? 2 : 1);
        this.c.a(new d() { // from class: com.tencent.liteav.e.a.1
            @Override // com.tencent.liteav.videoencoder.d
            public void onEncodeNAL(TXSNALPacket tXSNALPacket, int i2) {
                if (a.this.i != null) {
                    a.this.i.onEncodeNAL(tXSNALPacket, i2);
                }
            }

            @Override // com.tencent.liteav.videoencoder.d
            public void onEncodeFormat(MediaFormat mediaFormat) {
                if (a.this.i != null) {
                    a.this.i.onEncodeFormat(mediaFormat);
                }
            }

            @Override // com.tencent.liteav.videoencoder.d
            public void onEncodeFinished(int i2, long j, long j2) {
                TXCLog.i(a.this.b, "onEncodeFinished");
                if (a.this.i != null) {
                    a.this.i.onEncodeFinished(i2, j, j2);
                }
            }

            @Override // com.tencent.liteav.videoencoder.d
            public void onRestartEncoder(int i2) {
                TXCLog.i(a.this.b, "onRestartEncoder");
                if (a.this.i != null) {
                    a.this.i.onRestartEncoder(i2);
                }
            }

            @Override // com.tencent.liteav.videoencoder.d
            public void onEncodeDataIn(int i2) {
                if (a.this.g.size() > 0) {
                    try {
                        a.this.f.put(Integer.valueOf(((C1451a) a.this.g.pop()).a));
                    } catch (InterruptedException unused) {
                    }
                }
            }
        });
    }

    public int a(TXSVideoEncoderParam tXSVideoEncoderParam) {
        TXCLog.i(this.b, "start");
        this.k = tXSVideoEncoderParam.width;
        this.l = tXSVideoEncoderParam.height;
        int a = this.c != null ? this.c.a(tXSVideoEncoderParam) : 10000002;
        if (!this.n) {
            d();
        }
        return a;
    }

    private void d() {
        e();
        this.m = new j();
        this.m.a(m.e, m.a(l.NORMAL, true, true));
        if (this.m.c()) {
            return;
        }
        this.m = null;
        TXCLog.i(this.b, "init encodefilter fail");
    }

    public void a(int i, int i2, int i3, long j) throws InterruptedException {
        if (this.c != null) {
            if (!this.n) {
                int intValue = this.f.take().intValue();
                GLES20.glBindFramebuffer(36160, this.h);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, intValue, 0);
                this.m.a(this.k, this.l, 0, null, this.k / this.l, false, false);
                this.m.b(i);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                C1451a c1451a = new C1451a();
                c1451a.a = intValue;
                c1451a.b = i2;
                c1451a.c = i3;
                c1451a.d = j;
                this.g.put(c1451a);
                this.c.b(intValue, i2, i3, j);
                return;
            }
            this.c.b(i, i2, i3, j);
        }
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.c(i);
        }
    }

    public void a() {
        TXCLog.i(this.b, "signalEOSAndFlush");
        if (this.c != null) {
            this.c.c();
        }
    }

    public void b() {
        TXCLog.i(this.b, "destroyTextures");
        if (this.n) {
            return;
        }
        if (this.m != null) {
            this.m.e();
            this.m = null;
        }
        if (this.h != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.h}, 0);
            GLES20.glDeleteTextures(this.d, this.e, 0);
            this.h = -1;
            this.e = null;
        }
    }

    public void c() {
        TXCLog.i(this.b, "stop");
        if (this.c != null) {
            this.c.a();
        }
    }

    public void a(d dVar) {
        this.i = dVar;
    }

    private void e() {
        TXCLog.i(this.b, "createTextures");
        int[] iArr = new int[this.d];
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(this.d, iArr, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        this.h = iArr2[0];
        this.e = iArr;
        for (int i = 0; i < this.d; i++) {
            GLES20.glBindTexture(3553, iArr[i]);
            this.f.push(Integer.valueOf(iArr[i]));
            a("glBindTexture mFrameBufferTextureID");
            GLES20.glTexImage2D(3553, 0, 6408, this.k, this.l, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            a("glTexParameter");
            GLES20.glBindFramebuffer(36160, this.h);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[i], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    private void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String str2 = this.b;
        TXCLog.e(str2, str + ": glError " + glGetError);
        throw new RuntimeException(str + ": glError " + glGetError);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static class C1451a {
        public int a;
        public int b;
        public int c;
        public long d;

        C1451a() {
        }
    }
}
