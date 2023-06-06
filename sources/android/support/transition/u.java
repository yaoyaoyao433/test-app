package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class u {
    private static Transition a = new e();
    private static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> b = new ThreadLocal<>();
    private static ArrayList<ViewGroup> c = new ArrayList<>();

    static ArrayMap<ViewGroup, ArrayList<Transition>> a() {
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference = b.get();
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference2 = new WeakReference<>(new ArrayMap());
            b.set(weakReference2);
            weakReference = weakReference2;
        }
        return weakReference.get();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
        Transition a;
        ViewGroup b;

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        a(Transition transition, ViewGroup viewGroup) {
            this.a = transition;
            this.b = viewGroup;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            a();
            u.c.remove(this.b);
            ArrayList<Transition> arrayList = u.a().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().c(this.b);
                }
            }
            this.a.a(true);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            a();
            if (u.c.remove(this.b)) {
                final ArrayMap<ViewGroup, ArrayList<Transition>> a = u.a();
                ArrayList<Transition> arrayList = a.get(this.b);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    a.put(this.b, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.a);
                this.a.a(new t() { // from class: android.support.transition.u.a.1
                    @Override // android.support.transition.t, android.support.transition.Transition.b
                    public final void b(@NonNull Transition transition) {
                        ((ArrayList) a.get(a.this.b)).remove(transition);
                    }
                });
                this.a.a(this.b, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).c(this.b);
                    }
                }
                this.a.a(this.b);
                return true;
            }
            return true;
        }
    }

    public static void a(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        if (c.contains(viewGroup) || !ViewCompat.isLaidOut(viewGroup)) {
            return;
        }
        c.add(viewGroup);
        if (transition == null) {
            transition = a;
        }
        Transition clone = transition.clone();
        ArrayList<Transition> arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(viewGroup);
            }
        }
        if (clone != null) {
            clone.a(viewGroup, true);
        }
        s a2 = s.a(viewGroup);
        if (a2 != null && s.a(a2.a) == a2 && a2.b != null) {
            a2.b.run();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        if (clone == null || viewGroup == null) {
            return;
        }
        a aVar = new a(clone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }
}
