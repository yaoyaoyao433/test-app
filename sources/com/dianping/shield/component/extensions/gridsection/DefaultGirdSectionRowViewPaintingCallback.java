package com.dianping.shield.component.extensions.gridsection;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.component.extensions.grid.PoolView;
import com.dianping.shield.component.extensions.gridsection.SimpleGridView;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u001a"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/DefaultGirdSectionRowViewPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/component/extensions/gridsection/ShieldSimpleGridViewHolder;", "()V", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "getRecycledViewHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "gridRecycledViewPool", "Lcom/dianping/shield/component/extensions/gridsection/GridRecycledViewPool;", "getRecyclerViewPool", "shieldRow", "Lcom/dianping/shield/component/extensions/gridsection/GridSectionShieldRow;", "putRecycledViewHolder", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultGirdSectionRowViewPaintingCallback implements ViewPaintingCallback<ShieldSimpleGridViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldSimpleGridViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01f3c697c41ac63694e591f1e7add1e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSimpleGridViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01f3c697c41ac63694e591f1e7add1e2");
        }
        h.b(context, "context");
        SimpleGridView simpleGridView = new SimpleGridView(context);
        simpleGridView.setLayoutParams(new ViewGroup.LayoutParams(viewGroup != null ? viewGroup.getMeasuredWidth() : -1, -2));
        simpleGridView.setOrientation(0);
        return new ShieldSimpleGridViewHolder(simpleGridView);
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull final ShieldSimpleGridViewHolder shieldSimpleGridViewHolder, @Nullable final Object obj, @Nullable final NodePath nodePath) {
        int i = 0;
        Object[] objArr = {shieldSimpleGridViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d434f2759299921cc8c1f7c96060dab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d434f2759299921cc8c1f7c96060dab7");
            return;
        }
        h.b(shieldSimpleGridViewHolder, "viewHolder");
        if (obj instanceof CommonContainerNodeData) {
            CommonContainerNodeData commonContainerNodeData = (CommonContainerNodeData) obj;
            if (commonContainerNodeData.getShieldRow() instanceof GridSectionShieldRow) {
                View view = shieldSimpleGridViewHolder.itemView;
                if (view == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.gridsection.SimpleGridView");
                }
                final SimpleGridView simpleGridView = (SimpleGridView) view;
                CommonContainerRow shieldRow = commonContainerNodeData.getShieldRow();
                if (shieldRow == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.gridsection.GridSectionShieldRow");
                }
                final GridSectionShieldRow gridSectionShieldRow = (GridSectionShieldRow) shieldRow;
                if (gridSectionShieldRow.getColCount() <= 0) {
                    return;
                }
                int xGap = (((simpleGridView.getLayoutParams().width - (gridSectionShieldRow.getXGap() * (gridSectionShieldRow.getColCount() - 1))) - gridSectionShieldRow.leftMargin) - gridSectionShieldRow.rightMargin) / gridSectionShieldRow.getColCount();
                simpleGridView.setPadding(gridSectionShieldRow.leftMargin, gridSectionShieldRow.getTopMargin(), gridSectionShieldRow.rightMargin, gridSectionShieldRow.getBottomMargin());
                simpleGridView.setMinimumHeight(gridSectionShieldRow.recommendItemHeight);
                simpleGridView.removeAllViews();
                putRecycledViewHolder(getRecyclerViewPool(gridSectionShieldRow), shieldSimpleGridViewHolder);
                simpleGridView.setOnItemClickListener(new SimpleGridView.OnItemClickListener() { // from class: com.dianping.shield.component.extensions.gridsection.DefaultGirdSectionRowViewPaintingCallback$bindViewHolder$$inlined$apply$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.component.extensions.gridsection.SimpleGridView.OnItemClickListener
                    public final void onItemClick(int i2, @NotNull View view2) {
                        ViewClickCallbackWithData viewClickCallbackWithData;
                        Object[] objArr2 = {Integer.valueOf(i2), view2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c12cb0cdd92407eb0760e764ac694996", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c12cb0cdd92407eb0760e764ac694996");
                            return;
                        }
                        h.b(view2, Constants.EventType.VIEW);
                        if (i2 >= GridSectionShieldRow.this.viewItems.size() || (viewClickCallbackWithData = GridSectionShieldRow.this.viewItems.get(i2).clickCallback) == null) {
                            return;
                        }
                        viewClickCallbackWithData.onViewClicked(view2, GridSectionShieldRow.this.viewItems.get(i2).data, nodePath);
                    }
                });
                for (Object obj2 : gridSectionShieldRow.viewItems) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.h.a();
                    }
                    ViewItem viewItem = (ViewItem) obj2;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xGap, -2);
                    if (i != 0) {
                        layoutParams.leftMargin = gridSectionShieldRow.getXGap();
                    }
                    ShieldViewHolder recycledViewHolder = getRecycledViewHolder(getRecyclerViewPool(gridSectionShieldRow), viewItem.viewType);
                    if (recycledViewHolder != null) {
                        ViewPaintingCallback viewPaintingCallback = viewItem.viewPaintingCallback;
                        if (viewPaintingCallback != null) {
                            viewPaintingCallback.bindViewHolder(recycledViewHolder, viewItem.data, nodePath);
                        }
                        ArrayList<PoolView> arrayList = shieldSimpleGridViewHolder.childViewHolders;
                        String str = viewItem.viewType;
                        h.a((Object) str, "viewItem.viewType");
                        arrayList.add(new PoolView(str, recycledViewHolder));
                        simpleGridView.addView(recycledViewHolder.itemView, layoutParams);
                    } else {
                        Context context = commonContainerNodeData.getContext();
                        if (context != null) {
                            ShieldViewHolder createViewHolder = viewItem.viewPaintingCallback.createViewHolder(context, simpleGridView, viewItem.viewType);
                            viewItem.viewPaintingCallback.bindViewHolder(createViewHolder, viewItem.data, nodePath);
                            String str2 = viewItem.viewType;
                            if (str2 != null) {
                                shieldSimpleGridViewHolder.childViewHolders.add(new PoolView(str2, createViewHolder));
                            }
                            simpleGridView.addView(createViewHolder.itemView, layoutParams);
                        }
                    }
                    i = i2;
                }
            }
        }
    }

    private final GridRecycledViewPool getRecyclerViewPool(GridSectionShieldRow gridSectionShieldRow) {
        Object[] objArr = {gridSectionShieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fe4991195da323230d44d396b0adab7", RobustBitConfig.DEFAULT_VALUE)) {
            return (GridRecycledViewPool) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fe4991195da323230d44d396b0adab7");
        }
        if (gridSectionShieldRow.sectionParent instanceof GridShieldSection) {
            ShieldSection shieldSection = gridSectionShieldRow.sectionParent;
            if (shieldSection != null) {
                return ((GridShieldSection) shieldSection).gridRecycledViewPool;
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.gridsection.GridShieldSection");
        }
        return null;
    }

    private final void putRecycledViewHolder(GridRecycledViewPool gridRecycledViewPool, ShieldSimpleGridViewHolder shieldSimpleGridViewHolder) {
        Object[] objArr = {gridRecycledViewPool, shieldSimpleGridViewHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "848c706ae5597191ecc753f8d9702c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "848c706ae5597191ecc753f8d9702c04");
            return;
        }
        for (PoolView poolView : shieldSimpleGridViewHolder.childViewHolders) {
            if (gridRecycledViewPool != null) {
                gridRecycledViewPool.putRecycledView(poolView.viewType, poolView.recycledViewHolder);
            }
        }
        shieldSimpleGridViewHolder.childViewHolders.clear();
    }

    private final ShieldViewHolder getRecycledViewHolder(GridRecycledViewPool gridRecycledViewPool, String str) {
        Object[] objArr = {gridRecycledViewPool, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23b6cbea9bb46c049a29956618c7c5c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23b6cbea9bb46c049a29956618c7c5c9");
        }
        if (str == null || gridRecycledViewPool == null) {
            return null;
        }
        return gridRecycledViewPool.getRecycledView(str);
    }
}
