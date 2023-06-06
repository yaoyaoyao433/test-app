package com.sankuai.waimai.business.restaurant.framework.backpress;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    private CopyOnWriteArrayList<com.airbnb.lottie.a> b;

    @MainThread
    public abstract boolean b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c40263e5e7bc87b355bd83102430fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c40263e5e7bc87b355bd83102430fa");
        } else {
            this.b = new CopyOnWriteArrayList<>();
        }
    }

    @MainThread
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960e651fac6619bbee5e5c9a60258a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960e651fac6619bbee5e5c9a60258a16");
            return;
        }
        Iterator<com.airbnb.lottie.a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public final void a(@NonNull com.airbnb.lottie.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe32a49fe5db657bef357990dfee3c52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe32a49fe5db657bef357990dfee3c52");
        } else {
            this.b.add(aVar);
        }
    }

    public final void b(@NonNull com.airbnb.lottie.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f199b8d931f707403971624d2593fe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f199b8d931f707403971624d2593fe9");
        } else {
            this.b.remove(aVar);
        }
    }
}
