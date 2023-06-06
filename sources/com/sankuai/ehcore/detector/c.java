package com.sankuai.ehcore.detector;

import android.graphics.Bitmap;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final a b;
    private final Bitmap c;
    private final JsonArray d;
    private final List e;
    private final CountDownLatch f;

    public c(a aVar, Bitmap bitmap, JsonArray jsonArray, List list, CountDownLatch countDownLatch) {
        this.b = aVar;
        this.c = bitmap;
        this.d = jsonArray;
        this.e = list;
        this.f = countDownLatch;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c46a44af80bf9a711326e9f9dbe1b29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c46a44af80bf9a711326e9f9dbe1b29");
        } else {
            a.a(this.b, this.c, this.d, this.e, this.f);
        }
    }
}
