package com.sankuai.waimai.store.poi.list.refactor.generator;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c<T> {
    public static ChangeQuickRedirect b;
    protected android.arch.lifecycle.f c;
    protected FragmentActivity d;

    public c(@NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25f4a82e5dfcc60cda5196aa8f568b5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25f4a82e5dfcc60cda5196aa8f568b5d");
            return;
        }
        this.c = fVar;
        this.d = fragmentActivity;
    }
}
