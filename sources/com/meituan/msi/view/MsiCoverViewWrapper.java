package com.meituan.msi.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MsiCoverViewWrapper extends FrameLayout {
    public static ChangeQuickRedirect c;
    protected View d;
    protected float e;
    protected float f;
    protected int g;
    protected int h;
    protected boolean i;
    protected Paint j;

    public MsiCoverViewWrapper(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff4b4c48d43a5ff64c3f6a22bdb38a8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff4b4c48d43a5ff64c3f6a22bdb38a8a");
            return;
        }
        this.i = false;
        this.j = new Paint();
        c();
    }

    public MsiCoverViewWrapper(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "107d3d685c408f40bc5545f0c2323f3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "107d3d685c408f40bc5545f0c2323f3b");
            return;
        }
        this.i = false;
        this.j = new Paint();
    }

    public MsiCoverViewWrapper(Context context, View view) {
        super(context);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d56fa00e2be85bd6a63de8983a565f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d56fa00e2be85bd6a63de8983a565f");
            return;
        }
        this.i = false;
        this.j = new Paint();
        this.d = view;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        c();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66dd0b4ca0c46cc6e2ffb5af2b1f266c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66dd0b4ca0c46cc6e2ffb5af2b1f266c");
            return;
        }
        removeAllViews();
        this.d = null;
        ((ViewGroup) getParent()).removeView(this);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033b83af1bb602dc8158e19fc54321b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033b83af1bb602dc8158e19fc54321b9");
            return;
        }
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setAntiAlias(true);
        setWillNotDraw(false);
    }

    public View getContent() {
        return this.d;
    }

    @Override // android.view.View
    public void setWillNotDraw(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c863c98cfff5847c63789163ce961a26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c863c98cfff5847c63789163ce961a26");
        } else {
            super.setWillNotDraw(z);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z = true;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "272c9ec248867f172f4c9f1f09981e52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "272c9ec248867f172f4c9f1f09981e52");
            return;
        }
        float f = 0.0f;
        boolean z2 = this.f > 0.0f;
        if (z2) {
            canvas.save();
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f, this.f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        if (this.h != 0) {
            canvas.drawColor(this.h);
        }
        if (this.e > 0.0f) {
            float f2 = this.e / 2.0f;
            canvas.drawRoundRect(new RectF(f2, f2, getWidth() - f2, getHeight() - f2), this.f, this.f, this.j);
            if (z2) {
                canvas.restore();
            }
            canvas.save();
            Path path2 = new Path();
            if (this.f > 0.0f && this.f - this.e > 0.0f) {
                f = this.f - this.e;
            }
            path2.addRoundRect(new RectF(this.e, this.e, getWidth() - this.e, getHeight() - this.e), f, f, Path.Direction.CW);
            canvas.clipPath(path2);
        } else {
            z = z2;
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public final <T extends View> T b(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acfeb0e20efaf1d8702bff6d0d5ac64e", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acfeb0e20efaf1d8702bff6d0d5ac64e");
        }
        try {
            if (cls.isAssignableFrom(this.d.getClass())) {
                return (T) this.d;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void setBorderRadius(float f) {
        this.f = f;
    }

    public final void setBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef2facb67792b5ef95ac96514f251eac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef2facb67792b5ef95ac96514f251eac");
            return;
        }
        this.g = i;
        this.j.setColor(i);
    }

    public final void setBorderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c1756d745b2c533e2fca0d77726d95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c1756d745b2c533e2fca0d77726d95");
            return;
        }
        this.e = f;
        this.j.setStrokeWidth(f);
    }

    public final void setBgColor(int i) {
        this.h = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a75c7ae89b25f380ad1b8f3853b2637", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a75c7ae89b25f380ad1b8f3853b2637")).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f > 0.0f) {
                double pow = Math.pow(this.f, 2.0d);
                float width = getWidth();
                float height = getHeight();
                if (x >= this.f) {
                }
            }
            z = true;
            if (!z) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void a(JSONObject jSONObject) {
        boolean z = true;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc43bf8c1752efca4d0801333951fbcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc43bf8c1752efca4d0801333951fbcc");
        } else if (jSONObject == null) {
        } else {
            String optString = jSONObject.optString("bgColor", null);
            if (!TextUtils.isEmpty(optString)) {
                setBackgroundColor(com.meituan.msi.util.d.b(optString));
            }
            String optString2 = jSONObject.optString("borderColor", null);
            if (!TextUtils.isEmpty(optString2)) {
                setBorderColor(com.meituan.msi.util.d.b(optString2));
            }
            if (!TextUtils.isEmpty(BorderRadius.LOWER_CASE_NAME)) {
                setBorderRadius(com.meituan.msi.util.f.a((float) jSONObject.optDouble(BorderRadius.LOWER_CASE_NAME, 0.0d)));
            }
            if (jSONObject.has("borderWidth")) {
                setBorderWidth(com.meituan.msi.util.f.a((float) jSONObject.optDouble("borderWidth", 0.0d)));
            }
            if (jSONObject.has("opacity")) {
                getBackground();
                setAlpha((float) jSONObject.optDouble("opacity"));
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("padding");
            if (optJSONArray != null && optJSONArray.length() == 4) {
                this.d.setPadding((int) com.meituan.msi.util.f.a(optJSONArray, 0), (int) com.meituan.msi.util.f.a(optJSONArray, 1), (int) com.meituan.msi.util.f.a(optJSONArray, 2), (int) com.meituan.msi.util.f.a(optJSONArray, 3));
            }
            if (jSONObject.has(AnimationViewCommandModel.Rotation)) {
                setRotation((float) jSONObject.optDouble(AnimationViewCommandModel.Rotation));
            }
            if (jSONObject.has(RecceAnimUtils.SCALE_X)) {
                setScaleX((float) jSONObject.optDouble(RecceAnimUtils.SCALE_X, 1.0d));
            }
            if (jSONObject.has(RecceAnimUtils.SCALE_Y)) {
                setScaleY((float) jSONObject.optDouble(RecceAnimUtils.SCALE_Y, 1.0d));
            } else {
                z = false;
            }
            if (z) {
                invalidate();
            }
        }
    }

    public final boolean b() {
        return this.i;
    }

    public void setFixed(boolean z) {
        this.i = z;
    }
}
