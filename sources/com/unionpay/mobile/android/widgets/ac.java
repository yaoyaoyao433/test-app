package com.unionpay.mobile.android.widgets;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.unionpay.mobile.android.widgets.aa;
/* loaded from: classes6.dex */
public final class ac implements TextWatcher {
    final /* synthetic */ aa a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac(aa aaVar) {
        this.a = aaVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.a(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a.b.hasFocus() && TextUtils.isEmpty(this.a.b.b())) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.s());
            sb.append(this.a.d());
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aa.a aVar;
        aa.a aVar2;
        aVar = this.a.c;
        if (aVar != null) {
            aVar2 = this.a.c;
            aVar2.a(this.a.b, charSequence.toString());
        }
    }
}
