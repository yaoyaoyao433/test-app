package com.sankuai.eh.plugins.skeleton.vg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import com.BV.LinearGradient.LinearGradientManager;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends Drawable {
    public static ChangeQuickRedirect a;
    public ValueAnimator b;
    public int[] c;
    public float[] d;
    private final ValueAnimator.AnimatorUpdateListener e;
    private final Paint f;
    private final Rect g;
    private final Matrix h;
    private float i;
    private int j;
    private float k;
    private JsonElement l;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public static /* synthetic */ void a(d dVar, ValueAnimator valueAnimator) {
        Object[] objArr = {dVar, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75653eb24840301c8898e80719d8f707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75653eb24840301c8898e80719d8f707");
        } else {
            dVar.invalidateSelf();
        }
    }

    public d(JsonElement jsonElement) {
        boolean z;
        PorterDuff.Mode mode;
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0980806e2064da4f9dc32a966f29d3c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0980806e2064da4f9dc32a966f29d3c9");
            return;
        }
        this.e = e.a(this);
        this.f = new Paint();
        this.g = new Rect();
        this.h = new Matrix();
        this.i = 0.5f;
        this.j = 1800;
        this.k = 30.0f;
        this.c = new int[]{ViewCompat.MEASURED_SIZE_MASK, 1358954495, 1358954495, ViewCompat.MEASURED_SIZE_MASK};
        this.d = new float[]{0.0f, 0.4f, 0.6f, 1.0f};
        this.l = jsonElement;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b1b9d33e247f7d975e9c90d3be3f60d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b1b9d33e247f7d975e9c90d3be3f60d");
        } else {
            this.f.setAntiAlias(true);
            this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        }
        if (jsonElement != null) {
            Map<String, JsonElement> c = com.sankuai.eh.component.service.utils.b.c(jsonElement);
            Object[] objArr3 = {c};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc2294c93227ff0ee90d6476d505ed9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc2294c93227ff0ee90d6476d505ed9d");
            } else {
                this.j = com.sankuai.eh.component.service.utils.b.a(c.get("d"), 2500);
                this.i = com.sankuai.eh.component.service.utils.b.a(c.get("width"), 0.5f);
                this.k = com.sankuai.eh.component.service.utils.b.a(c.get("agl"), 30.0f);
                a(c);
                Object[] objArr4 = {c};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0c20dea34a6cbf1d85ff3289c7b85fdb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0c20dea34a6cbf1d85ff3289c7b85fdb");
                } else if (c.containsKey("composition")) {
                    int a2 = com.sankuai.eh.component.service.utils.b.a(c.get("composition"), 10);
                    Paint paint = this.f;
                    Object[] objArr5 = {Integer.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (!PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "9ef5e1e54544e49e0b5b1082cd1370f8", RobustBitConfig.DEFAULT_VALUE)) {
                        switch (a2) {
                            case 1:
                                mode = PorterDuff.Mode.SRC;
                                break;
                            case 2:
                                mode = PorterDuff.Mode.DST;
                                break;
                            case 3:
                                mode = PorterDuff.Mode.SRC_OVER;
                                break;
                            case 4:
                                mode = PorterDuff.Mode.DST_OVER;
                                break;
                            case 5:
                                mode = PorterDuff.Mode.SRC_IN;
                                break;
                            case 6:
                                mode = PorterDuff.Mode.DST_IN;
                                break;
                            case 7:
                                mode = PorterDuff.Mode.SRC_OUT;
                                break;
                            case 8:
                                mode = PorterDuff.Mode.DST_OUT;
                                break;
                            case 9:
                                mode = PorterDuff.Mode.SRC_ATOP;
                                break;
                            case 10:
                                mode = PorterDuff.Mode.DST_ATOP;
                                break;
                            case 11:
                                mode = PorterDuff.Mode.XOR;
                                break;
                            case 12:
                                mode = PorterDuff.Mode.ADD;
                                break;
                            case 13:
                                mode = PorterDuff.Mode.MULTIPLY;
                                break;
                            case 14:
                                mode = PorterDuff.Mode.SCREEN;
                                break;
                            case 15:
                                mode = PorterDuff.Mode.OVERLAY;
                                break;
                            case 16:
                                mode = PorterDuff.Mode.DARKEN;
                                break;
                            case 17:
                                mode = PorterDuff.Mode.LIGHTEN;
                                break;
                            default:
                                mode = PorterDuff.Mode.CLEAR;
                                break;
                        }
                    } else {
                        mode = (PorterDuff.Mode) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "9ef5e1e54544e49e0b5b1082cd1370f8");
                    }
                    paint.setXfermode(new PorterDuffXfermode(mode));
                }
            }
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "eb9907b4eb5147ad231e5ebdba7812b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "eb9907b4eb5147ad231e5ebdba7812b9");
            return;
        }
        if (this.b != null) {
            z = this.b.isStarted();
            this.b.cancel();
            this.b.removeAllUpdateListeners();
        } else {
            z = false;
        }
        this.b = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b.setRepeatMode(1);
        this.b.setRepeatCount(-1);
        this.b.setDuration(Math.max(this.j, 0));
        this.b.addUpdateListener(this.e);
        if (z) {
            this.b.start();
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab26b5da6dc1ca96860df2197e233d73", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab26b5da6dc1ca96860df2197e233d73")).booleanValue() : this.b != null && this.b.isStarted();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56076ca9789b4b6294efe4e34e83490c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56076ca9789b4b6294efe4e34e83490c");
            return;
        }
        super.onBoundsChange(rect);
        this.g.set(0, 0, rect.width(), rect.height());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9683c3eb1f33c156647e796dbddd8c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9683c3eb1f33c156647e796dbddd8c3");
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0) {
            return;
        }
        this.f.setShader(new LinearGradient(0.0f, 0.0f, width * this.i, 0.0f, this.c, this.d, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa06aa6faa526c936b1a008ac453a4bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa06aa6faa526c936b1a008ac453a4bb");
        } else if (this.f.getShader() == null) {
        } else {
            float tan = (float) Math.tan(Math.toRadians(20.0d));
            float width = this.g.width() + (this.g.height() * tan);
            float height = tan * this.g.height();
            float animatedFraction = this.b != null ? this.b.getAnimatedFraction() : 0.0f;
            float f = height * (-2.0f);
            Object[] objArr2 = {Float.valueOf(f), Float.valueOf(width), Float.valueOf(animatedFraction)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            float floatValue = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "473966efb9725731addce5b34522c7cf", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "473966efb9725731addce5b34522c7cf")).floatValue() : f + ((width - f) * animatedFraction);
            this.h.reset();
            this.h.setRotate(this.k, this.g.width() / 2.0f, this.g.height() / 2.0f);
            this.h.postTranslate(floatValue, 0.0f);
            this.f.getShader().setLocalMatrix(this.h);
            canvas.drawRect(this.g, this.f);
        }
    }

    private void a(Map<String, JsonElement> map) {
        Float[] fArr;
        String[] strArr;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78297f080d7c54d809c1fa22acd986ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78297f080d7c54d809c1fa22acd986ea");
            return;
        }
        if (map.containsKey(LinearGradientManager.PROP_COLORS) && (strArr = (String[]) com.sankuai.eh.component.service.utils.b.a(map.get(LinearGradientManager.PROP_COLORS), String[].class)) != null && strArr.length > 0) {
            int[] iArr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                iArr[i] = com.sankuai.eh.plugins.skeleton.util.b.a(strArr[i], (int) ViewCompat.MEASURED_SIZE_MASK);
            }
            this.c = iArr;
        }
        if (!map.containsKey("steps") || (fArr = (Float[]) com.sankuai.eh.component.service.utils.b.a(map.get("steps"), Float[].class)) == null || fArr.length <= 0) {
            return;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = fArr[i2].floatValue();
        }
        this.d = fArr2;
    }
}
