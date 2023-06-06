package com.sankuai.waimai.bussiness.order.confirm.request.preview;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.confirm.request.preview.a;
import com.sankuai.waimai.foundation.core.service.user.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b implements a.InterfaceC0905a {
    public static ChangeQuickRedirect a;
    protected final Activity b;
    protected final long c;
    protected final String d;
    protected final boolean e;
    protected final int f;
    protected final com.sankuai.waimai.platform.domain.manager.order.a g;
    protected final String h;
    protected final String i;
    protected final a.EnumC0947a j;
    protected final int k;
    protected String l;
    protected String m;
    protected String n;
    protected com.sankuai.waimai.bussiness.order.confirm.extra.a o;
    protected String p;

    public b(Activity activity, @NonNull b.C0904b c0904b, com.sankuai.waimai.platform.domain.manager.order.a aVar) {
        Object[] objArr = {activity, c0904b, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931d20284118906afe33db59a3d09a3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931d20284118906afe33db59a3d09a3e");
            return;
        }
        this.b = activity;
        this.c = c0904b.a;
        this.d = c0904b.b;
        this.e = c0904b.f;
        this.f = c0904b.g;
        this.g = aVar;
        this.h = c0904b.i;
        this.i = c0904b.j;
        this.j = c0904b.k;
        this.k = c0904b.l;
        this.l = c0904b.o;
        this.m = c0904b.p;
        this.n = c0904b.d;
        this.p = c0904b.q;
    }
}
