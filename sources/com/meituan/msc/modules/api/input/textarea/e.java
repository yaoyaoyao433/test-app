package com.meituan.msc.modules.api.input.textarea;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public int b;
    public HashMap<String, Integer> c;
    public HashMap<String, Integer> d;
    @Deprecated
    public boolean e;

    public e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b5dad654a9707500aec10b06602176", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b5dad654a9707500aec10b06602176");
            return;
        }
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        this.e = false;
        this.b = i;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3cb47f42978f000c6759a46d03311eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3cb47f42978f000c6759a46d03311eb");
            return;
        }
        this.c.clear();
        this.d.clear();
        this.e = false;
    }
}
