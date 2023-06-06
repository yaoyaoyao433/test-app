package com.meituan.android.yoda.callbacks;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.interfaces.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b {
    public static ChangeQuickRedirect a;
    protected h<YodaResult> b;
    private Context c;
    private WeakReference<FragmentActivity> d;

    public b(FragmentActivity fragmentActivity, h<YodaResult> hVar) {
        Object[] objArr = {fragmentActivity, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e394b8e8c213243ee494727f5b8bda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e394b8e8c213243ee494727f5b8bda");
            return;
        }
        this.d = null;
        if (fragmentActivity != null) {
            this.c = fragmentActivity.getApplicationContext();
            this.d = new WeakReference<>(fragmentActivity);
        }
        this.b = hVar;
    }
}
