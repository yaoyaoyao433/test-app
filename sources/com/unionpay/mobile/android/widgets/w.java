package com.unionpay.mobile.android.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
/* loaded from: classes6.dex */
public final class w implements TextWatcher {
    final /* synthetic */ u a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(u uVar) {
        this.a = uVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ImageView imageView;
        ImageView imageView2;
        int i4;
        EditText editText;
        imageView = this.a.c;
        if (imageView == null) {
            return;
        }
        if (u.b(this.a)) {
            editText = this.a.b;
            if (editText.isFocused()) {
                imageView2 = this.a.c;
                i4 = 0;
                imageView2.setVisibility(i4);
            }
        }
        imageView2 = this.a.c;
        i4 = 8;
        imageView2.setVisibility(i4);
    }
}
