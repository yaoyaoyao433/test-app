package com.sankuai.waimai.bussiness.order.base.pay;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.f;
import com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements OrderPayResultManager.a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final boolean c;
    private final List d;
    private final f e;
    private final Activity f;
    private final String g;
    private final boolean h;

    public a(String str, boolean z, List list, f fVar, Activity activity, String str2, boolean z2) {
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = fVar;
        this.f = activity;
        this.g = str2;
        this.h = z2;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6480bd7025ea40af4d4dd4233a01c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6480bd7025ea40af4d4dd4233a01c9");
        } else {
            OrderPayResultManager.lambda$handleResult$0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, str);
        }
    }
}
