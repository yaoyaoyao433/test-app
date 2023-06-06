package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pj {
    public static volatile Map<String, List<WeakReference<bh>>> e = new HashMap();
    public volatile boolean a = false;
    String b;
    me c;
    mi d;
    public WeakReference<bh> f;
    String g;
    String h;
    String i;
    String j;
    String k;

    public pj(Context context, bh bhVar, String str) {
        this.d = mi.a(context, (TencentMapOptions) null);
        this.b = "";
        if (bhVar != null && bhVar.b != null && bhVar.b.e_ != 0) {
            this.b = ((VectorMap) bhVar.b.e_).x();
        }
        this.f = new WeakReference<>(bhVar);
        this.g = str;
        this.c = mg.a(context, this.g);
        if (this.c != null) {
            this.c.a(new String[]{"mapPoiIconIndoorVersion", "poiIconIndoorMd5"});
        }
    }

    private void b() {
        if (this.c == null) {
            return;
        }
        this.c.a(new String[]{"mapPoiIconIndoorVersion", "poiIconIndoorMd5"});
    }

    private void a(String str, fp fpVar) {
        String a2 = a();
        if (e.containsKey(a2)) {
            a(a2, this.f);
            return;
        }
        a(a2, this.f);
        kn.b(km.V);
        jy.b(new a(this, str, fpVar));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements Runnable {
        private final WeakReference<pj> a;
        private final String b;
        private final fp c;

        public a(pj pjVar, String str, fp fpVar) {
            this.a = new WeakReference<>(pjVar);
            this.b = str;
            this.c = fpVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a == null || this.a.get() == null) {
                return;
            }
            pj pjVar = this.a.get();
            String str = this.b;
            fp fpVar = this.c;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new FileUpdateReq(eh.i, pjVar.c.b(ej.a), pjVar.c.a(ej.t)));
            arrayList.add(new FileUpdateReq("poi_icon", pjVar.c.b(ej.c), pjVar.c.a(ej.u)));
            arrayList.add(new FileUpdateReq(eh.j, pjVar.c.b(ej.d), pjVar.c.a(ej.v)));
            arrayList.add(new FileUpdateReq(eh.p, pjVar.c.b("escalator_night_version"), pjVar.c.a("escalator_night_md5")));
            if (fpVar != null && fpVar.a()) {
                arrayList.add(new FileUpdateReq(eh.l, pjVar.c.b("indoormap_style_version"), pjVar.c.a("indoormap_style_md5")));
                arrayList.add(new FileUpdateReq(eh.m, pjVar.c.b("indoormap_style_night_version"), pjVar.c.a("indoormap_style_night_md5")));
                arrayList.add(new FileUpdateReq(eh.n, pjVar.c.b(ej.s), pjVar.c.a(ej.y)));
                arrayList.add(new FileUpdateReq(eh.o, pjVar.c.b("indoorpoi_icon_3d_night_version"), pjVar.c.a("indoorpoi_icon_3d_night_md5")));
            }
            String a = pjVar.a();
            CSFileUpdateReq cSFileUpdateReq = new CSFileUpdateReq(arrayList, a, gy.m(), null, pjVar.b, str);
            pjVar.h = pjVar.d.a(pjVar.g);
            pjVar.i = pjVar.d.b(pjVar.g);
            pjVar.j = pjVar.d.c(pjVar.g) + "config/";
            pjVar.k = pjVar.d.c(pjVar.g) + "assets/";
            kd.a(pjVar.j);
            kd.a(pjVar.k);
            List<FileUpdateRsp> a2 = new ph().a(pjVar.d.c(pjVar.g) + "config/", pjVar.d.c(pjVar.g) + "assets/", a, cSFileUpdateReq, pjVar);
            if (a2 != null) {
                if (pjVar.a) {
                    if (!pjVar.a(pjVar.j, pjVar.h) || !pjVar.a(pjVar.k, pjVar.i)) {
                        pjVar.a = false;
                        pj.a(pjVar, false);
                        return;
                    }
                    for (int i = 0; i < a2.size(); i++) {
                        pj.a(pjVar, a2.get(i));
                    }
                }
                pj.a(pjVar, true);
                return;
            }
            pjVar.a = false;
            pj.a(pjVar, false);
        }
    }

    private List<FileUpdateRsp> b(String str, fp fpVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FileUpdateReq(eh.i, this.c.b(ej.a), this.c.a(ej.t)));
        arrayList.add(new FileUpdateReq("poi_icon", this.c.b(ej.c), this.c.a(ej.u)));
        arrayList.add(new FileUpdateReq(eh.j, this.c.b(ej.d), this.c.a(ej.v)));
        arrayList.add(new FileUpdateReq(eh.p, this.c.b("escalator_night_version"), this.c.a("escalator_night_md5")));
        if (fpVar != null && fpVar.a()) {
            arrayList.add(new FileUpdateReq(eh.l, this.c.b("indoormap_style_version"), this.c.a("indoormap_style_md5")));
            arrayList.add(new FileUpdateReq(eh.m, this.c.b("indoormap_style_night_version"), this.c.a("indoormap_style_night_md5")));
            arrayList.add(new FileUpdateReq(eh.n, this.c.b(ej.s), this.c.a(ej.y)));
            arrayList.add(new FileUpdateReq(eh.o, this.c.b("indoorpoi_icon_3d_night_version"), this.c.a("indoorpoi_icon_3d_night_md5")));
        }
        String a2 = a();
        CSFileUpdateReq cSFileUpdateReq = new CSFileUpdateReq(arrayList, a2, gy.m(), null, this.b, str);
        this.h = this.d.a(this.g);
        this.i = this.d.b(this.g);
        this.j = this.d.c(this.g) + "config/";
        this.k = this.d.c(this.g) + "assets/";
        kd.a(this.j);
        kd.a(this.k);
        return new ph().a(this.d.c(this.g) + "config/", this.d.c(this.g) + "assets/", a2, cSFileUpdateReq, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2) {
        bh bhVar;
        FileInputStream fileInputStream;
        boolean a2;
        boolean a3;
        if (this.f == null || (bhVar = this.f.get()) == null || bhVar.b == null || bhVar.b.e_ == 0) {
            return false;
        }
        VectorMap vectorMap = (VectorMap) bhVar.b.e_;
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            kj.c("Config temp dir not exists:".concat(String.valueOf(str)));
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        FileInputStream fileInputStream2 = null;
        for (File file2 : listFiles) {
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    byte[] bArr = new byte[(int) file2.length()];
                    fileInputStream.read(bArr, 0, bArr.length);
                    if (str2.equals(this.h)) {
                        String name = file2.getName();
                        w wVar = vectorMap.o.r;
                        if (wVar != null && wVar.b != null) {
                            a3 = w.a(new File(wVar.b.c()), name, bArr, wVar.d);
                            z &= a3;
                        }
                        a3 = false;
                        z &= a3;
                    } else if (str2.equals(this.i)) {
                        String name2 = file2.getName();
                        w wVar2 = vectorMap.o.r;
                        if (wVar2 != null && wVar2.b != null) {
                            a2 = w.a(new File(wVar2.b.e()), name2, bArr, wVar2.e);
                            z &= a2;
                        }
                        a2 = false;
                        z &= a2;
                    }
                    kd.a((Closeable) fileInputStream);
                    fileInputStream2 = fileInputStream;
                } catch (FileNotFoundException | IOException unused) {
                    fileInputStream2 = fileInputStream;
                    kd.a((Closeable) fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    kd.a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (FileNotFoundException | IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
            }
        }
        return z;
    }

    private void a(boolean z) {
        bh bhVar;
        so soVar;
        qp a2;
        this.c.a(ej.b, System.currentTimeMillis());
        kd.c(this.j);
        kd.c(this.k);
        long currentTimeMillis = System.currentTimeMillis();
        if (!z) {
            currentTimeMillis = 0;
        }
        List<WeakReference<bh>> list = e.get(a());
        if (list == null) {
            return;
        }
        int size = list.size();
        WeakReference[] weakReferenceArr = (WeakReference[]) list.toArray(new WeakReference[size]);
        for (int i = 0; i < size; i++) {
            if (weakReferenceArr[i] != null && (bhVar = (bh) weakReferenceArr[i].get()) != null && (soVar = bhVar.b) != null && soVar.e_ != 0) {
                VectorMap vectorMap = (VectorMap) soVar.e_;
                gs gsVar = soVar.aB.d;
                if (this.a) {
                    w wVar = vectorMap.o.r;
                    if (wVar != null) {
                        wVar.c();
                    }
                    if (bhVar.e != null) {
                        qq qqVar = bhVar.e;
                        mn mnVar = (mn) soVar.d_;
                        if (mnVar != null && (a2 = qqVar.a(qqVar.e)) != null) {
                            mnVar.i.b(a2.a);
                        }
                    }
                    vectorMap.o.v = true;
                    if (soVar.aB != null) {
                        soVar.aB.E();
                    }
                    soVar.aF = true;
                    if (gsVar != null) {
                        gsVar.a().a(false, currentTimeMillis);
                        gsVar.a().b(z, currentTimeMillis);
                    }
                } else if (!z && gsVar != null) {
                    gsVar.a().b(z, currentTimeMillis);
                }
                vectorMap.n = true;
            }
        }
        e.clear();
        mg.b();
        kn.d(km.V);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0.equals("poi_icon") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp r5) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pj.a(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp):void");
    }

    public final String a() {
        return hb.a(this.g) ? gy.a() : this.g;
    }

    public final synchronized void a(String str, WeakReference<bh> weakReference) {
        if (e.containsKey(str)) {
            List<WeakReference<bh>> list = e.get(str);
            if (list != null) {
                list.add(weakReference);
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(weakReference);
        e.put(str, arrayList);
    }

    private WeakReference<bh>[] c() {
        List<WeakReference<bh>> list = e.get(a());
        if (list == null) {
            return null;
        }
        return (WeakReference[]) list.toArray(new WeakReference[list.size()]);
    }

    static /* synthetic */ void a(pj pjVar, boolean z) {
        bh bhVar;
        so soVar;
        qp a2;
        pjVar.c.a(ej.b, System.currentTimeMillis());
        kd.c(pjVar.j);
        kd.c(pjVar.k);
        long currentTimeMillis = System.currentTimeMillis();
        if (!z) {
            currentTimeMillis = 0;
        }
        List<WeakReference<bh>> list = e.get(pjVar.a());
        if (list != null) {
            int size = list.size();
            WeakReference[] weakReferenceArr = (WeakReference[]) list.toArray(new WeakReference[size]);
            for (int i = 0; i < size; i++) {
                if (weakReferenceArr[i] != null && (bhVar = (bh) weakReferenceArr[i].get()) != null && (soVar = bhVar.b) != null && soVar.e_ != 0) {
                    VectorMap vectorMap = (VectorMap) soVar.e_;
                    gs gsVar = soVar.aB.d;
                    if (pjVar.a) {
                        w wVar = vectorMap.o.r;
                        if (wVar != null) {
                            wVar.c();
                        }
                        if (bhVar.e != null) {
                            qq qqVar = bhVar.e;
                            mn mnVar = (mn) soVar.d_;
                            if (mnVar != null && (a2 = qqVar.a(qqVar.e)) != null) {
                                mnVar.i.b(a2.a);
                            }
                        }
                        vectorMap.o.v = true;
                        if (soVar.aB != null) {
                            soVar.aB.E();
                        }
                        soVar.aF = true;
                        if (gsVar != null) {
                            gsVar.a().a(false, currentTimeMillis);
                            gsVar.a().b(z, currentTimeMillis);
                        }
                    } else if (!z && gsVar != null) {
                        gsVar.a().b(z, currentTimeMillis);
                    }
                    vectorMap.n = true;
                }
            }
            e.clear();
            mg.b();
            kn.d(km.V);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0.equals("poi_icon") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.tencent.mapsdk.internal.pj r4, com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp r5) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pj.a(com.tencent.mapsdk.internal.pj, com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp):void");
    }
}
