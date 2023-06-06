package com.meituan.android.recce.views.base.rn;

import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.ar;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class RecceUIManagerModule$$Lambda$1 implements ar {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int arg$1;
    private final boolean[] arg$2;
    private final BinReader arg$3;

    public RecceUIManagerModule$$Lambda$1(int i, boolean[] zArr, BinReader binReader) {
        this.arg$1 = i;
        this.arg$2 = zArr;
        this.arg$3 = binReader;
    }

    public static ar lambdaFactory$(int i, boolean[] zArr, BinReader binReader) {
        Object[] objArr = {Integer.valueOf(i), zArr, binReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9842fbc707f6562d123a93ae5f64b98a", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9842fbc707f6562d123a93ae5f64b98a") : new RecceUIManagerModule$$Lambda$1(i, zArr, binReader);
    }

    @Override // com.facebook.react.uimanager.ar
    public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        Object[] objArr = {nativeViewHierarchyManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33e49e60b0714f060c3d52edbebbac44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33e49e60b0714f060c3d52edbebbac44");
        } else {
            RecceUIManagerModule.lambda$recceUpdateViewsOnUIBlockWithProps$0(this.arg$1, this.arg$2, this.arg$3, nativeViewHierarchyManager);
        }
    }
}
