package com.meituan.android.paybase.utils.textwatcher;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements TextWatcher {
    public static ChangeQuickRedirect a;
    private boolean b;
    private WeakReference<TextView> c;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb92cafe2009ec9f31b576a27f4ad3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb92cafe2009ec9f31b576a27f4ad3f");
            return;
        }
        this.b = false;
        this.c = new WeakReference<>(textView);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String replace;
        String str;
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ef3d8826685fe53c213c32ce4fdfb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ef3d8826685fe53c213c32ce4fdfb3");
        } else if (this.b) {
            this.b = false;
        } else {
            this.b = true;
            if (charSequence.toString().replace(StringUtil.SPACE, "").replace("/", "").length() < 4) {
                str = "";
            } else {
                str = "" + replace.substring(0, 2) + "/" + replace.substring(2, 4);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            TextView textView = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cd5c24521a02f61e4daa3bd53988e2a", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cd5c24521a02f61e4daa3bd53988e2a") : this.c.get();
            if (textView != null) {
                textView.setText(str);
                if (textView instanceof EditText) {
                    ((EditText) textView).setSelection(str.length());
                }
            }
        }
    }
}
