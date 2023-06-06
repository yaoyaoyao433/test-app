package com.tencent.liteav.b;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.g.t;
import com.tencent.liteav.i.a;
import com.tencent.liteav.i.c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class k {
    private Context b;
    private c.a c;
    private i d;
    private c e;
    private h f;
    private g g;
    private List<String> h;
    private List<Float> i;
    private Handler j = new Handler(Looper.getMainLooper());
    private t a = t.a();

    static {
        com.tencent.liteav.basic.util.g.f();
    }

    public k(Context context) {
        this.b = context;
        this.e = new c(this.b);
        this.d = new i(this.b);
        c();
    }

    private void c() {
        this.f = new h() { // from class: com.tencent.liteav.b.k.1
            @Override // com.tencent.liteav.b.h
            public void a(EGLContext eGLContext) {
                k.this.d.a(k.this.e.b());
                k.this.d.b(k.this.e.a());
                k.this.d.a(eGLContext);
            }

            @Override // com.tencent.liteav.b.h
            public void a(int i, int i2, int i3, com.tencent.liteav.d.e eVar) {
                k.this.d.a(i, i2, i3, eVar);
            }

            @Override // com.tencent.liteav.b.h
            public void a(com.tencent.liteav.d.e eVar) {
                k.this.d.a(eVar);
            }

            @Override // com.tencent.liteav.b.h
            public void b(com.tencent.liteav.d.e eVar) {
                k.this.d.c(eVar);
            }

            @Override // com.tencent.liteav.b.h
            public void c(com.tencent.liteav.d.e eVar) {
                k.this.d.b(eVar);
            }
        };
        this.g = new g() { // from class: com.tencent.liteav.b.k.2
            @Override // com.tencent.liteav.b.g
            public void a(final float f) {
                k.this.j.post(new Runnable() { // from class: com.tencent.liteav.b.k.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (k.this.c != null) {
                            k.this.c.a(f);
                        }
                    }
                });
            }

            @Override // com.tencent.liteav.b.g
            public void a(final int i, final String str) {
                TXCLog.i("TXCombineVideo", "===onEncodedComplete===");
                k.this.j.post(new Runnable() { // from class: com.tencent.liteav.b.k.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (k.this.c != null) {
                            a.d dVar = new a.d();
                            dVar.a = i;
                            dVar.b = str;
                            if (i == 0) {
                                k.this.c.a(1.0f);
                            }
                            k.this.c.a(dVar);
                        }
                    }
                });
            }
        };
        this.e.a(this.f);
        this.d.a(this.g);
    }

    public void a(c.a aVar) {
        this.c = aVar;
    }

    public void a(List<String> list) {
        TXCLog.i("TXCombineVideo", "setVideoList");
        this.h = list;
        if (this.i == null) {
            this.i = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                this.i.add(Float.valueOf(1.0f));
            }
        }
    }

    public void a(String str) {
        TXCLog.i("TXCombineVideo", "setTargetPath " + str);
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.d.a(str);
    }

    public void b(List<Float> list) {
        TXCLog.i("TXCombineVideo", "setVideoVolumes ");
        this.i = list;
    }

    public void a() {
        TXCLog.i("TXCombineVideo", "start");
        this.e.a(this.h);
        this.e.b(this.i);
        this.d.a(this.a.p());
        this.d.b();
        this.e.c();
    }

    public void b() {
        TXCLog.i("TXCombineVideo", "stop");
        this.e.d();
        this.d.a();
    }

    public void a(List<a.C1455a> list, int i, int i2) {
        TXCLog.i("TXCombineVideo", "setPictureList");
        int i3 = ((i + 15) / 16) * 16;
        int i4 = ((i2 + 15) / 16) * 16;
        this.d.a(i3, i4);
        this.e.a(list, i3, i4);
    }
}
