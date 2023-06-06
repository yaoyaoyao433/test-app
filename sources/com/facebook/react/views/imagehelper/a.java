package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import com.dianping.picasso.PicassoUtils;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.resource.APKStructure;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: ProGuard */
@ThreadSafe
/* loaded from: classes.dex */
public class a {
    private static volatile a b;
    private Map<String, Integer> a = new HashMap();

    private a() {
    }

    public static a a() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final synchronized void b() {
        this.a.clear();
    }

    public final int a(Context context, @Nullable String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE);
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.a.containsKey(replace)) {
                    return this.a.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, PicassoUtils.DEF_TYPE, context.getPackageName());
                this.a.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    @Nullable
    public final Drawable b(Context context, @Nullable String str) {
        int a = a(context, str);
        if (a > 0) {
            return context.getResources().getDrawable(a);
        }
        return null;
    }

    public final Uri c(Context context, @Nullable String str) {
        int a = a(context, str);
        return a > 0 ? new Uri.Builder().scheme(APKStructure.Res_Type).path(String.valueOf(a)).build() : Uri.EMPTY;
    }
}
