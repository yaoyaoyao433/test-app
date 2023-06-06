package com.sankuai.waimai.touchmatrix.monitor;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    String b;
    public long c;
    public Map<String, Long> d;

    public h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae58e1909c898b36803bbd3614ebeb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae58e1909c898b36803bbd3614ebeb3");
            return;
        }
        this.d = new ConcurrentSkipListMap();
        this.b = str;
        this.c = SystemClock.elapsedRealtime();
    }
}
