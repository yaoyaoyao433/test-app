package com.tencent.liteav.b;

import android.content.Context;
import android.opengl.EGLContext;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.r;
import com.tencent.liteav.i.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    private Context b;
    private a e;
    private j f;
    private int h;
    private int i;
    private int j;
    private int k;
    private h l;
    private com.tencent.liteav.d.e q;
    private final String a = "CombineDecAndRender";
    private AtomicBoolean m = new AtomicBoolean(false);
    private AtomicBoolean n = new AtomicBoolean(false);
    private AtomicBoolean o = new AtomicBoolean(false);
    private AtomicBoolean p = new AtomicBoolean(false);
    private ArrayList<b> d = new ArrayList<>();
    private com.tencent.liteav.b.a g = new com.tencent.liteav.b.a();
    private n c = new n();

    public c(Context context) {
        this.b = context;
        this.f = new j(this.b);
    }

    public void a(h hVar) {
        this.l = hVar;
    }

    public int a(List<String> list) {
        if (list == null || list.size() < 2) {
            return -1;
        }
        this.j = 0;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = new b();
            bVar.a.a(list.get(i2));
            int d = bVar.a.d();
            if (i > d) {
                this.j = i2;
                i = d;
            }
            this.d.add(bVar);
            this.g.a(bVar.a.a(), i2);
        }
        TXCLog.i("CombineDecAndRender", "mFpsSmallIndex = " + this.j);
        if (this.f == null) {
            this.f = new j(this.b);
        }
        this.g.a(a(), this.k);
        this.g.a();
        return 0;
    }

    public void b(List<Float> list) {
        if (this.g != null) {
            this.g.a(list);
        }
    }

    public void a(List<a.C1455a> list, int i, int i2) {
        if (this.f == null) {
            this.f = new j(this.b);
        }
        this.f.a(list, i, i2);
        this.h = i;
        this.i = i2;
    }

    public int a() {
        int i = -1;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            int e = this.d.get(i2).a.e();
            if (i < e) {
                this.k = i2;
                i = e;
            }
        }
        if (i > 0) {
            return i;
        }
        this.k = 0;
        return 48000;
    }

    public int b() {
        int i = -1;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            int f = this.d.get(i2).a.f();
            if (i < f) {
                i = f;
            }
        }
        if (i >= 0) {
            return i;
        }
        return 10000;
    }

    public void c() {
        TXCLog.i("CombineDecAndRender", "start");
        for (int i = 0; i < this.d.size(); i++) {
            final b bVar = this.d.get(i);
            final m mVar = bVar.a;
            com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
            gVar.a = mVar.b();
            gVar.b = mVar.c();
            this.c.a(gVar, i);
            this.c.a(new com.tencent.liteav.editer.k() { // from class: com.tencent.liteav.b.c.1
                @Override // com.tencent.liteav.editer.k
                public void a(Surface surface, int i2) {
                    mVar.a(surface);
                    bVar.d = new d(c.this.b);
                }

                @Override // com.tencent.liteav.editer.k
                public void b(Surface surface, int i2) {
                    if (bVar != null && bVar.d != null) {
                        bVar.d.a();
                    }
                    if (c.this.f != null) {
                        c.this.f.a();
                        c.this.f = null;
                    }
                }

                @Override // com.tencent.liteav.editer.k
                public int a(int i2, float[] fArr, com.tencent.liteav.d.e eVar, int i3) {
                    if (!c.this.n.get()) {
                        if (!c.this.a(eVar, false)) {
                            if (c.this.d != null && c.this.d.size() > i3 && i3 >= 0) {
                                b bVar2 = (b) c.this.d.get(i3);
                                if (bVar2 == null) {
                                    TXCLog.w("CombineDecAndRender", "struct is null " + i3);
                                    return 0;
                                }
                                if (bVar2.d != null) {
                                    bVar2.d.a(fArr);
                                    bVar2.g = bVar2.d.a(i2, eVar);
                                }
                                c.this.e();
                                return 0;
                            }
                            TXCLog.e("CombineDecAndRender", "onSurfaceTextureAvailable index is error:" + i3);
                            return 0;
                        }
                        TXCLog.i("CombineDecAndRender", "mVideoRenderCallback onTextureProcess, end frame");
                        return 0;
                    }
                    TXCLog.i("CombineDecAndRender", "mVideoRenderCallback mDecodeVideoEnd, ignore");
                    return 0;
                }
            }, i);
        }
        this.c.a(new r() { // from class: com.tencent.liteav.b.c.2
            @Override // com.tencent.liteav.editer.r
            public void b(EGLContext eGLContext) {
            }

            @Override // com.tencent.liteav.editer.r
            public void a(EGLContext eGLContext) {
                if (c.this.l != null) {
                    c.this.l.a(eGLContext);
                }
                for (final int i2 = 0; i2 < c.this.d.size(); i2++) {
                    final b bVar2 = (b) c.this.d.get(i2);
                    if (bVar2 != null) {
                        bVar2.a.g();
                        bVar2.a.a(new e() { // from class: com.tencent.liteav.b.c.2.1
                            @Override // com.tencent.liteav.b.e
                            public void a(com.tencent.liteav.d.e eVar) {
                                if (c.this.p.get() || c.this.o.get()) {
                                    return;
                                }
                                if (bVar2.e) {
                                    bVar2.e = false;
                                    c.this.g.b(eVar.j(), i2);
                                }
                                TXCLog.d("CombineDecAndRender", "Audio1 frame put one:" + eVar.e() + ", flag = " + eVar.f() + ", AudioBlockingQueue size:" + bVar2.c.size());
                                try {
                                    bVar2.c.put(eVar);
                                } catch (InterruptedException e) {
                                    TXCLog.w("CombineDecAndRender", e.toString());
                                }
                                c.this.f();
                            }

                            @Override // com.tencent.liteav.b.e
                            public void b(com.tencent.liteav.d.e eVar) {
                                if (c.this.p.get()) {
                                    return;
                                }
                                TXCLog.d("CombineDecAndRender", "Video1 frame put one:" + eVar.e() + ",VideoBlockingQueue size:" + bVar2.b.size());
                                try {
                                    bVar2.b.put(eVar);
                                } catch (InterruptedException e) {
                                    TXCLog.w("CombineDecAndRender", e.toString());
                                }
                                if (c.this.c != null) {
                                    c.this.c.a(eVar, i2);
                                }
                            }
                        });
                    }
                }
                c.this.e.start();
            }
        });
        this.c.a();
        this.p.compareAndSet(true, false);
        this.m.compareAndSet(true, false);
        this.n.compareAndSet(true, false);
        this.o.compareAndSet(true, false);
        this.e = new a();
    }

    public void d() {
        TXCLog.i("CombineDecAndRender", "stop");
        if (this.p.get()) {
            return;
        }
        this.p.set(true);
        if (this.e != null && this.e.isAlive()) {
            try {
                this.e.join(500L);
            } catch (InterruptedException unused) {
            }
        }
        for (int i = 0; i < this.d.size(); i++) {
            b bVar = this.d.get(i);
            m mVar = bVar.a;
            if (mVar != null) {
                mVar.h();
            }
            bVar.c.clear();
            if (bVar.g != null) {
                bVar.g.b = null;
                bVar.g.a = -1;
            }
        }
        this.d.clear();
        if (this.g != null) {
            this.g.b();
        }
        if (this.c != null) {
            this.c.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.tencent.liteav.d.e eVar;
        b bVar = this.d.get(this.j);
        if (bVar == null || bVar.g == null || (eVar = bVar.g.b) == null) {
            return;
        }
        ArrayList<f> arrayList = new ArrayList<>();
        boolean z = false;
        for (int i = 0; i < this.d.size(); i++) {
            b bVar2 = this.d.get(i);
            arrayList.add(bVar2.g);
            if (i != this.j && bVar2 != null) {
                com.tencent.liteav.d.e eVar2 = bVar2.g.b;
                if (eVar2 != null) {
                    if (eVar.e() > eVar2.e()) {
                        bVar2.b.remove();
                        bVar2.g.b = null;
                        bVar2.g.a = -1;
                    }
                }
                z = true;
            }
        }
        if (z) {
            TXCLog.d("CombineDecAndRender", "not all video ready to compine");
            return;
        }
        int a2 = this.f.a(arrayList);
        if (this.l != null) {
            this.l.a(a2, this.h, this.i, eVar);
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            b bVar3 = this.d.get(i2);
            if (bVar3 != null) {
                f fVar = bVar3.g;
                bVar3.b.remove();
                if (fVar != null) {
                    bVar3.g.b = null;
                    bVar3.g.a = -1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i;
            setName("DecodeThread");
            try {
                TXCLog.i("CombineDecAndRender", "===DecodeThread Start===");
                while (true) {
                    i = 0;
                    if (c.this.m.get() || c.this.p.get()) {
                        break;
                    }
                    while (i < c.this.d.size()) {
                        ((b) c.this.d.get(i)).a.i();
                        i++;
                    }
                }
                while (i < c.this.d.size()) {
                    ((b) c.this.d.get(i)).b.clear();
                    i++;
                }
                TXCLog.i("CombineDecAndRender", "===DecodeThread Exit===");
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList<com.tencent.liteav.d.e> arrayList = new ArrayList<>();
        com.tencent.liteav.d.e eVar = null;
        boolean z = true;
        boolean z2 = true;
        for (int i = 0; i < this.d.size(); i++) {
            b bVar = this.d.get(i);
            if (bVar.c.isEmpty()) {
                if (!bVar.f) {
                    TXCLog.d("CombineDecAndRender", "combineAudioFrame audio queue is empty but not end:" + i);
                    return;
                }
                arrayList.add(i, null);
            } else {
                com.tencent.liteav.d.e peek = bVar.c.peek();
                if (a(peek, true)) {
                    TXCLog.i("CombineDecAndRender", "combineAudioFrame, frame is end " + i);
                    bVar.c.clear();
                    bVar.f = true;
                    arrayList.add(i, null);
                    eVar = peek;
                } else {
                    arrayList.add(i, peek);
                    z = false;
                    z2 = false;
                }
            }
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            b bVar2 = this.d.get(i2);
            if (!bVar2.c.isEmpty()) {
                try {
                    bVar2.c.take();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (z) {
            this.o.set(true);
            TXCLog.i("CombineDecAndRender", "combineAudioFrame, audio both end");
            this.l.c(eVar);
            if (this.n.get()) {
                TXCLog.i("CombineDecAndRender", "combineAudioFrame, video and audio both end");
                this.m.set(true);
                d();
            }
        } else if (!z2) {
            com.tencent.liteav.d.e a2 = this.g.a(arrayList);
            if (a2 != null) {
                if (this.l != null) {
                    this.l.a(a2);
                }
                this.q = a2;
                return;
            }
            this.o.set(true);
            TXCLog.i("CombineDecAndRender", "combineAudioFrame, audio one is end");
            this.q.c(4);
            this.q.a((ByteBuffer) null);
            this.q.d(0);
            this.l.c(this.q);
            if (this.n.get()) {
                TXCLog.i("CombineDecAndRender", "combineAudioFrame, video and audio both end");
                this.m.set(true);
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(com.tencent.liteav.d.e eVar, boolean z) {
        if (eVar.p()) {
            if (this.l != null) {
                if (z) {
                    TXCLog.i("CombineDecAndRender", "===judgeDecodeComplete=== audio end");
                } else {
                    TXCLog.i("CombineDecAndRender", "===judgeDecodeComplete=== video end");
                    if (!this.n.get()) {
                        this.n.set(true);
                        this.l.b(eVar);
                    }
                }
                if (this.o.get() && this.n.get()) {
                    TXCLog.i("CombineDecAndRender", "judgeDecodeComplete, video and audio both end");
                    this.m.set(true);
                    d();
                }
            }
            return true;
        }
        return false;
    }
}
