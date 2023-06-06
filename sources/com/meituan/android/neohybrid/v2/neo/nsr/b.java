package com.meituan.android.neohybrid.v2.neo.nsr;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements c.b {
    public static ChangeQuickRedirect a;
    com.meituan.android.neohybrid.v2.core.a b;
    String c;
    a d;
    private NeoConfig e;
    private boolean f;

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ecbfeb6e2ac333f384242a8918c069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ecbfeb6e2ac333f384242a8918c069");
            return;
        }
        this.d = a.SUCC;
        a(a.SUCC);
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "907a7ea94d6af9aeff30893fefa2b925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "907a7ea94d6af9aeff30893fefa2b925");
            return;
        }
        this.d = a.FETCHED;
        a(a.FETCHED);
        this.b = null;
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void b(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5062bb266864f219554158953d91c8b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5062bb266864f219554158953d91c8b1");
            return;
        }
        this.d = a.FAIL;
        a(a.FAIL);
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void e(String str) {
        this.d = a.DESTROY;
    }

    private void a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801722f8a0d86c8e117a84b3491becbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801722f8a0d86c8e117a84b3491becbd");
            return;
        }
        String[] strArr = new String[2];
        switch (aVar) {
            case READY:
                strArr[0] = "b_pay_neo_nsr_start_mv";
                strArr[1] = "neo_nsr_start";
                break;
            case SUCC:
                strArr[0] = "b_pay_neo_nsr_succ_mv";
                strArr[1] = "neo_nsr_succ";
                break;
            case FETCHED:
                strArr[0] = "b_pay_neo_nsr_fetch_mv";
                strArr[1] = "neo_nsr_fetch";
                break;
            case FAIL:
                strArr[0] = "b_pay_neo_nsr_fail_mv";
                strArr[1] = "neo_nsr_fail";
                break;
        }
        if (this.b == null || this.e == null || TextUtils.isEmpty(strArr[0]) || TextUtils.isEmpty(strArr[1])) {
            return;
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, strArr[0], "c_pay_7c9fc4b4", null, com.meituan.android.neohybrid.neo.report.a.c("url", this.c).a("flag", this.f ? "idle" : "normal").b);
        com.meituan.android.neohybrid.v2.neo.report.a.c(this.b, strArr[1], null);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        READY,
        RENDER,
        SUCC,
        FAIL,
        DESTROY,
        FETCHED;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c6e1c02a45a7fce5400202051f2174", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c6e1c02a45a7fce5400202051f2174");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20f07a344100e6344236b93819fab89a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20f07a344100e6344236b93819fab89a") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "164338346ccc85891c607a98514029cf", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "164338346ccc85891c607a98514029cf") : (a[]) values().clone();
        }
    }
}
