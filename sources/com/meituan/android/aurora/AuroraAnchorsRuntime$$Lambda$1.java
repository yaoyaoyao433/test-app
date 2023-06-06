package com.meituan.android.aurora;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class AuroraAnchorsRuntime$$Lambda$1 implements Comparator {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final AuroraAnchorsRuntime$$Lambda$1 instance = new AuroraAnchorsRuntime$$Lambda$1();

    public static Comparator lambdaFactory$() {
        return instance;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93b436d46e424ead62482039177b3d24", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93b436d46e424ead62482039177b3d24")).intValue() : AuroraAnchorsRuntime.lambda$static$2((AuroraTask) obj, (AuroraTask) obj2);
    }
}
