package com.meituan.passport.handler.resume;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b<T> extends com.meituan.passport.handler.a<b<T>> {
    public static ChangeQuickRedirect c;
    WeakReference<FragmentActivity> d;

    public abstract rx.d<T> a(ApiException apiException, FragmentActivity fragmentActivity);

    public b(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "535b66608a7e64c973f876ab94f2db4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "535b66608a7e64c973f876ab94f2db4b");
        } else {
            this.d = new WeakReference<>(fragmentActivity);
        }
    }

    public final rx.d<T> a(rx.d<T> dVar) {
        b<T> bVar = this;
        while (true) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "74038eebc2d87ced8a423065ba23652d", RobustBitConfig.DEFAULT_VALUE)) {
                return (rx.d) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "74038eebc2d87ced8a423065ba23652d");
            }
            dVar = dVar.e(c.a(bVar));
            if (((b) bVar.a) == null) {
                return dVar;
            }
            bVar = (b) bVar.a;
        }
    }
}
