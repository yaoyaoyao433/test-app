package com.sankuai.waimai.router.common;

import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.router.core.f {
    public static ChangeQuickRedirect a;
    public final e b;
    public final h c;
    private final com.sankuai.waimai.router.regex.a j;

    public a(Context context, @Nullable String str, @Nullable String str2) {
        super(context);
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5a28111efe15d117036e89c349b2aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5a28111efe15d117036e89c349b2aa");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.b = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ea8a97d0c0f45a868fdf1da72c2ca26", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ea8a97d0c0f45a868fdf1da72c2ca26") : new e();
        Object[] objArr3 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        this.c = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c002c321f79ab901ff65639f7b1aa5fa", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c002c321f79ab901ff65639f7b1aa5fa") : new h(str, str2);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        this.j = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "670d62514a9d0542448ca17fbe92fbd3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.router.regex.a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "670d62514a9d0542448ca17fbe92fbd3") : new com.sankuai.waimai.router.regex.a();
        a(this.b, 300);
        a(this.c, 200);
        a(this.j, 100);
        a(new g(), -100);
        this.g = com.sankuai.waimai.router.components.g.c;
    }
}
