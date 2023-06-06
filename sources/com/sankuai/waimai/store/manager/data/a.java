package com.sankuai.waimai.store.manager.data;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Map<String, Object> b = new HashMap();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.manager.data.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1223a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91bd69eee2db8891e3458a4ec00c9b23", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91bd69eee2db8891e3458a4ec00c9b23") : C1223a.a;
    }

    public final void a(@NonNull String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c410024070e85af71191c390839f003", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c410024070e85af71191c390839f003");
            return;
        }
        b.clear();
        b.put(str, obj);
    }

    public final <T> T a(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a67118783b188c98eca2d3a7c0f2f02", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a67118783b188c98eca2d3a7c0f2f02");
        }
        T t = (T) b.get(str);
        if (t == null) {
            return null;
        }
        b.clear();
        if (cls.isInstance(t)) {
            return t;
        }
        com.sankuai.waimai.store.base.log.a.a("data is not class:" + cls.getSimpleName());
        return null;
    }
}
