package com.dianping.shield.manager.feature;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import kotlin.r;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SectionTitleArrayCollector$onAdapterNotify$1 extends i implements a<r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SectionTitleArrayCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionTitleArrayCollector$onAdapterNotify$1(SectionTitleArrayCollector sectionTitleArrayCollector) {
        super(0);
        this.this$0 = sectionTitleArrayCollector;
    }

    @Override // kotlin.jvm.functions.a
    public final /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bcb8dba8261035e79f696040f2a506a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bcb8dba8261035e79f696040f2a506a");
        } else {
            this.this$0.getSectionTitleMap().clear();
        }
    }
}
