package com.dianping.picasso.view.gesturehandler;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.c;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoGestureHandlerManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void attachGestureHandlerToViewByAction(String str, View view, String str2, String[] strArr) {
        Object[] objArr = {str, view, str2, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e07a477ae918f293094677f10eadc7cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e07a477ae918f293094677f10eadc7cf");
            return;
        }
        b a = c.a(str);
        if (a == null) {
            Log.e("GestureHandlerManager", "Cannot find Host for:" + str);
        } else if (!(a instanceof g)) {
            Log.e("GestureHandlerManager", "Only support in VC Host");
        } else {
            final PicassoGestureDetector picassoGestureDetector = new PicassoGestureDetector(a.b());
            for (String str3 : strArr) {
                if ("doubleClick".equals(str3)) {
                    picassoGestureDetector.addDoubleTapGestureHandler(new DoubleTapGestureHandler((g) a, str2));
                } else if ("click".equals(str3)) {
                    picassoGestureDetector.addSingleTapGestureHandler(new SingleTapGestureHandler((g) a, str2));
                } else if ("press".equals(str3)) {
                    picassoGestureDetector.addPressGestureHandler(new PressGestureHandler((g) a, str2));
                } else if ("longPress".equals(str3)) {
                    picassoGestureDetector.addLongPressGestureHandler(new LongPressGestureHandler((g) a, str2));
                } else if ("pan".equals(str3)) {
                    picassoGestureDetector.addPanGestureHandler(new PanGestureHandler((g) a, str2));
                }
            }
            if (picassoGestureDetector.needStartGestureDetector()) {
                view.setClickable(true);
                view.setOnTouchListener(new View.OnTouchListener() { // from class: com.dianping.picasso.view.gesturehandler.PicassoGestureHandlerManager.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        Object[] objArr2 = {view2, motionEvent};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3e921a8e03cd2ce4f982c60d43c10450", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3e921a8e03cd2ce4f982c60d43c10450")).booleanValue() : PicassoGestureDetector.this.onTouchEvent(motionEvent);
                    }
                });
            }
        }
    }

    public static void detachViewGestureHandler(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a063fc144667ef898b4261773e23b3ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a063fc144667ef898b4261773e23b3ad");
            return;
        }
        view.setLongClickable(false);
        view.setClickable(false);
        view.setOnTouchListener(null);
    }
}
