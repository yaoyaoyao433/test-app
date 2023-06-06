package com.meituan.msi.api.component.canvas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msi.api.component.canvas.param.MsiCanvasParam;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.h;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e extends View {
    public static ChangeQuickRedirect a;
    public Bitmap b;
    public a c;
    private MsiCanvasParam d;
    private boolean e;
    private com.meituan.msi.api.component.canvas.view.a f;

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a70ba0508a48b2c4f341a0acde28e99f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a70ba0508a48b2c4f341a0acde28e99f");
            return;
        }
        this.b = null;
        this.c = new a(this);
    }

    public final void a(final com.meituan.msi.provider.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f6d60bba25859a053205756d65f2e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f6d60bba25859a053205756d65f2e9");
            return;
        }
        this.f = new com.meituan.msi.api.component.canvas.view.a();
        this.c.d.h = new c() { // from class: com.meituan.msi.api.component.canvas.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.component.canvas.c
            public final Bitmap a(String str, String str2) {
                InputStream a2;
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdeded8e4c5ea4db46cec41e85582f13", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdeded8e4c5ea4db46cec41e85582f13");
                }
                if (TextUtils.isEmpty(str2) || str2.startsWith(AbsApiFactory.HTTP) || str2.startsWith(AbsApiFactory.HTTPS) || (a2 = com.meituan.msi.util.file.d.a(str2, aVar)) == null) {
                    return null;
                }
                Bitmap a3 = com.sankuai.waimai.launcher.util.image.a.a(a2);
                h.a(a2);
                return a3;
            }
        };
    }

    @NonNull
    public MsiCanvasParam getMsiCanvasParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b228b053a9b3ce4f181ab421680fc14d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MsiCanvasParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b228b053a9b3ce4f181ab421680fc14d");
        }
        if (this.d == null) {
            this.d = new MsiCanvasParam();
        }
        return this.d;
    }

    public final void a(MsiCanvasParam msiCanvasParam) {
        Object[] objArr = {msiCanvasParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f018ed9fe8a847455adee512c81ddd7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f018ed9fe8a847455adee512c81ddd7a");
            return;
        }
        if (msiCanvasParam.hide) {
            setVisibility(4);
        } else {
            setVisibility(0);
        }
        this.e = msiCanvasParam.disableScroll;
    }

    public final void a(MsiContext msiContext, final String str, JsonObject jsonObject) {
        Object[] objArr = {msiContext, str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e297bc6409ff832af1e4012ffdffcd4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e297bc6409ff832af1e4012ffdffcd4b");
            return;
        }
        final com.meituan.msi.dispather.a aVar = new com.meituan.msi.dispather.a(msiContext.getMsiDispatcher(), jsonObject);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.msi.api.component.canvas.e.2
            public static ChangeQuickRedirect a;
            public final GestureDetector b = new GestureDetector(new GestureDetector.SimpleOnGestureListener() { // from class: com.meituan.msi.api.component.canvas.e.2.1
                public static ChangeQuickRedirect a;

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onDown(MotionEvent motionEvent) {
                    Object[] objArr2 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ef467eaf9df046bf35da4c98c5b9001", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ef467eaf9df046bf35da4c98c5b9001")).booleanValue();
                    }
                    aVar.a("onTouchStart", e.this.a(motionEvent, str));
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    Object[] objArr2 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08bd50a30e026f489ef01a4cd4912ba7", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08bd50a30e026f489ef01a4cd4912ba7")).booleanValue();
                    }
                    aVar.a("onTouchEnd", e.this.a(motionEvent, str));
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final void onLongPress(MotionEvent motionEvent) {
                    Object[] objArr2 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e21a4e5d169d3361c1614b7558d4e04", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e21a4e5d169d3361c1614b7558d4e04");
                    } else {
                        aVar.a("onLongPress", e.this.a(motionEvent, str));
                    }
                }
            });

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "004558444acb9fc91551844b9b1c9256", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "004558444acb9fc91551844b9b1c9256")).booleanValue();
                }
                if (this.b.onTouchEvent(motionEvent)) {
                    if (e.this.e) {
                        return true;
                    }
                    return e.this.onTouchEvent(motionEvent);
                }
                JSONObject a2 = e.this.a(motionEvent, str);
                switch (motionEvent.getAction()) {
                    case 2:
                        aVar.a("onTouchMove", a2);
                        break;
                    case 3:
                        aVar.a("onTouchCancel", a2);
                        break;
                }
                return e.this.onTouchEvent(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public JSONObject a(MotionEvent motionEvent, String str) {
        Object[] objArr = {motionEvent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f131ba5796c3db15a4f387ed6def2701", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f131ba5796c3db15a4f387ed6def2701");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", str);
            int pointerCount = motionEvent.getPointerCount();
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (i < pointerCount) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", motionEvent.getPointerId(i));
                jSONObject2.put("actioned", motionEvent.getActionIndex() == i);
                jSONObject2.put(Constants.GestureMoveEvent.KEY_X, com.meituan.msi.util.f.c(motionEvent.getX(i)));
                jSONObject2.put(Constants.GestureMoveEvent.KEY_Y, com.meituan.msi.util.f.c(motionEvent.getY(i)));
                jSONArray.put(jSONObject2);
                i++;
            }
            jSONObject.put("touch", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7165892a95cdcddd63636a548ecb1136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7165892a95cdcddd63636a548ecb1136");
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        if (this.b == null || this.b.isRecycled() || this.b.getWidth() != measuredWidth || this.b.getHeight() != measuredHeight) {
            if (this.b != null && !this.b.isRecycled()) {
                this.b.recycle();
            }
            this.b = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        }
        if (this.b == null) {
            com.meituan.msi.log.a.a("MCanvasViewbitmap is null.");
            return;
        }
        this.b.eraseColor(0);
        this.f.setBitmap(this.b);
        com.meituan.msi.api.component.canvas.view.a aVar = this.f;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50d82e2d45a0d48e10bd2ef80c2ed1f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50d82e2d45a0d48e10bd2ef80c2ed1f3");
        } else if (this.c == null) {
            com.meituan.msi.log.a.a("drawer has gone");
        } else {
            this.c.a(aVar);
        }
        canvas.drawBitmap(this.f.b, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9d316ffdd91d338b761f5f71153497", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9d316ffdd91d338b761f5f71153497");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.b != null && !this.b.isRecycled()) {
            this.b.recycle();
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        this.b = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "782709c8f32ad0ebb45b8b8dda792a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "782709c8f32ad0ebb45b8b8dda792a49");
        } else {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85de76cc9b28d7531745b30b90a7d5a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85de76cc9b28d7531745b30b90a7d5a2");
            return;
        }
        super.onDetachedFromWindow();
        setOnTouchListener(null);
        postDelayed(new Runnable() { // from class: com.meituan.msi.api.component.canvas.e.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0806a7bbabf5ceeac6768b619beb1ec2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0806a7bbabf5ceeac6768b619beb1ec2");
                } else {
                    e.this.a();
                }
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c502f785208dd1dd941657b02ca1d950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c502f785208dd1dd941657b02ca1d950");
        } else if (this.c == null) {
        } else {
            a aVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b06d0b68d525862bda5e189a2060f15d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b06d0b68d525862bda5e189a2060f15d");
            } else {
                aVar.c = null;
                aVar.d = null;
                aVar.e.b.clear();
                aVar.e = null;
                aVar.f = null;
            }
            this.c = null;
            this.f.setBitmap(null);
            this.b = null;
        }
    }
}
