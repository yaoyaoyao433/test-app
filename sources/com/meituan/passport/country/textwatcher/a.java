package com.meituan.passport.country.textwatcher;

import android.text.Editable;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public a(EditText editText, com.meituan.passport.country.phonecontroler.c cVar) {
        super(editText, cVar);
        Object[] objArr = {editText, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20cf27e4e41b4a72e087a9456e7ec09d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20cf27e4e41b4a72e087a9456e7ec09d");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daff405543fb23d59bfb763502fecfd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daff405543fb23d59bfb763502fecfd4");
            return;
        }
        String replace = editable.toString().replace(StringUtil.SPACE, "");
        if (this.c + this.d == 1) {
            int i = this.b + this.d;
            if ((this.b == 3 || this.b == 8) && this.d == 1) {
                i++;
            } else if ((this.b == 4 || this.b == 9) && this.c == 1) {
                i--;
            }
            String a2 = this.f.a(replace);
            if (i >= a2.length()) {
                i = a2.length();
            }
            int i2 = i <= 13 ? i : 13;
            this.e.setText(a2);
            this.e.setSelection(i2);
        }
    }
}
