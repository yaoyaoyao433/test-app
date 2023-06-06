package com.sankuai.meituan.android.ui.widget;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SnackbarLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private Button c;
    private int d;
    private Snackbar e;
    private b f;
    private a g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(View view);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(View view, int i, int i2, int i3, int i4);
    }

    public void setSnackbar(Snackbar snackbar) {
        this.e = snackbar;
    }

    public SnackbarLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f94bd3b32bdcbdf601c84a879fdb9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f94bd3b32bdcbdf601c84a879fdb9f");
        }
    }

    public SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d5f873116ff70d52b79597b95b0f2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d5f873116ff70d52b79597b95b0f2b");
            return;
        }
        this.d = -1;
        setClickable(true);
        LayoutInflater.from(context).inflate(R.layout.snackbar_design_layout_include_mt, this);
        ViewCompat.setAccessibilityLiveRegion(this, 1);
        ViewCompat.setImportantForAccessibility(this, 1);
        setFitsSystemWindows(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.sankuai.meituan.android.ui.widget.SnackbarLayout.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i;
                int i2 = 0;
                Object[] objArr2 = {view, windowInsetsCompat};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "180bc1b8c300e4480fa3ccfe8f11587d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WindowInsetsCompat) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "180bc1b8c300e4480fa3ccfe8f11587d");
                }
                if (SnackbarLayout.this.e != null && windowInsetsCompat != null) {
                    Snackbar snackbar = SnackbarLayout.this.e;
                    Object[] objArr3 = {windowInsetsCompat};
                    ChangeQuickRedirect changeQuickRedirect3 = Snackbar.a;
                    if (PatchProxy.isSupport(objArr3, snackbar, changeQuickRedirect3, false, "18ca5e5a5456d0893919f94806fd2e86", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, snackbar, changeQuickRedirect3, false, "18ca5e5a5456d0893919f94806fd2e86");
                    } else {
                        ViewGroup.LayoutParams layoutParams = snackbar.d.getLayoutParams();
                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && ((snackbar.c & 80) == 80 || (snackbar.c & 48) == 48)) {
                            if (snackbar.g == null || snackbar.g.length != 4) {
                                i = 0;
                            } else {
                                i2 = snackbar.g[1];
                                i = snackbar.g[3];
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.topMargin = i2 + windowInsetsCompat.getSystemWindowInsetTop();
                            marginLayoutParams.bottomMargin = i + windowInsetsCompat.getSystemWindowInsetBottom();
                        }
                    }
                }
                return windowInsetsCompat;
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf1988ba4005150e03084a670c085205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf1988ba4005150e03084a670c085205");
            return;
        }
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.snackbar_text);
        this.c = (Button) findViewById(R.id.snackbar_action);
    }

    public TextView getMessageView() {
        return this.b;
    }

    public Button getActionView() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (a(1, r0, r0 - r1) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (a(0, r0, r0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r9 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        super.onMeasure(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    @Override // android.widget.LinearLayout, android.view.View
    @android.annotation.SuppressLint({"Range"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.android.ui.widget.SnackbarLayout.a
            java.lang.String r11 = "f49bec3f7c596a04784cf04f7ec3d972"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            return
        L26:
            super.onMeasure(r13, r14)
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131297127(0x7f090367, float:1.821219E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r12.getResources()
            r2 = 2131297128(0x7f090368, float:1.8212192E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r12.b     // Catch: java.lang.Exception -> L4d
            android.text.Layout r2 = r2.getLayout()     // Catch: java.lang.Exception -> L4d
            int r2 = r2.getLineCount()     // Catch: java.lang.Exception -> L4d
            if (r2 <= r9) goto L4d
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            if (r2 == 0) goto L67
            int r3 = r12.d
            if (r3 <= 0) goto L67
            android.widget.Button r3 = r12.c
            int r3 = r3.getMeasuredWidth()
            int r4 = r12.d
            if (r3 <= r4) goto L67
            int r1 = r0 - r1
            boolean r0 = r12.a(r9, r0, r1)
            if (r0 == 0) goto L72
            goto L73
        L67:
            if (r2 == 0) goto L6a
            goto L6b
        L6a:
            r0 = r1
        L6b:
            boolean r0 = r12.a(r8, r0, r0)
            if (r0 == 0) goto L72
            goto L73
        L72:
            r9 = 0
        L73:
            if (r9 == 0) goto L78
            super.onMeasure(r13, r14)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.ui.widget.SnackbarLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "547fa83cf48be71e976780b4f2fda59e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "547fa83cf48be71e976780b4f2fda59e");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.f != null) {
            this.f.a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2713bb9d9bd4bbe6f398ecaa8f434472", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2713bb9d9bd4bbe6f398ecaa8f434472");
            return;
        }
        super.onAttachedToWindow();
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daaa3791410d3b704664e6b53c77756e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daaa3791410d3b704664e6b53c77756e");
            return;
        }
        super.onDetachedFromWindow();
        if (this.g != null) {
            this.g.a(this);
        }
    }

    public void setOnLayoutChangeListener(b bVar) {
        this.f = bVar;
    }

    public void setOnAttachStateChangeListener(a aVar) {
        this.g = aVar;
    }

    private boolean a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f168d958e635125b8138845b9e03f70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f168d958e635125b8138845b9e03f70")).booleanValue();
        }
        boolean z = i != getOrientation();
        if (this.b.getPaddingTop() == i2 && this.b.getPaddingBottom() == i3) {
            return z;
        }
        return true;
    }
}
