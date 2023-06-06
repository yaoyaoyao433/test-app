package com.tencent.liteav.videoediter.a;

import android.os.Handler;
import com.tencent.liteav.d.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c implements Runnable {
    private a a;
    private Handler b;
    private List<String> c;
    private String d;
    private long e;
    private long f;
    private boolean g;
    private long h;
    private Runnable i;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(float f);

        void a(int i, String str);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (this.g) {
            if (this.c == null || this.c.size() <= 0) {
                a(-1, "Video source not set");
            } else if (this.d == null || this.d.isEmpty()) {
                a(-1, "Output path not set");
            } else {
                d dVar = new d();
                com.tencent.liteav.videoediter.a.a aVar = new com.tencent.liteav.videoediter.a.a();
                try {
                    dVar.a(this.c);
                    aVar.a(this.d);
                    long c = dVar.c();
                    dVar.f();
                    b bVar = new b();
                    bVar.a(this.c.get(0));
                    if (bVar.a() != null) {
                        aVar.a(bVar.a());
                    }
                    if (bVar.b() != null) {
                        aVar.b(bVar.b());
                    }
                    bVar.e();
                    int c2 = aVar.c();
                    if (c2 < 0) {
                        switch (c2) {
                            case -8:
                                str = "muxer add audiotrack error";
                                break;
                            case -7:
                                str = "Unsupported audio format";
                                break;
                            case -6:
                                str = "muxer add videotrack error";
                                break;
                            case -5:
                                str = "Unsupported video format";
                                break;
                            case -4:
                                str = "Failed to start muxer";
                                break;
                            default:
                                str = "Failed to stop muxer";
                                break;
                        }
                        a(-1, str);
                        return;
                    }
                    dVar.a(this.e);
                    e eVar = new e();
                    eVar.a(ByteBuffer.allocate(512000));
                    do {
                        dVar.a(eVar);
                        if ((eVar.f() & 4) == 0) {
                            if (this.f > 0 && eVar.e() > this.f) {
                                break;
                            } else if (eVar.a().startsWith("video")) {
                                aVar.a(eVar.b(), eVar.o());
                                this.h++;
                                if (this.h >= 50) {
                                    a(eVar.o().presentationTimeUs - this.e, this.f < 0 ? c : this.f - this.e);
                                    this.h = 0L;
                                }
                            } else {
                                aVar.b(eVar.b(), eVar.o());
                            }
                        }
                        if (!this.g) {
                            break;
                        }
                    } while ((eVar.f() & 4) == 0);
                    if (aVar.d() < 0) {
                        a(-1, "Failed to stop muxer");
                    } else if (this.g) {
                        a(0, "");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    a(-1, "Failed to get data format");
                } finally {
                    dVar.e();
                    this.g = false;
                }
            }
        }
    }

    private void a(long j, long j2) {
        if (this.i != null || this.a == null) {
            return;
        }
        final float f = 1.0f;
        if (j2 > 0 && j <= j2) {
            f = (((float) j) * 1.0f) / ((float) j2);
        }
        this.i = new Runnable() { // from class: com.tencent.liteav.videoediter.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.a != null) {
                    c.this.a.a(f);
                }
                c.this.i = null;
            }
        };
        this.b.post(this.i);
    }

    private void a(final int i, final String str) {
        this.b.post(new Runnable() { // from class: com.tencent.liteav.videoediter.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.a != null) {
                    c.this.a.a(i, str);
                }
            }
        });
    }
}
