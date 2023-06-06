package com.meituan.android.edfu.edfucamera.cameraview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.opengl.EGLContext;
import android.os.Build;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.android.edfu.camerainterface.camera.AspectRatio;
import com.meituan.android.edfu.camerainterface.cameraDevice.c;
import com.meituan.android.edfu.camerainterface.cameraOrientation.a;
import com.meituan.android.edfu.edfucamera.argorithm.d;
import com.meituan.android.edfu.edfupreviewer.api.b;
import com.meituan.android.edfu.edfupreviewer.surface.e;
import com.meituan.android.edfu.edfupreviewer.surface.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EdfuCameraView extends EdfuBaseCameraView implements c.b, a.InterfaceC0252a, e {
    public static ChangeQuickRedirect b;
    public static final int c = com.meituan.android.edfu.camerainterface.camera.a.a;
    public static final int d = com.meituan.android.edfu.camerainterface.camera.a.b;
    public final b e;
    private c f;
    private d g;
    private c.a h;
    private e i;
    private boolean j;
    private int k;
    private int l;
    private boolean m;
    private com.meituan.android.edfu.camerainterface.camera.b n;
    private boolean o;
    private final com.meituan.android.edfu.camerainterface.cameraOrientation.a p;
    private com.meituan.android.edfu.utils.b q;
    private List<a> r;
    private c.a s;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Facing {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public @interface Flash {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    public b a(Context context) {
        return null;
    }

    public void setZoom(int i) {
    }

    public static /* synthetic */ void a(EdfuCameraView edfuCameraView, int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, edfuCameraView, changeQuickRedirect, false, "ada2e4da88ba4fb08efaeb34f172bf96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, edfuCameraView, changeQuickRedirect, false, "ada2e4da88ba4fb08efaeb34f172bf96");
            return;
        }
        for (a aVar : edfuCameraView.r) {
            aVar.a(1);
        }
    }

    public static /* synthetic */ void a(EdfuCameraView edfuCameraView, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, edfuCameraView, changeQuickRedirect, false, "a31871b06d385ec027de6a8879196706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, edfuCameraView, changeQuickRedirect, false, "a31871b06d385ec027de6a8879196706");
        } else if (edfuCameraView.g != null) {
            edfuCameraView.g.a(bArr, i, i2, i3, i4, i5, i6, edfuCameraView.getFacing() == d);
        }
    }

    public static /* synthetic */ boolean a(EdfuCameraView edfuCameraView, boolean z) {
        edfuCameraView.m = true;
        return true;
    }

    public EdfuCameraView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07f88e97715b26a67e1d3eb410d30b0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07f88e97715b26a67e1d3eb410d30b0f");
        }
    }

    public EdfuCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab126a6e16cbc54875a793aa0400994", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab126a6e16cbc54875a793aa0400994");
        }
    }

    public EdfuCameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03f12573c85e2112c21821e2f4271ff1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03f12573c85e2112c21821e2f4271ff1");
            return;
        }
        this.m = false;
        this.o = false;
        this.s = new c.a() { // from class: com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.camerainterface.cameraDevice.c.a
            public final void a(byte[] bArr, int i2, int i3, int i4, int i5, int i6) {
                Object[] objArr2 = {bArr, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be0fda1227124b500684ebdef30d64af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be0fda1227124b500684ebdef30d64af");
                    return;
                }
                int i7 = 360 - i6;
                int i8 = EdfuCameraView.this.getFacing() == EdfuCameraView.d ? (EdfuCameraView.this.k + i7) % 360 : (i7 - EdfuCameraView.this.k) % 360;
                int i9 = EdfuCameraView.this.getFacing() == EdfuCameraView.d ? EdfuCameraView.this.k % 360 : (360 - EdfuCameraView.this.k) % 360;
                if (EdfuCameraView.this.o) {
                    EdfuCameraView.a(EdfuCameraView.this, bArr, i2, i3, i4, i8, i9, i5);
                } else {
                    EdfuCameraView.a(EdfuCameraView.this, bArr, i2, i3, i4, i7, 0, i5);
                }
                if (EdfuCameraView.this.h != null) {
                    EdfuCameraView.this.h.a(bArr, i2, i3, i4, i5, i7);
                }
            }
        };
        if (a(context) != null) {
            this.e = a(context);
        } else if (Build.VERSION.SDK_INT < 23) {
            this.e = new h(context);
        } else {
            this.e = new com.meituan.android.edfu.edfupreviewer.surface.b(context);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView((View) this.e, layoutParams);
        this.e.setRenderCallback(this);
        this.p = new com.meituan.android.edfu.camerainterface.cameraOrientation.a(context, this);
        this.f = new c(context, this.e);
        this.f.k = this;
        this.f.l = this.s;
        this.r = new ArrayList();
        this.g = new com.meituan.android.edfu.edfucamera.argorithm.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843038, R.attr.cameraFacing, R.attr.cameraRatio, R.attr.flashMode}, i, 2131559079);
        setAdjustViewBounds(obtainStyledAttributes.getBoolean(0, true));
        setFacing(obtainStyledAttributes.getInt(1, c));
        String string = obtainStyledAttributes.getString(2);
        setAspectRatio(string != null ? AspectRatio.a(string) : AspectRatio.b);
        setFlash(obtainStyledAttributes.getInt(3, 0));
        obtainStyledAttributes.recycle();
        this.q = new com.meituan.android.edfu.utils.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28580b4de67766f0fdd7c11c89dbf7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28580b4de67766f0fdd7c11c89dbf7d");
            return;
        }
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        com.meituan.android.edfu.camerainterface.cameraOrientation.a aVar = this.p;
        Display display = getDisplay();
        Object[] objArr2 = {display};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.edfu.camerainterface.cameraOrientation.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3ed1a0f562d8fd2bddda8834b8976fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3ed1a0f562d8fd2bddda8834b8976fb3");
            return;
        }
        aVar.f = display;
        aVar.c.enable();
        aVar.e = aVar.f.getRotation();
        aVar.d.a(com.meituan.android.edfu.camerainterface.cameraOrientation.a.b.get(aVar.e));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb73e658c26723cc784f866802cac3f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb73e658c26723cc784f866802cac3f8");
            return;
        }
        if (!isInEditMode()) {
            com.meituan.android.edfu.camerainterface.cameraOrientation.a aVar = this.p;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.edfu.camerainterface.cameraOrientation.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "13a19728f9a3ce168b79baaf83540ae7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "13a19728f9a3ce168b79baaf83540ae7");
            } else {
                aVar.c.disable();
                aVar.f = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // com.meituan.android.edfu.camerainterface.cameraOrientation.a.InterfaceC0252a
    public final void a(int i) {
        this.l = i;
    }

    @Override // com.meituan.android.edfu.camerainterface.cameraOrientation.a.InterfaceC0252a
    public final void b(int i) {
        this.k = i;
    }

    @Override // com.meituan.android.edfu.camerainterface.cameraDevice.c.b
    public final void a(Object obj, com.meituan.android.edfu.camerainterface.camera.b bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f45c41b03f8c46724a5165f894d48fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f45c41b03f8c46724a5165f894d48fb3");
            return;
        }
        this.e.a(bVar.b, bVar.c);
        this.e.a(this.l, this.p.b());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "452feb8c923b4934171d0f858dedb15f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "452feb8c923b4934171d0f858dedb15f");
        } else if (isInEditMode()) {
            super.onMeasure(i, i2);
        } else if (this.j) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                int size = (int) (View.MeasureSpec.getSize(i) * getAspectRatio().a());
                if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, View.MeasureSpec.getSize(i2));
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            } else if (mode != 1073741824 && mode2 == 1073741824) {
                int size2 = (int) (View.MeasureSpec.getSize(i2) * getAspectRatio().a());
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(size2, View.MeasureSpec.getSize(i));
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), i2);
            } else {
                super.onMeasure(i, i2);
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            AspectRatio aspectRatio = getAspectRatio();
            if (!this.p.b()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = AspectRatio.a;
                aspectRatio = PatchProxy.isSupport(objArr2, aspectRatio, changeQuickRedirect2, false, "5365020281551246c3dbdd29a94fd945", RobustBitConfig.DEFAULT_VALUE) ? (AspectRatio) PatchProxy.accessDispatch(objArr2, aspectRatio, changeQuickRedirect2, false, "5365020281551246c3dbdd29a94fd945") : AspectRatio.a(aspectRatio.d, aspectRatio.c);
            }
            if (measuredHeight < (aspectRatio.d * measuredWidth) / aspectRatio.c) {
                this.e.getView().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((measuredWidth * aspectRatio.d) / aspectRatio.c, 1073741824));
            } else {
                this.e.getView().measure(View.MeasureSpec.makeMeasureSpec((aspectRatio.c * measuredHeight) / aspectRatio.d, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d94139936bc5e829c5049371cd02388c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d94139936bc5e829c5049371cd02388c");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.n == null) {
            this.f.a(new com.meituan.android.edfu.camerainterface.camera.b(this.e.getViewWidth(), this.e.getViewHeight()));
        } else {
            this.f.a(this.n);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Rect rect;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a852de2c2d2aff9ac0ed0b041cd069", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a852de2c2d2aff9ac0ed0b041cd069")).booleanValue();
        }
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 1) {
            c cVar = this.f;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int width = getWidth();
            int height = getHeight();
            Object[] objArr2 = {Float.valueOf(x), Float.valueOf(y), Integer.valueOf(width), Integer.valueOf(height)};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "81f1c718487e06e93a36adc8aac429f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "81f1c718487e06e93a36adc8aac429f0");
                return true;
            } else if (!cVar.n || cVar.c == null) {
                return true;
            } else {
                Object[] objArr3 = {Float.valueOf(y), Float.valueOf(x), Float.valueOf(1.0f), Integer.valueOf(height), Integer.valueOf(width)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "62f6f1cbff6ddde86e6c04e403fb618c", RobustBitConfig.DEFAULT_VALUE)) {
                    rect = (Rect) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "62f6f1cbff6ddde86e6c04e403fb618c");
                } else {
                    int i = (int) (((y / height) * 2000.0f) - 1000.0f);
                    int i2 = (int) (((x / width) * 2000.0f) - 1000.0f);
                    int intValue = Float.valueOf(300.0f).intValue() / 2;
                    RectF rectF = new RectF(c.a(i - intValue, -1000, 1000), c.a(i2 - intValue, -1000, 1000), c.a(i + intValue, -1000, 1000), c.a(i2 + intValue, -1000, 1000));
                    rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                }
                if (cVar.c == null || cVar.p) {
                    return true;
                }
                try {
                    Camera.Parameters b2 = cVar.c.b();
                    cVar.c.c();
                    if (cVar.a(b2)) {
                        b2.setFocusMode("macro");
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(rect, 1000));
                    if (b2.getMaxNumFocusAreas() > 0) {
                        b2.setFocusAreas(arrayList);
                    }
                    cVar.c.a(b2);
                    cVar.c.a(cVar.q);
                    return true;
                } catch (Exception e) {
                    com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                    a2.a("CameraManager", "setFocusArea:" + e.getMessage());
                    return true;
                }
            }
        }
        return true;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b731b9eab2df97a5cdfa8906aefcd942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b731b9eab2df97a5cdfa8906aefcd942");
        } else {
            post(new Runnable() { // from class: com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08d139b15bbff94497ebe95debdbd2d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08d139b15bbff94497ebe95debdbd2d0");
                        return;
                    }
                    EdfuCameraView.this.f.c();
                    EdfuCameraView.a(EdfuCameraView.this, true);
                    EdfuCameraView.a(EdfuCameraView.this, 1);
                    com.meituan.android.edfu.utils.c.a().a("CameraView", "startpreview");
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e944149ac37b777463b47ba4a19d32f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e944149ac37b777463b47ba4a19d32f");
            return;
        }
        this.f.e();
        this.m = false;
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuBaseCameraView
    public void setPrivacyToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3a15c5adc0df97efa58dcfa16ff840", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3a15c5adc0df97efa58dcfa16ff840");
        } else if (this.f != null) {
            c cVar = this.f;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f95028eb8ffd4ea9026f499a124be129", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f95028eb8ffd4ea9026f499a124be129");
                return;
            }
            cVar.o = str;
            com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
            a2.a("CameraManager", "BID: " + str);
        }
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuBaseCameraView
    public void setFacing(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115b9481a8e6c91df8ef8b576cb95229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115b9481a8e6c91df8ef8b576cb95229");
            return;
        }
        c cVar = this.f;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "2a6b6d2159c9faa3b7ced8b7fa025a6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "2a6b6d2159c9faa3b7ced8b7fa025a6f");
        } else if (cVar.f != i) {
            cVar.f = i;
            if (cVar.f()) {
                cVar.d();
            }
        }
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuBaseCameraView
    public void setAspectRatio(AspectRatio aspectRatio) {
        Object[] objArr = {aspectRatio};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eedabe5b1385330bda37306552686f70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eedabe5b1385330bda37306552686f70");
        } else if (this.f.e.equals(aspectRatio)) {
        } else {
            this.f.a(aspectRatio);
            requestLayout();
        }
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {(byte) 1, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f74dd6790ad10edd468b34d4f15ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f74dd6790ad10edd468b34d4f15ffa");
            return;
        }
        c cVar = this.f;
        Object[] objArr2 = {(byte) 1, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "fe9de3d2cb70c00c95ca68b6ac6b73a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "fe9de3d2cb70c00c95ca68b6ac6b73a6");
        } else if (cVar.f()) {
            if (cVar.g && cVar.h) {
                return;
            }
            cVar.g = true;
            cVar.h = true;
            if (cVar.h && cVar.j != null && cVar.j.b) {
                cVar.j.b();
            }
            cVar.a(true, cVar.h);
            try {
                cVar.c.a(cVar.d);
            } catch (Exception e) {
                com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                a2.a("CameraManager", "setAutoFocus:" + e.getMessage());
            }
            if (cVar.h || cVar.j == null) {
                return;
            }
            cVar.j.a();
        } else {
            cVar.g = true;
            cVar.h = true;
        }
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuBaseCameraView
    public void setFlash(@Flash int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0dd2803983530a1bc0d76cbc9690974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0dd2803983530a1bc0d76cbc9690974");
            return;
        }
        c cVar = this.f;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "2375aee1698f77944a777466c495789b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "2375aee1698f77944a777466c495789b");
        } else if (cVar.f()) {
            if (cVar.i != i) {
                try {
                    if (cVar.b(i)) {
                        cVar.c.a(cVar.d);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            cVar.i = i;
        }
    }

    public int getFlash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f17f1af76d89833dc82c02946f167b5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f17f1af76d89833dc82c02946f167b5")).intValue() : this.f.i;
    }

    public void setAdjustViewBounds(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dd1870ed8acbc10446b5e40d706e85a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dd1870ed8acbc10446b5e40d706e85a");
        } else if (this.j != z) {
            this.j = z;
            requestLayout();
        }
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuBaseCameraView
    public int getFacing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0074caafcb8183bac0159f550984ac2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0074caafcb8183bac0159f550984ac2")).intValue() : this.f.f;
    }

    public AspectRatio getAspectRatio() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2d488dadac54d451cf866d8add459b", RobustBitConfig.DEFAULT_VALUE) ? (AspectRatio) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2d488dadac54d451cf866d8add459b") : this.f.e;
    }

    public com.meituan.android.edfu.camerainterface.camera.b getPreviewSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c534ea36b30b817ede90c43aae23cc47", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.edfu.camerainterface.camera.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c534ea36b30b817ede90c43aae23cc47");
        }
        c cVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "72e82fe047efc00e9005af9ac6ead585", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.edfu.camerainterface.camera.b) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "72e82fe047efc00e9005af9ac6ead585");
        }
        if (cVar.d != null) {
            return new com.meituan.android.edfu.camerainterface.camera.b(cVar.d.getPreviewSize().width, cVar.d.getPreviewSize().height);
        }
        return null;
    }

    public boolean getAdjustViewBounds() {
        return this.j;
    }

    public void setAgorithmApi(d dVar) {
        this.g = dVar;
    }

    public b getPreviewer() {
        return this.e;
    }

    public c getCameraController() {
        return this.f;
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuBaseCameraView
    public com.meituan.android.edfu.camerainterface.cameraDevice.d getCameraDevice() {
        return this.f;
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuBaseCameraView
    public boolean getPreviewStart() {
        return this.m;
    }

    public void setRenderEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a235cd2be51cb65bf1e2a33137bb92b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a235cd2be51cb65bf1e2a33137bb92b");
        } else if (this.e != null) {
            this.e.setRenderEnable(z);
        }
    }

    public void setAgorithmsRender(com.meituan.android.edfu.edfupreviewer.api.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3b4d49e3dba81668679c2e34c529914", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3b4d49e3dba81668679c2e34c529914");
        } else if (this.e == null || aVar == null) {
        } else {
            this.e.setProduct(aVar);
        }
    }

    public void setPreviewSize(com.meituan.android.edfu.camerainterface.camera.b bVar) {
        this.n = bVar;
    }

    public void setOrientationSensitive(boolean z) {
        this.o = z;
    }

    public void setCameraDataProcessor(com.meituan.android.edfu.edfucamera.argorithm.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833971b23b9c8e43c0d37c6d9f735cc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833971b23b9c8e43c0d37c6d9f735cc8");
        } else if (this.g != null) {
            this.g.a(cVar);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b33889ef80f673b927376f363ed82fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b33889ef80f673b927376f363ed82fb");
            return;
        }
        if (this.g != null) {
            this.g.a();
        }
        if (this.e != null) {
            this.e.setRenderCallback(null);
            this.e.setProduct(null);
        }
        if (this.i != null) {
            this.i = null;
        }
        if (this.h != null) {
            this.h = null;
        }
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuBaseCameraView
    public void setCameraDataCallback(c.a aVar) {
        this.h = aVar;
    }

    public void setRenderCallback(e eVar) {
        this.i = eVar;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ca907b2f47cdd108074b665ef25737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ca907b2f47cdd108074b665ef25737");
        } else {
            this.r.add(aVar);
        }
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e056b7fd96e7517a673d0dc9f0cc7bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e056b7fd96e7517a673d0dc9f0cc7bc");
        } else if (this.r.contains(aVar)) {
            this.r.remove(aVar);
        }
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.e
    public final void a(EGLContext eGLContext) {
        Object[] objArr = {eGLContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10cbeff647848d718db3fbfd9d44bbb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10cbeff647848d718db3fbfd9d44bbb7");
        } else if (this.i != null) {
            this.i.a(eGLContext);
        }
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.e
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1031dbaad75324d3c9531d3f98ffed2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1031dbaad75324d3c9531d3f98ffed2d");
        } else if (this.i != null) {
            this.i.a(i, j);
        }
    }
}
