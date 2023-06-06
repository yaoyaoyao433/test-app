package com.dianping.shield.node.cellnode.callback;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.itemcallbacks.ViewLongClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/ViewLongClickPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "originCallback", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "(Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;Lcom/dianping/shield/node/useritem/ViewItem;)V", "bindViewHolder", "", Constants.EventType.VIEW, "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "ShieldViewClickedListerner", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ViewLongClickPaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ViewPaintingCallback<?> originCallback;
    private ViewItem viewItem;

    public ViewLongClickPaintingCallback(@NotNull ViewPaintingCallback<?> viewPaintingCallback, @NotNull ViewItem viewItem) {
        h.b(viewPaintingCallback, "originCallback");
        h.b(viewItem, "viewItem");
        Object[] objArr = {viewPaintingCallback, viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7151a8de995485a949f62a69afbf7186", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7151a8de995485a949f62a69afbf7186");
            return;
        }
        this.originCallback = viewPaintingCallback;
        this.viewItem = viewItem;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [com.dianping.shield.node.adapter.ShieldViewHolder] */
    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9aa617af96995b6fe3deb1e5f1eea241", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9aa617af96995b6fe3deb1e5f1eea241");
        }
        h.b(context, "context");
        ?? createViewHolder = this.originCallback.createViewHolder(context, viewGroup, str);
        if (h.a((Object) NodeCreator.Companion.revertViewType(str), (Object) this.viewItem.viewType) && this.viewItem.longClickCallback != null) {
            ShieldViewClickedListerner shieldViewClickedListerner = new ShieldViewClickedListerner();
            createViewHolder.itemView.setOnLongClickListener(shieldViewClickedListerner);
            createViewHolder.itemView.setTag(R.id.item_longclick_tag_key_id, shieldViewClickedListerner);
        }
        return createViewHolder;
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62b45c6094e3ba826962d8baf46f8d3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62b45c6094e3ba826962d8baf46f8d3f");
            return;
        }
        h.b(shieldViewHolder, Constants.EventType.VIEW);
        this.originCallback.bindViewHolder(shieldViewHolder, obj, nodePath);
        if ((obj instanceof ShieldDisplayNode) && h.a((Object) NodeCreator.Companion.revertViewType(((ShieldDisplayNode) obj).viewType), (Object) this.viewItem.viewType) && this.viewItem.longClickCallback != null) {
            shieldViewHolder.itemView.setTag(R.id.item_longclick_tag_data_id, obj);
            if (shieldViewHolder.itemView.getTag(R.id.item_longclick_tag_key_id) instanceof ShieldViewClickedListerner) {
                return;
            }
            ShieldViewClickedListerner shieldViewClickedListerner = new ShieldViewClickedListerner();
            shieldViewHolder.itemView.setOnLongClickListener(shieldViewClickedListerner);
            shieldViewHolder.itemView.setTag(R.id.item_longclick_tag_key_id, shieldViewClickedListerner);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/ViewLongClickPaintingCallback$ShieldViewClickedListerner;", "Landroid/view/View$OnLongClickListener;", "()V", "onLongClick", "", "v", "Landroid/view/View;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    static final class ShieldViewClickedListerner implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(@Nullable View view) {
            ShieldDisplayNode shieldDisplayNode;
            ViewLongClickCallbackWithData viewLongClickCallbackWithData;
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa076f16d2894a63f23207e4740e10f2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa076f16d2894a63f23207e4740e10f2")).booleanValue();
            }
            if (view != null) {
                Object tag = view.getTag(R.id.item_longclick_tag_data_id);
                if ((tag instanceof ShieldDisplayNode) && (viewLongClickCallbackWithData = (shieldDisplayNode = (ShieldDisplayNode) tag).longClickCallback) != null) {
                    return viewLongClickCallbackWithData.onViewLongClicked(view, shieldDisplayNode.data, shieldDisplayNode.getPath());
                }
            }
            return false;
        }
    }
}
