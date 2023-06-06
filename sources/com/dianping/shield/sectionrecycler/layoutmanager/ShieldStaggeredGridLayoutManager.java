package com.dianping.shield.sectionrecycler.layoutmanager;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.ad;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.sectionrecycler.layoutmanager.a;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.feature.IFocusChildScrollWhenBack;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010#\u001a\u00020\u0015H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0015H\u0016J\b\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010+\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\f\u0010,\u001a\b\u0018\u00010-R\u00020\u000fH\u0016J \u0010.\u001a\u00020(2\f\u0010,\u001a\b\u0018\u00010-R\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0005H\u0016J0\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u0015H\u0016J\b\u0010:\u001a\u00020(H\u0016J \u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0015H\u0016J(\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020@H\u0016JD\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020@2\u001a\u0010A\u001a\u0016\u0012\u0004\u0012\u00020C\u0018\u00010Bj\n\u0012\u0004\u0012\u00020C\u0018\u0001`DH\u0016J<\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00152\u001a\u0010A\u001a\u0016\u0012\u0004\u0012\u00020C\u0018\u00010Bj\n\u0012\u0004\u0012\u00020C\u0018\u0001`DH\u0016J\u0010\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020\u0015H\u0016J\u000e\u0010G\u001a\u00020(2\u0006\u0010H\u001a\u00020\u0015J\u0016\u0010I\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0005J:\u0010I\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010?\u001a\u00020@2\u001a\u0010A\u001a\u0016\u0012\u0004\u0012\u00020C\u0018\u00010Bj\n\u0012\u0004\u0012\u00020C\u0018\u0001`DR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006K"}, d2 = {"Lcom/dianping/shield/sectionrecycler/layoutmanager/ShieldStaggeredGridLayoutManager;", "Landroid/support/v7/widget/StaggeredGridLayoutManager;", "Lcom/dianping/shield/sectionrecycler/ShieldLayoutManagerInterface;", "Lcom/dianping/shield/feature/IFocusChildScrollWhenBack;", "spanCount", "", DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, "(II)V", "eventHelper", "Lcom/dianping/shield/sectionrecycler/layoutmanager/SmoothScrollEventHelper;", "getEventHelper", "()Lcom/dianping/shield/sectionrecycler/layoutmanager/SmoothScrollEventHelper;", "setEventHelper", "(Lcom/dianping/shield/sectionrecycler/layoutmanager/SmoothScrollEventHelper;)V", "holderRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "getHolderRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setHolderRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "isScrollEnabled", "", "markItemDecorInsetsDirtyMethod", "Ljava/lang/reflect/Method;", "reflectError", "setAllowFocusedChildRecOnScreen", "getSetAllowFocusedChildRecOnScreen", "()Z", "setSetAllowFocusedChildRecOnScreen", "(Z)V", "topOffset", "getTopOffset", "()I", "setTopOffset", "(I)V", "canScrollVertically", "findFirstVisibleItemPosition", "completely", "findLastVisibleItemPosition", "markItemDecorInsetsDirty", "", "onAttachedToWindow", Constants.EventType.VIEW, "onDetachedFromWindow", "recycler", "Landroid/support/v7/widget/RecyclerView$Recycler;", "onLayoutChildren", "state", "Landroid/support/v7/widget/RecyclerView$State;", "onScrollStateChanged", "requestChildRectangleOnScreen", "parent", "child", "Landroid/view/View;", "rect", "Landroid/graphics/Rect;", "immediate", "focusedChildVisible", "requestSimpleAnimationsInNextLayout", "scrollToPositionWithOffset", "globalPosition", "offset", "isSmoothScroll", "scrollSpeed", "", "listeners", "Ljava/util/ArrayList;", "Lcom/dianping/agentsdk/sectionrecycler/layoutmanager/OnSmoothScrollListener;", "Lkotlin/collections/ArrayList;", "setFocusChildScrollOnScreenWhenBack", "allow", "setScrollEnabled", "flag", "smoothScrollToPositionWithOffset", "LinearSmoothScrollerWithOffset", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldStaggeredGridLayoutManager extends StaggeredGridLayoutManager implements IFocusChildScrollWhenBack, ShieldLayoutManagerInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private SmoothScrollEventHelper eventHelper;
    @Nullable
    private RecyclerView holderRecyclerView;
    private boolean isScrollEnabled;
    private Method markItemDecorInsetsDirtyMethod;
    private boolean reflectError;
    private boolean setAllowFocusedChildRecOnScreen;
    private int topOffset;

    public ShieldStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "159793e93293aa59012714212a373fec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "159793e93293aa59012714212a373fec");
            return;
        }
        this.eventHelper = new SmoothScrollEventHelper();
        this.isScrollEnabled = true;
        this.setAllowFocusedChildRecOnScreen = true;
    }

    public final int getTopOffset() {
        return this.topOffset;
    }

    public final void setTopOffset(int i) {
        this.topOffset = i;
    }

    @NotNull
    public final SmoothScrollEventHelper getEventHelper() {
        return this.eventHelper;
    }

    public final void setEventHelper(@NotNull SmoothScrollEventHelper smoothScrollEventHelper) {
        Object[] objArr = {smoothScrollEventHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20c2f8ea416fac1340ab31533997a0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20c2f8ea416fac1340ab31533997a0e7");
            return;
        }
        h.b(smoothScrollEventHelper, "<set-?>");
        this.eventHelper = smoothScrollEventHelper;
    }

    public final boolean getSetAllowFocusedChildRecOnScreen() {
        return this.setAllowFocusedChildRecOnScreen;
    }

    public final void setSetAllowFocusedChildRecOnScreen(boolean z) {
        this.setAllowFocusedChildRecOnScreen = z;
    }

    @Nullable
    public final RecyclerView getHolderRecyclerView() {
        return this.holderRecyclerView;
    }

    public final void setHolderRecyclerView(@Nullable RecyclerView recyclerView) {
        this.holderRecyclerView = recyclerView;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(@Nullable RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e639fc1bc4d8725732acadbf7a80bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e639fc1bc4d8725732acadbf7a80bd7");
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.holderRecyclerView = recyclerView;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(@Nullable RecyclerView recyclerView, @Nullable RecyclerView.m mVar) {
        Object[] objArr = {recyclerView, mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61ba139338d7d0ecc530fab77c517519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61ba139338d7d0ecc530fab77c517519");
            return;
        }
        super.onDetachedFromWindow(recyclerView, mVar);
        this.holderRecyclerView = null;
    }

    public void scrollToPositionWithOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f8ae1e433c795a3544074108e10faa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f8ae1e433c795a3544074108e10faa3");
        } else {
            scrollToPositionWithOffset(i, i2, z, -1.0f, null);
        }
    }

    public void scrollToPositionWithOffset(int i, int i2, boolean z, @Nullable ArrayList<a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc8e8df74c55cac2d637c65af9aa5648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc8e8df74c55cac2d637c65af9aa5648");
        } else {
            scrollToPositionWithOffset(i, i2, z, -1.0f, arrayList);
        }
    }

    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9eaa622df07c8abf76c899cafacba79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9eaa622df07c8abf76c899cafacba79");
        } else {
            scrollToPositionWithOffset(i, i2, z, f, null);
        }
    }

    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f, @Nullable ArrayList<a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2d439db5ab859b53eaa9f84cc631165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2d439db5ab859b53eaa9f84cc631165");
        } else if (z) {
            smoothScrollToPositionWithOffset(i, i2, f, arrayList);
        } else {
            scrollToPositionWithOffset(i, i2);
        }
    }

    public final void smoothScrollToPositionWithOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7770f284c7dea4e41706a8bb52afe6fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7770f284c7dea4e41706a8bb52afe6fc");
        } else {
            smoothScrollToPositionWithOffset(i, i2, -1.0f, null);
        }
    }

    public final void smoothScrollToPositionWithOffset(int i, int i2, float f, @Nullable ArrayList<a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed1de4ca28f85b260f4ea129959c6049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed1de4ca28f85b260f4ea129959c6049");
            return;
        }
        RecyclerView recyclerView = this.holderRecyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.eventHelper);
            this.eventHelper.recyclerView = recyclerView;
            this.eventHelper.listeners = arrayList;
            Context context = recyclerView.getContext();
            h.a((Object) context, "rv.context");
            LinearSmoothScrollerWithOffset linearSmoothScrollerWithOffset = new LinearSmoothScrollerWithOffset(this, context, getOrientation(), i2, f);
            linearSmoothScrollerWithOffset.setTargetPosition(i);
            startSmoothScroll(linearSmoothScrollerWithOffset);
        }
    }

    public int findFirstVisibleItemPosition(boolean z) {
        int[] findFirstVisibleItemPositions;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c435de4da417fd654dc74db07a6e5f4e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c435de4da417fd654dc74db07a6e5f4e")).intValue();
        }
        if (z) {
            findFirstVisibleItemPositions = findFirstCompletelyVisibleItemPositions(null);
            h.a((Object) findFirstVisibleItemPositions, "findFirstCompletelyVisibleItemPositions(null)");
        } else {
            findFirstVisibleItemPositions = findFirstVisibleItemPositions(null);
            h.a((Object) findFirstVisibleItemPositions, "findFirstVisibleItemPositions(null)");
        }
        if (findFirstVisibleItemPositions == null) {
            h.a("firstItems");
        }
        Integer c = b.c(findFirstVisibleItemPositions);
        if (c != null) {
            return c.intValue();
        }
        return -1;
    }

    public int findLastVisibleItemPosition(boolean z) {
        int[] findLastVisibleItemPositions;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36e80175b96dd5e2be216043bf1ad44f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36e80175b96dd5e2be216043bf1ad44f")).intValue();
        }
        if (z) {
            findLastVisibleItemPositions = findLastCompletelyVisibleItemPositions(null);
            h.a((Object) findLastVisibleItemPositions, "findLastCompletelyVisibleItemPositions(null)");
        } else {
            findLastVisibleItemPositions = findLastVisibleItemPositions(null);
            h.a((Object) findLastVisibleItemPositions, "findLastVisibleItemPositions(null)");
        }
        if (findLastVisibleItemPositions == null) {
            h.a("lastItems");
        }
        Integer b = b.b(findLastVisibleItemPositions);
        if (b != null) {
            return b.intValue();
        }
        return -1;
    }

    public final void setScrollEnabled(boolean z) {
        this.isScrollEnabled = z;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1040a1cb4faf2443471ffa4782e37f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1040a1cb4faf2443471ffa4782e37f18");
            return;
        }
        try {
            super.onScrollStateChanged(i);
        } catch (IndexOutOfBoundsException e) {
            ShieldLogger.codeLogError$default(ShieldEnvironment.INSTANCE.getShieldLogger(), StaggeredGridLayoutManager.class, e.getMessage(), null, 4, null);
        } catch (NullPointerException e2) {
            ShieldLogger.codeLogError$default(ShieldEnvironment.INSTANCE.getShieldLogger(), StaggeredGridLayoutManager.class, e2.getMessage(), null, 4, null);
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e4b0918c0f90c727c9dc5098866bb2c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e4b0918c0f90c727c9dc5098866bb2c")).booleanValue() : this.isScrollEnabled && super.canScrollVertically();
    }

    @Override // com.dianping.shield.feature.IFocusChildScrollWhenBack
    public void setFocusChildScrollOnScreenWhenBack(boolean z) {
        this.setAllowFocusedChildRecOnScreen = z;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NotNull RecyclerView recyclerView, @NotNull View view, @NotNull Rect rect, boolean z, boolean z2) {
        Object[] objArr = {recyclerView, view, rect, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0929b7a1128cbb97c01fc117652735e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0929b7a1128cbb97c01fc117652735e6")).booleanValue();
        }
        h.b(recyclerView, "parent");
        h.b(view, "child");
        h.b(rect, "rect");
        if (this.setAllowFocusedChildRecOnScreen) {
            return super.requestChildRectangleOnScreen(recyclerView, view, rect, z, z2);
        }
        return false;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(@Nullable RecyclerView.m mVar, @Nullable RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6718738b6c7bad739b43feda63953fa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6718738b6c7bad739b43feda63953fa0");
            return;
        }
        if (state != null && state.a()) {
            if (this.markItemDecorInsetsDirtyMethod == null && !this.reflectError) {
                try {
                    this.markItemDecorInsetsDirtyMethod = RecyclerView.class.getDeclaredMethod("markItemDecorInsetsDirty", new Class[0]);
                    Method method = this.markItemDecorInsetsDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                } catch (Throwable th) {
                    ShieldLogger.codeLogError$default(ShieldEnvironment.INSTANCE.getShieldLogger(), StaggeredGridLayoutManager.class, th.getMessage(), null, 4, null);
                    this.reflectError = true;
                }
            }
            markItemDecorInsetsDirty();
        }
        super.onLayoutChildren(mVar, state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void requestSimpleAnimationsInNextLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12e651d20f6ea43d999097aacb8e5a32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12e651d20f6ea43d999097aacb8e5a32");
            return;
        }
        super.requestSimpleAnimationsInNextLayout();
        markItemDecorInsetsDirty();
    }

    private final void markItemDecorInsetsDirty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdfb0800e0d263ebb83fe252072a2ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdfb0800e0d263ebb83fe252072a2ddf");
        } else if (this.markItemDecorInsetsDirtyMethod == null || this.holderRecyclerView == null) {
        } else {
            try {
                Method method = this.markItemDecorInsetsDirtyMethod;
                if (method != null) {
                    method.invoke(this.holderRecyclerView, new Object[0]);
                }
            } catch (Throwable th) {
                ShieldLogger.codeLogError$default(ShieldEnvironment.INSTANCE.getShieldLogger(), StaggeredGridLayoutManager.class, th.getMessage(), null, 4, null);
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0014J\b\u0010\u0015\u001a\u00020\u0005H\u0014J\b\u0010\u0016\u001a\u00020\u0005H\u0014J,\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0018H\u0014J\b\u0010\u001f\u001a\u00020\u0018H\u0014J&\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/dianping/shield/sectionrecycler/layoutmanager/ShieldStaggeredGridLayoutManager$LinearSmoothScrollerWithOffset;", "Landroid/support/v7/widget/LinearSmoothScroller;", "context", "Landroid/content/Context;", DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, "", "offset", "scrollSpeed", "", "(Lcom/dianping/shield/sectionrecycler/layoutmanager/ShieldStaggeredGridLayoutManager;Landroid/content/Context;IIF)V", "getOffset", "()I", "getOrientation", "getScrollSpeed", "()F", "calculateDyToMakeVisible", Constants.EventType.VIEW, "Landroid/view/View;", "snapPreference", "calculateTimeForScrolling", "dx", "getHorizontalSnapPreference", "getVerticalSnapPreference", "onSeekTargetStep", "", "dy", "state", "Landroid/support/v7/widget/RecyclerView$State;", "action", "Landroid/support/v7/widget/RecyclerView$SmoothScroller$Action;", "onStart", "onStop", "onTargetFound", "targetView", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class LinearSmoothScrollerWithOffset extends ad {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int offset;
        private final int orientation;
        private final float scrollSpeed;
        public final /* synthetic */ ShieldStaggeredGridLayoutManager this$0;

        @Override // android.support.v7.widget.ad
        public final int getHorizontalSnapPreference() {
            return -1;
        }

        @Override // android.support.v7.widget.ad
        public final int getVerticalSnapPreference() {
            return -1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinearSmoothScrollerWithOffset(@NotNull ShieldStaggeredGridLayoutManager shieldStaggeredGridLayoutManager, Context context, int i, int i2, float f) {
            super(context);
            h.b(context, "context");
            this.this$0 = shieldStaggeredGridLayoutManager;
            Object[] objArr = {shieldStaggeredGridLayoutManager, context, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26d60a9411da72ed3f3698e39243d8ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26d60a9411da72ed3f3698e39243d8ff");
                return;
            }
            this.orientation = i;
            this.offset = i2;
            this.scrollSpeed = f;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getOrientation() {
            return this.orientation;
        }

        public final float getScrollSpeed() {
            return this.scrollSpeed;
        }

        @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public final void onTargetFound(@Nullable View view, @Nullable RecyclerView.State state, @Nullable RecyclerView.p.a aVar) {
            int i;
            Object[] objArr = {view, state, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a644a26266990755de4f80115da78500", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a644a26266990755de4f80115da78500");
                return;
            }
            if (this.orientation == 1) {
                i = this.offset;
            } else {
                r8 = this.orientation == 0 ? this.offset : 0;
                i = 0;
            }
            int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference()) + r8;
            int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference()) + i + this.this$0.getTopOffset();
            int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible)));
            if (calculateTimeForDeceleration <= 0 || aVar == null) {
                return;
            }
            aVar.a(-calculateDxToMakeVisible, -calculateDyToMakeVisible, calculateTimeForDeceleration, this.mDecelerateInterpolator);
        }

        @Override // android.support.v7.widget.ad
        public final int calculateDyToMakeVisible(@Nullable View view, int i) {
            Object[] objArr = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34f4741e242eff01919ebe2363e89dd0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34f4741e242eff01919ebe2363e89dd0")).intValue();
            }
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollVertically()) {
                return 0;
            }
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams == null) {
                throw new o("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
            }
            RecyclerView.g gVar = (RecyclerView.g) layoutParams;
            return calculateDtToFit(view.getTop() - gVar.topMargin, view.getBottom() + gVar.bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
        }

        @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public final void onStart() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0d51d83ff4309c9e4c3149b8bdb39dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0d51d83ff4309c9e4c3149b8bdb39dc");
                return;
            }
            super.onStart();
            this.this$0.getEventHelper().onStart();
        }

        @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public final void onSeekTargetStep(int i, int i2, @Nullable RecyclerView.State state, @Nullable RecyclerView.p.a aVar) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), state, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "497065399caee23a1d15cec0e22d15ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "497065399caee23a1d15cec0e22d15ab");
                return;
            }
            super.onSeekTargetStep(i, i2, state, aVar);
            this.this$0.getEventHelper().onScrolling();
        }

        @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public final void onStop() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b014bae7c2fd2cddf9026036c417f2f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b014bae7c2fd2cddf9026036c417f2f7");
                return;
            }
            super.onStop();
            this.this$0.getEventHelper().onStop();
        }

        @Override // android.support.v7.widget.ad
        public final int calculateTimeForScrolling(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddaca53b6afeac70eba3a36d56ab176a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddaca53b6afeac70eba3a36d56ab176a")).intValue();
            }
            if (this.scrollSpeed != -1.0f) {
                return (int) Math.ceil(Math.abs(i) * this.scrollSpeed);
            }
            return super.calculateTimeForScrolling(i);
        }
    }
}
