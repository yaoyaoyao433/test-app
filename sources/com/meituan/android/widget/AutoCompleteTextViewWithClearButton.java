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
import android.widget.AutoCompleteTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AutoCompleteTextViewWithClearButton extends AutoCompleteTextView {
    public static ChangeQuickRedirect a;
    private Drawable b;
    private Drawable c;
    private boolean d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public AutoCompleteTextViewWithClearButton(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c5365ac74a19307534698c726cb3059", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c5365ac74a19307534698c726cb3059");
            return;
        }
        this.b = getResources().getDrawable(R.drawable.ic_clear);
        a();
    }

    public AutoCompleteTextViewWithClearButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2857c0eb2bdd19abda1ce7b5cd85c7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2857c0eb2bdd19abda1ce7b5cd85c7b");
            return;
        }
        this.b = getResources().getDrawable(R.drawable.ic_clear);
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02b088f43c4b5c1e85ab16f5d24520e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02b088f43c4b5c1e85ab16f5d24520e6");
            return;
        }
        this.b.setBounds(0, 0, this.b.getIntrinsicWidth(), this.b.getIntrinsicHeight());
        this.c = new Drawable() { // from class: com.meituan.android.widget.AutoCompleteTextViewWithClearButton.1
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
        this.c.setBounds(this.b.getBounds());
        b();
        setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.android.widget.AutoCompleteTextViewWithClearButton.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "178d6d0e870ec288a17bc6838e78e061", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "178d6d0e870ec288a17bc6838e78e061")).booleanValue();
                }
                AutoCompleteTextViewWithClearButton autoCompleteTextViewWithClearButton = AutoCompleteTextViewWithClearButton.this;
                if (autoCompleteTextViewWithClearButton.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && AutoCompleteTextViewWithClearButton.this.d && motionEvent.getX() > (autoCompleteTextViewWithClearButton.getWidth() - autoCompleteTextViewWithClearButton.getPaddingRight()) - AutoCompleteTextViewWithClearButton.this.b.getIntrinsicWidth()) {
                    if (AutoCompleteTextViewWithClearButton.this.e != null) {
                        a unused = AutoCompleteTextViewWithClearButton.this.e;
                    }
                    autoCompleteTextViewWithClearButton.setText("");
                    AutoCompleteTextViewWithClearButton.this.b();
                }
                return false;
            }
        });
        addTextChangedListener(new TextWatcher() { // from class: com.meituan.android.widget.AutoCompleteTextViewWithClearButton.3
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc92302b625159819dbac4064e361f40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc92302b625159819dbac4064e361f40");
                } else {
                    AutoCompleteTextViewWithClearButton.this.b();
                }
            }
        });
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.meituan.android.widget.AutoCompleteTextViewWithClearButton.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cda44fe745bbe29799957222f24976a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cda44fe745bbe29799957222f24976a1");
                } else {
                    AutoCompleteTextViewWithClearButton.this.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29672fffa70f353335b0e86cddf9e16c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29672fffa70f353335b0e86cddf9e16c");
        } else if (isFocused() && !TextUtils.isEmpty(getText().toString())) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.b, getCompoundDrawables()[3]);
            this.d = true;
        } else {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.c, getCompoundDrawables()[3]);
            this.d = false;
        }
    }

    public void setClearButton(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa842df4b30c9407557c7660beef3cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa842df4b30c9407557c7660beef3cc");
            return;
        }
        try {
            this.b = getResources().getDrawable(i);
        } catch (Exception unused) {
            this.b = getResources().getDrawable(R.drawable.ic_clear);
        } finally {
            a();
        }
    }

    public void setClearButtonOnClickListener(a aVar) {
        this.e = aVar;
    }
}
