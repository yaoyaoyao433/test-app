package com.meituan.android.legwork.mrn.bridge;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements com.meituan.android.privacy.interfaces.d {
    public static ChangeQuickRedirect a;
    private final LocationBridgeModule b;
    private final Promise c;
    private final String d;
    private final Context e;
    private final String f;

    public k(LocationBridgeModule locationBridgeModule, Promise promise, String str, Context context, String str2) {
        this.b = locationBridgeModule;
        this.c = promise;
        this.d = str;
        this.e = context;
        this.f = str2;
    }

    @Override // com.meituan.android.privacy.interfaces.d
    public final void onResult(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9902c5fd0340337968b45881be7284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9902c5fd0340337968b45881be7284");
        } else {
            LocationBridgeModule.lambda$requestActualLocation$39(this.b, this.c, this.d, this.e, this.f, str, i);
        }
    }
}
