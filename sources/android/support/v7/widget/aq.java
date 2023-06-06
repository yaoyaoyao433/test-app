package android.support.v7.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class aq extends RecyclerView.ItemAnimator {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.s sVar);

    public abstract boolean animateChange(RecyclerView.s sVar, RecyclerView.s sVar2, int i, int i2, int i3, int i4);

    public abstract boolean animateMove(RecyclerView.s sVar, int i, int i2, int i3, int i4);

    public abstract boolean animateRemove(RecyclerView.s sVar);

    public void onAddFinished(RecyclerView.s sVar) {
    }

    public void onAddStarting(RecyclerView.s sVar) {
    }

    public void onChangeFinished(RecyclerView.s sVar, boolean z) {
    }

    public void onChangeStarting(RecyclerView.s sVar, boolean z) {
    }

    public void onMoveFinished(RecyclerView.s sVar) {
    }

    public void onMoveStarting(RecyclerView.s sVar) {
    }

    public void onRemoveFinished(RecyclerView.s sVar) {
    }

    public void onRemoveStarting(RecyclerView.s sVar) {
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.s sVar) {
        return !this.mSupportsChangeAnimations || sVar.isInvalid();
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(@NonNull RecyclerView.s sVar, @NonNull RecyclerView.ItemAnimator.c cVar, @Nullable RecyclerView.ItemAnimator.c cVar2) {
        int i = cVar.a;
        int i2 = cVar.b;
        View view = sVar.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (!sVar.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return animateMove(sVar, i, i2, left, top);
        }
        return animateRemove(sVar);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(@NonNull RecyclerView.s sVar, @Nullable RecyclerView.ItemAnimator.c cVar, @NonNull RecyclerView.ItemAnimator.c cVar2) {
        if (cVar != null && (cVar.a != cVar2.a || cVar.b != cVar2.b)) {
            return animateMove(sVar, cVar.a, cVar.b, cVar2.a, cVar2.b);
        }
        return animateAdd(sVar);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(@NonNull RecyclerView.s sVar, @NonNull RecyclerView.ItemAnimator.c cVar, @NonNull RecyclerView.ItemAnimator.c cVar2) {
        if (cVar.a != cVar2.a || cVar.b != cVar2.b) {
            return animateMove(sVar, cVar.a, cVar.b, cVar2.a, cVar2.b);
        }
        dispatchMoveFinished(sVar);
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public boolean animateChange(@NonNull RecyclerView.s sVar, @NonNull RecyclerView.s sVar2, @NonNull RecyclerView.ItemAnimator.c cVar, @NonNull RecyclerView.ItemAnimator.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (sVar2.shouldIgnore()) {
            int i5 = cVar.a;
            i2 = cVar.b;
            i = i5;
        } else {
            i = cVar2.a;
            i2 = cVar2.b;
        }
        return animateChange(sVar, sVar2, i3, i4, i, i2);
    }

    public final void dispatchRemoveFinished(RecyclerView.s sVar) {
        onRemoveFinished(sVar);
        dispatchAnimationFinished(sVar);
    }

    public final void dispatchMoveFinished(RecyclerView.s sVar) {
        onMoveFinished(sVar);
        dispatchAnimationFinished(sVar);
    }

    public final void dispatchAddFinished(RecyclerView.s sVar) {
        onAddFinished(sVar);
        dispatchAnimationFinished(sVar);
    }

    public final void dispatchChangeFinished(RecyclerView.s sVar, boolean z) {
        onChangeFinished(sVar, z);
        dispatchAnimationFinished(sVar);
    }

    public final void dispatchRemoveStarting(RecyclerView.s sVar) {
        onRemoveStarting(sVar);
    }

    public final void dispatchMoveStarting(RecyclerView.s sVar) {
        onMoveStarting(sVar);
    }

    public final void dispatchAddStarting(RecyclerView.s sVar) {
        onAddStarting(sVar);
    }

    public final void dispatchChangeStarting(RecyclerView.s sVar, boolean z) {
        onChangeStarting(sVar, z);
    }
}
