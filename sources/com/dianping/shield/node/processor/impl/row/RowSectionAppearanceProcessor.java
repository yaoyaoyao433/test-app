package com.dianping.shield.node.processor.impl.row;

import com.dianping.shield.expose.RangeAppearStateManager;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AttachStatusChangeListener;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/row/RowSectionAppearanceProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RowSectionAppearanceProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull final ShieldRow shieldRow) {
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb48c4dc7dcf26e1e794c4ae2a46dcfc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb48c4dc7dcf26e1e794c4ae2a46dcfc")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        ShieldSection shieldSection = shieldRow.sectionParent;
        if (shieldSection != null && shieldSection.rangeAppearStateManager != null) {
            if (shieldRow.attachStatusChangeListenerList == null) {
                shieldRow.attachStatusChangeListenerList = new ArrayList<>();
            }
            ArrayList<AttachStatusChangeListener<ShieldRow>> arrayList = shieldRow.attachStatusChangeListenerList;
            if (arrayList != null) {
                arrayList.add(new AttachStatusChangeListener<ShieldRow>() { // from class: com.dianping.shield.node.processor.impl.row.RowSectionAppearanceProcessor$handleRowItem$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.cellnode.AttachStatusChangeListener
                    public final void onAttachStatusChanged(@NotNull AppearanceDispatchData<ShieldRow> appearanceDispatchData) {
                        RangeAppearStateManager<ShieldRow> rangeAppearStateManager;
                        Object[] objArr2 = {appearanceDispatchData};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4ca4647fe051ab1341f34dfdf312eda2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4ca4647fe051ab1341f34dfdf312eda2");
                            return;
                        }
                        h.b(appearanceDispatchData, "dispatchData");
                        ShieldSection shieldSection2 = ShieldRow.this.sectionParent;
                        if (shieldSection2 == null || (rangeAppearStateManager = shieldSection2.rangeAppearStateManager) == null) {
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
