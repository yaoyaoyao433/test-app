package com.meituan.android.cashier.common;

import android.support.v4.app.FragmentActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ICashier extends h, v, com.meituan.android.paybase.retrofit.b {
    <T extends FragmentActivity & i & com.meituan.android.paybase.retrofit.b> a a(T t, CashierParams cashierParams);

    PayBaseActivity.a a(int i);

    void b(String str, Map<String, Object> map);

    String i();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public boolean b;
        String c;
        String d;

        public a(boolean z, String str, String str2) {
            Object[] objArr = {(byte) 0, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76bdb6fd64d5903aa822e21f7137d818", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76bdb6fd64d5903aa822e21f7137d818");
                return;
            }
            com.meituan.android.neohybrid.util.f.a("ICashier_ConsumeResult:consume=false;errorCode=" + str + ";errorReason=" + str2);
            this.b = false;
            this.c = str;
            this.d = str2;
        }

        public a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35917c83025fc06a56305aab384315f2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35917c83025fc06a56305aab384315f2");
            } else {
                this.b = z;
            }
        }
    }
}
