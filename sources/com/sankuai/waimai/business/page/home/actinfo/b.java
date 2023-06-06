package com.sankuai.waimai.business.page.home.actinfo;

import android.app.ActivityManager;
import android.arch.lifecycle.d;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.os.Build;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.popup.f;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static long b;
    private static String c;
    private long d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        FailureTypeExistSkipLink,
        FailureTypeNotHomePage,
        FailureTypeRenderFailure,
        FailureTypeAlertModuleListIsNull;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45ecbe5a9b7921ff88c7f4cbfea1b8a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45ecbe5a9b7921ff88c7f4cbfea1b8a5");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36142a3d8d79e22b4d978751e9578035", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36142a3d8d79e22b4d978751e9578035") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "146530d644d382b199b8a2d4464648d5", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "146530d644d382b199b8a2d4464648d5") : (a[]) values().clone();
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424fb430e28b4899b4823c0985daa021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424fb430e28b4899b4823c0985daa021");
        } else {
            this.d = j;
        }
    }

    public static void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf86989c31103cfb4753ec38e4afe0e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf86989c31103cfb4753ec38e4afe0e5");
        } else {
            JudasManualManager.b("b_waimai_b37dvmpg_mv", "c_m84bv26", str).a(com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.mach.utils.b.a().toJson(obj))).a();
        }
    }

    public static void b(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0a3cee1852a680539e7fd43b02fe56f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0a3cee1852a680539e7fd43b02fe56f");
        } else {
            JudasManualManager.a("b_waimai_b37dvmpg_mc", "c_m84bv26", str).a(com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.mach.utils.b.a().toJson(obj))).a();
        }
    }

    public static void c(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e37b11af2da4b26381a9876b3edd9c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e37b11af2da4b26381a9876b3edd9c41");
        } else {
            JudasManualManager.a("b_waimai_k4w38fy8_mc", "c_m84bv26", str).a(com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.mach.utils.b.a().toJson(obj))).a();
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {0, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab81cbb0e02d5636054bc6ebf40bc3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab81cbb0e02d5636054bc6ebf40bc3b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("is_login", Integer.valueOf(z ? 1 : 0));
        hashMap.put("is_new", 0);
        JudasManualManager.b("b_Trk2q").b(hashMap).a("c_m84bv26").a();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dba0deaca8d7d8879ab3f6fa6ce4406e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dba0deaca8d7d8879ab3f6fa6ce4406e");
            return;
        }
        try {
            JudasManualManager.b("b_ng3k2pgg").a("is_suc", z ? 1 : 0).a("c_m84bv26").a();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public static void a(HomePageFragment homePageFragment) {
        Object[] objArr = {homePageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bb9f1fca5d72192cc7fb985b919539f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bb9f1fca5d72192cc7fb985b919539f");
            return;
        }
        b = SystemClock.elapsedRealtime();
        c = null;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        final ActivityManager activityManager = (ActivityManager) homePageFragment.getContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        final HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(homePageFragment).a(HomePageViewModel.class);
        homePageViewModel.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.actinfo.b.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
                if (r13.equals("com.sankuai.waimai.business.address.LocateManuallyActivity") != false) goto L41;
             */
            @Override // android.arch.lifecycle.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ void a(@android.support.annotation.Nullable @org.jetbrains.annotations.Nullable android.arch.lifecycle.d.a r13) {
                /*
                    Method dump skipped, instructions count: 566
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.actinfo.b.AnonymousClass1.a(java.lang.Object):void");
            }
        });
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d191e1722d0a9c13f2ffdb1f9f8b556f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d191e1722d0a9c13f2ffdb1f9f8b556f");
        } else if (c == null) {
            switch (i) {
                case 0:
                    return;
                case 1:
                    c = "tab-eat_what";
                    return;
                case 2:
                    c = "tab-h5";
                    return;
                case 3:
                    c = "tab-order";
                    return;
                case 4:
                    c = "tab-mine";
                    return;
                default:
                    c = "tab-other";
                    return;
            }
        }
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78fbf1d3cc7357b833c5893fac5b4f4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78fbf1d3cc7357b833c5893fac5b4f4a");
        } else if (i <= 0) {
        } else {
            JudasManualManager.b("b_waimai_bo54zdep_mv").a("ad_num", i).a("c_m84bv26").a();
        }
    }

    public static void b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5aa4e9db1be14600cc3fb03192c23a7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5aa4e9db1be14600cc3fb03192c23a7a");
        } else if (i <= 0) {
        } else {
            JudasManualManager.b("b_waimai_nlbei6rn_mv").a("ad_num", i).a("low_priority", z).a("c_m84bv26").a();
        }
    }

    public static void a(int i, a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9a0684ba91cc6d6d24cf9d47849e331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9a0684ba91cc6d6d24cf9d47849e331");
        } else if (i <= 0 || aVar == null) {
        } else {
            JudasManualManager.a a2 = JudasManualManager.b("b_waimai_au77t71r_mv").a("ad_num", i).a("is_supplement_exposure", f.a().b()).a("failure_type", aVar.name());
            if (aVar == a.FailureTypeNotHomePage) {
                a2.a("antigeo_suc_time", SystemClock.elapsedRealtime() - b).a("page_type", c);
            }
            a2.a("c_m84bv26").a();
        }
    }
}
