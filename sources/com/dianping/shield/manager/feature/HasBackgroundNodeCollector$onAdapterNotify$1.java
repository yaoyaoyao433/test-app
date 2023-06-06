package com.dianping.shield.manager.feature;

import android.util.SparseArray;
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
public final class HasBackgroundNodeCollector$onAdapterNotify$1 extends i implements a<r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HasBackgroundNodeCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HasBackgroundNodeCollector$onAdapterNotify$1(HasBackgroundNodeCollector hasBackgroundNodeCollector) {
        super(0);
        this.this$0 = hasBackgroundNodeCollector;
    }

    @Override // kotlin.jvm.functions.a
    public final /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SparseArray sparseArray;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "840352667541b064a8d1ab0e8565ac24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "840352667541b064a8d1ab0e8565ac24");
            return;
        }
        sparseArray = this.this$0.childBgInfoArray;
        sparseArray.clear();
    }
}
