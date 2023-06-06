package com.meituan.android.paybase.utils.textwatcher;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
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
public final class b implements TextWatcher {
    public static ChangeQuickRedirect a;
    private boolean b;
    private WeakReference<EditText> c;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public b(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5867f772c80cca87d6697982ef2424d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5867f772c80cca87d6697982ef2424d1");
            return;
        }
        this.b = false;
        this.c = new WeakReference<>(editText);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d9c253da523aa1fd5baba3c0da2e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d9c253da523aa1fd5baba3c0da2e82");
        } else if (this.b) {
            this.b = false;
        } else {
            this.b = true;
            StringBuilder sb = new StringBuilder();
            String replace = charSequence.toString().replace(StringUtil.SPACE, "");
            int i4 = 0;
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
            EditText editText = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c9da9d9f735038f3979eb1b2d53c32d", RobustBitConfig.DEFAULT_VALUE) ? (EditText) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c9da9d9f735038f3979eb1b2d53c32d") : this.c.get();
            if (editText != null) {
                editText.setText(sb.toString());
            }
            int i6 = i + i3;
            if (i3 > 1) {
                i6 = sb.length();
            } else if (i6 % 5 == 0 && i6 != 0) {
                i6 = i2 == 0 ? i6 + 1 : i6 - 1;
            }
            if (editText != null) {
                try {
                    editText.setSelection(i6);
                } catch (Exception e) {
                    v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "BankcardNumberTextWatcher_onTextChanged").a("message", e.getMessage()).b);
                    editText.setSelection(0);
                }
            }
        }
    }
}
