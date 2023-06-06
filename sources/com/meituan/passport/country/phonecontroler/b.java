package com.meituan.passport.country.phonecontroler;

import android.text.TextWatcher;
import android.widget.EditText;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b implements c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.country.phonecontroler.c
    public int a() {
        return 5;
    }

    public int b() {
        return 15;
    }

    @Override // com.meituan.passport.country.phonecontroler.c
    public TextWatcher a(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "776e1e9ff6dd94c5f33e03596c38f892", RobustBitConfig.DEFAULT_VALUE) ? (TextWatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "776e1e9ff6dd94c5f33e03596c38f892") : new com.meituan.passport.country.textwatcher.b(editText, this);
    }

    @Override // com.meituan.passport.country.phonecontroler.c
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b4c0f99851b56abc371a5c2db65d8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b4c0f99851b56abc371a5c2db65d8b");
        }
        if (str.length() > b()) {
            str = str.substring(0, b());
        }
        int length = str.length() / 3;
        if (str.length() % 3 == 0) {
            length--;
        }
        StringBuilder sb = new StringBuilder(str);
        while (length > 0) {
            sb.insert(length * 3, Constants.SPACE);
            length--;
        }
        return sb.toString();
    }
}
