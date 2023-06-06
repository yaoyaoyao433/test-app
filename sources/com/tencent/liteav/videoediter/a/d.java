package com.tencent.liteav.videoediter.a;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.d.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends b {
    private long c = 0;
    private long d = 0;
    private ArrayList<String> a = new ArrayList<>();
    private int b = -1;

    public synchronized void a(List<String> list) {
        if (list != null) {
            if (list.size() > 0) {
                this.a.addAll(list);
            }
        }
    }

    @Override // com.tencent.liteav.videoediter.a.b
    public synchronized void a(long j) {
        if (j <= 0) {
            g();
            return;
        }
        g();
        if (this.a.size() > 0) {
            b bVar = new b();
            int i = 0;
            while (i < this.a.size()) {
                try {
                    bVar.a(this.a.get(i));
                } catch (IOException e) {
                    e.printStackTrace();
                    TXCLog.e("TXMultiMediaExtractor", "setDataSource IOException: " + e);
                }
                if (bVar.c() + 0 > j) {
                    break;
                }
                i++;
            }
            bVar.e();
            if (i < this.a.size()) {
                this.b = i;
                this.c = 0L;
                try {
                    super.a(this.a.get(this.b));
                } catch (IOException e2) {
                    e2.printStackTrace();
                    TXCLog.e("TXMultiMediaExtractor", "setDataSource IOException: " + e2);
                }
                super.a(j - this.c);
                this.d = super.d();
            }
        }
    }

    @TargetApi(16)
    public int f() {
        if (this.a.size() > 0) {
            b bVar = new b();
            Iterator<String> it = this.a.iterator();
            MediaFormat mediaFormat = null;
            MediaFormat mediaFormat2 = null;
            while (it.hasNext()) {
                try {
                    bVar.a(it.next());
                    MediaFormat a = bVar.a();
                    MediaFormat b = bVar.b();
                    if (mediaFormat == null && mediaFormat2 == null) {
                        mediaFormat = a;
                        mediaFormat2 = b;
                    } else if (mediaFormat != null && a == null) {
                        return -2;
                    } else {
                        if (mediaFormat == null && a != null) {
                            return -2;
                        }
                        if (mediaFormat2 != null && b == null) {
                            return -2;
                        }
                        if (mediaFormat2 == null && b != null) {
                            return -2;
                        }
                        if (mediaFormat != null && a != null) {
                            try {
                                if (Math.abs(mediaFormat.getInteger("frame-rate") - a.getInteger("frame-rate")) > 3) {
                                    return -4;
                                }
                                if (mediaFormat.getInteger("width") != a.getInteger("width")) {
                                    return -5;
                                }
                                if (mediaFormat.getInteger("height") != a.getInteger("height")) {
                                    return -6;
                                }
                            } catch (NullPointerException unused) {
                                return -3;
                            }
                        } else if (mediaFormat2 != null && b != null) {
                            if (mediaFormat2.getInteger("sample-rate") != b.getInteger("sample-rate")) {
                                return -7;
                            }
                            if (mediaFormat2.getInteger("channel-count") != b.getInteger("channel-count")) {
                                return -8;
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    TXCLog.e("TXMultiMediaExtractor", "setDataSource IOException: " + e);
                }
            }
            bVar.e();
            return 0;
        }
        return -1;
    }

    @Override // com.tencent.liteav.videoediter.a.b
    public synchronized long c() {
        long j;
        j = 0;
        if (this.a.size() > 0) {
            b bVar = new b();
            for (int i = 0; i < this.a.size(); i++) {
                try {
                    bVar.a(this.a.get(i));
                    j += bVar.c();
                } catch (IOException e) {
                    e.printStackTrace();
                    TXCLog.e("TXMultiMediaExtractor", "setDataSource IOException: " + e);
                }
            }
            bVar.e();
        }
        return j;
    }

    @Override // com.tencent.liteav.videoediter.a.b
    public synchronized int a(e eVar) {
        int a;
        a = super.a(eVar);
        while (a < 0 && this.b < this.a.size() - 1) {
            this.c = this.d + 1000;
            this.b++;
            try {
                a(this.a.get(this.b));
                a = super.a(eVar);
            } catch (IOException e) {
                TXCLog.e("TXMultiMediaExtractor", "setDataSource IOException: " + e);
                e.printStackTrace();
            }
        }
        if (a >= 0) {
            long e2 = eVar.e() + this.c;
            eVar.a(e2);
            if (this.d < e2) {
                this.d = e2;
            }
        } else {
            TXCLog.d("TXMultiMediaExtractor", "readSampleData length = " + a);
        }
        return a;
    }

    private synchronized void g() {
        super.e();
        this.b = -1;
        this.c = 0L;
        this.d = 0L;
    }

    @Override // com.tencent.liteav.videoediter.a.b
    public synchronized void e() {
        super.e();
        this.a.clear();
        this.b = -1;
        this.c = 0L;
        this.d = 0L;
    }
}
