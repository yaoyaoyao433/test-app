package com.meituan.android.yoda.util;

import android.content.Context;
import android.media.AudioRecord;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.yoda.widget.view.VoicePrintView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public DataOutputStream b;
    Context c;
    int d;
    com.meituan.android.privacy.interfaces.j e;
    volatile boolean f;
    volatile double g;
    public a h;
    File i;
    File j;
    public VoicePrintView.b k;
    private ExecutorService l;
    private ScheduledExecutorService m;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(double d);
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a42e64a5617e112c97c51cb3e92b9e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a42e64a5617e112c97c51cb3e92b9e1");
            return;
        }
        this.b = null;
        this.d = 0;
        this.f = false;
        this.g = 0.0d;
        this.i = null;
        this.j = null;
        this.m = com.sankuai.android.jarvis.c.c("Yoda-audio-recorder");
        this.l = com.sankuai.android.jarvis.c.a("yoda_audio_recorder", 4);
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(FileInputStream fileInputStream, FileOutputStream fileOutputStream, int i, int i2, int i3) {
        Object[] objArr = {fileInputStream, fileOutputStream, 16000, 1, 16};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85393ffea259a70e8fb81793b8e98a13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85393ffea259a70e8fb81793b8e98a13");
            return;
        }
        byte[] bArr = new byte[1024];
        try {
            try {
                long size = fileInputStream.getChannel().size();
                long j = 36 + size;
                Object[] objArr2 = {fileOutputStream, new Long(size), new Long(j), 16000, 1, new Long(32000L)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0ccf57fb0bc89cc729f215b31c900672", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0ccf57fb0bc89cc729f215b31c900672");
                } else {
                    fileOutputStream.write(new byte[]{82, 73, 70, 70, (byte) (j & 255), (byte) ((j >> 8) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) 1, 0, (byte) 128, (byte) 62, (byte) 0, (byte) 0, (byte) 0, (byte) 125, (byte) 0, (byte) 0, (byte) 2, 0, 16, 0, 100, 97, 116, 97, (byte) (size & 255), (byte) ((size >> 8) & 255), (byte) ((size >> 16) & 255), (byte) ((size >> 24) & 255)}, 0, 44);
                }
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                fileInputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            throw th;
        }
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c841040d350925940fa510114b2116f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c841040d350925940fa510114b2116f");
            return;
        }
        this.d = AudioRecord.getMinBufferSize(16000, 1, 2);
        this.e = Privacy.createAudioRecord("jcyf-0268d593bb3f5183", 6, 16000, 1, 2, this.d * 2);
        this.f = true;
        this.e.a();
        this.l.execute(d.a(this));
        try {
            this.m = com.sankuai.android.jarvis.c.c("Yoda-audio-recorder");
            this.m.scheduleAtFixedRate(e.a(this), 100L, 100L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final synchronized void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5047085038ba5e5d55970cdddf24160d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5047085038ba5e5d55970cdddf24160d");
            return;
        }
        this.f = false;
        this.e.b();
        this.e.c();
        this.e = null;
        try {
            this.m.shutdown();
            this.m = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!z) {
            this.l.execute(f.a(this));
        }
    }
}
