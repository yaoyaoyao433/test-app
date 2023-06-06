package com.sankuai.waimai.platform.utils.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> implements com.sankuai.waimai.platform.utils.cache.interfaces.c<T> {
    public static ChangeQuickRedirect b;
    @NonNull
    private final c<T> a;
    @NonNull
    private LinkedList<com.sankuai.waimai.platform.utils.cache.interfaces.b<T>> c;
    private com.sankuai.waimai.platform.utils.cache.interfaces.c<T> d;

    @NonNull
    public abstract com.sankuai.waimai.platform.utils.cache.interfaces.c<T> b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099f47f17a687890c75d8e2cd223f957", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099f47f17a687890c75d8e2cd223f957");
            return;
        }
        this.a = new c<>();
        this.c = new LinkedList<>();
    }

    @NonNull
    private com.sankuai.waimai.platform.utils.cache.interfaces.c<T> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "005c44df30e8d98a72b3580a1c1c15b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.utils.cache.interfaces.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "005c44df30e8d98a72b3580a1c1c15b5");
        }
        if (this.d == null) {
            this.d = b();
        }
        return this.d;
    }

    @Override // com.sankuai.waimai.platform.utils.cache.interfaces.a
    public final void a(@Nullable T t, @Nullable com.sankuai.waimai.platform.utils.cache.interfaces.b<Boolean> bVar) {
        Object[] objArr = {t, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f76c31d6431cd56ceba663aabd67971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f76c31d6431cd56ceba663aabd67971");
            return;
        }
        this.a.a = t;
        a().a(t, bVar);
    }

    @Override // com.sankuai.waimai.platform.utils.cache.interfaces.a
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54538ab72d7b63cd2604d33ca20497c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54538ab72d7b63cd2604d33ca20497c9");
            return;
        }
        this.c.clear();
        a().cancel();
    }

    @Override // com.sankuai.waimai.platform.utils.cache.interfaces.d
    @NonNull
    public final T c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ded09b75e623923f1772086114a7c44", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ded09b75e623923f1772086114a7c44");
        }
        T t = this.a.a;
        if (t == null) {
            T c = a().c();
            this.a.a = c;
            return c;
        }
        return t;
    }
}
