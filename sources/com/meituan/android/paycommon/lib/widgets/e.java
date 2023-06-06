package com.meituan.android.paycommon.lib.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.ColorRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends LinearLayout {
    public static ChangeQuickRedirect a;
    private b b;
    private TextView c;
    private ImageView d;
    private ImageView e;
    private Context f;
    private ViewGroup g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(View view);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class c implements b {
        @Override // com.meituan.android.paycommon.lib.widgets.e.b
        public void a(View view) {
        }
    }

    public static /* synthetic */ void b(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "a12c90256159676271587e8a369fd975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "a12c90256159676271587e8a369fd975");
        } else if (eVar.g != null) {
            eVar.g.addView(eVar, 0);
        }
    }

    public e(Context context) {
        super(context);
        View inflate;
        float f;
        int b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c92a7597b3ffd040f5b8bb97b066d9c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c92a7597b3ffd040f5b8bb97b066d9c7");
            return;
        }
        this.f = context;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36faf6aa66a28019064e22c45abe94d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36faf6aa66a28019064e22c45abe94d5");
            return;
        }
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5863020c8b35c0ba4bbfe7b65ea791b2", RobustBitConfig.DEFAULT_VALUE)) {
            inflate = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5863020c8b35c0ba4bbfe7b65ea791b2");
        } else {
            inflate = context == null ? null : LayoutInflater.from(context).inflate(R.layout.paycommon__half_page_title_bar, this);
        }
        this.d = (ImageView) inflate.findViewById(R.id.paycommon__half_page__back);
        this.d.setOnClickListener(new g() { // from class: com.meituan.android.paycommon.lib.widgets.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.widgets.g
            public final void a(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "19a532b80ec970b29c072a9b1ae1ef94", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "19a532b80ec970b29c072a9b1ae1ef94");
                } else if (e.this.b != null) {
                    e.this.b.a(view);
                }
            }
        }.a(1000L));
        this.e = (ImageView) inflate.findViewById(R.id.paycommon__half_page_close);
        this.e.setOnClickListener(new g() { // from class: com.meituan.android.paycommon.lib.widgets.e.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.widgets.g
            public final void a(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f8f604fdbd1ad82e8a155b93854a011", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f8f604fdbd1ad82e8a155b93854a011");
                } else if (e.this.b != null) {
                    b unused = e.this.b;
                }
            }
        }.a(1000L));
        this.c = (TextView) inflate.findViewById(R.id.paycommon__half_page_title);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8e90d25e43e6242da6a505dfbf28fc27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8e90d25e43e6242da6a505dfbf28fc27");
        } else if (this.f instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) this.f;
            if (payBaseActivity.getSupportActionBar() != null) {
                payBaseActivity.getSupportActionBar().c();
            }
        }
        setHalfPageBackgroundColor(R.color.paybase__half_transparent);
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "27376996cded42e3954815f37295f00b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "27376996cded42e3954815f37295f00b");
        } else if (this.f != null) {
            Context context2 = this.f;
            Object[] objArr6 = {context2};
            ChangeQuickRedirect changeQuickRedirect6 = ab.a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "e479e4286d63aff98e86d27e7b93537a", RobustBitConfig.DEFAULT_VALUE)) {
                b2 = ((Integer) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "e479e4286d63aff98e86d27e7b93537a")).intValue();
            } else {
                Object[] objArr7 = {context2};
                ChangeQuickRedirect changeQuickRedirect7 = ab.a;
                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "e2172c530cc82ced59c65195dc24eccd", RobustBitConfig.DEFAULT_VALUE)) {
                    f = ((Float) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "e2172c530cc82ced59c65195dc24eccd")).floatValue();
                } else {
                    f = 0.3f;
                    if (ab.a(context2) <= 1080) {
                        f = 0.2f;
                    }
                }
                b2 = (int) (ab.b(context2) * f);
            }
            setPadding(0, b2, 0, 0);
        }
    }

    private void setStatusBarColor(int i) {
        Window window;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7a75ada7edd7d45b2c811b39ac28d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7a75ada7edd7d45b2c811b39ac28d3");
            return;
        }
        try {
            if (!(this.f instanceof PayBaseActivity) || Build.VERSION.SDK_INT < 23 || (window = ((PayBaseActivity) this.f).getWindow()) == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
            window.getDecorView().setSystemUiVisibility(8192);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCashierActivity_setStatusBarColor", (Map<String, Object>) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttachedView(ViewGroup viewGroup) {
        this.g = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHalfPageBackgroundColor(@ColorRes int i) {
        Window window;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9a30697b0ad4849d80fecbc56bfce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9a30697b0ad4849d80fecbc56bfce2");
        } else if (!(this.f instanceof PayBaseActivity) || (window = ((PayBaseActivity) this.f).getWindow()) == null) {
        } else {
            window.setBackgroundDrawableResource(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df6aa16837725e74ee65c394f0ebabc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df6aa16837725e74ee65c394f0ebabc7");
        } else if (this.c == null || TextUtils.isEmpty(str)) {
        } else {
            this.c.setText(str);
        }
    }

    private void setTitleBold(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61257a570257d0fd3aef68247d1b49e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61257a570257d0fd3aef68247d1b49e5");
        } else if (this.c != null) {
            this.c.setTypeface(z ? Typeface.defaultFromStyle(1) : Typeface.defaultFromStyle(0));
        }
    }

    private void setBackIconVisible(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "124ae41b3d9d646248b8364c72742ab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "124ae41b3d9d646248b8364c72742ab6");
        } else if (this.d != null) {
            this.d.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseIconVisible(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4d233ccae7810a1d302bb90ec97d007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4d233ccae7810a1d302bb90ec97d007");
        } else if (this.e != null) {
            this.e.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setINavigationCallback(b bVar) {
        this.b = bVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public e b;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2a3decebb4b9c42a5b5c6ffcb07421", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2a3decebb4b9c42a5b5c6ffcb07421");
            } else {
                this.b = new e(context);
            }
        }
    }
}
