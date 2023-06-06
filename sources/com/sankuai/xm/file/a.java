package com.sankuai.xm.file;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.file.transfer.b;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public AtomicBoolean b;
    public b c;
    public com.sankuai.xm.file.proxy.a d;
    public String e;
    public Context f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.file.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1381a {
        public static final a a = new a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b5336ccd0567f77c69ca250c257510", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b5336ccd0567f77c69ca250c257510");
            return;
        }
        this.b = new AtomicBoolean(false);
        this.c = new b();
        this.d = new com.sankuai.xm.file.proxy.a();
        this.e = null;
        this.f = null;
    }
}
