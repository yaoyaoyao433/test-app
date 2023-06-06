package com.dianping.shield.dynamic.diff.section;

import com.dianping.shield.dynamic.items.sectionitems.DynamicSectionBGViewDiff;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/items/sectionitems/DynamicSectionBGViewDiff;", "T", "Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;", "V", "Lcom/dianping/shield/node/useritem/SectionItem;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseSectionDiff$dynamicSectionBGViewDiff$2 extends i implements a<DynamicSectionBGViewDiff> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseSectionDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSectionDiff$dynamicSectionBGViewDiff$2(BaseSectionDiff baseSectionDiff) {
        super(0);
        this.this$0 = baseSectionDiff;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final DynamicSectionBGViewDiff invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8dc69c3e657336a8e1b5959d7ce4c73", RobustBitConfig.DEFAULT_VALUE) ? (DynamicSectionBGViewDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8dc69c3e657336a8e1b5959d7ce4c73") : new DynamicSectionBGViewDiff(this.this$0.getHostChassis(), this.this$0.getSectionItem());
    }
}
