package com.sankuai.eh.component.service.env;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b {
    public static ChangeQuickRedirect b;
    protected Map<String, String> c;
    protected a d;
    public a.InterfaceC0637a e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        String a(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbdc87789825116c8f8145c64e9b8efe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbdc87789825116c8f8145c64e9b8efe");
        } else {
            this.c = new HashMap();
        }
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec51a536183ee0a3e1451a0b1c2718dc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec51a536183ee0a3e1451a0b1c2718dc") : f.c();
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eb96a60a3d053bfce42d7ff2acc7613", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eb96a60a3d053bfce42d7ff2acc7613") : f.d();
    }

    public final Map<String, String> j() {
        return this.c;
    }

    public final a k() {
        return this.d;
    }

    public final void a(a aVar) {
        this.d = aVar;
    }
}
