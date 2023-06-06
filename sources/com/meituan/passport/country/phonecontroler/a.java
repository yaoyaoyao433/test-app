package com.meituan.passport.country.phonecontroler;

import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.country.phonecontroler.c
    public final int a() {
        return 11;
    }

    @Override // com.meituan.passport.country.phonecontroler.c
    public final TextWatcher a(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d790542ec0cb2d2ec8c4860d82b04a", RobustBitConfig.DEFAULT_VALUE) ? (TextWatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d790542ec0cb2d2ec8c4860d82b04a") : new com.meituan.passport.country.textwatcher.a(editText, this);
    }

    @Override // com.meituan.passport.country.phonecontroler.c
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae37865ada413226dbe848eebad1b16", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae37865ada413226dbe848eebad1b16");
        }
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        if (TextUtils.isEmpty(str) || str.length() < 4) {
            return str;
        }
        if (str.length() < 8) {
            return sb.insert(3, Constants.SPACE).toString();
        }
        if (str.length() <= 11) {
            return sb.insert(3, Constants.SPACE).insert(8, Constants.SPACE).toString();
        }
        return sb.insert(3, Constants.SPACE).insert(8, Constants.SPACE).toString().substring(0, 13);
    }
}
