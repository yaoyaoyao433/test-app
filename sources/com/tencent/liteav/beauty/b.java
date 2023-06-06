package com.tencent.liteav.beauty;

import android.graphics.Bitmap;
import android.os.Build;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b implements TXBeautyManager {
    private com.tencent.liteav.basic.license.e a;
    private e b;
    private int c;
    private boolean e = true;
    private a d = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public float A;
        public String B;
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public String x;
        public boolean y;
        public Bitmap z;

        a() {
        }
    }

    public b(com.tencent.liteav.basic.license.e eVar) {
        this.a = eVar;
        enableSharpnessEnhancement(true);
        setFilterStrength(0.5f);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setPreprocessor(e eVar) {
        this.b = eVar;
        if (this.b != null) {
            a();
        }
    }

    private void a() {
        TXCLog.d("TXBeautyManager", "applyBeautyParams");
        this.b.b(this.c);
        b(this.e);
        if (this.a.a()) {
            this.b.g(this.d.e);
            this.b.h(this.d.f);
            this.b.i(this.d.g);
            this.b.k(this.d.h);
            this.b.j(this.d.i);
            this.b.l(this.d.j);
            this.b.m(this.d.k);
            this.b.n(this.d.l);
            this.b.o(this.d.m);
            this.b.p(this.d.n);
            this.b.q(this.d.o);
            this.b.r(this.d.p);
            this.b.s(this.d.q);
            this.b.t(this.d.r);
            this.b.u(this.d.s);
            this.b.v(this.d.t);
            this.b.w(this.d.u);
            this.b.x(this.d.v);
            this.b.y(this.d.w);
            this.b.a(this.d.B, true);
        }
        this.b.a(this.d.z);
        this.b.a(this.d.A);
        this.b.a(this.d.x);
        this.b.c(this.d.y);
    }

    public void a(boolean z) {
        this.e = z;
        b(z);
    }

    private void b(boolean z) {
        if (z) {
            this.b.c(this.d.a);
            this.b.d(this.d.b);
            this.b.e(this.d.c);
            this.b.f(this.d.d);
            return;
        }
        this.b.c(0);
        this.b.d(0);
        this.b.e(0);
        this.b.f(0);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyStyle(int i) {
        TXCLog.d("TXBeautyManager", "setBeautyStyle beautyStyle:" + i);
        this.c = i;
        if (this.b != null) {
            this.b.b(i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilter(Bitmap bitmap) {
        TXCLog.d("TXBeautyManager", "setFilter image:" + bitmap);
        this.d.z = bitmap;
        if (this.b != null) {
            this.b.a(bitmap);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilterStrength(float f) {
        TXCLog.d("TXBeautyManager", "setFilterStrength strength:" + f);
        this.d.A = f;
        if (this.b != null) {
            this.b.a(f);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setGreenScreenFile(String str) {
        TXCLog.d("TXBeautyManager", "setGreenScreenFile path:" + str);
        this.d.B = str;
        if (Build.VERSION.SDK_INT < 18) {
            TXCLog.e("TXBeautyManager", "setGreenScreenFile system version below 18");
        } else if (!this.a.a()) {
            TXCLog.e("TXBeautyManager", "setGreenScreenFile is only supported in EnterprisePro license");
        } else if (this.b != null) {
            this.b.a(str, true);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyLevel(float f) {
        TXCLog.d("TXBeautyManager", "setBeautyLevel beautyLevel:" + f);
        this.d.a = (int) f;
        if (this.b == null || !this.e) {
            return;
        }
        this.b.c(this.d.a);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWhitenessLevel(float f) {
        TXCLog.d("TXBeautyManager", "setWhitenessLevel whitenessLevel:" + f);
        this.d.b = (int) f;
        if (this.b == null || !this.e) {
            return;
        }
        this.b.d(this.d.b);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void enableSharpnessEnhancement(boolean z) {
        TXCLog.d("TXBeautyManager", "enableSharpnessEnhancement enable: %b", Boolean.valueOf(z));
        this.d.d = z ? 4 : 0;
        if (this.b == null || !this.e) {
            return;
        }
        this.b.f(this.d.d);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setRuddyLevel(float f) {
        TXCLog.d("TXBeautyManager", "setRuddyLevel ruddyLevel:" + f);
        this.d.c = (int) f;
        if (this.b == null || !this.e) {
            return;
        }
        this.b.e(this.d.c);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeScaleLevel(float f) {
        TXCLog.d("TXBeautyManager", "setEyeScaleLevel eyeScaleLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.e = a(f, 15);
        if (this.b != null) {
            this.b.g(this.d.e);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceSlimLevel(float f) {
        TXCLog.d("TXBeautyManager", "setFaceSlimLevel faceSlimLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.f = a(f, 15);
        if (this.b != null) {
            this.b.h(this.d.f);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceVLevel(float f) {
        TXCLog.d("TXBeautyManager", "setFaceVLevel faceVLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.g = a(f, 15);
        if (this.b != null) {
            this.b.i(this.d.g);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setChinLevel(float f) {
        TXCLog.d("TXBeautyManager", "setChinLevel chinLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.h = a(f, 15);
        if (this.b != null) {
            this.b.k(this.d.h);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceShortLevel(float f) {
        TXCLog.d("TXBeautyManager", "setFaceShortLevel faceShortLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.i = a(f, 15);
        if (this.b != null) {
            this.b.j(this.d.i);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setNoseSlimLevel(float f) {
        TXCLog.d("TXBeautyManager", "setNoseSlimLevel noseSlimLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.j = a(f, 15);
        if (this.b != null) {
            this.b.l(this.d.j);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeLightenLevel(float f) {
        TXCLog.d("TXBeautyManager", "setEyeLightenLevel eyeLightenLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.k = a(f, 10);
        if (this.b != null) {
            this.b.m(this.d.k);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setToothWhitenLevel(float f) {
        TXCLog.d("TXBeautyManager", "setToothWhitenLevel toothWhitenLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.l = a(f, 10);
        if (this.b != null) {
            this.b.n(this.d.l);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWrinkleRemoveLevel(float f) {
        TXCLog.d("TXBeautyManager", "setWrinkleRemoveLevel wrinkleRemoveLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.m = a(f, 10);
        if (this.b != null) {
            this.b.o(this.d.m);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setPounchRemoveLevel(float f) {
        TXCLog.d("TXBeautyManager", "setPounchRemoveLevel pounchRemoveLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.n = a(f, 10);
        if (this.b != null) {
            this.b.p(this.d.n);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setSmileLinesRemoveLevel(float f) {
        TXCLog.d("TXBeautyManager", "setSmileLinesRemoveLevel smileLinesRemoveLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.o = a(f, 10);
        if (this.b != null) {
            this.b.q(this.d.o);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setForeheadLevel(float f) {
        TXCLog.d("TXBeautyManager", "setForeheadLevel foreheadLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.p = a(f, 10);
        if (this.b != null) {
            this.b.r(this.d.p);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeDistanceLevel(float f) {
        TXCLog.d("TXBeautyManager", "setEyeDistanceLevel eyeDistanceLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.q = a(f, 10);
        if (this.b != null) {
            this.b.s(this.d.q);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setEyeAngleLevel(float f) {
        TXCLog.d("TXBeautyManager", "setEyeAngleLevel eyeAngleLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.r = a(f, 10);
        if (this.b != null) {
            this.b.t(this.d.r);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMouthShapeLevel(float f) {
        TXCLog.d("TXBeautyManager", "setMouthShapeLevel mouthShapeLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.s = a(f, 10);
        if (this.b != null) {
            this.b.u(this.d.s);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setNoseWingLevel(float f) {
        TXCLog.d("TXBeautyManager", "setNoseWingLevel noseWingLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.t = a(f, 10);
        if (this.b != null) {
            this.b.v(this.d.t);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setNosePositionLevel(float f) {
        TXCLog.d("TXBeautyManager", "setNosePositionLevel nosePositionLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.u = a(f, 10);
        if (this.b != null) {
            this.b.w(this.d.u);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setLipsThicknessLevel(float f) {
        TXCLog.d("TXBeautyManager", "setLipsThicknessLevel lipsThicknessLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.v = a(f, 10);
        if (this.b != null) {
            this.b.x(this.d.v);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFaceBeautyLevel(float f) {
        TXCLog.d("TXBeautyManager", "setFaceBeautyLevel faceBeautyLevel:" + f);
        if (!this.a.a()) {
            TXCLog.i("TXBeautyManager", "support EnterPrise above!!!");
            return;
        }
        this.d.w = a(f, 10);
        if (this.b != null) {
            this.b.y(this.d.w);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionTmpl(String str) {
        TXCLog.d("TXBeautyManager", "setMotionTmpl tmplPath:" + str);
        this.d.x = str;
        if (this.b != null) {
            this.b.a(str);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionMute(boolean z) {
        TXCLog.d("TXBeautyManager", "setMotionMute motionMute:" + z);
        this.d.y = z;
        if (this.b != null) {
            this.b.c(z);
        }
    }

    private int a(float f, int i) {
        return Math.round(f * i);
    }
}
