package com.meituan.android.recce.shark;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    public WeakReference<n> b;
    public String c;
    public Map<String, String> d;
    public Map<String, String> e;
    public Map<String, Object> f;
    public JsonElement g;

    public r() {
    }

    public n a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5a4e8c733356e03048e4fb6d9750a33", RobustBitConfig.DEFAULT_VALUE)) {
            return (n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5a4e8c733356e03048e4fb6d9750a33");
        }
        if (this.b != null) {
            return this.b.get();
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public r b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e687e6b8bd2232f2bd260d60ea65bb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e687e6b8bd2232f2bd260d60ea65bb");
            } else {
                this.b = new r();
            }
        }
    }
}
