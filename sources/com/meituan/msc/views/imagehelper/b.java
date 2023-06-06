package com.meituan.msc.views.imagehelper;

import android.content.Context;
import android.support.annotation.Nullable;
import com.dianping.picasso.PicassoUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: ProGuard */
@ThreadSafe
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    private Map<String, Integer> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209bfa3b0c488f835e1dae6980705c9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209bfa3b0c488f835e1dae6980705c9a");
        } else {
            this.b = new HashMap();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40b73593cf42bbfe5ca0e6f9c0f28f48", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40b73593cf42bbfe5ca0e6f9c0f28f48");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public final int a(Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb8fa9728bd3018e9098fd01cce093c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb8fa9728bd3018e9098fd01cce093c")).intValue();
        }
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE);
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.b.containsKey(replace)) {
                    return this.b.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, PicassoUtils.DEF_TYPE, context.getPackageName());
                this.b.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }
}
