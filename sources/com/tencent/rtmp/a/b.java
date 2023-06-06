package com.tencent.rtmp.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b implements com.tencent.rtmp.a.a {
    private final BitmapFactory.Options a = new BitmapFactory.Options();
    private HandlerThread b;
    private Handler c;
    private List<c> d;
    private Map<String, BitmapRegionDecoder> e;

    public b() {
        this.d = new ArrayList();
        this.d = Collections.synchronizedList(this.d);
        this.e = new HashMap();
        this.e = Collections.synchronizedMap(this.e);
    }

    @Override // com.tencent.rtmp.a.a
    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.e("TXImageSprite", "setVTTUrlAndImageUrls: vttUrl can't be null!");
            return;
        }
        b();
        a();
        this.c.post(new a(this, str));
        if (list == null || list.size() == 0) {
            return;
        }
        for (String str2 : list) {
            this.c.post(new RunnableC1494b(this, str, str2));
        }
    }

    @Override // com.tencent.rtmp.a.a
    public Bitmap getThumbnail(float f) {
        c a2;
        if (this.d.size() == 0 || (a2 = a(0, this.d.size() - 1, f)) == null) {
            return null;
        }
        BitmapRegionDecoder bitmapRegionDecoder = this.e.get(a2.d);
        if (bitmapRegionDecoder == null) {
            return null;
        }
        Rect rect = new Rect();
        rect.left = a2.e;
        rect.top = a2.f;
        rect.right = a2.e + a2.g;
        rect.bottom = a2.f + a2.h;
        return bitmapRegionDecoder.decodeRegion(rect, this.a);
    }

    @Override // com.tencent.rtmp.a.a
    public void release() {
        b();
        if (this.b == null || this.c == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            this.b.quitSafely();
        } else {
            this.b.quit();
        }
        this.c = null;
        this.b = null;
    }

    private c a(int i, int i2, float f) {
        while (true) {
            int i3 = ((i2 - i) / 2) + i;
            if (this.d.get(i3).a <= f && this.d.get(i3).b > f) {
                return this.d.get(i3);
            }
            if (i >= i2) {
                return this.d.get(i);
            }
            if (f >= this.d.get(i3).b) {
                i = i3 + 1;
            } else if (f >= this.d.get(i3).a) {
                return null;
            } else {
                i2 = i3 - 1;
            }
        }
    }

    private void a() {
        if (this.b == null) {
            this.b = new HandlerThread("SuperVodThumbnailsWorkThread");
            this.b.start();
            this.c = new Handler(this.b.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.c != null) {
            TXCLog.i("TXImageSprite", " remove all tasks!");
            this.c.removeCallbacksAndMessages(null);
            this.c.post(new Runnable() { // from class: com.tencent.rtmp.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.d != null) {
                        b.this.d.clear();
                    }
                    if (b.this.e != null) {
                        for (BitmapRegionDecoder bitmapRegionDecoder : b.this.e.values()) {
                            if (bitmapRegionDecoder != null) {
                                bitmapRegionDecoder.recycle();
                            }
                        }
                        b.this.e.clear();
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class a implements Runnable {
        private WeakReference<b> a;
        private String b;

        public a(b bVar, String str) {
            this.a = new WeakReference<>(bVar);
            this.b = str;
        }

        private float a(String str) {
            String str2;
            String str3;
            String[] split = str.split(CommonConstant.Symbol.COLON);
            if (split.length == 3) {
                String str4 = split[0];
                str3 = split[1];
                str2 = split[2];
            } else if (split.length == 2) {
                str3 = split[0];
                str2 = split[1];
            } else if (split.length == 1) {
                str2 = split[0];
                str3 = null;
            } else {
                str2 = null;
                str3 = null;
            }
            float floatValue = str3 != null ? 0.0f + (Float.valueOf(str3).floatValue() * 60.0f) : 0.0f;
            return str2 != null ? floatValue + Float.valueOf(str2).floatValue() : floatValue;
        }

        @Override // java.lang.Runnable
        public void run() {
            BufferedReader bufferedReader;
            String readLine;
            int i;
            b bVar = this.a.get();
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    InputStream a = bVar.a(this.b);
                    if (a == null) {
                        return;
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(a));
                    try {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 != null && readLine2.length() != 0 && readLine2.contains("WEBVTT")) {
                            do {
                                readLine = bufferedReader.readLine();
                                if (readLine != null && readLine.contains("-->")) {
                                    String[] split = readLine.split(" --> ");
                                    if (split.length == 2) {
                                        String readLine3 = bufferedReader.readLine();
                                        c cVar = new c();
                                        cVar.a = a(split[0]);
                                        cVar.b = a(split[1]);
                                        cVar.c = readLine3;
                                        int indexOf = readLine3.indexOf("#");
                                        if (indexOf != -1) {
                                            cVar.d = readLine3.substring(0, indexOf);
                                        }
                                        int indexOf2 = readLine3.indexOf("=");
                                        if (indexOf2 != -1 && (i = indexOf2 + 1) < readLine3.length()) {
                                            String[] split2 = readLine3.substring(i, readLine3.length()).split(CommonConstant.Symbol.COMMA);
                                            if (split2.length == 4) {
                                                cVar.e = Integer.valueOf(split2[0]).intValue();
                                                cVar.f = Integer.valueOf(split2[1]).intValue();
                                                cVar.g = Integer.valueOf(split2[2]).intValue();
                                                cVar.h = Integer.valueOf(split2[3]).intValue();
                                            }
                                        }
                                        if (bVar != null && bVar.d != null) {
                                            bVar.d.add(cVar);
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } while (readLine != null);
                            try {
                                bufferedReader.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        TXCLog.e("TXImageSprite", "DownloadAndParseVTTFileTask : getVTT File Error!");
                        if (bVar != null) {
                            bVar.b();
                        }
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                    } catch (IOException e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        TXCLog.e("TXImageSprite", "load image sprite failed.", e);
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused3) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream a(String str) throws IOException {
        URLConnection wrapURLConnection = HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        wrapURLConnection.connect();
        wrapURLConnection.getInputStream();
        wrapURLConnection.setConnectTimeout(15000);
        wrapURLConnection.setReadTimeout(15000);
        return wrapURLConnection.getInputStream();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.rtmp.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class RunnableC1494b implements Runnable {
        private WeakReference<b> a;
        private String b;
        private String c;

        public RunnableC1494b(b bVar, String str, String str2) {
            this.a = new WeakReference<>(bVar);
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputStream inputStream;
            b bVar = this.a.get();
            if (this.a == null || bVar == null) {
                return;
            }
            InputStream inputStream2 = null;
            try {
                try {
                    inputStream = bVar.a(this.c);
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                int lastIndexOf = this.c.lastIndexOf("/");
                inputStream2 = lastIndexOf;
                if (lastIndexOf != -1) {
                    int i = lastIndexOf + 1;
                    inputStream2 = i;
                    if (i < this.c.length()) {
                        String substring = this.c.substring(i, this.c.length());
                        inputStream2 = substring;
                        if (bVar.e != null) {
                            bVar.e.put(substring, BitmapRegionDecoder.newInstance(inputStream, true));
                            inputStream2 = substring;
                        }
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException e2) {
                e = e2;
                inputStream2 = inputStream;
                TXCLog.e("TXImageSprite", "load bitmap from network failed.", e);
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
    }
}
