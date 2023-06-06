package com.meituan.android.yoda.model.behavior;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.yoda.util.q;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";
    private static boolean c = false;
    private static ScheduledExecutorService d = com.sankuai.android.jarvis.c.b("yoda_printer_schedule", 1);

    public static /* synthetic */ void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0945d36ea8d73b2517220596304e49f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0945d36ea8d73b2517220596304e49f3");
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44c985642bd48b63ddc2f0de482e7c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44c985642bd48b63ddc2f0de482e7c31");
        } else {
            d.scheduleWithFixedDelay(c.a(), 1000L, PayTask.j, TimeUnit.MILLISECONDS);
        }
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60516ceaf9b86b23fc13a721647f74a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60516ceaf9b86b23fc13a721647f74a4");
        }
        if (context == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int[] a2 = y.a(context);
        sb.append("[");
        sb.append(a2[0]);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(a2[1]);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append("[");
        sb.append(a2[0]);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(a2[1] - y.b(context));
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    public static void a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "676cfba2f9d4becd8de8f7d9eda2e4c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "676cfba2f9d4becd8de8f7d9eda2e4c4");
        } else if (c) {
            String str = b;
            StringBuilder sb = new StringBuilder("触发了");
            Object obj = view;
            if (view == null) {
                obj = "空白区域";
            }
            sb.append(obj);
            sb.append("的Click:");
            sb.append(motionEvent.getPointerCount());
            q.a(str, sb.toString());
        }
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "385b928804708b819c9404c193d19329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "385b928804708b819c9404c193d19329");
        } else if (c) {
            String str = b;
            StringBuilder sb = new StringBuilder("触发了");
            Object obj = view;
            if (view == null) {
                obj = "空白区域";
            }
            sb.append(obj);
            sb.append("的Slide");
            q.a(str, sb.toString());
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40fc74b0074d3d9d3d29f2e5b9a85be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40fc74b0074d3d9d3d29f2e5b9a85be5");
        } else if (c) {
            String str3 = b;
            q.a(str3, str + "输入:" + str2);
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81a72836d609226d8457135453fcffe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81a72836d609226d8457135453fcffe6");
        } else if (c) {
            q.a(b, "不收集本事件");
        }
    }
}
