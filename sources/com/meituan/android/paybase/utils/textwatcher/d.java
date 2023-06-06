package com.meituan.android.paybase.utils.textwatcher;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements TextWatcher {
    public static ChangeQuickRedirect a;
    private boolean b;
    private WeakReference<TextView> c;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public d(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4fb024b36932472db6151563ceeb7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4fb024b36932472db6151563ceeb7c");
            return;
        }
        this.b = false;
        this.c = new WeakReference<>(textView);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 3;
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dcf17efd6765eb8927e0b8f4249de35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dcf17efd6765eb8927e0b8f4249de35");
        } else if (this.b) {
            this.b = false;
        } else {
            this.b = true;
            StringBuilder sb = new StringBuilder();
            String replace = charSequence.toString().replace(StringUtil.SPACE, "");
            if (3 < replace.length()) {
                sb.append((CharSequence) replace, 0, 3);
                sb.append(StringUtil.SPACE);
            } else {
                i4 = 0;
            }
            while (true) {
                int i5 = i4 + 4;
                if (i5 >= replace.length()) {
                    break;
                }
                sb.append((CharSequence) replace, i4, i5);
                sb.append(StringUtil.SPACE);
                i4 = i5;
            }
            sb.append(replace.substring(i4));
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            TextView textView = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1eb75ed58d15fa2eb3e10b90408757cb", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1eb75ed58d15fa2eb3e10b90408757cb") : this.c.get();
            if (textView != null) {
                textView.setText(sb.toString());
                if (textView instanceof EditText) {
                    int i6 = i + i3;
                    if (i3 > 1) {
                        i6 = sb.length();
                    } else if (i6 == 4 || i6 == 9) {
                        i6 = i2 == 0 ? i6 + 1 : i6 - 1;
                    }
                    try {
                        ((EditText) textView).setSelection(i6);
                    } catch (Exception e) {
                        v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "PhoneNumberTextWatcher_onTextChanged").a("message", e.getMessage()).b);
                        ((EditText) textView).setSelection(0);
                    }
                }
            }
        }
    }
}
