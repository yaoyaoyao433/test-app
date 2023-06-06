package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r implements b, a.InterfaceC0016a {
    final int a;
    public final com.airbnb.lottie.animation.keyframe.a<?, Float> b;
    public final com.airbnb.lottie.animation.keyframe.a<?, Float> c;
    public final com.airbnb.lottie.animation.keyframe.a<?, Float> d;
    private final String e;
    private final List<a.InterfaceC0016a> f = new ArrayList();

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
    }

    public r(com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.q qVar) {
        this.e = qVar.a;
        this.a = qVar.b;
        this.b = qVar.c.a();
        this.c = qVar.d.a();
        this.d = qVar.e.a();
        aVar.a(this.b);
        aVar.a(this.c);
        aVar.a(this.d);
        this.b.a(this);
        this.c.a(this);
        this.d.a(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        for (int i = 0; i < this.f.size(); i++) {
            this.f.get(i).a();
        }
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(a.InterfaceC0016a interfaceC0016a) {
        this.f.add(interfaceC0016a);
    }
}
