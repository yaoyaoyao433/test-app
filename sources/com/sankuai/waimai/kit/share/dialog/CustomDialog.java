package com.sankuai.waimai.kit.share.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
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
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CustomDialog extends Dialog implements DialogInterface {
    public static ChangeQuickRedirect a;
    private EditText b;

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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91cf0e2d8532f90baecbfbf2426e8fca", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91cf0e2d8532f90baecbfbf2426e8fca");
            }
        }

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11c558dc32ca1519379035377aeba759", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11c558dc32ca1519379035377aeba759") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd97f3abc35c1017e9ae86e20e1a00ad", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd97f3abc35c1017e9ae86e20e1a00ad") : (d[]) values().clone();
        }
    }

    private CustomDialog(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad910e4f063a8d5592962386c39479f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad910e4f063a8d5592962386c39479f");
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Window window;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d72c639ec99efc720fcb15d9dbf3fe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d72c639ec99efc720fcb15d9dbf3fe8");
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
        public static ChangeQuickRedirect a;
        public final c b;
        private final Context c;

        public a(@NonNull Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46e3243ae384d0ad19072c44685b4c2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46e3243ae384d0ad19072c44685b4c2c");
                return;
            }
            this.c = context;
            this.b = new c(this.c);
        }

        public String a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a4becfdbb307a95d0cd927489b466b0", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a4becfdbb307a95d0cd927489b466b0");
            }
            if (i == 0) {
                return null;
            }
            try {
                return this.c.getString(i);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85e1deac961195847e688e24e3d5b7d8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85e1deac961195847e688e24e3d5b7d8");
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

        public static int a(Context context, float f) {
            Object[] objArr = {context, Float.valueOf(10.0f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fc1c920acb4f6e0a8867f477da4f801", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fc1c920acb4f6e0a8867f477da4f801")).intValue() : (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        }

        public void a(CustomDialog customDialog, int i, int i2, int i3, int i4) {
            Object[] objArr = {customDialog, Integer.valueOf(i), Integer.valueOf(i2), -2, Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6975cf3f9ae289d143108b60782baa4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6975cf3f9ae289d143108b60782baa4");
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

        public static boolean a(TextView textView, CharSequence charSequence) {
            Object[] objArr = {textView, charSequence};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1214e5340ce5c38313d6e484ff7594ea", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1214e5340ce5c38313d6e484ff7594ea")).booleanValue();
            }
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
                return false;
            }
            textView.setText(charSequence);
            textView.setVisibility(0);
            return true;
        }

        public boolean a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3de9f5c9cead663eee35e5c2ae1e4dc2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3de9f5c9cead663eee35e5c2ae1e4dc2")).booleanValue();
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.dialog_title);
            return textView != null && a(textView, this.g);
        }

        public void a(Dialog dialog, boolean z) {
            Object[] objArr = {dialog, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37591f36e3698253482bda6def1bb6da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37591f36e3698253482bda6def1bb6da");
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
                        viewGroup3.getChildAt(0).setBackgroundResource(R.drawable.wm_share_dialog_background_button_corner_both);
                        if (this.M) {
                            ((Button) viewGroup3.getChildAt(0)).setTextColor(this.b.getResources().getColor(R.color.wm_common_text_highlight));
                            return;
                        } else {
                            ((Button) viewGroup3.getChildAt(0)).setTextColor(this.b.getResources().getColor(R.color.wm_common_text_main));
                            return;
                        }
                    case 2:
                        viewGroup3.getChildAt(0).setBackgroundResource(R.drawable.wm_share_dialog_background_button_corner_left);
                        ((Button) viewGroup3.getChildAt(0)).setTextColor(this.b.getResources().getColor(R.color.wm_common_text_main));
                        viewGroup3.getChildAt(1).setBackgroundResource(R.drawable.wm_share_dialog_background_button_corner_right);
                        if (this.M) {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd59d057582c0688f3d53e59f1d12736", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd59d057582c0688f3d53e59f1d12736")).booleanValue();
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
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.kit.share.dialog.CustomDialog.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdd0417ab63a7b7c3614a24cbbcebad7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdd0417ab63a7b7c3614a24cbbcebad7");
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

        public boolean a(Dialog dialog) {
            Object[] objArr = {dialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1b82fefedbb897a0d05baaa0c07ad1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1b82fefedbb897a0d05baaa0c07ad1")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e08f32a0bb5456529ec7648fd24416", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e08f32a0bb5456529ec7648fd24416")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "516fee4805ad1120d0f5b251dca0b214", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "516fee4805ad1120d0f5b251dca0b214")).booleanValue();
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
            View inflate = this.c.inflate(R.layout.wm_share_dialog_layout_list_view, (ViewGroup) frameLayout, false);
            MaxHeightListView maxHeightListView = (MaxHeightListView) inflate.findViewById(R.id.dialog_list_view);
            maxHeightListView.setAdapter(this.m);
            maxHeightListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.kit.share.dialog.CustomDialog.c.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdcb3bd7a964384da1d5fce247f6eb38", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdcb3bd7a964384da1d5fce247f6eb38");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25e56ca129e2deee906885253c70cfa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25e56ca129e2deee906885253c70cfa");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf84feea6e4f399ca203ff0657aec00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf84feea6e4f399ca203ff0657aec00");
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
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0e1d898d27969068cb94f99a08e7aaa", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0e1d898d27969068cb94f99a08e7aaa")).booleanValue();
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
    /* renamed from: com.sankuai.waimai.kit.share.dialog.CustomDialog$1  reason: invalid class name */
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d5eba4861d13c39df36ba87db19bad9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d5eba4861d13c39df36ba87db19bad9");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bcd79a155ad7765913c0556c40ff812", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bcd79a155ad7765913c0556c40ff812");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85317e2a2b735e4705d2530cba94a706", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85317e2a2b735e4705d2530cba94a706");
            }
            if (view == null) {
                view = this.d.inflate(R.layout.wm_share_dialog_adapter_list_item, viewGroup, false);
                aVar = new a(this, view, null);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "472652e699825bc31587d5ddf2185bb2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "472652e699825bc31587d5ddf2185bb2");
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
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7641eee5c1326fb0b21a6bf02aa7905f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7641eee5c1326fb0b21a6bf02aa7905f");
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
