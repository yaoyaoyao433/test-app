package com.dianping.shield.component.extensions.tabs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.picassomodule.widget.tab.TabView;
import com.dianping.picassomodule.widget.tab.c;
import com.dianping.picassomodule.widget.tab.e;
import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/component/extensions/tabs/DefaultTabRowViewPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "()V", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultTabRowViewPaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bedf5dcb0463e9e7573ff4d392a29ba9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bedf5dcb0463e9e7573ff4d392a29ba9");
        }
        h.b(context, "context");
        TabView tabView = new TabView(context);
        tabView.setVisibility(8);
        return new ShieldViewHolder(tabView);
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable final NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f39534c307f526517d442f8266c54b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f39534c307f526517d442f8266c54b3");
            return;
        }
        h.b(shieldViewHolder, "viewHolder");
        if ((obj instanceof CommonContainerNodeData) && (shieldViewHolder.itemView instanceof TabView)) {
            View view = shieldViewHolder.itemView;
            if (view == null) {
                throw new o("null cannot be cast to non-null type com.dianping.picassomodule.widget.tab.TabView");
            }
            final TabView tabView = (TabView) view;
            CommonContainerRow shieldRow = ((CommonContainerNodeData) obj).getShieldRow();
            if (!(shieldRow instanceof TabShieldRow)) {
                shieldRow = null;
            }
            final TabShieldRow tabShieldRow = (TabShieldRow) shieldRow;
            if (tabShieldRow != null) {
                tabView.a(tabShieldRow.marginLeft, tabShieldRow.marginRight);
                tabView.a(tabShieldRow.extraMarginLeft, tabShieldRow.extraMarginTop, tabShieldRow.extraMarginRight, tabShieldRow.extraMarginBottom);
                tabView.setTabHeight(tabShieldRow.tabHeight);
                tabView.setOnLayoutListener(tabShieldRow.onLayoutListener);
                e eVar = tabShieldRow.slideBarTheme;
                tabView.setSlideBarWrapTitle(eVar != null ? eVar.f : false);
                tabView.setRatioForSlideBarWidth(eVar != null ? eVar.i : -1.0d);
                ViewItem viewItem = tabShieldRow.slideBarViewItem;
                if (viewItem != null) {
                    ViewPaintingCallback viewPaintingCallback = viewItem.viewPaintingCallback;
                    Context context = tabView.getContext();
                    h.a((Object) context, "context");
                    ShieldViewHolder createViewHolder = viewPaintingCallback.createViewHolder(context, tabView, viewItem.viewType);
                    viewItem.viewPaintingCallback.bindViewHolder(createViewHolder, viewItem.data, nodePath);
                    tabView.setSlideBarView(createViewHolder.itemView);
                } else {
                    tabView.a(eVar != null ? eVar.a : null, eVar != null ? eVar.b : -1, eVar != null ? eVar.c : -1, eVar != null ? eVar.d : null, eVar != null ? eVar.e : false);
                }
                tabView.setOnTabClickListener(new c() { // from class: com.dianping.shield.component.extensions.tabs.DefaultTabRowViewPaintingCallback$bindViewHolder$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.picassomodule.widget.tab.c
                    public final void onTabClick(int i, View view2, g gVar) {
                        Object[] objArr2 = {Integer.valueOf(i), view2, gVar};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cdfceedf0f4a3be855d3d15e5ef36340", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cdfceedf0f4a3be855d3d15e5ef36340");
                            return;
                        }
                        NodePath nodePath2 = new NodePath();
                        IndexPath indexPath = new IndexPath();
                        NodePath path = TabShieldRow.this.getPath();
                        indexPath.section = path != null ? path.section : -1;
                        NodePath path2 = TabShieldRow.this.getPath();
                        indexPath.row = path2 != null ? path2.row : -1;
                        indexPath.index = i;
                        nodePath2.indexPath = indexPath;
                        TabViewClickCallbackWithData tabViewClickCallbackWithData = TabShieldRow.this.viewClickCallBack;
                        if (tabViewClickCallbackWithData != null) {
                            h.a((Object) view2, Constants.EventType.VIEW);
                            Object obj2 = TabShieldRow.this.data;
                            h.a((Object) gVar, "reason");
                            tabViewClickCallbackWithData.onViewClicked(view2, obj2, nodePath2, gVar);
                        }
                        ArrayList<ViewItem> arrayList = TabShieldRow.this.viewItems;
                        if ((arrayList != null ? Integer.valueOf(arrayList.size()) : null).intValue() > i) {
                            ViewItem viewItem2 = TabShieldRow.this.viewItems.get(i);
                            ViewClickCallbackWithData viewClickCallbackWithData = viewItem2.clickCallback;
                            TabViewClickCallbackWithData tabViewClickCallbackWithData2 = viewClickCallbackWithData instanceof TabViewClickCallbackWithData ? viewClickCallbackWithData : null;
                            if (tabViewClickCallbackWithData2 != null) {
                                h.a((Object) view2, Constants.EventType.VIEW);
                                Object obj3 = viewItem2.data;
                                h.a((Object) gVar, "reason");
                                tabViewClickCallbackWithData2.onViewClicked(view2, obj3, nodePath2, gVar);
                            }
                        }
                        RowItem rowItem = TabShieldRow.this.getRowItem();
                        if (rowItem == null) {
                            throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.tabs.TabRowItem");
                        }
                        ((TabRowItem) rowItem).lastSelectedIndex = i;
                    }
                });
                tabView.setTabShieldRow(tabShieldRow);
                RowItem rowItem = tabShieldRow.getRowItem();
                if (rowItem == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.tabs.TabRowItem");
                }
                int i = ((TabRowItem) rowItem).lastSelectedIndex;
                RowItem rowItem2 = tabShieldRow.getRowItem();
                if (rowItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.tabs.TabRowItem");
                }
                int i2 = ((TabRowItem) rowItem2).initialSelectedIndex;
                if (i != -1) {
                    i2 = i;
                }
                if (i2 >= 0) {
                    tabView.a(i2, 0, g.UPDATE_PROPS);
                }
            }
        }
    }
}
