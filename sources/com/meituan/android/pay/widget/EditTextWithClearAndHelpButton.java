package com.meituan.android.pay.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.model.bean.Help;
import com.meituan.android.pay.utils.j;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ai;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EditTextWithClearAndHelpButton extends AppCompatEditText implements View.OnFocusChangeListener, View.OnTouchListener {
    public static ChangeQuickRedirect b;
    private Drawable a;
    protected Drawable c;
    protected Drawable d;
    protected boolean e;
    protected a f;
    protected c g;
    protected f h;
    protected int i;
    protected com.meituan.android.paybase.widgets.keyboard.a j;
    protected Help k;
    protected d l;
    protected boolean m;
    private b n;
    private boolean o;
    private boolean p;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(View view, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        boolean a(EditTextWithClearAndHelpButton editTextWithClearAndHelpButton);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface d {
        void a(boolean z);

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface f {
        void a();

        void b();

        void c();
    }

    public EditTextWithClearAndHelpButton(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "268f21e9c7044e64ac7cfb291ce87f65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "268f21e9c7044e64ac7cfb291ce87f65");
            return;
        }
        this.c = getResources().getDrawable(R.drawable.mpay__ic_clear_selector);
        this.d = getResources().getDrawable(R.drawable.mpay__ic_helper);
        this.n = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.o = false;
        this.i = -1;
        this.p = true;
        this.m = true;
        d();
    }

    public EditTextWithClearAndHelpButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b51f55864eee4e2f68f5894026e1f680", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b51f55864eee4e2f68f5894026e1f680");
            return;
        }
        this.c = getResources().getDrawable(R.drawable.mpay__ic_clear_selector);
        this.d = getResources().getDrawable(R.drawable.mpay__ic_helper);
        this.n = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.o = false;
        this.i = -1;
        this.p = true;
        this.m = true;
        d();
    }

    public EditTextWithClearAndHelpButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe60bf2278e39ec313da03c9091760ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe60bf2278e39ec313da03c9091760ba");
            return;
        }
        this.c = getResources().getDrawable(R.drawable.mpay__ic_clear_selector);
        this.d = getResources().getDrawable(R.drawable.mpay__ic_helper);
        this.n = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.o = false;
        this.i = -1;
        this.p = true;
        this.m = true;
        d();
    }

    public boolean b() {
        return this.p;
    }

    public void setShowClearButton(boolean z) {
        this.p = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class e extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public final void draw(@NonNull Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(@IntRange(from = 0, to = 255) int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        }

        public e() {
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c377d7f29ded166e9f890d7724ba46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c377d7f29ded166e9f890d7724ba46");
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf((int) R.drawable.mpay__bankitem_cursor));
        } catch (IllegalAccessException e2) {
            com.meituan.android.pay.common.analyse.b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "EditTextWithClearAndHelpButton_init").a("message", e2.getMessage()).b, u.b(this));
        } catch (NoSuchFieldException e3) {
            com.meituan.android.pay.common.analyse.b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "EditTextWithClearAndHelpButton_init").a("message", e3.getMessage()).b, u.b(this));
        }
        this.c.setBounds(0, 0, this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
        this.a = new e();
        this.a.setBounds(this.c.getBounds());
        this.d.setBounds(0, 0, this.d.getIntrinsicWidth(), this.d.getIntrinsicHeight());
        c();
        setOnTouchListener(this);
        if (this.m) {
            a();
            this.m = false;
        }
        setOnFocusChangeListener(this);
        setOnEditorActionListener(com.meituan.android.pay.widget.a.a(this));
    }

    public static /* synthetic */ boolean a(EditTextWithClearAndHelpButton editTextWithClearAndHelpButton, TextView textView, int i, KeyEvent keyEvent) {
        Object[] objArr = {editTextWithClearAndHelpButton, textView, Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6b82bf1e95e2f358bc910e68dc17910", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6b82bf1e95e2f358bc910e68dc17910")).booleanValue();
        }
        if (i == 6 && editTextWithClearAndHelpButton.l != null) {
            editTextWithClearAndHelpButton.l.b();
        }
        return false;
    }

    public void setEditTextListener(d dVar) {
        this.l = dVar;
    }

    public d getEditTextListener() {
        return this.l;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8585754d58440713b0e2fde86fd3ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8585754d58440713b0e2fde86fd3ad");
        } else {
            addTextChangedListener(new TextWatcher() { // from class: com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.1
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7ac35a7c7cce010c768f8cf0aeae236", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7ac35a7c7cce010c768f8cf0aeae236");
                        return;
                    }
                    EditTextWithClearAndHelpButton.this.c();
                    if (EditTextWithClearAndHelpButton.this.l != null) {
                        EditTextWithClearAndHelpButton.this.l.a(false);
                    }
                    if (EditTextWithClearAndHelpButton.this.g != null) {
                        EditTextWithClearAndHelpButton.this.g.a();
                    }
                    if (EditTextWithClearAndHelpButton.this.h != null) {
                        EditTextWithClearAndHelpButton.this.h.b();
                    }
                }
            });
        }
    }

    public boolean a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ce2e0c756ee523fd0d985cd61ca1d74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ce2e0c756ee523fd0d985cd61ca1d74")).booleanValue();
        }
        if (getCompoundDrawables()[2] != null && motionEvent.getAction() == 1) {
            if (!this.e) {
                if (this.o && motionEvent.getX() > (getWidth() - getPaddingRight()) - this.d.getIntrinsicWidth()) {
                    if (this.n != null) {
                        this.n.a(this);
                    } else if (this.k != null) {
                        j.a(this.k, this);
                    }
                    return true;
                }
            } else if (motionEvent.getX() > ((getWidth() - getPaddingRight()) - this.c.getIntrinsicWidth()) - 15) {
                setText("");
                c();
            }
            if (this.i != -1 && isFocusable()) {
                if (this.j != null && !this.j.f) {
                    this.j.a((EditText) view, this.i);
                    this.j.b();
                }
            } else if (isFocused()) {
                ai.b(this);
            }
            return false;
        }
        return false;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0237bb36bc96773ce07d5a076c502d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0237bb36bc96773ce07d5a076c502d55");
        } else if (isFocused() && !TextUtils.isEmpty(getText().toString()) && b()) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.c, getCompoundDrawables()[3]);
            this.e = true;
        } else {
            if (this.k != null || this.o) {
                setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.d, getCompoundDrawables()[3]);
            } else {
                setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.a, getCompoundDrawables()[3]);
            }
            this.e = false;
        }
    }

    public void setClearButton(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17be2c6316b87b68c6def74f5df0315c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17be2c6316b87b68c6def74f5df0315c");
            return;
        }
        try {
            this.c = getResources().getDrawable(i);
        } catch (Exception e2) {
            com.meituan.android.pay.common.analyse.b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "EditTextWithClearAndHelpButton_setClearButton").a("message", e2.getMessage()).b, u.b(this));
            this.c = getResources().getDrawable(R.drawable.mpay__ic_clear_selector);
        } finally {
            d();
        }
    }

    public final void a(Help help) {
        Object[] objArr = {help};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8954a0db7167d51bb45819a579852821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8954a0db7167d51bb45819a579852821");
            return;
        }
        this.k = help;
        if (help != null) {
            this.o = true;
        }
        d();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83adbf9456d5814fd48f5c90301dceef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83adbf9456d5814fd48f5c90301dceef");
            return;
        }
        a(view, z);
        c();
        if (this.f != null) {
            this.f.a(view, z);
        }
        if (this.h != null) {
            if (z) {
                this.h.a();
            } else {
                this.h.c();
            }
        }
    }

    public void a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a05af10fb36291c8dcc276a7303ac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a05af10fb36291c8dcc276a7303ac5");
        } else if (z) {
            if (this.i == -1) {
                if (this.j != null && this.j.f) {
                    this.j.a();
                }
                new Handler().post(com.meituan.android.pay.widget.b.a(this));
            } else if (this.j != null) {
                this.j.a((EditText) view, this.i);
                this.j.b();
            }
        }
    }

    public static /* synthetic */ void a(EditTextWithClearAndHelpButton editTextWithClearAndHelpButton) {
        Object[] objArr = {editTextWithClearAndHelpButton};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "633513d7e6690214734b3b54a6766df2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "633513d7e6690214734b3b54a6766df2");
        } else {
            ai.b(editTextWithClearAndHelpButton);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b46d45c5d760901c18545502e437744", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b46d45c5d760901c18545502e437744")).booleanValue() : a(view, motionEvent);
    }

    public void setSecurityKeyBoardType(int i) {
        this.i = i;
    }

    public void setKeyboardBuilder(com.meituan.android.paybase.widgets.keyboard.a aVar) {
        this.j = aVar;
    }

    public void setContentErrorCheckListener(c cVar) {
        this.g = cVar;
    }

    public c getContentErrorCheckListener() {
        return this.g;
    }

    public void setBankItemFocusChangeListener(a aVar) {
        this.f = aVar;
    }

    public void setSuggestListener(f fVar) {
        this.h = fVar;
    }

    public void setDrawableHelpButton(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df60fd314253e0fd0d450459f5873350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df60fd314253e0fd0d450459f5873350");
            return;
        }
        this.d = drawable;
        this.o = true;
        d();
    }

    public void setClickHelpButtonListener(b bVar) {
        this.n = bVar;
    }

    public int getShowType() {
        return this.i;
    }
}
