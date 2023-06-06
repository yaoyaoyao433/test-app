package com.meituan.android.neohybrid.util;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.FloatRange;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.bw;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        SHOW(1.0f),
        HIDE(0.0f);
        
        public static ChangeQuickRedirect a;
        @FloatRange(from = 0.0d, to = bw.a)
        public float d;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c048e12018905d8183b0123327ecf849", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c048e12018905d8183b0123327ecf849") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59be400b8ec73a4af161e383913e5e0d", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59be400b8ec73a4af161e383913e5e0d") : (a[]) values().clone();
        }

        a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
            Object[] objArr = {r10, Integer.valueOf(r11), Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc266c391af4005035e94e30f1d7620a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc266c391af4005035e94e30f1d7620a");
            } else {
                this.d = f;
            }
        }
    }

    public static void a(View view, a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b61aa55ee6d1725b22c9ea2ff46197f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b61aa55ee6d1725b22c9ea2ff46197f9");
        } else if (view == null || Float.compare(view.getAlpha(), aVar.d) == 0) {
        } else {
            view.setAlpha(aVar.d);
        }
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "deb24649b616f6ac8b031a943243e5c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "deb24649b616f6ac8b031a943243e5c9");
        } else {
            a(runnable, (Handler) null);
        }
    }

    private static void a(Runnable runnable, Handler handler) {
        Object[] objArr = {runnable, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d87ee36a382c53ceeb373ba9c3f97dda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d87ee36a382c53ceeb373ba9c3f97dda");
        } else if (runnable == null) {
        } else {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }
}
