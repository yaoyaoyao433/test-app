package com.dianping.shield.node.cellnode.callback;

import android.content.Context;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.processor.NodeCreator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0002\u0010\u0004J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/DefaultViewPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "originCallback", "(Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;)V", "getOriginCallback", "()Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "setOriginCallback", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "equals", "", "other", "hashCode", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultViewPaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private ViewPaintingCallback<?> originCallback;

    public DefaultViewPaintingCallback(@NotNull ViewPaintingCallback<?> viewPaintingCallback) {
        h.b(viewPaintingCallback, "originCallback");
        Object[] objArr = {viewPaintingCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "683acf4e0f6bb8a16bd3d54e28255f39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "683acf4e0f6bb8a16bd3d54e28255f39");
        } else {
            this.originCallback = viewPaintingCallback;
        }
    }

    @NotNull
    public final ViewPaintingCallback<?> getOriginCallback() {
        return this.originCallback;
    }

    public final void setOriginCallback(@NotNull ViewPaintingCallback<?> viewPaintingCallback) {
        Object[] objArr = {viewPaintingCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5881b2f3ba53c11c72f6136c76c68c55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5881b2f3ba53c11c72f6136c76c68c55");
            return;
        }
        h.b(viewPaintingCallback, "<set-?>");
        this.originCallback = viewPaintingCallback;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [com.dianping.shield.node.adapter.ShieldViewHolder] */
    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d6098c5e43fb3bda524be8840396275", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d6098c5e43fb3bda524be8840396275");
        }
        h.b(context, "context");
        return this.originCallback.createViewHolder(context, viewGroup, NodeCreator.Companion.revertViewType(str));
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac3931fc9e163fbe99e1efea6508b5a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac3931fc9e163fbe99e1efea6508b5a0");
            return;
        }
        h.b(shieldViewHolder, "viewHolder");
        if (obj instanceof ShieldDisplayNode) {
            this.originCallback.bindViewHolder(shieldViewHolder, ((ShieldDisplayNode) obj).data, nodePath);
        } else {
            this.originCallback.bindViewHolder(shieldViewHolder, obj, nodePath);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "215242322ded6c482e6dcddee25610c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "215242322ded6c482e6dcddee25610c5")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return !(h.a(this.originCallback, ((DefaultViewPaintingCallback) obj).originCallback) ^ true);
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.callback.DefaultViewPaintingCallback");
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4916c47f7bf5d9c11b05c0c8e53e730c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4916c47f7bf5d9c11b05c0c8e53e730c")).intValue() : this.originCallback.hashCode();
    }
}
