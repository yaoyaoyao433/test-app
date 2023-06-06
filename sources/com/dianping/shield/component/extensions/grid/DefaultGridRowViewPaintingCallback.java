package com.dianping.shield.component.extensions.grid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.picassomodule.widget.cssgrid.SuperGridView;
import com.dianping.picassomodule.widget.cssgrid.a;
import com.dianping.picassomodule.widget.cssgrid.c;
import com.dianping.picassomodule.widget.cssgrid.d;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.component.extensions.gridsection.GridRecycledViewPool;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewLongClickCallbackWithData;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u0017"}, d2 = {"Lcom/dianping/shield/component/extensions/grid/DefaultGridRowViewPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/component/extensions/grid/ShieldGridViewHolder;", "()V", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "getRecycledViewHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "gridRecycledViewPool", "Lcom/dianping/shield/component/extensions/gridsection/GridRecycledViewPool;", "putRecycledViewHolder", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultGridRowViewPaintingCallback implements ViewPaintingCallback<ShieldGridViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldGridViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20a83d86a04b8f8e38fb8f2df7af85ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldGridViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20a83d86a04b8f8e38fb8f2df7af85ed");
        }
        h.b(context, "context");
        SuperGridView superGridView = new SuperGridView(context);
        superGridView.setLayoutParams(new ViewGroup.LayoutParams((viewGroup == null || viewGroup.getMeasuredWidth() <= 0) ? -1 : viewGroup.getMeasuredWidth(), -2));
        return new ShieldGridViewHolder(superGridView);
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull final ShieldGridViewHolder shieldGridViewHolder, @Nullable final Object obj, @Nullable final NodePath nodePath) {
        float f;
        Object[] objArr = {shieldGridViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcdeede85a9560e889e3bc4334f8964f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcdeede85a9560e889e3bc4334f8964f");
            return;
        }
        h.b(shieldGridViewHolder, "viewHolder");
        if (obj instanceof CommonContainerNodeData) {
            CommonContainerNodeData commonContainerNodeData = (CommonContainerNodeData) obj;
            if ((commonContainerNodeData.getShieldRow() instanceof GridShieldRow) && (shieldGridViewHolder.itemView instanceof SuperGridView)) {
                View view = shieldGridViewHolder.itemView;
                if (view == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.picassomodule.widget.cssgrid.SuperGridView<com.dianping.shield.node.useritem.ViewItem>");
                }
                final SuperGridView superGridView = (SuperGridView) view;
                CommonContainerRow shieldRow = commonContainerNodeData.getShieldRow();
                if (shieldRow == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.grid.GridShieldRow");
                }
                final GridShieldRow gridShieldRow = (GridShieldRow) shieldRow;
                if (gridShieldRow.viewItems.size() <= 0) {
                    return;
                }
                d dVar = gridShieldRow.gridDrawInfo;
                if (dVar != null) {
                    superGridView.setGridDrawInfo(dVar);
                } else {
                    c cVar = gridShieldRow.gridDescription;
                    if (cVar != null) {
                        if (gridShieldRow.rowWidth == -1) {
                            f = superGridView.getLayoutParams().width;
                        } else {
                            f = gridShieldRow.rowWidth;
                        }
                        cVar.g = f;
                    }
                    d dVar2 = new d(gridShieldRow.gridDescription);
                    c cVar2 = gridShieldRow.gridDescription;
                    if (cVar2 != null && cVar2.f <= 0.0f) {
                        dVar2.a(0, gridShieldRow.recommendItemHeight);
                    }
                    superGridView.setGridDrawInfo(dVar2);
                }
                superGridView.setOnItemClickListener(new SuperGridView.a() { // from class: com.dianping.shield.component.extensions.grid.DefaultGridRowViewPaintingCallback$bindViewHolder$$inlined$apply$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.picassomodule.widget.cssgrid.SuperGridView.a
                    public final void onItemClick(int i, View view2) {
                        Object[] objArr2 = {Integer.valueOf(i), view2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "be47002da67275428bc48eaf59e80c1b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "be47002da67275428bc48eaf59e80c1b");
                            return;
                        }
                        ArrayList<ViewItem> arrayList = GridShieldRow.this.viewItems;
                        if (i < arrayList.size()) {
                            ViewItem viewItem = arrayList.get(i);
                            h.a((Object) viewItem, "it[position]");
                            ViewItem viewItem2 = viewItem;
                            ViewClickCallbackWithData viewClickCallbackWithData = viewItem2.clickCallback;
                            if (viewClickCallbackWithData != null) {
                                h.a((Object) view2, Constants.EventType.VIEW);
                                viewClickCallbackWithData.onViewClicked(view2, viewItem2.data, nodePath);
                            }
                        }
                    }
                });
                superGridView.setOnItemLongClickListener(new SuperGridView.b() { // from class: com.dianping.shield.component.extensions.grid.DefaultGridRowViewPaintingCallback$bindViewHolder$$inlined$apply$lambda$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.picassomodule.widget.cssgrid.SuperGridView.b
                    public final void onItemLongClickListener(int i, View view2) {
                        Object[] objArr2 = {Integer.valueOf(i), view2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2e490ca4f3dbfba3dc2a7f1c0084e8ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2e490ca4f3dbfba3dc2a7f1c0084e8ed");
                            return;
                        }
                        ArrayList<ViewItem> arrayList = GridShieldRow.this.viewItems;
                        if (i < arrayList.size()) {
                            ViewItem viewItem = arrayList.get(i);
                            h.a((Object) viewItem, "it[position]");
                            ViewItem viewItem2 = viewItem;
                            ViewLongClickCallbackWithData viewLongClickCallbackWithData = viewItem2.longClickCallback;
                            if (viewLongClickCallbackWithData != null) {
                                h.a((Object) view2, Constants.EventType.VIEW);
                                viewLongClickCallbackWithData.onViewLongClicked(view2, viewItem2.data, nodePath);
                            }
                        }
                    }
                });
                putRecycledViewHolder(shieldGridViewHolder.getGridRecycledViewPool(), shieldGridViewHolder);
                final ArrayList<ViewItem> arrayList = gridShieldRow.viewItems;
                superGridView.setAdapter(new a<ViewItem>(arrayList) { // from class: com.dianping.shield.component.extensions.grid.DefaultGridRowViewPaintingCallback$bindViewHolder$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.picassomodule.widget.cssgrid.a
                    @NotNull
                    public final View getView(int i) {
                        ShieldViewHolder recycledViewHolder;
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "202b6ca406de27e9ecdf03b503df37df", RobustBitConfig.DEFAULT_VALUE)) {
                            return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "202b6ca406de27e9ecdf03b503df37df");
                        }
                        ViewItem item = getItem(i);
                        recycledViewHolder = DefaultGridRowViewPaintingCallback.this.getRecycledViewHolder(shieldGridViewHolder.getGridRecycledViewPool(), item.viewType);
                        if (recycledViewHolder != null) {
                            ViewPaintingCallback viewPaintingCallback = item.viewPaintingCallback;
                            if (viewPaintingCallback != null) {
                                viewPaintingCallback.bindViewHolder(recycledViewHolder, item.data, nodePath);
                            }
                            ArrayList<PoolView> arrayList2 = shieldGridViewHolder.childViewHolders;
                            String str = item.viewType;
                            h.a((Object) str, "viewItem.viewType");
                            arrayList2.add(new PoolView(str, recycledViewHolder));
                            return recycledViewHolder.itemView;
                        }
                        Context context = ((CommonContainerNodeData) obj).getContext();
                        if (context != null) {
                            ShieldViewHolder createViewHolder = item.viewPaintingCallback.createViewHolder(context, superGridView, item.viewType);
                            item.viewPaintingCallback.bindViewHolder(createViewHolder, item.data, nodePath);
                            String str2 = item.viewType;
                            if (str2 != null) {
                                shieldGridViewHolder.childViewHolders.add(new PoolView(str2, createViewHolder));
                            }
                            return createViewHolder.itemView;
                        }
                        return new View(((CommonContainerNodeData) obj).getContext());
                    }
                });
            }
        }
    }

    private final void putRecycledViewHolder(GridRecycledViewPool gridRecycledViewPool, ShieldGridViewHolder shieldGridViewHolder) {
        Object[] objArr = {gridRecycledViewPool, shieldGridViewHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0192208690d3710b5b9dc81baa8ecdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0192208690d3710b5b9dc81baa8ecdb");
            return;
        }
        for (PoolView poolView : shieldGridViewHolder.childViewHolders) {
            if (gridRecycledViewPool != null) {
                gridRecycledViewPool.putRecycledView(poolView.viewType, poolView.recycledViewHolder);
            }
        }
        shieldGridViewHolder.childViewHolders.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShieldViewHolder getRecycledViewHolder(GridRecycledViewPool gridRecycledViewPool, String str) {
        Object[] objArr = {gridRecycledViewPool, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b86fc8da9e98c67ad8a49f49710516b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b86fc8da9e98c67ad8a49f49710516b6");
        }
        if (str == null || gridRecycledViewPool == null) {
            return null;
        }
        return gridRecycledViewPool.getRecycledView(str);
    }
}
