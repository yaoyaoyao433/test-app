package com.meituan.mmp.lib.embeddedwidget;

import com.meituan.mtwebkit.internal.hyper.SameLayerClient;
import com.meituan.mtwebkit.internal.hyper.SameLayerManager;
import com.meituan.mtwebkit.internal.hyper.SameLayerWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements SameLayerManager.a {
    public static ChangeQuickRedirect a;
    public static final String[] b = {"map"};

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerManager.a
    public final SameLayerClient a(SameLayerWidget sameLayerWidget) {
        Object[] objArr = {sameLayerWidget};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8af5f28921196ffa06526cafcb103054", RobustBitConfig.DEFAULT_VALUE)) {
            return (SameLayerClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8af5f28921196ffa06526cafcb103054");
        }
        l a2 = l.a();
        Object[] objArr2 = {sameLayerWidget};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "569ff90158b620fbe9a2b5083b1b0181", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "569ff90158b620fbe9a2b5083b1b0181") : new j(sameLayerWidget);
    }
}
