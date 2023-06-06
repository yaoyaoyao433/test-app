package com.sankuai.meituan.navigation.common;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.navigation.common.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class Navigator<D extends c> {
    public static ChangeQuickRedirect b;
    public final CopyOnWriteArrayList<a> c;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface BackStackEffect {
    }

    /* compiled from: ProGuard */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes4.dex */
    public @interface Name {
        String value();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(@NonNull Navigator navigator, @IdRes int i, int i2);
    }

    public void a(@NonNull Bundle bundle) {
    }

    public abstract void a(@NonNull D d, @Nullable Bundle bundle, @Nullable f fVar);

    public abstract boolean a();

    @Nullable
    public Bundle b() {
        return null;
    }

    @NonNull
    public abstract D c();

    public void d() {
    }

    public void e() {
    }

    public Navigator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3434ff521c100384569e2a939d9c34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3434ff521c100384569e2a939d9c34");
        } else {
            this.c = new CopyOnWriteArrayList<>();
        }
    }

    public final void a(@IdRes int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de3135293cd3dff97cf2a1b5f9f5aa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de3135293cd3dff97cf2a1b5f9f5aa1");
            return;
        }
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i, i2);
        }
    }
}
