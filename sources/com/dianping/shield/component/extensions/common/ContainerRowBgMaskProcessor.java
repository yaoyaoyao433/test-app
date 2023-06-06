package com.dianping.shield.component.extensions.common;

import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener;
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
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/extensions/common/ContainerRowBgMaskProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ContainerRowBgMaskProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcbbb946f7beac8050b8b4c987a0a2bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcbbb946f7beac8050b8b4c987a0a2bb")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        if ((rowItem instanceof CommonContainerRowItem) && (shieldRow instanceof CommonContainerRow)) {
            CommonContainerRowItem commonContainerRowItem = (CommonContainerRowItem) rowItem;
            if (commonContainerRowItem.getLastUsedViewItem() == null) {
                ViewItem viewItem = new ViewItem();
                viewItem.viewStatusWithPrefetchListener = new ViewStatusWithPrefetchListener() { // from class: com.dianping.shield.component.extensions.common.ContainerRowBgMaskProcessor$handleRowItem$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener
                    public final void onStatusChanged(@NotNull AttachStatus attachStatus, @NotNull ScrollDirection scrollDirection, @Nullable Object obj) {
                        CommonContainerRow shieldRow2;
                        ArrayList<ViewItem> arrayList;
                        Object[] objArr2 = {attachStatus, scrollDirection, obj};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "786dd76a2b98791144e2254a85cd1ab8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "786dd76a2b98791144e2254a85cd1ab8");
                            return;
                        }
                        h.b(attachStatus, "status");
                        h.b(scrollDirection, "direction");
                        if (!(obj instanceof CommonContainerNodeData) || (shieldRow2 = ((CommonContainerNodeData) obj).getShieldRow()) == null || (arrayList = shieldRow2.viewItems) == null) {
                            return;
                        }
                        for (ViewItem viewItem2 : arrayList) {
                            ViewStatusWithPrefetchListener viewStatusWithPrefetchListener = viewItem2.viewStatusWithPrefetchListener;
                            if (viewStatusWithPrefetchListener != null) {
                                viewStatusWithPrefetchListener.onStatusChanged(attachStatus, scrollDirection, viewItem2.data);
                            }
                        }
                    }
                };
                commonContainerRowItem.setLastUsedViewItem(viewItem);
            }
            ViewItem lastUsedViewItem = commonContainerRowItem.getLastUsedViewItem();
            if (lastUsedViewItem != null) {
                CommonContainerRow commonContainerRow = (CommonContainerRow) shieldRow;
                ViewPaintingCallback<?> viewPaintingCallback = commonContainerRow.rowPaintingCallback;
                if (viewPaintingCallback != null) {
                    CommonContainerNodeData dNodeData = commonContainerRow.getDNodeData();
                    if (dNodeData != null) {
                        dNodeData.setBgViewItem(commonContainerRowItem.getBackgroundViewItem());
                        dNodeData.setMaskViewItem(commonContainerRowItem.getMaskViewItem());
                        dNodeData.setBackgroundColor(commonContainerRowItem.getBackgroundColor());
                        dNodeData.setGradientColorInfo(commonContainerRowItem.getGradientBackgroundColor());
                        dNodeData.setContext(getContext());
                    } else {
                        dNodeData = null;
                    }
                    lastUsedViewItem.data = dNodeData;
                    if (lastUsedViewItem.viewPaintingCallback == null) {
                        lastUsedViewItem.viewPaintingCallback = new ContainerRowBgMaskPaintingCallback(viewPaintingCallback);
                    }
                    lastUsedViewItem.viewType = commonContainerRowItem.getViewType();
                }
                ShieldDisplayNode shieldDisplayNode = new ShieldDisplayNode();
                shieldDisplayNode.rowParent = shieldRow;
                processShieldNode(lastUsedViewItem, shieldDisplayNode);
                ArrayList<ShieldDisplayNode> arrayList = shieldRow.shieldDisplayNodes;
                if (arrayList != null) {
                    arrayList.set(0, shieldDisplayNode);
                }
            }
        }
        return false;
    }
}
