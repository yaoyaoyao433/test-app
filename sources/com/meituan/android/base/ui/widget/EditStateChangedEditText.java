package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EditStateChangedEditText extends EditText {
    public static ChangeQuickRedirect a;
    private boolean b;

    public EditStateChangedEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5891526c8bf1e63493bd60c2e0310a8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5891526c8bf1e63493bd60c2e0310a8c");
            return;
        }
        this.b = false;
        a(context);
    }

    public EditStateChangedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4baf5d53d2ab7ac2c019bf17eb88d92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4baf5d53d2ab7ac2c019bf17eb88d92");
            return;
        }
        this.b = false;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf99af9252de3f859bae776866dc280c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf99af9252de3f859bae776866dc280c");
            return;
        }
        setOnFocusChangeListener(new a());
        addTextChangedListener(new b());
        setCompoundDrawablePadding(com.meituan.android.base.ui.a.a(context, 5.0f));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {EditStateChangedEditText.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95bdd4411f285094dcafdc90b4aaa071", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95bdd4411f285094dcafdc90b4aaa071");
            }
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f1918366c128c4a08a376d6a36efc7c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f1918366c128c4a08a376d6a36efc7c");
                return;
            }
            EditStateChangedEditText.this.b = z;
            EditStateChangedEditText.this.a(!TextUtils.isEmpty(((EditText) view).getText().toString()), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements TextWatcher {
        public static ChangeQuickRedirect a;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private b() {
            Object[] objArr = {EditStateChangedEditText.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f51918bba09242b235ee3f80ad2ffa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f51918bba09242b235ee3f80ad2ffa");
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object[] objArr = {editable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b727746b1b004f3a50b0ec674c16c80c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b727746b1b004f3a50b0ec674c16c80c");
                return;
            }
            EditStateChangedEditText editStateChangedEditText = EditStateChangedEditText.this;
            editStateChangedEditText.a(!TextUtils.isEmpty(editable.toString()), editStateChangedEditText.b);
        }
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41821796acbb1f6b2f0e5fbc007beecf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41821796acbb1f6b2f0e5fbc007beecf");
        } else if (!z) {
            setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (!z2) {
            setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.commonui_btn_edit_normal, 0);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.commonui_btn_edit_pressed, 0);
        }
    }
}
