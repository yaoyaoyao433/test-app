package com.meituan.android.legwork.ui.component.pickerview;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.legwork.ui.component.pickerview.lib.WheelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a<T> extends com.meituan.android.legwork.ui.component.pickerview.view.a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private float J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private String O;
    private String P;
    private String Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private Typeface U;
    private WheelView.b V;
    public com.meituan.android.legwork.ui.component.pickerview.view.b<T> b;
    public int c;
    public int d;
    public int e;
    private int t;
    private com.meituan.android.legwork.ui.component.pickerview.listener.a u;
    private TextView v;
    private RelativeLayout w;
    private b x;
    private String y;
    private int z;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void a(int i, int i2, int i3, View view);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.ui.component.pickerview.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0273a {
        public static ChangeQuickRedirect a;
        String A;
        boolean B;
        boolean C;
        boolean D;
        Typeface E;
        public int F;
        public int G;
        public int H;
        WheelView.b I;
        int b;
        com.meituan.android.legwork.ui.component.pickerview.listener.a c;
        Activity d;
        b e;
        public String f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        int l;
        int m;
        int n;
        boolean o;
        boolean p;
        public boolean q;
        public int r;
        public int s;
        public int t;
        public int u;
        public ViewGroup v;
        float w;
        public boolean x;
        String y;
        String z;

        public C0273a(Activity activity, b bVar) {
            Object[] objArr = {activity, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be80340be8c0071ac23b1b54e52d5fb0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be80340be8c0071ac23b1b54e52d5fb0");
                return;
            }
            this.b = R.layout.legwork_send_picker_pickerview_options;
            this.j = -1;
            this.k = -657931;
            this.l = 14;
            this.m = 21;
            this.n = 18;
            this.o = true;
            this.p = true;
            this.q = true;
            this.w = 1.6f;
            this.B = false;
            this.C = false;
            this.D = false;
            this.d = activity;
            this.e = bVar;
        }
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f46978bfdadb23e9fab47ef49084f3dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f46978bfdadb23e9fab47ef49084f3dc");
        } else if (aVar.x != null) {
            aVar.x.a();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf368fafb786f86bb0d87d1b2ae3a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf368fafb786f86bb0d87d1b2ae3a7b");
        } else if (this.b != null) {
            this.b.a(this.c, this.d, this.e);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int[] iArr;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fdf49d87d1a79f1fabc93a62605d681", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fdf49d87d1a79f1fabc93a62605d681");
            return;
        }
        if (((String) view.getTag()).equals("submit")) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80c4c9a835de39214238ea205cfdce39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80c4c9a835de39214238ea205cfdce39");
            } else if (this.x != null) {
                com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar = this.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "40a0db5ac252c14820b8f8a4fe27a953", RobustBitConfig.DEFAULT_VALUE)) {
                    iArr = (int[]) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "40a0db5ac252c14820b8f8a4fe27a953");
                } else {
                    int[] iArr2 = new int[3];
                    iArr2[0] = bVar.b.getCurrentItem();
                    if (bVar.f != null && bVar.f.size() > 0) {
                        iArr2[1] = bVar.c.getCurrentItem() > bVar.f.get(iArr2[0]).size() - 1 ? 0 : bVar.c.getCurrentItem();
                    } else {
                        iArr2[1] = bVar.c.getCurrentItem();
                    }
                    if (bVar.g != null && bVar.g.size() > 0) {
                        iArr2[2] = bVar.d.getCurrentItem() > bVar.g.get(iArr2[0]).get(iArr2[1]).size() - 1 ? 0 : bVar.d.getCurrentItem();
                    } else {
                        iArr2[2] = bVar.d.getCurrentItem();
                    }
                    iArr = iArr2;
                }
                this.x.a(iArr[0], iArr[1], iArr[2], this.r);
            }
        }
        d();
    }

    @Override // com.meituan.android.legwork.ui.component.pickerview.view.a
    public final boolean b() {
        return this.K;
    }

    public a(C0273a c0273a) {
        super(c0273a.d);
        Object[] objArr = {c0273a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b810a310d4932acd0a84b15e5b24f3da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b810a310d4932acd0a84b15e5b24f3da");
            return;
        }
        this.J = 1.6f;
        this.x = c0273a.e;
        this.y = c0273a.f;
        this.z = c0273a.i;
        this.A = c0273a.j;
        this.B = c0273a.k;
        this.C = c0273a.l;
        this.D = c0273a.m;
        this.E = c0273a.n;
        this.R = c0273a.B;
        this.S = c0273a.C;
        this.T = c0273a.D;
        this.L = c0273a.o;
        this.M = c0273a.p;
        this.N = c0273a.q;
        this.O = c0273a.y;
        this.P = c0273a.z;
        this.Q = c0273a.A;
        this.U = c0273a.E;
        this.c = c0273a.F;
        this.d = c0273a.G;
        this.e = c0273a.H;
        this.G = c0273a.s;
        this.F = c0273a.r;
        this.H = c0273a.t;
        this.J = c0273a.w;
        this.u = c0273a.c;
        this.t = c0273a.b;
        this.K = c0273a.x;
        this.V = c0273a.I;
        this.I = c0273a.u;
        this.h = c0273a.v;
        Activity activity = c0273a.d;
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58110433a9ac02e7507ed07d0523cf51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58110433a9ac02e7507ed07d0523cf51");
            return;
        }
        this.q = this.L;
        a(this.I);
        if (this.u == null) {
            LayoutInflater.from(activity).inflate(this.t, this.g);
            this.v = (TextView) b(R.id.legwork_send_picker_tvTitle);
            this.w = (RelativeLayout) b(R.id.legwork_send_picker_rv_topbar);
            View b2 = b(R.id.legwork_picker_cancel);
            b2.setTag("cancel");
            b2.setOnClickListener(this);
            View b3 = b(R.id.legwork_picker_confirm);
            b3.setTag("submit");
            b3.setOnClickListener(this);
            this.v.setText(TextUtils.isEmpty(this.y) ? "" : this.y);
            this.v.setTextColor(this.z == 0 ? this.l : this.z);
            this.w.setBackgroundColor(this.B);
            this.v.setTextSize(this.D);
            this.v.setText(this.y);
        } else {
            LayoutInflater.from(activity).inflate(this.t, this.g);
        }
        LinearLayout linearLayout = (LinearLayout) b(R.id.legwork_send_picker_optionspicker);
        linearLayout.setBackgroundColor(this.A);
        this.b = new com.meituan.android.legwork.ui.component.pickerview.view.b<>(linearLayout, Boolean.valueOf(this.M));
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar = this.b;
        int i = this.E;
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "4371949b5dff4ff531ad50449a4f7d03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "4371949b5dff4ff531ad50449a4f7d03");
        } else {
            bVar.b.setTextSize(i);
            bVar.c.setTextSize(i);
            bVar.d.setTextSize(i);
        }
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar2 = this.b;
        String str = this.O;
        String str2 = this.P;
        String str3 = this.Q;
        Object[] objArr4 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "365b77a3a402b6e9012a0f8718bda3ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "365b77a3a402b6e9012a0f8718bda3ba");
        } else {
            if (str != null) {
                bVar2.b.setLabel(str);
            }
            if (str2 != null) {
                bVar2.c.setLabel(str2);
            }
            if (str3 != null) {
                bVar2.d.setLabel(str3);
            }
        }
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar3 = this.b;
        boolean z = this.R;
        boolean z2 = this.S;
        boolean z3 = this.T;
        Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr5, bVar3, changeQuickRedirect5, false, "8fafcc91f362f6138cc1982b78536953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, bVar3, changeQuickRedirect5, false, "8fafcc91f362f6138cc1982b78536953");
        } else {
            bVar3.b.setCyclic(z);
            bVar3.c.setCyclic(z2);
            bVar3.d.setCyclic(z3);
        }
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar4 = this.b;
        Typeface typeface = this.U;
        Object[] objArr6 = {typeface};
        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr6, bVar4, changeQuickRedirect6, false, "4f5777afc2d1bdc43fb92c6533b02dbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, bVar4, changeQuickRedirect6, false, "4f5777afc2d1bdc43fb92c6533b02dbf");
        } else {
            bVar4.b.setTypeface(typeface);
            bVar4.c.setTypeface(typeface);
            bVar4.d.setTypeface(typeface);
        }
        boolean z4 = this.L;
        Object[] objArr7 = {Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.legwork.ui.component.pickerview.view.a.f;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "318c392aaf54eebc516e6c47dd2dc6b6", RobustBitConfig.DEFAULT_VALUE)) {
            com.meituan.android.legwork.ui.component.pickerview.view.a aVar = (com.meituan.android.legwork.ui.component.pickerview.view.a) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "318c392aaf54eebc516e6c47dd2dc6b6");
        } else if (this.i != null) {
            View findViewById = this.i.findViewById(R.id.legwork_send_picker_outmost_container);
            if (z4) {
                findViewById.setOnTouchListener(this.s);
            } else {
                findViewById.setOnTouchListener(null);
            }
        }
        if (this.v != null) {
            this.v.setText(this.y);
        }
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar5 = this.b;
        int i2 = this.H;
        Object[] objArr8 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr8, bVar5, changeQuickRedirect8, false, "33da8feaad273597d7abfc0bbbb0d1df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, bVar5, changeQuickRedirect8, false, "33da8feaad273597d7abfc0bbbb0d1df");
        } else {
            bVar5.m = i2;
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
            if (PatchProxy.isSupport(objArr9, bVar5, changeQuickRedirect9, false, "d98a8fb635124a40aae335d9defdfdc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, bVar5, changeQuickRedirect9, false, "d98a8fb635124a40aae335d9defdfdc8");
            } else {
                bVar5.b.setDividerColor(bVar5.m);
                bVar5.c.setDividerColor(bVar5.m);
                bVar5.d.setDividerColor(bVar5.m);
            }
        }
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar6 = this.b;
        WheelView.b bVar7 = this.V;
        Object[] objArr10 = {bVar7};
        ChangeQuickRedirect changeQuickRedirect10 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr10, bVar6, changeQuickRedirect10, false, "7223c0dc42c8a10d23af2f457ae7bd34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr10, bVar6, changeQuickRedirect10, false, "7223c0dc42c8a10d23af2f457ae7bd34");
        } else {
            bVar6.n = bVar7;
            Object[] objArr11 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect11 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
            if (PatchProxy.isSupport(objArr11, bVar6, changeQuickRedirect11, false, "3c2b46928ce399ff9b32b17a236cc2f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, bVar6, changeQuickRedirect11, false, "3c2b46928ce399ff9b32b17a236cc2f8");
            } else {
                bVar6.b.setDividerType(bVar6.n);
                bVar6.c.setDividerType(bVar6.n);
                bVar6.d.setDividerType(bVar6.n);
            }
        }
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar8 = this.b;
        float f = this.J;
        Object[] objArr12 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect12 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr12, bVar8, changeQuickRedirect12, false, "417d23929e241b45b68b75d4e7cf1f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr12, bVar8, changeQuickRedirect12, false, "417d23929e241b45b68b75d4e7cf1f2c");
        } else {
            bVar8.o = f;
            Object[] objArr13 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect13 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
            if (PatchProxy.isSupport(objArr13, bVar8, changeQuickRedirect13, false, "1157d72b61c7e37f252fdbe1f37b9846", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, bVar8, changeQuickRedirect13, false, "1157d72b61c7e37f252fdbe1f37b9846");
            } else {
                bVar8.b.setLineSpacingMultiplier(bVar8.o);
                bVar8.c.setLineSpacingMultiplier(bVar8.o);
                bVar8.d.setLineSpacingMultiplier(bVar8.o);
            }
        }
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar9 = this.b;
        int i3 = this.F;
        Object[] objArr14 = {Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect14 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr14, bVar9, changeQuickRedirect14, false, "07838478673f11745f7e2bb38b853304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr14, bVar9, changeQuickRedirect14, false, "07838478673f11745f7e2bb38b853304");
        } else {
            bVar9.k = i3;
            Object[] objArr15 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect15 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
            if (PatchProxy.isSupport(objArr15, bVar9, changeQuickRedirect15, false, "55cf677f03e721ea4478b19205daf03d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr15, bVar9, changeQuickRedirect15, false, "55cf677f03e721ea4478b19205daf03d");
            } else {
                bVar9.b.setTextColorOut(bVar9.k);
                bVar9.c.setTextColorOut(bVar9.k);
                bVar9.d.setTextColorOut(bVar9.k);
            }
        }
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar10 = this.b;
        int i4 = this.G;
        Object[] objArr16 = {Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect16 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr16, bVar10, changeQuickRedirect16, false, "1d78014198321032e02075eb3cf5e056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr16, bVar10, changeQuickRedirect16, false, "1d78014198321032e02075eb3cf5e056");
        } else {
            bVar10.l = i4;
            Object[] objArr17 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect17 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
            if (PatchProxy.isSupport(objArr17, bVar10, changeQuickRedirect17, false, "fa4d50a89a456e5eed6ce3af2618e405", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr17, bVar10, changeQuickRedirect17, false, "fa4d50a89a456e5eed6ce3af2618e405");
            } else {
                bVar10.b.setTextColorCenter(bVar10.l);
                bVar10.c.setTextColorCenter(bVar10.l);
                bVar10.d.setTextColorCenter(bVar10.l);
            }
        }
        com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar11 = this.b;
        Boolean valueOf = Boolean.valueOf(this.N);
        Object[] objArr18 = {valueOf};
        ChangeQuickRedirect changeQuickRedirect18 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
        if (PatchProxy.isSupport(objArr18, bVar11, changeQuickRedirect18, false, "2e4fb5b600b47013729f7876eef1f9ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr18, bVar11, changeQuickRedirect18, false, "2e4fb5b600b47013729f7876eef1f9ee");
        } else {
            bVar11.b.a(valueOf);
            bVar11.c.a(valueOf);
            bVar11.d.a(valueOf);
        }
        Object[] objArr19 = {this};
        ChangeQuickRedirect changeQuickRedirect19 = com.meituan.android.legwork.ui.component.pickerview.b.a;
        this.m = PatchProxy.isSupport(objArr19, null, changeQuickRedirect19, true, "6bdc3477274be2613c278aa078e41412", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.legwork.ui.component.pickerview.listener.b) PatchProxy.accessDispatch(objArr19, null, changeQuickRedirect19, true, "6bdc3477274be2613c278aa078e41412") : new com.meituan.android.legwork.ui.component.pickerview.b(this);
    }
}
