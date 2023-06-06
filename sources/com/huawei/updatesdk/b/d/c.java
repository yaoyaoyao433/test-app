package com.huawei.updatesdk.b.d;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c extends AsyncTask<Void, Void, Void> {
    private String a;
    private HttpURLConnection b;
    private com.huawei.updatesdk.b.d.b d;
    private boolean c = false;
    private Handler e = new b(null);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.b != null) {
                c.this.c = true;
                c.this.b.disconnect();
            }
            com.huawei.updatesdk.a.a.d.d.a(new File(c.c()));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class b extends Handler {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof com.huawei.updatesdk.b.d.b) {
                com.huawei.updatesdk.b.d.b bVar = (com.huawei.updatesdk.b.d.b) obj;
                Intent intent = new Intent();
                com.huawei.updatesdk.a.b.b.b a = com.huawei.updatesdk.a.b.b.b.a(intent);
                switch (message.what) {
                    case 2:
                        intent.putExtra("download_apk_size", bVar.e());
                        intent.putExtra("download_apk_already", bVar.a());
                        com.huawei.updatesdk.b.f.c.b().a(a);
                        return;
                    case 3:
                    case 5:
                        break;
                    case 4:
                        Context a2 = com.huawei.updatesdk.a.b.a.a.c().a();
                        e.a(a2, c.c() + "/appmarket.apk", bVar.c());
                        break;
                    default:
                        return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("download_status_param", message.what);
                intent.putExtras(bundle);
                com.huawei.updatesdk.b.f.c.b().b(a);
            }
        }
    }

    public c(com.huawei.updatesdk.b.d.b bVar) {
        this.d = bVar;
        if (TextUtils.isEmpty(bVar.c())) {
            return;
        }
        this.a = bVar.c();
    }

    private void a(int i, long j, String str, int i2) {
        com.huawei.updatesdk.b.d.b bVar = new com.huawei.updatesdk.b.d.b();
        bVar.a(i);
        bVar.a(j);
        bVar.a(str);
        Handler handler = this.e;
        if (handler == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(i2, bVar));
    }

    private void a(com.huawei.updatesdk.b.d.b bVar, String str) {
        FileOutputStream fileOutputStream;
        if (bVar == null || TextUtils.isEmpty(bVar.b())) {
            return;
        }
        String str2 = str + "/appmarket.apk";
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(new File(str2));
                } catch (IOException unused) {
                    com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", "Close FileOutputStream failed!");
                    return;
                }
            } catch (FileNotFoundException e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!a(bVar, fileOutputStream, str2)) {
                com.huawei.updatesdk.a.a.d.d.a(new File(e()));
            }
            fileOutputStream.close();
        } catch (FileNotFoundException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", "DOWNLOAD market package FileNotFoundException error:" + e.toString());
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", "DOWNLOAD market package Exception error:" + e.toString());
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                    com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", "Close FileOutputStream failed!");
                }
            }
            throw th;
        }
    }

    private void a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + e.toString());
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + e2.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.huawei.updatesdk.b.d.b r21, java.io.OutputStream r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.b.d.c.a(com.huawei.updatesdk.b.d.b, java.io.OutputStream, java.lang.String):boolean");
    }

    static /* synthetic */ String c() {
        return e();
    }

    private void d() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private static String e() {
        String b2 = com.huawei.updatesdk.a.b.a.a.c().b();
        if (TextUtils.isEmpty(b2)) {
            return "";
        }
        String str = b2 + "/updatesdk";
        File file = new File(str);
        return (file.exists() || file.mkdirs()) ? str : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        com.huawei.updatesdk.b.g.b.a(this);
        a(this.d, e());
        return null;
    }

    public void a() {
        new Thread(new a()).start();
    }

    public void b() {
        this.e = null;
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        super.onCancelled();
        a();
    }
}
