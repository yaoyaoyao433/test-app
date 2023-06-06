package com.sankuai.waimai.mach.model.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.h;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public LinkedHashMap<String, Long> c;
    private final Object d;
    private long e;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "910a79281c772b58a4729bbb6bf4b1cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "910a79281c772b58a4729bbb6bf4b1cf");
            return;
        }
        this.d = new Object();
        this.c = new LinkedHashMap<>();
        this.b = str;
        this.e = h.a();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e17e9b72acbc9830c4c4b3f698f9cee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e17e9b72acbc9830c4c4b3f698f9cee3");
            return;
        }
        synchronized (this.d) {
            this.c.put(str, Long.valueOf(h.a() - this.e));
        }
    }
}
