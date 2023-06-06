package com.dianping.shield.extensions.staggeredgrid;

import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider;
import com.dianping.shield.node.processor.impl.section.SectionNodeProcessor;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.LayoutType;
import com.dianping.shield.node.useritem.MoveStatusInfo;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/extensions/staggeredgrid/StaggeredGridSectionNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "()V", "handleShieldSection", "", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggeredGridSectionNodeProcessor extends SectionNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.section.SectionNodeProcessor
    public final boolean handleShieldSection(@NotNull final SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58f9af77b2e9be5ef967e9ee463a027e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58f9af77b2e9be5ef967e9ee463a027e")).booleanValue();
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        if ((sectionItem instanceof StaggeredGridSectionItem) && (shieldSection instanceof StaggeredGridSection)) {
            StaggeredGridSection staggeredGridSection = (StaggeredGridSection) shieldSection;
            StaggeredGridSectionItem staggeredGridSectionItem = (StaggeredGridSectionItem) sectionItem;
            staggeredGridSection.setSpanCount(staggeredGridSectionItem.spanCount);
            staggeredGridSection.setXStaggeredGridGap(staggeredGridSectionItem.xStaggeredGridGap);
            staggeredGridSection.setYStaggeredGridGap(staggeredGridSectionItem.yStaggeredGridGap);
            staggeredGridSection.setStaggeredGridLeftMargin(staggeredGridSectionItem.staggeredLeftMargin);
            staggeredGridSection.setStaggeredGridRightMargin(staggeredGridSectionItem.staggeredRightMargin);
            DividerStyle.ShowType showType = sectionItem.dividerShowType;
            h.a((Object) showType, "sectionItem.dividerShowType");
            shieldSection.sectionDividerShowType = showType;
            staggeredGridSection.setBackgroundColor(staggeredGridSectionItem.backgroundColor);
            staggeredGridSection.setStaggeredGridTopPadding(staggeredGridSectionItem.staggeredTopPadding);
            staggeredGridSection.setStaggeredGridBottomPadding(staggeredGridSectionItem.staggeredBottomPadding);
            shieldSection.setEnableLayoutAnimation(sectionItem.enableLayoutAnimation);
            shieldSection.setInsertAnimationType(sectionItem.insertAnimationType);
            shieldSection.setDeleteAnimationType(sectionItem.deleteAnimationType);
            if (staggeredGridSectionItem.viewItems.size() > 0) {
                sectionItem.rowCount = staggeredGridSectionItem.viewItems.size();
                if (staggeredGridSectionItem.lazyRowItems == null) {
                    staggeredGridSectionItem.lazyRowItems = new ArrayList<>(b.a(new StaggerGridRowItem[sectionItem.rowCount]));
                } else if (sectionItem.rowCount - staggeredGridSectionItem.lazyRowItems.size() > 0) {
                    staggeredGridSectionItem.lazyRowItems.addAll(b.a(new StaggerGridRowItem[sectionItem.rowCount - staggeredGridSectionItem.lazyRowItems.size()]));
                }
                sectionItem.isLazyLoad = true;
                sectionItem.lazyLoadRowItemProvider = new LazyLoadRowItemProvider() { // from class: com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionNodeProcessor$handleShieldSection$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider
                    public final int getRowViewCount(int i, int i2) {
                        return 1;
                    }

                    @Override // com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider
                    public final boolean isPreLoad(int i, int i2) {
                        return false;
                    }

                    @Override // com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider
                    @NotNull
                    public final LayoutType getRowLayoutType(int i, int i2) {
                        return LayoutType.STAGGERED_GRID;
                    }

                    @Override // com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider
                    @NotNull
                    public final RowItem getRowItem(int i, int i2) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f74aede33754a00e74599c23a8cddd67", RobustBitConfig.DEFAULT_VALUE)) {
                            return (RowItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f74aede33754a00e74599c23a8cddd67");
                        }
                        StaggerGridRowItem rowItem = ((StaggeredGridSectionItem) SectionItem.this).getRowItem(i2);
                        rowItem.rowIndex = -3;
                        rowItem.addViewItemWithoutIndex(((StaggeredGridSectionItem) SectionItem.this).viewItems.get(i2));
                        ExposeInfo exposeInfo = ((StaggeredGridSectionItem) SectionItem.this).viewItems.get(i2).exposeInfo;
                        if (exposeInfo != null) {
                            rowItem.addExposeInfo(exposeInfo);
                        }
                        MoveStatusInfo moveStatusInfo = ((StaggeredGridSectionItem) SectionItem.this).viewItems.get(i2).moveStatusInfo;
                        if (moveStatusInfo != null) {
                            rowItem.moveStatusInfo = moveStatusInfo;
                        }
                        ((StaggeredGridSectionItem) SectionItem.this).viewItems.get(i2).frozenExclude = rowItem.frozenExclude;
                        h.a((Object) rowItem, "sectionItem.getRowItem(r…                        }");
                        return rowItem;
                    }
                };
            }
        }
        return false;
    }
}
