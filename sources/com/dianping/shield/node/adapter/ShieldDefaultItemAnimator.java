package com.dianping.shield.node.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.aq;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.dianping.shield.node.adapter.animator.AnimationType;
import com.dianping.shield.node.adapter.animator.AnimatorFactory;
import com.dianping.shield.node.adapter.animator.BaseAnimator;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ShieldDefaultItemAnimator extends aq {
    private static final boolean DEBUG = false;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static TimeInterpolator sDefaultInterpolator;
    private final ArrayList<RecyclerView.s> mAddAnimations;
    private final ArrayList<ArrayList<RecyclerView.s>> mAdditionsList;
    private final ArrayList<RecyclerView.s> mChangeAnimations;
    private final ArrayList<ArrayList<ChangeInfo>> mChangesList;
    private final Handler mMainHandler;
    private final ArrayList<RecyclerView.s> mMoveAnimations;
    private final ArrayList<ArrayList<MoveInfo>> mMovesList;
    private final ArrayList<RecyclerView.s> mPendingAdditions;
    private final ArrayList<ChangeInfo> mPendingChanges;
    private final ArrayList<MoveInfo> mPendingMoves;
    private final ArrayList<RecyclerView.s> mPendingRemovals;
    private final ArrayList<ArrayList<RecyclerView.s>> mRemovalsList;
    private final ArrayList<RecyclerView.s> mRemoveAnimations;

    public ShieldDefaultItemAnimator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39f3e66f3349af3ba98c674f1bbb41e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39f3e66f3349af3ba98c674f1bbb41e2");
            return;
        }
        this.mPendingRemovals = new ArrayList<>();
        this.mPendingAdditions = new ArrayList<>();
        this.mPendingMoves = new ArrayList<>();
        this.mPendingChanges = new ArrayList<>();
        this.mRemovalsList = new ArrayList<>();
        this.mAdditionsList = new ArrayList<>();
        this.mMovesList = new ArrayList<>();
        this.mChangesList = new ArrayList<>();
        this.mAddAnimations = new ArrayList<>();
        this.mMoveAnimations = new ArrayList<>();
        this.mRemoveAnimations = new ArrayList<>();
        this.mChangeAnimations = new ArrayList<>();
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class MoveInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int fromX;
        public int fromY;
        public RecyclerView.s holder;
        public int toX;
        public int toY;

        public MoveInfo(RecyclerView.s sVar, int i, int i2, int i3, int i4) {
            this.holder = sVar;
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ChangeInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int fromX;
        public int fromY;
        public RecyclerView.s newHolder;
        public RecyclerView.s oldHolder;
        public int toX;
        public int toY;

        public ChangeInfo(RecyclerView.s sVar, RecyclerView.s sVar2) {
            Object[] objArr = {sVar, sVar2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbeabb235e16dd95b2f274655f03bd3b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbeabb235e16dd95b2f274655f03bd3b");
                return;
            }
            this.oldHolder = sVar;
            this.newHolder = sVar2;
        }

        public ChangeInfo(RecyclerView.s sVar, RecyclerView.s sVar2, int i, int i2, int i3, int i4) {
            this(sVar, sVar2);
            Object[] objArr = {sVar, sVar2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91e96001ec319a4bd627d1a088dd1ba1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91e96001ec319a4bd627d1a088dd1ba1");
                return;
            }
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a12da94cf8ba975d7ed7daae4624532", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a12da94cf8ba975d7ed7daae4624532");
            }
            return "ChangeInfo{oldHolder=" + this.oldHolder + ", newHolder=" + this.newHolder + ", fromX=" + this.fromX + ", fromY=" + this.fromY + ", toX=" + this.toX + ", toY=" + this.toY + '}';
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b94c40c95fd3b0bcd49ed4a274442dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b94c40c95fd3b0bcd49ed4a274442dd");
            return;
        }
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            if (z) {
                final ArrayList<RecyclerView.s> arrayList = new ArrayList<>(this.mPendingRemovals);
                this.mRemovalsList.add(arrayList);
                this.mPendingRemovals.clear();
                this.mMainHandler.post(new Runnable() { // from class: com.dianping.shield.node.adapter.ShieldDefaultItemAnimator.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "89126edcc73d0634757ac54d1da07843", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "89126edcc73d0634757ac54d1da07843");
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ShieldDefaultItemAnimator.this.animateRemoveImpl((RecyclerView.s) it.next());
                        }
                        arrayList.clear();
                        ShieldDefaultItemAnimator.this.mRemovalsList.remove(arrayList);
                    }
                });
            }
            if (z4) {
                final ArrayList<RecyclerView.s> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList2);
                this.mPendingAdditions.clear();
                Runnable runnable = new Runnable() { // from class: com.dianping.shield.node.adapter.ShieldDefaultItemAnimator.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4125b95b06c87e477d3cf8340ee81f42", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4125b95b06c87e477d3cf8340ee81f42");
                            return;
                        }
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ShieldDefaultItemAnimator.this.animateAddImpl((RecyclerView.s) it.next());
                        }
                        arrayList2.clear();
                        ShieldDefaultItemAnimator.this.mAdditionsList.remove(arrayList2);
                    }
                };
                if (z || z2 || z3) {
                    if (z) {
                        getRemoveDuration();
                    }
                    Math.max(z2 ? getMoveDuration() : 0L, z3 ? getChangeDuration() : 0L);
                    this.mMainHandler.post(runnable);
                } else {
                    runnable.run();
                }
            }
            if (z2) {
                final ArrayList<MoveInfo> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList3);
                this.mPendingMoves.clear();
                Runnable runnable2 = new Runnable() { // from class: com.dianping.shield.node.adapter.ShieldDefaultItemAnimator.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f2ea668caf7571e7af8a56747c94fde", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f2ea668caf7571e7af8a56747c94fde");
                            return;
                        }
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            MoveInfo moveInfo = (MoveInfo) it.next();
                            ShieldDefaultItemAnimator.this.animateMoveImpl(moveInfo.holder, moveInfo.fromX, moveInfo.fromY, moveInfo.toX, moveInfo.toY);
                        }
                        arrayList3.clear();
                        ShieldDefaultItemAnimator.this.mMovesList.remove(arrayList3);
                    }
                };
                if (z) {
                    this.mMainHandler.post(runnable2);
                } else {
                    runnable2.run();
                }
            }
            if (z3) {
                final ArrayList<ChangeInfo> arrayList4 = new ArrayList<>();
                arrayList4.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList4);
                this.mPendingChanges.clear();
                Runnable runnable3 = new Runnable() { // from class: com.dianping.shield.node.adapter.ShieldDefaultItemAnimator.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25f50ffcbef59eeedfe334654ef4a855", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25f50ffcbef59eeedfe334654ef4a855");
                            return;
                        }
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            ShieldDefaultItemAnimator.this.animateChangeImpl((ChangeInfo) it.next());
                        }
                        arrayList4.clear();
                        ShieldDefaultItemAnimator.this.mChangesList.remove(arrayList4);
                    }
                };
                if (z) {
                    ViewCompat.postOnAnimationDelayed(arrayList4.get(0).oldHolder.itemView, runnable3, getRemoveDuration());
                } else {
                    runnable3.run();
                }
            }
        }
    }

    @Override // android.support.v7.widget.aq
    public boolean animateRemove(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50f5421abdf65df4485c57f340c24572", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50f5421abdf65df4485c57f340c24572")).booleanValue();
        }
        resetAnimation(sVar);
        if (needWrappedAnimator(sVar)) {
            WrappedViewHolderAnimator wrappedViewHolderAnimator = new WrappedViewHolderAnimator(sVar, 102);
            BaseAnimator animator = wrappedViewHolderAnimator.getAnimator();
            if (animator != null) {
                animator.preAnimateRemove(wrappedViewHolderAnimator);
            }
            this.mPendingRemovals.add(wrappedViewHolderAnimator);
        } else {
            this.mPendingRemovals.add(sVar);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateRemoveImpl(final RecyclerView.s sVar) {
        BaseAnimator animator;
        boolean z = true;
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6ced5c426cd585da895ee9e5377dc38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6ced5c426cd585da895ee9e5377dc38");
            return;
        }
        final View view = sVar.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(sVar);
        if (!(sVar instanceof WrappedViewHolderAnimator) || (animator = ((WrappedViewHolderAnimator) sVar).getAnimator()) == null) {
            z = false;
        } else {
            animator.animateRemove(sVar);
        }
        if (z) {
            return;
        }
        animate.setDuration(0L).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.dianping.shield.node.adapter.ShieldDefaultItemAnimator.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                Object[] objArr2 = {animator2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "460e0c82fde5a59a33c3edbaefc45e16", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "460e0c82fde5a59a33c3edbaefc45e16");
                } else {
                    ShieldDefaultItemAnimator.this.dispatchRemoveStarting(sVar);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                Object[] objArr2 = {animator2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fa91ad9706cab76c53353966da5bf576", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fa91ad9706cab76c53353966da5bf576");
                    return;
                }
                animate.setListener(null);
                view.setAlpha(1.0f);
                ShieldDefaultItemAnimator.this.dispatchRemoveFinished(sVar);
                ShieldDefaultItemAnimator.this.mRemoveAnimations.remove(sVar);
                ShieldDefaultItemAnimator.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // android.support.v7.widget.aq
    public boolean animateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13f8d6a895cc1dd4efed0d1695214d36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13f8d6a895cc1dd4efed0d1695214d36")).booleanValue();
        }
        resetAnimation(sVar);
        if (needWrappedAnimator(sVar)) {
            WrappedViewHolderAnimator wrappedViewHolderAnimator = new WrappedViewHolderAnimator(sVar, 101);
            BaseAnimator animator = wrappedViewHolderAnimator.getAnimator();
            if (animator != null) {
                animator.preAnimateAdd(wrappedViewHolderAnimator);
            }
            this.mPendingAdditions.add(wrappedViewHolderAnimator);
        } else {
            sVar.itemView.setAlpha(0.0f);
            this.mPendingAdditions.add(sVar);
        }
        return true;
    }

    public void animateAddImpl(final RecyclerView.s sVar) {
        BaseAnimator animator;
        boolean z = true;
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79fedf5f2dfc062c7b6278e0e7a769a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79fedf5f2dfc062c7b6278e0e7a769a3");
            return;
        }
        updateShieldDisplayNode(sVar);
        final View view = sVar.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(sVar);
        if (!(sVar instanceof WrappedViewHolderAnimator) || (animator = ((WrappedViewHolderAnimator) sVar).getAnimator()) == null) {
            z = false;
        } else {
            animator.animateAdd(sVar);
        }
        if (z) {
            return;
        }
        animate.alpha(1.0f).setDuration(0L).setListener(new AnimatorListenerAdapter() { // from class: com.dianping.shield.node.adapter.ShieldDefaultItemAnimator.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                Object[] objArr2 = {animator2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "448f8d411042c706a7f9c915febc6672", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "448f8d411042c706a7f9c915febc6672");
                } else {
                    ShieldDefaultItemAnimator.this.dispatchAddStarting(sVar);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                Object[] objArr2 = {animator2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5647d09f10a71eca14bfb8898e49076f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5647d09f10a71eca14bfb8898e49076f");
                } else {
                    view.setAlpha(1.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                Object[] objArr2 = {animator2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4736fcdb55163046bc94c6709f46a996", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4736fcdb55163046bc94c6709f46a996");
                    return;
                }
                animate.setListener(null);
                ShieldDefaultItemAnimator.this.dispatchAddFinished(sVar);
                ShieldDefaultItemAnimator.this.mAddAnimations.remove(sVar);
                ShieldDefaultItemAnimator.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // android.support.v7.widget.aq
    public boolean animateMove(RecyclerView.s sVar, int i, int i2, int i3, int i4) {
        Object[] objArr = {sVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "485d7cd23289636fa2c9d64543029e8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "485d7cd23289636fa2c9d64543029e8b")).booleanValue();
        }
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
        this.mPendingMoves.add(new MoveInfo(sVar, translationX, translationY, i3, i4));
        return true;
    }

    public void animateMoveImpl(final RecyclerView.s sVar, int i, int i2, int i3, int i4) {
        Object[] objArr = {sVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e39356e9e5a603501572dc40abbef562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e39356e9e5a603501572dc40abbef562");
            return;
        }
        updateShieldDisplayNode(sVar);
        final View view = sVar.itemView;
        int i5 = i4 - i2;
        if (i3 - i != 0) {
            view.animate().translationX(0.0f);
        }
        if (i5 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(sVar);
        animate.setDuration(getMoveDuration()).setListener(new AnimatorListenerAdapter() { // from class: com.dianping.shield.node.adapter.ShieldDefaultItemAnimator.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f7140c9c27e0679fb76d42f42b30e12f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f7140c9c27e0679fb76d42f42b30e12f");
                } else {
                    ShieldDefaultItemAnimator.this.dispatchMoveStarting(sVar);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5fbcb7141bf658e0ab2a3aec3eb9658b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5fbcb7141bf658e0ab2a3aec3eb9658b");
                } else {
                    movedAnimationEnd();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "469898543c122d6d39149139ec5f7570", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "469898543c122d6d39149139ec5f7570");
                } else {
                    movedAnimationEnd();
                }
            }

            private void movedAnimationEnd() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9cc17037101744fd5e417f615ad669fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9cc17037101744fd5e417f615ad669fc");
                    return;
                }
                ShieldDefaultItemAnimator.clearAnimator(view);
                animate.setListener(null);
                ShieldDefaultItemAnimator.this.dispatchMoveFinished(sVar);
                ShieldDefaultItemAnimator.this.mMoveAnimations.remove(sVar);
                ShieldDefaultItemAnimator.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // android.support.v7.widget.aq
    public boolean animateChange(RecyclerView.s sVar, RecyclerView.s sVar2, int i, int i2, int i3, int i4) {
        Object[] objArr = {sVar, sVar2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1c93f4922787dc088c74e74584180ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1c93f4922787dc088c74e74584180ae")).booleanValue();
        }
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
        this.mPendingChanges.add(new ChangeInfo(sVar, sVar2, i, i2, i3, i4));
        return true;
    }

    public void animateChangeImpl(final ChangeInfo changeInfo) {
        Object[] objArr = {changeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c831569c8cf0744db21738592a122a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c831569c8cf0744db21738592a122a8");
            return;
        }
        RecyclerView.s sVar = changeInfo.oldHolder;
        final View view = sVar == null ? null : sVar.itemView;
        RecyclerView.s sVar2 = changeInfo.newHolder;
        final View view2 = sVar2 != null ? sVar2.itemView : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(changeInfo.oldHolder);
            duration.translationX(changeInfo.toX - changeInfo.fromX);
            duration.translationY(changeInfo.toY - changeInfo.fromY);
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.dianping.shield.node.adapter.ShieldDefaultItemAnimator.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3edb40cf2c0bc47232aadb284327e7d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3edb40cf2c0bc47232aadb284327e7d2");
                    } else {
                        ShieldDefaultItemAnimator.this.dispatchChangeStarting(changeInfo.oldHolder, true);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3c839ba704c0c2ba45cff54edbce308", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3c839ba704c0c2ba45cff54edbce308");
                        return;
                    }
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    ShieldDefaultItemAnimator.this.dispatchChangeFinished(changeInfo.oldHolder, true);
                    ShieldDefaultItemAnimator.this.mChangeAnimations.remove(changeInfo.oldHolder);
                    ShieldDefaultItemAnimator.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(changeInfo.newHolder);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.dianping.shield.node.adapter.ShieldDefaultItemAnimator.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0edf9ea6cc2676163f0869fabff427f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0edf9ea6cc2676163f0869fabff427f0");
                    } else {
                        ShieldDefaultItemAnimator.this.dispatchChangeStarting(changeInfo.newHolder, false);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "362d2ae0603d8f6542ed116f5b3c578b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "362d2ae0603d8f6542ed116f5b3c578b");
                        return;
                    }
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    ShieldDefaultItemAnimator.this.dispatchChangeFinished(changeInfo.newHolder, false);
                    ShieldDefaultItemAnimator.this.mChangeAnimations.remove(changeInfo.newHolder);
                    ShieldDefaultItemAnimator.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
    }

    private void endChangeAnimation(List<ChangeInfo> list, RecyclerView.s sVar) {
        Object[] objArr = {list, sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93368945e097f9e3d59d04167dffc631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93368945e097f9e3d59d04167dffc631");
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            ChangeInfo changeInfo = list.get(size);
            if (endChangeAnimationIfNecessary(changeInfo, sVar) && changeInfo.oldHolder == null && changeInfo.newHolder == null) {
                list.remove(changeInfo);
            }
        }
    }

    private void endChangeAnimationIfNecessary(ChangeInfo changeInfo) {
        Object[] objArr = {changeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "709047224ac5a73196467c94779a4b41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "709047224ac5a73196467c94779a4b41");
            return;
        }
        if (changeInfo.oldHolder != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.oldHolder);
        }
        if (changeInfo.newHolder != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.newHolder);
        }
    }

    private boolean endChangeAnimationIfNecessary(ChangeInfo changeInfo, RecyclerView.s sVar) {
        boolean z = false;
        Object[] objArr = {changeInfo, sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "976efaaf5260115dd08a98ea49b02796", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "976efaaf5260115dd08a98ea49b02796")).booleanValue();
        }
        if (changeInfo.newHolder == sVar) {
            changeInfo.newHolder = null;
        } else if (changeInfo.oldHolder != sVar) {
            return false;
        } else {
            changeInfo.oldHolder = null;
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
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5bc234ab12b531b20295da52889f320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5bc234ab12b531b20295da52889f320");
            return;
        }
        View view = sVar.itemView;
        view.animate().cancel();
        for (int size = this.mPendingMoves.size() - 1; size >= 0; size--) {
            if (this.mPendingMoves.get(size).holder == sVar) {
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
        for (int size2 = this.mRemovalsList.size() - 1; size2 >= 0; size2--) {
            ArrayList<RecyclerView.s> arrayList = this.mRemovalsList.get(size2);
            if (arrayList.remove(sVar)) {
                view.setAlpha(0.0f);
                dispatchRemoveFinished(sVar);
                if (arrayList.isEmpty()) {
                    this.mRemovalsList.remove(size2);
                }
            }
        }
        for (int size3 = this.mChangesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<ChangeInfo> arrayList2 = this.mChangesList.get(size3);
            endChangeAnimation(arrayList2, sVar);
            if (arrayList2.isEmpty()) {
                this.mChangesList.remove(size3);
            }
        }
        for (int size4 = this.mMovesList.size() - 1; size4 >= 0; size4--) {
            ArrayList<MoveInfo> arrayList3 = this.mMovesList.get(size4);
            int size5 = arrayList3.size() - 1;
            while (true) {
                if (size5 < 0) {
                    break;
                } else if (arrayList3.get(size5).holder == sVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(sVar);
                    arrayList3.remove(size5);
                    if (arrayList3.isEmpty()) {
                        this.mMovesList.remove(size4);
                    }
                } else {
                    size5--;
                }
            }
        }
        for (int size6 = this.mAdditionsList.size() - 1; size6 >= 0; size6--) {
            ArrayList<RecyclerView.s> arrayList4 = this.mAdditionsList.get(size6);
            if (arrayList4.remove(sVar)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(sVar);
                if (arrayList4.isEmpty()) {
                    this.mAdditionsList.remove(size6);
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
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45d84b48ceec553312901e4359cc3233", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45d84b48ceec553312901e4359cc3233");
            return;
        }
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        sVar.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(sVar);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6aa08946510d47b53f4a47fe30ca23da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6aa08946510d47b53f4a47fe30ca23da")).booleanValue() : (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mRemovalsList.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    public void dispatchFinishedWhenDone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60d8409eb2969b31b71ff74ba989b589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60d8409eb2969b31b71ff74ba989b589");
        } else if (isRunning()) {
        } else {
            dispatchAnimationsFinished();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1872e7e5060e1cb1b3ff968b2bcdf37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1872e7e5060e1cb1b3ff968b2bcdf37");
            return;
        }
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = this.mPendingMoves.get(size);
            View view = moveInfo.holder.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(moveInfo.holder);
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
                ArrayList<MoveInfo> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    MoveInfo moveInfo2 = arrayList.get(size6);
                    View view2 = moveInfo2.holder.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(moveInfo2.holder);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mRemovalsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.s> arrayList2 = this.mRemovalsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.s sVar2 = arrayList2.get(size8);
                    sVar2.itemView.setAlpha(0.0f);
                    dispatchRemoveFinished(sVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mRemovalsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mAdditionsList.size() - 1; size9 >= 0; size9--) {
                ArrayList<RecyclerView.s> arrayList3 = this.mAdditionsList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    RecyclerView.s sVar3 = arrayList3.get(size10);
                    sVar3.itemView.setAlpha(1.0f);
                    dispatchAddFinished(sVar3);
                    arrayList3.remove(size10);
                    if (arrayList3.isEmpty()) {
                        this.mAdditionsList.remove(arrayList3);
                    }
                }
            }
            for (int size11 = this.mChangesList.size() - 1; size11 >= 0; size11--) {
                ArrayList<ChangeInfo> arrayList4 = this.mChangesList.get(size11);
                for (int size12 = arrayList4.size() - 1; size12 >= 0; size12--) {
                    endChangeAnimationIfNecessary(arrayList4.get(size12));
                    if (arrayList4.isEmpty()) {
                        this.mChangesList.remove(arrayList4);
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

    public void cancelAll(List<RecyclerView.s> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35d3dd2a46910a0da24f319b6734c4cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35d3dd2a46910a0da24f319b6734c4cb");
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.s sVar, @NonNull List<Object> list) {
        Object[] objArr = {sVar, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2110f933d8dc0f2c9d9403dde168b31c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2110f933d8dc0f2c9d9403dde168b31c")).booleanValue() : !list.isEmpty() || super.canReuseUpdatedViewHolder(sVar, list);
    }

    private boolean hasAnimatorInSection(ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8812c2e7a192af67f00b550e514e415", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8812c2e7a192af67f00b550e514e415")).booleanValue();
        }
        if (shieldDisplayNode == null || shieldDisplayNode.rowParent == null || shieldDisplayNode.rowParent.sectionParent == null) {
            return false;
        }
        return shieldDisplayNode.rowParent.sectionParent.getEnableLayoutAnimation();
    }

    private boolean needWrappedAnimator(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63284cc4318a881ab50094e888830e70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63284cc4318a881ab50094e888830e70")).booleanValue();
        }
        if (sVar == null) {
            return false;
        }
        View view = sVar.itemView;
        if (view instanceof DisplayNodeContainer) {
            return hasAnimatorInSection(((DisplayNodeContainer) view).getNode());
        }
        return false;
    }

    private void updateShieldDisplayNode(RecyclerView.s sVar) {
        ShieldDisplayNode node;
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c19176299776e9201172b0ae29438afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c19176299776e9201172b0ae29438afb");
        } else if (sVar == null) {
        } else {
            View view = sVar.itemView;
            if (!(view instanceof DisplayNodeContainer) || (node = ((DisplayNodeContainer) view).getNode()) == null) {
                return;
            }
            node.updateNodeView();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class WrappedViewHolderAnimator extends RecyclerView.s {
        public static final int TYPE_ADD = 101;
        public static final int TYPE_REMOVE = 102;
        public static ChangeQuickRedirect changeQuickRedirect;
        private final BaseAnimator mAnimator;

        public WrappedViewHolderAnimator(RecyclerView.s sVar, int i) {
            super(sVar.itemView);
            Object[] objArr = {ShieldDefaultItemAnimator.this, sVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc42921b136b0bc8f8b6862088b976ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc42921b136b0bc8f8b6862088b976ae");
                return;
            }
            this.mAnimator = AnimatorFactory.createAnimator(ShieldDefaultItemAnimator.getAnimatorType(sVar, i));
            configAnimator(sVar, i);
        }

        public BaseAnimator getAnimator() {
            return this.mAnimator;
        }

        private void configAnimator(RecyclerView.s sVar, int i) {
            Object[] objArr = {sVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b2ca8735d239edccd04a5a56b5a91b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b2ca8735d239edccd04a5a56b5a91b6");
            } else if (this.mAnimator == null) {
            } else {
                switch (i) {
                    case 101:
                        this.mAnimator.setAddDuration(ShieldDefaultItemAnimator.this.getAddDuration());
                        this.mAnimator.setListener(new DefaultAddAnimatorListener(sVar));
                        break;
                    case 102:
                        this.mAnimator.setRemoveDuration(ShieldDefaultItemAnimator.this.getRemoveDuration());
                        this.mAnimator.setListener(new DefaultRemoveAnimatorListener(sVar));
                        break;
                }
                this.mAnimator.setMoveDuration(ShieldDefaultItemAnimator.this.getMoveDuration());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class DefaultAddAnimatorListener extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final RecyclerView.s holder;

        public DefaultAddAnimatorListener(RecyclerView.s sVar) {
            Object[] objArr = {ShieldDefaultItemAnimator.this, sVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d97c41ba284f194f76cb82ea5c142ffd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d97c41ba284f194f76cb82ea5c142ffd");
            } else {
                this.holder = sVar;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17ecf8ccc0295b4fe5ded348027743e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17ecf8ccc0295b4fe5ded348027743e2");
            } else {
                ShieldDefaultItemAnimator.this.dispatchAddStarting(this.holder);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e126a06b996536b9aa456ecd344d74c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e126a06b996536b9aa456ecd344d74c9");
            } else {
                addedAnimationEnd();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "699c335130544b0e85015843947aeec4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "699c335130544b0e85015843947aeec4");
            } else {
                addedAnimationEnd();
            }
        }

        private void addedAnimationEnd() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afa8914da12d087cf9bf21062b8f1736", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afa8914da12d087cf9bf21062b8f1736");
                return;
            }
            ShieldDefaultItemAnimator.clearAnimator(this.holder.itemView);
            ShieldDefaultItemAnimator.this.dispatchAddFinished(this.holder);
            ShieldDefaultItemAnimator.this.mAddAnimations.remove(this.holder);
            ShieldDefaultItemAnimator.this.dispatchFinishedWhenDone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class DefaultRemoveAnimatorListener extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final RecyclerView.s holder;

        public DefaultRemoveAnimatorListener(RecyclerView.s sVar) {
            Object[] objArr = {ShieldDefaultItemAnimator.this, sVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08776357173021088667517203d3c8f6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08776357173021088667517203d3c8f6");
            } else {
                this.holder = sVar;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbc1bfad7e5f82dd48fbb9039d203029", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbc1bfad7e5f82dd48fbb9039d203029");
            } else {
                ShieldDefaultItemAnimator.this.dispatchRemoveStarting(this.holder);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8135f5671fc4bcfdeecdfccf96adc322", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8135f5671fc4bcfdeecdfccf96adc322");
            } else {
                removedAnimationEnd();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32bf0b45dc599253b4beec391ad4b40f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32bf0b45dc599253b4beec391ad4b40f");
            } else {
                removedAnimationEnd();
            }
        }

        private void removedAnimationEnd() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4820398448f640d95838edd89f5df9bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4820398448f640d95838edd89f5df9bc");
                return;
            }
            ShieldDefaultItemAnimator.clearAnimator(this.holder.itemView);
            ShieldDefaultItemAnimator.this.dispatchRemoveFinished(this.holder);
            ShieldDefaultItemAnimator.this.mRemoveAnimations.remove(this.holder);
            ShieldDefaultItemAnimator.this.dispatchFinishedWhenDone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AnimationType getAnimatorType(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4323ccabf21cf6937fc2c8b185c99ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimationType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4323ccabf21cf6937fc2c8b185c99ab");
        }
        if (sVar == null) {
            return AnimationType.NONE;
        }
        View view = sVar.itemView;
        if (view instanceof DisplayNodeContainer) {
            ShieldDisplayNode node = ((DisplayNodeContainer) view).getNode();
            if (node == null || node.rowParent == null || node.rowParent.sectionParent == null) {
                return AnimationType.NONE;
            }
            ShieldSection shieldSection = node.rowParent.sectionParent;
            switch (i) {
                case 101:
                    return shieldSection.getInsertAnimationType();
                case 102:
                    return shieldSection.getDeleteAnimationType();
            }
        }
        return AnimationType.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearAnimator(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e0b14802a0be3fde55de1eb2a86ec7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e0b14802a0be3fde55de1eb2a86ec7c");
        } else if (view != null) {
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.animate().setListener(null);
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(0.0f);
            }
        }
    }
}
