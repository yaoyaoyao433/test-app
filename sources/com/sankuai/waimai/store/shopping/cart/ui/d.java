package com.sankuai.waimai.store.shopping.cart.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect c;

    public void a() {
    }

    public void b() {
    }

    public d(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7e724a42ad6febc0d8c7abf7d23407", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7e724a42ad6febc0d8c7abf7d23407");
        }
    }
}
