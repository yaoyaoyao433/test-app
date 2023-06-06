package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NetInfoLoadView extends LinearLayout {
    public static ChangeQuickRedirect a;
    public final a b;
    public final d c;
    public String d;
    private int e;
    private final e f;
    private final b g;
    private c h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
    }

    public NetInfoLoadView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe75a6d21fc79cbf81b16fbb3dccfa19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe75a6d21fc79cbf81b16fbb3dccfa19");
        }
    }

    public NetInfoLoadView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2de3b79d32cbfd1407e46bfff77ad05c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2de3b79d32cbfd1407e46bfff77ad05c");
        }
    }

    public NetInfoLoadView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e16d49302c2bd496cef44b1b4a63b1f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e16d49302c2bd496cef44b1b4a63b1f4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a5b276896b2264abdbc0f14c503714f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a5b276896b2264abdbc0f14c503714f");
        } else {
            setOrientation(1);
            setVisibility(8);
            inflate(getContext(), R.layout.wm_st_common_layout_refresh_info_new_copy, this);
            setClickable(true);
            a();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.LoadingType, R.attr.centerVertical, R.attr.progressText}, i, 0);
        this.e = obtainStyledAttributes.getInteger(0, 1);
        this.f = new e(this);
        this.b = new a(this);
        this.g = new b(this, obtainStyledAttributes);
        this.c = new d(this);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69c4437ad5acfce264c50f28b433f232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69c4437ad5acfce264c50f28b433f232");
        } else if (z) {
            findViewById(R.id.top_patch_view).setVisibility(8);
            findViewById(R.id.bottom_patch_view).setVisibility(8);
            setGravity(17);
        } else {
            setGravity(1);
        }
        obtainStyledAttributes.recycle();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d45402b7c1d15c9f520b73af31abd7c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d45402b7c1d15c9f520b73af31abd7c7");
            return;
        }
        if (this.e == 1 || this.b.f) {
            super.setVisibility(0);
        } else {
            super.setVisibility(8);
        }
        g();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94eae5cdd9804bc3dfc80756330661f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94eae5cdd9804bc3dfc80756330661f2");
        } else if (this.h != null) {
            getVisibility();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de2f196f3fc82edb4a70d6f84d8a2215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de2f196f3fc82edb4a70d6f84d8a2215");
        } else {
            a(str, true);
        }
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b522f37fd7399a3286f902708b31d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b522f37fd7399a3286f902708b31d37");
            return;
        }
        a(str, true);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d728b56bd14f60b7c72e2797f4eed262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d728b56bd14f60b7c72e2797f4eed262");
        } else {
            a(str, "", z);
        }
    }

    private void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d5501ab1b56052cf12b8e473d33cfef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d5501ab1b56052cf12b8e473d33cfef");
            return;
        }
        f();
        a();
        this.g.a();
        this.b.b(str, str2, this.e);
        if (z) {
            this.c.b();
        } else {
            this.c.a();
        }
        a(NetInfoLoadMonitor.NetError, str);
    }

    public final void a(String str, String str2, String str3, boolean z, boolean z2, int i, String str4, String str5, String str6) {
        char c2;
        Object[] objArr = {str, str2, str3, (byte) 1, (byte) 1, Integer.valueOf((int) R.drawable.wm_sc_home_filter_empty), str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0da971536a8277e45d7a0527966571f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0da971536a8277e45d7a0527966571f2");
            return;
        }
        f();
        a();
        this.g.a();
        this.b.a(str, str2, str3, this.e, (int) R.drawable.wm_sc_home_filter_empty, str5);
        this.c.b();
        this.c.a(str6);
        e eVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "2f564b09b1b86a39f9ca7255095ed3d0", RobustBitConfig.DEFAULT_VALUE)) {
            c2 = 0;
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "2f564b09b1b86a39f9ca7255095ed3d0");
        } else {
            c2 = 0;
            eVar.b.setVisibility(0);
            eVar.c.setVisibility(0);
            eVar.d.setVisibility(0);
        }
        e eVar2 = this.f;
        Object[] objArr3 = new Object[1];
        objArr3[c2] = str4;
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "83683aae8fd7c0de8922cef9b0ad0571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "83683aae8fd7c0de8922cef9b0ad0571");
        } else if (!TextUtils.isEmpty(str4)) {
            eVar2.d.setText(str4);
        }
        a(NetInfoLoadMonitor.NetError, str);
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "673e88dc0612ed18ed857b9bc945b2c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "673e88dc0612ed18ed857b9bc945b2c7");
        } else {
            b(str, "");
        }
    }

    private void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c15955e4b5908b1abc6e690e297c8430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c15955e4b5908b1abc6e690e297c8430");
            return;
        }
        f();
        a();
        this.g.a();
        this.b.a(str, this.e, str2);
        this.c.b();
        a(NetInfoLoadMonitor.DataError, str);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f9fc5fb1f74d369563443da1d07078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f9fc5fb1f74d369563443da1d07078");
        } else {
            setBackgroundColor(com.sankuai.shangou.stone.util.d.a(this.d, -1));
        }
    }

    private void setBgColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b502ae9a0c72dfa4d0e8eacd31654421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b502ae9a0c72dfa4d0e8eacd31654421");
        } else {
            setBackgroundColor(com.sankuai.shangou.stone.util.d.a(this.d, 0));
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695acf8785e87d077197dacbfea0b57f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695acf8785e87d077197dacbfea0b57f");
            return;
        }
        f();
        a();
        this.g.a();
        this.b.a(str, str2, this.e);
        this.c.a();
        a(NetInfoLoadMonitor.DataEmpty, str);
    }

    public final void a(String str, String str2, String str3, int i, boolean z, String str4, String str5) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4615278b59b9fba43dccd96c182b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4615278b59b9fba43dccd96c182b71");
            return;
        }
        f();
        a();
        this.g.a();
        this.b.a(str, str2, str3, this.e, i, str4);
        if (z) {
            this.c.b();
            this.c.a(str5);
        } else {
            this.c.a();
        }
        a(NetInfoLoadMonitor.DataEmpty, str);
    }

    private void a(IMonitor iMonitor, String str) {
        Object[] objArr = {iMonitor, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e33942c9d9a42939d62c537946390c19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e33942c9d9a42939d62c537946390c19");
        } else if (getContext() != null) {
            getContext().getClass().getSimpleName();
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "737173708b29c8102a4f8ba5efd982ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "737173708b29c8102a4f8ba5efd982ea");
            return;
        }
        if (this.e == 1) {
            a();
        } else {
            setBgColor(R.color.wm_st_common_transparent);
        }
        setVisibility(0);
        b bVar = this.g;
        int i = this.e;
        Object[] objArr2 = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9db97affad2455f446b7585b3ec16918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9db97affad2455f446b7585b3ec16918");
        } else if (i == 1) {
            if (!TextUtils.isEmpty(str)) {
                bVar.d.setText(str);
            }
            bVar.c.setVisibility(0);
            bVar.d.setVisibility(0);
            bVar.b.setVisibility(8);
            bVar.a(bVar.c.getDrawable());
            bVar.b(bVar.b.getDrawable());
        } else {
            bVar.c.setVisibility(8);
            bVar.d.setVisibility(8);
            bVar.b.setVisibility(0);
            bVar.a(bVar.b.getDrawable());
            bVar.b(bVar.c.getDrawable());
        }
        a aVar = this.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "bc1d807a665cb618aec467b8c9a36022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "bc1d807a665cb618aec467b8c9a36022");
        } else {
            aVar.b.setVisibility(8);
            aVar.c.setVisibility(8);
            aVar.d.setVisibility(8);
            aVar.e.setVisibility(8);
        }
        this.c.a();
        g();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820a1cd59d535d20860f967739f2e64f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820a1cd59d535d20860f967739f2e64f");
            return;
        }
        this.e = i;
        c("");
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca5e599348c24552b741f04fde32272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca5e599348c24552b741f04fde32272");
        } else {
            c("");
        }
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166ee5faedd464ce29d16198719312ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166ee5faedd464ce29d16198719312ab");
        } else {
            a(i, str, "");
        }
    }

    private void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f872e881e547016308a5ce714b226bc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f872e881e547016308a5ce714b226bc5");
        } else if (i != 4) {
            switch (i) {
                case 0:
                    c("");
                    return;
                case 1:
                    a(str, str2, true);
                    return;
                case 2:
                    b(str, str2);
                    return;
                default:
                    e();
                    return;
            }
        } else {
            a(str, str2);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a851c855b4e3d1ef2b8fb74c7da79722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a851c855b4e3d1ef2b8fb74c7da79722");
        } else {
            a("");
        }
    }

    public void setReloadButtonText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2425745c07a211aac88bd6509d48d68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2425745c07a211aac88bd6509d48d68");
        } else {
            this.c.a(getContext().getString(i));
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85071228bc954ae1ebb62de36a69178c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85071228bc954ae1ebb62de36a69178c");
        } else {
            this.c.a();
        }
    }

    public TextView getReloadTextView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a6d9785860263037d70a4cb9fb9c65", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a6d9785860263037d70a4cb9fb9c65") : this.c.b;
    }

    public TextView getErrorTitleTextView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a209f58378952710faa2a93115f3dab4", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a209f58378952710faa2a93115f3dab4") : this.b.c;
    }

    public void setErrorInfoRes(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba09f68b64230acd6c78867414e8b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba09f68b64230acd6c78867414e8b02");
        } else if (this.b.b != null) {
            this.b.b.setImageResource(i);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4457ac8cda59eb20f4e3fb0d7c02d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4457ac8cda59eb20f4e3fb0d7c02d7d");
            return;
        }
        setVisibility(8);
        g();
    }

    public void setStateChangeListener(c cVar) {
        this.h = cVar;
    }

    public void setReloadClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97a7a1707c2d9c2871d5604cb78640e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97a7a1707c2d9c2871d5604cb78640e9");
            return;
        }
        d dVar = this.c;
        Object[] objArr2 = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "5949b93265408e7b86088096b6ced9f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "5949b93265408e7b86088096b6ced9f4");
        } else {
            dVar.b.setOnClickListener(onClickListener);
        }
    }

    public void setBackClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271fc33a54d868d7beb13fc1debe8b6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271fc33a54d868d7beb13fc1debe8b6f");
            return;
        }
        e eVar = this.f;
        Object[] objArr2 = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "2c160f439c2915ba9418d225c6e14ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "2c160f439c2915ba9418d225c6e14ef7");
        } else {
            eVar.c.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class e {
        public static ChangeQuickRedirect a;
        FrameLayout b;
        ImageView c;
        TextView d;

        public e(@NonNull ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "524f33c6b9d434a89156689e6f4971ce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "524f33c6b9d434a89156689e6f4971ce");
                return;
            }
            this.b = (FrameLayout) viewGroup.findViewById(R.id.top_bar_layout);
            this.c = (ImageView) viewGroup.findViewById(R.id.top_bar_back);
            this.d = (TextView) viewGroup.findViewById(R.id.top_bar_title);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        ImageView b;
        ImageView c;
        TextView d;

        public b(@NonNull ViewGroup viewGroup, @Nullable TypedArray typedArray) {
            Object[] objArr = {viewGroup, typedArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40f64ab1a09069364d5f24fe2592e01", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40f64ab1a09069364d5f24fe2592e01");
                return;
            }
            this.b = (ImageView) viewGroup.findViewById(R.id.progress_round_info);
            this.c = (ImageView) viewGroup.findViewById(R.id.progress_info);
            this.d = (TextView) viewGroup.findViewById(R.id.txt_progress_info);
            Object[] objArr2 = {typedArray};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2757c891b618025dcecf9462332740f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2757c891b618025dcecf9462332740f");
            } else if (typedArray == null) {
            } else {
                String string = typedArray.getString(2);
                this.d.setText(TextUtils.isEmpty(string) ? this.d.getContext().getString(R.string.wm_sc_common_loading) : string);
            }
        }

        void a(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6332ad6ca9da70e324adbb786fb4c61c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6332ad6ca9da70e324adbb786fb4c61c");
            } else if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).start();
            }
        }

        void b(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01abb2e17ed7fac944880ac6670e83cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01abb2e17ed7fac944880ac6670e83cb");
            } else if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).stop();
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45066029649026b193191e888a9ded81", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45066029649026b193191e888a9ded81");
                return;
            }
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.b.setVisibility(8);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        ImageView b;
        TextView c;
        TextView d;
        TextView e;
        public boolean f;

        public a(@NonNull ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5066f66fd5ede31ca39ee399657a83b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5066f66fd5ede31ca39ee399657a83b2");
                return;
            }
            this.f = false;
            this.c = (TextView) viewGroup.findViewById(R.id.txt_info);
            this.e = (TextView) viewGroup.findViewById(R.id.txt_error_code);
            this.d = (TextView) viewGroup.findViewById(R.id.txt_sub_info);
            this.b = (ImageView) viewGroup.findViewById(R.id.img_info);
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e820d6d0abd8b484aad20284f45b2a8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e820d6d0abd8b484aad20284f45b2a8e");
                return;
            }
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.d.setVisibility(0);
        }

        void a(String str, String str2, int i) {
            Object[] objArr = {str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce127a922632defda692d0216e91556c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce127a922632defda692d0216e91556c");
            } else {
                a(a(R.string.wm_sc_common_no_content, str), str2, R.drawable.wm_sc_internet_empty, i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, String str3, int i, int i2, String str4) {
            Object[] objArr = {str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), str4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0068836fb4c95d61d530009fdd980407", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0068836fb4c95d61d530009fdd980407");
            } else {
                a(a(R.string.wm_sc_common_no_content, str), str2, str3, i2, str4, i);
            }
        }

        void b(String str, String str2, int i) {
            Object[] objArr = {str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0050700d1e9e94f3e6d5db1210d82afe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0050700d1e9e94f3e6d5db1210d82afe");
            } else {
                a(a(R.string.wm_sc_common_net_error_info, str), str2, "", R.drawable.wm_sc_nox_internet_data, "http://p0.meituan.net/scarlett/f1811b99b25f394da43f2ca6184124a56273.png", i);
            }
        }

        void a(String str, int i, String str2) {
            Object[] objArr = {str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc3f22b6fa1dcbb539576430fe27cee3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc3f22b6fa1dcbb539576430fe27cee3");
            } else {
                a(a(R.string.wm_sc_common_loading_fail_try_afterwhile, str), str2, R.drawable.wm_sc_common_default_data_error_icon_copy, i);
            }
        }

        private void a(String str, String str2, String str3, @DrawableRes int i, @Nullable String str4, int i2) {
            Object[] objArr = {str, str2, str3, Integer.valueOf(i), str4, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "318a16e2c75302ec4b35c20a3de9b34a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "318a16e2c75302ec4b35c20a3de9b34a");
            } else if (i2 == 1 || this.f) {
                a();
                this.c.setText(str);
                this.d.setText(str2);
                this.d.setVisibility(TextUtils.isEmpty(str2) ? 8 : 0);
                this.e.setText(str3);
                this.e.setVisibility(t.a(str3) ? 8 : 0);
                if (!t.a(str4)) {
                    b.C0608b a2 = m.a(str4, ImageQualityUtil.a());
                    a2.j = i;
                    a2.a(this.b);
                    return;
                }
                this.b.setImageResource(i);
            } else {
                am.a(this.b.getContext(), str);
            }
        }

        private void a(String str, String str2, @DrawableRes int i, int i2) {
            Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8394dfcedb85a173037a9a0bc7a5a6c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8394dfcedb85a173037a9a0bc7a5a6c");
            } else {
                a(str, str2, "", i, (String) null, i2);
            }
        }

        private String a(@StringRes int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d39d2dd87f9875823d966b5a1d505b9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d39d2dd87f9875823d966b5a1d505b9") : TextUtils.isEmpty(str) ? this.c.getContext().getString(i) : str;
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4999f17a0ce99e58ae4cfef9adb27e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4999f17a0ce99e58ae4cfef9adb27e");
            } else if (this.c != null) {
                this.c.setSingleLine(false);
                this.c.setMaxLines(i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d {
        public static ChangeQuickRedirect a;
        TextView b;

        public d(@NonNull ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb48365378affa90c391e17f253c43d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb48365378affa90c391e17f253c43d");
                return;
            }
            this.b = (TextView) viewGroup.findViewById(R.id.btn_info);
            this.b.setText(R.string.wm_sc_common_reload);
            this.b.setBackground(new e.a().a(h.a(viewGroup.getContext(), 6.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(viewGroup.getContext(), R.color.wm_sg_color_FFE14D), ContextCompat.getColor(viewGroup.getContext(), R.color.wm_sg_color_FFC34D)}).a());
        }

        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5f68f4bdb9c1b5467e4f3d7e237f95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5f68f4bdb9c1b5467e4f3d7e237f95");
            } else {
                this.b.setText(str);
            }
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89ba697ae0894f4bf60909c1d2817091", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89ba697ae0894f4bf60909c1d2817091");
            } else {
                this.b.setVisibility(8);
            }
        }

        public void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28187a257b67ccd686006ec944e65daa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28187a257b67ccd686006ec944e65daa");
            } else {
                this.b.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum NetInfoLoadMonitor implements IMonitor {
        NetError,
        DataError,
        DataEmpty;
        
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final boolean a() {
            return false;
        }

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
            return null;
        }

        NetInfoLoadMonitor() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a419f69c557c3313d21e2deaf4156630", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a419f69c557c3313d21e2deaf4156630");
            }
        }

        public static NetInfoLoadMonitor valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c5f87cdbb16afed8f506f62e020673e", RobustBitConfig.DEFAULT_VALUE) ? (NetInfoLoadMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c5f87cdbb16afed8f506f62e020673e") : (NetInfoLoadMonitor) Enum.valueOf(NetInfoLoadMonitor.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static NetInfoLoadMonitor[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3c78aec3e4dcc928ecc6f23d42e56ea", RobustBitConfig.DEFAULT_VALUE) ? (NetInfoLoadMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3c78aec3e4dcc928ecc6f23d42e56ea") : (NetInfoLoadMonitor[]) values().clone();
        }
    }
}
