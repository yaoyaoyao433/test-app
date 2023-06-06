package com.sankuai.xm.base.util.locale;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends ContextWrapper {
    public static ChangeQuickRedirect a;

    private a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4f778e0f47a282ae6baf8b28301220", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4f778e0f47a282ae6baf8b28301220");
        }
    }

    public static ContextWrapper a(Context context, Locale locale) {
        Object[] objArr = {context, locale};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c47c9236255f2a4feb29a3d839068900", 6917529027641081856L)) {
            return (ContextWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c47c9236255f2a4feb29a3d839068900");
        }
        if (locale != null && locale.equals(b.b)) {
            return new a(context);
        }
        Configuration configuration = context.getResources().getConfiguration();
        Locale a2 = a(configuration);
        if (locale != null && !locale.equals(a2)) {
            Locale.setDefault(locale);
            if (Build.VERSION.SDK_INT >= 24) {
                configuration.setLocale(locale);
            } else {
                configuration.locale = locale;
            }
        }
        if (Build.VERSION.SDK_INT >= 17) {
            context = context.createConfigurationContext(configuration);
        } else {
            context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        }
        return new a(context);
    }

    public static Locale a(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e0076a1f99663d25e85628cdb785a11", 6917529027641081856L)) {
            return (Locale) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e0076a1f99663d25e85628cdb785a11");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return configuration.getLocales().get(0);
        }
        return configuration.locale;
    }
}
