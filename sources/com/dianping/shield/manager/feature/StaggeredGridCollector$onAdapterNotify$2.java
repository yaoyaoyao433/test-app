package com.dianping.shield.manager.feature;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.entity.LayoutMode;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSection;
import com.dianping.shield.framework.PageContainerLayoutModeInterface;
import com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.k;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggeredGridCollector$onAdapterNotify$2 extends i implements c<Integer, ShieldSection, r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StaggeredGridCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaggeredGridCollector$onAdapterNotify$2(StaggeredGridCollector staggeredGridCollector) {
        super(2);
        this.this$0 = staggeredGridCollector;
    }

    @Override // kotlin.jvm.functions.c
    public final /* synthetic */ r invoke(Integer num, ShieldSection shieldSection) {
        invoke(num.intValue(), shieldSection);
        return r.a;
    }

    public final void invoke(int i, @NotNull ShieldSection shieldSection) {
        RecyclerView recyclerView;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter2;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter3;
        ArrayList<k<Integer, Integer>> calcItemLeftAndRightOffset;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter4;
        Paint generatePaint;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter5;
        Context context;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter6;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter7;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter8;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter9;
        PageContainerLayoutModeInterface pageContainerLayoutModeInterface;
        RecyclerView recyclerView2;
        Object[] objArr = {Integer.valueOf(i), shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8bb878418cb42cdb9403040b820172e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8bb878418cb42cdb9403040b820172e");
            return;
        }
        h.b(shieldSection, "shieldSection");
        if (shieldSection instanceof StaggeredGridSection) {
            recyclerView = this.this$0.recyclerView;
            RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                pageContainerLayoutModeInterface = this.this$0.layoutModeController;
                if (pageContainerLayoutModeInterface != null) {
                    pageContainerLayoutModeInterface.setLayoutManagerMode(LayoutMode.STAGGERED_GRID_LAYOUT_MANAGER);
                }
                recyclerView2 = this.this$0.recyclerView;
                layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
            }
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                layoutManager = null;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (staggeredGridLayoutManager != null) {
                StaggeredGridSection staggeredGridSection = (StaggeredGridSection) shieldSection;
                if (staggeredGridSection.getSpanCount() > 1) {
                    if (!this.this$0.getFindStaggered() && staggeredGridLayoutManager.getSpanCount() != staggeredGridSection.getSpanCount()) {
                        staggeredGridLayoutManager.setSpanCount(staggeredGridSection.getSpanCount());
                        shieldDisplayNodeAdapter6 = this.this$0.shieldDisplayNodeAdapter;
                        shieldDisplayNodeAdapter6.getStaggeredGridSpaceDecoration().setXGap(staggeredGridSection.getXStaggeredGridGap());
                        shieldDisplayNodeAdapter7 = this.this$0.shieldDisplayNodeAdapter;
                        shieldDisplayNodeAdapter7.getStaggeredGridSpaceDecoration().setYGap(staggeredGridSection.getYStaggeredGridGap());
                        shieldDisplayNodeAdapter8 = this.this$0.shieldDisplayNodeAdapter;
                        shieldDisplayNodeAdapter8.getStaggeredGridSpaceDecoration().setLeftMargin(staggeredGridSection.getStaggeredGridLeftMargin());
                        shieldDisplayNodeAdapter9 = this.this$0.shieldDisplayNodeAdapter;
                        shieldDisplayNodeAdapter9.getStaggeredGridSpaceDecoration().setRightMargin(staggeredGridSection.getStaggeredGridRightMargin());
                        this.this$0.setFindStaggered(true);
                    }
                    shieldDisplayNodeAdapter = this.this$0.shieldDisplayNodeAdapter;
                    shieldDisplayNodeAdapter.getStaggeredGridSpaceDecoration().setTopMargin(staggeredGridSection.getStaggeredGridTopPadding());
                    shieldDisplayNodeAdapter2 = this.this$0.shieldDisplayNodeAdapter;
                    shieldDisplayNodeAdapter2.getStaggeredGridSpaceDecoration().setBottomMargin(staggeredGridSection.getStaggeredGridBottomPadding());
                    shieldDisplayNodeAdapter3 = this.this$0.shieldDisplayNodeAdapter;
                    StaggeredGridSpaceDecoration staggeredGridSpaceDecoration = shieldDisplayNodeAdapter3.getStaggeredGridSpaceDecoration();
                    calcItemLeftAndRightOffset = this.this$0.calcItemLeftAndRightOffset(staggeredGridSection);
                    staggeredGridSpaceDecoration.setItemLeftAndRightOffset(calcItemLeftAndRightOffset);
                    shieldDisplayNodeAdapter4 = this.this$0.shieldDisplayNodeAdapter;
                    StaggeredGridSpaceDecoration staggeredGridSpaceDecoration2 = shieldDisplayNodeAdapter4.getStaggeredGridSpaceDecoration();
                    generatePaint = this.this$0.generatePaint(staggeredGridSection.getBackgroundColor());
                    staggeredGridSpaceDecoration2.setBackgroundPaint(generatePaint);
                    shieldDisplayNodeAdapter5 = this.this$0.shieldDisplayNodeAdapter;
                    StaggeredGridSpaceDecoration staggeredGridSpaceDecoration3 = shieldDisplayNodeAdapter5.getStaggeredGridSpaceDecoration();
                    context = this.this$0.context;
                    staggeredGridSpaceDecoration3.setScreenWidth(aq.a(context));
                }
            }
        }
    }
}
