package com.dianping.shield.node.cellnode.callback.legacy;

import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.n;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyLoadingPaintingCallback;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LegacyCallbackHolder$legacyLoadingPaintingCallback$2 extends i implements a<LegacyLoadingPaintingCallback> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LegacyCallbackHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyCallbackHolder$legacyLoadingPaintingCallback$2(LegacyCallbackHolder legacyCallbackHolder) {
        super(0);
        this.this$0 = legacyCallbackHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @Nullable
    public final LegacyLoadingPaintingCallback invoke() {
        af afVar;
        af afVar2;
        LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6621ee775af534ab3266e451b75725aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (LegacyLoadingPaintingCallback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6621ee775af534ab3266e451b75725aa");
        }
        afVar = this.this$0.sci;
        if (afVar instanceof n) {
            afVar2 = this.this$0.sci;
            loadingAndLoadingMoreCreator = this.this$0.creator;
            return new LegacyLoadingPaintingCallback((n) afVar2, loadingAndLoadingMoreCreator);
        }
        return null;
    }
}
