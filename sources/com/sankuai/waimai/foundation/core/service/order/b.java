package com.sankuai.waimai.foundation.core.service.order;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public Context a;
    public String b;
    public long d;
    public String f;
    public String c = "0";
    public String e = "";

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public b b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4714ff99c7a021ae3e0b04ad87b52cce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4714ff99c7a021ae3e0b04ad87b52cce");
            } else {
                this.b = new b();
            }
        }
    }
}
