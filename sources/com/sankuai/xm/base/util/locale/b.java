package com.sankuai.xm.base.util.locale;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.e;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    public static final Locale b = new Locale("", "");
    private static b c;
    private Locale d;

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19b27c74b48177d913b2731e872c5bfc", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19b27c74b48177d913b2731e872c5bfc");
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

    public final Locale a() {
        Locale locale;
        Locale locale2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e799710872a6981219fa4d6138789f29", 6917529027641081856L)) {
            return (Locale) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e799710872a6981219fa4d6138789f29");
        }
        if (this.d == null) {
            String string = e.a().getString("LOCALE_SETTING", a(Locale.SIMPLIFIED_CHINESE));
            Object[] objArr2 = {string};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "636ac783b0629e814865b5565bddd5c7", 6917529027641081856L)) {
                locale2 = (Locale) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "636ac783b0629e814865b5565bddd5c7");
            } else if (TextUtils.isEmpty(string)) {
                locale2 = Locale.SIMPLIFIED_CHINESE;
            } else if (string.equals(a(b))) {
                locale2 = b;
            } else {
                String[] split = string.split(CommonConstant.Symbol.UNDERLINE);
                if (split.length <= 0) {
                    locale2 = Locale.SIMPLIFIED_CHINESE;
                } else {
                    if (split.length < 2) {
                        if (string.endsWith(CommonConstant.Symbol.UNDERLINE)) {
                            locale = new Locale(split[0]);
                        } else {
                            locale2 = Locale.SIMPLIFIED_CHINESE;
                        }
                    } else {
                        locale = new Locale(split[0], split[1]);
                    }
                    locale2 = locale;
                }
            }
            this.d = locale2;
        }
        return this.d;
    }

    private String a(Locale locale) {
        Object[] objArr = {locale};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9bb0fb139ee0171761fcd60db47c364", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9bb0fb139ee0171761fcd60db47c364");
        }
        if (locale == null) {
            return null;
        }
        return locale.getLanguage() + CommonConstant.Symbol.UNDERLINE + locale.getCountry();
    }
}
