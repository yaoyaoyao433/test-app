package com.sankuai.shangou.stone.whiteboard;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Map<String, Object> b;
    private Map<Class, Map<String, Object>> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "544358a60d9384fcc6ca57808f80c77a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "544358a60d9384fcc6ca57808f80c77a");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9882d59efdf0e4bee2d42e92c42c8658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9882d59efdf0e4bee2d42e92c42c8658");
        } else {
            this.b.put(str, obj);
        }
    }
}
