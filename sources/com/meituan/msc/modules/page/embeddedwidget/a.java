package com.meituan.msc.modules.page.embeddedwidget;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3519608ed9c4bb11a2904af658ccb3d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (SameLayerClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3519608ed9c4bb11a2904af658ccb3d6");
        }
        l a2 = l.a();
        Object[] objArr2 = {sameLayerWidget};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "24dc5ff5979dcfb015eff4696e467f0d", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "24dc5ff5979dcfb015eff4696e467f0d") : new j(sameLayerWidget);
    }
}
