package com.sankuai.waimai.globalcart.rn;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.widget.RoundedFrameLayout;
import com.sankuai.waimai.platform.widget.popup.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.widget.popup.a {
    public static ChangeQuickRedirect a;
    private C0953a r;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.globalcart.rn.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0953a {
        public int a;
        public int b;
        public int c;
        public int d;
        public String e;
        public String f;
        public String g;
        public Bundle h;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final int e() {
        return -1;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final String j() {
        return "CouponPopupPopup";
    }

    public a(@NonNull FragmentActivity fragmentActivity, C0953a c0953a) {
        Object[] objArr = {fragmentActivity, c0953a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85dae5a94da8c134379cbe9b5a8da600", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85dae5a94da8c134379cbe9b5a8da600");
            return;
        }
        this.r = c0953a;
        Object[] objArr2 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.popup.a.b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14784c0abd43b55a35efac80b15b9484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14784c0abd43b55a35efac80b15b9484");
            return;
        }
        this.p = new Handler();
        Object[] objArr3 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.widget.popup.a.b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72939465575f147ed827fda6888caece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72939465575f147ed827fda6888caece");
        } else {
            this.e = LayoutInflater.from(fragmentActivity).inflate(R.layout.wm_common_mrn_popup_container, (ViewGroup) null);
            this.f = (RoundedFrameLayout) this.e.findViewById(R.id.mrn_popup_fragment_container);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.widget.popup.a.b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4f5f9a41d7dda3d6e71cb0e835c5cd1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4f5f9a41d7dda3d6e71cb0e835c5cd1d");
        } else {
            this.g = a();
            this.h = b();
            this.i = f();
            this.j = c();
            this.k = d();
            this.o = e();
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.widget.popup.a.b;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "81ad75b78660a393304a36272cab5725", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "81ad75b78660a393304a36272cab5725");
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams = layoutParams == null ? new FrameLayout.LayoutParams(-1, -2) : layoutParams;
                if (this.i == a.b.BOTTOM_UP) {
                    layoutParams.gravity = 80;
                } else {
                    layoutParams.gravity = 48;
                }
                if (this.h >= this.g) {
                    layoutParams.height = this.h;
                } else {
                    layoutParams.topMargin = g.b(b.a) - this.g;
                    this.f.setMinimumHeight(this.h);
                }
                this.f.setLayoutParams(layoutParams);
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.platform.widget.popup.a.b;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d0659a083d189c61d059bcb10cf59aa5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d0659a083d189c61d059bcb10cf59aa5");
            } else {
                this.e.setBackgroundColor(this.k);
            }
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.platform.widget.popup.a.b;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "aba2dbbdd8c9563f37a0d5dd6566ed87", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "aba2dbbdd8c9563f37a0d5dd6566ed87");
            } else {
                this.f.b(this.j, this.j, 0, 0);
            }
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.platform.widget.popup.a.b;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "c6fb843a6acfe2c1d68397aa3adcde79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "c6fb843a6acfe2c1d68397aa3adcde79");
            } else {
                this.l = g();
                this.m = h();
                this.n = i();
            }
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.platform.widget.popup.a.b;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "a87fa82b304bd2e6a53ad418a6b5abff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "a87fa82b304bd2e6a53ad418a6b5abff");
            } else if (this.e != null) {
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.popup.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr10 = {view};
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "2ca813d62416eac7642b9c2b68b075b0", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "2ca813d62416eac7642b9c2b68b075b0");
                        } else {
                            this.l();
                        }
                    }
                });
            }
        }
        this.c = fragmentActivity.getSupportFragmentManager();
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final int a() {
        return this.r.a;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final int b() {
        return this.r.b;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final int c() {
        return this.r.c;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final int d() {
        return this.r.d;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final a.b f() {
        return a.b.BOTTOM_UP;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final String g() {
        return this.r.e;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final String h() {
        return this.r.f;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final String i() {
        return this.r.g;
    }

    @Override // com.sankuai.waimai.platform.widget.popup.a
    public final Bundle k() {
        return this.r.h;
    }
}
