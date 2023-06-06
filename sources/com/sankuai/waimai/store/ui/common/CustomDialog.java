package com.sankuai.waimai.store.ui.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Looper;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
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
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.widgets.SCMaxHeightListView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CustomDialog extends SCBaseDialog {
    public static ChangeQuickRedirect g;
    private EditText a;

    public CustomDialog(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df010a07808de452ecfef61209fe08d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df010a07808de452ecfef61209fe08d");
        }
    }

    public CustomDialog(@NonNull Context context, @NonNull View view) {
        this(context, view, R.style.WmStBaseDialogTheme);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c498398bc073b33deec4eb5dd4da30d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c498398bc073b33deec4eb5dd4da30d6");
        }
    }

    public CustomDialog(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f08d77413acbe50cf7c992e86ad3eef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f08d77413acbe50cf7c992e86ad3eef");
        }
    }

    public CustomDialog(@NonNull Context context, @NonNull View view, @StyleRes int i) {
        super(context, view, i);
        Object[] objArr = {context, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0f1f07002d8b73752f599b95e006b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0f1f07002d8b73752f599b95e006b1");
        }
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7748695f9e7d40ab2d58343425a1a7c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7748695f9e7d40ab2d58343425a1a7c0");
            }
        }

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e95b6743853a99d3f39288686e1ce4c8", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e95b6743853a99d3f39288686e1ce4c8") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a4384fd4a35bcd2e660b9f6874157c7", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a4384fd4a35bcd2e660b9f6874157c7") : (d[]) values().clone();
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog
    @UiThread
    public void show() {
        Window window;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d807b92498b8280263316569da77a446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d807b92498b8280263316569da77a446");
            return;
        }
        try {
            super.show();
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        if (!(this.a != null) || (window = getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(5);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect b;
        protected final Context c;
        public final c d;

        public a(@NonNull Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c576659df58b139165950fed897ed6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c576659df58b139165950fed897ed6");
                return;
            }
            this.c = context;
            this.d = new c(this.c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x01b6, code lost:
            if (r2 != false) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0320, code lost:
            if (r0.E != false) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0256  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0282  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0287  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0314  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0319  */
        @android.support.annotation.UiThread
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.sankuai.waimai.store.ui.common.CustomDialog a() {
            /*
                Method dump skipped, instructions count: 832
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.ui.common.CustomDialog.a.a():com.sankuai.waimai.store.ui.common.CustomDialog");
        }

        @UiThread
        public final CustomDialog b() {
            boolean z;
            boolean z2 = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df2c4eeccb0b315befd8de6f87b414b", RobustBitConfig.DEFAULT_VALUE)) {
                return (CustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df2c4eeccb0b315befd8de6f87b414b");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e76db43a2ff88c419d4a29c48bdf6a8d", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e76db43a2ff88c419d4a29c48bdf6a8d")).booleanValue();
            } else {
                z = Looper.myLooper() != Looper.getMainLooper();
            }
            if (z) {
                if (k.a()) {
                    throw new RuntimeException("Method create() and show() must be called in Main thread!");
                }
                return null;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07f9464875b7a66ce6571dff0449fc79", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07f9464875b7a66ce6571dff0449fc79")).booleanValue();
            } else if ((this.c instanceof Activity) && ((Activity) this.c).isFinishing()) {
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
                com.sankuai.shangou.stone.util.log.a.a(e);
                return null;
            }
        }

        @UiThread
        public final CustomDialog c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4f0a89109ea5437d78b0a21ad823ab", RobustBitConfig.DEFAULT_VALUE) ? (CustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4f0a89109ea5437d78b0a21ad823ab") : a(d.BOTTOM);
        }

        public final a a(@StringRes int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e762bcd813a271cce21d691924b7ef", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e762bcd813a271cce21d691924b7ef") : a(this.c.getString(i));
        }

        public final a a(CharSequence charSequence) {
            this.d.g = charSequence;
            return this;
        }

        public final a b(@StringRes int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c048d2bf1fbd908da762eebba810bb4f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c048d2bf1fbd908da762eebba810bb4f") : b(this.c.getString(i));
        }

        public final a b(CharSequence charSequence) {
            this.d.h = charSequence;
            return this;
        }

        public final a a(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b27138d52b2ac3fa3c43c0a8932654", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b27138d52b2ac3fa3c43c0a8932654") : a(this.c.getString(i), onClickListener);
        }

        public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5739313a7013796db4c075800e834b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5739313a7013796db4c075800e834b") : a(charSequence, true, onClickListener);
        }

        private a a(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, (byte) 1, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956576cce69b385311541fa0945cad66", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956576cce69b385311541fa0945cad66");
            }
            this.d.r = charSequence;
            this.d.s = onClickListener;
            this.d.t = true;
            return this;
        }

        public final a b(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac1d0eaef269184ae299df20b4eb812", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac1d0eaef269184ae299df20b4eb812") : b(this.c.getString(i), onClickListener);
        }

        public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0045d387f55782817bad060d2ffc2701", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0045d387f55782817bad060d2ffc2701") : b(charSequence, true, onClickListener);
        }

        private a b(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, (byte) 1, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea535d5eb0bb9fde230e9b65874919f9", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea535d5eb0bb9fde230e9b65874919f9");
            }
            this.d.u = charSequence;
            this.d.v = onClickListener;
            this.d.w = true;
            return this;
        }

        public final a a(boolean z) {
            this.d.D = z;
            return this;
        }

        public final a a(DialogInterface.OnDismissListener onDismissListener) {
            this.d.G = onDismissListener;
            return this;
        }

        public final a a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.d.j = charSequenceArr;
            this.d.n = onClickListener;
            return this;
        }

        @UiThread
        private CustomDialog a(d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8cb7b68bfd9dc2dad78992befe5f40", RobustBitConfig.DEFAULT_VALUE)) {
                return (CustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8cb7b68bfd9dc2dad78992befe5f40");
            }
            this.d.A = dVar;
            return b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public d A;
        public int B;
        public int C;
        public boolean D;
        public boolean E;
        public DialogInterface.OnCancelListener F;
        public DialogInterface.OnDismissListener G;
        public DialogInterface.OnKeyListener H;
        public String I;
        public String J;
        public boolean K;
        public int L;
        public boolean M;
        public TextView N;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cbdc6044f8f1f2bc558a3cec202553e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cbdc6044f8f1f2bc558a3cec202553e");
                return;
            }
            this.k = -1;
            this.l = -1;
            this.q = 0;
            this.A = d.CENTER;
            this.B = 0;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.K = false;
            this.M = true;
            this.b = context;
            this.c = LayoutInflater.from(context);
        }

        static int a(Context context, float f) {
            Object[] objArr = {context, Float.valueOf(10.0f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "399de6ef52796a7b0bc536ccbb5c5e5a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "399de6ef52796a7b0bc536ccbb5c5e5a")).intValue() : (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        }

        void a(CustomDialog customDialog, @LayoutRes int i, int i2, int i3, int i4) {
            Object[] objArr = {customDialog, Integer.valueOf(i), Integer.valueOf(i2), -2, Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72e1ccd0e18d20d5159a338775dc3e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72e1ccd0e18d20d5159a338775dc3e7");
                return;
            }
            customDialog.setContentView(i);
            int i5 = this.B != 0 ? this.B : i2;
            int i6 = this.C != 0 ? this.C : -2;
            Window window = customDialog.getWindow();
            if (window != null) {
                window.setLayout(i5, i6);
                window.setGravity(i4);
            }
        }

        static boolean a(TextView textView, CharSequence charSequence) {
            Object[] objArr = {textView, charSequence};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b8e03b5338434976b435a1e71b5c300", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b8e03b5338434976b435a1e71b5c300")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce3f914d2ed830a7b42143940c984ea8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce3f914d2ed830a7b42143940c984ea8")).booleanValue();
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.dialog_title);
            return textView != null && a(textView, this.g);
        }

        void a(Dialog dialog, boolean z) {
            Object[] objArr = {dialog, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84ef333c461485766ddaf958c4abcb9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84ef333c461485766ddaf958c4abcb9");
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
                        viewGroup3.getChildAt(0).setBackgroundResource(R.drawable.wm_sc_common_dialog_background_button_corner_both);
                        if (this.M) {
                            ((Button) viewGroup3.getChildAt(0)).setTextColor(this.b.getResources().getColor(R.color.wm_st_common_text_highlight));
                            return;
                        } else {
                            ((Button) viewGroup3.getChildAt(0)).setTextColor(this.b.getResources().getColor(R.color.wm_st_common_text_title));
                            return;
                        }
                    case 2:
                        viewGroup3.getChildAt(0).setBackgroundResource(R.drawable.wm_sc_common_dialog_background_button_corner_left);
                        ((Button) viewGroup3.getChildAt(0)).setTextColor(this.b.getResources().getColor(R.color.wm_st_common_text_title));
                        viewGroup3.getChildAt(1).setBackgroundResource(R.drawable.wm_sc_common_dialog_background_button_corner_right);
                        if (this.M) {
                            ((Button) viewGroup3.getChildAt(1)).setTextColor(this.b.getResources().getColor(R.color.wm_st_common_text_highlight));
                            return;
                        } else {
                            ((Button) viewGroup3.getChildAt(1)).setTextColor(this.b.getResources().getColor(R.color.wm_st_common_text_title));
                            return;
                        }
                    default:
                        return;
                }
            }
        }

        private boolean a(final Dialog dialog, ViewGroup viewGroup, final int i, @IdRes int i2, CharSequence charSequence, final boolean z, final DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {dialog, viewGroup, Integer.valueOf(i), Integer.valueOf(i2), charSequence, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f490b18694e1f440d9f4f4debc197e2e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f490b18694e1f440d9f4f4debc197e2e")).booleanValue();
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
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.ui.common.CustomDialog.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21810cfa5852956067037e58af2e2d22", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21810cfa5852956067037e58af2e2d22");
                        return;
                    }
                    if (z) {
                        com.sankuai.waimai.store.util.d.a(dialog);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d66d153d3a2f666014bc2c82ddd9b3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d66d153d3a2f666014bc2c82ddd9b3")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2df8d8fd7743853ba8ca7451c92991c4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2df8d8fd7743853ba8ca7451c92991c4")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "355ab270c6f5cf48a92816bbe810d528", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "355ab270c6f5cf48a92816bbe810d528")).booleanValue();
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
            View inflate = this.c.inflate(R.layout.wm_sc_common_dialog_layout_list_view, (ViewGroup) frameLayout, false);
            SCMaxHeightListView sCMaxHeightListView = (SCMaxHeightListView) inflate.findViewById(R.id.dialog_list_view);
            sCMaxHeightListView.setAdapter(this.m);
            sCMaxHeightListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.store.ui.common.CustomDialog.c.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c2eda16dcfa0bade6deda3f65b03b41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c2eda16dcfa0bade6deda3f65b03b41");
                        return;
                    }
                    com.sankuai.waimai.store.util.d.a(dialog);
                    if (c.this.n != null) {
                        c.this.n.onClick(dialog, i);
                    }
                }
            });
            if (this.k >= 0) {
                sCMaxHeightListView.setSelection(this.k);
            }
            if (this.l > 0) {
                sCMaxHeightListView.setMaxHeight(this.l);
            }
            b(dialog, true);
            return a(frameLayout, inflate);
        }

        private void b(Dialog dialog, boolean z) {
            Object[] objArr = {dialog, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc95da1a262aa7b86364cbe5e3e5beb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc95da1a262aa7b86364cbe5e3e5beb");
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

        private void a(Dialog dialog, @IdRes int i, boolean z) {
            Object[] objArr = {dialog, Integer.valueOf(i), (byte) 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14276b6b773a5956259670d4b9c72661", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14276b6b773a5956259670d4b9c72661");
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
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33f86dff592135c4cc2e023ad998d965", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33f86dff592135c4cc2e023ad998d965")).booleanValue();
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
    /* renamed from: com.sankuai.waimai.store.ui.common.CustomDialog$1  reason: invalid class name */
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
        private static final int f = 2131429519;
        private static final int g = 2131429518;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39fd1b26f3ae60bbb95c18f32436f16e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39fd1b26f3ae60bbb95c18f32436f16e");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b752e0e36ceeeb86ea87832d689280f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b752e0e36ceeeb86ea87832d689280f");
            } else if (i == this.e) {
            } else {
                this.e = i;
                notifyDataSetChanged();
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            if (this.b != null) {
                return this.b.length;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            int i2;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ee5647857e638fb5a7690122553973", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ee5647857e638fb5a7690122553973");
            }
            if (view == null) {
                view = this.d.inflate(R.layout.wm_sc_common_dialog_adapter_list_item, viewGroup, false);
                aVar = new a(this, view, null);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0407909d5da549367650bea361b01f7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0407909d5da549367650bea361b01f7d");
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
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a901ed33b8ff878544583ac9d96d49a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a901ed33b8ff878544583ac9d96d49a");
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
