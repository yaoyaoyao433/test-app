package com.meituan.android.edfu.mbar.camera.decode;

import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.edfu.mbar.jni.JNIMbarDetect;
import com.meituan.android.edfu.mbar.util.g;
import com.meituan.android.edfu.mbar.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f {
    public static ChangeQuickRedirect a;
    public static RectF j;
    public int b;
    public c c;
    public Map<String, Integer> d;
    public String e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public int k;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1221f7f0b3d0de75af7183e661a314", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1221f7f0b3d0de75af7183e661a314");
            return;
        }
        this.b = 3;
        this.c = new c();
        this.d = new HashMap();
        this.e = f.class.getSimpleName();
        this.f = -2;
        this.g = 0L;
        this.h = false;
        this.i = false;
        this.k = 0;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e43ed6243af77261b34f48893008ff8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e43ed6243af77261b34f48893008ff8")).intValue();
        }
        c cVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "76638112268e746c900fcd9d9ef99610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "76638112268e746c900fcd9d9ef99610");
        } else {
            cVar.i = 0L;
        }
        try {
            if (this.g == 0) {
                this.g = JNIMbarDetect.objInit();
            }
            new StringBuilder("~~init scanFormat ").append(com.meituan.android.edfu.mbar.util.b.g);
            JNIMbarDetect.setScanFormat(this.g, com.meituan.android.edfu.mbar.util.b.g);
            this.k = com.meituan.android.edfu.mbar.util.b.g;
            this.f = JNIMbarDetect.loadModel(this.g, g.b);
            this.i = true;
        } catch (Throwable th) {
            m.a().a("detector", th.getMessage());
            th.printStackTrace();
        }
        new StringBuilder("~~init model ").append(this.f);
        if (this.f == 0) {
            this.h = true;
        }
        return this.f;
    }

    public final float b() {
        float[] detectResult;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e31d2f678e6f969b7d24e33788c67382", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e31d2f678e6f969b7d24e33788c67382")).floatValue();
        }
        float f = -1.0f;
        try {
            if (this.g == 0 || (detectResult = JNIMbarDetect.getDetectResult(this.g)) == null || this.c == null) {
                return -1.0f;
            }
            c cVar = this.c;
            Object[] objArr2 = {detectResult};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            try {
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "00068e2ba664495a66d5c277caf1a1d3", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Float) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "00068e2ba664495a66d5c277caf1a1d3")).floatValue();
                }
                if (cVar.j == 0) {
                    cVar.j = System.currentTimeMillis();
                    return -1.0f;
                }
                if (System.currentTimeMillis() - cVar.j >= cVar.f && cVar.g != 0 && cVar.h != 0 && ((int) detectResult[0]) != 0) {
                    float f2 = 0.0f;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (cVar.i == 0) {
                        cVar.i = System.currentTimeMillis();
                    }
                    long j2 = currentTimeMillis - cVar.i;
                    int i = 0;
                    float f3 = 999.0f;
                    for (char c = 0; i < ((int) detectResult[c]); c = 0) {
                        int i2 = i * 6;
                        float f4 = detectResult[i2 + 1];
                        float f5 = detectResult[i2 + 2];
                        float f6 = detectResult[i2 + 3];
                        float f7 = detectResult[i2 + 4];
                        float abs = Math.abs(((f4 + f6) / 2.0f) - (cVar.g / 2));
                        float abs2 = Math.abs(((f5 + f7) / 2.0f) - (cVar.h / 2));
                        float abs3 = Math.abs((f6 - f4) / 2.0f);
                        float abs4 = Math.abs((f7 - f5) / 2.0f);
                        f3 = Math.min(Math.min(Math.min(((cVar.g * (1.0f - c.c)) / 2.0f) / (abs3 + abs), ((cVar.h * (1.0f - c.c)) / 2.0f) / (abs4 + abs2)), c.b / Math.max((abs3 * 2.0f) / cVar.g, (abs4 * 2.0f) / cVar.h)), f3);
                        i++;
                        f2 = ((f2 * i) + detectResult[i2 + 5]) / i;
                    }
                    if (j2 < cVar.e || f2 <= c.d) {
                        return -1.0f;
                    }
                    cVar.i = System.currentTimeMillis();
                    return f3;
                }
                return -1.0f;
            } catch (Throwable th) {
                th = th;
                f = -1.0f;
                m.a().a("detector", th.getMessage());
                Log.e(this.e, th.toString());
                return f;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f1a0cf72a6c52d628041f4820d43955", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f1a0cf72a6c52d628041f4820d43955")).intValue();
        }
        if (this.g != 0) {
            try {
                return (int) JNIMbarDetect.getDetectResult(this.g)[6];
            } catch (Throwable unused) {
                return -1;
            }
        }
        return -1;
    }

    public final String a(com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3a06953df0bae1284d23ebda62711d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3a06953df0bae1284d23ebda62711d3");
        }
        if (this.c != null && eVar != null) {
            this.c.a(eVar.b, eVar.c);
        }
        a(j, eVar);
        if (this.f == 0 && this.g != 0) {
            m.o = true;
            return d(eVar);
        } else if (this.g != 0) {
            m.o = false;
            return d(eVar);
        } else {
            return null;
        }
    }

    private String d(com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10992e76382cbacf74d9d7f27da2a57a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10992e76382cbacf74d9d7f27da2a57a");
        }
        try {
            if (this.k != com.meituan.android.edfu.mbar.util.b.g) {
                JNIMbarDetect.setScanFormat(this.g, com.meituan.android.edfu.mbar.util.b.g);
                this.k = com.meituan.android.edfu.mbar.util.b.g;
            }
            JNIMbarDetect.setScanPriority(this.g, com.meituan.android.edfu.mbar.util.b.i);
        } catch (Throwable th) {
            m.a().a("detector", th.getMessage());
        }
        String str = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (eVar.f.length != ((eVar.b * eVar.c) * 3) / 2) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = JNIMbarDetect.detect(this.g, eVar.f, eVar.b, eVar.c, eVar.d, eVar.e, eVar.i, eVar.j);
        try {
            if (!TextUtils.isEmpty(str2)) {
                new StringBuilder().append(System.currentTimeMillis() - currentTimeMillis);
            }
        } catch (Throwable th3) {
            str = str2;
            th = th3;
            m.a().a("detector", th.getMessage());
            Log.e(this.e, th.toString());
            str2 = str;
            return a(str2);
        }
        return a(str2);
    }

    public final List<MBarResult> b(com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e366c16d93bc88bbf9db6fbe6e59e50e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e366c16d93bc88bbf9db6fbe6e59e50e");
        }
        ArrayList arrayList = new ArrayList();
        if (this.c != null && eVar != null) {
            this.c.a(eVar.b, eVar.c);
        }
        a(j, eVar);
        if (this.f == 0 && this.g != 0) {
            m.o = true;
            return e(eVar);
        } else if (this.g != 0) {
            m.o = false;
            return e(eVar);
        } else {
            return arrayList;
        }
    }

    private List<MBarResult> e(com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        List<MBarResult> list;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842d349101068e3039257bf3821d6ce5", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842d349101068e3039257bf3821d6ce5");
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (this.k != com.meituan.android.edfu.mbar.util.b.g) {
                JNIMbarDetect.setScanFormat(this.g, com.meituan.android.edfu.mbar.util.b.g);
                this.k = com.meituan.android.edfu.mbar.util.b.g;
            }
            JNIMbarDetect.setScanPriority(this.g, com.meituan.android.edfu.mbar.util.b.i);
        } catch (Throwable unused) {
        }
        if (eVar.f.length != ((eVar.b * eVar.c) * 3) / 2) {
            return null;
        }
        try {
            list = JNIMbarDetect.multiCodeDetect(this.g, eVar.f, eVar.b, eVar.c, eVar.d, eVar.e, eVar.i, eVar.j, com.meituan.android.edfu.mbar.util.b.h);
        } catch (Throwable th) {
            Log.e(this.e, th.getMessage());
            m.a().a("detector", th.getMessage());
            list = arrayList;
        }
        m.o = true;
        return list;
    }

    public final String c(com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        String str;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a766102c64df8fba08a980d1de22fbb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a766102c64df8fba08a980d1de22fbb1");
        }
        if (this.g == 0 ? g.a() : false) {
            try {
                this.g = JNIMbarDetect.objInit();
            } catch (Throwable th) {
                m.a().a("detector", th.getMessage());
            }
        }
        if (this.f != 0) {
            this.f = JNIMbarDetect.loadModel(this.g, g.b);
        }
        if (this.g != 0) {
            new StringBuilder("相册扫码 ").append(this.f);
            try {
                if (j != null) {
                    a(new RectF(0.0f, 0.0f, 1.0f, 1.0f), eVar);
                }
                JNIMbarDetect.setAlbumDecodeMode(this.g, com.meituan.android.edfu.mbar.util.b.l);
                str = JNIMbarDetect.detect(this.g, eVar.f, eVar.b, eVar.c, eVar.d, eVar.e, eVar.i, eVar.j);
            } catch (Throwable th2) {
                m.a().a("detector", th2.getMessage());
                th2.getMessage();
                str = null;
            }
            new StringBuilder("edfu mbar android decoder:").append(str);
            JNIMbarDetect.setAlbumDecodeMode(this.g, com.meituan.android.edfu.mbar.util.b.k);
            return str;
        }
        return null;
    }

    private String a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8056c2b264833184920bd6feac3a28fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8056c2b264833184920bd6feac3a28fd");
        }
        if (c() == 64 || c() == 57 || c() == 0) {
            return str;
        }
        this.b = this.b % 2 == 0 ? this.b + 1 : this.b;
        int i2 = -1;
        for (Map.Entry<String, Integer> entry : this.d.entrySet()) {
            i += entry.getValue().intValue();
        }
        String str2 = null;
        if (i >= this.b) {
            for (Map.Entry<String, Integer> entry2 : this.d.entrySet()) {
                if (entry2.getValue().intValue() > i2) {
                    i2 = entry2.getValue().intValue();
                    str2 = entry2.getKey();
                }
            }
            this.d.clear();
            return str2;
        }
        if (str != null && !str.isEmpty()) {
            if (this.d.get(str) == null) {
                this.d.put(str, 1);
            } else {
                this.d.put(str, Integer.valueOf(this.d.get(str).intValue() + 1));
            }
        }
        return null;
    }

    public final boolean d() {
        return this.f == 0;
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd0c6a12c72e3c2ea31cccfaeac957f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd0c6a12c72e3c2ea31cccfaeac957f6")).intValue();
        }
        if (this.g != 0) {
            return JNIMbarDetect.getAverageDetectTime(this.g);
        }
        return 0;
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b0424e8aa2024d29e34f7c876bd7eb9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b0424e8aa2024d29e34f7c876bd7eb9")).intValue();
        }
        if (this.g != 0) {
            return JNIMbarDetect.getAverageDecodeTime(this.g);
        }
        return 0;
    }

    public final float[] g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566cdd66bc35caf0d5af5c439701519c", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566cdd66bc35caf0d5af5c439701519c");
        }
        if (this.g != 0) {
            try {
                return JNIMbarDetect.getDetectResult(this.g);
            } catch (Throwable th) {
                Log.e(this.e, th.toString());
                m.a().a("detector", th.getMessage());
                return null;
            }
        }
        return null;
    }

    public final float h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3923f6993902113edd8122d741c0b52", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3923f6993902113edd8122d741c0b52")).floatValue();
        }
        if (this.f != 0 || this.g == 0) {
            return -1.0f;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            float codeBrightness = JNIMbarDetect.getCodeBrightness(this.g);
            new StringBuilder("brightness cost time (ms) ").append(System.currentTimeMillis() - currentTimeMillis);
            return codeBrightness;
        } catch (Throwable th) {
            m.a().a("detector", th.getMessage());
            return -1.0f;
        }
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6737f12ea9a663c818b788706456c03c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6737f12ea9a663c818b788706456c03c");
            return;
        }
        if (this.g != 0) {
            try {
                JNIMbarDetect.objFree(this.g);
            } catch (Throwable th) {
                Log.e(this.e, th.toString());
                m.a().a("detector", th.getMessage());
            }
            this.g = 0L;
            this.h = false;
            this.i = false;
        }
        super.finalize();
    }

    private void a(RectF rectF, com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        float f;
        float f2;
        float width;
        float height;
        Object[] objArr = {rectF, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a85004c3295a847274cbffbbe12f597d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a85004c3295a847274cbffbbe12f597d");
        } else if (rectF == null || eVar == null) {
        } else {
            if (eVar.e % 360 == 270) {
                f = rectF.top;
                f2 = (1.0f - rectF.left) - rectF.width();
                width = rectF.height();
                height = rectF.width();
            } else if (eVar.e % 360 == 180) {
                f = (1.0f - rectF.left) - rectF.width();
                f2 = (1.0f - rectF.top) - rectF.height();
                width = rectF.width();
                height = rectF.height();
            } else if (eVar.e % 360 == 90) {
                f = (1.0f - rectF.top) - rectF.height();
                f2 = rectF.left;
                width = rectF.height();
                height = rectF.width();
            } else if (eVar.e % 360 != 0) {
                return;
            } else {
                f = rectF.left;
                f2 = rectF.top;
                width = rectF.width();
                height = rectF.height();
            }
            float f3 = height;
            float f4 = f;
            float f5 = width;
            float f6 = f2;
            try {
                if (this.g != 0) {
                    JNIMbarDetect.setScanROI(this.g, f4, f6, f5, f3);
                }
            } catch (Throwable th) {
                m.a().a("detector", th.getMessage());
                Log.e(this.e, th.toString());
            }
        }
    }

    public final float i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c65129cf279a1fb0761f010beac3e26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c65129cf279a1fb0761f010beac3e26")).floatValue();
        }
        try {
            if (this.g != 0) {
                return JNIMbarDetect.getCodeClarity();
            }
            return 0.0f;
        } catch (Throwable th) {
            m.a().a("detector", th.getMessage());
            return 0.0f;
        }
    }
}
