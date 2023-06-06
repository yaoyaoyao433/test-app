package com.airbnb.lottie.animation.keyframe;

import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import com.tencent.mapsdk.internal.bw;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<K, A> {
    final List<InterfaceC0016a> a = new ArrayList();
    public boolean b = false;
    public float c = 0.0f;
    @Nullable
    protected com.airbnb.lottie.value.c<A> d;
    private final List<? extends com.airbnb.lottie.value.a<K>> e;
    @Nullable
    private com.airbnb.lottie.value.a<K> f;

    /* compiled from: ProGuard */
    /* renamed from: com.airbnb.lottie.animation.keyframe.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0016a {
        void a();
    }

    abstract A a(com.airbnb.lottie.value.a<K> aVar, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<? extends com.airbnb.lottie.value.a<K>> list) {
        this.e = list;
    }

    public final void a(InterfaceC0016a interfaceC0016a) {
        this.a.add(interfaceC0016a);
    }

    public void a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (f < f()) {
            f = f();
        } else if (f > c()) {
            f = c();
        }
        if (f == this.c) {
            return;
        }
        this.c = f;
        a();
    }

    public void a() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    private com.airbnb.lottie.value.a<K> e() {
        if (this.f != null && this.f.a(this.c)) {
            return this.f;
        }
        com.airbnb.lottie.value.a<K> aVar = this.e.get(this.e.size() - 1);
        if (this.c < aVar.a()) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                aVar = this.e.get(size);
                if (aVar.a(this.c)) {
                    break;
                }
            }
        }
        this.f = aVar;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        if (this.b) {
            return 0.0f;
        }
        com.airbnb.lottie.value.a<K> e = e();
        if (e.c()) {
            return 0.0f;
        }
        return (this.c - e.a()) / (e.b() - e.a());
    }

    @FloatRange(from = 0.0d, to = bw.a)
    private float f() {
        if (this.e.isEmpty()) {
            return 0.0f;
        }
        return this.e.get(0).a();
    }

    @FloatRange(from = 0.0d, to = bw.a)
    float c() {
        if (this.e.isEmpty()) {
            return 1.0f;
        }
        return this.e.get(this.e.size() - 1).b();
    }

    public A d() {
        com.airbnb.lottie.value.a<K> e = e();
        com.airbnb.lottie.value.a<K> e2 = e();
        return a(e, e2.c() ? 0.0f : e2.d.getInterpolation(b()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@Nullable com.airbnb.lottie.value.c<A> cVar) {
        if (this.d != null) {
            this.d.a = null;
        }
        this.d = cVar;
        if (cVar != null) {
            cVar.a = this;
        }
    }
}
