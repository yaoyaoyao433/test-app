package com.dianping.shield.node.processor.impl.section;

import com.dianping.shield.expose.RangeAppearStateManager;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AttachStatusChangeListener;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/section/SectionCellAppearanceProcessor;", "Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "()V", "handleShieldSection", "", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SectionCellAppearanceProcessor extends SectionNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.section.SectionNodeProcessor
    public final boolean handleShieldSection(@NotNull SectionItem sectionItem, @NotNull final ShieldSection shieldSection) {
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3319f8488ad529e63d4b63c3ee749508", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3319f8488ad529e63d4b63c3ee749508")).booleanValue();
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        ShieldViewCell shieldViewCell = shieldSection.cellParent;
        if (shieldViewCell != null && shieldViewCell.rangeAppearStateManager != null) {
            if (shieldSection.attachStatusChangeListenerList == null) {
                shieldSection.attachStatusChangeListenerList = new ArrayList<>();
            }
            ArrayList<AttachStatusChangeListener<ShieldSection>> arrayList = shieldSection.attachStatusChangeListenerList;
            if (arrayList != null) {
                arrayList.add(new AttachStatusChangeListener<ShieldSection>() { // from class: com.dianping.shield.node.processor.impl.section.SectionCellAppearanceProcessor$handleShieldSection$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.cellnode.AttachStatusChangeListener
                    public final void onAttachStatusChanged(@NotNull AppearanceDispatchData<ShieldSection> appearanceDispatchData) {
                        RangeAppearStateManager<ShieldSection> rangeAppearStateManager;
                        Object[] objArr2 = {appearanceDispatchData};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3db51f9a5642c36ac270428245fabe76", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3db51f9a5642c36ac270428245fabe76");
                            return;
                        }
                        h.b(appearanceDispatchData, "dispatchData");
                        ShieldViewCell shieldViewCell2 = ShieldSection.this.cellParent;
                        if (shieldViewCell2 == null || (rangeAppearStateManager = shieldViewCell2.rangeAppearStateManager) == null) {
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
