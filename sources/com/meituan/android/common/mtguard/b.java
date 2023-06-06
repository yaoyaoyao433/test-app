package com.meituan.android.common.mtguard;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPDataCallBack;
import com.meituan.android.common.dfingerprint.DFPIdCallBack;
import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.android.common.dfingerprint.DFPManager;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.bean.DFPID;
import com.meituan.android.common.dfingerprint.bean.Xid;
import com.meituan.android.common.dfingerprint.collection.utils.AccessibilityUtils;
import com.meituan.android.common.dfingerprint.collection.workers.AppInfoWorker;
import com.meituan.android.common.dfingerprint.update.SelfUpdate;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.mtguard.collect.d;
import com.meituan.android.common.mtguard.collect.e;
import com.meituan.android.common.mtguard.collect.f;
import com.meituan.android.common.mtguard.collect.i;
import com.meituan.android.common.mtguard.collect.k;
import com.meituan.android.common.mtguard.collect.l;
import com.meituan.android.common.mtguard.collect.n;
import com.meituan.android.common.mtguard.collect.o;
import com.meituan.android.common.mtguard.collect.p;
import com.meituan.android.common.mtguard.collect.q;
import com.meituan.android.common.mtguard.wtscore.plugin.encryption.a;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.CommonCandyInterceptor;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Context a;
    public MTGConfigs.MTGInterfaces b;
    public DFPInfoProvider c;
    public e d;
    private long e;
    private boolean f;

    /* renamed from: com.meituan.android.common.mtguard.b$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass3 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f192d0363caf6dc2d61f022f607f4ce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f192d0363caf6dc2d61f022f607f4ce");
                return;
            }
            try {
                new i(b.this.d).a();
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    /* renamed from: com.meituan.android.common.mtguard.b$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass4 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "790d87459cb14d4a47ca01e72345506a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "790d87459cb14d4a47ca01e72345506a");
                return;
            }
            try {
                new i(b.this.d, true).a();
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    /* renamed from: com.meituan.android.common.mtguard.b$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass5 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ Context a;

        public AnonymousClass5(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7c4146e504eeb691f667c4c96d80374", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7c4146e504eeb691f667c4c96d80374");
            } else {
                com.meituan.android.time.c.a(this.a);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class a extends ContextWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(Context context) {
            super(context);
            Object[] objArr = {b.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "987b654d76303d43cf468ff3ebf2b553", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "987b654d76303d43cf468ff3ebf2b553");
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context getApplicationContext() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98a2361a40c7bc5e246c2c4ff9008959", 6917529027641081856L) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98a2361a40c7bc5e246c2c4ff9008959") : getBaseContext();
        }
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c97dbc3e0808c154b12a8300ff06fdf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c97dbc3e0808c154b12a8300ff06fdf");
            return;
        }
        this.e = 0L;
        this.f = false;
        this.a = new a(context);
        this.b = new MTGConfigs.MTGInterfaces(this.a);
    }

    private String a(DFPInfoProvider dFPInfoProvider) {
        Object[] objArr = {dFPInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87027dede5008054603c5910717836e2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87027dede5008054603c5910717836e2");
        }
        this.c = dFPInfoProvider;
        return DFPManager.dfpData();
    }

    public static Map<String, String> a(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        String str6;
        String str7;
        Object[] objArr = {str, str2, str3, str4, str5, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca344dfbba181d10d4410d4d88ec6b6e", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca344dfbba181d10d4410d4d88ec6b6e");
        }
        if (str2 == null) {
            return null;
        }
        try {
            if (str.equalsIgnoreCase("get")) {
                str7 = null;
                str6 = null;
            } else if (str4.equalsIgnoreCase("gzip")) {
                str6 = str5;
                str7 = "gzip";
            } else {
                str6 = str5;
                str7 = null;
            }
            Map<String, String> a2 = a(str, URI.create(str2), str3, str7, str6, bArr);
            a2.put(MTGConfigs.d, MTGConfigs.e);
            return a2;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return null;
        }
    }

    public static Map<String, String> a(String str, URI uri, String str2, String str3, String str4, byte[] bArr) {
        Object[] objArr = {str, uri, str2, str3, str4, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f90615a8d17b6dfb5a40b5d2ad1cba55", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f90615a8d17b6dfb5a40b5d2ad1cba55");
        }
        CommonCandyInterceptor commonCandyInterceptor = new CommonCandyInterceptor();
        HashMap hashMap = new HashMap();
        hashMap.put(MTGConfigs.c, commonCandyInterceptor.getRequestSignature(str, uri, str2, str3, str4, bArr));
        return hashMap;
    }

    public static void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1082bee02d4623927daa63d98ed58a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1082bee02d4623927daa63d98ed58a4");
            return;
        }
        MTGuardLog.setLogan("addToWatch: true");
        List<View> a2 = com.meituan.android.common.mtguard.wtscore.plugin.detection.uiautomator.b.a(view);
        HashSet hashSet = new HashSet(a2);
        a2.clear();
        a2.addAll(hashSet);
        for (View view2 : a2) {
            Object[] main3 = NBridge.main3(13, new Object[]{view2});
            if (main3 != null) {
                com.meituan.android.common.mtguard.wtscore.plugin.detection.uiautomator.a aVar = new com.meituan.android.common.mtguard.wtscore.plugin.detection.uiautomator.a(true);
                View.OnTouchListener onTouchListener = (View.OnTouchListener) main3[0];
                if (onTouchListener != null) {
                    aVar.a = onTouchListener;
                }
                NBridge.main3(14, new Object[]{view2, aVar});
            }
        }
    }

    private void a(DFPInfoProvider dFPInfoProvider, DFPDataCallBack dFPDataCallBack) {
        Object[] objArr = {dFPInfoProvider, dFPDataCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c8f06654d58a9ca58f103f14ed10f87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c8f06654d58a9ca58f103f14ed10f87");
            return;
        }
        this.c = dFPInfoProvider;
        DFPManager.dfpData(dFPDataCallBack);
    }

    public static byte[] a(byte[] bArr, String str, int i) {
        Object[] objArr = {bArr, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "32ecde75c167bcf2225bfc77f5de83b8", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "32ecde75c167bcf2225bfc77f5de83b8");
        }
        try {
            if (i == a.C0230a.a - 1) {
                return com.meituan.android.common.mtguard.wtscore.plugin.encryption.a.a(bArr, str, a.C0230a.a);
            }
            if (i == a.C0230a.b - 1) {
                return com.meituan.android.common.mtguard.wtscore.plugin.encryption.a.a(bArr, str, a.C0230a.b);
            }
            return null;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return null;
        }
    }

    private void b(@NonNull DFPIdCallBack dFPIdCallBack) {
        Object[] objArr = {dFPIdCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d48e495b8897ace078d2642656001f64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d48e495b8897ace078d2642656001f64");
            return;
        }
        try {
            Xid deserialization = Xid.deserialization(this.b.getDefaultDfpManager().getIdStore());
            if (deserialization == null || !deserialization.isValid()) {
                dFPIdCallBack.onFailed(-3003, "build local id error");
            } else {
                dFPIdCallBack.onSuccess(deserialization.id, deserialization.expiredTimeInMillisecond, "get xid from cache");
            }
        } catch (Throwable th) {
            dFPIdCallBack.onFailed(-1002, RaptorConstants.ERROR_UNKNOWN_VALUE);
            MTGuardLog.setErrorLogan(th);
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61a715b161897ce0358e0ada78145973", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61a715b161897ce0358e0ada78145973")).booleanValue() : AccessibilityUtils.isAccessibilityEnable(this.a);
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ef8fc6aa53c9221f6c4e0c0b6694bf8", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ef8fc6aa53c9221f6c4e0c0b6694bf8") : AccessibilityUtils.getAccessibilityInfos(this.a);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e0513aa4f9f290dee7679a0e0c05127", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e0513aa4f9f290dee7679a0e0c05127");
        } else if (MTGuard.loadInitSuccess) {
            NBridge.main3(4, new Object[1]);
            this.d = new e(this.b.getDefaultDfpManager());
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f93416ced08a24663470881af406103", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f93416ced08a24663470881af406103");
        } else if (MTGuard.loadInitSuccess && ProcessUtils.isMainProcess(this.a)) {
            try {
                com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new AnonymousClass3());
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17d3b79404c04466a9e9e6e36f0978aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17d3b79404c04466a9e9e6e36f0978aa");
        } else if (MTGuard.loadInitSuccess && ProcessUtils.isMainProcess(this.a)) {
            try {
                com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new AnonymousClass4());
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    private static int h() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "293615895388657693448ce25b6a9e3c", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "293615895388657693448ce25b6a9e3c");
        } else {
            Object[] main3 = NBridge.main3(11, new Object[0]);
            if (main3 == null) {
                return 0;
            }
            obj = main3[0];
        }
        return ((Integer) obj).intValue();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aca70f4018f7e3a7cfdf08e7ed45b8d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aca70f4018f7e3a7cfdf08e7ed45b8d7");
            return;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new AnonymousClass5(((a) this.a).getBaseContext().getApplicationContext()));
    }

    public final DFPInfoProvider a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1623f5ef719d4b024a0afa2084db03cc", 6917529027641081856L) ? (DFPInfoProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1623f5ef719d4b024a0afa2084db03cc") : this.c == null ? this.b.getDfpInfoProvider() : this.c;
    }

    public final void a(DFPIdCallBack dFPIdCallBack) {
        Object[] objArr = {dFPIdCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b039b1f02238079e95445251ee6780cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b039b1f02238079e95445251ee6780cd");
            return;
        }
        try {
            DFPManager defaultDfpManager = this.b.getDefaultDfpManager();
            String main1 = NBridge.main1(57, new Object[]{DFPConfigs.KEY_DFPID});
            if (TextUtils.isEmpty(main1)) {
                main1 = NBridge.main1(47, new Object[0]);
                if (TextUtils.isEmpty(main1)) {
                    dFPIdCallBack.onFailed(-3003, "build local id error");
                    return;
                }
            }
            dFPIdCallBack.onSuccess(main1, DFPID.getDFPIDExpireTime(defaultDfpManager.getIdStore()), "get dfp from local store");
        } catch (Throwable th) {
            dFPIdCallBack.onFailed(-1002, RaptorConstants.ERROR_UNKNOWN_VALUE);
            MTGuardLog.setErrorLogan(th);
        }
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d90eb59a681c4141064a637d9e31c780", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d90eb59a681c4141064a637d9e31c780");
        } else if (MTGuard.loadInitSuccess) {
            try {
                o.c().a = Privacy.createSensorManager(this.a, AppInfoWorker.getBid());
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
            LifecycleManager.register(((a) this.a).getBaseContext().getApplicationContext());
            NBridge.main3(3, new Object[1]);
            try {
                com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.b.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a06e728bc8af8a913959de004a791444", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a06e728bc8af8a913959de004a791444");
                            return;
                        }
                        try {
                            if (ProcessUtils.isMainProcess(b.this.a)) {
                                SelfUpdate.doUpdate(b.this.a, b.this.b.getDefaultDfpManager());
                            }
                        } catch (Throwable th2) {
                            MTGuardLog.setErrorLogan(th2);
                        }
                    }
                });
                com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.b.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "269742ce78fe386c5cd4f5a5385776df", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "269742ce78fe386c5cd4f5a5385776df");
                            return;
                        }
                        try {
                            b.this.b();
                            e eVar = b.this.d;
                            boolean z2 = z;
                            d.a(eVar.b).a(eVar);
                            new com.meituan.android.common.mtguard.collect.a(eVar).a();
                            n.a(eVar.b).a(eVar);
                            p.a(eVar.b).a(eVar);
                            l.a(eVar.b).a(eVar);
                            k a2 = k.a(eVar.b);
                            a2.a();
                            eVar.a(127, a2);
                            eVar.a(512, a2);
                            f.a(eVar.b).a(eVar);
                            new q(eVar, z2).a();
                        } catch (Throwable th2) {
                            MTGuardLog.setErrorLogan(th2);
                        }
                    }
                });
            } catch (Throwable th2) {
                MTGuardLog.setErrorLogan(th2);
            }
        }
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf8dc00f87eed608436548ff12477a5f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf8dc00f87eed608436548ff12477a5f");
        }
        try {
            if (this.f) {
                return String.valueOf(this.e);
            }
            long c = com.meituan.android.time.c.c();
            if (c != 0) {
                this.e = c - SystemClock.elapsedRealtime();
                this.f = true;
                return String.valueOf(this.e);
            }
            com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new AnonymousClass5(((a) this.a).getBaseContext().getApplicationContext()));
            return "";
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return "";
        }
    }
}
