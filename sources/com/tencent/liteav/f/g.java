package com.tencent.liteav.f;

import com.tencent.liteav.i.a;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {
    private static g a;
    private List<a.j> b;

    public float a(int i) {
        switch (i) {
            case 0:
                return 0.25f;
            case 1:
                return 0.5f;
            case 2:
                return 1.0f;
            case 3:
                return 1.5f;
            case 4:
                return 2.0f;
            default:
                return 1.0f;
        }
    }

    public static g a() {
        if (a == null) {
            a = new g();
        }
        return a;
    }

    private g() {
    }

    public void a(List<a.j> list) {
        this.b = list;
    }

    public List<a.j> b() {
        return this.b;
    }

    public boolean c() {
        if (this.b == null || this.b.size() == 0) {
            return false;
        }
        for (a.j jVar : this.b) {
            if (jVar.a != 2) {
                return true;
            }
        }
        return false;
    }

    public float a(long j) {
        if (this.b == null || this.b.size() == 0) {
            return 1.0f;
        }
        for (a.j jVar : this.b) {
            if (j > jVar.b * 1000 && j < jVar.c * 1000) {
                return a(jVar.a);
            }
        }
        return 1.0f;
    }

    public void d() {
        if (this.b != null) {
            this.b.clear();
        }
        this.b = null;
    }

    public long b(long j) {
        List<a.j> b = a().b();
        for (int i = 0; i < b.size(); i++) {
            a.j jVar = b.get(i);
            float a2 = a(jVar.a);
            long j2 = (jVar.c - jVar.b) * 1000;
            j = (j + (((float) j2) / a2)) - j2;
        }
        return j;
    }
}
