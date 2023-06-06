package com.dianping.shield.dynamic.items.viewitems;

import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.ComputeViewInputListener;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItemInterface;", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "getViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "getViewItemData", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "setComputeViewInputListener", "", "computeViewInputListener", "Lcom/dianping/shield/dynamic/protocols/ComputeViewInputListener;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface DynamicViewItemInterface extends IDynamicModuleViewItem {
    @NotNull
    ViewItem getViewItem();

    @Override // com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    @Nullable
    DynamicModuleViewItemData getViewItemData();

    @Override // com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    void setComputeViewInputListener(@Nullable ComputeViewInputListener computeViewInputListener);

    void setViewItem(@NotNull ViewItem viewItem);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Nullable
        public static DynamicModuleViewItemData getViewItemData(DynamicViewItemInterface dynamicViewItemInterface) {
            Object[] objArr = {dynamicViewItemInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4a8b9beb70e46cd7bf4092cc947a570", RobustBitConfig.DEFAULT_VALUE)) {
                return (DynamicModuleViewItemData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4a8b9beb70e46cd7bf4092cc947a570");
            }
            Object obj = dynamicViewItemInterface.getViewItem().data;
            if (!(obj instanceof DynamicModuleViewItemData)) {
                obj = null;
            }
            return (DynamicModuleViewItemData) obj;
        }

        public static void setComputeViewInputListener(DynamicViewItemInterface dynamicViewItemInterface, @Nullable ComputeViewInputListener computeViewInputListener) {
            Object[] objArr = {dynamicViewItemInterface, computeViewInputListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84fdba0ff0bef6690b2fdb41454db33a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84fdba0ff0bef6690b2fdb41454db33a");
                return;
            }
            Object obj = dynamicViewItemInterface.getViewItem().data;
            if (!(obj instanceof DynamicModuleViewItemData)) {
                obj = null;
            }
            DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
            if (dynamicModuleViewItemData != null) {
                dynamicModuleViewItemData.computeViewInputListener = computeViewInputListener;
            }
        }
    }
}
