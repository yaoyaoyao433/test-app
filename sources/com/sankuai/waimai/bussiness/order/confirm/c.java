package com.sankuai.waimai.bussiness.order.confirm;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private Map<String, Object> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        private static final c a = new c();
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480377afb448937888658b59584354ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480377afb448937888658b59584354ce");
        } else {
            this.b = new HashMap();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "121417cacaf51be4d3f9d4cfdde1ccb3", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "121417cacaf51be4d3f9d4cfdde1ccb3") : a.a;
    }

    public final void a(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5942f6f5607f79b9bf7e96faacc46e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5942f6f5607f79b9bf7e96faacc46e5b");
        } else if (obj == null) {
        } else {
            this.b.put(obj.getClass().getName(), obj);
        }
    }

    @Nullable
    public final Object a(@Nullable Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a3f16177ca2bbf1e5a2795ccbf22c3", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a3f16177ca2bbf1e5a2795ccbf22c3") : this.b.get(cls.getName());
    }

    public final void b(@Nullable Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "647db721896d9a50d9835d675b1f4c85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "647db721896d9a50d9835d675b1f4c85");
        } else {
            this.b.remove(cls.getName());
        }
    }
}
