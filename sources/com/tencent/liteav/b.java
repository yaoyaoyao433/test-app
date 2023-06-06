package com.tencent.liteav;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private static final String a = "b";
    private a d;
    private HandlerThread e;
    private WeakReference<InterfaceC1442b> k;
    private int b = 300;
    private long c = 0;
    private boolean f = false;
    private ByteBuffer g = null;
    private Bitmap h = null;
    private int i = 0;
    private int j = 0;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1442b {
        void a();

        void a(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2);
    }

    public b(InterfaceC1442b interfaceC1442b) {
        this.k = null;
        this.k = new WeakReference<>(interfaceC1442b);
    }

    public void a(int i, int i2) {
        if (this.f) {
            TXCLog.w(a, "bkgpush: start background publish return when started");
            return;
        }
        this.f = true;
        b(i, i2);
        d();
        if (this.d != null) {
            this.d.sendEmptyMessageDelayed(1001, this.b);
        }
        String str = a;
        TXCLog.w(str, "bkgpush: start background publish with time:" + ((this.c - System.currentTimeMillis()) / 1000) + ", interval:" + this.b);
    }

    public void a(int i, int i2, Bitmap bitmap, int i3, int i4) {
        if (this.f) {
            TXCLog.w(a, "bkgpush: start background publish return when started");
            return;
        }
        if (bitmap == null) {
            try {
                String str = a;
                TXCLog.w(str, "bkgpush: background publish img is empty, add default img " + i3 + "*" + i4);
                ColorDrawable colorDrawable = new ColorDrawable(-16777216);
                Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                colorDrawable.draw(new Canvas(createBitmap));
                bitmap = createBitmap;
            } catch (Error e) {
                TXCLog.e(a, "save bitmap failed.", e);
            } catch (Exception e2) {
                TXCLog.e(a, "save bitmap failed.", e2);
            }
        }
        String str2 = a;
        TXCLog.w(str2, "bkgpush: generate bitmap " + i3 + "*" + i4);
        this.h = bitmap;
        this.i = i3;
        this.j = i4;
        a(i, i2);
    }

    public boolean a() {
        return this.f;
    }

    public void b() {
        this.f = false;
        this.g = null;
        this.h = null;
        TXCLog.w(a, "bkgpush: stop background publish");
        e();
    }

    private void b(int i, int i2) {
        if (i > 0) {
            if (i >= 20) {
                i = 20;
            } else if (i <= 5) {
                i = 5;
            }
            this.b = 1000 / i;
        } else {
            this.b = 200;
        }
        long j = i2;
        if (i2 > 0) {
            this.c = System.currentTimeMillis() + (j * 1000);
        } else if (i2 == 0) {
            this.c = System.currentTimeMillis() + 300000;
        } else {
            this.c = -1L;
        }
    }

    private void d() {
        e();
        this.e = new HandlerThread("TXImageCapturer");
        this.e.start();
        this.d = new a(this.e.getLooper(), this.b, this.c);
    }

    private void e() {
        if (this.d != null) {
            this.d.removeCallbacksAndMessages(null);
            this.d = null;
        }
        if (this.e != null) {
            this.e.quit();
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i;
        InterfaceC1442b interfaceC1442b;
        ByteBuffer byteBuffer;
        int i2;
        int i3 = 0;
        try {
            if (this.k == null || !this.f || (interfaceC1442b = this.k.get()) == null) {
                return;
            }
            Bitmap bitmap = this.h;
            ByteBuffer byteBuffer2 = this.g;
            if (byteBuffer2 != null || bitmap == null) {
                byteBuffer = byteBuffer2;
                i = 0;
                i2 = 0;
            } else {
                i = bitmap.getWidth();
                try {
                    i2 = bitmap.getHeight();
                } catch (Error unused) {
                    String str = a;
                    TXCLog.w(str, "bkgpush: generate bitmap pixel error " + i + "*" + i3);
                    return;
                } catch (Exception unused2) {
                    String str2 = a;
                    TXCLog.w(str2, "bkgpush: generate bitmap pixel exception " + i + "*" + i3);
                    return;
                }
                try {
                    byteBuffer = ByteBuffer.allocateDirect(i * i2 * 4);
                    bitmap.copyPixelsToBuffer(byteBuffer);
                    byteBuffer.rewind();
                    this.g = byteBuffer;
                } catch (Error unused3) {
                    i3 = i2;
                    String str3 = a;
                    TXCLog.w(str3, "bkgpush: generate bitmap pixel error " + i + "*" + i3);
                    return;
                } catch (Exception unused4) {
                    i3 = i2;
                    String str22 = a;
                    TXCLog.w(str22, "bkgpush: generate bitmap pixel exception " + i + "*" + i3);
                    return;
                }
            }
            if (bitmap == null || byteBuffer == null) {
                return;
            }
            interfaceC1442b.a(bitmap, byteBuffer, this.i, this.j);
        } catch (Error unused5) {
            i = 0;
        } catch (Exception unused6) {
            i = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends Handler {
        private int b;
        private long c;

        public a(Looper looper, int i, long j) {
            super(looper);
            this.b = 300;
            this.c = 0L;
            this.b = i;
            this.c = j;
            String str = b.a;
            TXCLog.w(str, "bkgpush:init publish time delay:" + this.b + ", end:" + this.c);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1001) {
                try {
                    b.this.f();
                    if (this.c >= 0 && System.currentTimeMillis() >= this.c) {
                        TXCLog.w(b.a, "bkgpush:stop background publish when timeout");
                        if (b.this.k == null || !b.this.f) {
                            return;
                        }
                        InterfaceC1442b interfaceC1442b = (InterfaceC1442b) b.this.k.get();
                        if (interfaceC1442b != null) {
                            interfaceC1442b.a();
                        }
                        b.this.f = false;
                        return;
                    }
                    sendEmptyMessageDelayed(1001, this.b);
                } catch (Exception e) {
                    String str = b.a;
                    TXCLog.e(str, "publish image failed." + e.getMessage());
                }
            }
        }
    }
}
