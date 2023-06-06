package com.dianping.shield.dynamic.template;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import rx.subscriptions.b;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lrx/subscriptions/CompositeSubscription;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicComputeTemplate$subscriptions$2 extends i implements a<b> {
    public static final DynamicComputeTemplate$subscriptions$2 INSTANCE = new DynamicComputeTemplate$subscriptions$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    public DynamicComputeTemplate$subscriptions$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    @NotNull
    public final b invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e2cf0f5eb10d7c1d5bd3575e78647e", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e2cf0f5eb10d7c1d5bd3575e78647e") : new b();
    }
}
