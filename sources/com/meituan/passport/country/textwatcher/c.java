package com.meituan.passport.country.textwatcher;

import android.text.TextWatcher;
import android.widget.EditText;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c implements TextWatcher {
    protected EditText e;
    protected com.meituan.passport.country.phonecontroler.c f;

    public c(EditText editText, com.meituan.passport.country.phonecontroler.c cVar) {
        this.e = editText;
        this.f = cVar;
    }
}
