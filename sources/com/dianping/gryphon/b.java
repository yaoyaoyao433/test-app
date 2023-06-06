package com.dianping.gryphon;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum b {
    DEFAULT("default", 15, Integer.MAX_VALUE, 0, 0),
    JS_RESOURCE("js_resource", Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0);
    
    public static ChangeQuickRedirect a;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc3e1135c5d18fc3381c772bae831a2a", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc3e1135c5d18fc3381c772bae831a2a") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66ffb3076ee745e79b26aff33553225f", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66ffb3076ee745e79b26aff33553225f") : (b[]) values().clone();
    }

    b(String str, int i, int i2, int i3, int i4) {
        Object[] objArr = {r9, Integer.valueOf(r10), str, Integer.valueOf(i), Integer.MAX_VALUE, 0, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e50891fceae931826151c19721e4559", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e50891fceae931826151c19721e4559");
            return;
        }
        this.f = str;
        this.i = i != Integer.MAX_VALUE;
        this.j = false;
        this.d = i;
        this.e = -1048576;
        this.g = 0;
        this.h = 0;
    }
}
