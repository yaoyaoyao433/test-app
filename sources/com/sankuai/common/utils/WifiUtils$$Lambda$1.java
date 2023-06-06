package com.sankuai.common.utils;

import android.net.wifi.ScanResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class WifiUtils$$Lambda$1 implements Comparator {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final WifiUtils$$Lambda$1 instance = new WifiUtils$$Lambda$1();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55d085516fe9231e3fe3c3ae115b3554", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55d085516fe9231e3fe3c3ae115b3554")).intValue() : WifiUtils.lambda$buildWiFiParams$0((ScanResult) obj, (ScanResult) obj2);
    }
}
