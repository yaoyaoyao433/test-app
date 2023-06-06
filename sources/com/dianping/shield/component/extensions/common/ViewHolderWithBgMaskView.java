package com.dianping.shield.component.extensions.common;

import android.view.ViewGroup;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/dianping/shield/component/extensions/common/ViewHolderWithBgMaskView;", "Lcom/dianping/shield/component/extensions/common/ViewHolderWithItemsData;", "bgContainer", "Landroid/view/ViewGroup;", "containerViewHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "wrapView", "Lcom/dianping/shield/component/extensions/common/CommonBgMaskFrameLayout;", "(Landroid/view/ViewGroup;Lcom/dianping/shield/node/adapter/ShieldViewHolder;Lcom/dianping/shield/component/extensions/common/CommonBgMaskFrameLayout;)V", "bgViewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "getBgViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setBgViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "bgViewItemHolder", "getBgViewItemHolder", "()Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "setBgViewItemHolder", "(Lcom/dianping/shield/node/adapter/ShieldViewHolder;)V", "maskViewItem", "getMaskViewItem", "setMaskViewItem", "maskViewItemHolder", "getMaskViewItemHolder", "setMaskViewItemHolder", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ViewHolderWithBgMaskView extends ViewHolderWithItemsData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public final ViewGroup bgContainer;
    @Nullable
    private ViewItem bgViewItem;
    @Nullable
    private ShieldViewHolder bgViewItemHolder;
    @JvmField
    @NotNull
    public final ShieldViewHolder containerViewHolder;
    @Nullable
    private ViewItem maskViewItem;
    @Nullable
    private ShieldViewHolder maskViewItemHolder;
    @JvmField
    @NotNull
    public final CommonBgMaskFrameLayout wrapView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolderWithBgMaskView(@Nullable ViewGroup viewGroup, @NotNull ShieldViewHolder shieldViewHolder, @NotNull CommonBgMaskFrameLayout commonBgMaskFrameLayout) {
        super(commonBgMaskFrameLayout);
        h.b(shieldViewHolder, "containerViewHolder");
        h.b(commonBgMaskFrameLayout, "wrapView");
        Object[] objArr = {viewGroup, shieldViewHolder, commonBgMaskFrameLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6eb21a66746d483f391fd853863ed14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6eb21a66746d483f391fd853863ed14");
            return;
        }
        this.bgContainer = viewGroup;
        this.containerViewHolder = shieldViewHolder;
        this.wrapView = commonBgMaskFrameLayout;
    }

    @Nullable
    public final ViewItem getBgViewItem() {
        return this.bgViewItem;
    }

    public final void setBgViewItem(@Nullable ViewItem viewItem) {
        this.bgViewItem = viewItem;
    }

    @Nullable
    public final ViewItem getMaskViewItem() {
        return this.maskViewItem;
    }

    public final void setMaskViewItem(@Nullable ViewItem viewItem) {
        this.maskViewItem = viewItem;
    }

    @Nullable
    public final ShieldViewHolder getBgViewItemHolder() {
        return this.bgViewItemHolder;
    }

    public final void setBgViewItemHolder(@Nullable ShieldViewHolder shieldViewHolder) {
        this.bgViewItemHolder = shieldViewHolder;
    }

    @Nullable
    public final ShieldViewHolder getMaskViewItemHolder() {
        return this.maskViewItemHolder;
    }

    public final void setMaskViewItemHolder(@Nullable ShieldViewHolder shieldViewHolder) {
        this.maskViewItemHolder = shieldViewHolder;
    }
}
