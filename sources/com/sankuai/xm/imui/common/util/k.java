package com.sankuai.xm.imui.common.util;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.support.constraint.R;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.common.utils.Utils;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k {
    public static ChangeQuickRedirect a = null;
    public static String b = "xm_clip_content";

    public static void a(View view, int i) {
        InputMethodManager inputMethodManager;
        Object[] objArr = {view, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7209b21990a013e8e3c4462ffd42bcc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7209b21990a013e8e3c4462ffd42bcc8");
        } else if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
        } else {
            try {
                inputMethodManager.showSoftInput(view, 0);
            } catch (Exception e) {
                d.a(e);
                com.sankuai.xm.monitor.statistics.a.a("imui", "UiUtils::showKeyBoard", e);
            }
        }
    }

    public static void b(View view, int i) {
        InputMethodManager inputMethodManager;
        Object[] objArr = {view, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "655f25a0c1f11c8ffb32fa9e7fbf3b5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "655f25a0c1f11c8ffb32fa9e7fbf3b5f");
        } else if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
        } else {
            try {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e) {
                d.a(e);
                com.sankuai.xm.monitor.statistics.a.a("imui", "UiUtils::hideKeyBoard", e);
            }
        }
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "144b9e1636d0f9cb1c21a9e573ca73ab", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "144b9e1636d0f9cb1c21a9e573ca73ab")).intValue() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58d35bb2a245284ebb38750b077f5680", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58d35bb2a245284ebb38750b077f5680")).intValue() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed123a8a5bd0dc2f01569468703c8f3d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed123a8a5bd0dc2f01569468703c8f3d")).intValue() : (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bc425666f09147ccb7bc4e42fc98312", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bc425666f09147ccb7bc4e42fc98312");
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j < 1024) {
            return decimalFormat.format(j) + ErrorCode.ERROR_TYPE_B;
        } else if (j < 1048576) {
            return decimalFormat.format(j / 1024.0d) + "K";
        } else if (j < 1073741824) {
            return decimalFormat.format(j / 1048576.0d) + ErrorCode.ERROR_TYPE_M;
        } else {
            return decimalFormat.format(j / 1.073741824E9d) + "G";
        }
    }

    public static void a(Context context, final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "636be109283e5c5b8d048cbbb7ee0e80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "636be109283e5c5b8d048cbbb7ee0e80");
        } else if (context == null) {
        } else {
            Runnable a2 = com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.util.k.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2094e7c888e70463b3a46c6071d0d2ea", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2094e7c888e70463b3a46c6071d0d2ea");
                    } else {
                        com.meituan.android.clipboard.a.a(str, k.b, "jcyf-6c9b1cddc05e4c06");
                    }
                }
            });
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a2.run();
            } else {
                com.sankuai.xm.threadpool.scheduler.a.b().a(a2);
            }
        }
    }

    public static String a(Context context, long j, Locale locale) {
        SimpleDateFormat simpleDateFormat;
        Object[] objArr = {context, new Long(j), locale};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96db9220ae39e739a075c5e8da6ff058", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96db9220ae39e739a075c5e8da6ff058");
        }
        if (locale != null) {
            simpleDateFormat = new SimpleDateFormat(Utils.LONG_DATE_FORMAT, locale);
        } else {
            simpleDateFormat = new SimpleDateFormat(Utils.LONG_DATE_FORMAT);
        }
        Date date = new Date(j);
        Date date2 = new Date(System.currentTimeMillis());
        String format = simpleDateFormat.format(date);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1, calendar.get(1));
        calendar3.set(2, calendar.get(2));
        calendar3.set(5, calendar.get(5) - 6);
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(1, calendar.get(1));
        calendar4.set(2, calendar.get(2));
        calendar4.set(5, calendar.get(5) - 1);
        calendar4.set(11, 0);
        calendar4.set(12, 0);
        calendar4.set(13, 0);
        calendar.setTime(date);
        if (!calendar.after(calendar3)) {
            return date.getYear() != date2.getYear() ? format : format.substring(5);
        } else if (calendar.get(5) == calendar2.get(5)) {
            return format.substring(11);
        } else {
            if (calendar.before(calendar2) && calendar.after(calendar4)) {
                return context.getString(R.string.xm_sdk_msg_yesterday) + StringUtil.SPACE + format.substring(11);
            }
            String[] stringArray = context.getResources().getStringArray(R.array.xm_sdk_msg_week);
            int i = calendar.get(7) - 1;
            if (i < 0) {
                i = 0;
            }
            return stringArray[i] + StringUtil.SPACE + format.substring(11);
        }
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "935c615ac23730085ecd397d5855c2ae", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "935c615ac23730085ecd397d5855c2ae")).booleanValue() : (activity.getWindow().getAttributes().flags & 1024) != 0;
    }
}
