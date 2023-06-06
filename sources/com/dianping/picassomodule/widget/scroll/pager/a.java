package com.dianping.picassomodule.widget.scroll.pager;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ai;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a4\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a4\u0010\f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a4\u0010\r\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0000\u001a,\u0010\u0014\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¨\u0006\u0015"}, d2 = {"canLoop", "", "Lcom/dianping/picassomodule/widget/scroll/pager/LoopLayoutManager;", "fill", "", "distance", "isVertical", "recycler", "Landroid/support/v7/widget/RecyclerView$Recycler;", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "fillAhead", "fillBehind", "getOrientationHelper", "Landroid/support/v7/widget/OrientationHelper;", "handleScrollStateChanged", "", "recyclerView", "newState", "recycleViews", "shieldComponent_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static final int a(@NotNull LoopLayoutManager loopLayoutManager, int i, boolean z, @Nullable RecyclerView.m mVar, @Nullable RecyclerView.State state) {
        Object[] objArr = {loopLayoutManager, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e3611f9dbfbc8790ad714c7fa2c7202", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e3611f9dbfbc8790ad714c7fa2c7202")).intValue();
        }
        h.b(loopLayoutManager, "receiver$0");
        if (i > 0) {
            return b(loopLayoutManager, i, z, mVar, state);
        }
        return c(loopLayoutManager, i, z, mVar, state);
    }

    private static int b(@NotNull LoopLayoutManager loopLayoutManager, int i, boolean z, @Nullable RecyclerView.m mVar, @Nullable RecyclerView.State state) {
        View childAt;
        int position;
        int i2;
        View b;
        int i3 = 0;
        int i4 = 1;
        Object[] objArr = {loopLayoutManager, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fb32181b0080d9fa95d0b53c0dd6d1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fb32181b0080d9fa95d0b53c0dd6d1a")).intValue();
        }
        h.b(loopLayoutManager, "receiver$0");
        int childCount = loopLayoutManager.getChildCount();
        if (childCount == 0 || (childAt = loopLayoutManager.getChildAt(childCount - 1)) == null || (position = loopLayoutManager.getPosition(childAt)) == -1) {
            return 0;
        }
        ai a2 = a(loopLayoutManager);
        int b2 = a2.b(childAt);
        int c = a2.c();
        if (b2 - c >= i) {
            return i;
        }
        boolean b3 = b(loopLayoutManager);
        int i5 = b2;
        while (true) {
            int i6 = i5 - c;
            if (i6 >= i) {
                return i;
            }
            if (!(position == loopLayoutManager.getItemCount() - i4)) {
                i2 = position + 1;
            } else if (!b3) {
                return i6;
            } else {
                i2 = 0;
            }
            if (loopLayoutManager.getChildCount() >= loopLayoutManager.getItemCount()) {
                return i3;
            }
            if (mVar == null || (b = mVar.b(i2)) == null) {
                return 0;
            }
            loopLayoutManager.addView(b, loopLayoutManager.getItemCount() - i4);
            loopLayoutManager.measureChildWithMargins(b, i3, i3);
            int decoratedMeasuredWidth = loopLayoutManager.getDecoratedMeasuredWidth(b);
            int decoratedMeasuredHeight = loopLayoutManager.getDecoratedMeasuredHeight(b);
            if (z) {
                loopLayoutManager.layoutDecoratedWithMargins(b, 0, i5, decoratedMeasuredWidth, decoratedMeasuredHeight + i5);
            } else {
                loopLayoutManager.layoutDecoratedWithMargins(b, i5, 0, i5 + decoratedMeasuredWidth, decoratedMeasuredHeight);
            }
            i5 += decoratedMeasuredWidth;
            position = i2;
            i4 = 1;
            i3 = 0;
        }
    }

    private static int c(@NotNull LoopLayoutManager loopLayoutManager, int i, boolean z, @Nullable RecyclerView.m mVar, @Nullable RecyclerView.State state) {
        View childAt;
        int position;
        int itemCount;
        View b;
        int i2 = 0;
        int i3 = 1;
        Object[] objArr = {loopLayoutManager, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9da85c3e0e458d0dc2e94d63e39a7b66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9da85c3e0e458d0dc2e94d63e39a7b66")).intValue();
        }
        h.b(loopLayoutManager, "receiver$0");
        if (loopLayoutManager.getChildCount() == 0 || (childAt = loopLayoutManager.getChildAt(0)) == null || (position = loopLayoutManager.getPosition(childAt)) == -1) {
            return 0;
        }
        ai a2 = a(loopLayoutManager);
        int a3 = a2.a(childAt);
        int b2 = a2.b();
        if (Math.abs(a3 - b2) >= Math.abs(i)) {
            return i;
        }
        boolean b3 = b(loopLayoutManager);
        int i4 = a3;
        while (true) {
            int i5 = i4 - b2;
            if (Math.abs(i5) >= Math.abs(i)) {
                return i;
            }
            if (!(position == 0)) {
                itemCount = position - 1;
            } else if (!b3) {
                return i5;
            } else {
                itemCount = loopLayoutManager.getItemCount() - i3;
            }
            if (loopLayoutManager.getChildCount() >= loopLayoutManager.getItemCount()) {
                return i2;
            }
            if (mVar == null || (b = mVar.b(itemCount)) == null) {
                return 0;
            }
            loopLayoutManager.addView(b, i2);
            loopLayoutManager.measureChildWithMargins(b, i2, i2);
            int decoratedMeasuredWidth = loopLayoutManager.getDecoratedMeasuredWidth(b);
            int decoratedMeasuredHeight = loopLayoutManager.getDecoratedMeasuredHeight(b);
            if (z) {
                loopLayoutManager.layoutDecoratedWithMargins(b, 0, i4 - decoratedMeasuredHeight, decoratedMeasuredWidth, i4);
            } else {
                loopLayoutManager.layoutDecoratedWithMargins(b, i4 - decoratedMeasuredWidth, 0, i4, decoratedMeasuredHeight);
            }
            i4 -= decoratedMeasuredWidth;
            position = itemCount;
            i3 = 1;
            i2 = 0;
        }
    }

    public static final void a(@NotNull LoopLayoutManager loopLayoutManager, int i, @Nullable RecyclerView.m mVar, @Nullable RecyclerView.State state) {
        Object[] objArr = {loopLayoutManager, Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5473a7896232f3d5cc804fb00c6d73ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5473a7896232f3d5cc804fb00c6d73ff");
            return;
        }
        h.b(loopLayoutManager, "receiver$0");
        int itemCount = loopLayoutManager.getItemCount();
        if (itemCount == 0) {
            return;
        }
        ai a2 = a(loopLayoutManager);
        int c = a2.c();
        for (int i2 = 0; i2 < itemCount; i2++) {
            View childAt = loopLayoutManager.getChildAt(i2);
            if (childAt != null) {
                int a3 = a2.a(childAt);
                int b = a2.b(childAt);
                if (((i > 0 && b < i) || (i < 0 && a3 - i > c)) && loopLayoutManager.getItemCount() > 0 && loopLayoutManager.getChildCount() > 1) {
                    loopLayoutManager.removeAndRecycleView(childAt, mVar);
                }
            }
        }
    }

    @NotNull
    public static final ai a(@NotNull LoopLayoutManager loopLayoutManager) {
        ai a2;
        Object[] objArr = {loopLayoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3825b441a7b2f88a1affd7735071e1a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ai) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3825b441a7b2f88a1affd7735071e1a3");
        }
        h.b(loopLayoutManager, "receiver$0");
        if (loopLayoutManager.d == null) {
            if (loopLayoutManager.k) {
                a2 = ai.b(loopLayoutManager);
            } else {
                a2 = ai.a(loopLayoutManager);
            }
            loopLayoutManager.d = a2;
        }
        ai aiVar = loopLayoutManager.d;
        if (aiVar == null) {
            h.a();
        }
        return aiVar;
    }

    public static final boolean b(@NotNull LoopLayoutManager loopLayoutManager) {
        Object[] objArr = {loopLayoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd0ea0aed899eb295547ba1fa57db1eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd0ea0aed899eb295547ba1fa57db1eb")).booleanValue();
        }
        h.b(loopLayoutManager, "receiver$0");
        return loopLayoutManager.getItemCount() > 1 && loopLayoutManager.i;
    }
}
