package com.huawei.hms.availableupdate;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.IOUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d implements e {
    public final Context a;
    public final k b = new j();
    public final com.huawei.hms.availableupdate.a c = new com.huawei.hms.availableupdate.a();
    public f d;
    public File e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends b {
        public long b;
        public int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, int i, int i2, String str) {
            super(file, i);
            this.d = i2;
            this.e = str;
            this.b = 0L;
            this.c = d.this.c.a();
        }

        public final void a(int i) {
            d.this.c.a(d.this.b(), i, this.e);
            d.this.a((int) PushConstants.BROADCAST_MESSAGE_ARRIVE, i, this.d);
        }

        @Override // com.huawei.hms.availableupdate.b, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            super.write(bArr, i, i2);
            this.c += i2;
            if (this.c > 209715200) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - this.b) > 1000) {
                this.b = currentTimeMillis;
                a(this.c);
            }
            int i3 = this.c;
            if (i3 == this.d) {
                a(i3);
            }
        }
    }

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    public Context b() {
        return this.a;
    }

    public final synchronized void a(f fVar) {
        this.d = fVar;
    }

    public final synchronized void a(int i, int i2, int i3) {
        f fVar = this.d;
        if (fVar != null) {
            fVar.a(i, i2, i3, this.e);
        }
    }

    @Override // com.huawei.hms.availableupdate.e
    public void a() {
        HMSLog.i("UpdateDownload", "Enter cancel.");
        a((f) null);
        this.b.a();
    }

    @Override // com.huawei.hms.availableupdate.e
    public void a(f fVar, g gVar) {
        Checker.checkNonNull(fVar, "callback must not be null.");
        HMSLog.i("UpdateDownload", "Enter downloadPackage.");
        a(fVar);
        if (gVar != null && gVar.a()) {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                HMSLog.e("UpdateDownload", "In downloadPackage, Invalid external storage for downloading file.");
                a(2204, 0, 0);
                return;
            }
            String str = gVar.b;
            if (TextUtils.isEmpty(str)) {
                HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
                a(PushConstants.ON_TIME_NOTIFICATION, 0, 0);
                return;
            }
            Context context = this.a;
            this.e = UpdateProvider.getLocalFile(context, str + ".apk");
            File file = this.e;
            if (file == null) {
                HMSLog.e("UpdateDownload", "In downloadPackage, Failed to get local file for downloading.");
                a(2204, 0, 0);
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && (parentFile.mkdirs() || parentFile.isDirectory())) {
                if (parentFile.getUsableSpace() < gVar.d * 3) {
                    HMSLog.e("UpdateDownload", "In downloadPackage, No space for downloading file.");
                    a(2203, 0, 0);
                    return;
                }
                try {
                    a(gVar);
                    return;
                } catch (i unused) {
                    HMSLog.w("UpdateDownload", "In downloadPackage, Canceled to download the update file.");
                    a(2101, 0, 0);
                    return;
                }
            }
            HMSLog.e("UpdateDownload", "In downloadPackage, Failed to create directory for downloading file.");
            a(PushConstants.ON_TIME_NOTIFICATION, 0, 0);
            return;
        }
        HMSLog.e("UpdateDownload", "In downloadPackage, Invalid update info.");
        a(PushConstants.ON_TIME_NOTIFICATION, 0, 0);
    }

    public void a(g gVar) throws i {
        String str;
        b a2;
        HMSLog.i("UpdateDownload", "Enter downloadPackage.");
        b bVar = null;
        try {
            try {
                str = gVar.b;
            } catch (IOException e) {
                e = e;
            }
            if (TextUtils.isEmpty(str)) {
                HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
                a(PushConstants.ON_TIME_NOTIFICATION, 0, 0);
                this.b.close();
                IOUtils.closeQuietly((OutputStream) null);
                return;
            }
            this.c.a(b(), str);
            if (this.c.b(gVar.c, gVar.d, gVar.e)) {
                if (this.c.a() == this.c.b()) {
                    if (FileUtil.verifyHash(gVar.e, this.e)) {
                        a(2000, 0, 0);
                        this.b.close();
                        IOUtils.closeQuietly((OutputStream) null);
                        return;
                    }
                    this.c.a(gVar.c, gVar.d, gVar.e);
                    a2 = a(this.e, gVar.d, str);
                } else {
                    a2 = a(this.e, gVar.d, str);
                    try {
                        a2.a(this.c.a());
                    } catch (IOException e2) {
                        e = e2;
                        bVar = a2;
                        HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Failed to download." + e.getMessage());
                        a(PushConstants.ON_TIME_NOTIFICATION, 0, 0);
                        this.b.close();
                        IOUtils.closeQuietly((OutputStream) bVar);
                    } catch (Throwable th) {
                        th = th;
                        bVar = a2;
                        this.b.close();
                        IOUtils.closeQuietly((OutputStream) bVar);
                        throw th;
                    }
                }
            } else {
                this.c.a(gVar.c, gVar.d, gVar.e);
                a2 = a(this.e, gVar.d, str);
            }
            int a3 = this.b.a(gVar.c, a2, this.c.a(), this.c.b(), this.a);
            if (a3 != 200 && a3 != 206) {
                HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package, HTTP code: " + a3);
                a(PushConstants.ON_TIME_NOTIFICATION, 0, 0);
                this.b.close();
                IOUtils.closeQuietly((OutputStream) a2);
            } else if (!FileUtil.verifyHash(gVar.e, this.e)) {
                a(PushConstants.DELAY_NOTIFICATION, 0, 0);
                this.b.close();
                IOUtils.closeQuietly((OutputStream) a2);
            } else {
                a(2000, 0, 0);
                bVar = a2;
                this.b.close();
                IOUtils.closeQuietly((OutputStream) bVar);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final b a(File file, int i, String str) throws IOException {
        return new a(file, i, i, str);
    }
}
