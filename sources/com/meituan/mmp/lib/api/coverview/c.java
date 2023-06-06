package com.meituan.mmp.lib.api.coverview;

import android.os.Build;
import android.view.MotionEvent;
import com.meituan.android.common.statistics.Constants;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    int e;
    public boolean f;

    public c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03445fae8714314a65a6104649ef7f89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03445fae8714314a65a6104649ef7f89");
            return;
        }
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = false;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a[] a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e39863e8b2e9f0711c8a4033fb0faf99", RobustBitConfig.DEFAULT_VALUE)) {
            return (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e39863e8b2e9f0711c8a4033fb0faf99");
        }
        a[] aVarArr = new a[motionEvent.getPointerCount()];
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            a aVar = new a();
            aVar.b = motionEvent.getPointerId(i);
            aVar.c = motionEvent.getRawX();
            aVar.d = motionEvent.getRawY();
            aVarArr[i] = aVar;
        }
        return aVarArr;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public float c;
        public float d;

        public final JSONObject a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7311fcf7cfb90c1b2f35227a5c7b272", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7311fcf7cfb90c1b2f35227a5c7b272");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.b);
                jSONObject.put(Constants.GestureMoveEvent.KEY_X, p.b(this.c));
                jSONObject.put(Constants.GestureMoveEvent.KEY_Y, p.b(this.d));
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc42001f58b38494fdbbd6cb1b3212c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc42001f58b38494fdbbd6cb1b3212c") : a().toString();
        }
    }

    public final float a(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc59efdd1efe43cab6be8320aa0378e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc59efdd1efe43cab6be8320aa0378e")).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return motionEvent.getRawY(i);
        }
        return motionEvent.getRawY();
    }

    public final float b(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce8e7226486a1f9c9bdd2f69b4770a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce8e7226486a1f9c9bdd2f69b4770a4")).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return motionEvent.getRawX(i);
        }
        return motionEvent.getRawX();
    }
}
