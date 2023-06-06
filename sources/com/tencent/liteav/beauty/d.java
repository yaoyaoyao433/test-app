package com.tencent.liteav.beauty;

import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.j;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    private static String e = "avePreFrame";
    private ArrayList<TXCOpenGlUtils.a> a = new ArrayList<>();
    private ArrayList<TXCOpenGlUtils.a> b = new ArrayList<>();
    private int c = 1;
    private j d = null;
    private TXCOpenGlUtils.a[] f = null;
    private int g = -1;
    private int h = -1;

    public boolean a(int i, int i2) {
        return c(i, i2);
    }

    private boolean c(int i, int i2) {
        if (this.d == null) {
            this.d = new j();
            this.d.a(true);
            if (!this.d.c()) {
                Log.e(e, "mDissolveBlendFilter init Failed!");
                return false;
            }
        }
        if (this.d != null) {
            this.d.a(i, i2);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public void b(int i, int i2) {
        c(i, i2);
    }

    public int a(int i) {
        if (this.a.size() >= this.c) {
            TXCOpenGlUtils.a aVar = this.a.size() > 0 ? this.a.get(0) : null;
            if (aVar != null) {
                r4 = this.d != null ? this.d.a(aVar.b[0]) : -1;
                this.b.add(aVar);
                this.a.remove(0);
            }
        }
        TXCOpenGlUtils.a aVar2 = this.b.size() > 0 ? this.b.get(0) : null;
        if (aVar2 != null) {
            GLES20.glBindFramebuffer(36160, aVar2.a[0]);
            if (this.d != null) {
                this.d.b(i);
            }
            GLES20.glBindFramebuffer(36160, 0);
            this.a.add(aVar2);
            this.b.remove(0);
        }
        return r4;
    }

    public void b(int i) {
        this.c = i;
        if (this.f == null || this.f.length != this.c) {
            TXCOpenGlUtils.a(this.f);
            a();
            this.f = TXCOpenGlUtils.a(this.f, this.c, this.g, this.h);
            for (int i2 = 0; i2 < this.f.length; i2++) {
                this.b.add(this.f[i2]);
            }
        }
    }

    public void a() {
        this.b.clear();
        this.a.clear();
    }

    public void b() {
        if (this.d != null) {
            this.d.e();
            this.d = null;
        }
        TXCOpenGlUtils.a(this.f);
        this.f = null;
        a();
    }
}
