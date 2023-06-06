package com.meituan.passport.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ab;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class VerificationFrameView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public PassportEditText b;
    public List<d> c;
    private Context d;
    private String e;
    private LinearLayout f;
    private LayoutInflater g;
    private int h;
    private Animation i;
    private a j;
    private com.meituan.passport.clickaction.c<String> k;
    private int l;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "485b12a8af3867a8f02ca821cb12d6fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "485b12a8af3867a8f02ca821cb12d6fc")).booleanValue();
        }
        return false;
    }

    public VerificationFrameView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815c0b416e1fb0e3ade3e3d834aab01b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815c0b416e1fb0e3ade3e3d834aab01b");
        }
    }

    public VerificationFrameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64aa3ba92ed1ccf8ef54e39e554a44cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64aa3ba92ed1ccf8ef54e39e554a44cf");
        }
    }

    public VerificationFrameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate;
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ef95cfb40b697f73649c1c233b57aa9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ef95cfb40b697f73649c1c233b57aa9");
            return;
        }
        this.c = new ArrayList();
        this.e = "";
        this.h = 6;
        this.l = 0;
        this.d = context;
        this.g = (LayoutInflater) context.getSystemService("layout_inflater");
        if (this.g == null) {
            return;
        }
        this.l = ab.a();
        if (this.l == 1) {
            inflate = this.g.inflate(R.layout.passport_view_elder_verifycation_frame, (ViewGroup) this, true);
        } else {
            inflate = this.g.inflate(R.layout.passport_view_verifycation_frame, (ViewGroup) this, true);
        }
        this.f = (LinearLayout) inflate.findViewById(R.id.passport_container);
        this.b = (PassportEditText) inflate.findViewById(R.id.edit_text_view);
        c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b44d6045e8d8ffc0b4cfb02739abe054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b44d6045e8d8ffc0b4cfb02739abe054");
        } else {
            this.b.addTextChangedListener(new TextWatcher() { // from class: com.meituan.passport.view.VerificationFrameView.1
                public static ChangeQuickRedirect a;

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    Object[] objArr3 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b4a1c57273aec3a206da529e1087340", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b4a1c57273aec3a206da529e1087340");
                        return;
                    }
                    String str = "start: " + i2 + " count: " + i3 + " after: " + i4;
                    StringBuilder sb = new StringBuilder("charSequence: ");
                    sb.append(TextUtils.isEmpty(charSequence) ? StringUtil.NULL : "not null");
                    n.a("VerificationFrameView.beforeTextChanged", str, sb.toString());
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    Object[] objArr3 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1d9a2cc0bfdc8e0094a7179af3aa518", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1d9a2cc0bfdc8e0094a7179af3aa518");
                        return;
                    }
                    String str = "start: " + i2 + " before: " + i3 + " count: " + i4;
                    StringBuilder sb = new StringBuilder("charSequence: ");
                    sb.append(TextUtils.isEmpty(charSequence) ? StringUtil.NULL : "not null");
                    n.a("VerificationFrameView.onTextChanged", str, sb.toString());
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    Object[] objArr3 = {editable};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d51c1fc9bf9799dc9f9b26583e4629c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d51c1fc9bf9799dc9f9b26583e4629c1");
                        return;
                    }
                    VerificationFrameView.this.e = VerificationFrameView.this.b.getText().toString();
                    VerificationFrameView.this.b();
                }
            });
        }
        this.i = AnimationUtils.loadAnimation(context, R.anim.passport_vf_cursor);
        this.i.setInterpolator(k.a());
        b();
        this.b.setOnLongClickListener(l.a());
        this.k = new b(this);
    }

    public static /* synthetic */ float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0015a22bca06ea3a36461d2d55a203a", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0015a22bca06ea3a36461d2d55a203a")).floatValue() : ((int) (f * 9.9d)) / 5;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b83e71939aeee5f7573316bff6de7b5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b83e71939aeee5f7573316bff6de7b5e");
            return;
        }
        this.c.clear();
        this.f.removeAllViews();
        for (int i = 0; i < this.h; i++) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b55e78268a40b02f245e402b44a82152", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b55e78268a40b02f245e402b44a82152");
            } else {
                if (i > 0) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 1);
                    layoutParams.weight = 1.0f;
                    this.f.addView(getSpaceView(), layoutParams);
                }
                d viewHolder = getViewHolder();
                this.f.addView(viewHolder.a);
                this.c.add(viewHolder);
            }
        }
    }

    private d getViewHolder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc23c85f213354e44763f885bc5c13d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc23c85f213354e44763f885bc5c13d4");
        }
        View inflate = this.g.inflate(this.l == 1 ? R.layout.passport_view_elder_textview : R.layout.passport_view_textview, (ViewGroup) this.f, false);
        if (this.h == 4) {
            inflate.setLayoutParams(new FrameLayout.LayoutParams(Utils.a(this.d, this.l == 1 ? 62.0f : 47.0f), Utils.a(this.d, this.l == 1 ? 75.0f : 44.0f)));
        }
        d dVar = new d();
        dVar.a = inflate;
        dVar.b = (TextView) inflate.findViewById(R.id.num_a);
        dVar.d = inflate.findViewById(R.id.num_bg);
        dVar.c = inflate.findViewById(R.id.num_i);
        View view = dVar.c;
        Context context = getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = Utils.a;
        ViewCompat.setBackgroundTintList(view, ColorStateList.valueOf(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d2dc6101093180352fe0ceec4876741a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d2dc6101093180352fe0ceec4876741a")).intValue() : Utils.d(context, R.attr.colorAccent)));
        dVar.c.setVisibility(8);
        return dVar;
    }

    public final void setLength(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb1d2b19aed90dfd73efcdbbac6fdc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb1d2b19aed90dfd73efcdbbac6fdc7");
            return;
        }
        if (i > 6) {
            i = 6;
        }
        this.h = i;
        c();
        a();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5abc33f4f174f14ddae61397d45be7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5abc33f4f174f14ddae61397d45be7");
            return;
        }
        this.b.setText("");
        this.e = "";
        b();
    }

    public final com.meituan.passport.clickaction.c<String> getParamAction() {
        return this.k;
    }

    public final String getParam() {
        return this.e;
    }

    private View getSpaceView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48307b9aba20a14f30f559aa085a2a8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48307b9aba20a14f30f559aa085a2a8") : new View(this.d);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df32c646c752e9baf322ea70c4a9e846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df32c646c752e9baf322ea70c4a9e846");
            return;
        }
        StringBuilder sb = new StringBuilder("verifyCode: ");
        sb.append(TextUtils.isEmpty(this.e) ? StringUtil.NULL : "not null");
        n.a("VerificationFrameView.setText", "", sb.toString());
        if (this.e.length() > this.c.size()) {
            this.e = this.e.substring(0, this.c.size());
        }
        int length = this.e.length();
        if (length >= this.c.size()) {
            Utils.b(getContext(), this.b);
            if (this.j != null) {
                this.j.a();
            }
        }
        if (length <= this.c.size()) {
            for (int i = 0; i < this.c.size(); i++) {
                d dVar = this.c.get(i);
                if (i < length) {
                    dVar.b.setText(String.valueOf(this.e.charAt(i)));
                    dVar.d.setSelected(true);
                    dVar.c.setVisibility(8);
                    dVar.c.setAnimation(null);
                    this.i.setAnimationListener(null);
                } else if (i == length) {
                    dVar.b.setText("");
                    dVar.d.setSelected(true);
                    dVar.c.setVisibility(0);
                    dVar.c.setAnimation(this.i);
                    this.i.setAnimationListener(new c(dVar.c));
                    this.i.start();
                } else {
                    dVar.b.setText("");
                    dVar.d.setSelected(false);
                    dVar.c.setVisibility(8);
                    dVar.c.setAnimation(null);
                }
            }
        }
    }

    public final void setVerifyListener(a aVar) {
        this.j = aVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class d {
        public View a;
        public TextView b;
        public View c;
        public View d;

        public d() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c implements Animation.AnimationListener {
        public static ChangeQuickRedirect a;
        private WeakReference<View> b;

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }

        private c(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87d3d20e49942a736e9111a5b41bb11", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87d3d20e49942a736e9111a5b41bb11");
            } else {
                this.b = new WeakReference<>(view);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            Object[] objArr = {animation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a52a716aa9b48bd2b5cdf6853cefdeba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a52a716aa9b48bd2b5cdf6853cefdeba");
                return;
            }
            View view = this.b.get();
            if (view != null) {
                view.startAnimation(animation);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements com.meituan.passport.clickaction.c<String> {
        public static ChangeQuickRedirect a;
        public WeakReference<VerificationFrameView> b;

        @Override // com.meituan.passport.clickaction.c
        public final /* synthetic */ String getParam() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5174e3e6eb18edc10936d06970a99576", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5174e3e6eb18edc10936d06970a99576");
            }
            VerificationFrameView verificationFrameView = this.b.get();
            return verificationFrameView != null ? verificationFrameView.e : "";
        }

        public b(VerificationFrameView verificationFrameView) {
            Object[] objArr = {verificationFrameView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea2ce1b337af1b1382491ba2a38b0fd0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea2ce1b337af1b1382491ba2a38b0fd0");
            } else {
                this.b = new WeakReference<>(verificationFrameView);
            }
        }
    }
}
