package com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog;

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
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.Scroller;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.widget.MaxHeightListView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PriorityCustomDialog extends PriorityDialog implements DialogInterface {
    public static ChangeQuickRedirect a;
    private EditText i;

    public /* synthetic */ PriorityCustomDialog(Context context, int i, AnonymousClass1 anonymousClass1) {
        this(context, i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum d {
        CENTER,
        BOTTOM;
        
        public static ChangeQuickRedirect a;

        d() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846c4f873441eccb52e46c37b7d4aef5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846c4f873441eccb52e46c37b7d4aef5");
            }
        }

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dbf349a61585be3b3cde407023c62e7", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dbf349a61585be3b3cde407023c62e7") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f3f2534996cc3fa8d9f6b4e4b9cab73", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f3f2534996cc3fa8d9f6b4e4b9cab73") : (d[]) values().clone();
        }
    }

    private PriorityCustomDialog(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8713b15ee37dc4f6f3b38067ffd8d4c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8713b15ee37dc4f6f3b38067ffd8d4c1");
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.PriorityDialog, android.app.Dialog
    public void show() {
        Window window;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "640d0c9655240548a8bb7b90f273ee07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "640d0c9655240548a8bb7b90f273ee07");
            return;
        }
        super.show();
        if (isShowing()) {
            if (!(this.i != null) || (window = getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(5);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.PriorityDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374b728845c736f7f339b2ce27e87d5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374b728845c736f7f339b2ce27e87d5d");
        } else {
            super.dismiss();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private final Context b;
        private final c c;

        public a(@NonNull Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eadbaa6d116da4030c1770c794ec603e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eadbaa6d116da4030c1770c794ec603e");
                return;
            }
            this.b = context;
            this.c = new c(this.b);
        }

        @UiThread
        public final PriorityCustomDialog a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65cbb12691086e35068e670c8ba739e9", RobustBitConfig.DEFAULT_VALUE) ? (PriorityCustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65cbb12691086e35068e670c8ba739e9") : this.c.a();
        }

        @UiThread
        public final PriorityCustomDialog b() {
            boolean z;
            boolean z2 = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9516ce6d6ebbb370c5405b1aae832401", RobustBitConfig.DEFAULT_VALUE)) {
                return (PriorityCustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9516ce6d6ebbb370c5405b1aae832401");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "248f827f2a6feeaaa3c8aa4e15ab62ed", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "248f827f2a6feeaaa3c8aa4e15ab62ed")).booleanValue();
            } else {
                z = Looper.myLooper() != Looper.getMainLooper();
            }
            if (z) {
                return null;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "60521f5e1b101741e9365f53760f9e70", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "60521f5e1b101741e9365f53760f9e70")).booleanValue();
            } else if ((this.b instanceof Activity) && ((Activity) this.b).isFinishing()) {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            try {
                PriorityCustomDialog a2 = a();
                a2.show();
                return a2;
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return null;
            }
        }

        public final a a(String str) {
            this.c.e = str;
            return this;
        }

        public final a a(int i) {
            this.c.f = i;
            return this;
        }

        public final a a(CharSequence charSequence) {
            this.c.g = charSequence;
            return this;
        }

        public final a b(CharSequence charSequence) {
            this.c.i = charSequence;
            return this;
        }

        public final a b(int i) {
            this.c.r = -1;
            return this;
        }

        public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69524e251c027228c7d012e6905329f9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69524e251c027228c7d012e6905329f9") : a(charSequence, true, onClickListener);
        }

        private a a(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, (byte) 1, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5978bebd47dbb30f2134f5fcab6d6e31", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5978bebd47dbb30f2134f5fcab6d6e31");
            }
            this.c.s = charSequence;
            this.c.t = onClickListener;
            this.c.u = true;
            return this;
        }

        public final a a(int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf((int) R.string.cancel), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd029cb3a7c042ceadd0280d2cd822b7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd029cb3a7c042ceadd0280d2cd822b7") : b(c(R.string.cancel), onClickListener);
        }

        private a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376d5b6f76aec01876de665605cb6fcc", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376d5b6f76aec01876de665605cb6fcc") : b(charSequence, true, onClickListener);
        }

        private a b(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, (byte) 1, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3e0863f3d809e849dc633c766424967", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3e0863f3d809e849dc633c766424967");
            }
            this.c.v = charSequence;
            this.c.w = onClickListener;
            this.c.x = true;
            return this;
        }

        public final a a(boolean z) {
            this.c.E = false;
            return this;
        }

        public final a a(DialogInterface.OnDismissListener onDismissListener) {
            this.c.H = onDismissListener;
            return this;
        }

        public final a a(com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.a aVar) {
            this.c.R = aVar;
            return this;
        }

        public final a a(Object obj) {
            this.c.P = obj;
            return this;
        }

        public final a b(String str) {
            this.c.Q = str;
            return this;
        }

        public String c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29fa26f97deed417292a26691877148a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29fa26f97deed417292a26691877148a");
            }
            if (i == 0) {
                return null;
            }
            try {
                return this.b.getString(i);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public boolean A;
        public d B;
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
        public Object P;
        public String Q;
        public com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.a R;
        public com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.d S;
        public com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.c T;
        public com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.b U;
        public Context b;
        public LayoutInflater c;
        public int d;
        public String e;
        public int f;
        public CharSequence g;
        public View h;
        public CharSequence i;
        public boolean j;
        public CharSequence[] k;
        public int l;
        public int m;
        public ListAdapter n;
        public DialogInterface.OnClickListener o;
        public int p;
        public View q;
        public int r;
        public CharSequence s;
        public DialogInterface.OnClickListener t;
        public boolean u;
        public CharSequence v;
        public DialogInterface.OnClickListener w;
        public boolean x;
        public CharSequence y;
        public DialogInterface.OnClickListener z;

        public c(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0585ea17fdc19102b4d825ddac4a9ad9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0585ea17fdc19102b4d825ddac4a9ad9");
                return;
            }
            this.l = -1;
            this.m = -1;
            this.r = 0;
            this.B = d.CENTER;
            this.C = 0;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.L = false;
            this.N = true;
            this.R = com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.a.NORMAL;
            this.b = context;
            this.c = LayoutInflater.from(context);
        }

        public final PriorityCustomDialog a() {
            Window window;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "934137f2a68d44f28491c488afb33e98", RobustBitConfig.DEFAULT_VALUE)) {
                return (PriorityCustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "934137f2a68d44f28491c488afb33e98");
            }
            PriorityCustomDialog priorityCustomDialog = new PriorityCustomDialog(this.b, b(), null);
            priorityCustomDialog.d = this.R;
            priorityCustomDialog.e = this.P;
            priorityCustomDialog.c = this.Q;
            if (this.M != 0 && (window = priorityCustomDialog.getWindow()) != null) {
                window.setWindowAnimations(this.M);
            }
            b(priorityCustomDialog);
            a((Dialog) priorityCustomDialog);
            a(priorityCustomDialog);
            return priorityCustomDialog;
        }

        private void a(PriorityCustomDialog priorityCustomDialog) {
            Object[] objArr = {priorityCustomDialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225d8f9859eda31897e084ae9613f350", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225d8f9859eda31897e084ae9613f350");
                return;
            }
            priorityCustomDialog.f = this.S;
            priorityCustomDialog.g = this.T;
            priorityCustomDialog.h = this.U;
        }

        private int b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37c7e3060a3e9afbaa84e0297e7e5e7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37c7e3060a3e9afbaa84e0297e7e5e7")).intValue() : AnonymousClass1.a[this.B.ordinal()] != 2 ? 2131559203 : 2131559202;
        }

        private void b(PriorityCustomDialog priorityCustomDialog) {
            Object[] objArr = {priorityCustomDialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45ccd9ad07e8813018368fc8781c495", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45ccd9ad07e8813018368fc8781c495");
            } else if (AnonymousClass1.a[this.B.ordinal()] != 2) {
                c(priorityCustomDialog);
            } else {
                d(priorityCustomDialog);
            }
        }

        private void c(PriorityCustomDialog priorityCustomDialog) {
            Object[] objArr = {priorityCustomDialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8f37fd26392ad0f753dceef4c9e2c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8f37fd26392ad0f753dceef4c9e2c0");
                return;
            }
            a(priorityCustomDialog, R.layout.wm_common_dialog_layout, this.b.getResources().getDimensionPixelSize(R.dimen.wm_common_dialog_width_default), -2, 17);
            ViewGroup viewGroup = (ViewGroup) priorityCustomDialog.findViewById(R.id.dialog_main_panel);
            boolean a2 = a(viewGroup);
            if (!(b(viewGroup) | a2 | c(viewGroup)) && !a(priorityCustomDialog, viewGroup)) {
                viewGroup.setVisibility(8);
            } else if (a2) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), a(this.b, 10.0f), viewGroup.getRight(), a(this.b, 10.0f));
            }
            a((Dialog) priorityCustomDialog, true);
            c((Dialog) priorityCustomDialog);
            b((Dialog) priorityCustomDialog);
        }

        private static int a(Context context, float f) {
            Object[] objArr = {context, Float.valueOf(10.0f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aeaab55d4f62f2e7cc4651812b356b3b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aeaab55d4f62f2e7cc4651812b356b3b")).intValue() : (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        }

        private void d(PriorityCustomDialog priorityCustomDialog) {
            Object[] objArr = {priorityCustomDialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0676fb8165468a542345b7535e863de7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0676fb8165468a542345b7535e863de7");
                return;
            }
            a(priorityCustomDialog, R.layout.wm_common_dialog_layout_bottom, -1, -2, 81);
            ViewGroup viewGroup = (ViewGroup) priorityCustomDialog.findViewById(R.id.dialog_main_panel);
            if (!b(viewGroup)) {
                viewGroup.setVisibility(8);
            }
            a((Dialog) priorityCustomDialog, false);
            c((Dialog) priorityCustomDialog);
        }

        private void a(PriorityCustomDialog priorityCustomDialog, int i, int i2, int i3, int i4) {
            Object[] objArr = {priorityCustomDialog, Integer.valueOf(i), Integer.valueOf(i2), -2, Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdbbc758075cf379f5b89cb829bde3d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdbbc758075cf379f5b89cb829bde3d");
                return;
            }
            priorityCustomDialog.setContentView(i);
            int i5 = this.C != 0 ? this.C : i2;
            int i6 = this.D != 0 ? this.D : -2;
            Window window = priorityCustomDialog.getWindow();
            if (window != null) {
                window.setLayout(i5, i6);
                window.setGravity(i4);
            }
        }

        private void a(Dialog dialog) {
            boolean z = true;
            Object[] objArr = {dialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "923aca0039ea616374eb93d6ca9541e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "923aca0039ea616374eb93d6ca9541e0");
                return;
            }
            dialog.setCanceledOnTouchOutside((this.E && this.F) ? false : false);
            dialog.setCancelable(this.E);
            dialog.setOnCancelListener(this.G);
            dialog.setOnDismissListener(this.H);
            if (this.I != null) {
                dialog.setOnKeyListener(this.I);
            }
        }

        private static boolean a(ImageView imageView, int i) {
            Object[] objArr = {imageView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2ee0d91a6c3649dce0f99f7468ddbc4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2ee0d91a6c3649dce0f99f7468ddbc4")).booleanValue();
            }
            if (i == 0) {
                imageView.setVisibility(8);
                return false;
            }
            imageView.setImageResource(i);
            imageView.setVisibility(0);
            return true;
        }

        private static boolean a(TextView textView, CharSequence charSequence) {
            Object[] objArr = {textView, charSequence};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76c05e41d2bc07cc1c6992319f944d1a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76c05e41d2bc07cc1c6992319f944d1a")).booleanValue();
            }
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
                return false;
            }
            textView.setText(charSequence);
            textView.setVisibility(0);
            return true;
        }

        private static boolean a(ImageView imageView, String str, int i) {
            Object[] objArr = {imageView, str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b262432c0f5a4895e3e737c5c89f9f0f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b262432c0f5a4895e3e737c5c89f9f0f")).booleanValue();
            }
            if (TextUtils.isEmpty(str)) {
                imageView.setVisibility(8);
                return false;
            }
            imageView.setVisibility(0);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.c = str;
            a2.i = i;
            a2.a(imageView);
            return true;
        }

        private boolean a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d7d26a6507cdf0d6a0b0457e4d8c7fa", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d7d26a6507cdf0d6a0b0457e4d8c7fa")).booleanValue();
            }
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.dialog_image);
            return imageView != null && (a(imageView, this.d) || a(imageView, this.e, this.f));
        }

        private boolean b(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bdba9d08c985d9a2f332f88644fde7b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bdba9d08c985d9a2f332f88644fde7b")).booleanValue();
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.dialog_title);
            return textView != null && a(textView, this.g);
        }

        private boolean c(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8220bdf06775cdabc7c6f792ff941db", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8220bdf06775cdabc7c6f792ff941db")).booleanValue();
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.dialog_message);
            if (textView == null) {
                return false;
            }
            this.O = textView;
            if (this.j) {
                textView.setScroller(new Scroller(this.b));
                textView.setVerticalScrollBarEnabled(true);
                textView.setMovementMethod(new ScrollingMovementMethod());
            } else {
                textView.setScroller(null);
                textView.setVerticalScrollBarEnabled(false);
                textView.setMovementMethod(null);
            }
            return a(textView, this.i);
        }

        private boolean a(PriorityCustomDialog priorityCustomDialog, ViewGroup viewGroup) {
            Object[] objArr = {priorityCustomDialog, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64547c9e7f117353917a737c3cee4751", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64547c9e7f117353917a737c3cee4751")).booleanValue();
            }
            EditText editText = (EditText) viewGroup.findViewById(R.id.dialog_edit_text);
            if (editText != null) {
                if (!this.L) {
                    editText.setVisibility(8);
                } else {
                    priorityCustomDialog.i = editText;
                    editText.setText(this.J);
                    editText.setHint(this.K);
                    return true;
                }
            }
            return false;
        }

        private void a(Dialog dialog, boolean z) {
            Object[] objArr = {dialog, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c744b60acc0ca01618f421f7c3f45c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c744b60acc0ca01618f421f7c3f45c6");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) dialog.findViewById(R.id.dialog_button_panel);
            if (viewGroup == null) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.dialog_button_holder);
            ViewGroup viewGroup3 = viewGroup2 == null ? viewGroup : viewGroup2;
            ViewGroup viewGroup4 = viewGroup3;
            if (!(a(dialog, viewGroup4, -3, R.id.dialog_button_neutral, this.y, this.A, this.z) | a(dialog, viewGroup4, -1, R.id.dialog_button_positive, this.s, this.u, this.t) | a(dialog, viewGroup4, -2, R.id.dialog_button_negative, this.v, this.x, this.w))) {
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

        private boolean b(Dialog dialog) {
            Object[] objArr = {dialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a3152701a1d2e5af22b0280aef6c20", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a3152701a1d2e5af22b0280aef6c20")).booleanValue();
            }
            LinearLayout linearLayout = (LinearLayout) dialog.findViewById(R.id.dialog_pane_header);
            if (this.h == null) {
                linearLayout.setVisibility(8);
                return false;
            }
            linearLayout.setVisibility(0);
            linearLayout.addView(this.h);
            return true;
        }

        private boolean a(final Dialog dialog, ViewGroup viewGroup, final int i, int i2, CharSequence charSequence, final boolean z, final DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {dialog, viewGroup, Integer.valueOf(i), Integer.valueOf(i2), charSequence, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a07f76673275706cd6962f759b28d5bb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a07f76673275706cd6962f759b28d5bb")).booleanValue();
            }
            TextView textView = (TextView) dialog.findViewById(i2);
            if (textView == null) {
                return false;
            }
            if (TextUtils.isEmpty(charSequence)) {
                viewGroup.removeView(textView);
                return false;
            }
            boolean z2 = i == this.r;
            textView.setText(charSequence);
            if (z2) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
                textView.getPaint().setFakeBoldText(true);
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
                textView.getPaint().setFakeBoldText(false);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.PriorityCustomDialog.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bf568b12532fae6187c23eea993961b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bf568b12532fae6187c23eea993961b");
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

        private boolean c(Dialog dialog) {
            Object[] objArr = {dialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33bc77f1e968bdde7d3ba27721be28b8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33bc77f1e968bdde7d3ba27721be28b8")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "272b02178ba9610bdc3cf0613d3b9efd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "272b02178ba9610bdc3cf0613d3b9efd")).booleanValue();
            }
            if (this.q == null && this.p != 0) {
                this.q = this.c.inflate(this.p, (ViewGroup) frameLayout, false);
            }
            b(dialog, false);
            return a(frameLayout, this.q);
        }

        private boolean b(final Dialog dialog, FrameLayout frameLayout) {
            Object[] objArr = {dialog, frameLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08ceb798fd0717489d4e43e5d471d34e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08ceb798fd0717489d4e43e5d471d34e")).booleanValue();
            }
            if (this.n == null && this.k != null && this.k.length > 0) {
                b bVar = new b(this.b, this.k);
                if (this.l >= 0) {
                    bVar.a(this.l);
                }
                this.n = bVar;
            }
            if (this.n == null) {
                return false;
            }
            View inflate = this.c.inflate(R.layout.wm_common_dialog_layout_list_view, (ViewGroup) frameLayout, false);
            MaxHeightListView maxHeightListView = (MaxHeightListView) inflate.findViewById(R.id.dialog_list_view);
            maxHeightListView.setAdapter(this.n);
            maxHeightListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.PriorityCustomDialog.c.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1dc36d54d2bbdf7744d9ba16bdf93321", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1dc36d54d2bbdf7744d9ba16bdf93321");
                        return;
                    }
                    dialog.dismiss();
                    if (c.this.o != null) {
                        c.this.o.onClick(dialog, i);
                    }
                }
            });
            if (this.l >= 0) {
                maxHeightListView.setSelection(this.l);
            }
            if (this.m > 0) {
                maxHeightListView.setMaxHeight(this.m);
            }
            b(dialog, true);
            return a(frameLayout, inflate);
        }

        private void b(Dialog dialog, boolean z) {
            Object[] objArr = {dialog, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f6ba1225deb53635ada6a8186a3b4fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f6ba1225deb53635ada6a8186a3b4fc");
            } else if (this.B != d.BOTTOM) {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76d80ab33abac756b8225f265d0f9c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76d80ab33abac756b8225f265d0f9c7");
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
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc9bb1601d4929f9f8eaee71eee45dc6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc9bb1601d4929f9f8eaee71eee45dc6")).booleanValue();
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
            frameLayout.addView(view, layoutParams);
            frameLayout.setVisibility(0);
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.PriorityCustomDialog$1  reason: invalid class name */
    /* loaded from: classes4.dex */
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
    /* loaded from: classes4.dex */
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64a3a26c0b89d7ec4a73cfcd56d0558f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64a3a26c0b89d7ec4a73cfcd56d0558f");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a33398ccc64a7f8704e05d170baf6fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a33398ccc64a7f8704e05d170baf6fb");
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
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19bd35684811953fe4ed2883fd8eb962", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19bd35684811953fe4ed2883fd8eb962");
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
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cd886cba248ba119d258c24167debac3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cd886cba248ba119d258c24167debac3");
            } else {
                aVar.b.setText(b.this.b[i]);
                if (b.this.e == i) {
                    i2 = g;
                } else {
                    i2 = f;
                }
                aVar.b.setTextColor(b.this.c.getResources().getColor(i2));
            }
            return view;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public class a {
            public static ChangeQuickRedirect a;
            final TextView b;

            public /* synthetic */ a(b bVar, View view, AnonymousClass1 anonymousClass1) {
                this(view);
            }

            private a(View view) {
                Object[] objArr = {b.this, view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cead73409d9e635e3d25e72c711a276", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cead73409d9e635e3d25e72c711a276");
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
}
