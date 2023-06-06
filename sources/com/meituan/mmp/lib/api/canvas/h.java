package com.meituan.mmp.lib.api.canvas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.android.common.statistics.Constants;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.lib.utils.x;
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
public class h extends View {
    public static ChangeQuickRedirect a;
    public Bitmap b;
    public final g c;
    public a d;
    private boolean e;

    public h(final Context context, final com.meituan.mmp.lib.config.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20de6911d1691970eeb93cfd17baf973", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20de6911d1691970eeb93cfd17baf973");
            return;
        }
        this.b = null;
        this.d = new a(this);
        this.c = new g();
        this.d.d.i = new c() { // from class: com.meituan.mmp.lib.api.canvas.h.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.canvas.c
            public final Bitmap a(String str, String str2) {
                InputStream b;
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b4491ce0118654179734d47abf5746d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b4491ce0118654179734d47abf5746d");
                }
                if (TextUtils.isEmpty(str2) || str2.startsWith(AbsApiFactory.HTTP) || str2.startsWith(AbsApiFactory.HTTPS) || (b = s.b(context, str2, aVar)) == null) {
                    return null;
                }
                Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(b);
                x.a(b);
                return a2;
            }
        };
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8c76f027b6b92335d8288f92aadf77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8c76f027b6b92335d8288f92aadf77");
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
            com.meituan.mmp.lib.trace.b.b("MCanvasView", "bitmap is null.");
            return;
        }
        this.b.eraseColor(0);
        this.c.setBitmap(this.b);
        g gVar = this.c;
        Object[] objArr2 = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10a1cb5318bf90ab8e415e4bb8e10b0c", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10a1cb5318bf90ab8e415e4bb8e10b0c")).booleanValue();
        } else if (this.d == null) {
            com.meituan.mmp.lib.trace.b.e("drawer has gone");
        } else {
            this.d.a(gVar);
        }
        canvas.drawBitmap(this.c.b, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30f5cd0ffdb9bd6ab983fd3026d81fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30f5cd0ffdb9bd6ab983fd3026d81fc");
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

    public final void a(JSONArray jSONArray, d dVar) {
        Object[] objArr = {jSONArray, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a54fed279ab3b9ff13f18c2ed6345f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a54fed279ab3b9ff13f18c2ed6345f");
        } else if (this.d == null) {
            com.meituan.mmp.lib.trace.b.e("drawer has gone");
        } else {
            this.d.a(jSONArray, dVar);
        }
    }

    public final void b(JSONArray jSONArray, d dVar) {
        Object[] objArr = {jSONArray, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecac2863b1ee8a6fc668533f57032dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecac2863b1ee8a6fc668533f57032dd5");
        } else if (this.d == null) {
            com.meituan.mmp.lib.trace.b.e("drawer has gone");
        } else {
            this.d.b(jSONArray, dVar);
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3482d8cf8dcbad281a902c2ac04cefb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3482d8cf8dcbad281a902c2ac04cefb3");
        } else {
            post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public JSONObject a(MotionEvent motionEvent, String str) {
        Object[] objArr = {motionEvent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9313a7a25381fd3948835c0a1233c5b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9313a7a25381fd3948835c0a1233c5b6");
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
                jSONObject2.put(Constants.GestureMoveEvent.KEY_X, p.b(motionEvent.getX(i)));
                jSONObject2.put(Constants.GestureMoveEvent.KEY_Y, p.b(motionEvent.getY(i)));
                jSONArray.put(jSONObject2);
                i++;
            }
            jSONObject.put("touch", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void setScrollStatus(boolean z) {
        this.e = z;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13f89a1d604bd9ec31641dadcd4f2399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13f89a1d604bd9ec31641dadcd4f2399");
            return;
        }
        super.onDetachedFromWindow();
        setOnTouchListener(null);
        postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.canvas.h.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1589d63f9d12f1569114a91be259c11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1589d63f9d12f1569114a91be259c11");
                } else {
                    h.this.a();
                }
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcaa54f615fb9f844385b4ac7456f090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcaa54f615fb9f844385b4ac7456f090");
        } else if (this.d == null) {
        } else {
            a aVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f672b7bd1454d21cd1c02f47bc8fcbef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f672b7bd1454d21cd1c02f47bc8fcbef");
            } else {
                aVar.c = null;
                aVar.d = null;
                aVar.e.b.clear();
                aVar.e = null;
                aVar.f = null;
            }
            this.d = null;
            this.c.setBitmap(null);
            this.b = null;
        }
    }
}
