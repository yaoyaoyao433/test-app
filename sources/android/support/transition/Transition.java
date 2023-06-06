package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;
import android.support.v4.view.ViewCompat;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.meituan.robust.common.CommonConstant;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    private ArrayMap<String, String> I;
    v g;
    private ArrayList<x> y;
    private ArrayList<x> z;
    private static final int[] i = {2, 1, 3, 4};
    private static final l j = new l() { // from class: android.support.transition.Transition.1
        @Override // android.support.transition.l
        public final Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private static ThreadLocal<ArrayMap<Animator, a>> A = new ThreadLocal<>();
    private String k = getClass().getName();
    long a = -1;
    long b = -1;
    private TimeInterpolator l = null;
    ArrayList<Integer> c = new ArrayList<>();
    ArrayList<View> d = new ArrayList<>();
    private ArrayList<String> m = null;
    private ArrayList<Class> n = null;
    private ArrayList<Integer> o = null;
    private ArrayList<View> p = null;
    private ArrayList<Class> q = null;
    private ArrayList<String> r = null;
    private ArrayList<Integer> s = null;
    private ArrayList<View> t = null;
    private ArrayList<Class> u = null;
    private y v = new y();
    private y w = new y();
    w e = null;
    private int[] x = i;
    private ViewGroup B = null;
    boolean f = false;
    private ArrayList<Animator> C = new ArrayList<>();
    private int D = 0;
    private boolean E = false;
    private boolean F = false;
    private ArrayList<b> G = null;
    private ArrayList<Animator> H = new ArrayList<>();
    l h = j;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface MatchOrder {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void a(@NonNull Transition transition);

        void b(@NonNull Transition transition);

        void c(@NonNull Transition transition);

        void d(@NonNull Transition transition);

        void e(@NonNull Transition transition);
    }

    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup, @Nullable x xVar, @Nullable x xVar2) {
        return null;
    }

    public abstract void a(@NonNull x xVar);

    @Nullable
    public String[] a() {
        return null;
    }

    public abstract void b(@NonNull x xVar);

    @NonNull
    public Transition a(long j2) {
        this.b = j2;
        return this;
    }

    @NonNull
    public Transition b(long j2) {
        this.a = j2;
        return this;
    }

    @NonNull
    public Transition a(@Nullable TimeInterpolator timeInterpolator) {
        this.l = timeInterpolator;
        return this;
    }

    private void a(y yVar, y yVar2) {
        x xVar;
        View view;
        View view2;
        View view3;
        ArrayMap arrayMap = new ArrayMap(yVar.a);
        ArrayMap arrayMap2 = new ArrayMap(yVar2.a);
        for (int i2 = 0; i2 < this.x.length; i2++) {
            switch (this.x[i2]) {
                case 1:
                    for (int size = arrayMap.size() - 1; size >= 0; size--) {
                        View view4 = (View) arrayMap.keyAt(size);
                        if (view4 != null && a(view4) && (xVar = (x) arrayMap2.remove(view4)) != null && xVar.b != null && a(xVar.b)) {
                            this.y.add((x) arrayMap.removeAt(size));
                            this.z.add(xVar);
                        }
                    }
                    break;
                case 2:
                    ArrayMap<String, View> arrayMap3 = yVar.d;
                    ArrayMap<String, View> arrayMap4 = yVar2.d;
                    int size2 = arrayMap3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        View valueAt = arrayMap3.valueAt(i3);
                        if (valueAt != null && a(valueAt) && (view = arrayMap4.get(arrayMap3.keyAt(i3))) != null && a(view)) {
                            x xVar2 = (x) arrayMap.get(valueAt);
                            x xVar3 = (x) arrayMap2.get(view);
                            if (xVar2 != null && xVar3 != null) {
                                this.y.add(xVar2);
                                this.z.add(xVar3);
                                arrayMap.remove(valueAt);
                                arrayMap2.remove(view);
                            }
                        }
                    }
                    break;
                case 3:
                    SparseArray<View> sparseArray = yVar.b;
                    SparseArray<View> sparseArray2 = yVar2.b;
                    int size3 = sparseArray.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        View valueAt2 = sparseArray.valueAt(i4);
                        if (valueAt2 != null && a(valueAt2) && (view2 = sparseArray2.get(sparseArray.keyAt(i4))) != null && a(view2)) {
                            x xVar4 = (x) arrayMap.get(valueAt2);
                            x xVar5 = (x) arrayMap2.get(view2);
                            if (xVar4 != null && xVar5 != null) {
                                this.y.add(xVar4);
                                this.z.add(xVar5);
                                arrayMap.remove(valueAt2);
                                arrayMap2.remove(view2);
                            }
                        }
                    }
                    break;
                case 4:
                    LongSparseArray<View> longSparseArray = yVar.c;
                    LongSparseArray<View> longSparseArray2 = yVar2.c;
                    int size4 = longSparseArray.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        View valueAt3 = longSparseArray.valueAt(i5);
                        if (valueAt3 != null && a(valueAt3) && (view3 = longSparseArray2.get(longSparseArray.keyAt(i5))) != null && a(view3)) {
                            x xVar6 = (x) arrayMap.get(valueAt3);
                            x xVar7 = (x) arrayMap2.get(view3);
                            if (xVar6 != null && xVar7 != null) {
                                this.y.add(xVar6);
                                this.z.add(xVar7);
                                arrayMap.remove(valueAt3);
                                arrayMap2.remove(view3);
                            }
                        }
                    }
                    break;
            }
        }
        for (int i6 = 0; i6 < arrayMap.size(); i6++) {
            x xVar8 = (x) arrayMap.valueAt(i6);
            if (a(xVar8.b)) {
                this.y.add(xVar8);
                this.z.add(null);
            }
        }
        for (int i7 = 0; i7 < arrayMap2.size(); i7++) {
            x xVar9 = (x) arrayMap2.valueAt(i7);
            if (a(xVar9.b)) {
                this.z.add(xVar9);
                this.y.add(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        Animator a2;
        int i2;
        int i3;
        View view;
        Animator animator;
        x xVar;
        Animator animator2;
        x xVar2;
        ArrayMap<Animator, a> f = f();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            x xVar3 = arrayList.get(i4);
            x xVar4 = arrayList2.get(i4);
            if (xVar3 != null && !xVar3.c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.c.contains(this)) {
                xVar4 = null;
            }
            if (xVar3 != null || xVar4 != null) {
                if ((xVar3 == null || xVar4 == null || a(xVar3, xVar4)) && (a2 = a(viewGroup, xVar3, xVar4)) != null) {
                    if (xVar4 != null) {
                        view = xVar4.b;
                        String[] a3 = a();
                        if (view == null || a3 == null || a3.length <= 0) {
                            animator2 = a2;
                            i2 = size;
                            i3 = i4;
                            xVar2 = null;
                        } else {
                            xVar2 = new x();
                            xVar2.b = view;
                            animator2 = a2;
                            i2 = size;
                            x xVar5 = yVar2.a.get(view);
                            if (xVar5 != null) {
                                int i5 = 0;
                                while (i5 < a3.length) {
                                    xVar2.a.put(a3[i5], xVar5.a.get(a3[i5]));
                                    i5++;
                                    i4 = i4;
                                    xVar5 = xVar5;
                                }
                            }
                            i3 = i4;
                            int size2 = f.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                a aVar = f.get(f.keyAt(i6));
                                if (aVar.c != null && aVar.a == view && aVar.b.equals(this.k) && aVar.c.equals(xVar2)) {
                                    xVar = xVar2;
                                    animator = null;
                                    break;
                                }
                            }
                        }
                        xVar = xVar2;
                        animator = animator2;
                    } else {
                        i2 = size;
                        i3 = i4;
                        view = xVar3.b;
                        animator = a2;
                        xVar = null;
                    }
                    if (animator != null) {
                        if (this.g != null) {
                            long a4 = this.g.a(viewGroup, this, xVar3, xVar4);
                            sparseIntArray.put(this.H.size(), (int) a4);
                            j2 = Math.min(a4, j2);
                        }
                        f.put(animator, new a(view, this.k, this, ak.b(viewGroup), xVar));
                        this.H.add(animator);
                        j2 = j2;
                    }
                    i4 = i3 + 1;
                    size = i2;
                }
            }
            i2 = size;
            i3 = i4;
            i4 = i3 + 1;
            size = i2;
        }
        if (j2 != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.H.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay((sparseIntArray.valueAt(i7) - j2) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(View view) {
        int id = view.getId();
        if (this.o == null || !this.o.contains(Integer.valueOf(id))) {
            if (this.p == null || !this.p.contains(view)) {
                if (this.q != null) {
                    int size = this.q.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.q.get(i2).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.r == null || ViewCompat.getTransitionName(view) == null || !this.r.contains(ViewCompat.getTransitionName(view))) {
                    if ((this.c.size() == 0 && this.d.size() == 0 && ((this.n == null || this.n.isEmpty()) && (this.m == null || this.m.isEmpty()))) || this.c.contains(Integer.valueOf(id)) || this.d.contains(view)) {
                        return true;
                    }
                    if (this.m == null || !this.m.contains(ViewCompat.getTransitionName(view))) {
                        if (this.n != null) {
                            for (int i3 = 0; i3 < this.n.size(); i3++) {
                                if (this.n.get(i3).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private static ArrayMap<Animator, a> f() {
        ArrayMap<Animator, a> arrayMap = A.get();
        if (arrayMap == null) {
            ArrayMap<Animator, a> arrayMap2 = new ArrayMap<>();
            A.set(arrayMap2);
            return arrayMap2;
        }
        return arrayMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void b() {
        c();
        final ArrayMap<Animator, a> f = f();
        Iterator<Animator> it = this.H.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (f.containsKey(next)) {
                c();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.Transition.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            Transition.this.C.add(animator);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            f.remove(animator);
                            Transition.this.C.remove(animator);
                        }
                    });
                    if (next == null) {
                        d();
                    } else {
                        if (this.b >= 0) {
                            next.setDuration(this.b);
                        }
                        if (this.a >= 0) {
                            next.setStartDelay(this.a);
                        }
                        if (this.l != null) {
                            next.setInterpolator(this.l);
                        }
                        next.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.Transition.3
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                Transition.this.d();
                                animator.removeListener(this);
                            }
                        });
                        next.start();
                    }
                }
            }
        }
        this.H.clear();
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ViewGroup viewGroup, boolean z) {
        a(z);
        if ((this.c.size() > 0 || this.d.size() > 0) && ((this.m == null || this.m.isEmpty()) && (this.n == null || this.n.isEmpty()))) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.c.get(i2).intValue());
                if (findViewById != null) {
                    x xVar = new x();
                    xVar.b = findViewById;
                    if (z) {
                        a(xVar);
                    } else {
                        b(xVar);
                    }
                    xVar.c.add(this);
                    c(xVar);
                    if (z) {
                        a(this.v, findViewById, xVar);
                    } else {
                        a(this.w, findViewById, xVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                View view = this.d.get(i3);
                x xVar2 = new x();
                xVar2.b = view;
                if (z) {
                    a(xVar2);
                } else {
                    b(xVar2);
                }
                xVar2.c.add(this);
                c(xVar2);
                if (z) {
                    a(this.v, view, xVar2);
                } else {
                    a(this.w, view, xVar2);
                }
            }
        } else {
            c(viewGroup, z);
        }
        if (z || this.I == null) {
            return;
        }
        int size = this.I.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(this.v.d.remove(this.I.keyAt(i4)));
        }
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) arrayList.get(i5);
            if (view2 != null) {
                this.v.d.put(this.I.valueAt(i5), view2);
            }
        }
    }

    private static void a(y yVar, View view, x xVar) {
        yVar.a.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (yVar.b.indexOfKey(id) >= 0) {
                yVar.b.put(id, null);
            } else {
                yVar.b.put(id, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (yVar.d.containsKey(transitionName)) {
                yVar.d.put(transitionName, null);
            } else {
                yVar.d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.c.indexOfKey(itemIdAtPosition) >= 0) {
                    View view2 = yVar.c.get(itemIdAtPosition);
                    if (view2 != null) {
                        ViewCompat.setHasTransientState(view2, false);
                        yVar.c.put(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.setHasTransientState(view, true);
                yVar.c.put(itemIdAtPosition, view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (z) {
            this.v.a.clear();
            this.v.b.clear();
            this.v.c.clear();
            return;
        }
        this.w.a.clear();
        this.w.b.clear();
        this.w.c.clear();
    }

    private void c(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (this.o == null || !this.o.contains(Integer.valueOf(id))) {
            if (this.p == null || !this.p.contains(view)) {
                if (this.q != null) {
                    int size = this.q.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.q.get(i2).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    x xVar = new x();
                    xVar.b = view;
                    if (z) {
                        a(xVar);
                    } else {
                        b(xVar);
                    }
                    xVar.c.add(this);
                    c(xVar);
                    if (z) {
                        a(this.v, view, xVar);
                    } else {
                        a(this.w, view, xVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    if (this.s == null || !this.s.contains(Integer.valueOf(id))) {
                        if (this.t == null || !this.t.contains(view)) {
                            if (this.u != null) {
                                int size2 = this.u.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (this.u.get(i3).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                c(viewGroup.getChildAt(i4), z);
                            }
                        }
                    }
                }
            }
        }
    }

    @Nullable
    public final x a(@NonNull View view, boolean z) {
        Transition transition = this;
        while (transition.e != null) {
            transition = transition.e;
        }
        return (z ? transition.v : transition.w).a.get(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final x b(View view, boolean z) {
        Transition transition = this;
        while (transition.e != null) {
            transition = transition.e;
        }
        ArrayList<x> arrayList = z ? transition.y : transition.z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            x xVar = arrayList.get(i3);
            if (xVar == null) {
                return null;
            }
            if (xVar.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            return (z ? transition.z : transition.y).get(i2);
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void b(View view) {
        if (this.F) {
            return;
        }
        ArrayMap<Animator, a> f = f();
        int size = f.size();
        at b2 = ak.b(view);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            a valueAt = f.valueAt(i2);
            if (valueAt.a != null && b2.equals(valueAt.d)) {
                android.support.transition.a.a(f.keyAt(i2));
            }
        }
        if (this.G != null && this.G.size() > 0) {
            ArrayList arrayList = (ArrayList) this.G.clone();
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((b) arrayList.get(i3)).c(this);
            }
        }
        this.E = true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void c(View view) {
        if (this.E) {
            if (!this.F) {
                ArrayMap<Animator, a> f = f();
                int size = f.size();
                at b2 = ak.b(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    a valueAt = f.valueAt(i2);
                    if (valueAt.a != null && b2.equals(valueAt.d)) {
                        android.support.transition.a.b(f.keyAt(i2));
                    }
                }
                if (this.G != null && this.G.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.G.clone();
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((b) arrayList.get(i3)).d(this);
                    }
                }
            }
            this.E = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ViewGroup viewGroup) {
        a aVar;
        this.y = new ArrayList<>();
        this.z = new ArrayList<>();
        a(this.v, this.w);
        ArrayMap<Animator, a> f = f();
        int size = f.size();
        at b2 = ak.b(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator keyAt = f.keyAt(i2);
            if (keyAt != null && (aVar = f.get(keyAt)) != null && aVar.a != null && b2.equals(aVar.d)) {
                x xVar = aVar.c;
                View view = aVar.a;
                x a2 = a(view, true);
                x b3 = b(view, true);
                if (!(a2 == null && b3 == null) && aVar.e.a(xVar, b3)) {
                    if (keyAt.isRunning() || keyAt.isStarted()) {
                        keyAt.cancel();
                    } else {
                        f.remove(keyAt);
                    }
                }
            }
        }
        a(viewGroup, this.v, this.w, this.y, this.z);
        b();
    }

    public boolean a(@Nullable x xVar, @Nullable x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] a2 = a();
            if (a2 != null) {
                for (String str : a2) {
                    if (a(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : xVar.a.keySet()) {
                    if (a(xVar, xVar2, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean a(x xVar, x xVar2, String str) {
        Object obj = xVar.a.get(str);
        Object obj2 = xVar2.a.get(str);
        return !(obj == null && obj2 == null) && (obj == null || obj2 == null || !obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void c() {
        if (this.D == 0) {
            if (this.G != null && this.G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.G.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((b) arrayList.get(i2)).e(this);
                }
            }
            this.F = false;
        }
        this.D++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void d() {
        this.D--;
        if (this.D == 0) {
            if (this.G != null && this.G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.G.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((b) arrayList.get(i2)).b(this);
                }
            }
            for (int i3 = 0; i3 < this.v.c.size(); i3++) {
                View valueAt = this.v.c.valueAt(i3);
                if (valueAt != null) {
                    ViewCompat.setHasTransientState(valueAt, false);
                }
            }
            for (int i4 = 0; i4 < this.w.c.size(); i4++) {
                View valueAt2 = this.w.c.valueAt(i4);
                if (valueAt2 != null) {
                    ViewCompat.setHasTransientState(valueAt2, false);
                }
            }
            this.F = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void cancel() {
        for (int size = this.C.size() - 1; size >= 0; size--) {
            this.C.get(size).cancel();
        }
        if (this.G == null || this.G.size() <= 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.G.clone();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((b) arrayList.get(i2)).a(this);
        }
    }

    @NonNull
    public Transition a(@NonNull b bVar) {
        if (this.G == null) {
            this.G = new ArrayList<>();
        }
        this.G.add(bVar);
        return this;
    }

    @NonNull
    public Transition b(@NonNull b bVar) {
        if (this.G == null) {
            return this;
        }
        this.G.remove(bVar);
        if (this.G.size() == 0) {
            this.G = null;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(x xVar) {
        String[] a2;
        if (this.g == null || xVar.a.isEmpty() || (a2 = this.g.a()) == null) {
            return;
        }
        for (int i2 = 0; i2 < a2.length && xVar.a.containsKey(a2[i2]); i2++) {
        }
    }

    public String toString() {
        return a("");
    }

    @Override // 
    /* renamed from: e */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.H = new ArrayList<>();
            transition.v = new y();
            transition.w = new y();
            transition.y = null;
            transition.z = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.b != -1) {
            str2 = str2 + "dur(" + this.b + ") ";
        }
        if (this.a != -1) {
            str2 = str2 + "dly(" + this.a + ") ";
        }
        if (this.l != null) {
            str2 = str2 + "interp(" + this.l + ") ";
        }
        if (this.c.size() > 0 || this.d.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.c.size() > 0) {
                String str4 = str3;
                for (int i2 = 0; i2 < this.c.size(); i2++) {
                    if (i2 > 0) {
                        str4 = str4 + ", ";
                    }
                    str4 = str4 + this.c.get(i2);
                }
                str3 = str4;
            }
            if (this.d.size() > 0) {
                for (int i3 = 0; i3 < this.d.size(); i3++) {
                    if (i3 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.d.get(i3);
                }
            }
            return str3 + CommonConstant.Symbol.BRACKET_RIGHT;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        View a;
        String b;
        x c;
        at d;
        Transition e;

        a(View view, String str, Transition transition, at atVar, x xVar) {
            this.a = view;
            this.b = str;
            this.c = xVar;
            this.d = atVar;
            this.e = transition;
        }
    }
}
