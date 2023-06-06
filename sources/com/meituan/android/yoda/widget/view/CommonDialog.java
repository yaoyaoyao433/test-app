package com.meituan.android.yoda.widget.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CommonDialog extends Dialog {
    private static int a = 300;
    private static int b = 600;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum b {
        CONFIRM,
        WAITING;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a0d21a0d56845b84a0de9d2ab57b7a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a0d21a0d56845b84a0de9d2ab57b7a");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32cae2afc6b952b550c6c67458fb5000", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32cae2afc6b952b550c6c67458fb5000") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f24bc40dd420096f7a573ca14d30546", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f24bc40dd420096f7a573ca14d30546") : (b[]) values().clone();
        }
    }

    public CommonDialog(Context context, View view, int i) {
        this(context, a, b, view, R.style.dialog);
    }

    private CommonDialog(Context context, int i, int i2, View view, int i3) {
        super(context, i3);
        setContentView(view);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        List<ImageView> b;
        List<LinearLayout> c;
        private TextView d;
        private TextView e;
        private LinearLayout f;
        private LinearLayout g;
        private LinearLayout h;
        private ImageView i;
        private ImageView j;
        private ImageView k;
        private ImageView l;
        private TextView m;
        private TextView n;
        private TextView o;
        private List<String> p;
        private final int q;
        private final int r;
        private CommonDialog s;
        private WeakReference<Activity> t;
        private b u;

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.android.yoda.widget.view.CommonDialog$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0382a implements Callback {
            public static ChangeQuickRedirect a;
            private int c;

            public C0382a(int i) {
                Object[] objArr = {a.this, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080acbf929739a51dad263a6d1a834df", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080acbf929739a51dad263a6d1a834df");
                } else {
                    this.c = i;
                }
            }

            @Override // com.squareup.picasso.Callback
            public final void a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6e8df47b73b7e6b21da268a85538d2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6e8df47b73b7e6b21da268a85538d2b");
                    return;
                }
                ImageView imageView = a.this.b.get(this.c);
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                a.this.c.get(this.c / 2).setVisibility(0);
            }

            @Override // com.squareup.picasso.Callback
            public final void b() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eb9330f0e65d49cfc5bfdd7235498be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eb9330f0e65d49cfc5bfdd7235498be");
                    return;
                }
                ImageView imageView = a.this.b.get(this.c);
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                boolean z = true;
                for (ImageView imageView2 : a.this.b) {
                    if (imageView2 != null && imageView2.getVisibility() == 0) {
                        z = false;
                    }
                }
                if (z) {
                    a.this.a(8);
                }
            }
        }

        public a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "668686dbeeeff614448a7d5054c70ba8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "668686dbeeeff614448a7d5054c70ba8");
                return;
            }
            this.q = 4;
            this.r = 2;
            this.u = b.CONFIRM;
            if (activity == null) {
                return;
            }
            this.t = new WeakReference<>(activity);
            a(activity, b.CONFIRM);
        }

        public final a a(Context context, b bVar) {
            Object[] objArr = {context, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b546a8b1162026b72c2bef4408408218", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b546a8b1162026b72c2bef4408408218");
            }
            if (context != null && bVar != null) {
                if (bVar == b.CONFIRM) {
                    a(context);
                } else if (bVar == b.WAITING) {
                    b(context);
                }
            }
            return this;
        }

        public final a a(String str, float f) {
            Object[] objArr = {str, Float.valueOf(17.0f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5118202a2891d7ceded859c64232a08", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5118202a2891d7ceded859c64232a08");
            }
            if (this.d != null) {
                this.d.setVisibility(0);
                this.d.setText(str);
                this.d.setTextSize(17.0f);
            }
            return this;
        }

        public final a b(String str, float f) {
            Object[] objArr = {str, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c35fd6ccef50a51768e97b30fbf2864", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c35fd6ccef50a51768e97b30fbf2864");
            }
            if (this.e != null) {
                this.e.setVisibility(0);
                this.e.setText(str);
            }
            return this;
        }

        public final a a(String str, int i, View.OnClickListener onClickListener) {
            Object[] objArr = {str, 17, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df43675301ab21afbc413ab9c3e4cb7b", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df43675301ab21afbc413ab9c3e4cb7b");
            }
            if (this.m != null && this.o != null) {
                this.m.setVisibility(0);
                this.o.setVisibility(0);
                this.m.setText(str);
                this.m.setTextSize(17.0f);
                this.m.setOnClickListener(onClickListener);
            }
            return this;
        }

        public final a b(String str, int i, View.OnClickListener onClickListener) {
            Object[] objArr = {str, 17, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "076fffb539a929c0f017c133a757958d", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "076fffb539a929c0f017c133a757958d");
            }
            if (this.n != null && this.o != null) {
                this.n.setVisibility(0);
                this.o.setVisibility(0);
                this.n.setText(str);
                this.n.setTextSize(17.0f);
                this.n.setOnClickListener(onClickListener);
            }
            return this;
        }

        public final a a(int i) {
            Object[] objArr = {8};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86dc85d3ce27a3f2f350d0052803352", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86dc85d3ce27a3f2f350d0052803352");
            }
            if (this.e != null) {
                this.e.setVisibility(8);
            }
            return this;
        }

        public final a a(List<String> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff43b3f85f34a6a19ab243d0a47a30a1", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff43b3f85f34a6a19ab243d0a47a30a1");
            }
            if (list == null || list.isEmpty()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23056cab0c45a9d80440da8bc205e230", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23056cab0c45a9d80440da8bc205e230");
                } else {
                    for (ImageView imageView : this.b) {
                        imageView.setVisibility(8);
                    }
                    for (LinearLayout linearLayout : this.c) {
                        linearLayout.setVisibility(8);
                    }
                    this.f.setVisibility(8);
                    this.f.setContentDescription("");
                }
                return this;
            }
            this.p = list;
            this.f.setVisibility(0);
            for (int i = 0; i < list.size() && i < 4; i++) {
                String str = list.get(i);
                if (!TextUtils.isEmpty(str)) {
                    try {
                        Picasso.g(this.s.getContext()).d(str).a(this.b.get(i), new C0382a(i));
                    } catch (Exception e) {
                        this.b.get(i).setVisibility(8);
                        e.printStackTrace();
                    }
                }
            }
            String a2 = x.a((int) R.string.yoda_face_verify_tips_icon_content_des);
            Object[] objArr3 = {a2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4fccd938babbb449ad88111b3105d71c", RobustBitConfig.DEFAULT_VALUE)) {
                a aVar = (a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4fccd938babbb449ad88111b3105d71c");
            } else if (this.p != null && !this.p.isEmpty() && this.f != null) {
                this.f.setContentDescription(a2);
                this.f.setImportantForAccessibility(1);
            }
            return b(x.a((int) R.string.yoda_face_verify_fail_tips), x.a(14.0f));
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26b5b01796298839e3dac84de9bf0b0d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26b5b01796298839e3dac84de9bf0b0d")).booleanValue();
            }
            if (this.s == null) {
                return false;
            }
            return this.s.isShowing();
        }

        public final a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "935ace3eac566ca4dedebf3fd7d52123", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "935ace3eac566ca4dedebf3fd7d52123");
            }
            if (this.s != null) {
                try {
                    this.s.dismiss();
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public final a c() {
            Activity activity;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e610dd0abf13e7145dff06b0e5f6fff", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e610dd0abf13e7145dff06b0e5f6fff");
            }
            try {
                if (this.t != null && (activity = this.t.get()) != null && !activity.isFinishing()) {
                    this.s.show();
                }
            } catch (Throwable unused) {
            }
            return this;
        }

        private void a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3203c29eb46f767871bb82dcc67ac9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3203c29eb46f767871bb82dcc67ac9");
                return;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.yoda_common_dialog_layout, (ViewGroup) null);
            this.d = (TextView) inflate.findViewById(R.id.title);
            this.e = (TextView) inflate.findViewById(R.id.message);
            this.f = (LinearLayout) inflate.findViewById(R.id.tips_icons_layout);
            this.g = (LinearLayout) inflate.findViewById(R.id.icon_line_1);
            this.h = (LinearLayout) inflate.findViewById(R.id.icon_line_2);
            this.i = (ImageView) inflate.findViewById(R.id.icon_top_left);
            this.j = (ImageView) inflate.findViewById(R.id.icon_top_right);
            this.k = (ImageView) inflate.findViewById(R.id.icon_bottom_left);
            this.l = (ImageView) inflate.findViewById(R.id.icon_bottom_right);
            this.c = new ArrayList();
            this.c.add(this.g);
            this.c.add(this.h);
            this.b = new ArrayList();
            this.b.add(this.i);
            this.b.add(this.j);
            this.b.add(this.k);
            this.b.add(this.l);
            this.m = (TextView) inflate.findViewById(R.id.confirm);
            this.n = (TextView) inflate.findViewById(R.id.cancel);
            this.o = (TextView) inflate.findViewById(R.id.divider);
            this.s = new CommonDialog(context, inflate, R.style.dialog);
            Window window = this.s.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.height = -2;
            window.setAttributes(attributes);
            this.s.setCanceledOnTouchOutside(false);
            this.s.setCancelable(false);
        }

        private void b(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e7e46fd986bb7b98138e76bca57ed8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e7e46fd986bb7b98138e76bca57ed8");
                return;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.yoda_waiting_dialog_layout, (ViewGroup) null);
            this.e = (TextView) inflate.findViewById(R.id.message);
            this.s = new CommonDialog(context, inflate, R.style.dialog);
            Window window = this.s.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = (int) x.a(180.0f);
            attributes.height = (int) x.a(140.0f);
            window.setAttributes(attributes);
            this.s.setCanceledOnTouchOutside(false);
            this.s.setCancelable(false);
        }
    }
}
