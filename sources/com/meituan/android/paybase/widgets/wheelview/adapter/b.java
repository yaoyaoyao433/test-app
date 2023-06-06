package com.meituan.android.paybase.widgets.wheelview.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b<T> extends a {
    public static ChangeQuickRedirect d;
    private int a;
    protected List<T> e;
    public int f;
    public int g;
    protected Context h;
    protected LayoutInflater i;
    protected int j;
    protected int k;
    protected int l;
    public int m;
    public int n;
    public ArrayList<View> o;
    public int p;

    public abstract CharSequence a(int i);

    public b(Context context, int i, int i2, int i3, List<T> list) {
        Object[] objArr = {context, Integer.valueOf((int) R.layout.paybase__picker_item), Integer.valueOf((int) R.id.item_textview), Integer.valueOf(i3), list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c07e73fd3c5f402d17a7b654846e29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c07e73fd3c5f402d17a7b654846e29");
            return;
        }
        this.f = 9342350;
        this.a = 24;
        this.m = 20;
        this.n = 16;
        this.o = new ArrayList<>();
        this.h = context;
        this.j = R.layout.paybase__picker_item;
        this.k = R.id.item_textview;
        this.c = i3;
        this.e = list;
        this.i = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.adapter.c
    public final View a(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1913818236be118992cc636dce3008f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1913818236be118992cc636dce3008f8");
        }
        if (i < 0 || i >= a()) {
            return null;
        }
        if (view == null) {
            view = a(this.j, viewGroup);
        }
        TextView a = a(view, this.k);
        if (!this.o.contains(a)) {
            this.o.add(a);
        }
        if (a != null) {
            CharSequence a2 = a(i);
            if (a2 == null) {
                a2 = "";
            }
            a.setText(a2);
            if (i == this.c) {
                a.setTextSize(this.m);
                a.setTextColor(this.g);
            } else {
                a.setTextSize(this.n);
                a.setTextColor(this.f);
            }
            if (this.j == -1) {
                a(a);
            }
        }
        return view;
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.adapter.a, com.meituan.android.paybase.widgets.wheelview.adapter.c
    public final View a(View view, ViewGroup viewGroup) {
        Object[] objArr = {view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca792cd9367605a570a195740f68df6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca792cd9367605a570a195740f68df6");
        }
        if (view == null) {
            view = a(this.l, viewGroup);
        }
        if (this.l == -1 && (view instanceof TextView)) {
            a((TextView) view);
        }
        return view;
    }

    private void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f521f243d595e6441d11762fa4e0928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f521f243d595e6441d11762fa4e0928");
            return;
        }
        textView.setTextColor(this.f);
        textView.setGravity(17);
        textView.setTextSize(this.a);
        textView.setLines(1);
        textView.setTypeface(Typeface.SANS_SERIF, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.widget.TextView a(android.view.View r12, int r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2 = 1
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.paybase.widgets.wheelview.adapter.b.d
            java.lang.String r10 = "9dafdfa3fb6b349ed8cfe1cb9ecb772b"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            android.widget.TextView r12 = (android.widget.TextView) r12
            return r12
        L25:
            r0 = 0
            if (r13 != 0) goto L31
            boolean r1 = r12 instanceof android.widget.TextView     // Catch: java.lang.ClassCastException -> L2f
            if (r1 == 0) goto L31
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch: java.lang.ClassCastException -> L2f
            goto L64
        L2f:
            r12 = move-exception
            goto L3b
        L31:
            if (r13 == 0) goto L63
            android.view.View r12 = r12.findViewById(r13)     // Catch: java.lang.ClassCastException -> L2f
            r0 = r12
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.ClassCastException -> L2f
            goto L63
        L3b:
            com.meituan.android.paybase.common.analyse.a$c r13 = new com.meituan.android.paybase.common.analyse.a$c
            r13.<init>()
            java.lang.String r0 = "scene"
            java.lang.String r1 = "AbstractWheelTextAdapter_getTextView"
            com.meituan.android.paybase.common.analyse.a$c r13 = r13.a(r0, r1)
            java.lang.String r0 = r12.getMessage()
            java.lang.String r1 = "message"
            com.meituan.android.paybase.common.analyse.a$c r13 = r13.a(r1, r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r13 = r13.b
            java.lang.String r0 = "b_an74lgy8"
            com.meituan.android.paybase.utils.v.a(r0, r13)
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "AbstractWheelAdapter requires the resource ID to be a TextView"
            r13.<init>(r0, r12)
            throw r13
        L63:
            r12 = r0
        L64:
            if (r12 == 0) goto L6b
            int r13 = r11.p
            r12.setGravity(r13)
        L6b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.paybase.widgets.wheelview.adapter.b.a(android.view.View, int):android.widget.TextView");
    }

    private View a(int i, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0089eb81de6fd618a88a6313af7bae3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0089eb81de6fd618a88a6313af7bae3e");
        }
        switch (i) {
            case -1:
                return new TextView(this.h);
            case 0:
                return null;
            default:
                return this.i.inflate(i, viewGroup, false);
        }
    }

    public final List<T> c() {
        return this.e;
    }
}
