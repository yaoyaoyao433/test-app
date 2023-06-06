package com.sankuai.waimai.store.goods.list.mach.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.store.goods.list.delegate.d;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;
    protected BaseActivity b;
    protected String c;
    private d e;

    public a(d dVar, BaseActivity baseActivity, String str) {
        Object[] objArr = {dVar, baseActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8d2243f4b1467536934bcd91a5f607", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8d2243f4b1467536934bcd91a5f607");
            return;
        }
        this.e = dVar;
        this.b = baseActivity;
        this.c = str;
    }

    @Override // com.sankuai.waimai.store.goods.list.mach.event.c
    public final List a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53c236edcb09a925467a29155620b52", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53c236edcb09a925467a29155620b52") : Arrays.asList("goods_detail_sku_dialog", "goods_detail_cycleBuy_product_dialog", "goods_detail_preSale_product_dialog", "refresh_native_coupon_event");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r21.equals("goods_detail_preSale_product_dialog") == false) goto L62;
     */
    @Override // com.sankuai.waimai.store.goods.list.mach.event.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull @org.jetbrains.annotations.NotNull java.lang.String r21, @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable final java.util.Map<java.lang.String, java.lang.Object> r22) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.mach.event.a.a(java.lang.String, java.util.Map):void");
    }
}
