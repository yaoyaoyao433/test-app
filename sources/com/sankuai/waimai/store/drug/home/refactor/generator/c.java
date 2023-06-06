package com.sankuai.waimai.store.drug.home.refactor.generator;

import android.arch.lifecycle.f;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c<T> {
    public static ChangeQuickRedirect b;
    public f c;
    public FragmentActivity d;

    public c(@NonNull f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53b314a7216423ec5f1fcf94deb910ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53b314a7216423ec5f1fcf94deb910ee");
            return;
        }
        this.c = fVar;
        this.d = fragmentActivity;
    }
}
