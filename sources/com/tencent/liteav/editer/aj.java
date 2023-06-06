package com.tencent.liteav.editer;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.i.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class aj extends e {
    private b.a n;
    private ArrayList<Long> o;
    private v p;

    @Override // com.tencent.liteav.editer.e
    protected int a(int i, int i2, int i3, long j) {
        return i;
    }

    @Override // com.tencent.liteav.editer.e
    protected void a(long j) {
    }

    @Override // com.tencent.liteav.editer.e
    protected void e() {
    }

    @Override // com.tencent.liteav.editer.e
    protected void f() {
    }

    @Override // com.tencent.liteav.editer.e
    protected void g() {
    }

    public aj(Context context) {
        super(context, "timelistThumb");
        this.p = new v() { // from class: com.tencent.liteav.editer.aj.1
            @Override // com.tencent.liteav.editer.v
            public void a(int i, long j, Bitmap bitmap) {
                if (aj.this.n != null) {
                    aj.this.n.a(i, j / 1000, bitmap);
                }
            }
        };
        this.o = new ArrayList<>();
        this.c = new ai("timelistThumb");
        this.f.a(this.p);
    }

    public void a(b.a aVar) {
        this.n = aVar;
    }

    @Override // com.tencent.liteav.editer.e
    public void a() {
        a(com.tencent.liteav.c.k.a().a);
        h();
        b();
        super.a();
    }

    protected void h() {
        com.tencent.liteav.c.h.a().a(this.o);
        this.c.a(com.tencent.liteav.c.h.a().b());
    }

    public void a(int i) {
        com.tencent.liteav.c.h.a().a(i);
    }

    public void b(int i) {
        com.tencent.liteav.c.h.a().b(i);
    }

    public void a(List<Long> list) {
        this.o.clear();
        for (int i = 0; i < list.size(); i++) {
            this.o.add(Long.valueOf(list.get(i).longValue() * 1000));
        }
    }

    @Override // com.tencent.liteav.editer.e
    public void d() {
        super.d();
        this.o.clear();
        this.p = null;
    }

    public void c(boolean z) {
        if (this.c != null) {
            this.c.a(z);
        }
    }
}
