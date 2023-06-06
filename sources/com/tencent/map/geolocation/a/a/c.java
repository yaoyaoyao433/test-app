package com.tencent.map.geolocation.a.a;

import android.content.Context;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements Runnable {
    List<a> a = null;
    int b = 0;
    private Context c;
    private String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.d = null;
        this.c = context;
        this.d = this.c.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/UpCp";
        File file = new File(this.c.getFilesDir().getAbsolutePath(), "TencentLocation/UpCp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
        e.a(this.c).b();
        d.a(this.c).b("load");
    }

    private synchronized void a() {
        if (this.a != null && this.a.size() > 0) {
            this.b = 1;
            com.tencent.map.geolocation.a.b.h.e(this.c);
            if (com.tencent.map.geolocation.a.b.h.b() < 10485760) {
                this.b = 2;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            boolean z2 = true;
            for (a aVar : this.a) {
                if (a(aVar)) {
                    arrayList.add(aVar);
                } else {
                    z2 = false;
                }
            }
            if (!z2) {
                this.b = 2;
                a(arrayList);
            } else if (arrayList.size() == this.a.size()) {
                com.tencent.map.geolocation.a.b.h.b(this.c, "__SP_UPDATE_TencentLoc_COMP_INFO__", "");
                if (com.tencent.map.geolocation.a.b.h.a(this.c, this.a)) {
                    com.tencent.map.geolocation.a.b.h.a(this.c, "__SP_UPDATE_TencentLoc_COMP_SDK_VER__", h.a);
                    for (a aVar2 : arrayList) {
                        if (!aVar2.c.contains(".dex")) {
                            aVar2.c += ".dex";
                        }
                        File file = new File(this.d, aVar2.c);
                        boolean delete = file.exists() ? file.delete() : true;
                        File file2 = new File(this.d, aVar2.c);
                        boolean renameTo = new File(this.d, "tmp_" + aVar2.c).renameTo(file2);
                        boolean a = a(aVar2, file2);
                        if (delete && renameTo && a) {
                            z = true;
                        }
                    }
                    if (!z) {
                        com.tencent.map.geolocation.a.b.h.a(this.c, "__SP_UPDATE_TencentLoc_COMP_INFO__", "");
                        com.tencent.map.geolocation.a.b.h.d(this.d);
                        this.b = 2;
                        return;
                    }
                    this.b = 1;
                    e.a(this.c).a("CPU", "down suc");
                    return;
                }
                a(arrayList);
                this.b = 2;
            } else {
                e.a(this.c).a("CPU", "down failed");
                a(arrayList);
                this.b = 2;
            }
        }
    }

    private void a(List<a> list) {
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            String str = this.d;
            File file = new File(str, "tmp_" + it.next().c);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }

    private boolean a(a aVar) {
        byte[] a;
        BufferedOutputStream bufferedOutputStream;
        try {
            String str = "https://maplbs-40171.sh.gfp.tencent-cloud.com/Index/" + aVar.e;
            BufferedOutputStream bufferedOutputStream2 = null;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 3) {
                    break;
                }
                byte[] a2 = com.tencent.map.geolocation.a.b.f.a(str);
                if (a2 != null && (a = com.tencent.map.geolocation.a.b.h.a(com.tencent.map.geolocation.a.b.c.b(a2, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"))) != null) {
                    File file = new File(this.d, "tmp_" + aVar.c);
                    try {
                        try {
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, false), 1024);
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                    }
                    try {
                        bufferedOutputStream.write(a);
                        if (a(aVar, file)) {
                            e.a(this.c).a("CPU", "sud:" + aVar.e);
                            try {
                                bufferedOutputStream.close();
                                return true;
                            } catch (Exception unused) {
                                return true;
                            }
                        }
                        e.a(this.c).a("CPU", "failed:" + aVar.e);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                        try {
                            bufferedOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        bufferedOutputStream2 = bufferedOutputStream;
                    } catch (Exception e2) {
                        e = e2;
                        bufferedOutputStream2 = bufferedOutputStream;
                        e.printStackTrace();
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                        e.a(this.c).a("CPU", "failed:" + e.toString());
                        try {
                            bufferedOutputStream2.close();
                        } catch (Exception unused3) {
                        }
                        com.tencent.map.geolocation.a.b.h.a((long) MetricsAnrManager.ANR_THRESHOLD);
                        i = i2;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            bufferedOutputStream.close();
                        } catch (Exception unused4) {
                        }
                        throw th;
                    }
                }
                com.tencent.map.geolocation.a.b.h.a((long) MetricsAnrManager.ANR_THRESHOLD);
                i = i2;
            }
        } catch (Throwable unused5) {
        }
        return false;
    }

    private static boolean a(a aVar, File file) {
        if (file.exists()) {
            int length = (int) file.length();
            String b = com.tencent.map.geolocation.a.b.h.b(file);
            if (aVar.d == length && aVar.e.equals(b)) {
                return true;
            }
        }
        return false;
    }
}
