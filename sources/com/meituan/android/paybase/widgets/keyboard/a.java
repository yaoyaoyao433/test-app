package com.meituan.android.paybase.widgets.keyboard;

import android.animation.Animator;
import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.os.Build;
import android.os.Handler;
import android.support.constraint.R;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    CustomKeyboardView b;
    EditText c;
    ScrollView d;
    public Handler e;
    public boolean f;
    boolean g;
    boolean h;
    public int i;
    public Animator j;
    List<View> k;
    boolean l;
    boolean m;
    private Context n;
    private View o;
    private KeyboardView.OnKeyboardActionListener p;

    public a(Context context, LinearLayout linearLayout) {
        Object[] objArr = {context, linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c649ea8756c44d6c91cbfa3ad8d600", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c649ea8756c44d6c91cbfa3ad8d600");
            return;
        }
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = 1;
        this.l = false;
        this.m = false;
        this.p = new KeyboardView.OnKeyboardActionListener() { // from class: com.meituan.android.paybase.widgets.keyboard.a.1
            public static ChangeQuickRedirect a;

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void onRelease(int i) {
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
            public final void onText(CharSequence charSequence) {
                Object[] objArr2 = {charSequence};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a06c12fe828e72c68850ffb7a14b5abd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a06c12fe828e72c68850ffb7a14b5abd");
                } else if (a.this.c == null) {
                } else {
                    Editable text = a.this.c.getText();
                    int selectionStart = a.this.c.getSelectionStart();
                    a.this.c.setText(((Object) text.subSequence(0, selectionStart)) + charSequence.toString() + ((Object) text.subSequence(selectionStart, text.length())));
                    Selection.setSelection(a.this.c.getText(), selectionStart + 1);
                }
            }

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void onPress(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "050196dd4b35b0c8eafa9729527deb31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "050196dd4b35b0c8eafa9729527deb31");
                } else if (a.this.i == 1 || a.this.i == 3) {
                    a.this.b.setPreviewEnabled(false);
                }
            }

            @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
            public final void onKey(int i, int[] iArr) {
                Object[] objArr2 = {Integer.valueOf(i), iArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f54e0e4be7ec7e1ec2a44bb03046f703", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f54e0e4be7ec7e1ec2a44bb03046f703");
                } else if (a.this.c != null) {
                    Editable text = a.this.c.getText();
                    int selectionStart = a.this.c.getSelectionStart();
                    int selectionEnd = a.this.c.getSelectionEnd();
                    if (i == -3) {
                        a.this.a();
                    } else if (i != -5) {
                        if (i != 0) {
                            if (selectionEnd - selectionStart > 0) {
                                text.delete(selectionStart, selectionEnd);
                            }
                            text.insert(selectionStart, Character.toString((char) i));
                        }
                    } else if (text == null || text.length() <= 0) {
                    } else {
                        if (selectionEnd - selectionStart > 0) {
                            text.delete(selectionStart, selectionEnd);
                        } else if (selectionStart > 0) {
                            text.delete(selectionStart - 1, selectionStart);
                        }
                    }
                }
            }
        };
        this.n = context;
        Object[] objArr2 = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37fbe8e63f0d2987b90f15180cd6e184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37fbe8e63f0d2987b90f15180cd6e184");
            return;
        }
        this.o = LayoutInflater.from(this.n).inflate(R.layout.paybase__custom_keyboard_input, (ViewGroup) linearLayout, false);
        this.o.setVisibility(8);
        a(this.o);
        linearLayout.addView(this.o);
        d();
        if (this.k == null) {
            this.k = new ArrayList();
        } else {
            this.k.clear();
        }
    }

    public a(Context context, LinearLayout linearLayout, ScrollView scrollView) {
        this(context, linearLayout);
        Object[] objArr = {context, linearLayout, scrollView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028e0e6ac853fa56ee265b5ef1730fbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028e0e6ac853fa56ee265b5ef1730fbe");
        } else {
            this.d = scrollView;
        }
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0ca0b2319e4d7587fd09639606d91fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0ca0b2319e4d7587fd09639606d91fa");
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.safe_notice_info);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_safe_notice_info);
        com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
        if (cVar == null) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z = cVar.d;
        String str = cVar.e;
        if (z && !TextUtils.isEmpty(str)) {
            com.meituan.android.paybase.config.a.d().r().a(str).a(imageView);
            linearLayout.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(8);
    }

    boolean a(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c7e1638ed05282a8b4e02085cad5611", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c7e1638ed05282a8b4e02085cad5611")).booleanValue();
        }
        this.c = editText;
        InputMethodManager inputMethodManager = (InputMethodManager) this.n.getSystemService("input_method");
        boolean z = inputMethodManager.isActive() && inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        int i = Build.VERSION.SDK_INT;
        String str = i >= 16 ? "setShowSoftInputOnFocus" : i >= 14 ? "setSoftInputShownOnFocus" : null;
        if (str == null) {
            editText.setInputType(0);
        } else {
            try {
                Method method = EditText.class.getMethod(str, Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(editText, Boolean.FALSE);
            } catch (IllegalAccessException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "KeyboardBuilder_setKeyBoardCursorNew", (Map<String, Object>) null);
            } catch (IllegalArgumentException e2) {
                com.meituan.android.paybase.common.analyse.a.a(e2, "KeyboardBuilder_setKeyBoardCursorNew", (Map<String, Object>) null);
            } catch (NoSuchMethodException e3) {
                com.meituan.android.paybase.common.analyse.a.a(e3, "KeyboardBuilder_setKeyBoardCursorNew", (Map<String, Object>) null);
                editText.setInputType(0);
            } catch (InvocationTargetException e4) {
                com.meituan.android.paybase.common.analyse.a.a(e4, "KeyboardBuilder_setKeyBoardCursorNew", (Map<String, Object>) null);
            }
        }
        return z;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "113e07b45b4dcba1e37bc3423d4bd34a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "113e07b45b4dcba1e37bc3423d4bd34a");
            return;
        }
        if (this.b != null) {
            this.b.setVisibility(8);
        }
        d();
        this.f = true;
        this.b.setVisibility(0);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf((int) R.id.keyboard_view)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60fd86acb75975dd1131a63ba251a88f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60fd86acb75975dd1131a63ba251a88f");
            return;
        }
        this.b = (CustomKeyboardView) this.o.findViewById(R.id.keyboard_view);
        this.b.setEnabled(true);
        this.b.setOnKeyboardActionListener(this.p);
        this.b.setOnTouchListener(b.a());
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7e4f6de0a321667ed31dbc7a4e9825c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7e4f6de0a321667ed31dbc7a4e9825c");
        } else if (this.i == 1) {
            a(R.id.keyboard_view);
            this.b.setPreviewEnabled(false);
            this.b.setKeyboard(new Keyboard(this.n, R.xml.symbols));
        } else if (this.i == 3) {
            a(R.id.keyboard_view);
            this.b.setPreviewEnabled(false);
            this.b.setKeyboard(new Keyboard(this.n, R.xml.symbols_x));
        }
    }

    void b(EditText editText, int i) {
        Object[] objArr = {editText, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48710a40f20975c69839ee1854da7034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48710a40f20975c69839ee1854da7034");
        } else if (editText.equals(this.c) && this.f && this.i == i) {
        } else {
            this.i = i;
            if (a(editText)) {
                this.h = true;
                if (this.e == null) {
                    this.e = new Handler();
                }
                this.e.postDelayed(c.a(this, editText), 200L);
                return;
            }
            b(editText);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f1beae7b68e0a53dc1d869e51ae696a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f1beae7b68e0a53dc1d869e51ae696a");
            return;
        }
        this.c = editText;
        d(this.o);
        c();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade4ac0bd3cf728085e07d8eca58a5fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade4ac0bd3cf728085e07d8eca58a5fe");
            return;
        }
        this.f = false;
        e(this.o);
    }

    private void d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2efbdebb88447a29b4926122280981f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2efbdebb88447a29b4926122280981f");
        } else if (view == null) {
        } else {
            if (this.j != null && this.j.isRunning() && this.l) {
                this.j.cancel();
                view.setVisibility(0);
                return;
            }
            view.setVisibility(0);
            if (this.m || this.f) {
                return;
            }
            this.j = com.meituan.android.paybase.common.utils.anim.a.a(view, 200, new Animator.AnimatorListener() { // from class: com.meituan.android.paybase.widgets.keyboard.a.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e2008afe54d7740e2c42e16c27edc70", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e2008afe54d7740e2c42e16c27edc70");
                    } else {
                        a.this.m = true;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51ee8d71682896c28cb767aa025f6769", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51ee8d71682896c28cb767aa025f6769");
                    } else {
                        a.this.m = false;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4606deafca66c63dedbc5744a86d2cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4606deafca66c63dedbc5744a86d2cb");
                    } else {
                        a.this.m = false;
                    }
                }
            }, 0.0f, 1.0f);
        }
    }

    private void e(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab7278bbb0fba1e5c7e9bcd2b813082", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab7278bbb0fba1e5c7e9bcd2b813082");
        } else if (view != null && view.getVisibility() == 0) {
            if (this.j != null && this.j.isRunning()) {
                this.j.cancel();
            }
            this.j = com.meituan.android.paybase.common.utils.anim.a.a(view, 200, new Animator.AnimatorListener() { // from class: com.meituan.android.paybase.widgets.keyboard.a.3
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c86d964a3d6da47f0fb0e56f377975e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c86d964a3d6da47f0fb0e56f377975e4");
                    } else {
                        a.this.l = true;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd4866f70680eefe94ea26ac269cc9f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd4866f70680eefe94ea26ac269cc9f2");
                        return;
                    }
                    a.this.l = false;
                    view.setVisibility(8);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e14bf656e00f9e3fe6efb5b35381230", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e14bf656e00f9e3fe6efb5b35381230");
                    } else {
                        a.this.l = false;
                    }
                }
            }, 1.0f, 0.0f);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.widgets.keyboard.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class View$OnTouchListenerC0338a implements View.OnTouchListener {
        public static ChangeQuickRedirect a;
        private a b;
        private int c;

        public View$OnTouchListenerC0338a(a aVar, int i) {
            Object[] objArr = {aVar, 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "219da1f3f19c5562af78bbf7d8f405de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "219da1f3f19c5562af78bbf7d8f405de");
                return;
            }
            this.c = -1;
            this.b = aVar;
            this.c = 1;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Object[] objArr = {view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1467e20d7757dc6a95b1922b390c3eed", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1467e20d7757dc6a95b1922b390c3eed")).booleanValue();
            }
            if (motionEvent.getAction() == 1) {
                if (this.b == null || this.b.c == null || view.getId() == this.b.c.getId()) {
                    if (this.b == null || this.b.c != null) {
                        if (this.b != null) {
                            this.b.a((EditText) view);
                        }
                    } else {
                        this.b.b((EditText) view, this.c);
                    }
                } else {
                    this.b.b((EditText) view, this.c);
                }
            }
            return false;
        }
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a772af5122d69c2d08812860ed9f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a772af5122d69c2d08812860ed9f0d");
            return;
        }
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (view != null) {
            this.k.add(view);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e20102f16ec6b457fa4b41a5ffa1871", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e20102f16ec6b457fa4b41a5ffa1871");
        } else if (this.d == null || this.g) {
        } else {
            this.g = true;
            if (f()) {
                new Handler().postDelayed(d.a(this), this.h ? 500L : 200L);
            } else {
                new Handler().postDelayed(e.a(this), this.h ? 500L : 200L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7843b41ff02ba93c5c136cf09f2fe113", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7843b41ff02ba93c5c136cf09f2fe113")).intValue();
        }
        if (view == null || view == this.d) {
            return 0;
        }
        return view.getTop() + c((View) view.getParent());
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b0825db91f9cb72406ab17c432afee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b0825db91f9cb72406ab17c432afee")).booleanValue();
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) this.k) || this.c == null || !TextUtils.isEmpty(this.c.getText())) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            View view = this.k.get(i2);
            if (view != this.c && (view instanceof EditText) && TextUtils.isEmpty(((EditText) view).getText())) {
                i++;
            }
        }
        return i == 0;
    }

    public final void a(EditText editText, int i) {
        Object[] objArr = {editText, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e44873cacd8bd9a6db2e7a072641ae2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e44873cacd8bd9a6db2e7a072641ae2f");
        } else if (editText != null) {
            if (this.c == null || editText.getId() != this.c.getId()) {
                b(editText, i);
            } else {
                a(editText);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc59070c60b8a3420633a543e075c4d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc59070c60b8a3420633a543e075c4d9");
        } else if (this.f) {
            this.f = false;
            e();
            this.c = null;
        }
    }
}
