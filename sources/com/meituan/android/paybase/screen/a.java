package com.meituan.android.paybase.screen;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static int n = Integer.MAX_VALUE;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603111270e7459fecbd41ee7c0722020", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603111270e7459fecbd41ee7c0722020");
        } else if (context == null || attributeSet == null) {
        } else {
            b a2 = b.a();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e6ae1a3e0453e6c0a4b1ac449ac6fc16", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e6ae1a3e0453e6c0a4b1ac449ac6fc16");
            } else if (context != null && !a2.e) {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                a2.b = displayMetrics.widthPixels;
                a2.c = displayMetrics.heightPixels;
                a2.d = displayMetrics.density;
                a2.e = true;
                if (a2.d > 0.0f) {
                    a2.f = ((2.0f / a2.d) * a2.b) / 750.0f;
                    a2.g = ((2.0f / a2.d) * a2.c) / 1334.0f;
                }
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, 16842965, 16842966, 16842967, 16842968, 16842969, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, 16843071, 16843072});
            Object[] objArr3 = {obtainStyledAttributes};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "836b1f0d7cb78ad8c83840e03efe977b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "836b1f0d7cb78ad8c83840e03efe977b");
            } else if (obtainStyledAttributes != null) {
                this.b = obtainStyledAttributes.getLayoutDimension(6, n);
                if (a(this.b)) {
                    this.b = b.a().a(this.b);
                }
                this.c = obtainStyledAttributes.getLayoutDimension(7, n);
                if (a(this.c)) {
                    this.c = b.a().b(this.c);
                }
                this.l = obtainStyledAttributes.getLayoutDimension(13, n);
                if (a(this.l)) {
                    this.l = b.a().a(this.l);
                }
                this.m = obtainStyledAttributes.getLayoutDimension(14, n);
                if (a(this.m)) {
                    this.m = b.a().b(this.m);
                }
                Object[] objArr4 = {obtainStyledAttributes};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "36ee6fc124c407590bc2543f54800db0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "36ee6fc124c407590bc2543f54800db0");
                } else {
                    int layoutDimension = obtainStyledAttributes.getLayoutDimension(1, n);
                    this.e = obtainStyledAttributes.getLayoutDimension(2, n);
                    if (a(this.e)) {
                        this.e = b.a().a(this.e);
                    } else if (a(layoutDimension)) {
                        this.e = layoutDimension;
                        this.e = b.a().a(this.e);
                    }
                    this.f = obtainStyledAttributes.getLayoutDimension(4, n);
                    if (a(this.f)) {
                        this.f = b.a().a(this.f);
                    } else if (a(layoutDimension)) {
                        this.f = layoutDimension;
                        this.f = b.a().a(this.f);
                    }
                    this.d = obtainStyledAttributes.getLayoutDimension(3, n);
                    if (a(this.d)) {
                        this.d = b.a().b(this.d);
                    } else if (a(layoutDimension)) {
                        this.d = layoutDimension;
                        this.d = b.a().b(this.d);
                    }
                    this.g = obtainStyledAttributes.getLayoutDimension(5, n);
                    if (a(this.g)) {
                        this.g = b.a().b(this.g);
                    } else if (a(layoutDimension)) {
                        this.g = layoutDimension;
                        this.g = b.a().b(this.g);
                    }
                }
                Object[] objArr5 = {obtainStyledAttributes};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ab384b30aa815ddfafe9db07b76908b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ab384b30aa815ddfafe9db07b76908b4");
                } else {
                    int layoutDimension2 = obtainStyledAttributes.getLayoutDimension(8, n);
                    this.i = obtainStyledAttributes.getLayoutDimension(9, n);
                    if (a(this.i)) {
                        this.i = b.a().a(this.i);
                    } else if (a(layoutDimension2)) {
                        this.i = layoutDimension2;
                        this.i = b.a().a(this.i);
                    }
                    this.j = obtainStyledAttributes.getLayoutDimension(11, n);
                    if (a(this.j)) {
                        this.j = b.a().a(this.j);
                    } else if (a(layoutDimension2)) {
                        this.j = layoutDimension2;
                        this.j = b.a().a(this.j);
                    }
                    this.h = obtainStyledAttributes.getLayoutDimension(10, n);
                    if (a(this.h)) {
                        this.h = b.a().b(this.h);
                    } else if (a(layoutDimension2)) {
                        this.h = layoutDimension2;
                        this.h = b.a().b(this.h);
                    }
                    this.k = obtainStyledAttributes.getLayoutDimension(12, n);
                    if (a(this.k)) {
                        this.k = b.a().b(this.k);
                    } else if (a(layoutDimension2)) {
                        this.k = layoutDimension2;
                        this.k = b.a().b(this.k);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "395263c855d153d8b35c16c562c426b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "395263c855d153d8b35c16c562c426b4");
            return;
        }
        c(view);
        b(view);
        if (a(this.l)) {
            view.setMinimumWidth(this.l);
        }
        if (a(this.m)) {
            view.setMinimumHeight(this.m);
        }
    }

    private void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29bba6f083670c262d2249905f18de9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29bba6f083670c262d2249905f18de9c");
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTextSize(2, b.a().a(textView.getTextSize()) / b.a().d);
        }
    }

    private void c(View view) {
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "037f345581cc18122390f7c67d29864b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "037f345581cc18122390f7c67d29864b");
            return;
        }
        if (a(this.e)) {
            paddingLeft = this.e;
        } else {
            paddingLeft = view.getPaddingLeft();
        }
        if (a(this.d)) {
            paddingTop = this.d;
        } else {
            paddingTop = view.getPaddingTop();
        }
        if (a(this.f)) {
            paddingRight = this.f;
        } else {
            paddingRight = view.getPaddingRight();
        }
        if (a(this.g)) {
            paddingBottom = this.g;
        } else {
            paddingBottom = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public final void a(ViewGroup.LayoutParams layoutParams) {
        int i;
        int i2;
        int i3;
        int i4;
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ff1ed1a2adfc87c57344ad775fffefa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ff1ed1a2adfc87c57344ad775fffefa");
        } else if (layoutParams == null) {
        } else {
            if (a(this.b) && layoutParams.width != -2 && layoutParams.width != -1) {
                layoutParams.width = this.b;
            }
            if (a(this.c) && layoutParams.height != -2 && layoutParams.height != -1) {
                layoutParams.height = this.c;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (a(this.i)) {
                    i = this.i;
                } else {
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                }
                if (a(this.h)) {
                    i2 = this.h;
                } else {
                    i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                }
                if (a(this.j)) {
                    i3 = this.j;
                } else {
                    i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
                if (a(this.k)) {
                    i4 = this.k;
                } else {
                    i4 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, i2, i3, i4);
            }
        }
    }

    private static boolean a(int i) {
        return i != n;
    }
}
