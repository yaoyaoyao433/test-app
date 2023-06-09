package com.tencent.open.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.tencent.open.log.SLog;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    private static String c;
    private String a;
    private d b;
    private long d;
    private Handler e;
    private WeakReference<Activity> f;
    private Runnable g = new Runnable() { // from class: com.tencent.open.utils.c.2
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            SLog.v("AsynLoadImg", "saveFileRunnable:");
            String str = "share_qq_" + k.g(c.this.a) + ".jpg";
            String str2 = c.c + str;
            File file = new File(str2);
            Message obtainMessage = c.this.e.obtainMessage();
            if (!file.exists()) {
                Bitmap a = c.a(c.this.a);
                if (a != null) {
                    z = c.this.a(a, str);
                } else {
                    SLog.v("AsynLoadImg", "saveFileRunnable:get bmp fail---");
                    z = false;
                }
                if (z) {
                    obtainMessage.arg1 = 0;
                    obtainMessage.obj = str2;
                } else {
                    obtainMessage.arg1 = 1;
                }
                SLog.v("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - c.this.d));
            } else {
                obtainMessage.arg1 = 0;
                obtainMessage.obj = str2;
                SLog.v("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - c.this.d));
            }
            c.this.e.sendMessage(obtainMessage);
        }
    };

    public c(Activity activity) {
        this.f = new WeakReference<>(activity);
        this.e = new Handler(activity.getMainLooper()) { // from class: com.tencent.open.utils.c.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                SLog.v("AsynLoadImg", "handleMessage:" + message.arg1);
                if (message.arg1 == 0) {
                    c.this.b.a(message.arg1, (String) message.obj);
                } else {
                    c.this.b.a(message.arg1, (String) null);
                }
            }
        };
    }

    public void a(String str, d dVar) {
        SLog.v("AsynLoadImg", "--save---");
        if (str == null || str.equals("")) {
            dVar.a(1, (String) null);
        } else if (!k.a()) {
            dVar.a(2, (String) null);
        } else {
            if (this.f.get() != null) {
                Activity activity = this.f.get();
                File h = k.h(activity, "Images");
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (h == null) {
                    SLog.e("AsynLoadImg", "externalImageFile is null");
                    dVar.a(2, (String) null);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i.d(activity) ? h.getAbsolutePath() : externalStorageDirectory.getAbsolutePath());
                sb.append("/tmp/");
                c = sb.toString();
            }
            this.d = System.currentTimeMillis();
            this.a = str;
            this.b = dVar;
            new Thread(this.g).start();
        }
    }

    public boolean a(Bitmap bitmap, String str) {
        BufferedOutputStream bufferedOutputStream;
        String str2 = c;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdir();
                }
                SLog.v("AsynLoadImg", "saveFile:" + str);
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str2 + str)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream);
            bufferedOutputStream.flush();
            try {
                bufferedOutputStream.close();
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
                return true;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            SLog.e("AsynLoadImg", "saveFile bmp fail---", e);
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                    return false;
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static Bitmap a(String str) {
        SLog.v("AsynLoadImg", "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap a = com.sankuai.waimai.launcher.util.image.a.a(inputStream);
            inputStream.close();
            SLog.v("AsynLoadImg", "image download finished." + str);
            return a;
        } catch (IOException e) {
            e.printStackTrace();
            SLog.v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            SLog.v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        }
    }
}
