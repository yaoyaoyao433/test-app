package com.meituan.passport.country.phonecontroler;

import android.text.TextWatcher;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends b {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.passport.country.phonecontroler.b, com.meituan.passport.country.phonecontroler.c
    public final int a() {
        return 9;
    }

    @Override // com.meituan.passport.country.phonecontroler.b
    public final int b() {
        return 9;
    }

    @Override // com.meituan.passport.country.phonecontroler.b, com.meituan.passport.country.phonecontroler.c
    public final TextWatcher a(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b983e3bb82f21a26ea24937710f84e", RobustBitConfig.DEFAULT_VALUE) ? (TextWatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b983e3bb82f21a26ea24937710f84e") : new com.meituan.passport.country.textwatcher.b(editText, this);
    }
}
