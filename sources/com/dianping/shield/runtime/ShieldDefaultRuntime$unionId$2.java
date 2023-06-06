package com.dianping.shield.runtime;

import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldDefaultRuntime$unionId$2 extends i implements a<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ShieldDefaultRuntime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShieldDefaultRuntime$unionId$2(ShieldDefaultRuntime shieldDefaultRuntime) {
        super(0);
        this.this$0 = shieldDefaultRuntime;
    }

    @Override // kotlin.jvm.functions.a
    @NotNull
    public final String invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b16da7bf6089f2bfcf8e32b8d21d1f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b16da7bf6089f2bfcf8e32b8d21d1f3");
        }
        OneIdHandler oneIdHandler = OneIdHandler.getInstance(this.this$0.getContext());
        oneIdHandler.init();
        h.a((Object) oneIdHandler, "handler");
        String localOneId = oneIdHandler.getLocalOneId();
        return localOneId == null ? "" : localOneId;
    }
}
