package com.sankuai.waimai.alita.core.base;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.f;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g<K, T extends f<K>> {
    public static ChangeQuickRedirect a;
    public List<T> b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73bf70f32b23d867261218bde00e30bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73bf70f32b23d867261218bde00e30bc");
        } else {
            this.b = new CopyOnWriteArrayList();
        }
    }

    public final void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7687c3125268732c01d539b075922788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7687c3125268732c01d539b075922788");
        } else if (this.b.contains(t)) {
        } else {
            this.b.add(0, t);
        }
    }

    @Nullable
    public final T a(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60be66f4d9b4955c704682888532ce18", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60be66f4d9b4955c704682888532ce18");
        }
        for (T t : this.b) {
            if (t != null && t.a(k)) {
                return t;
            }
        }
        return null;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667591f68001778fa97a29fe1f0b8dfa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667591f68001778fa97a29fe1f0b8dfa");
        }
        return "RegisterManager{mList=" + this.b + '}';
    }
}
