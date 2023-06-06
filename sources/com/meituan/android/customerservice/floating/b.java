package com.meituan.android.customerservice.floating;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.customerservice.kit.utils.c;
import com.meituan.android.customerservice.utils.d;
import com.meituan.android.customerservice.utils.f;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends LinearLayout {
    public static ChangeQuickRedirect a;
    final WindowManager b;
    private final WindowManager.LayoutParams c;
    private TextView d;
    private int e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        int a;
        int b;
        int c;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.floating.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0248b {
        a a;
        String b;
    }

    public static /* synthetic */ void a(b bVar, C0248b c0248b) {
        Object[] objArr = {c0248b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "b96519ebaf6adf81d5f9dc1ed7976955", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "b96519ebaf6adf81d5f9dc1ed7976955");
        } else if (c0248b != null) {
            if (c0248b.b != null) {
                bVar.d.setText(c0248b.b);
            }
            if (c0248b.a != null) {
                bVar.setPaddingAndBackGround(c0248b.a.a);
                bVar.setFloatingPosition(c0248b.a);
            }
            com.meituan.android.customerservice.floating.base.a.a(bVar.b, bVar, bVar.c, true);
            final int i = bVar.e + 1;
            bVar.e = i;
            f.a(new Runnable() { // from class: com.meituan.android.customerservice.floating.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b9bebe0dc314ac186ef79119d5e1bfd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b9bebe0dc314ac186ef79119d5e1bfd");
                    } else if (i == b.this.e) {
                        b.this.a();
                    }
                }
            }, MetricsAnrManager.ANR_THRESHOLD);
        }
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "72867b054873bf7dad7cb0cfa5cec9ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "72867b054873bf7dad7cb0cfa5cec9ad");
            return;
        }
        bVar.e++;
        com.meituan.android.customerservice.floating.base.a.b(bVar.b, bVar);
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9d3709558935677ee7fb7eef57b16d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9d3709558935677ee7fb7eef57b16d");
            return;
        }
        this.e = 0;
        inflate(getContext(), R.layout.cs_view_floating_tips, this);
        this.b = (WindowManager) getContext().getSystemService("window");
        this.d = (TextView) findViewById(R.id.tv_floating_tips);
        this.c = new WindowManager.LayoutParams();
        this.c.flags = 56;
        this.c.format = -2;
        this.c.width = -2;
        this.c.height = -2;
        com.meituan.android.customerservice.floating.base.a.a(this.c);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d61cede7ced3aabe4c7465a4c8bf8df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d61cede7ced3aabe4c7465a4c8bf8df");
        } else {
            f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ec6be628ef27a6cb735fd850155fb2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ec6be628ef27a6cb735fd850155fb2e");
                    } else {
                        b.b(b.this);
                    }
                }
            });
        }
    }

    private void setPaddingAndBackGround(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166cba56940167f05b4f28de294925a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166cba56940167f05b4f28de294925a0");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6eed9d6f6c1af61681f308c8eeb9db48", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6eed9d6f6c1af61681f308c8eeb9db48")).booleanValue();
        } else {
            z = d.a(i) && d.c(i);
        }
        if (z) {
            this.d.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.cs_floating_tips_top_left));
            this.d.setPadding(c.a(getContext(), 10.0f), c.a(getContext(), 16.5f), c.a(getContext(), 10.0f), c.a(getContext(), 10.0f));
            return;
        }
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "629066a200604c9e5e15075c95f71d95", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "629066a200604c9e5e15075c95f71d95")).booleanValue();
        } else {
            z2 = d.a(i) && d.d(i);
        }
        if (z2) {
            this.d.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.cs_floating_tips_top_right));
            this.d.setPadding(c.a(getContext(), 10.0f), c.a(getContext(), 16.5f), c.a(getContext(), 10.0f), c.a(getContext(), 10.0f));
            return;
        }
        Object[] objArr4 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = d.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c9790f92f7bf8e49c07640938fdd2ecd", RobustBitConfig.DEFAULT_VALUE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c9790f92f7bf8e49c07640938fdd2ecd")).booleanValue();
        } else {
            z3 = d.b(i) && d.d(i);
        }
        if (z3) {
            this.d.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.cs_floating_tips_bottom_right));
            this.d.setPadding(c.a(getContext(), 10.0f), c.a(getContext(), 10.0f), c.a(getContext(), 10.0f), c.a(getContext(), 16.5f));
            return;
        }
        Object[] objArr5 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect5 = d.a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "3777610ddea272c6ba1b3618fb21462f", RobustBitConfig.DEFAULT_VALUE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "3777610ddea272c6ba1b3618fb21462f")).booleanValue();
        } else if (!d.b(i) || !d.c(i)) {
            z4 = false;
        }
        if (z4) {
            this.d.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.cs_floating_tips_bottom_left));
            this.d.setPadding(c.a(getContext(), 10.0f), c.a(getContext(), 10.0f), c.a(getContext(), 10.0f), c.a(getContext(), 16.5f));
        }
    }

    private void setFloatingPosition(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4f36231172f1e6cc211ac187ea0566d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4f36231172f1e6cc211ac187ea0566d");
        } else if (aVar == null) {
        } else {
            this.c.x = aVar.b;
            this.c.y = aVar.c;
            this.c.gravity = aVar.a;
        }
    }
}
