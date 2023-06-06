package com.dianping.shield.runtime;

import android.content.Context;
import com.dianping.shield.runtime.ShieldDefaultRuntime;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/runtime/ShieldDefaultRuntime$ShieldMonitorService;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldDefaultRuntime$shieldMonitorService$2 extends i implements a<ShieldDefaultRuntime.ShieldMonitorService> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ShieldDefaultRuntime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShieldDefaultRuntime$shieldMonitorService$2(ShieldDefaultRuntime shieldDefaultRuntime) {
        super(0);
        this.this$0 = shieldDefaultRuntime;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final ShieldDefaultRuntime.ShieldMonitorService invoke() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10bc54eb43292068c5efc9f15d5f8fa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDefaultRuntime.ShieldMonitorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10bc54eb43292068c5efc9f15d5f8fa2");
        }
        Context context = this.this$0.getContext();
        i = this.this$0.appId;
        return new ShieldDefaultRuntime.ShieldMonitorService(context, i);
    }
}
