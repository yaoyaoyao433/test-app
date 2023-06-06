package com.dianping.shield.node.processor.impl.section;

import com.dianping.agentsdk.framework.z;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/section/LinkTypeSectionNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "()V", "handleShieldSection", "", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LinkTypeSectionNodeProcessor extends SectionNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.section.SectionNodeProcessor
    public final boolean handleShieldSection(@NotNull SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        z.b bVar;
        z.a aVar;
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6b37c7e5a363ef8bdec5efc5c8ba540", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6b37c7e5a363ef8bdec5efc5c8ba540")).booleanValue();
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        z.b bVar2 = sectionItem.previousLinkType;
        if (bVar2 != null) {
            shieldSection.previousLinkType = bVar2;
        } else {
            ShieldViewCell shieldViewCell = shieldSection.cellParent;
            if (shieldViewCell != null && (bVar = shieldViewCell.previousLinkType) != null) {
                shieldSection.previousLinkType = bVar;
            }
        }
        z.a aVar2 = sectionItem.nextLinkType;
        if (aVar2 != null) {
            shieldSection.nextLinkType = aVar2;
        } else {
            ShieldViewCell shieldViewCell2 = shieldSection.cellParent;
            if (shieldViewCell2 != null && (aVar = shieldViewCell2.nextLinkType) != null) {
                shieldSection.nextLinkType = aVar;
            }
        }
        shieldSection.sectionHeaderHeight = sectionItem.sectionHeaderGapHeight;
        shieldSection.sectionFooterHeight = sectionItem.sectionFooterGapHeight;
        shieldSection.sectionHeaderDrawable = sectionItem.sectionHeaderGapDrawable;
        shieldSection.sectionFooterDrawable = sectionItem.sectionFooterGapDrawable;
        return false;
    }
}
