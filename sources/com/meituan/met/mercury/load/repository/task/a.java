package com.meituan.met.mercury.load.repository.task;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.report.e;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a implements Comparable<a>, Runnable {
    public static ChangeQuickRedirect a;
    public int b;
    protected String c;
    protected File d;
    protected boolean e;
    protected String f;
    protected String g;
    protected String h;
    protected TaskStateEnum i;
    protected AbstractC0388a j;
    protected int k;
    protected File l;
    protected boolean m;
    protected boolean n;
    protected com.meituan.met.mercury.load.core.b o;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.met.mercury.load.repository.task.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0388a {
        public static ChangeQuickRedirect c;

        public void a(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f182effd3f40e7dcca7804fae4cee231", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f182effd3f40e7dcca7804fae4cee231");
            }
        }

        public void a(a aVar, long j, int i) {
        }

        public void a(a aVar, Exception exc) {
        }
    }

    public abstract void f();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dea52e24191c99579a64ee33f1515f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dea52e24191c99579a64ee33f1515f4");
            return;
        }
        this.b = 5;
        this.i = TaskStateEnum.UNSTART;
        this.k = 0;
        this.m = false;
        this.n = false;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@NonNull a aVar) {
        return this.b - aVar.b;
    }

    public final File a() {
        return this.d;
    }

    public final File b() {
        return this.l;
    }

    public final AbstractC0388a c() {
        return this.j;
    }

    public final boolean d() {
        return this.e;
    }

    public final void a(AbstractC0388a abstractC0388a) {
        this.j = abstractC0388a;
    }

    public final void a(String str, String str2, String str3) {
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public final void a(String str, long j, boolean z, int i, String str2) {
        Object[] objArr = {str, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87aa95f38ceea571d49d2f3b0f7de254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87aa95f38ceea571d49d2f3b0f7de254");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("downloadType", str);
        hashMap.put("success", z ? "1" : "0");
        if (!z) {
            hashMap.put("errStr", str2);
        }
        hashMap.put("hasPreloadFile", this.m ? "1" : "0");
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, sb.toString());
        a("DDDBundleDownload", Float.valueOf((float) j), hashMap);
    }

    public final void b(String str, long j, boolean z, int i, String str2) {
        Object[] objArr = {str, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dccc32c05b8364b5fdc6d061b740da3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dccc32c05b8364b5fdc6d061b740da3a");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", z ? "1" : "0");
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, sb.toString());
        if (!z) {
            hashMap.put("errStr", str2);
        }
        a(str, Float.valueOf((float) j), hashMap);
    }

    private void a(String str, Float f, Map<String, String> map) {
        Object[] objArr = {str, f, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e6d027ca71a83db932f76af8649127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e6d027ca71a83db932f76af8649127");
        } else {
            e.a().a(this.f, this.g, this.h, str, f, map);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5688fa30ff8e3f6e6618b7acf2f3677", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5688fa30ff8e3f6e6618b7acf2f3677");
        } else if (this.o != null) {
            this.o.a();
            this.o = null;
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f63e7d6bb0fb91d421f262dbf631a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f63e7d6bb0fb91d421f262dbf631a3e");
            return;
        }
        this.i = TaskStateEnum.WORKING;
        if (this.j != null) {
            this.j.a(this);
        }
    }

    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "920407773f3b49719e2106b1a6fd9d16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "920407773f3b49719e2106b1a6fd9d16");
            return;
        }
        this.i = TaskStateEnum.SUCCESS;
        if (this.j != null) {
            this.j.a(this, j, i);
        }
    }

    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c60097e8f908a3a782431d5188e7a035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c60097e8f908a3a782431d5188e7a035");
            return;
        }
        this.i = TaskStateEnum.FAIL;
        if (this.j != null) {
            this.j.a(this, exc);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf5bf587057340208af3870b34ea624", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf5bf587057340208af3870b34ea624");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f14fb78e44c6c05caf9392721432dfea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f14fb78e44c6c05caf9392721432dfea");
            } else {
                String str = com.meituan.met.mercury.load.core.e.n() + "/" + this.c + ".lock";
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.met.mercury.load.core.b.a;
                this.o = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a6b87b528a4034b9aa0b2f33d50933ff", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.met.mercury.load.core.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a6b87b528a4034b9aa0b2f33d50933ff") : new com.meituan.met.mercury.load.core.b(str);
                try {
                    com.meituan.met.mercury.load.core.b bVar = this.o;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.met.mercury.load.core.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "d454a371cc6103520d8e2d1b544e3063", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "d454a371cc6103520d8e2d1b544e3063");
                    } else {
                        bVar.f = new File(bVar.b);
                        File parentFile = bVar.f.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        bVar.d = new FileOutputStream(bVar.f);
                        bVar.e = bVar.d.getChannel();
                        bVar.c = bVar.e.lock();
                    }
                } catch (Exception unused) {
                    this.o.a();
                    this.o = null;
                }
            }
            f();
        } catch (Exception e) {
            e = e;
            if (!(e instanceof f)) {
                e = new f((short) -1, "download abstract exception: " + e.toString(), this.g, this.h);
            }
            if (TextUtils.isEmpty(((f) e).d)) {
                ((f) e).d = this.g;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(NetLogConstants.Details.ERROR_MSG, e.toString());
            e.a().a(this.f, this.g, this.h, "DDDAbstractE", Float.valueOf(0.0f), hashMap);
            a(e);
        } finally {
            g();
        }
    }
}
