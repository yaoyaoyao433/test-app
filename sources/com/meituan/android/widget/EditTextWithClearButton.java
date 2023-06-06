package com.meituan.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EditTextWithClearButton extends EditText {
    public static ChangeQuickRedirect a;
    Drawable b;
    boolean c;
    private Drawable d;

    public EditTextWithClearButton(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee506a8f0d6d2992efc147433da8919e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee506a8f0d6d2992efc147433da8919e");
            return;
        }
        this.b = getResources().getDrawable(R.drawable.ic_clear);
        b();
    }

    public EditTextWithClearButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44688fc12684955d9464380240c6c545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44688fc12684955d9464380240c6c545");
            return;
        }
        this.b = getResources().getDrawable(R.drawable.ic_clear);
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78325dc3447a750328c89f4b019d7fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78325dc3447a750328c89f4b019d7fa");
            return;
        }
        this.b.setBounds(0, 0, this.b.getIntrinsicWidth(), this.b.getIntrinsicHeight());
        this.d = new Drawable() { // from class: com.meituan.android.widget.EditTextWithClearButton.1
            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        };
        this.d.setBounds(this.b.getBounds());
        a();
        setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.android.widget.EditTextWithClearButton.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1ae3d11213781f73ebe624ac3983f3a", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1ae3d11213781f73ebe624ac3983f3a")).booleanValue();
                }
                EditTextWithClearButton editTextWithClearButton = EditTextWithClearButton.this;
                Object[] objArr3 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = EditTextWithClearButton.a;
                if (PatchProxy.isSupport(objArr3, editTextWithClearButton, changeQuickRedirect3, false, "f62aa7de06854ee52aa7319c729e4910", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, editTextWithClearButton, changeQuickRedirect3, false, "f62aa7de06854ee52aa7319c729e4910")).booleanValue();
                }
                if (editTextWithClearButton.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && editTextWithClearButton.c && motionEvent.getX() > (editTextWithClearButton.getWidth() - editTextWithClearButton.getPaddingRight()) - editTextWithClearButton.b.getIntrinsicWidth()) {
                    editTextWithClearButton.setText("");
                    editTextWithClearButton.a();
                }
                return false;
            }
        });
        addTextChangedListener(new TextWatcher() { // from class: com.meituan.android.widget.EditTextWithClearButton.3
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f604a6da7e0af67c99e6b0186d0490b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f604a6da7e0af67c99e6b0186d0490b8");
                } else {
                    EditTextWithClearButton.this.a();
                }
            }
        });
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.meituan.android.widget.EditTextWithClearButton.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aae6341f8614809d9d6cf3dbccc1c94e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aae6341f8614809d9d6cf3dbccc1c94e");
                } else {
                    EditTextWithClearButton.this.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "590971fb8d3a22af1df4c69256b7a262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "590971fb8d3a22af1df4c69256b7a262");
        } else if (isFocused() && !TextUtils.isEmpty(getText().toString())) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.b, getCompoundDrawables()[3]);
            this.c = true;
        } else {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.d, getCompoundDrawables()[3]);
            this.c = false;
        }
    }

    public void setClearButton(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3baa4f1696366ba3b0f303f4c19c74f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3baa4f1696366ba3b0f303f4c19c74f");
            return;
        }
        try {
            this.b = getResources().getDrawable(i);
        } catch (Exception unused) {
            this.b = getResources().getDrawable(R.drawable.ic_clear);
        } finally {
            b();
        }
    }
}
