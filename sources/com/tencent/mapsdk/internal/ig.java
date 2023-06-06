package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class ig implements Cloneable {
    ArrayList<a> a = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void a(ig igVar);

        void b();

        void b(ig igVar);
    }

    public void a() {
    }

    public abstract void a(long j);

    public abstract void a(Interpolator interpolator);

    public abstract ig b(long j);

    public void b() {
    }

    public void c() {
    }

    public abstract long d();

    public abstract long e();

    public abstract boolean f();

    public boolean g() {
        return f();
    }

    public final void a(a aVar) {
        if (this.a == null) {
            this.a = new ArrayList<>();
        }
        this.a.add(aVar);
    }

    public final void b(a aVar) {
        if (this.a == null) {
            return;
        }
        this.a.remove(aVar);
        if (this.a.size() == 0) {
            this.a = null;
        }
    }

    private ArrayList<a> i() {
        return this.a;
    }

    private void j() {
        if (this.a != null) {
            this.a.clear();
            this.a = null;
        }
    }

    @Override // 
    /* renamed from: h */
    public ig clone() {
        try {
            ig igVar = (ig) super.clone();
            if (this.a != null) {
                ArrayList<a> arrayList = this.a;
                igVar.a = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    igVar.a.add(arrayList.get(i));
                }
            }
            return igVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
