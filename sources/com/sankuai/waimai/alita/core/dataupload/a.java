package com.sankuai.waimai.alita.core.dataupload;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a<K, V> {
    public static ChangeQuickRedirect a;
    private Map<K, V> b;

    @Nullable
    public final V a(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "192e84ce6a78168fbc3116d287a4222d", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "192e84ce6a78168fbc3116d287a4222d") : a().get(k);
    }

    public final void a(@NonNull K k, @Nullable V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2721ce398c1d922f45c08e8fe0230dba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2721ce398c1d922f45c08e8fe0230dba");
        } else {
            a().put(k, v);
        }
    }

    @NonNull
    public Map<K, V> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04fd84079d4e86b63dfd67ee630f23cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04fd84079d4e86b63dfd67ee630f23cf");
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        return this.b;
    }
}
