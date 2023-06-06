package com.dianping.shield.node.processor.legacy.section;

import android.graphics.Rect;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.ag;
import com.dianping.agentsdk.framework.r;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/section/SectionDividerInfoInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/section/SectionInterfaceProcessor;", "()V", "handleSectionItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "section", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SectionDividerInfoInterfaceProcessor extends SectionInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.section.SectionInterfaceProcessor
    public final boolean handleSectionItem(@NotNull af afVar, @NotNull SectionItem sectionItem, int i) {
        r dividerInfo;
        Object[] objArr = {afVar, sectionItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "679a00d9d44a4d8c75b96c127d348bd1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "679a00d9d44a4d8c75b96c127d348bd1")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(sectionItem, "sectionItem");
        if ((afVar instanceof ag) && (dividerInfo = ((ag) afVar).getDividerInfo(i)) != null) {
            DividerStyle dividerStyle = new DividerStyle();
            if (dividerInfo.b() >= 0 || dividerInfo.c() >= 0) {
                dividerStyle.middleStyleLineOffset = new Rect(dividerInfo.b(), 0, dividerInfo.c(), 0);
            }
            dividerStyle.topStyleLineDrawable = dividerInfo.d();
            dividerStyle.middleStyleLineDrawable = dividerInfo.e();
            dividerStyle.bottomStyleLineDrawable = dividerInfo.f();
            sectionItem.dividerStyle = dividerStyle;
        }
        return false;
    }
}
