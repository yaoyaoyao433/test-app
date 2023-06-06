package com.meituan.passport.country.textwatcher;

import android.text.Editable;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public b(EditText editText, com.meituan.passport.country.phonecontroler.c cVar) {
        super(editText, cVar);
        Object[] objArr = {editText, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f93111814efa68ff5d19621ebc57138", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f93111814efa68ff5d19621ebc57138");
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b = i;
        this.d = i3;
        this.c = i2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44421050083e608790d3e0f725b657bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44421050083e608790d3e0f725b657bd");
            return;
        }
        String replace = editable.toString().replace(StringUtil.SPACE, "");
        if (this.c + this.d == 1) {
            int i = this.b + this.d;
            if (this.b % 4 == 3 && this.d == 1) {
                i++;
            } else if (this.b % 4 == 0 && this.b != 0 && this.c == 1) {
                i--;
            }
            String a2 = this.f.a(replace);
            if (i >= a2.length()) {
                i = a2.length();
            }
            this.e.setText(a2);
            this.e.setSelection(i);
        }
    }
}
