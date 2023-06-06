package com.sankuai.waimai.store.base.remote;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static ConcurrentMap<String, Object> b = new ConcurrentHashMap(7);

    public static <T> void a(@NonNull String str, @NonNull Class<T> cls, @NonNull AbstractC1141a<T> abstractC1141a) {
        Object[] objArr = {str, cls, abstractC1141a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3616171b1f4a23836a6453172a9c685d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3616171b1f4a23836a6453172a9c685d");
            return;
        }
        String b2 = b(str, cls);
        if (b.put(b2, abstractC1141a) != null) {
            a(b2, 1);
        }
    }

    @Nullable
    public static <T> T a(@NonNull String str, @NonNull Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bb5b2eaf63a50ec52f2c70177c40cb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bb5b2eaf63a50ec52f2c70177c40cb1");
        }
        String b2 = b(str, cls);
        AbstractC1141a abstractC1141a = (AbstractC1141a) b.get(b2);
        if (abstractC1141a == null) {
            a(b2, 0);
            return null;
        }
        return (T) abstractC1141a.a();
    }

    private static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7ef742b80e433ccf7569bcd3d1d2385", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7ef742b80e433ccf7569bcd3d1d2385");
        } else if (i == 0) {
            if (k.a()) {
                throw new RuntimeException("未注册而直接使用 key=【" + str + "】");
            }
            StoreException storeException = StoreException.LazySingletonManager_no_register;
            ah.a(storeException, "未注册而直接使用 key=【" + str + "】");
        } else if (i == 1) {
            if (k.a()) {
                throw new RuntimeException("重复注册 key=【" + str + "】");
            }
            StoreException storeException2 = StoreException.LazySingletonManager_duplicate_register;
            ah.a(storeException2, "重复注册 key=【" + str + "】");
        }
    }

    private static <T> String b(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5953ba77fa06675e49e40c6c1a0fb94", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5953ba77fa06675e49e40c6c1a0fb94");
        }
        return str + CommonConstant.Symbol.UNDERLINE + cls.toString();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.base.remote.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1141a<T> {
        public static ChangeQuickRedirect a;
        private volatile T b;

        public abstract T b();

        public final T a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d775ecccb302793374187796413c1a", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d775ecccb302793374187796413c1a");
            }
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = b();
                    }
                }
            }
            return this.b;
        }
    }
}
