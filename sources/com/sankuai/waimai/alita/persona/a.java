package com.sankuai.waimai.alita.persona;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements com.sankuai.waimai.alita.base.c<String> {
    public static ChangeQuickRedirect g;
    protected e h;

    public abstract String a();

    @NonNull
    public abstract String b();

    public abstract void b(e eVar);

    @NonNull
    public abstract String c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    @Override // com.sankuai.waimai.alita.base.c
    public final /* synthetic */ boolean a(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec780b2ae65d436b44aa421987ec34f6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec780b2ae65d436b44aa421987ec34f6")).booleanValue() : a().equals(str2);
    }

    public void a(e eVar) {
        if (this.h == null) {
            this.h = eVar;
        }
    }
}
