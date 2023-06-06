package com.meituan.android.common.mtguard.collect;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPManager;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.store.DfpSharedPref;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class e {
    private static final String A = "mtguard-report-funcs";
    private static final String B = "mtguard-report-funcs-test";
    private static final String C = "mtguard-vmp-funcs";
    private static final String D = "mtguard-vmp-funcs-test";
    private static final String E = "mtguard-bio-field";
    private static final String F = "mtguard-bio-field-test";
    private static final String G = "MtGuardVersionCode";
    private static final String H = "SoVCode";
    public static DFPManager a = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String g = "mtguard-env-test";
    private static final String h = "mtguard-env";
    private static final String i = "mtguard-siua-test";
    private static final String j = "mtguard-blk-test";
    private static final String k = "mtguard-siua";
    private static final String l = "mtguard-xid-test";
    private static final String m = "mtguard-xid";
    private static final String n = "mtguard-blk";
    private static final String o = "mtguard-env-blk";
    private static final String p = "mtguard-env-blk-test";
    private static final String q = "mtguard-sig-ignore";
    private static final String r = "mtguard-sig-ignore-test";
    private static final String s = "mtguard-background";
    private static final String t = "mtguard-background-test";
    private static final String u = "mtguard-enc-salt";
    private static final String v = "mtguard-enc-salt-test";
    private static final String w = "mtguard-rom-check";
    private static final String x = "mtguard-rom-check-test";
    private static final String y = "mtguard-bio-test";
    private static final String z = "mtguard-bio";
    public Context b;
    public DFPManager c;
    public SyncStoreManager d;
    public DfpSharedPref e;
    public Map<Integer, c> f;

    /* renamed from: com.meituan.android.common.mtguard.collect.e$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c23a9c842a351340e1549e2d5563eafe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c23a9c842a351340e1549e2d5563eafe");
                return;
            }
            try {
                String str = e.h;
                String str2 = e.k;
                String str3 = e.m;
                String str4 = e.n;
                String str5 = e.o;
                String str6 = e.q;
                String str7 = e.s;
                String str8 = e.u;
                String str9 = e.w;
                String str10 = e.z;
                String str11 = e.A;
                String str12 = e.C;
                String str13 = e.E;
                if (com.meituan.android.common.mtguard.a.h.booleanValue()) {
                    str = e.g;
                    str2 = e.i;
                    str3 = e.l;
                    str4 = e.j;
                    str5 = e.p;
                    str6 = e.r;
                    str7 = e.t;
                    str8 = e.v;
                    str9 = e.x;
                    str10 = e.y;
                    str11 = e.B;
                    str12 = e.D;
                    str13 = e.F;
                    Horn.debug(e.this.b, e.g, true);
                    Horn.debug(e.this.b, e.i, true);
                    Horn.debug(e.this.b, e.l, true);
                    Horn.debug(e.this.b, e.j, true);
                    Horn.debug(e.this.b, e.p, true);
                    Horn.debug(e.this.b, e.r, true);
                    Horn.debug(e.this.b, e.t, true);
                    Horn.debug(e.this.b, e.v, true);
                    Horn.debug(e.this.b, e.x, true);
                    Horn.debug(e.this.b, e.y, true);
                    Horn.debug(e.this.b, e.B, true);
                    Horn.debug(e.this.b, e.D, true);
                    Horn.debug(e.this.b, e.F, true);
                }
                HashMap hashMap = new HashMap();
                hashMap.put(e.G, Integer.valueOf((int) com.meituan.android.common.mtguard.a.f));
                hashMap.put(e.H, NBridge.main1(49, new Object[0]));
                Horn.register(str, new a("1", true), hashMap);
                Horn.register(str2, new a("2", true), hashMap);
                Horn.register(str3, new a("3", true), hashMap);
                Horn.register(str4, new a("4", false), hashMap);
                Horn.register(str6, new a("5", false), hashMap);
                Horn.register(str5, new a("6", true), hashMap);
                Horn.register(str7, new a("7", false), hashMap);
                Horn.register(str8, new a("8", true), hashMap);
                Horn.register(str9, new a("9", false), hashMap);
                Horn.register(str10, new a("11", false), hashMap);
                Horn.register(str11, new a("10", false), hashMap);
                Horn.register(str12, new a("12", false), hashMap);
                Horn.register(str13, new a("13", true), hashMap);
                MTGuardLog.setLogan("Horn MtGuardVersionCode:" + hashMap.get(e.G) + ", SoVCode:" + hashMap.get(e.H));
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class a implements HornCallback {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean b;
        private String c;

        public a(String str, boolean z) {
            Object[] objArr = {e.this, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13f6cba122affdb12b33a8c97856d28a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13f6cba122affdb12b33a8c97856d28a");
                return;
            }
            this.b = z;
            this.c = str;
        }

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c49735a1e23410f3d4e9fafd44c544c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c49735a1e23410f3d4e9fafd44c544c");
                return;
            }
            MTGuardLog.setLogan("Horn " + this.c + " enable:" + z + ",result:" + str);
            if (!z || TextUtils.isEmpty(str)) {
                return;
            }
            try {
                String string = new JSONObject(str).getString("data");
                if (this.b && TextUtils.isEmpty(string)) {
                    return;
                }
                MTGuardLog.setLogan("save horn " + this.c);
                NBridge.main3(51, new Object[]{this.c, string});
                if (this.c.equals("4")) {
                    e.this.a();
                }
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    public e(@NonNull DFPManager dFPManager) {
        Object[] objArr = {dFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffbd1506e2af8835336f6716bd060603", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffbd1506e2af8835336f6716bd060603");
            return;
        }
        this.f = new HashMap();
        try {
            this.c = dFPManager;
            a = dFPManager;
            this.b = dFPManager.getContext();
            this.d = this.c.getIdStore();
            this.e = DfpSharedPref.getInstance(this.c);
            String main1 = NBridge.main1(57, new Object[]{DFPConfigs.KEY_DFPID});
            if (TextUtils.isEmpty(main1)) {
                String localDFPId = this.d.getLocalDFPId();
                if (!TextUtils.isEmpty(localDFPId)) {
                    MTGuard.DfpId = localDFPId;
                    NBridge.main1(58, new Object[]{DFPConfigs.KEY_DFPID, localDFPId});
                }
            } else {
                MTGuard.DfpId = main1;
            }
            com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new AnonymousClass1());
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    private void a(boolean z2) {
        Object[] objArr = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0c6c11f89d7d9ac6ef0db6e03e7a951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0c6c11f89d7d9ac6ef0db6e03e7a951");
            return;
        }
        try {
            d.a(this.b).a(this);
            new com.meituan.android.common.mtguard.collect.a(this).a();
            n.a(this.b).a(this);
            p.a(this.b).a(this);
            l.a(this.b).a(this);
            k a2 = k.a(this.b);
            a2.a();
            a(127, a2);
            a(512, a2);
            f.a(this.b).a(this);
            new q(this, z2).a();
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1efb6377d198b9771158d7d5d7ef2112", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1efb6377d198b9771158d7d5d7ef2112");
            return;
        }
        try {
            String main1 = NBridge.main1(57, new Object[]{DFPConfigs.KEY_DFPID});
            if (TextUtils.isEmpty(main1)) {
                String localDFPId = this.d.getLocalDFPId();
                if (!TextUtils.isEmpty(localDFPId)) {
                    MTGuard.DfpId = localDFPId;
                    NBridge.main1(58, new Object[]{DFPConfigs.KEY_DFPID, localDFPId});
                }
            } else {
                MTGuard.DfpId = main1;
            }
            com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new AnonymousClass1());
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a79bc7a525415ee508528ec1a9174e35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a79bc7a525415ee508528ec1a9174e35");
            return;
        }
        for (Integer num : this.f.keySet()) {
            Object[] main3 = NBridge.main3(53, new Object[]{num});
            boolean booleanValue = main3 == null ? false : ((Boolean) main3[0]).booleanValue();
            this.f.get(num).a(booleanValue);
            MTGuardLog.setLogan("notify index:" + num + ", is in black:" + booleanValue);
        }
    }

    public final void a(int i2, c cVar) {
        Object[] objArr = {Integer.valueOf(i2), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6522531b2485ba0e6374657f0671ad69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6522531b2485ba0e6374657f0671ad69");
        } else {
            this.f.put(Integer.valueOf(i2), cVar);
        }
    }
}
