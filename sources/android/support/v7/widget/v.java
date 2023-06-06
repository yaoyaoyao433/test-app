package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class v extends aq {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.s> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.s> mPendingAdditions = new ArrayList<>();
    private ArrayList<b> mPendingMoves = new ArrayList<>();
    private ArrayList<a> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.s>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<b>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<a>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.s> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.s> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.s> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.s> mChangeAnimations = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public RecyclerView.s a;
        public int b;
        public int c;
        public int d;
        public int e;

        b(RecyclerView.s sVar, int i, int i2, int i3, int i4) {
            this.a = sVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public RecyclerView.s a;
        public RecyclerView.s b;
        public int c;
        public int d;
        public int e;
        public int f;

        private a(RecyclerView.s sVar, RecyclerView.s sVar2) {
            this.a = sVar;
            this.b = sVar2;
        }

        a(RecyclerView.s sVar, RecyclerView.s sVar2, int i, int i2, int i3, int i4) {
            this(sVar, sVar2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.s> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.mPendingRemovals.clear();
            if (z2) {
                final ArrayList<b> arrayList = new ArrayList<>();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                Runnable runnable = new Runnable() { // from class: android.support.v7.widget.v.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            b bVar = (b) it2.next();
                            v.this.animateMoveImpl(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e);
                        }
                        arrayList.clear();
                        v.this.mMovesList.remove(arrayList);
                    }
                };
                if (z) {
                    ViewCompat.postOnAnimationDelayed(arrayList.get(0).a.itemView, runnable, getRemoveDuration());
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final ArrayList<a> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                Runnable runnable2 = new Runnable() { // from class: android.support.v7.widget.v.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            v.this.animateChangeImpl((a) it2.next());
                        }
                        arrayList2.clear();
                        v.this.mChangesList.remove(arrayList2);
                    }
                };
                if (z) {
                    ViewCompat.postOnAnimationDelayed(arrayList2.get(0).a.itemView, runnable2, getRemoveDuration());
                } else {
                    runnable2.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.s> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                Runnable runnable3 = new Runnable() { // from class: android.support.v7.widget.v.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            v.this.animateAddImpl((RecyclerView.s) it2.next());
                        }
                        arrayList3.clear();
                        v.this.mAdditionsList.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    ViewCompat.postOnAnimationDelayed(arrayList3.get(0).itemView, runnable3, (z ? getRemoveDuration() : 0L) + Math.max(z2 ? getMoveDuration() : 0L, z3 ? getChangeDuration() : 0L));
                } else {
                    runnable3.run();
                }
            }
        }
    }

    @Override // android.support.v7.widget.aq
    public boolean animateRemove(RecyclerView.s sVar) {
        resetAnimation(sVar);
        this.mPendingRemovals.add(sVar);
        return true;
    }

    private void animateRemoveImpl(final RecyclerView.s sVar) {
        final View view = sVar.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(sVar);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.v.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                v.this.dispatchRemoveStarting(sVar);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                v.this.dispatchRemoveFinished(sVar);
                v.this.mRemoveAnimations.remove(sVar);
                v.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // android.support.v7.widget.aq
    public boolean animateAdd(RecyclerView.s sVar) {
        resetAnimation(sVar);
        sVar.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(sVar);
        return true;
    }

    void animateAddImpl(final RecyclerView.s sVar) {
        final View view = sVar.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(sVar);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.v.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                v.this.dispatchAddStarting(sVar);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                v.this.dispatchAddFinished(sVar);
                v.this.mAddAnimations.remove(sVar);
                v.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // android.support.v7.widget.aq
    public boolean animateMove(RecyclerView.s sVar, int i, int i2, int i3, int i4) {
        View view = sVar.itemView;
        int translationX = i + ((int) sVar.itemView.getTranslationX());
        int translationY = i2 + ((int) sVar.itemView.getTranslationY());
        resetAnimation(sVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(sVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.mPendingMoves.add(new b(sVar, translationX, translationY, i3, i4));
        return true;
    }

    void animateMoveImpl(final RecyclerView.s sVar, int i, int i2, int i3, int i4) {
        final View view = sVar.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(sVar);
        animate.setDuration(getMoveDuration()).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.v.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                v.this.dispatchMoveStarting(sVar);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                v.this.dispatchMoveFinished(sVar);
                v.this.mMoveAnimations.remove(sVar);
                v.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // android.support.v7.widget.aq
    public boolean animateChange(RecyclerView.s sVar, RecyclerView.s sVar2, int i, int i2, int i3, int i4) {
        if (sVar == sVar2) {
            return animateMove(sVar, i, i2, i3, i4);
        }
        float translationX = sVar.itemView.getTranslationX();
        float translationY = sVar.itemView.getTranslationY();
        float alpha = sVar.itemView.getAlpha();
        resetAnimation(sVar);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        sVar.itemView.setTranslationX(translationX);
        sVar.itemView.setTranslationY(translationY);
        sVar.itemView.setAlpha(alpha);
        if (sVar2 != null) {
            resetAnimation(sVar2);
            sVar2.itemView.setTranslationX(-i5);
            sVar2.itemView.setTranslationY(-i6);
            sVar2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new a(sVar, sVar2, i, i2, i3, i4));
        return true;
    }

    void animateChangeImpl(final a aVar) {
        RecyclerView.s sVar = aVar.a;
        final View view = sVar == null ? null : sVar.itemView;
        RecyclerView.s sVar2 = aVar.b;
        final View view2 = sVar2 != null ? sVar2.itemView : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(aVar.a);
            duration.translationX(aVar.e - aVar.c);
            duration.translationY(aVar.f - aVar.d);
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.v.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    v.this.dispatchChangeStarting(aVar.a, true);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    v.this.dispatchChangeFinished(aVar.a, true);
                    v.this.mChangeAnimations.remove(aVar.a);
                    v.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(aVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.v.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    v.this.dispatchChangeStarting(aVar.b, false);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    v.this.dispatchChangeFinished(aVar.b, false);
                    v.this.mChangeAnimations.remove(aVar.b);
                    v.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
    }

    private void endChangeAnimation(List<a> list, RecyclerView.s sVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list.get(size);
            if (endChangeAnimationIfNecessary(aVar, sVar) && aVar.a == null && aVar.b == null) {
                list.remove(aVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(a aVar) {
        if (aVar.a != null) {
            endChangeAnimationIfNecessary(aVar, aVar.a);
        }
        if (aVar.b != null) {
            endChangeAnimationIfNecessary(aVar, aVar.b);
        }
    }

    private boolean endChangeAnimationIfNecessary(a aVar, RecyclerView.s sVar) {
        boolean z = false;
        if (aVar.b == sVar) {
            aVar.b = null;
        } else if (aVar.a != sVar) {
            return false;
        } else {
            aVar.a = null;
            z = true;
        }
        sVar.itemView.setAlpha(1.0f);
        sVar.itemView.setTranslationX(0.0f);
        sVar.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(sVar, z);
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.s sVar) {
        View view = sVar.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).a == sVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(sVar);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, sVar);
        if (this.mPendingRemovals.remove(sVar)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(sVar);
        }
        if (this.mPendingAdditions.remove(sVar)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(sVar);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, sVar);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == sVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(sVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.s> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(sVar)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(sVar);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(sVar);
        this.mAddAnimations.remove(sVar);
        this.mChangeAnimations.remove(sVar);
        this.mMoveAnimations.remove(sVar);
        dispatchFinishedWhenDone();
    }

    private void resetAnimation(RecyclerView.s sVar) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        sVar.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(sVar);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.mPendingMoves.get(size);
            View view = bVar.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(bVar.a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.s sVar = this.mPendingAdditions.get(size3);
            sVar.itemView.setAlpha(1.0f);
            dispatchAddFinished(sVar);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(bVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.s> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.s sVar2 = arrayList2.get(size8);
                    sVar2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(sVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    void cancelAll(List<RecyclerView.s> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.s sVar, @NonNull List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(sVar, list);
    }
}
