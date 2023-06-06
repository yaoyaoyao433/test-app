package com.meituan.passport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import rx.d;
/* loaded from: classes3.dex */
public final /* synthetic */ class aj implements d.a {
    public static ChangeQuickRedirect a;
    private final UserCenter b;
    private final WeakReference c;

    public aj(UserCenter userCenter, WeakReference weakReference) {
        this.b = userCenter;
        this.c = weakReference;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db8e662c6faa2e8fcf63254a7bcf5057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db8e662c6faa2e8fcf63254a7bcf5057");
        } else {
            UserCenter.lambda$userObservable$1(this.b, this.c, (rx.j) obj);
        }
    }
}
