package com.dianping.shield.component.extensions.tabs;

import com.dianping.agentsdk.framework.aq;
import com.dianping.picassomodule.widget.tab.e;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.processor.impl.row.RowNodeProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/extensions/tabs/TabRowNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabRowNodeProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        e eVar;
        e eVar2;
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4407788f9fbc2cb62c2b5c9ab6d56a73", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4407788f9fbc2cb62c2b5c9ab6d56a73")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        if ((rowItem instanceof TabRowItem) && (shieldRow instanceof TabShieldRow)) {
            TabShieldRow tabShieldRow = (TabShieldRow) shieldRow;
            TabRowItem tabRowItem = (TabRowItem) rowItem;
            tabShieldRow.initialSelectedIndex = tabRowItem.initialSelectedIndex;
            tabShieldRow.lastSelectedIndex = tabRowItem.lastSelectedIndex;
            e eVar3 = tabRowItem.slideBarTheme;
            if (eVar3 != null) {
                tabShieldRow.slideBarTheme = new e();
                if (eVar3.c != -1 && (eVar2 = tabShieldRow.slideBarTheme) != null) {
                    eVar2.c = aq.a(getContext(), eVar3.c);
                }
                if (eVar3.b != -1 && (eVar = tabShieldRow.slideBarTheme) != null) {
                    eVar.b = aq.a(getContext(), eVar3.b);
                }
                e eVar4 = tabShieldRow.slideBarTheme;
                if (eVar4 != null) {
                    eVar4.a = eVar3.a;
                }
                e eVar5 = tabShieldRow.slideBarTheme;
                if (eVar5 != null) {
                    eVar5.e = eVar3.e;
                }
                e eVar6 = tabShieldRow.slideBarTheme;
                if (eVar6 != null) {
                    eVar6.d = eVar3.d;
                }
                e eVar7 = tabShieldRow.slideBarTheme;
                if (eVar7 != null) {
                    eVar7.f = eVar3.f;
                }
                e eVar8 = tabShieldRow.slideBarTheme;
                if (eVar8 != null) {
                    eVar8.g = eVar3.g;
                }
                e eVar9 = tabShieldRow.slideBarTheme;
                if (eVar9 != null) {
                    eVar9.h = aq.a(getContext(), eVar3.h);
                }
                e eVar10 = tabShieldRow.slideBarTheme;
                if (eVar10 != null) {
                    eVar10.i = eVar3.i;
                }
            }
            tabShieldRow.slideBarViewItem = tabRowItem.slideBarViewItem;
            tabShieldRow.marginBottom = aq.a(getContext(), tabRowItem.marginBottom);
            tabShieldRow.marginLeft = aq.a(getContext(), tabRowItem.marginLeft);
            tabShieldRow.marginRight = aq.a(getContext(), tabRowItem.marginRight);
            tabShieldRow.marginTop = aq.a(getContext(), tabRowItem.marginTop);
            tabShieldRow.extraMarginTop = aq.a(getContext(), tabRowItem.extraMarginTop);
            tabShieldRow.extraMarginBottom = aq.a(getContext(), tabRowItem.extraMarginBottom);
            tabShieldRow.extraMarginLeft = aq.a(getContext(), tabRowItem.extraMarginLeft);
            tabShieldRow.extraMarginRight = aq.a(getContext(), tabRowItem.extraMarginRight);
            tabShieldRow.scrollEventDispatcherProvider = tabRowItem.scrollEventDispatcherProvider;
            tabShieldRow.onDidInterceptTouchListener = tabRowItem.onDidInterceptTouchListener;
            tabShieldRow.tabHeight = aq.a(getContext(), tabRowItem.tabHeight);
            tabShieldRow.tabTotalHeight = aq.a(getContext(), tabRowItem.tabHeight + tabRowItem.marginBottom + tabRowItem.marginTop + tabRowItem.extraMarginTop + tabRowItem.extraMarginBottom);
            tabShieldRow.onLayoutListener = tabRowItem.onLayoutListener;
            tabShieldRow.onUpdateTabItemSelectedListener = tabRowItem.onUpdateTabItemSelectedListener;
            tabShieldRow.dividerStyle = rowItem.dividerStyle;
            tabShieldRow.tabTitleInfo = tabRowItem.tabTitleInfo;
            tabShieldRow.viewClickCallBack = tabRowItem.viewClickCallBack;
            tabShieldRow.data = tabRowItem.data;
            tabShieldRow.xGap = aq.a(getContext(), tabRowItem.xGap);
            tabShieldRow.displayIndexList = tabRowItem.displayIndexList;
            com.dianping.picassomodule.widget.tab.h hVar = tabShieldRow.tabTitleInfo;
            if (hVar != null) {
                hVar.a(tabRowItem.displayIndexList);
            }
            if (rowItem.isLazyLoad) {
                ArrayList<ViewItem> arrayList = new ArrayList<>();
                int i = rowItem.viewCount;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(rowItem.lazyLoadViewItemProvider.getViewItem(i2));
                }
                tabShieldRow.setViewItems(arrayList);
            } else {
                tabShieldRow.setViewItems(rowItem.viewItems);
            }
            tabShieldRow.rowPaintingCallback = new DefaultTabRowViewPaintingCallback();
            tabShieldRow.setDNodeData(new CommonContainerNodeData((CommonContainerRow) shieldRow));
        }
        return false;
    }
}
