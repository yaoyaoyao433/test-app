package com.meituan.android.paycommon.lib.utils;

import android.text.TextUtils;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.af;
import com.meituan.android.paycommon.lib.model.bean.MemberIdBean;
import com.meituan.android.paycommon.lib.retrofit.PayCommonRequestService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class s {
    public static ChangeQuickRedirect a;
    private static s c;
    String b;
    private a d;

    public s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1071082cfe848145a7ed9b349569e9cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1071082cfe848145a7ed9b349569e9cd");
            return;
        }
        this.b = null;
        this.d = new a();
    }

    public static synchronized s a() {
        synchronized (s.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "326f3606e8c9e024b4a7d888e519b7b8", RobustBitConfig.DEFAULT_VALUE)) {
                return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "326f3606e8c9e024b4a7d888e519b7b8");
            }
            if (c == null) {
                c = new s();
            }
            return c;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "064805a6cc9f82c3ffd445155402e87f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "064805a6cc9f82c3ffd445155402e87f");
        } else if (com.meituan.android.paycommon.lib.config.a.a().s() == null || TextUtils.isEmpty(com.meituan.android.paycommon.lib.config.a.a().s().a()) || !e()) {
        } else {
            o.a("c_u12ampvb", "b_pay_pdl9jm9s_mc", null);
            ((PayCommonRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayCommonRequestService.class, this.d, 1)).getMemberId(com.meituan.android.paycommon.lib.config.a.a().s().a());
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70913ac2282f1bb2ddf7217b9fc7b3bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70913ac2282f1bb2ddf7217b9fc7b3bb");
            return;
        }
        af.a(com.meituan.android.paybase.config.a.d().a(), "time_store_name").b("time_key");
        com.meituan.android.paybase.set.a.b();
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e915a51b45af7de632bdbe80e53474", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e915a51b45af7de632bdbe80e53474")).booleanValue();
        }
        return d() - af.a(com.meituan.android.paybase.config.a.d().a(), "time_store_name").b("time_key", 0L) >= f();
    }

    private long f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83f1e490e108b38b8ca206ba2365e6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83f1e490e108b38b8ca206ba2365e6b")).longValue();
        }
        if (TextUtils.isEmpty(this.b) || !a(this.b)) {
            return 604800L;
        }
        return Long.parseLong(this.b);
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcdf04f13e194ba0ffd9ba682e2f3b43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcdf04f13e194ba0ffd9ba682e2f3b43")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0dca5fe8b57ff827410da533a4d2b21", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0dca5fe8b57ff827410da533a4d2b21")).longValue() : System.currentTimeMillis() / 1000;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements com.meituan.android.paybase.retrofit.b {
        public static ChangeQuickRedirect a;
        private String c;

        @Override // com.meituan.android.paybase.retrofit.b
        public final void onRequestFinal(int i) {
        }

        private a() {
            Object[] objArr = {s.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "234f4e70e9ba7480a8014c2e3b847b2a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "234f4e70e9ba7480a8014c2e3b847b2a");
            } else {
                this.c = null;
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public final void onRequestSucc(int i, Object obj) {
            Object[] objArr = {Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a197a7a15cb4cc8e0a11a8d5e4f470bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a197a7a15cb4cc8e0a11a8d5e4f470bc");
                return;
            }
            this.c = ((MemberIdBean) obj).getMemberId();
            if (TextUtils.isEmpty(this.c)) {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_30tofyhm_mc", new a.c().a("new", this.c).a("old", com.meituan.android.paybase.set.a.a()).b);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_userset_download_memberID", -9753);
                return;
            }
            if (TextUtils.equals(com.meituan.android.paybase.set.a.a(), this.c)) {
                o.a("c_u12ampvb", "b_pay_ui04v5fu_mc", new a.c().a("new", this.c).a("old", com.meituan.android.paybase.set.a.a()).b);
            } else {
                if (TextUtils.isEmpty(com.meituan.android.paybase.set.a.a())) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_zr299b5l_mc", new a.c().a("new", this.c).b);
                } else {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_pnk2otog_mc", new a.c().a("new", this.c).a("old", com.meituan.android.paybase.set.a.a()).b);
                }
                com.meituan.android.paybase.set.a.a(this.c);
            }
            s sVar = s.this;
            long d = s.this.d();
            Object[] objArr2 = {new Long(d)};
            ChangeQuickRedirect changeQuickRedirect2 = s.a;
            if (PatchProxy.isSupport(objArr2, sVar, changeQuickRedirect2, false, "a6a88b3941441fa935f6576ca647f106", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, sVar, changeQuickRedirect2, false, "a6a88b3941441fa935f6576ca647f106");
            } else {
                af.a(com.meituan.android.paybase.config.a.d().a(), "time_store_name").a("time_key", d);
            }
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_userset_download_memberID", 200);
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public final void onRequestException(int i, Exception exc) {
            Object[] objArr = {Integer.valueOf(i), exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305a67ff30728582591df2984fc8a32a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305a67ff30728582591df2984fc8a32a");
                return;
            }
            com.meituan.android.paybase.common.analyse.a.a("b_pay_5hlix4rq_mc", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_userset_download_memberID", -9753);
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public final void onRequestStart(int i) {
            this.c = null;
        }
    }
}
