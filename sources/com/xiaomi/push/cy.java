package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class cy extends m.a {
    private Context a;
    private SharedPreferences b;
    private com.xiaomi.push.service.z c;

    public cy(Context context) {
        this.a = context;
        this.b = context.getSharedPreferences("mipush_extra", 0);
        this.c = com.xiaomi.push.service.z.a(context);
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "1";
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
        if (r1 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (com.xiaomi.push.al.h(r14.a) != false) goto L23;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.cy.run():void");
    }

    private List<hj> a(File file) {
        FileLock fileLock;
        RandomAccessFile randomAccessFile;
        FileInputStream fileInputStream;
        cq cqVar = cr.a().a;
        String a = cqVar == null ? "" : cqVar.a();
        FileLock fileLock2 = null;
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (ct.a) {
            try {
                File file2 = new File(this.a.getExternalFilesDir(null), "push_cdata.lock");
                b.b(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    try {
                        fileInputStream = new FileInputStream(file);
                        while (fileInputStream.read(bArr) == 4) {
                            try {
                                int a2 = f.a(bArr);
                                byte[] bArr2 = new byte[a2];
                                if (fileInputStream.read(bArr2) != a2) {
                                    break;
                                }
                                byte[] a3 = cs.a(a, bArr2);
                                if (a3 != null && a3.length != 0) {
                                    hj hjVar = new hj();
                                    ik.a(hjVar, a3);
                                    arrayList.add(hjVar);
                                    if (hjVar.b == hc.AppInstallList && !hjVar.c.startsWith("same_")) {
                                        SharedPreferences.Editor edit = this.b.edit();
                                        edit.putLong("dc_job_result_time_4", hjVar.a);
                                        edit.putString("dc_job_result_4", ar.a(hjVar.c));
                                        edit.commit();
                                    }
                                }
                            } catch (Exception unused) {
                                fileLock2 = fileLock;
                                if (fileLock2 != null && fileLock2.isValid()) {
                                    try {
                                        fileLock2.release();
                                    } catch (IOException unused2) {
                                    }
                                }
                                b.a(fileInputStream);
                                b.a(randomAccessFile);
                                return arrayList;
                            } catch (Throwable th) {
                                th = th;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused3) {
                                    }
                                }
                                b.a(fileInputStream);
                                b.a(randomAccessFile);
                                throw th;
                            }
                        }
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException unused4) {
                            }
                        }
                        b.a(fileInputStream);
                    } catch (Exception unused5) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = null;
                    }
                } catch (Exception unused6) {
                    fileInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLock = null;
                    fileInputStream = null;
                }
            } catch (Exception unused7) {
                randomAccessFile = null;
                fileInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileLock = null;
                randomAccessFile = null;
                fileInputStream = null;
            }
            b.a(randomAccessFile);
        }
        return arrayList;
    }
}
