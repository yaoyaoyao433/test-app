package com.sankuai.eh.plugins.detector;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final a b;
    private final Bitmap c;
    private final long d;

    public b(a aVar, Bitmap bitmap, long j) {
        this.b = aVar;
        this.c = bitmap;
        this.d = j;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f63a81eec7b141d11abf5d1209a4ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f63a81eec7b141d11abf5d1209a4ff");
        } else {
            a.a(this.b, this.c, this.d);
        }
    }
}
