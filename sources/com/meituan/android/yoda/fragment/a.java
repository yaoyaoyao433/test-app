package com.meituan.android.yoda.fragment;

import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final BaseFragment b;
    private final String c;
    private final Error d;

    private a(BaseFragment baseFragment, String str, Error error) {
        this.b = baseFragment;
        this.c = str;
        this.d = error;
    }

    public static Runnable a(BaseFragment baseFragment, String str, Error error) {
        Object[] objArr = {baseFragment, str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb8808dd3821d58a4c0b1ac139e9b4b6", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb8808dd3821d58a4c0b1ac139e9b4b6") : new a(baseFragment, str, error);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489480a4df01b6c47cb5b01888e80cd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489480a4df01b6c47cb5b01888e80cd9");
        } else {
            BaseFragment.a(this.b, this.c, this.d);
        }
    }
}
