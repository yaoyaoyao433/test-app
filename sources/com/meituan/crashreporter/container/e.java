package com.meituan.crashreporter.container;

import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends com.meituan.snare.a {
    public static ChangeQuickRedirect a;
    private static e b = new e();

    @Override // com.meituan.snare.a
    public final void a(String str, boolean z, boolean z2) {
    }

    public static e a() {
        return b;
    }

    @Override // com.meituan.snare.a
    public final Map<String, String> a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0a129baa016189d78a41369d1f816c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0a129baa016189d78a41369d1f816c");
        }
        UserActionsProvider.getInstance().logVmSizeImediately();
        String vmSizeInfo = UserActionsProvider.getInstance().getVmSizeInfo();
        HashMap hashMap = new HashMap();
        hashMap.put("vmSizeInfo", vmSizeInfo);
        return hashMap;
    }
}
