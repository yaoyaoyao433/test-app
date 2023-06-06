package com.sankuai.wme.react.x;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public HashMap<String, String> b;
    public HashMap<String, String> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c62013c9454948504ff8e58c39e6b6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c62013c9454948504ff8e58c39e6b6e");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashMap<>();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.wme.react.x.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static class C1369a {
        private static final a a = new a();
    }

    public static final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91fa1ce598f10bb8588b3cc92f629ee6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91fa1ce598f10bb8588b3cc92f629ee6") : C1369a.a;
    }
}
