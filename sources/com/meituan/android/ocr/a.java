package com.meituan.android.ocr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.hardware.Camera;
import android.support.constraint.R;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends SurfaceView implements SurfaceHolder.Callback {
    public static ChangeQuickRedirect a;
    public Context b;
    @SuppressLint({"ViewConstructor"})
    private Camera c;
    private Paint d;
    private RectF e;
    private Path f;
    private Path g;
    private String h;
    private CornerPathEffect i;
    private float j;
    private boolean k;
    private int l;
    private float m;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public a(Context context, Camera camera, float f, float f2) {
        super(context);
        Object[] objArr = {context, camera, Float.valueOf(0.0f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233ae4445c3238560311fa814961ac00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233ae4445c3238560311fa814961ac00");
            return;
        }
        this.c = null;
        this.d = null;
        this.k = true;
        this.c = camera;
        this.j = 0.0f;
        this.b = context;
        this.m = f2;
        this.f = new Path();
        this.h = context.getString(R.string.cardocr__camera_ocr_bankcard_tip1);
        this.e = new RectF();
        this.i = new CornerPathEffect(aj.a(context, 2.0f));
        this.d = new Paint();
        this.g = new Path();
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
        holder.setType(3);
        holder.setFixedSize(this.c.getParameters().getPreviewSize().width, this.c.getParameters().getPreviewSize().height);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae2c3de81a817ccd27d11900c9ebd48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae2c3de81a817ccd27d11900c9ebd48");
            return;
        }
        try {
            this.c.setPreviewDisplay(surfaceHolder);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraScanFrame_surfaceCreated").a("message", e.getMessage()).b);
        }
        setWillNotDraw(false);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d07bc4e9b28ef41054074d1c1e8a1148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d07bc4e9b28ef41054074d1c1e8a1148");
            return;
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.l = measuredWidth;
        float f = measuredHeight;
        float f2 = measuredWidth;
        if (f < f2 / this.m) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 / this.m), 1073741824));
        } else {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) (f * this.m), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    @Override // android.view.View
    @MTPaySuppressFBWarnings({"ICAST_IDIV_CAST_TO_DOUBLE"})
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a4733bc762afec0dfe239dd05acf321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a4733bc762afec0dfe239dd05acf321");
        } else if (this.k) {
            getWidth();
            int height = getHeight();
            int a2 = aj.a(getContext(), 15.0f);
            int i = ((this.l - (a2 * 2)) * 5398) / 8560;
            int i2 = (int) (((height - i) / 2) - (this.j * height));
            int i3 = (this.l - 1) - a2;
            int i4 = i2 + i;
            Object[] objArr2 = {Integer.valueOf(a2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85f1374cc8f938ac733c424d30cc95ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85f1374cc8f938ac733c424d30cc95ca");
            } else {
                this.e.left = a2;
                this.e.top = i2;
                this.e.right = i3;
                this.e.bottom = i4;
            }
            RectF rectF = this.e;
            Object[] objArr3 = {rectF, canvas};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4847efcf024bdea0957fe951baeb3d81", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4847efcf024bdea0957fe951baeb3d81");
            } else if (canvas != null) {
                canvas.save();
                this.f.reset();
                this.f.addRoundRect(this.e, 0.0f, 0.0f, Path.Direction.CW);
                canvas.clipPath(this.f, Region.Op.DIFFERENCE);
                this.d.setColor(getResources().getColor(R.color.paybase__camera_preview_background));
                this.d.setStyle(Paint.Style.FILL);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
                this.d.setColor(getResources().getColor(R.color.paybase__white));
                int a3 = aj.a(this.b, 2.0f);
                rectF.left -= 1.0f;
                rectF.top -= 1.0f;
                rectF.right += 1.0f;
                rectF.bottom += 1.0f;
                float f = a3;
                canvas.drawRoundRect(rectF, f, f, this.d);
                this.d.setStyle(Paint.Style.STROKE);
                canvas.restore();
            }
            int a4 = i4 + aj.a(this.b, 30.0f);
            Object[] objArr4 = {Integer.valueOf(a4), canvas};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "45bc78b68ff908742469548e22111a70", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "45bc78b68ff908742469548e22111a70");
            } else if (canvas != null) {
                this.d.reset();
                this.d.setColor(getResources().getColor(R.color.cardocr_scan_bankcard_hint_text));
                this.d.setTextSize(getResources().getDimensionPixelSize(R.dimen.paybase__camera_preview_text_size));
                this.d.setAntiAlias(true);
                canvas.drawText(this.h, 0, this.h.length(), (this.l - ((int) this.d.measureText(this.h))) / 2, a4, this.d);
            }
            Object[] objArr5 = {Integer.valueOf(a2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), canvas};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e4850f431178c641e976e699059f70e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e4850f431178c641e976e699059f70e8");
            } else if (canvas != null) {
                int a5 = aj.a(this.b, 16.0f);
                this.d.reset();
                this.d.setAntiAlias(true);
                this.d.setColor(getResources().getColor(R.color.paybase__base_green));
                this.d.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.paybase__camera_preview_guide_stoke));
                this.d.setStyle(Paint.Style.STROKE);
                this.d.setPathEffect(this.i);
                int i5 = a2 + 1;
                int i6 = i2 + 1;
                int i7 = i3 - 1;
                int i8 = i4 - 1;
                this.g.reset();
                float f2 = i5 + a5;
                float f3 = i6;
                this.g.moveTo(f2, f3);
                float f4 = i5;
                this.g.lineTo(f4, f3);
                float f5 = i6 + a5;
                this.g.lineTo(f4, f5);
                float f6 = i7 - a5;
                this.g.moveTo(f6, f3);
                float f7 = i7;
                this.g.lineTo(f7, f3);
                this.g.lineTo(f7, f5);
                float f8 = i8 - a5;
                this.g.moveTo(f4, f8);
                float f9 = i8;
                this.g.lineTo(f4, f9);
                this.g.lineTo(f2, f9);
                this.g.moveTo(f6, f9);
                this.g.lineTo(f7, f9);
                this.g.lineTo(f7, f8);
                canvas.drawPath(this.g, this.d);
            }
        }
    }
}
