package com.dianping.shield.node.processor.impl.displaynode;

import com.dianping.shield.expose.RangeAppearStateManager;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AttachStatusChangeListener;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/displaynode/DisplayNodeRowAppearanceProcessor;", "Lcom/dianping/shield/node/processor/impl/displaynode/DisplayNodeProcessor;", "()V", "handleViewItem", "", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "dNode", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DisplayNodeRowAppearanceProcessor extends DisplayNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.displaynode.DisplayNodeProcessor
    public final boolean handleViewItem(@NotNull ViewItem viewItem, @NotNull final ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {viewItem, shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "663c1eb24324f0dd142f86d7e9489d7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "663c1eb24324f0dd142f86d7e9489d7b")).booleanValue();
        }
        h.b(viewItem, "viewItem");
        h.b(shieldDisplayNode, "dNode");
        ShieldRow shieldRow = shieldDisplayNode.rowParent;
        if (shieldRow != null && shieldRow.rangeAppearStateManager != null) {
            ArrayList<AttachStatusChangeListener<ShieldDisplayNode>> arrayList = shieldDisplayNode.attachStatusChangeListenerList;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                shieldDisplayNode.attachStatusChangeListenerList = new ArrayList<>();
            }
            ArrayList<AttachStatusChangeListener<ShieldDisplayNode>> arrayList2 = shieldDisplayNode.attachStatusChangeListenerList;
            if (arrayList2 != null) {
                arrayList2.add(new AttachStatusChangeListener<ShieldDisplayNode>() { // from class: com.dianping.shield.node.processor.impl.displaynode.DisplayNodeRowAppearanceProcessor$handleViewItem$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.cellnode.AttachStatusChangeListener
                    public final void onAttachStatusChanged(@NotNull AppearanceDispatchData<ShieldDisplayNode> appearanceDispatchData) {
                        RangeAppearStateManager<ShieldDisplayNode> rangeAppearStateManager;
                        ShieldRow shieldRow2;
                        RangeAppearStateManager<ShieldDisplayNode> rangeAppearStateManager2;
                        RangeAppearStateManager<ShieldDisplayNode> rangeAppearStateManager3;
                        Object[] objArr2 = {appearanceDispatchData};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8c95b26ca0668f2745cf73fe027b4b96", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8c95b26ca0668f2745cf73fe027b4b96");
                            return;
                        }
                        h.b(appearanceDispatchData, "data");
                        ShieldRow shieldRow3 = shieldDisplayNode.rowParent;
                        if (((shieldRow3 == null || (rangeAppearStateManager3 = shieldRow3.rangeAppearStateManager) == null) ? null : rangeAppearStateManager3.getEntryEventMap()) != null) {
                            ShieldRow shieldRow4 = shieldDisplayNode.rowParent;
                            if (shieldRow4 == null) {
                                h.a();
                            }
                            if (shieldRow4.rangeAppearStateManager.getEntryEventMap().isEmpty() && (shieldRow2 = shieldDisplayNode.rowParent) != null && (rangeAppearStateManager2 = shieldRow2.rangeAppearStateManager) != null) {
                                rangeAppearStateManager2.setOldAttachStatus(appearanceDispatchData.oldStatus);
                            }
                        }
                        ShieldRow shieldRow5 = shieldDisplayNode.rowParent;
                        if (shieldRow5 == null || (rangeAppearStateManager = shieldRow5.rangeAppearStateManager) == null) {
                            return;
                        }
                        rangeAppearStateManager.onEntryAttachStatusChanged(appearanceDispatchData);
                    }
                });
            }
        }
        return false;
    }
}
