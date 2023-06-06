package android.support.transition;

import android.animation.TimeInterpolator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.transition.Transition;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class w extends Transition {
    private int k;
    private ArrayList<Transition> i = new ArrayList<>();
    private boolean j = true;
    private boolean l = false;

    static /* synthetic */ int b(w wVar) {
        int i = wVar.k - 1;
        wVar.k = i;
        return i;
    }

    @NonNull
    public final w a(int i) {
        switch (i) {
            case 0:
                this.j = true;
                break;
            case 1:
                this.j = false;
                break;
            default:
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @NonNull
    public final w b(@NonNull Transition transition) {
        this.i.add(transition);
        transition.e = this;
        if (this.b >= 0) {
            transition.a(this.b);
        }
        return this;
    }

    @Override // android.support.transition.Transition
    @NonNull
    /* renamed from: c */
    public final w a(long j) {
        super.a(j);
        if (this.b >= 0) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                this.i.get(i).a(j);
            }
        }
        return this;
    }

    @Override // android.support.transition.Transition
    @NonNull
    /* renamed from: b */
    public final w a(@Nullable TimeInterpolator timeInterpolator) {
        return (w) super.a(timeInterpolator);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends t {
        w a;

        a(w wVar) {
            this.a = wVar;
        }

        @Override // android.support.transition.t, android.support.transition.Transition.b
        public final void e(@NonNull Transition transition) {
            if (this.a.l) {
                return;
            }
            this.a.c();
            this.a.l = true;
        }

        @Override // android.support.transition.t, android.support.transition.Transition.b
        public final void b(@NonNull Transition transition) {
            w.b(this.a);
            if (this.a.k == 0) {
                this.a.l = false;
                this.a.d();
            }
            transition.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b() {
        if (this.i.isEmpty()) {
            c();
            d();
            return;
        }
        a aVar = new a(this);
        Iterator<Transition> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
        this.k = this.i.size();
        if (!this.j) {
            for (int i = 1; i < this.i.size(); i++) {
                final Transition transition = this.i.get(i);
                this.i.get(i - 1).a(new t() { // from class: android.support.transition.w.1
                    @Override // android.support.transition.t, android.support.transition.Transition.b
                    public final void b(@NonNull Transition transition2) {
                        transition.b();
                        transition2.b(this);
                    }
                });
            }
            Transition transition2 = this.i.get(0);
            if (transition2 != null) {
                transition2.b();
                return;
            }
            return;
        }
        Iterator<Transition> it2 = this.i.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
    }

    @Override // android.support.transition.Transition
    public final void a(@NonNull x xVar) {
        if (a(xVar.b)) {
            Iterator<Transition> it = this.i.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.a(xVar.b)) {
                    next.a(xVar);
                    xVar.c.add(next);
                }
            }
        }
    }

    @Override // android.support.transition.Transition
    public final void b(@NonNull x xVar) {
        if (a(xVar.b)) {
            Iterator<Transition> it = this.i.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.a(xVar.b)) {
                    next.b(xVar);
                    xVar.c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public final void c(x xVar) {
        super.c(xVar);
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            this.i.get(i).c(xVar);
        }
    }

    @Override // android.support.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b(View view) {
        super.b(view);
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            this.i.get(i).b(view);
        }
    }

    @Override // android.support.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void c(View view) {
        super.c(view);
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            this.i.get(i).c(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void cancel() {
        super.cancel();
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            this.i.get(i).cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public final String a(String str) {
        String a2 = super.a(str);
        for (int i = 0; i < this.i.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("\n");
            sb.append(this.i.get(i).a(str + "  "));
            a2 = sb.toString();
        }
        return a2;
    }

    @Override // android.support.transition.Transition
    /* renamed from: e */
    public final Transition clone() {
        w wVar = (w) super.clone();
        wVar.i = new ArrayList<>();
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            wVar.b(this.i.get(i).clone());
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        long j = this.a;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.i.get(i);
            if (j > 0 && (this.j || i == 0)) {
                long j2 = transition.a;
                if (j2 > 0) {
                    transition.b(j2 + j);
                } else {
                    transition.b(j);
                }
            }
            transition.a(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    @Override // android.support.transition.Transition
    @NonNull
    public final /* bridge */ /* synthetic */ Transition b(@NonNull Transition.b bVar) {
        return (w) super.b(bVar);
    }

    @Override // android.support.transition.Transition
    @NonNull
    public final /* bridge */ /* synthetic */ Transition a(@NonNull Transition.b bVar) {
        return (w) super.a(bVar);
    }

    @Override // android.support.transition.Transition
    @NonNull
    public final /* bridge */ /* synthetic */ Transition b(long j) {
        return (w) super.b(j);
    }
}
