package com.sankuai.eh.plugins.detector;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final a b;
    private final CountDownLatch c;
    private final Bitmap d;
    private final List e;
    private final long f;

    public d(a aVar, CountDownLatch countDownLatch, Bitmap bitmap, List list, long j) {
        this.b = aVar;
        this.c = countDownLatch;
        this.d = bitmap;
        this.e = list;
        this.f = j;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c94facb01f6c6b7b86f9ddb94632ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c94facb01f6c6b7b86f9ddb94632ba");
        } else {
            a.a(this.b, this.c, this.d, this.e, this.f);
        }
    }
}
