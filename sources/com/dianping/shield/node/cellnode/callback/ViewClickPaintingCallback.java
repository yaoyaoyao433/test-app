package com.dianping.shield.node.cellnode.callback;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/ViewClickPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "originCallback", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "(Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;Lcom/dianping/shield/node/useritem/ViewItem;)V", "bindViewHolder", "", Constants.EventType.VIEW, "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "equals", "", "other", "hashCode", "", "ShieldViewClickedListerner", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ViewClickPaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ViewPaintingCallback<?> originCallback;
    private ViewItem viewItem;

    public ViewClickPaintingCallback(@NotNull ViewPaintingCallback<?> viewPaintingCallback, @NotNull ViewItem viewItem) {
        h.b(viewPaintingCallback, "originCallback");
        h.b(viewItem, "viewItem");
        Object[] objArr = {viewPaintingCallback, viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9537cd89420193b967104815515bfd90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9537cd89420193b967104815515bfd90");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dcb449678ec2c26bc531d0a7073542c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dcb449678ec2c26bc531d0a7073542c");
        }
        h.b(context, "context");
        ?? createViewHolder = this.originCallback.createViewHolder(context, viewGroup, str);
        if (h.a((Object) NodeCreator.Companion.revertViewType(str), (Object) this.viewItem.viewType) && this.viewItem.clickCallback != null && !createViewHolder.itemView.hasOnClickListeners()) {
            ShieldViewClickedListerner shieldViewClickedListerner = new ShieldViewClickedListerner();
            createViewHolder.itemView.setOnClickListener(shieldViewClickedListerner);
            createViewHolder.itemView.setTag(R.id.item_click_tag_key_id, shieldViewClickedListerner);
        }
        return createViewHolder;
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6964feef771c794b8e920cb7acc3f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6964feef771c794b8e920cb7acc3f2e");
            return;
        }
        h.b(shieldViewHolder, Constants.EventType.VIEW);
        this.originCallback.bindViewHolder(shieldViewHolder, obj, nodePath);
        if ((obj instanceof ShieldDisplayNode) && h.a((Object) NodeCreator.Companion.revertViewType(((ShieldDisplayNode) obj).viewType), (Object) this.viewItem.viewType) && this.viewItem.clickCallback != null) {
            shieldViewHolder.itemView.setTag(R.id.item_click_tag_data_id, obj);
            if (shieldViewHolder.itemView.getTag(R.id.item_click_tag_key_id) instanceof ShieldViewClickedListerner) {
                return;
            }
            ShieldViewClickedListerner shieldViewClickedListerner = new ShieldViewClickedListerner();
            shieldViewHolder.itemView.setOnClickListener(shieldViewClickedListerner);
            shieldViewHolder.itemView.setTag(R.id.item_click_tag_key_id, shieldViewClickedListerner);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45af67a727243d5ddcc9faf35dd80d36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45af67a727243d5ddcc9faf35dd80d36")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            ViewClickPaintingCallback viewClickPaintingCallback = (ViewClickPaintingCallback) obj;
            return ((h.a(this.originCallback, viewClickPaintingCallback.originCallback) ^ true) || (h.a(this.viewItem, viewClickPaintingCallback.viewItem) ^ true)) ? false : true;
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.callback.ViewClickPaintingCallback");
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a68feba8af9bade94722c22b97f98a2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a68feba8af9bade94722c22b97f98a2")).intValue() : (this.originCallback.hashCode() * 31) + this.viewItem.hashCode();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/ViewClickPaintingCallback$ShieldViewClickedListerner;", "Landroid/view/View$OnClickListener;", "()V", "onClick", "", "v", "Landroid/view/View;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class ShieldViewClickedListerner implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            ShieldDisplayNode shieldDisplayNode;
            ViewClickCallbackWithData viewClickCallbackWithData;
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffcde924ce6a248235c2edeca7672bc6", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffcde924ce6a248235c2edeca7672bc6");
            } else if (view != null) {
                Object tag = view.getTag(R.id.item_click_tag_data_id);
                if (!(tag instanceof ShieldDisplayNode) || (viewClickCallbackWithData = (shieldDisplayNode = (ShieldDisplayNode) tag).clickCallback) == null) {
                    return;
                }
                viewClickCallbackWithData.onViewClicked(view, shieldDisplayNode.data, shieldDisplayNode.getPath());
            }
        }
    }
}
