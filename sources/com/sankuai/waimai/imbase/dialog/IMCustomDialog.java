package com.sankuai.waimai.imbase.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Looper;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Px;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMCustomDialog extends Dialog implements DialogInterface {
    public static ChangeQuickRedirect a;
    public TextView b;
    private EditText c;
    private boolean d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum c {
        CENTER;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8b3da9e33f974967d5360b5a6443330", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8b3da9e33f974967d5360b5a6443330");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d27160ed59e0db724f2d67273cfde43", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d27160ed59e0db724f2d67273cfde43") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df843d1969675b02e578918dddf0997e", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df843d1969675b02e578918dddf0997e") : (c[]) values().clone();
        }
    }

    private IMCustomDialog(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af45b9e3a24c8d94cc15acd8b4e9af9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af45b9e3a24c8d94cc15acd8b4e9af9");
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Window window;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06246d48fe5408659592e7da4f65bc96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06246d48fe5408659592e7da4f65bc96");
            return;
        }
        super.show();
        if (!this.d || (window = getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(5);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final b b;
        private final Context c;

        public a(@NonNull Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0666e2f44be2d9d8515639a8cfb35dcb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0666e2f44be2d9d8515639a8cfb35dcb");
                return;
            }
            this.c = context;
            this.b = new b(this.c);
        }

        @UiThread
        public final IMCustomDialog a() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean a2;
            boolean z4;
            int i;
            int i2;
            boolean z5;
            IMCustomDialog iMCustomDialog;
            Window window;
            boolean z6 = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bcda5147b2ae8d1a7b7ba6d103096d6", RobustBitConfig.DEFAULT_VALUE)) {
                return (IMCustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bcda5147b2ae8d1a7b7ba6d103096d6");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51c3a524f43dda202e7a6bbecd5290c6", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51c3a524f43dda202e7a6bbecd5290c6")).booleanValue();
            } else {
                z = Looper.myLooper() != Looper.getMainLooper();
            }
            if (z) {
                return null;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d45009fe4758ef6f6e2a83fa1a47162", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d45009fe4758ef6f6e2a83fa1a47162")).booleanValue();
            } else {
                z2 = (this.c instanceof Activity) && ((Activity) this.c).isFinishing();
            }
            if (z2) {
                return null;
            }
            try {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c2eb0bc8a2a6012a8e7a9807237af3f0", RobustBitConfig.DEFAULT_VALUE)) {
                    iMCustomDialog = (IMCustomDialog) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c2eb0bc8a2a6012a8e7a9807237af3f0");
                } else {
                    b bVar = this.b;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = b.a;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "c08e83b7a29107e882164dd785ed32a5", RobustBitConfig.DEFAULT_VALUE)) {
                        iMCustomDialog = (IMCustomDialog) PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "c08e83b7a29107e882164dd785ed32a5");
                    } else {
                        IMCustomDialog iMCustomDialog2 = new IMCustomDialog(bVar.b, 2131559321);
                        if (bVar.J != 0 && (window = iMCustomDialog2.getWindow()) != null) {
                            window.setWindowAnimations(bVar.J);
                        }
                        Object[] objArr6 = {iMCustomDialog2};
                        ChangeQuickRedirect changeQuickRedirect6 = b.a;
                        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "6c0260fb2cc71e67ea3674c71f25f20f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "6c0260fb2cc71e67ea3674c71f25f20f");
                        } else {
                            Object[] objArr7 = {iMCustomDialog2};
                            ChangeQuickRedirect changeQuickRedirect7 = b.a;
                            if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "b1f152136cd6eca83f9cff6415cafa1a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "b1f152136cd6eca83f9cff6415cafa1a");
                            } else {
                                int dimensionPixelSize = bVar.b.getResources().getDimensionPixelSize(R.dimen.wm_imbase_dialog_width_default);
                                Object[] objArr8 = {iMCustomDialog2, Integer.valueOf((int) R.layout.wm_imbase_dialog_layout), Integer.valueOf(dimensionPixelSize), -2, 17};
                                ChangeQuickRedirect changeQuickRedirect8 = b.a;
                                if (PatchProxy.isSupport(objArr8, bVar, changeQuickRedirect8, false, "ad04ced694f791aee8ad7d9159e5584c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, bVar, changeQuickRedirect8, false, "ad04ced694f791aee8ad7d9159e5584c");
                                } else {
                                    iMCustomDialog2.setContentView(R.layout.wm_imbase_dialog_layout);
                                    if (bVar.y != 0) {
                                        dimensionPixelSize = bVar.y;
                                    }
                                    int i3 = bVar.z != 0 ? bVar.z : -2;
                                    Window window2 = iMCustomDialog2.getWindow();
                                    if (window2 != null) {
                                        window2.setLayout(dimensionPixelSize, i3);
                                        window2.setGravity(17);
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) iMCustomDialog2.findViewById(R.id.dialog_main_panel);
                                Object[] objArr9 = {viewGroup};
                                ChangeQuickRedirect changeQuickRedirect9 = b.a;
                                if (PatchProxy.isSupport(objArr9, bVar, changeQuickRedirect9, false, "29be788e5afadaa0fbf8f386d35b9382", RobustBitConfig.DEFAULT_VALUE)) {
                                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr9, bVar, changeQuickRedirect9, false, "29be788e5afadaa0fbf8f386d35b9382")).booleanValue();
                                } else {
                                    TextView textView = (TextView) viewGroup.findViewById(R.id.dialog_title);
                                    z3 = textView != null && b.a(textView, bVar.d);
                                }
                                boolean z7 = false | z3;
                                Object[] objArr10 = {viewGroup};
                                ChangeQuickRedirect changeQuickRedirect10 = b.a;
                                if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect10, false, "b2b6fcccade9bb841f581766c00636de", RobustBitConfig.DEFAULT_VALUE)) {
                                    a2 = ((Boolean) PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect10, false, "b2b6fcccade9bb841f581766c00636de")).booleanValue();
                                } else {
                                    TextView textView2 = (TextView) viewGroup.findViewById(R.id.dialog_message);
                                    if (textView2 == null) {
                                        a2 = false;
                                    } else {
                                        bVar.L = textView2;
                                        if (bVar.i) {
                                            textView2.setScroller(new Scroller(bVar.b));
                                            textView2.setVerticalScrollBarEnabled(true);
                                            textView2.setMovementMethod(new ScrollingMovementMethod());
                                        } else {
                                            textView2.setScroller(null);
                                            textView2.setVerticalScrollBarEnabled(false);
                                            textView2.setMovementMethod(null);
                                        }
                                        if (bVar.h != -1) {
                                            textView2.setTextColor(bVar.h);
                                        }
                                        a2 = b.a(textView2, bVar.g);
                                    }
                                }
                                boolean z8 = z7 | a2;
                                Object[] objArr11 = {iMCustomDialog2, viewGroup};
                                ChangeQuickRedirect changeQuickRedirect11 = b.a;
                                if (PatchProxy.isSupport(objArr11, bVar, changeQuickRedirect11, false, "65aa9f6225a5fea97518e6566412c759", RobustBitConfig.DEFAULT_VALUE)) {
                                    z4 = ((Boolean) PatchProxy.accessDispatch(objArr11, bVar, changeQuickRedirect11, false, "65aa9f6225a5fea97518e6566412c759")).booleanValue();
                                } else {
                                    EditText editText = (EditText) viewGroup.findViewById(R.id.dialog_edit_text);
                                    if (editText != null) {
                                        if (!bVar.H) {
                                            editText.setVisibility(8);
                                        } else {
                                            iMCustomDialog2.c = editText;
                                            editText.setText(bVar.F);
                                            editText.setHint(bVar.G);
                                            z4 = true;
                                        }
                                    }
                                    z4 = false;
                                }
                                if (!(z4 | z8)) {
                                    viewGroup.setVisibility(8);
                                } else if (bVar.e != Integer.MIN_VALUE && bVar.f != Integer.MIN_VALUE) {
                                    viewGroup.setPadding(viewGroup.getPaddingLeft(), bVar.e, viewGroup.getRight(), bVar.f);
                                }
                                Object[] objArr12 = {iMCustomDialog2, (byte) 1};
                                ChangeQuickRedirect changeQuickRedirect12 = b.a;
                                if (PatchProxy.isSupport(objArr12, bVar, changeQuickRedirect12, false, "6cae0ca08b1a717db797cf2a83a95178", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr12, bVar, changeQuickRedirect12, false, "6cae0ca08b1a717db797cf2a83a95178");
                                    i2 = 1;
                                    i = 2;
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) iMCustomDialog2.findViewById(R.id.dialog_button_panel);
                                    if (viewGroup2 != null) {
                                        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.dialog_button_holder);
                                        if (viewGroup3 == null) {
                                            viewGroup3 = viewGroup2;
                                        }
                                        i = 2;
                                        if (!(bVar.a(iMCustomDialog2, viewGroup3, -1, R.id.dialog_button_positive, bVar.o, bVar.q, bVar.p) | bVar.a(iMCustomDialog2, viewGroup3, -2, R.id.dialog_button_negative, bVar.r, bVar.t, bVar.s) | bVar.a(iMCustomDialog2, viewGroup3, -3, R.id.dialog_button_neutral, bVar.u, bVar.w, bVar.v))) {
                                            viewGroup2.setVisibility(8);
                                        } else {
                                            viewGroup2.setVisibility(0);
                                            switch (viewGroup3.getChildCount()) {
                                                case 1:
                                                    viewGroup3.getChildAt(0).setBackgroundResource(R.drawable.wm_imbase_dialog_background_button_corner_both);
                                                    if (bVar.K) {
                                                        ((Button) viewGroup3.getChildAt(0)).setTextColor(bVar.b.getResources().getColor(R.color.wm_imbase_text_highlight));
                                                        break;
                                                    } else {
                                                        ((Button) viewGroup3.getChildAt(0)).setTextColor(bVar.b.getResources().getColor(R.color.wm_imbase_text_main));
                                                        break;
                                                    }
                                                case 2:
                                                    viewGroup3.getChildAt(0).setBackgroundResource(R.drawable.wm_imbase_dialog_background_button_corner_left);
                                                    ((Button) viewGroup3.getChildAt(0)).setTextColor(bVar.b.getResources().getColor(R.color.wm_imbase_text_main));
                                                    viewGroup3.getChildAt(1).setBackgroundResource(R.drawable.wm_imbase_dialog_background_button_corner_right);
                                                    if (bVar.K) {
                                                        ((Button) viewGroup3.getChildAt(1)).setTextColor(bVar.b.getResources().getColor(R.color.wm_imbase_text_highlight));
                                                        break;
                                                    } else {
                                                        ((Button) viewGroup3.getChildAt(1)).setTextColor(bVar.b.getResources().getColor(R.color.wm_imbase_text_main));
                                                        break;
                                                    }
                                            }
                                        }
                                    } else {
                                        i = 2;
                                    }
                                    i2 = 1;
                                }
                                Object[] objArr13 = new Object[i2];
                                objArr13[0] = iMCustomDialog2;
                                ChangeQuickRedirect changeQuickRedirect13 = b.a;
                                if (PatchProxy.isSupport(objArr13, bVar, changeQuickRedirect13, false, "a5e1e243da1e5327d0f973d60c59f3e4", RobustBitConfig.DEFAULT_VALUE)) {
                                    ((Boolean) PatchProxy.accessDispatch(objArr13, bVar, changeQuickRedirect13, false, "a5e1e243da1e5327d0f973d60c59f3e4")).booleanValue();
                                } else {
                                    FrameLayout frameLayout = (FrameLayout) iMCustomDialog2.findViewById(R.id.dialog_content_panel);
                                    if (frameLayout != null) {
                                        Object[] objArr14 = new Object[i];
                                        objArr14[0] = iMCustomDialog2;
                                        objArr14[1] = frameLayout;
                                        ChangeQuickRedirect changeQuickRedirect14 = b.a;
                                        if (PatchProxy.isSupport(objArr14, bVar, changeQuickRedirect14, false, "8779e0fd6f61ea96dcb384b6da09b1f8", RobustBitConfig.DEFAULT_VALUE)) {
                                            z5 = ((Boolean) PatchProxy.accessDispatch(objArr14, bVar, changeQuickRedirect14, false, "8779e0fd6f61ea96dcb384b6da09b1f8")).booleanValue();
                                        } else {
                                            if (bVar.m == null && bVar.l != 0) {
                                                bVar.m = bVar.c.inflate(bVar.l, (ViewGroup) frameLayout, false);
                                            }
                                            View view = bVar.m;
                                            Object[] objArr15 = new Object[i];
                                            objArr15[0] = frameLayout;
                                            objArr15[1] = view;
                                            ChangeQuickRedirect changeQuickRedirect15 = b.a;
                                            if (PatchProxy.isSupport(objArr15, null, changeQuickRedirect15, true, "d0a654c8168b9defff03914a746b1508", RobustBitConfig.DEFAULT_VALUE)) {
                                                z5 = ((Boolean) PatchProxy.accessDispatch(objArr15, null, changeQuickRedirect15, true, "d0a654c8168b9defff03914a746b1508")).booleanValue();
                                            } else if (view == null) {
                                                z5 = false;
                                            } else {
                                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                                if (layoutParams == null) {
                                                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                                } else {
                                                    layoutParams.width = -1;
                                                    layoutParams.height = -1;
                                                }
                                                if (view.getParent() != null) {
                                                    ((ViewGroup) view.getParent()).removeView(view);
                                                }
                                                frameLayout.addView(view, layoutParams);
                                                frameLayout.setVisibility(0);
                                                z5 = true;
                                            }
                                        }
                                        if (z5) {
                                            frameLayout.setVisibility(0);
                                        } else {
                                            frameLayout.setVisibility(8);
                                        }
                                    }
                                }
                                iMCustomDialog2.d = bVar.I;
                            }
                        }
                        Object[] objArr16 = {iMCustomDialog2};
                        ChangeQuickRedirect changeQuickRedirect16 = b.a;
                        if (PatchProxy.isSupport(objArr16, bVar, changeQuickRedirect16, false, "787e43e4d78cb9a44fc07ee7b8518bfb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr16, bVar, changeQuickRedirect16, false, "787e43e4d78cb9a44fc07ee7b8518bfb");
                        } else {
                            if (bVar.A && bVar.B) {
                                z6 = true;
                            }
                            iMCustomDialog2.setCanceledOnTouchOutside(z6);
                            iMCustomDialog2.setCancelable(bVar.A);
                            iMCustomDialog2.setOnCancelListener(bVar.C);
                            iMCustomDialog2.setOnDismissListener(bVar.D);
                            if (bVar.E != null) {
                                iMCustomDialog2.setOnKeyListener(bVar.E);
                            }
                        }
                        iMCustomDialog = iMCustomDialog2;
                    }
                }
                iMCustomDialog.show();
                return iMCustomDialog;
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return null;
            }
        }

        public final a a(CharSequence charSequence) {
            this.b.d = charSequence;
            return this;
        }

        public final a b(CharSequence charSequence) {
            this.b.g = charSequence;
            return this;
        }

        public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34eea90459974c001f28fa9d139adfa2", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34eea90459974c001f28fa9d139adfa2");
            }
            this.b.r = charSequence;
            this.b.s = onClickListener;
            this.b.t = true;
            return this;
        }

        public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b061eb301f052cbc910979073982970", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b061eb301f052cbc910979073982970") : a(charSequence, true, onClickListener);
        }

        public final a a(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb571c615b04adb057b860a580b7c438", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb571c615b04adb057b860a580b7c438");
            }
            this.b.o = charSequence;
            this.b.p = onClickListener;
            this.b.q = z;
            return this;
        }

        public final a a(boolean z) {
            this.b.A = false;
            return this;
        }

        public final a a(@Px int i, @Px int i2) {
            this.b.e = i;
            this.b.f = i2;
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public boolean A;
        public boolean B;
        public DialogInterface.OnCancelListener C;
        public DialogInterface.OnDismissListener D;
        public DialogInterface.OnKeyListener E;
        public String F;
        public String G;
        public boolean H;
        public boolean I;
        public int J;
        public boolean K;
        public TextView L;
        public Context b;
        public LayoutInflater c;
        public CharSequence d;
        @Px
        public int e;
        @Px
        public int f;
        public CharSequence g;
        @ColorInt
        public int h;
        public boolean i;
        public int j;
        public int k;
        public int l;
        public View m;
        public int n;
        public CharSequence o;
        public DialogInterface.OnClickListener p;
        public boolean q;
        public CharSequence r;
        public DialogInterface.OnClickListener s;
        public boolean t;
        public CharSequence u;
        public DialogInterface.OnClickListener v;
        public boolean w;
        public c x;
        public int y;
        public int z;

        public b(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4ba1e9fbf65bc2702ffe31067150f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4ba1e9fbf65bc2702ffe31067150f9");
                return;
            }
            this.e = Integer.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
            this.h = -1;
            this.j = -1;
            this.k = -1;
            this.n = 0;
            this.x = c.CENTER;
            this.y = 0;
            this.z = 0;
            this.A = true;
            this.B = true;
            this.H = false;
            this.I = false;
            this.K = true;
            this.b = context;
            this.c = LayoutInflater.from(context);
        }

        static boolean a(TextView textView, CharSequence charSequence) {
            Object[] objArr = {textView, charSequence};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8713e53cc4fe579e574d2a4ffc2e6ee9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8713e53cc4fe579e574d2a4ffc2e6ee9")).booleanValue();
            }
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
                return false;
            }
            textView.setText(charSequence);
            textView.setVisibility(0);
            return true;
        }

        boolean a(final IMCustomDialog iMCustomDialog, ViewGroup viewGroup, final int i, int i2, CharSequence charSequence, final boolean z, final DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {iMCustomDialog, viewGroup, Integer.valueOf(i), Integer.valueOf(i2), charSequence, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76338a9d762fea8388ff6e0768719037", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76338a9d762fea8388ff6e0768719037")).booleanValue();
            }
            TextView textView = (TextView) iMCustomDialog.findViewById(i2);
            if (textView == null) {
                return false;
            }
            if (TextUtils.isEmpty(charSequence)) {
                viewGroup.removeView(textView);
                return false;
            }
            if (-1 == i) {
                iMCustomDialog.b = textView;
            }
            boolean z2 = i == this.n;
            textView.setText(charSequence);
            if (z2) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
                textView.getPaint().setFakeBoldText(true);
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
                textView.getPaint().setFakeBoldText(false);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.imbase.dialog.IMCustomDialog.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "299eaae21242a0846eca2a8c59dcc0b5", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "299eaae21242a0846eca2a8c59dcc0b5");
                        return;
                    }
                    if (z) {
                        iMCustomDialog.dismiss();
                    }
                    if (onClickListener != null) {
                        onClickListener.onClick(iMCustomDialog, i);
                    }
                }
            });
            return true;
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c34bb94cdf7cf5241743824c1707f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c34bb94cdf7cf5241743824c1707f5")).booleanValue();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }
}
