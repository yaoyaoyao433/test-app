package com.sankuai.waimai.imbase.push;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.imbase.window.a {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    private TextView h;

    @Override // com.sankuai.waimai.imbase.window.a
    public final int a() {
        return R.layout.wm_imbase_other_in_app_push_window;
    }

    public c(@NonNull Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "307904588e6cd92d5cf60286dfcf9caf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "307904588e6cd92d5cf60286dfcf9caf");
            return;
        }
        this.b = (TextView) this.f.findViewById(R.id.txt_im_in_app_push_content);
        this.h = (TextView) this.f.findViewById(R.id.txt_im_in_app_push_title);
        this.c = (TextView) this.f.findViewById(R.id.txt_im_in_app_push_time);
    }

    public final c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce61e28226faa8279c6e35fb71f5d89", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce61e28226faa8279c6e35fb71f5d89");
        }
        if (TextUtils.isEmpty(str)) {
            str = this.e.getString(R.string.app_name);
        }
        this.h.setText(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "978ad8d7247b37d09e7b59dc2e65b8f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "978ad8d7247b37d09e7b59dc2e65b8f7");
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j >= currentTimeMillis - LocationStrategy.LOCATION_TIMEOUT) {
            return "刚刚";
        }
        Date date = new Date(currentTimeMillis);
        Date date2 = new Date(j);
        if (a(date, date2)) {
            return a(date2);
        }
        return b(date2);
    }

    private static boolean a(Date date, Date date2) {
        Object[] objArr = {date, date2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "911c2b09db03940e7937f8130b1645fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "911c2b09db03940e7937f8130b1645fa")).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            return Integer.parseInt(simpleDateFormat.format(date)) == Integer.parseInt(simpleDateFormat.format(date2));
        } catch (Exception unused) {
            return false;
        }
    }

    private static String a(Date date) {
        Object[] objArr = {date};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49965a2d6479bf878ea4d01ed54f5c2f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49965a2d6479bf878ea4d01ed54f5c2f") : new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.CHINA).format(date);
    }

    private static String b(Date date) {
        Object[] objArr = {date};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f95e9fc5e073adb45e49b4f275fe4f1d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f95e9fc5e073adb45e49b4f275fe4f1d") : new SimpleDateFormat("MM月dd日 HH:mm", Locale.CHINA).format(date);
    }
}
