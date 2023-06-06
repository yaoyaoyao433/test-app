package com.dianping.richtext;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static c b;
    public boolean c;
    public boolean d;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "182eefdebb0c8d08bf1b0116cad00010", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "182eefdebb0c8d08bf1b0116cad00010");
        }
        if (b == null) {
            b = new c();
        }
        return b;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "102b399222377b4b015a275247478313", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "102b399222377b4b015a275247478313");
            return;
        }
        this.c = false;
        this.d = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79cb2c0f3c9c9f01b006d32d038d5b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79cb2c0f3c9c9f01b006d32d038d5b9d");
            return;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("get", String.class);
            String str = (String) declaredMethod.invoke(cls, "ro.build.version.emui");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                String[] split = str.split(CommonConstant.Symbol.UNDERLINE);
                if (split.length >= 2 && Integer.parseInt(split[1].substring(0, 1)) >= 4) {
                    this.c = true;
                }
            }
            String str2 = (String) declaredMethod.invoke(cls, "ro.build.display.id");
            if (TextUtils.isEmpty(str2) || !str2.contains("Flyme")) {
                return;
            }
            this.d = true;
            String[] split2 = str2.split(StringUtil.SPACE);
            if (split2.length < 2 || Integer.parseInt(split2[1].substring(0, 1)) < 6) {
                return;
            }
            this.c = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
