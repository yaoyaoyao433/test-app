package com.meituan.mmp.lib.api.input.textarea;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public int b;
    public HashMap<String, Integer> c;
    public HashMap<String, Integer> d;
    @Deprecated
    public boolean e;

    public f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f9ea97304906270f287d25d203aa8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f9ea97304906270f287d25d203aa8f");
            return;
        }
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        this.e = false;
        this.b = i;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e952d4cc0b0d343812cfc6b3193484b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e952d4cc0b0d343812cfc6b3193484b");
            return;
        }
        Iterator<Map.Entry<String, Integer>> it = this.d.entrySet().iterator();
        Iterator<Map.Entry<String, Integer>> it2 = this.c.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<String, Integer> next = it.next();
            Map.Entry<String, Integer> next2 = it2.next();
            if (next.getValue().intValue() > i) {
                next.setValue(Integer.valueOf(next.getValue().intValue() + i2));
                next2.setValue(Integer.valueOf(next2.getValue().intValue() + i2));
            } else {
                next.getValue().intValue();
            }
        }
    }
}
