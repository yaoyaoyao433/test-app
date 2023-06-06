package com.dianping.shield.manager.feature;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSection;
import com.dianping.shield.framework.PageContainerLayoutModeInterface;
import com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.k;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ8\u0010\u001a\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c`\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u001dH\u0002J$\u0010$\u001a\u00020%2\u001a\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010'0\u001bj\n\u0012\u0006\u0012\u0004\u0018\u00010'`\u001eH\u0016J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u001dH\u0016J \u0010-\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001dH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00060"}, d2 = {"Lcom/dianping/shield/manager/feature/StaggeredGridCollector;", "Lcom/dianping/shield/manager/feature/CellManagerFeatureInterface;", "Lcom/dianping/shield/manager/feature/CellManagerScrollListenerInterface;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "layoutModeController", "Lcom/dianping/shield/framework/PageContainerLayoutModeInterface;", "shieldDisplayNodeAdapter", "Lcom/dianping/shield/node/adapter/ShieldDisplayNodeAdapter;", "looper", "Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;", "context", "Landroid/content/Context;", "(Landroid/support/v7/widget/RecyclerView;Lcom/dianping/shield/framework/PageContainerLayoutModeInterface;Lcom/dianping/shield/node/adapter/ShieldDisplayNodeAdapter;Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;Landroid/content/Context;)V", "findStaggered", "", "getFindStaggered", "()Z", "setFindStaggered", "(Z)V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "calcItemLeftAndRightOffset", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "Lkotlin/collections/ArrayList;", "shieldSection", "Lcom/dianping/shield/extensions/staggeredgrid/StaggeredGridSection;", "generatePaint", "Landroid/graphics/Paint;", "backgroundColor", "onAdapterNotify", "", "cellGroups", "Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "onCellNodeRefresh", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "onScrollStateChanged", "newState", "onScrolled", "dx", "dy", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggeredGridCollector implements CellManagerFeatureInterface, CellManagerScrollListenerInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context context;
    private boolean findStaggered;
    private final PageContainerLayoutModeInterface layoutModeController;
    private final LoopCellGroupsCollector looper;
    private final RecyclerView recyclerView;
    private final ShieldDisplayNodeAdapter shieldDisplayNodeAdapter;
    private long startTime;

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onCellNodeRefresh(@NotNull ShieldViewCell shieldViewCell) {
        Object[] objArr = {shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b6357a4d9c2a7097224c2d78bc2772b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b6357a4d9c2a7097224c2d78bc2772b");
        } else {
            h.b(shieldViewCell, "shieldViewCell");
        }
    }

    @Override // com.dianping.shield.manager.feature.CellManagerScrollListenerInterface
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e21ac35e15895c22fd17fe0d8d86a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e21ac35e15895c22fd17fe0d8d86a0");
        } else {
            h.b(recyclerView, "recyclerView");
        }
    }

    public StaggeredGridCollector(@Nullable RecyclerView recyclerView, @Nullable PageContainerLayoutModeInterface pageContainerLayoutModeInterface, @NotNull ShieldDisplayNodeAdapter shieldDisplayNodeAdapter, @NotNull LoopCellGroupsCollector loopCellGroupsCollector, @NotNull Context context) {
        h.b(shieldDisplayNodeAdapter, "shieldDisplayNodeAdapter");
        h.b(loopCellGroupsCollector, "looper");
        h.b(context, "context");
        Object[] objArr = {recyclerView, pageContainerLayoutModeInterface, shieldDisplayNodeAdapter, loopCellGroupsCollector, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14a8e282a76da214783028bc55ce735f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14a8e282a76da214783028bc55ce735f");
            return;
        }
        this.recyclerView = recyclerView;
        this.layoutModeController = pageContainerLayoutModeInterface;
        this.shieldDisplayNodeAdapter = shieldDisplayNodeAdapter;
        this.looper = loopCellGroupsCollector;
        this.context = context;
    }

    public final boolean getFindStaggered() {
        return this.findStaggered;
    }

    public final void setFindStaggered(boolean z) {
        this.findStaggered = z;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "563b1aa3f2f5205a3eb75aed6d171d67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "563b1aa3f2f5205a3eb75aed6d171d67");
        } else {
            this.startTime = j;
        }
    }

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onAdapterNotify(@NotNull ArrayList<ShieldCellGroup> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9597f36421403edb6f6f351ced8dbba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9597f36421403edb6f6f351ced8dbba");
            return;
        }
        h.b(arrayList, "cellGroups");
        this.looper.addBeforeLoopAction(new StaggeredGridCollector$onAdapterNotify$1(this));
        this.looper.addIndexedSectionAction(new StaggeredGridCollector$onAdapterNotify$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint generatePaint(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb3505d8bf6e0110891c23fbd1827159", RobustBitConfig.DEFAULT_VALUE)) {
            return (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb3505d8bf6e0110891c23fbd1827159");
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<k<Integer, Integer>> calcItemLeftAndRightOffset(StaggeredGridSection staggeredGridSection) {
        int i;
        double d;
        int i2;
        int i3;
        Object[] objArr = {staggeredGridSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7edfeaf129210eda529839edcec062c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7edfeaf129210eda529839edcec062c9");
        }
        ArrayList<k<Integer, Integer>> arrayList = new ArrayList<>();
        int spanCount = staggeredGridSection.getSpanCount();
        double a = aq.a(this.context) * 1.0d;
        double d2 = spanCount;
        double d3 = a / d2;
        int staggeredGridLeftMargin = staggeredGridSection.getStaggeredGridLeftMargin();
        int staggeredGridRightMargin = staggeredGridSection.getStaggeredGridRightMargin();
        int xStaggeredGridGap = staggeredGridSection.getXStaggeredGridGap();
        double d4 = staggeredGridLeftMargin;
        int i4 = spanCount - 1;
        double d5 = (((a - d4) - staggeredGridRightMargin) - (i4 * xStaggeredGridGap)) / d2;
        int i5 = 0;
        int i6 = 0;
        while (i5 < spanCount) {
            if (i5 == 0) {
                int i7 = (int) ((d3 - d4) - d5);
                i3 = xStaggeredGridGap - i7;
                i = spanCount;
                d = d5;
                i2 = i7;
                i6 = staggeredGridLeftMargin;
            } else if (i5 == i4) {
                i = spanCount;
                d = d5;
                i2 = staggeredGridRightMargin;
                i3 = 0;
            } else {
                i = spanCount;
                d = d5;
                i2 = (int) ((d3 - d5) - i6);
                i3 = xStaggeredGridGap - i2;
            }
            arrayList.add(new k<>(Integer.valueOf(i6), Integer.valueOf(i2)));
            i5++;
            i6 = i3;
            spanCount = i;
            d5 = d;
        }
        return arrayList;
    }

    @Override // com.dianping.shield.manager.feature.CellManagerScrollListenerInterface
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04499bb205d5557534daa1f123ad1b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04499bb205d5557534daa1f123ad1b9d");
            return;
        }
        h.b(recyclerView, "recyclerView");
        if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                throw new o("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] findFirstCompletelyVisibleItemPositions = staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(null);
            if (i == 0) {
                for (int i2 : findFirstCompletelyVisibleItemPositions) {
                    if (i2 <= staggeredGridLayoutManager.getSpanCount()) {
                        staggeredGridLayoutManager.invalidateSpanAssignments();
                        if (!recyclerView.isComputingLayout()) {
                            recyclerView.invalidateItemDecorations();
                        }
                    }
                }
            }
        }
    }
}
