package com.dianping.shield.manager.feature;

import com.dianping.shield.entity.SectionTitleInfo;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.k;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SectionTitleArrayCollector$onAdapterNotify$2 extends i implements c<Integer, ShieldSection, r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SectionTitleArrayCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionTitleArrayCollector$onAdapterNotify$2(SectionTitleArrayCollector sectionTitleArrayCollector) {
        super(2);
        this.this$0 = sectionTitleArrayCollector;
    }

    @Override // kotlin.jvm.functions.c
    public final /* synthetic */ r invoke(Integer num, ShieldSection shieldSection) {
        invoke(num.intValue(), shieldSection);
        return r.a;
    }

    public final void invoke(int i, @NotNull ShieldSection shieldSection) {
        Object[] objArr = {Integer.valueOf(i), shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "525f9373f91c52305630932eb4162628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "525f9373f91c52305630932eb4162628");
            return;
        }
        h.b(shieldSection, "shieldSection");
        ShieldViewCell shieldViewCell = shieldSection.cellParent;
        String str = shieldViewCell != null ? shieldViewCell.key : null;
        String str2 = shieldSection.sectionTitle;
        if (str != null) {
            if (!(str.length() > 0) || str2 == null) {
                return;
            }
            if (str2.length() > 0) {
                k<String, Integer> kVar = new k<>(str, Integer.valueOf(i));
                SectionTitleInfo sectionTitleInfo = this.this$0.getSectionTitleMap().get(kVar);
                if (sectionTitleInfo == null) {
                    this.this$0.getSectionTitleMap().put(kVar, new SectionTitleInfo(str, i, str2));
                    return;
                }
                sectionTitleInfo.cellKey = str;
                sectionTitleInfo.section = i;
                sectionTitleInfo.sectionTitle = str2;
            }
        }
    }
}
