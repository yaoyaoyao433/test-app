package com.meituan.android.pay.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BankCardNumEditText extends EditTextWithClearAndHelpButton {
    public static ChangeQuickRedirect a;
    private a n;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    public BankCardNumEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4fc50fa73ca27ab9da6470f9cb08833", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4fc50fa73ca27ab9da6470f9cb08833");
        }
    }

    public BankCardNumEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0be3bc180eca379b671fe90c72d12a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0be3bc180eca379b671fe90c72d12a");
        }
    }

    public BankCardNumEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad064082b3b9f2f3d82a2270dfdeda92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad064082b3b9f2f3d82a2270dfdeda92");
        }
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9170a34ab4cd902b4c4e1a5a3d839f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9170a34ab4cd902b4c4e1a5a3d839f");
        } else {
            addTextChangedListener(new TextWatcher() { // from class: com.meituan.android.pay.widget.BankCardNumEditText.1
                public static ChangeQuickRedirect a;

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    Object[] objArr2 = {editable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb44ee9f8968cec036665ad2948d5f96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb44ee9f8968cec036665ad2948d5f96");
                        return;
                    }
                    String replaceAll = editable.toString().replaceAll(StringUtil.SPACE, "");
                    BankCardNumEditText.this.c();
                    if (BankCardNumEditText.this.l != null) {
                        BankCardNumEditText.this.l.a(true);
                    }
                    if (BankCardNumEditText.this.n != null) {
                        BankCardNumEditText.this.n.a(replaceAll);
                    }
                    if (BankCardNumEditText.this.getContentErrorCheckListener() != null) {
                        BankCardNumEditText.this.getContentErrorCheckListener().a();
                    }
                }
            });
        }
    }

    public void setAfterTextChangedListener(a aVar) {
        this.n = aVar;
    }
}
