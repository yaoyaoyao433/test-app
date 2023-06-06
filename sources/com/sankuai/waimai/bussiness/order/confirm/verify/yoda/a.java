package com.sankuai.waimai.bussiness.order.confirm.verify.yoda;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.yoda.YodaConfirm;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final int b;
    final String c;
    final int d;
    final String e;
    @Nullable
    public YodaConfirm f;
    b g;
    String h;
    String i;
    private final String j;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    interface InterfaceC0907a {
        void a();

        void a(@NonNull String str);

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    interface b {
        void a();

        void b();

        void c();
    }

    public a(int i, String str, String str2, int i2, String str3) {
        Object[] objArr = {Integer.valueOf(i), str, str2, Integer.valueOf(i2), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ff4c4c1e5213723bcbe8e0692d1477", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ff4c4c1e5213723bcbe8e0692d1477");
            return;
        }
        this.b = i;
        this.j = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
    }
}
