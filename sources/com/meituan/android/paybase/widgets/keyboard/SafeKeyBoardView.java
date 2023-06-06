package com.meituan.android.paybase.widgets.keyboard;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.os.Build;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SafeKeyBoardView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private a b;
    private CustomKeyboardView c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);

        void g();
    }

    public int getKeyboardLayout() {
        return R.xml.symbols;
    }

    public int getKeyboardViewLayout() {
        return R.layout.paybase__custom_keyboard_input;
    }

    public SafeKeyBoardView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fbdf7dd142a0eb29a79e323273fa15d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fbdf7dd142a0eb29a79e323273fa15d");
        } else {
            a();
        }
    }

    public SafeKeyBoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8823d68e11be6d08845bba63787c6aff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8823d68e11be6d08845bba63787c6aff");
        } else {
            a();
        }
    }

    public SafeKeyBoardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a0187a029622e2554b939aeb7cb99bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a0187a029622e2554b939aeb7cb99bf");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecaa37b3c18dbe4a7ebf24f098b0965b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecaa37b3c18dbe4a7ebf24f098b0965b");
            return;
        }
        this.c = (CustomKeyboardView) LayoutInflater.from(getContext()).inflate(getKeyboardViewLayout(), this).findViewById(R.id.keyboard_view);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.setOnKeyboardActionListener(new KeyboardView.OnKeyboardActionListener() { // from class: com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView.1
            public static ChangeQuickRedirect a;

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void onRelease(int i) {
            }

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void onText(CharSequence charSequence) {
            }

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void swipeDown() {
            }

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void swipeLeft() {
            }

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void swipeRight() {
            }

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void swipeUp() {
            }

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void onPress(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e235c51f5ecde0a22d70ebe149fa6eff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e235c51f5ecde0a22d70ebe149fa6eff");
                } else if (i != -5 || Build.VERSION.SDK_INT < 16) {
                } else {
                    SafeKeyBoardView.this.c.announceForAccessibility(SafeKeyBoardView.this.getContext().getString(R.string.paybase__keyboard_delete_pronunciation));
                }
            }

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void onKey(int i, int[] iArr) {
                Object[] objArr2 = {Integer.valueOf(i), iArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68cf06a522d1203a106fe95a5c5509ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68cf06a522d1203a106fe95a5c5509ac");
                } else if (SafeKeyBoardView.this.b == null) {
                } else {
                    if (i == -5) {
                        SafeKeyBoardView.this.b.g();
                    } else if (i != 0) {
                        SafeKeyBoardView.this.b.a(String.valueOf(i - 48));
                    }
                }
            }
        });
        this.c.setOnTouchListener(i.a());
        this.c.setPreviewEnabled(false);
        this.c.setKeyboard(new Keyboard(getContext(), getKeyboardLayout()));
        com.meituan.android.paybase.widgets.keyboard.a.a(this);
    }

    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4214a32d303138d04cdc42d697ed9b8a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4214a32d303138d04cdc42d697ed9b8a")).booleanValue() : motionEvent.getAction() == 2;
    }

    public a getListener() {
        return this.b;
    }

    public void setListener(a aVar) {
        this.b = aVar;
    }

    public void setKeyboard(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6cb67b97ed38a3a9ba6890f6ee3208", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6cb67b97ed38a3a9ba6890f6ee3208");
        } else if (this.c != null) {
            this.c.setKeyboard(new Keyboard(getContext(), i));
        }
    }
}
