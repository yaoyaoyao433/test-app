package com.sankuai.waimai.business.page.home.list.future.user_prefer_collect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.list.future.complex.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public f c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "257bdec50ee10ba51229fe75a785c678", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "257bdec50ee10ba51229fe75a785c678");
        } else {
            this.b = 0;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb77a0931bea4b276879e4c549645cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb77a0931bea4b276879e4c549645cfe");
        } else {
            this.b++;
        }
    }

    public final int b() {
        if (this.b < 0) {
            this.b = 0;
        }
        return this.b;
    }

    public final void c() {
        this.c.e = -1;
        this.b = 0;
    }
}
