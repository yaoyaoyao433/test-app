package com.tencent.liteav.beauty;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Bitmap;
import android.os.Build;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends com.tencent.liteav.basic.module.a implements com.tencent.liteav.beauty.f {
    protected Context a;
    protected boolean b;
    protected com.tencent.liteav.beauty.c h;
    com.tencent.liteav.beauty.g k;
    private Object p;
    protected boolean c = false;
    protected int d = 0;
    protected int e = 0;
    protected int f = 1;
    protected com.tencent.liteav.basic.opengl.a g = null;
    protected b i = new b();
    protected c j = null;
    private d l = d.MODE_THRESHOLD;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private a q = new a(this);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum d {
        MODE_SAME_AS_OUTPUT,
        MODE_SAME_AS_INPUT,
        MODE_THRESHOLD
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.beauty.e$e  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1448e {
        public g a = g.TXE_FILL_MODE_SCALL_ASPECT_FILL;
        public boolean b = false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class f {
        public Bitmap a;
        public float b;
        public float c;
        public float d;
        public int e;
        public int f;
        public int g;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum g {
        TXE_FILL_MODE_SCALL_TO_FILL,
        TXE_FILL_MODE_SCALL_ASPECT_FILL
    }

    private int z(int i) {
        switch (i) {
            case 1:
                return 90;
            case 2:
                return TXLiveConstants.RENDER_ROTATION_180;
            case 3:
                return 270;
            default:
                return i;
        }
    }

    @Override // com.tencent.liteav.beauty.f
    public int willAddWatermark(int i, int i2, int i3) {
        if (this.k != null) {
            com.tencent.liteav.basic.structs.b bVar = new com.tencent.liteav.basic.structs.b();
            bVar.e = i2;
            bVar.f = i3;
            bVar.j = 0;
            bVar.i = this.j != null ? this.j.e : false;
            bVar.a = i;
            return this.k.a(bVar);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.f
    public void didProcessFrame(int i, int i2, int i3, long j) {
        c();
        if (this.k != null) {
            com.tencent.liteav.basic.structs.b bVar = new com.tencent.liteav.basic.structs.b();
            bVar.e = i2;
            bVar.f = i3;
            bVar.j = 0;
            bVar.i = this.j != null ? this.j.e : false;
            bVar.a = i;
            this.k.a(bVar, j);
        }
    }

    @Override // com.tencent.liteav.beauty.f
    public void didProcessFrame(byte[] bArr, int i, int i2, int i3, long j) {
        if (this.k != null) {
            this.k.b(bArr, i, i2, i3, j);
        }
    }

    private void c() {
        if (this.m != 0) {
            setStatusValue(3002, Long.valueOf(System.currentTimeMillis() - this.m));
        }
        this.n++;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > this.o + ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
            setStatusValue(3003, Double.valueOf((this.n * 1000.0d) / (currentTimeMillis - this.o)));
            this.n = 0L;
            this.o = currentTimeMillis;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public int f;
        public int g;
        public int h;
        public int i;
        public com.tencent.liteav.basic.opengl.a j;

        private c() {
            this.e = false;
            this.h = 5;
            this.i = 0;
            this.j = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        boolean i;
        boolean j;
        public int k = 5;
        public int l = 0;
        com.tencent.liteav.basic.opengl.a m = null;

        b() {
        }
    }

    public e(Context context, boolean z) {
        this.b = true;
        TXCLog.i("TXCVideoPreprocessor", "TXCVideoPreprocessor version: VideoPreprocessor-v1.1");
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getDeviceConfigurationInfo();
        if (deviceConfigurationInfo != null) {
            TXCLog.i("TXCVideoPreprocessor", "opengl es version " + deviceConfigurationInfo.reqGlEsVersion);
            TXCLog.i("TXCVideoPreprocessor", "set GLContext " + z);
            if (deviceConfigurationInfo.reqGlEsVersion > 131072) {
                TXCLog.i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_3");
                TXCOpenGlUtils.a(3);
            } else {
                TXCLog.i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_2");
                TXCOpenGlUtils.a(2);
            }
        } else {
            TXCLog.e("TXCVideoPreprocessor", "getDeviceConfigurationInfo opengl Info failed!");
        }
        this.a = context;
        this.b = z;
        this.h = new com.tencent.liteav.beauty.c(this.a, this.b);
        com.tencent.liteav.beauty.a.a().a(context);
    }

    public void a(float[] fArr) {
        if (this.h != null) {
            this.h.a(fArr);
        }
    }

    public void a(boolean z) {
        if (this.h != null) {
            this.h.a(z);
        }
    }

    public synchronized int a(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        a(i, i2, z(i3), i4, i5);
        this.h.b(this.i);
        return this.h.a(bArr, i4);
    }

    public synchronized int a(int i, int i2, int i3, int i4, int i5, int i6) {
        return a(i, i2, i3, i4, i5, i6, 0L);
    }

    public synchronized int a(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        a(i2, i3, z(i4), i5, i6);
        this.h.b(this.i);
        return this.h.a(i, i5, j);
    }

    public synchronized int a(com.tencent.liteav.basic.structs.b bVar, int i, int i2, long j) {
        this.m = System.currentTimeMillis();
        a(bVar.l);
        a(bVar.g, bVar.h);
        b(bVar.i);
        a(bVar.c);
        a(bVar.d);
        if (bVar.m != null && bVar.a == -1) {
            return a(bVar.m, bVar.e, bVar.f, bVar.j, i, i2);
        }
        return a(bVar.a, bVar.e, bVar.f, bVar.j, i, i2, j);
    }

    public synchronized void a(d dVar) {
        this.l = dVar;
        TXCLog.i("TXCVideoPreprocessor", "set Process SDK performance " + dVar);
    }

    public synchronized void a(com.tencent.liteav.basic.opengl.a aVar) {
        this.g = aVar;
    }

    public synchronized void a(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public synchronized void a(Bitmap bitmap, float f2, float f3, float f4) {
        if (f2 < 0.0f || f3 < 0.0f || f4 < 0.0d) {
            TXCLog.e("TXCVideoPreprocessor", "WaterMark param is Error!");
            return;
        }
        if (this.h != null) {
            this.h.a(bitmap, f2, f3, f4);
        }
    }

    public synchronized void a(List<f> list) {
        if (this.h != null) {
            com.tencent.liteav.beauty.a.a().g();
            this.h.a(list);
        }
    }

    public synchronized void b(boolean z) {
        this.c = z;
    }

    public synchronized void a(Object obj) {
        this.p = obj;
    }

    public synchronized Object a() {
        return this.p;
    }

    public synchronized void a(com.tencent.liteav.beauty.f fVar) {
        if (this.h == null) {
            TXCLog.e("TXCVideoPreprocessor", "setListener mDrawer is null!");
        } else {
            this.h.a(fVar);
        }
    }

    public synchronized void a(com.tencent.liteav.beauty.g gVar) {
        if (this.h == null) {
            TXCLog.e("TXCVideoPreprocessor", "setListener mDrawer is null!");
            return;
        }
        this.k = gVar;
        if (gVar == null) {
            this.h.a((com.tencent.liteav.beauty.f) null);
        } else {
            this.h.a(this);
        }
    }

    public synchronized void a(com.tencent.liteav.basic.c.b bVar) {
        if (this.h == null) {
            TXCLog.e("TXCVideoPreprocessor", "setListener mDrawer is null!");
        } else {
            this.h.a(bVar);
        }
    }

    private boolean a(int i, int i2, int i3, int i4, int i5) {
        if (this.j == null) {
            this.j = new c();
            this.n = 0L;
            this.o = System.currentTimeMillis();
        }
        if (i != this.j.b || i2 != this.j.c || i3 != this.j.d || ((this.d > 0 && this.d != this.j.f) || ((this.e > 0 && this.e != this.j.g) || ((this.g != null && ((this.g.c > 0 && (this.j.j == null || this.g.c != this.j.j.c)) || ((this.g.d > 0 && (this.j.j == null || this.g.d != this.j.j.d)) || ((this.g.a >= 0 && (this.j.j == null || this.g.a != this.j.j.a)) || (this.g.b >= 0 && (this.j.j == null || this.g.b != this.j.j.b)))))) || this.c != this.j.e || this.j.h != i4)))) {
            TXCLog.i("TXCVideoPreprocessor", "Init sdk");
            TXCLog.i("TXCVideoPreprocessor", "Input widht " + i + " height " + i2);
            this.j.b = i;
            this.j.c = i2;
            if (this.g != null && this.g.a >= 0 && this.g.b >= 0 && this.g.c > 0 && this.g.d > 0) {
                TXCLog.i("TXCVideoPreprocessor", "set Crop Rect; init ");
                int i6 = i - this.g.a > this.g.c ? this.g.c : i - this.g.a;
                int i7 = i2 - this.g.b > this.g.d ? this.g.d : i2 - this.g.b;
                this.g.c = i6;
                this.g.d = i7;
                i = this.g.c;
                i2 = this.g.d;
            }
            int i8 = i;
            int i9 = i2;
            this.j.j = this.g;
            this.j.d = i3;
            this.j.a = this.b;
            this.j.h = i4;
            this.j.i = i5;
            this.j.f = this.d;
            this.j.g = this.e;
            if (this.j.f <= 0 || this.j.g <= 0) {
                if (90 == this.j.d || 270 == this.j.d) {
                    this.j.f = i9;
                    this.j.g = i8;
                } else {
                    this.j.f = i8;
                    this.j.g = i9;
                }
            }
            if (this.l == d.MODE_SAME_AS_OUTPUT) {
                if (90 == this.j.d || 270 == this.j.d) {
                    i8 = this.j.g;
                    i9 = this.j.f;
                } else {
                    i8 = this.j.f;
                    i9 = this.j.g;
                }
            } else if (this.l != d.MODE_SAME_AS_INPUT) {
                com.tencent.liteav.basic.util.e b2 = b(i8, i9, this.j.d, this.j.f, this.j.g);
                i8 = ((b2.a + 7) / 8) * 8;
                i9 = ((b2.b + 7) / 8) * 8;
            }
            this.j.e = this.c;
            if (a(this.j, i8, i9)) {
                return true;
            }
            TXCLog.e("TXCVideoPreprocessor", "init failed!");
            return false;
        } else if (i4 == this.j.h && i5 == this.j.i) {
            return true;
        } else {
            this.j.h = i4;
            this.i.k = i4;
            this.j.i = i5;
            this.i.l = i5;
            this.h.b(i5);
            return true;
        }
    }

    private com.tencent.liteav.basic.util.e b(int i, int i2, int i3, int i4, int i5) {
        if (i3 == 90 || i3 == 270) {
            i5 = i4;
            i4 = i5;
        }
        int min = Math.min(i4, i5);
        int min2 = Math.min(i, i2);
        int[] iArr = {720, 1080, 1280};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr[i6];
            if (min <= i7 && min2 >= i7) {
                float f2 = (i7 * 1.0f) / min;
                return new com.tencent.liteav.basic.util.e((int) (i4 * f2), (int) (f2 * i5));
            }
        }
        return new com.tencent.liteav.basic.util.e(i, i2);
    }

    private boolean a(c cVar, int i, int i2) {
        this.i.d = cVar.b;
        this.i.e = cVar.c;
        this.i.m = cVar.j;
        this.i.g = i;
        this.i.f = i2;
        this.i.h = (cVar.d + 360) % 360;
        this.i.b = cVar.f;
        this.i.c = cVar.g;
        this.i.a = 0;
        this.i.j = cVar.a;
        this.i.i = cVar.e;
        this.i.k = cVar.h;
        this.i.l = cVar.i;
        if (this.h == null) {
            this.h = new com.tencent.liteav.beauty.c(this.a, cVar.a);
            this.h.a(this.f);
        }
        return this.h.a(this.i);
    }

    public void a(int i) {
        if (i != this.f) {
            this.f = i;
            if (this.h != null) {
                this.h.a(this.f);
            }
        }
    }

    public synchronized void b() {
        if (this.h != null) {
            this.h.a();
        }
        this.j = null;
    }

    public synchronized void b(int i) {
        if (this.h != null) {
            this.h.d(i);
        }
        this.q.a("beautyStyle", i);
    }

    public synchronized void c(int i) {
        try {
            if (i > 9) {
                TXCLog.e("TXCVideoPreprocessor", "Beauty value too large! set max value 9");
                i = 9;
            } else if (i < 0) {
                TXCLog.e("TXCVideoPreprocessor", "Beauty < 0; set 0");
                i = 0;
            }
            if (this.h != null) {
                this.h.c(i);
            }
            this.q.a("beautyLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d(int i) {
        try {
            if (i > 9) {
                TXCLog.e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
                i = 9;
            } else if (i < 0) {
                TXCLog.e("TXCVideoPreprocessor", "Brightness < 0; set 0");
                i = 0;
            }
            if (this.h != null) {
                this.h.e(i);
            }
            this.q.a("whiteLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(int i) {
        try {
            if (i > 9) {
                TXCLog.e("TXCVideoPreprocessor", "Ruddy value too large! set max value 9");
                i = 9;
            } else if (i < 0) {
                TXCLog.e("TXCVideoPreprocessor", "Ruddy < 0; set 0");
                i = 0;
            }
            if (this.h != null) {
                this.h.g(i);
            }
            this.q.a("ruddyLevel", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void f(int i) {
        if (i > 9) {
            TXCLog.e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
            i = 9;
        } else if (i < 0) {
            TXCLog.e("TXCVideoPreprocessor", "Brightness < 0; set 0");
            i = 0;
        }
        if (this.h != null) {
            this.h.f(i);
        }
    }

    public synchronized void a(String str) {
        if (this.h != null) {
            this.h.a(str);
        }
    }

    public synchronized void c(boolean z) {
        if (this.h != null) {
            this.h.b(z);
        }
    }

    @TargetApi(18)
    public boolean a(String str, boolean z) {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        if (this.h != null) {
            this.h.a(str, z);
            return true;
        }
        return true;
    }

    public synchronized void g(int i) {
        if (this.h != null) {
            this.h.h(i);
        }
        this.q.a("eyeBigScale", i);
    }

    public synchronized void h(int i) {
        if (this.h != null) {
            this.h.i(i);
        }
        this.q.a("faceSlimLevel", i);
    }

    public void i(int i) {
        if (this.h != null) {
            this.h.j(i);
        }
        this.q.a("faceVLevel", i);
    }

    public void j(int i) {
        if (this.h != null) {
            this.h.k(i);
        }
        this.q.a("faceShortLevel", i);
    }

    public void k(int i) {
        if (this.h != null) {
            this.h.l(i);
        }
        this.q.a("chinLevel", i);
    }

    public void l(int i) {
        if (this.h != null) {
            this.h.m(i);
        }
        this.q.a("noseSlimLevel", i);
    }

    public void m(int i) {
        if (this.h != null) {
            this.h.n(i);
        }
        this.q.a("eyeLightenLevel", i);
    }

    public void n(int i) {
        if (this.h != null) {
            this.h.o(i);
        }
        this.q.a("toothWhitenLevel", i);
    }

    public void o(int i) {
        if (this.h != null) {
            this.h.p(i);
        }
        this.q.a("wrinkleRemoveLevel", i);
    }

    public void p(int i) {
        if (this.h != null) {
            this.h.q(i);
        }
        this.q.a("pounchRemoveLevel", i);
    }

    public void q(int i) {
        if (this.h != null) {
            this.h.r(i);
        }
        this.q.a("smileLinesRemoveLevel", i);
    }

    public void r(int i) {
        if (this.h != null) {
            this.h.s(i);
        }
        this.q.a("foreheadLevel", i);
    }

    public void s(int i) {
        if (this.h != null) {
            this.h.t(i);
        }
        this.q.a("eyeDistanceLevel", i);
    }

    public void t(int i) {
        if (this.h != null) {
            this.h.u(i);
        }
        this.q.a("eyeAngleLevel", i);
    }

    public void u(int i) {
        if (this.h != null) {
            this.h.v(i);
        }
        this.q.a("mouthShapeLevel", i);
    }

    public void v(int i) {
        if (this.h != null) {
            this.h.w(i);
        }
        this.q.a("noseWingLevel", i);
    }

    public void w(int i) {
        if (this.h != null) {
            this.h.x(i);
        }
        this.q.a("nosePositionLevel", i);
    }

    public void x(int i) {
        if (this.h != null) {
            this.h.y(i);
        }
        this.q.a("lipsThicknessLevel", i);
    }

    public void y(int i) {
        if (this.h != null) {
            this.h.z(i);
        }
        this.q.a("faceBeautyLevel", i);
    }

    public synchronized void a(float f2) {
        if (this.h != null) {
            this.h.a(f2);
        }
    }

    public synchronized void a(Bitmap bitmap) {
        if (this.h != null) {
            this.h.a(bitmap);
        }
    }

    public void a(float f2, Bitmap bitmap, float f3, Bitmap bitmap2, float f4) {
        if (this.h != null) {
            this.h.a(f2, bitmap, f3, bitmap2, f4);
        }
    }

    public synchronized void b(float f2) {
        if (this.h != null) {
            this.h.b(f2);
        }
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        setStatusValue(3001, this.q.a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        WeakReference<e> a;
        private HashMap<String, String> b = new HashMap<>();

        public a(e eVar) {
            this.a = new WeakReference<>(eVar);
        }

        public void a(String str, int i) {
            String id;
            this.b.put(str, String.valueOf(i));
            e eVar = this.a.get();
            if (eVar == null || (id = eVar.getID()) == null || id.length() <= 0) {
                return;
            }
            eVar.setStatusValue(3001, a());
        }

        public String a() {
            String str = "";
            for (String str2 : this.b.keySet()) {
                str = str + str2 + CommonConstant.Symbol.COLON + this.b.get(str2) + StringUtil.SPACE;
            }
            return CommonConstant.Symbol.BIG_BRACKET_LEFT + str + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
        }
    }
}
