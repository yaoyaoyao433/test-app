package com.meituan.passport.utils;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ad {
    public static ChangeQuickRedirect a;
    final com.meituan.android.cipstorage.q b;
    public a c;
    public final String d;
    Context e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(String str);
    }

    public ad(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ffda5713baef53784acb8c001aca09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ffda5713baef53784acb8c001aca09");
            return;
        }
        this.e = context;
        this.b = com.meituan.android.cipstorage.q.a(context, "homepage_passport", 2);
        this.d = this.b.b("passpoert_mop_image_key", "");
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9352d6cf6f77a5d5e1a698bd83cc2112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9352d6cf6f77a5d5e1a698bd83cc2112");
        } else if (!TextUtils.isEmpty(this.d)) {
            this.c.a(this.d);
        } else if (z) {
            this.c.a();
        }
    }

    public void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48be3558a1f9ef6cfa73c6497ad44c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48be3558a1f9ef6cfa73c6497ad44c1");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i));
        hashMap.put("message", str);
        ((com.meituan.passport.exception.skyeyemonitor.module.p) com.meituan.passport.exception.skyeyemonitor.a.a().a("outer_mop_operator")).a(hashMap);
    }
}
