package com.dianping.shield.node.processor.legacy.section;

import android.content.Context;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.ak;
import com.dianping.agentsdk.framework.al;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.feature.SectionTitleInterface;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/section/LinkTypeIntefaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/section/SectionInterfaceProcessor;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "handleSectionItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "section", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LinkTypeIntefaceProcessor extends SectionInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context mContext;

    public LinkTypeIntefaceProcessor(@NotNull Context context) {
        h.b(context, "mContext");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02c7704f3e0884863c0244143e9f3028", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02c7704f3e0884863c0244143e9f3028");
        } else {
            this.mContext = context;
        }
    }

    @Override // com.dianping.shield.node.processor.legacy.section.SectionInterfaceProcessor
    public final boolean handleSectionItem(@NotNull af afVar, @NotNull SectionItem sectionItem, int i) {
        Object[] objArr = {afVar, sectionItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d32c4253b8c89f2e16d7ef8c01d6fd83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d32c4253b8c89f2e16d7ef8c01d6fd83")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(sectionItem, "sectionItem");
        if (afVar instanceof al) {
            al alVar = (al) afVar;
            sectionItem.previousLinkType = alVar.linkPrevious(i);
            sectionItem.nextLinkType = alVar.linkNext(i);
            float sectionHeaderHeight = alVar.getSectionHeaderHeight(i);
            if (sectionHeaderHeight >= 0.0f) {
                sectionItem.sectionHeaderGapHeight = aq.b(this.mContext, sectionHeaderHeight);
            }
            float sectionFooterHeight = alVar.getSectionFooterHeight(i);
            if (sectionFooterHeight >= 0.0f) {
                sectionItem.sectionFooterGapHeight = aq.b(this.mContext, sectionFooterHeight);
            }
        }
        if (afVar instanceof ak) {
            ak akVar = (ak) afVar;
            sectionItem.sectionHeaderGapDrawable = akVar.a(i);
            sectionItem.sectionFooterGapDrawable = akVar.b(i);
        }
        if (afVar instanceof SectionTitleInterface) {
            sectionItem.sectionTitle = ((SectionTitleInterface) afVar).getSectionTitle(i);
        }
        return false;
    }
}
