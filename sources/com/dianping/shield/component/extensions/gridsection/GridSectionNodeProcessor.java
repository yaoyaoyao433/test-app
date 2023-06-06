package com.dianping.shield.component.extensions.gridsection;

import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider;
import com.dianping.shield.node.processor.impl.section.SectionNodeProcessor;
import com.dianping.shield.node.useritem.LayoutType;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/GridSectionNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "()V", "handleShieldSection", "", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridSectionNodeProcessor extends SectionNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.section.SectionNodeProcessor
    public final boolean handleShieldSection(@NotNull final SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        final int size;
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3560e1f9ad11603879996f0dabbffcd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3560e1f9ad11603879996f0dabbffcd9")).booleanValue();
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        if ((sectionItem instanceof GridSectionItem) && (shieldSection instanceof GridShieldSection)) {
            GridSectionItem gridSectionItem = (GridSectionItem) sectionItem;
            if (gridSectionItem.getViewItems().size() > 0) {
                if (gridSectionItem.getViewItems().size() % gridSectionItem.colCount == 0) {
                    size = gridSectionItem.getViewItems().size() / gridSectionItem.colCount;
                } else {
                    size = (gridSectionItem.getViewItems().size() / gridSectionItem.colCount) + 1;
                }
                sectionItem.isLazyLoad = true;
                sectionItem.rowCount = size;
                if (sectionItem.rowItems == null) {
                    sectionItem.rowItems = new ArrayList<>(b.a(new GridSectionRowItem[size]));
                } else if (sectionItem.rowCount - sectionItem.rowItems.size() > 0) {
                    sectionItem.rowItems.addAll(b.a(new GridSectionRowItem[sectionItem.rowCount - sectionItem.rowItems.size()]));
                }
                ((GridShieldSection) shieldSection).gridRecycledViewPool = gridSectionItem.gridRecycledViewPool;
                sectionItem.lazyLoadRowItemProvider = new LazyLoadRowItemProvider() { // from class: com.dianping.shield.component.extensions.gridsection.GridSectionNodeProcessor$handleShieldSection$1
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
                        return LayoutType.LINEAR_FULL_FILL;
                    }

                    @Override // com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider
                    @NotNull
                    public final RowItem getRowItem(int i, int i2) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c3bfb8041aeeb7bc3a5f29d587e11b89", RobustBitConfig.DEFAULT_VALUE)) {
                            return (RowItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c3bfb8041aeeb7bc3a5f29d587e11b89");
                        }
                        GridSectionRowItem girdSectionRowItem = ((GridSectionItem) SectionItem.this).getGirdSectionRowItem(i2);
                        girdSectionRowItem.xGap = ((GridSectionItem) SectionItem.this).xGap;
                        girdSectionRowItem.rowIndex = 0;
                        girdSectionRowItem.rowCount = 1;
                        girdSectionRowItem.colCount = ((GridSectionItem) SectionItem.this).colCount;
                        girdSectionRowItem.leftMargin = ((GridSectionItem) SectionItem.this).leftMargin;
                        girdSectionRowItem.rightMargin = ((GridSectionItem) SectionItem.this).rightMargin;
                        girdSectionRowItem.recommendItemHeight = ((GridSectionItem) SectionItem.this).recommendItemHeight;
                        girdSectionRowItem.setViewType("(GridSectionRowItem)");
                        girdSectionRowItem.showCellTopDivider = false;
                        girdSectionRowItem.showCellBottomDivider = false;
                        String str = ((GridSectionItem) SectionItem.this).backgroundColor;
                        if (str == null) {
                            str = "#00000000";
                        }
                        girdSectionRowItem.setBackgroundColor(str);
                        float f = ((GridSectionItem) SectionItem.this).yGap / 2.0f;
                        girdSectionRowItem.topMargin = f;
                        girdSectionRowItem.bottomMargin = f;
                        if (i2 == 0) {
                            girdSectionRowItem.topMargin = ((GridSectionItem) SectionItem.this).topMargin;
                        } else if (i2 == size - 1) {
                            girdSectionRowItem.bottomMargin = ((GridSectionItem) SectionItem.this).bottomMargin;
                        }
                        ArrayList<ViewItem> arrayList = girdSectionRowItem.viewItems;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        float f2 = girdSectionRowItem.recommendItemHeight;
                        int i3 = girdSectionRowItem.colCount;
                        for (int i4 = 0; i4 < i3; i4++) {
                            int i5 = (((GridSectionItem) SectionItem.this).colCount * i2) + i4;
                            Float f3 = ((GridSectionItem) SectionItem.this).itemHeights.get(i5);
                            if (f3 != null) {
                                f2 = Math.max(f2, f3.floatValue());
                            }
                            if (i5 < ((GridSectionItem) SectionItem.this).getViewItems().size()) {
                                girdSectionRowItem.addViewItemWithoutIndex(((GridSectionItem) SectionItem.this).getViewItems().get(i5));
                            }
                        }
                        girdSectionRowItem.recommendItemHeight = f2;
                        return girdSectionRowItem;
                    }
                };
            }
        }
        return false;
    }
}
