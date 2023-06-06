package com.meituan.passport.view;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
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
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class PassportClearTextView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    EditText b;
    private TextWatcher c;

    public PassportClearTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac5c4fc12e68fb49f6ca9d66565e0f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac5c4fc12e68fb49f6ca9d66565e0f3");
        }
    }

    public PassportClearTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36269314ce4e44fc13dd246269e2f5ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36269314ce4e44fc13dd246269e2f5ec");
        }
    }

    public PassportClearTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5310669dcc2187aa1cfb6f680813d52b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5310669dcc2187aa1cfb6f680813d52b");
            return;
        }
        this.c = new TextWatcher() { // from class: com.meituan.passport.view.PassportClearTextView.3
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "341d772acdfaeef841663eaa07a5b2c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "341d772acdfaeef841663eaa07a5b2c7");
                } else {
                    PassportClearTextView.this.a(editable, PassportClearTextView.this.b.hasFocus());
                }
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29f95993e2d2ee5103f61476426f141c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29f95993e2d2ee5103f61476426f141c");
            return;
        }
        Context context2 = getContext();
        if (context2 != null) {
            setVisibility(8);
            setContentDescription(context2.getString(R.string.passport_accessibility_clear_textview));
        }
    }

    public final void setControlerView(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb0a85824062ae5e5fd92ef437f37fef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb0a85824062ae5e5fd92ef437f37fef");
            return;
        }
        this.b = editText;
        this.b.addTextChangedListener(this.c);
        this.b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.meituan.passport.view.PassportClearTextView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a96c259f0ce3c51c9a7776663f5a461f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a96c259f0ce3c51c9a7776663f5a461f");
                } else {
                    PassportClearTextView.this.a(PassportClearTextView.this.b.getText(), z);
                }
            }
        });
        a(editText.getText(), editText.hasFocus());
        setOnClickListener(new View.OnClickListener() { // from class: com.meituan.passport.view.PassportClearTextView.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "862fae5b692a2cbd14bfccdbdd434bc7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "862fae5b692a2cbd14bfccdbdd434bc7");
                    return;
                }
                PassportClearTextView passportClearTextView = PassportClearTextView.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = PassportClearTextView.a;
                if (PatchProxy.isSupport(objArr3, passportClearTextView, changeQuickRedirect3, false, "b5ed47a9cad98490723803f32dbc798a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, passportClearTextView, changeQuickRedirect3, false, "b5ed47a9cad98490723803f32dbc798a");
                } else if (passportClearTextView.b != null) {
                    passportClearTextView.b.setText("");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Editable editable, boolean z) {
        Object[] objArr = {editable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edb469d79e351347f92673e1ef03513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edb469d79e351347f92673e1ef03513");
        } else if (TextUtils.isEmpty(editable) || !z) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }
}
