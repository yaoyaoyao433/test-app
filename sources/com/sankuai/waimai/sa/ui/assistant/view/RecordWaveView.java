package com.sankuai.waimai.sa.ui.assistant.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.ColorInt;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RecordWaveView extends SurfaceView implements SurfaceHolder.Callback {
    public static ChangeQuickRedirect a;
    volatile b b;
    List<d> c;
    Handler d;
    private Context e;
    private DisplayMetrics f;
    private SurfaceHolder g;
    private int h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private int n;
    private int o;
    private Paint p;
    private c q;
    private a r;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        int b();
    }

    public static /* synthetic */ float[][] a(RecordWaveView recordWaveView, float[][] fArr, d dVar) {
        char c2 = 2;
        char c3 = 1;
        Object[] objArr = {fArr, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, recordWaveView, changeQuickRedirect, false, "c49eaf08bd349318931368efbfb7f63c", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[][]) PatchProxy.accessDispatch(objArr, recordWaveView, changeQuickRedirect, false, "c49eaf08bd349318931368efbfb7f63c");
        }
        int i = 0;
        while (i < fArr.length) {
            if (fArr[i][0] == 0.0f) {
                float f = i;
                fArr[i][0] = (recordWaveView.k * f) + (recordWaveView.l * f);
            }
            float f2 = recordWaveView.i;
            if (dVar != null) {
                int i2 = dVar.a;
                int i3 = dVar.b;
                float f3 = fArr[i][0];
                Object[] objArr2 = new Object[3];
                objArr2[0] = Integer.valueOf(i2);
                objArr2[c3] = Integer.valueOf(i3);
                objArr2[c2] = Float.valueOf(f3);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, recordWaveView, changeQuickRedirect2, false, "7dba8275fbb6ae8497eefd2792a3659b", RobustBitConfig.DEFAULT_VALUE)) {
                    f2 = ((Float) PatchProxy.accessDispatch(objArr2, recordWaveView, changeQuickRedirect2, false, "7dba8275fbb6ae8497eefd2792a3659b")).floatValue();
                } else {
                    float f4 = recordWaveView.j * i2;
                    if (f3 <= f4 - recordWaveView.m || f3 >= f4) {
                        f2 = recordWaveView.i;
                    } else {
                        double sin = Math.sin((((f3 + recordWaveView.m) - f4) / recordWaveView.m) * 3.141592653589793d);
                        f2 = (float) ((sin * sin * i3) + recordWaveView.i);
                    }
                }
            }
            float[] fArr2 = fArr[i];
            if (fArr[i][1] > f2) {
                f2 = fArr[i][1];
            }
            fArr2[1] = f2;
            i++;
            c2 = 2;
            c3 = 1;
        }
        return fArr;
    }

    public RecordWaveView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6142f3a40ed04605e734715a3775589", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6142f3a40ed04605e734715a3775589");
        }
    }

    public RecordWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f77f1b162a36853afab3f6670cbd1146", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f77f1b162a36853afab3f6670cbd1146");
        }
    }

    public RecordWaveView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1efe1098e1973e3d8dfd7ba3c1cb28c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1efe1098e1973e3d8dfd7ba3c1cb28c3");
        }
    }

    public RecordWaveView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a96a921aaa6981395f8d9126ca739db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a96a921aaa6981395f8d9126ca739db");
            return;
        }
        this.h = 200;
        this.c = new ArrayList();
        this.d = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.sa.ui.assistant.view.RecordWaveView.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee5170e00a9c8f43471f39668bf7b703", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee5170e00a9c8f43471f39668bf7b703");
                    return;
                }
                switch (message.what) {
                    case 1:
                        if (RecordWaveView.this.q != null && RecordWaveView.this.b != null) {
                            int b2 = !RecordWaveView.this.b.f ? RecordWaveView.this.q.b() : 0;
                            if (b2 > 0) {
                                d dVar = new d();
                                dVar.a = 0;
                                dVar.b = b2 + 4;
                                RecordWaveView.this.c.add(dVar);
                            } else {
                                d dVar2 = new d();
                                dVar2.a = 0;
                                dVar2.b = 4;
                                RecordWaveView.this.c.add(dVar2);
                            }
                        }
                        sendEmptyMessageDelayed(3, 10L);
                        return;
                    case 2:
                        if (RecordWaveView.this.q != null && RecordWaveView.this.b != null) {
                            int b3 = !RecordWaveView.this.b.f ? RecordWaveView.this.q.b() : 0;
                            if (b3 > 0) {
                                d dVar3 = new d();
                                dVar3.a = 0;
                                dVar3.b = b3 + 4;
                                RecordWaveView.this.c.add(dVar3);
                            }
                        }
                        sendEmptyMessageDelayed(3, 10L);
                        return;
                    case 3:
                        if (RecordWaveView.this.b != null) {
                            synchronized (RecordWaveView.this.b) {
                                RecordWaveView.this.b.notify();
                            }
                            return;
                        }
                        return;
                    case 4:
                        if (RecordWaveView.this.r != null) {
                            RecordWaveView.this.r.a();
                        }
                        RecordWaveView recordWaveView = RecordWaveView.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = RecordWaveView.a;
                        if (PatchProxy.isSupport(objArr3, recordWaveView, changeQuickRedirect3, false, "83dca45ddc0283c03d3b767aa6d37c37", RobustBitConfig.DEFAULT_VALUE)) {
                            ((Boolean) PatchProxy.accessDispatch(objArr3, recordWaveView, changeQuickRedirect3, false, "83dca45ddc0283c03d3b767aa6d37c37")).booleanValue();
                            return;
                        }
                        recordWaveView.d.removeCallbacksAndMessages(null);
                        recordWaveView.c.clear();
                        if (recordWaveView.b != null) {
                            recordWaveView.b.d = false;
                            recordWaveView.b.e = false;
                            recordWaveView.b = null;
                            return;
                        }
                        return;
                    case 5:
                        if (RecordWaveView.this.r != null) {
                            a unused = RecordWaveView.this.r;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        this.e = context;
        Object[] objArr2 = {attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daede9f53d63ba7d7e9312e019f69e86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daede9f53d63ba7d7e9312e019f69e86");
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingMiddle, R.attr.pointSpacing, R.attr.pointWidth, R.attr.defaultWaveHeight, R.attr.wavePointStartColor, R.attr.wavePointEndColor, R.attr.wavePointColor}, i, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(3, a(1.0f));
        this.k = obtainStyledAttributes.getDimensionPixelSize(1, a(8.0f));
        this.l = obtainStyledAttributes.getDimensionPixelSize(2, a(3.0f));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 16762180);
        this.n = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.o = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        this.m = (this.k + this.l) * 8.0f;
        this.j = this.m / 12.0f;
        this.g = getHolder();
        this.g.addCallback(this);
        setZOrderOnTop(true);
        getHolder().setFormat(-3);
        this.p = new Paint();
        this.p.setAntiAlias(true);
        this.p.setStrokeWidth(this.l);
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeCap(Paint.Cap.ROUND);
        this.n = -16719105;
        this.o = -16727553;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.g = surfaceHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Object[] objArr = {surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e9beb343cc2682f5352547f7e2e8a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e9beb343cc2682f5352547f7e2e8a0d");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c("RecordWaveView", "surfaceChanged done ", new Object[0]);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1566208b17abc85453834e42b3ea189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1566208b17abc85453834e42b3ea189");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("RecordWaveView", "surfaceDestroyed done ", new Object[0]);
        if (this.b != null) {
            this.b.e = false;
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79337fe2dea170db5393cdca3f4dc72a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79337fe2dea170db5393cdca3f4dc72a")).booleanValue();
        }
        setVisibility(0);
        if (this.b != null) {
            this.d.removeCallbacksAndMessages(null);
            synchronized (this.b) {
                this.b.e = false;
                this.b.notify();
            }
        }
        this.c.clear();
        this.b = new b(this.g);
        this.b.c = true;
        this.b.d = false;
        this.b.start();
        return true;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "decd54a2332790a462091bb216aa4ae1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "decd54a2332790a462091bb216aa4ae1")).booleanValue();
        }
        if (this.b != null) {
            this.b.c = false;
            this.b.d = true;
            return true;
        }
        return false;
    }

    public void setRecordWaveInjector(c cVar) {
        this.q = cVar;
    }

    public void setAnimationListener(a aVar) {
        this.r = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d {
        public int a;
        public int b;

        public d() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends Thread {
        public static ChangeQuickRedirect a;
        public volatile int b;
        public volatile boolean c;
        public volatile boolean d;
        public volatile boolean e;
        public volatile boolean f;
        private SurfaceHolder h;
        private volatile int i;
        private volatile int j;

        public b(SurfaceHolder surfaceHolder) {
            Object[] objArr = {RecordWaveView.this, surfaceHolder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e718511d97bf477933eb7a991bacfd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e718511d97bf477933eb7a991bacfd");
                return;
            }
            this.b = 0;
            this.c = false;
            this.d = false;
            this.h = surfaceHolder;
            this.e = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x022d -> B:63:0x022e). Please submit an issue!!! */
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Canvas lockCanvas;
            int i = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed516b63051d9b11f9803d5b75e3f0d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed516b63051d9b11f9803d5b75e3f0d4");
                return;
            }
            while (this.e) {
                if (this.c && this.b >= 10) {
                    Message obtainMessage = RecordWaveView.this.d.obtainMessage();
                    obtainMessage.what = 5;
                    this.c = i;
                    RecordWaveView.this.d.sendMessageAtFrontOfQueue(obtainMessage);
                }
                Canvas canvas = null;
                if (this.d && this.b <= 0) {
                    RecordWaveView.this.d.removeCallbacks(null);
                    Message obtainMessage2 = RecordWaveView.this.d.obtainMessage();
                    obtainMessage2.what = 4;
                    this.e = i;
                    RecordWaveView.this.d.sendMessageAtFrontOfQueue(obtainMessage2);
                    return;
                }
                Object[] objArr2 = new Object[i];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72292fb9a928cc8105e857760b91dfa7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, i, "72292fb9a928cc8105e857760b91dfa7");
                } else {
                    try {
                        try {
                            synchronized (this.h) {
                                try {
                                    if (this.c) {
                                        if (this.b < 10) {
                                            this.b++;
                                        } else {
                                            this.b = 10;
                                        }
                                    }
                                    if (this.d) {
                                        if (this.b > 0) {
                                            this.b--;
                                        } else {
                                            this.b = i;
                                        }
                                        RecordWaveView.this.c.clear();
                                    }
                                    lockCanvas = this.h.lockCanvas();
                                    try {
                                        int paddingLeft = RecordWaveView.this.getPaddingLeft();
                                        int paddingTop = RecordWaveView.this.getPaddingTop();
                                        int paddingRight = RecordWaveView.this.getPaddingRight();
                                        int height = ((lockCanvas.getHeight() - paddingTop) - RecordWaveView.this.getPaddingBottom()) / 2;
                                        int width = (((lockCanvas.getWidth() - paddingLeft) - paddingRight) - RecordWaveView.this.h) / 2;
                                        float f = width;
                                        float[][] fArr = (float[][]) Array.newInstance(float.class, (int) (f / (RecordWaveView.this.k + RecordWaveView.this.l)), 2);
                                        int i2 = 0;
                                        boolean z = false;
                                        while (i2 < RecordWaveView.this.c.size()) {
                                            d dVar = (d) RecordWaveView.this.c.get(i2);
                                            if (dVar.a * RecordWaveView.this.j >= RecordWaveView.this.m + f) {
                                                RecordWaveView.this.c.remove(i2);
                                                i2--;
                                            } else {
                                                RecordWaveView.a(RecordWaveView.this, fArr, dVar);
                                                dVar.a++;
                                                z = true;
                                            }
                                            i2++;
                                        }
                                        if (!z) {
                                            RecordWaveView.a(RecordWaveView.this, fArr, null);
                                        }
                                        int i3 = width + paddingLeft;
                                        int i4 = (RecordWaveView.this.h / 2) + i3;
                                        lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                        float f2 = height + paddingTop;
                                        lockCanvas.scale(1.0f, this.b / 10.0f, i3, f2);
                                        int i5 = 0;
                                        while (i5 < fArr.length) {
                                            float f3 = f2 - fArr[i5][1];
                                            float f4 = fArr[i5][1] + f2;
                                            RecordWaveView.this.p.setShader(new LinearGradient(0.0f, f3, 0.0f, f4, RecordWaveView.this.n, RecordWaveView.this.o, Shader.TileMode.CLAMP));
                                            if (this.b <= 0) {
                                                RecordWaveView.this.p.setAlpha(0);
                                            } else {
                                                RecordWaveView.this.p.setAlpha(((int) ((this.b / 10.0f) * 170.0f)) + 85);
                                            }
                                            float f5 = i4;
                                            float f6 = (fArr[i5][0] * (this.b / 10.0f)) + f5 + (RecordWaveView.this.h / 2);
                                            float[][] fArr2 = fArr;
                                            lockCanvas.drawLine(f6, f3, f6, f4, RecordWaveView.this.p);
                                            float f7 = (f5 - (fArr2[i5][0] * (this.b / 10.0f))) - (RecordWaveView.this.h / 2);
                                            lockCanvas.drawLine(f7, f3, f7, f4, RecordWaveView.this.p);
                                            i5++;
                                            fArr = fArr2;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        canvas = lockCanvas;
                                        throw th;
                                        break;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            if (lockCanvas != null) {
                                try {
                                    this.h.unlockCanvasAndPost(lockCanvas);
                                } catch (IllegalArgumentException e) {
                                    com.sankuai.waimai.foundation.utils.log.a.a("RecordWaveView", e);
                                }
                            }
                        } catch (Throwable th3) {
                            if (canvas != null) {
                                try {
                                    this.h.unlockCanvasAndPost(canvas);
                                } catch (IllegalArgumentException e2) {
                                    com.sankuai.waimai.foundation.utils.log.a.a("RecordWaveView", e2);
                                }
                            }
                            throw th3;
                        }
                    } catch (Exception e3) {
                        com.sankuai.waimai.foundation.utils.log.a.a("RecordWaveView", e3);
                        if (canvas != null) {
                            this.h.unlockCanvasAndPost(canvas);
                        }
                    }
                }
                this.i++;
                Message obtainMessage3 = RecordWaveView.this.d.obtainMessage();
                synchronized (this) {
                    if (this.e) {
                        if (this.i / ((int) (RecordWaveView.this.m / RecordWaveView.this.j)) > 0) {
                            this.i = 0;
                            this.j = 0;
                            obtainMessage3.what = 1;
                            obtainMessage3.sendToTarget();
                        } else {
                            obtainMessage3.what = 3;
                            obtainMessage3.getTarget().sendMessageDelayed(obtainMessage3, 10L);
                        }
                        try {
                            wait();
                        } catch (InterruptedException e4) {
                            com.sankuai.waimai.foundation.utils.log.a.a("RecordWaveView", e4);
                        }
                    }
                }
                i = 0;
            }
        }
    }

    private int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1242242e908cdb8c1a8962cef6aecf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1242242e908cdb8c1a8962cef6aecf2")).intValue();
        }
        if (this.f == null) {
            this.f = this.e.getResources().getDisplayMetrics();
        }
        return (int) TypedValue.applyDimension(1, f, this.f);
    }

    public void setWaveColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af52eceb32d4443d98d0147b5f9d1c3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af52eceb32d4443d98d0147b5f9d1c3a");
            return;
        }
        this.n = i;
        this.o = i;
    }
}
