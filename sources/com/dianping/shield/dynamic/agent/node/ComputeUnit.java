package com.dianping.shield.dynamic.agent.node;

import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.ComputeViewInputListener;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "owner", "Lcom/dianping/shield/node/useritem/ViewItem;", "data", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "(Lcom/dianping/shield/node/useritem/ViewItem;Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;)V", "getData", "()Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "getOwner", "()Lcom/dianping/shield/node/useritem/ViewItem;", "getViewItemData", "setComputeViewInputListener", "", "computeViewInputListener", "Lcom/dianping/shield/dynamic/protocols/ComputeViewInputListener;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ComputeUnit implements IDynamicModuleViewItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final DynamicModuleViewItemData data;
    @NotNull
    private final ViewItem owner;

    public ComputeUnit(@NotNull ViewItem viewItem, @NotNull DynamicModuleViewItemData dynamicModuleViewItemData) {
        h.b(viewItem, "owner");
        h.b(dynamicModuleViewItemData, "data");
        Object[] objArr = {viewItem, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3967fe418ef0cf40d9dae5f88e480c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3967fe418ef0cf40d9dae5f88e480c0");
            return;
        }
        this.owner = viewItem;
        this.data = dynamicModuleViewItemData;
    }

    @NotNull
    public final DynamicModuleViewItemData getData() {
        return this.data;
    }

    @NotNull
    public final ViewItem getOwner() {
        return this.owner;
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    @NotNull
    public final DynamicModuleViewItemData getViewItemData() {
        return this.data;
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    public final void setComputeViewInputListener(@Nullable ComputeViewInputListener computeViewInputListener) {
        this.data.computeViewInputListener = computeViewInputListener;
    }
}
