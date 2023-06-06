package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ProGuard */
@TargetApi(19)
/* loaded from: classes.dex */
public final class k implements i, l {
    private final String d;
    private final com.airbnb.lottie.model.content.h f;
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List<l> e = new ArrayList();

    public k(com.airbnb.lottie.model.content.h hVar) {
        if (Build.VERSION.SDK_INT < 19) {
            throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.d = hVar.a;
        this.f = hVar;
    }

    @Override // com.airbnb.lottie.animation.content.i
    public final void a(ListIterator<b> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            b previous = listIterator.previous();
            if (previous instanceof l) {
                this.e.add((l) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).a(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.l
    public final Path e() {
        this.c.reset();
        switch (this.f.b) {
            case Merge:
                for (int i = 0; i < this.e.size(); i++) {
                    this.c.addPath(this.e.get(i).e());
                }
                break;
            case Add:
                a(Path.Op.UNION);
                break;
            case Subtract:
                a(Path.Op.REVERSE_DIFFERENCE);
                break;
            case Intersect:
                a(Path.Op.INTERSECT);
                break;
            case ExcludeIntersections:
                a(Path.Op.XOR);
                break;
        }
        return this.c;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.d;
    }

    @TargetApi(19)
    private void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size > 0; size--) {
            l lVar = this.e.get(size);
            if (lVar instanceof c) {
                c cVar = (c) lVar;
                List<l> c = cVar.c();
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    Path e = c.get(size2).e();
                    e.transform(cVar.d());
                    this.b.addPath(e);
                }
            } else {
                this.b.addPath(lVar.e());
            }
        }
        l lVar2 = this.e.get(0);
        if (lVar2 instanceof c) {
            c cVar2 = (c) lVar2;
            List<l> c2 = cVar2.c();
            for (int i = 0; i < c2.size(); i++) {
                Path e2 = c2.get(i).e();
                e2.transform(cVar2.d());
                this.a.addPath(e2);
            }
        } else {
            this.a.set(lVar2.e());
        }
        this.c.op(this.a, this.b, op);
    }
}
