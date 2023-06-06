package com.sankuai.waimai.platform.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.MaxHeightListView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CustomDialog extends Dialog implements DialogInterface {
    public static ChangeQuickRedirect a;
    public EditText b;

    public /* synthetic */ CustomDialog(Context context, int i, AnonymousClass1 anonymousClass1) {
        this(context, i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum d {
        CENTER,
        BOTTOM;
        
        public static ChangeQuickRedirect a;

        d() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a115fbbaab84220b15eddd9b1c7b4721", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a115fbbaab84220b15eddd9b1c7b4721");
            }
        }

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4662db21f819a4d51ebe641a6e8f2d00", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4662db21f819a4d51ebe641a6e8f2d00") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b4ef7d2fdabff9bdc9d0fde37a249da", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b4ef7d2fdabff9bdc9d0fde37a249da") : (d[]) values().clone();
        }
    }

    private CustomDialog(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1b60131a22b121c1b3ebdb1cc42713", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1b60131a22b121c1b3ebdb1cc42713");
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Window window;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6746ac7957d9174b594b8894210448e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6746ac7957d9174b594b8894210448e4");
            return;
        }
        super.show();
        if (!(this.b != null) || (window = getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(5);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect b;
        private final Context a;
        public final c c;

        public a(@NonNull Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f1a8579514ae7713736087713e9909", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f1a8579514ae7713736087713e9909");
                return;
            }
            this.a = context;
            this.c = new c(this.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x01cc, code lost:
            if (r2 != false) goto L87;
         */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0292  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0297  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0320  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0325  */
        @android.support.annotation.UiThread
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.sankuai.waimai.platform.widget.dialog.CustomDialog a() {
            /*
                Method dump skipped, instructions count: 843
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.dialog.CustomDialog.a.a():com.sankuai.waimai.platform.widget.dialog.CustomDialog");
        }

        @UiThread
        public final CustomDialog b() {
            boolean z;
            boolean z2 = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae09e58011c0763c1b3c21ace3d71b1", RobustBitConfig.DEFAULT_VALUE)) {
                return (CustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae09e58011c0763c1b3c21ace3d71b1");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7b91272cbcf37102e90d5590e889688", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7b91272cbcf37102e90d5590e889688")).booleanValue();
            } else {
                z = Looper.myLooper() != Looper.getMainLooper();
            }
            if (z) {
                return null;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a3b7dda0a4d4851850ca7b82aebd678b", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a3b7dda0a4d4851850ca7b82aebd678b")).booleanValue();
            } else if ((this.a instanceof Activity) && ((Activity) this.a).isFinishing()) {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            try {
                CustomDialog a = a();
                a.show();
                return a;
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return null;
            }
        }

        @UiThread
        public final CustomDialog a(d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab88b4abb9c94f34e44532e1c9e30b2c", RobustBitConfig.DEFAULT_VALUE) ? (CustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab88b4abb9c94f34e44532e1c9e30b2c") : b(dVar).b();
        }

        @UiThread
        public final CustomDialog c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "475030857bfc059866919a567a517451", RobustBitConfig.DEFAULT_VALUE) ? (CustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "475030857bfc059866919a567a517451") : a(d.BOTTOM);
        }

        public final a b(d dVar) {
            this.c.A = dVar;
            return this;
        }

        public final a a(int i) {
            this.c.B = i;
            return this;
        }

        public final a a(int i, int i2) {
            this.c.C = i;
            this.c.D = i2;
            return this;
        }

        public final a b(int i) {
            this.c.d = i;
            return this;
        }

        public final a c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36caf005c868c351a27852f6530144ef", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36caf005c868c351a27852f6530144ef") : a(f(i));
        }

        public final a a(CharSequence charSequence) {
            this.c.g = charSequence;
            return this;
        }

        public final a d(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66643f1cb365c9da4806adae07651b71", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66643f1cb365c9da4806adae07651b71") : b(f(i));
        }

        public final a b(CharSequence charSequence) {
            this.c.h = charSequence;
            return this;
        }

        public final a a(int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e4224b36b7c5ccfe23ce560befd18d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e4224b36b7c5ccfe23ce560befd18d") : a(f(i), onClickListener);
        }

        public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc348b3f42ae67586c8ae53e0902a67", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc348b3f42ae67586c8ae53e0902a67") : a(charSequence, true, onClickListener);
        }

        public final a a(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4c0b2023cd1e6aad356984db566a40", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4c0b2023cd1e6aad356984db566a40");
            }
            this.c.r = charSequence;
            this.c.s = onClickListener;
            this.c.t = z;
            return this;
        }

        public final a b(int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f937da58ac70eb954360028f84651980", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f937da58ac70eb954360028f84651980") : b(f(i), onClickListener);
        }

        public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9e287454c9a2efe1acd298647e1b68", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9e287454c9a2efe1acd298647e1b68") : b(charSequence, true, onClickListener);
        }

        public final a b(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1209ad927a216b4a1389d0d1f780c3fe", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1209ad927a216b4a1389d0d1f780c3fe");
            }
            this.c.u = charSequence;
            this.c.v = onClickListener;
            this.c.w = z;
            return this;
        }

        public final a a(boolean z) {
            this.c.E = z;
            return this;
        }

        public final a b(boolean z) {
            this.c.F = z;
            return this;
        }

        public final a a(DialogInterface.OnDismissListener onDismissListener) {
            this.c.H = onDismissListener;
            return this;
        }

        public final a a(DialogInterface.OnKeyListener onKeyListener) {
            this.c.I = onKeyListener;
            return this;
        }

        public final a a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.c.j = charSequenceArr;
            this.c.n = onClickListener;
            return this;
        }

        public final a e(int i) {
            this.c.o = i;
            return this;
        }

        public final a a(View view) {
            this.c.p = view;
            return this;
        }

        public final a c(boolean z) {
            this.c.N = false;
            return this;
        }

        private String f(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd6122abe5a5315d6c883d6b80f8e34", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd6122abe5a5315d6c883d6b80f8e34");
            }
            if (i == 0) {
                return null;
            }
            try {
                return this.a.getString(i);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public d A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public DialogInterface.OnCancelListener G;
        public DialogInterface.OnDismissListener H;
        public DialogInterface.OnKeyListener I;
        public String J;
        public String K;
        public boolean L;
        public int M;
        public boolean N;
        public TextView O;
        public Context b;
        public LayoutInflater c;
        public int d;
        public String e;
        public int f;
        public CharSequence g;
        public CharSequence h;
        public boolean i;
        public CharSequence[] j;
        public int k;
        public int l;
        public ListAdapter m;
        public DialogInterface.OnClickListener n;
        public int o;
        public View p;
        public int q;
        public CharSequence r;
        public DialogInterface.OnClickListener s;
        public boolean t;
        public CharSequence u;
        public DialogInterface.OnClickListener v;
        public boolean w;
        public CharSequence x;
        public DialogInterface.OnClickListener y;
        public boolean z;

        public c(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77185d4d63588df05c22ac9d3fea4e39", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77185d4d63588df05c22ac9d3fea4e39");
                return;
            }
            this.k = -1;
            this.l = -1;
            this.q = 0;
            this.A = d.CENTER;
            this.B = -1;
            this.C = 0;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.L = false;
            this.N = true;
            this.b = context;
            this.c = LayoutInflater.from(context);
        }

        static int a(Context context, float f) {
            Object[] objArr = {context, Float.valueOf(10.0f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5429b9075fed4e62dbcb92dd1f406693", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5429b9075fed4e62dbcb92dd1f406693")).intValue() : (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        }

        void a(CustomDialog customDialog, int i, int i2, int i3, int i4) {
            Object[] objArr = {customDialog, Integer.valueOf(i), Integer.valueOf(i2), -2, Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa568f2ac8a0851319162076497de25e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa568f2ac8a0851319162076497de25e");
                return;
            }
            customDialog.setContentView(i);
            int i5 = this.C != 0 ? this.C : i2;
            int i6 = this.D != 0 ? this.D : -2;
            Window window = customDialog.getWindow();
            if (window != null) {
                window.setLayout(i5, i6);
                window.setGravity(i4);
            }
        }

        static boolean a(TextView textView, CharSequence charSequence) {
            Object[] objArr = {textView, charSequence};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ff8d0589289ab1c04f41f10e6aa79bf", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ff8d0589289ab1c04f41f10e6aa79bf")).booleanValue();
            }
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
                return false;
            }
            textView.setText(charSequence);
            textView.setVisibility(0);
            return true;
        }

        boolean a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c60a4df4bb00657bea0df647572383d0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c60a4df4bb00657bea0df647572383d0")).booleanValue();
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.dialog_title);
            return textView != null && a(textView, this.g);
        }

        void a(Dialog dialog, boolean z) {
            Object[] objArr = {dialog, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea86dc12903d5b9df3b6a0ab56019c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea86dc12903d5b9df3b6a0ab56019c8");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) dialog.findViewById(R.id.dialog_button_panel);
            if (viewGroup == null) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.dialog_button_holder);
            ViewGroup viewGroup3 = viewGroup2 == null ? viewGroup : viewGroup2;
            ViewGroup viewGroup4 = viewGroup3;
            if (!(a(dialog, viewGroup4, -3, R.id.dialog_button_neutral, this.x, this.z, this.y) | a(dialog, viewGroup4, -1, R.id.dialog_button_positive, this.r, this.t, this.s) | a(dialog, viewGroup4, -2, R.id.dialog_button_negative, this.u, this.w, this.v))) {
                viewGroup.setVisibility(8);
                return;
            }
            viewGroup.setVisibility(0);
            if (z) {
                switch (viewGroup3.getChildCount()) {
                    case 1:
                        viewGroup3.getChildAt(0).setBackgroundResource(R.drawable.wm_common_dialog_background_button_corner_both);
                        if (this.N) {
                            ((Button) viewGroup3.getChildAt(0)).setTextColor(this.b.getResources().getColor(R.color.wm_common_text_highlight));
                            return;
                        } else {
                            ((Button) viewGroup3.getChildAt(0)).setTextColor(this.b.getResources().getColor(R.color.wm_common_text_main));
                            return;
                        }
                    case 2:
                        viewGroup3.getChildAt(0).setBackgroundResource(R.drawable.wm_common_dialog_background_button_corner_left);
                        ((Button) viewGroup3.getChildAt(0)).setTextColor(this.b.getResources().getColor(R.color.wm_common_text_main));
                        viewGroup3.getChildAt(1).setBackgroundResource(R.drawable.wm_common_dialog_background_button_corner_right);
                        if (this.N) {
                            ((Button) viewGroup3.getChildAt(1)).setTextColor(this.b.getResources().getColor(R.color.wm_common_text_highlight));
                            return;
                        } else {
                            ((Button) viewGroup3.getChildAt(1)).setTextColor(this.b.getResources().getColor(R.color.wm_common_text_main));
                            return;
                        }
                    default:
                        return;
                }
            }
        }

        private boolean a(final Dialog dialog, ViewGroup viewGroup, final int i, int i2, CharSequence charSequence, final boolean z, final DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {dialog, viewGroup, Integer.valueOf(i), Integer.valueOf(i2), charSequence, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc38f70bdd7995b7ba12774bf1d94df", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc38f70bdd7995b7ba12774bf1d94df")).booleanValue();
            }
            TextView textView = (TextView) dialog.findViewById(i2);
            if (textView == null) {
                return false;
            }
            if (TextUtils.isEmpty(charSequence)) {
                viewGroup.removeView(textView);
                return false;
            }
            boolean z2 = i == this.q;
            textView.setText(charSequence);
            if (z2) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
                textView.getPaint().setFakeBoldText(true);
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
                textView.getPaint().setFakeBoldText(false);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dialog.CustomDialog.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9137b974288df37d394d7359afe1aa47", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9137b974288df37d394d7359afe1aa47");
                        return;
                    }
                    if (z) {
                        dialog.dismiss();
                    }
                    if (onClickListener != null) {
                        onClickListener.onClick(dialog, i);
                    }
                }
            });
            return true;
        }

        boolean a(Dialog dialog) {
            Object[] objArr = {dialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "909465cffa9199ad3ea56d29174aa5bb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "909465cffa9199ad3ea56d29174aa5bb")).booleanValue();
            }
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R.id.dialog_content_panel);
            if (frameLayout == null) {
                return false;
            }
            if (a(dialog, frameLayout) || b(dialog, frameLayout)) {
                frameLayout.setVisibility(0);
                return true;
            }
            frameLayout.setVisibility(8);
            return false;
        }

        private boolean a(Dialog dialog, FrameLayout frameLayout) {
            Object[] objArr = {dialog, frameLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd551f4aa030611d5fc81da1bb1f4b9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd551f4aa030611d5fc81da1bb1f4b9")).booleanValue();
            }
            if (this.p == null && this.o != 0) {
                this.p = this.c.inflate(this.o, (ViewGroup) frameLayout, false);
            }
            b(dialog, false);
            return a(frameLayout, this.p);
        }

        private boolean b(final Dialog dialog, FrameLayout frameLayout) {
            Object[] objArr = {dialog, frameLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e83da9dd89a2c190bca9e53116074b3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e83da9dd89a2c190bca9e53116074b3")).booleanValue();
            }
            if (this.m == null && this.j != null && this.j.length > 0) {
                b bVar = new b(this.b, this.j);
                if (this.k >= 0) {
                    bVar.a(this.k);
                }
                this.m = bVar;
            }
            if (this.m == null) {
                return false;
            }
            View inflate = this.c.inflate(R.layout.wm_common_dialog_layout_list_view, (ViewGroup) frameLayout, false);
            MaxHeightListView maxHeightListView = (MaxHeightListView) inflate.findViewById(R.id.dialog_list_view);
            maxHeightListView.setAdapter(this.m);
            maxHeightListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.platform.widget.dialog.CustomDialog.c.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc36dce65048022ac3af2a5e4f70a65e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc36dce65048022ac3af2a5e4f70a65e");
                        return;
                    }
                    dialog.dismiss();
                    if (c.this.n != null) {
                        c.this.n.onClick(dialog, i);
                    }
                }
            });
            if (this.k >= 0) {
                maxHeightListView.setSelection(this.k);
            }
            if (this.l > 0) {
                maxHeightListView.setMaxHeight(this.l);
            }
            b(dialog, true);
            return a(frameLayout, inflate);
        }

        private void b(Dialog dialog, boolean z) {
            Object[] objArr = {dialog, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206edc02271083184715cf0b937ba1e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206edc02271083184715cf0b937ba1e7");
            } else if (this.A != d.BOTTOM) {
            } else {
                if (z) {
                    a(dialog, R.id.dialog_top_divider, true);
                    a(dialog, R.id.dialog_bottom_padding, true);
                    return;
                }
                a(dialog, R.id.dialog_bottom_divider, true);
            }
        }

        private void a(Dialog dialog, int i, boolean z) {
            Object[] objArr = {dialog, Integer.valueOf(i), (byte) 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e94b7b1c431ab3cac79b48b52c06ac4e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e94b7b1c431ab3cac79b48b52c06ac4e");
                return;
            }
            View findViewById = dialog.findViewById(i);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }

        private static boolean a(FrameLayout frameLayout, View view) {
            Object[] objArr = {frameLayout, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bedd8e331d5294b23985343318cc8d33", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bedd8e331d5294b23985343318cc8d33")).booleanValue();
            }
            if (view == null) {
                return false;
            }
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
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.dialog.CustomDialog$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[d.valuesCustom().length];

        static {
            try {
                a[d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends BaseAdapter {
        public static ChangeQuickRedirect a = null;
        private static final int f = 2131428560;
        private static final int g = 2131428562;
        final CharSequence[] b;
        private final Context c;
        private final LayoutInflater d;
        private int e;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public b(Context context, CharSequence[] charSequenceArr) {
            Object[] objArr = {context, charSequenceArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8763c63afefd3b929b3f3831938a139e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8763c63afefd3b929b3f3831938a139e");
                return;
            }
            this.e = -1;
            this.c = context;
            this.b = charSequenceArr;
            this.d = LayoutInflater.from(this.c);
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c0086ab6345fc2ce435d59055b33d9f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c0086ab6345fc2ce435d59055b33d9f");
            } else if (i == this.e) {
            } else {
                this.e = i;
                notifyDataSetChanged();
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.b.length;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            int i2;
            String str;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931d7d354280f5f941ed2439ad700a1d", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931d7d354280f5f941ed2439ad700a1d");
            }
            if (view == null) {
                view = this.d.inflate(R.layout.wm_common_dialog_adapter_list_item, viewGroup, false);
                aVar = new a(this, view, null);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "66dc703f709cf8733b97604bfcf54b74", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "66dc703f709cf8733b97604bfcf54b74");
            } else {
                aVar.b.setText(b.this.b[i]);
                boolean z = b.this.e == i;
                if (z) {
                    i2 = g;
                } else {
                    i2 = f;
                }
                aVar.b.setTextColor(b.this.c.getResources().getColor(i2));
                TextView textView = aVar.b;
                if (z) {
                    str = ((Object) b.this.b[i]) + ",已选中";
                } else {
                    str = b.this.b[i];
                }
                textView.setContentDescription(str);
            }
            return view;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public class a {
            public static ChangeQuickRedirect a;
            final TextView b;

            public /* synthetic */ a(b bVar, View view, AnonymousClass1 anonymousClass1) {
                this(view);
            }

            private a(View view) {
                Object[] objArr = {b.this, view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6815ac78e8cd1b8ee1c992839cff40", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6815ac78e8cd1b8ee1c992839cff40");
                } else {
                    this.b = (TextView) view.findViewById(R.id.dialog_item_text);
                }
            }
        }

        @Override // android.widget.Adapter
        public final /* bridge */ /* synthetic */ Object getItem(int i) {
            return this.b[i];
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5051efeefd464cceef70dfdfc664328c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5051efeefd464cceef70dfdfc664328c")).booleanValue();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }
}
