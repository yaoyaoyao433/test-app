package com.meituan.android.legwork.net.subscriber;

import android.support.constraint.R;
import com.meituan.android.legwork.net.response.BaseEntity;
import com.meituan.android.legwork.net.response.a;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a<T> extends j<BaseEntity<T>> {
    public static ChangeQuickRedirect h;
    private final int a;

    public abstract void a(T t);

    public abstract void a(boolean z, int i, String str);

    @Override // rx.e
    public void onCompleted() {
    }

    @Override // rx.e
    public /* synthetic */ void onNext(Object obj) {
        BaseEntity baseEntity = (BaseEntity) obj;
        Object[] objArr = {baseEntity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a851953196934f3230fc8fd2dee2f660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a851953196934f3230fc8fd2dee2f660");
        } else if (baseEntity.code == 0) {
            a(baseEntity.data);
        } else {
            Object[] objArr2 = {baseEntity};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ad7c9472c0c627ea6e9b81d42fe0cd1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ad7c9472c0c627ea6e9b81d42fe0cd1");
                return;
            }
            a.C0271a.a.a(baseEntity.code, baseEntity.message);
            a(false, baseEntity.code, baseEntity.message);
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a766a227bba8085f9c6b2be365f04bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a766a227bba8085f9c6b2be365f04bb");
        } else {
            this.a = 0;
        }
    }

    @Override // rx.e
    public void onError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40bad151312f52206524c162d45d0753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40bad151312f52206524c162d45d0753");
            return;
        }
        x.e("BaseSubscriber.onError()", "exception msg:", th);
        a(true, -1, com.meituan.android.legwork.a.a().getString(R.string.legwork_network_connection_failed));
    }
}
