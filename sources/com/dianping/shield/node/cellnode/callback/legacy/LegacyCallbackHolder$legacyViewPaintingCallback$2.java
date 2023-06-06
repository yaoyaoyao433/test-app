package com.dianping.shield.node.cellnode.callback.legacy;

import com.dianping.agentsdk.framework.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyViewPaintingCallback;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LegacyCallbackHolder$legacyViewPaintingCallback$2 extends i implements a<LegacyViewPaintingCallback> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LegacyCallbackHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyCallbackHolder$legacyViewPaintingCallback$2(LegacyCallbackHolder legacyCallbackHolder) {
        super(0);
        this.this$0 = legacyCallbackHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final LegacyViewPaintingCallback invoke() {
        af afVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1643d55d1ba6888462603a88676fb764", RobustBitConfig.DEFAULT_VALUE)) {
            return (LegacyViewPaintingCallback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1643d55d1ba6888462603a88676fb764");
        }
        afVar = this.this$0.sci;
        return new LegacyViewPaintingCallback(afVar);
    }
}
