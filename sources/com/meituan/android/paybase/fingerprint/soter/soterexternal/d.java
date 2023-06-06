package com.meituan.android.paybase.fingerprint.soter.soterexternal;

import android.content.Context;
import com.meituan.android.paybase.utils.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements a {
    public static ChangeQuickRedirect a;
    private c b;
    private String c;

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa40211ad276a1c245d0d7cc3afbabf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa40211ad276a1c245d0d7cc3afbabf7");
            return;
        }
        this.c = str;
        this.b = new c(0, str);
    }

    @Override // com.meituan.android.paybase.fingerprint.soter.soterexternal.a
    public final c a(Context context) {
        int i;
        int i2 = 1;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bce6d1b61b7d5e42b85eb3b8e573fad7", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bce6d1b61b7d5e42b85eb3b8e573fad7");
        }
        if (com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.d()) {
            i = 0;
        } else if (com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.b() == 0) {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b31edd0bd00ccefa37b85a830a7519a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b31edd0bd00ccefa37b85a830a7519a2");
            } else if (context != null) {
                af.a(context, "jinrong_sdk_data_set").a(com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.b, false);
            }
            i = 32;
        } else {
            i = 1;
        }
        String a2 = com.meituan.android.paybase.fingerprint.soter.b.a().a(this.c);
        com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(a2, false);
        if (com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(a2) == 0) {
            Object[] objArr3 = {context, a2};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "85ad2dc5af786892d70ad37d108e875e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "85ad2dc5af786892d70ad37d108e875e");
            } else if (context != null) {
                af.a(context, "jinrong_sdk_data_set").a(a2, false);
            }
            i2 = i | 64;
        }
        this.b.b = i2;
        return this.b;
    }
}
