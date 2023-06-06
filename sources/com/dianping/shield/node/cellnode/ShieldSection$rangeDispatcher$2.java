package com.dianping.shield.node.cellnode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/node/cellnode/RangeDispatcher;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldSection$rangeDispatcher$2 extends i implements a<RangeDispatcher> {
    public static final ShieldSection$rangeDispatcher$2 INSTANCE = new ShieldSection$rangeDispatcher$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    public ShieldSection$rangeDispatcher$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final RangeDispatcher invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec75e236efa44d1e7d4b3b001b08c8ec", RobustBitConfig.DEFAULT_VALUE) ? (RangeDispatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec75e236efa44d1e7d4b3b001b08c8ec") : new RangeDispatcher(null, 1, null);
    }
}
