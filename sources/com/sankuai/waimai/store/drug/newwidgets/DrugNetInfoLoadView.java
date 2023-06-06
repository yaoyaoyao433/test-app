package com.sankuai.waimai.store.drug.newwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugNetInfoLoadView extends LinearLayout {
    public static ChangeQuickRedirect a;
    public int b;
    public final a c;
    private final b d;
    private final d e;
    private c f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
    }

    public DrugNetInfoLoadView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e1d25c1e512fa2b3748c485cd62c57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e1d25c1e512fa2b3748c485cd62c57");
        }
    }

    public DrugNetInfoLoadView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f3f2c80f1993ab6accf8bb5ad68107d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f3f2c80f1993ab6accf8bb5ad68107d");
        }
    }

    public DrugNetInfoLoadView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, true);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ddeedf8144c59fa0c229d18438591c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ddeedf8144c59fa0c229d18438591c");
        }
    }

    public DrugNetInfoLoadView(Context context, @Nullable AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb1ccd858b4d517524487cf97b62d7de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb1ccd858b4d517524487cf97b62d7de");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3e6dc95069fc890465531de1a39b129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3e6dc95069fc890465531de1a39b129");
        } else {
            setOrientation(1);
            setVisibility(8);
            inflate(getContext(), R.layout.wm_sc_drug_common_layout_refresh_info_new, this);
            setClickable(true);
            setBackgroundResource(R.color.wm_st_common_white);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.LoadingType, R.attr.centerVertical, R.attr.progressText}, i, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(1, z);
        this.b = obtainStyledAttributes.getInteger(0, 1);
        this.c = new a(this);
        this.d = new b(this, obtainStyledAttributes, z2);
        this.e = new d(this);
        Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c3903a080430c3f76ede883712e73ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c3903a080430c3f76ede883712e73ba1");
        } else if (z2) {
            findViewById(R.id.top_patch_view).setVisibility(8);
            setGravity(17);
        } else {
            setGravity(1);
        }
        obtainStyledAttributes.recycle();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d637d087fb8b42a22085cdf8b66e990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d637d087fb8b42a22085cdf8b66e990");
            return;
        }
        if (this.b == 1 || this.c.b) {
            super.setVisibility(0);
        } else {
            super.setVisibility(8);
        }
        e();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1db41b59ed502c8cde1950e8e23ea62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1db41b59ed502c8cde1950e8e23ea62");
        } else if (this.f != null) {
            getVisibility();
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64c237d783ed91769d35a2a278c24812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64c237d783ed91769d35a2a278c24812");
        } else {
            b(str, str2, true);
        }
    }

    private void b(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "195b9b6428926855956f3bd24ff092f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "195b9b6428926855956f3bd24ff092f1");
            return;
        }
        d();
        setBackgroundResource(R.color.wm_st_common_white);
        this.d.a();
        this.c.b(str, str2, this.b);
        this.e.b();
    }

    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d20cc1824dac629c60925f1e71a4121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d20cc1824dac629c60925f1e71a4121");
            return;
        }
        d();
        setBackgroundResource(R.color.wm_st_common_white);
        this.d.a();
        this.c.c(str, str2, this.b);
        this.e.b();
    }

    public final void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a4a74cf42c25faa9765b43fe2c92826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a4a74cf42c25faa9765b43fe2c92826");
        } else {
            a(str, str2, true);
        }
    }

    public final void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bfb630a2ecc3d891636060be3998e63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bfb630a2ecc3d891636060be3998e63");
            return;
        }
        d();
        setBackgroundResource(R.color.wm_st_common_white);
        this.d.a();
        this.c.a(str, str2, this.b);
        if (z) {
            this.e.a();
        } else {
            this.e.b();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c372a57cce33bcec04ddd589b14ffcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c372a57cce33bcec04ddd589b14ffcc");
            return;
        }
        setVisibility(0);
        if (this.b == 1) {
            setBackgroundResource(R.color.wm_st_common_white);
        } else {
            setBackgroundResource(R.color.wm_st_common_transparent);
        }
        this.d.a(this.b, str);
        this.c.a();
        this.e.a();
        e();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e4335aaaeb5b38d0867bf96ec4dcf31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e4335aaaeb5b38d0867bf96ec4dcf31");
        } else {
            a("");
        }
    }

    public void setReloadButtonText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f19be8cdf26ce833f5f24fbc0be750e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f19be8cdf26ce833f5f24fbc0be750e");
            return;
        }
        d dVar = this.e;
        String string = getContext().getString(i);
        Object[] objArr2 = {string};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "19e6efecb4a81cb43a7228fa02791ec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "19e6efecb4a81cb43a7228fa02791ec0");
        } else {
            dVar.b.setText(string);
        }
    }

    public TextView getReloadButtonView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a80d1bb149d70fe4b20a975d0a4ad07", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a80d1bb149d70fe4b20a975d0a4ad07") : this.e.b;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99fd1e7a0fa3756466cf3c5f6c3c463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99fd1e7a0fa3756466cf3c5f6c3c463");
        } else {
            this.e.b();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347d50c485d1561bd65ee9a2ec49e23d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347d50c485d1561bd65ee9a2ec49e23d");
            return;
        }
        setVisibility(8);
        e();
    }

    public void setReloadClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "673a43ffe5c1beee261b53bfd0af9256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "673a43ffe5c1beee261b53bfd0af9256");
            return;
        }
        d dVar = this.e;
        Object[] objArr2 = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "7c781a7021d8ba8e3dbaca685d8bec57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "7c781a7021d8ba8e3dbaca685d8bec57");
        } else {
            dVar.b.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private ImageView b;
        private ImageView c;
        private TextView d;
        private View e;
        private boolean f;

        public b(@NonNull ViewGroup viewGroup, @Nullable TypedArray typedArray, boolean z) {
            Object[] objArr = {viewGroup, typedArray, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc1376c737d910ddd2273e114a3bfae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc1376c737d910ddd2273e114a3bfae");
                return;
            }
            this.f = z;
            this.b = (ImageView) viewGroup.findViewById(R.id.progress_round_info);
            this.c = (ImageView) viewGroup.findViewById(R.id.progress_info);
            this.d = (TextView) viewGroup.findViewById(R.id.txt_progress_info);
            this.e = viewGroup.findViewById(R.id.loading_top_patch_view);
            Object[] objArr2 = {typedArray};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e089af59977ce600f1f40f5e171bf9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e089af59977ce600f1f40f5e171bf9d");
            } else if (typedArray == null) {
            } else {
                String string = typedArray.getString(2);
                this.d.setText(TextUtils.isEmpty(string) ? this.d.getContext().getString(R.string.wm_sc_common_loading) : string);
            }
        }

        void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d685498eadf4c5aa7fed6599de81bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d685498eadf4c5aa7fed6599de81bd");
                return;
            }
            this.e.setVisibility(this.f ? 8 : 0);
            if (i == 1) {
                if (!TextUtils.isEmpty(str)) {
                    this.d.setText(str);
                }
                this.c.setVisibility(0);
                this.d.setVisibility(0);
                this.b.setVisibility(8);
                a(this.c.getDrawable());
                b(this.b.getDrawable());
                return;
            }
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.b.setVisibility(0);
            a(this.b.getDrawable());
            b(this.c.getDrawable());
        }

        private void a(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8567e58a52823258860042a526cb5b95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8567e58a52823258860042a526cb5b95");
            } else if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).start();
            }
        }

        private void b(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e0b5bfe591c53bcef4f57a5bdfb3252", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e0b5bfe591c53bcef4f57a5bdfb3252");
            } else if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).stop();
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f843ea7ba98070e2b9298f164523c2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f843ea7ba98070e2b9298f164523c2f");
                return;
            }
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public boolean b;
        private ImageView c;
        private TextView d;
        private TextView e;

        public a(@NonNull ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4036e482e10f74920446a6a29fa61b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4036e482e10f74920446a6a29fa61b4");
                return;
            }
            this.b = false;
            this.d = (TextView) viewGroup.findViewById(R.id.txt_info);
            this.e = (TextView) viewGroup.findViewById(R.id.txt_sub_info);
            this.c = (ImageView) viewGroup.findViewById(R.id.img_info);
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f58433b1015fb7d340bd34fe12780be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f58433b1015fb7d340bd34fe12780be");
                return;
            }
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
        }

        private void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f785998a4e7e7f171d96dec653844d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f785998a4e7e7f171d96dec653844d");
                return;
            }
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            this.e.setVisibility(0);
        }

        void a(String str, String str2, int i) {
            Object[] objArr = {str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6589b4f32b2082e66fc024e8efa471", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6589b4f32b2082e66fc024e8efa471");
            } else {
                a(a(R.string.wm_sc_common_no_content, str), str2, 1, i);
            }
        }

        void b(String str, String str2, int i) {
            Object[] objArr = {str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0487b14204a72acf210f98d51ee2d4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0487b14204a72acf210f98d51ee2d4f");
            } else {
                a(a(R.string.wm_sc_common_net_error_info, str), str2, 2, i);
            }
        }

        void c(String str, String str2, int i) {
            Object[] objArr = {str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969e206db0a21d01aabcf99ed05ec6ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969e206db0a21d01aabcf99ed05ec6ce");
            } else {
                a(a(R.string.wm_sc_common_loading_fail_try_afterwhile, str), str2, 3, i);
            }
        }

        private void a(String str, String str2, int i, int i2) {
            Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "836852c127956452def18ce7d893d9b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "836852c127956452def18ce7d893d9b5");
            } else if (i2 == 1 || this.b) {
                b();
                if (i == 2) {
                    this.c.setImageResource(R.drawable.wm_sc_home_def_empty_net);
                } else {
                    this.c.setImageResource(R.drawable.wm_sc_home_filter_empty);
                }
                this.d.setText(str);
                this.e.setText(str2);
                this.e.setVisibility(TextUtils.isEmpty(str2) ? 8 : 0);
            } else {
                am.a(this.c.getContext(), str);
            }
        }

        private String a(@StringRes int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a5e5bc121c7cdf841d16209a12f316c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a5e5bc121c7cdf841d16209a12f316c") : TextUtils.isEmpty(str) ? this.d.getContext().getString(i) : str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d {
        public static ChangeQuickRedirect a;
        TextView b;

        public d(@NonNull ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d24e5cf74f6143817e55055b2597b2c1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d24e5cf74f6143817e55055b2597b2c1");
                return;
            }
            this.b = (TextView) viewGroup.findViewById(R.id.btn_info);
            this.b.setBackground(e.a(this.b.getContext(), new int[]{R.color.wm_sg_color_FFE14D, R.color.wm_sg_color_FFC34D}, (int) R.dimen.wm_sc_common_dimen_16));
            this.b.setText(R.string.wm_sc_common_reload);
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e174db1524787127af011510a3bf8d30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e174db1524787127af011510a3bf8d30");
            } else {
                this.b.setVisibility(8);
            }
        }

        void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72afde960cbc27cb43cf56e813dbf115", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72afde960cbc27cb43cf56e813dbf115");
            } else {
                this.b.setVisibility(0);
            }
        }
    }
}
