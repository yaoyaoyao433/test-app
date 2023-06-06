package com.sankuai.waimai.alita.core.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.a;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b<T extends com.sankuai.waimai.alita.core.base.a> {
    public static ChangeQuickRedirect a;
    public g<String, a<T>> b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.base.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0697b<T> {
        void a(@NonNull T t);
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1fef62fdf38d4580ac34cc3caeb5aaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1fef62fdf38d4580ac34cc3caeb5aaf");
        } else {
            this.b = new g<>();
        }
    }

    @Nullable
    public final T a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d576b1017e792b4cb477a3185a21141e", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d576b1017e792b4cb477a3185a21141e");
        }
        a<T> a2 = this.b.a((g<String, a<T>>) str);
        if (a2 != null) {
            return (T) a2.d;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a<T extends com.sankuai.waimai.alita.core.base.a> extends c<T> {
        public a(@NonNull T t) {
            super(t.b, t);
        }
    }

    public final void a(@Nullable InterfaceC0697b<T> interfaceC0697b) {
        Object[] objArr = {interfaceC0697b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71e9d5d9ce68931ef981627e738ce1eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71e9d5d9ce68931ef981627e738ce1eb");
            return;
        }
        g<String, a<T>> gVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        Iterator<a<T>> it = PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "1629ce8a7e8a7d1d2ce7991e78b64d88", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "1629ce8a7e8a7d1d2ce7991e78b64d88") : gVar.b.iterator();
        while (it.hasNext()) {
            a<T> next = it.next();
            if (next != null) {
                interfaceC0697b.a((com.sankuai.waimai.alita.core.base.a) next.d);
            }
        }
    }
}
