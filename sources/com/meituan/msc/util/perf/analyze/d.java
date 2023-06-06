package com.meituan.msc.util.perf.analyze;

import com.meituan.msc.util.perf.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static a a(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8f2ae9db68d482b803f966a4952658c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8f2ae9db68d482b803f966a4952658c") : new a() { // from class: com.meituan.msc.util.perf.analyze.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.e
            public final /* synthetic */ boolean a(l lVar) {
                l lVar2 = lVar;
                Object[] objArr2 = {lVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c94379d81dc47f6a7f2e7e005d0c2a4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c94379d81dc47f6a7f2e7e005d0c2a4")).booleanValue() : lVar2.b.g >= j;
            }
        };
    }
}
