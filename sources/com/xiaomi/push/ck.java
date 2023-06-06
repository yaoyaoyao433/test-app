package com.xiaomi.push;

import android.content.Context;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.cj;
import java.io.File;
import java.util.Date;
/* loaded from: classes6.dex */
public final class ck extends cj.b {
    File a;
    final /* synthetic */ int d;
    final /* synthetic */ Date e;
    final /* synthetic */ Date f;
    final /* synthetic */ String g;
    final /* synthetic */ String h;
    final /* synthetic */ boolean i;
    final /* synthetic */ cj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(cj cjVar, int i, Date date, Date date2, String str, String str2, boolean z) {
        super();
        this.j = cjVar;
        this.d = i;
        this.e = date;
        this.f = date2;
        this.g = str;
        this.h = str2;
        this.i = z;
    }

    @Override // com.xiaomi.push.p.b
    public final void b() {
        if (this.a != null && this.a.exists()) {
            this.j.a.add(new cj.c(this.g, this.h, this.a, this.i));
        }
        this.j.b(0L);
    }

    @Override // com.xiaomi.push.cj.b, com.xiaomi.push.p.b
    public final void a() {
        File file;
        File file2;
        File file3;
        String format;
        if (d.c()) {
            try {
                File file4 = new File(this.j.b.getExternalFilesDir(null) + "/.logcache");
                file4.mkdirs();
                if (file4.isDirectory()) {
                    ci ciVar = new ci();
                    int i = this.d;
                    if (i != 0) {
                        ciVar.e = i;
                    }
                    Context context = this.j.b;
                    Date date = this.e;
                    Date date2 = this.f;
                    if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
                        file = new File(context.getExternalFilesDir(null), com.xiaomi.push.service.ak.O);
                        if (!file.exists()) {
                            file = new File(context.getFilesDir(), com.xiaomi.push.service.ak.O);
                        }
                        if (!file.exists()) {
                            file = context.getFilesDir();
                        }
                        ciVar.a(new File(file, "xmsf.log.1"));
                        file2 = new File(file, "xmsf.log");
                    } else {
                        file = new File(context.getExternalFilesDir(null) + ci.b);
                        ciVar.a(new File(file, "log0.txt"));
                        file2 = new File(file, "log1.txt");
                    }
                    ciVar.a(file2);
                    if (file.isDirectory()) {
                        file3 = new File(file4, date.getTime() + CommonConstant.Symbol.MINUS + date2.getTime() + MRNBundleManager.MRN_BUNDLE_SUFFIX);
                        if (!file3.exists()) {
                            if (date.after(date2)) {
                                ciVar.c = ciVar.a.format(date2);
                                format = ciVar.a.format(date);
                            } else {
                                ciVar.c = ciVar.a.format(date);
                                format = ciVar.a.format(date2);
                            }
                            ciVar.d = format;
                            long currentTimeMillis = System.currentTimeMillis();
                            File file5 = new File(file4, "log.txt");
                            ciVar.b(file5);
                            com.xiaomi.channel.commonutils.logger.c.c("LOG: filter cost = " + (System.currentTimeMillis() - currentTimeMillis));
                            if (file5.exists()) {
                                long currentTimeMillis2 = System.currentTimeMillis();
                                b.a(file3, file5);
                                com.xiaomi.channel.commonutils.logger.c.c("LOG: zip cost = " + (System.currentTimeMillis() - currentTimeMillis2));
                                file5.delete();
                                if (file3.exists()) {
                                    this.a = file3;
                                }
                            }
                        }
                    }
                    file3 = null;
                    this.a = file3;
                }
            } catch (NullPointerException unused) {
            }
        }
    }
}
