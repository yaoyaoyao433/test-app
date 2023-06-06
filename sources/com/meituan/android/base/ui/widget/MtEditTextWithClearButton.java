package com.meituan.android.base.ui.widget;

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
/* loaded from: classes2.dex */
public class MtEditTextWithClearButton extends EditText {
    public static ChangeQuickRedirect a;
    private Drawable b;
    private Drawable c;
    private boolean d;
    private View.OnTouchListener e;
    private View.OnFocusChangeListener f;

    public MtEditTextWithClearButton(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5049c3314e967bf3001e9c00dc1bb9f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5049c3314e967bf3001e9c00dc1bb9f5");
            return;
        }
        this.b = getResources().getDrawable(R.drawable.commonui_ic_search_clear);
        a();
    }

    public MtEditTextWithClearButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5786010276069d471aecdaa2b8f1e5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5786010276069d471aecdaa2b8f1e5a");
            return;
        }
        this.b = getResources().getDrawable(R.drawable.commonui_ic_search_clear);
        a();
    }

    public void setMtOnTouchListener(View.OnTouchListener onTouchListener) {
        this.e = onTouchListener;
    }

    public void setMtOnFocusListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f = onFocusChangeListener;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa9804f9bdf75ad69fb3c363852321b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa9804f9bdf75ad69fb3c363852321b");
            return;
        }
        this.b.setBounds(0, 0, this.b.getIntrinsicWidth(), this.b.getIntrinsicHeight());
        this.c = new Drawable() { // from class: com.meituan.android.base.ui.widget.MtEditTextWithClearButton.1
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
        setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.android.base.ui.widget.MtEditTextWithClearButton.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfacc4ac8e65f24ff39e8d322aecde4c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfacc4ac8e65f24ff39e8d322aecde4c")).booleanValue();
                }
                if (MtEditTextWithClearButton.this.e != null) {
                    MtEditTextWithClearButton.this.e.onTouch(view, motionEvent);
                }
                MtEditTextWithClearButton mtEditTextWithClearButton = MtEditTextWithClearButton.this;
                if (mtEditTextWithClearButton.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && MtEditTextWithClearButton.this.d && motionEvent.getX() > (mtEditTextWithClearButton.getWidth() - mtEditTextWithClearButton.getPaddingRight()) - MtEditTextWithClearButton.this.b.getIntrinsicWidth()) {
                    mtEditTextWithClearButton.setText("");
                    MtEditTextWithClearButton.this.b();
                }
                return false;
            }
        });
        addTextChangedListener(new TextWatcher() { // from class: com.meituan.android.base.ui.widget.MtEditTextWithClearButton.3
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d558e7bf1f78c760de57cf64234dc9d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d558e7bf1f78c760de57cf64234dc9d");
                } else {
                    MtEditTextWithClearButton.this.b();
                }
            }
        });
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.meituan.android.base.ui.widget.MtEditTextWithClearButton.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4718b84a7b5537126afd46f8fb1fd645", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4718b84a7b5537126afd46f8fb1fd645");
                    return;
                }
                if (MtEditTextWithClearButton.this.f != null) {
                    MtEditTextWithClearButton.this.f.onFocusChange(view, z);
                }
                MtEditTextWithClearButton.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c72b3bd206b739d862573546c5bb4c0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c72b3bd206b739d862573546c5bb4c0d");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b79e43a4124a9451e47f7258ffb017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b79e43a4124a9451e47f7258ffb017");
            return;
        }
        try {
            this.b = getResources().getDrawable(i);
        } catch (Exception unused) {
            this.b = getResources().getDrawable(R.drawable.commonui_ic_search_clear);
        } finally {
            a();
        }
    }
}
