package com.sankuai.waimai.store.shopping.patchwork;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;

    public abstract void a();

    public abstract void a(String str);

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ac8e4b8cac752e5e98f879b47953bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ac8e4b8cac752e5e98f879b47953bb");
        }
    }

    public void a(double d, boolean z, int i) {
        Object[] objArr = {Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98299a151916748111d798fb93d06a33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98299a151916748111d798fb93d06a33");
        } else {
            super.show();
        }
    }
}
