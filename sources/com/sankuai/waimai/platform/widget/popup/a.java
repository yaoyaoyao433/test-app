package com.sankuai.waimai.platform.widget.popup;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.ColorInt;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.RoundedFrameLayout;
import com.sankuai.waimai.platform.widget.popup.MRNPopupFragment;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect b;
    protected FragmentManager c;
    public InterfaceC1097a d;
    public View e;
    protected RoundedFrameLayout f;
    protected int g;
    protected int h;
    protected b i;
    protected int j;
    protected int k;
    protected String l;
    protected String m;
    protected String n;
    @ColorInt
    protected int o;
    public Handler p;
    public ViewGroup q;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.popup.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1097a {
        void a();
    }

    public abstract int a();

    public abstract int b();

    public int c() {
        return 0;
    }

    public int d() {
        return -870177754;
    }

    @ColorInt
    public int e() {
        return 0;
    }

    public abstract b f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public Bundle k() {
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum b {
        TOP_DOWN,
        BOTTOM_UP;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16573a67e4ca9332b3392d8e7d7bcfdb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16573a67e4ca9332b3392d8e7d7bcfdb");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fac5303471b650aa07a492d74a447570", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fac5303471b650aa07a492d74a447570") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddae9698dcc4db204b80ca10b3aa92ee", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddae9698dcc4db204b80ca10b3aa92ee") : (b[]) values().clone();
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf0baaaecb3c3722bd482dc823872ff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf0baaaecb3c3722bd482dc823872ff8");
        } else {
            o();
        }
    }

    public void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2050829b15635736c2e08ca36b9394ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2050829b15635736c2e08ca36b9394ff");
            return;
        }
        if (this.e.getParent() != null) {
            ((ViewGroup) this.e.getParent()).removeView(this.e);
        }
        if (this.q != null) {
            this.q.setVisibility(8);
            this.q = null;
        }
    }

    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62dd05ad7933a786ba2ebe433159dcaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62dd05ad7933a786ba2ebe433159dcaa");
        } else if (this.c == null) {
        } else {
            FragmentTransaction beginTransaction = this.c.beginTransaction();
            Bundle k = k();
            k.putInt("arg_background_color", this.o);
            MRNPopupFragment a = MRNPopupFragment.a(this.l, this.m, this.n, k);
            a.b = new MRNPopupFragment.a() { // from class: com.sankuai.waimai.platform.widget.popup.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.popup.MRNPopupFragment.a
                public final void a(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56720a32c75a971b895ee779b3116c23", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56720a32c75a971b895ee779b3116c23");
                    } else if (z) {
                    } else {
                        a.this.m();
                        if (a.this.d != null) {
                            a.this.d.a();
                        }
                    }
                }
            };
            try {
                if (this.i == b.BOTTOM_UP) {
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_bottom_in, R.anim.wm_common_dialog_bottom_out);
                } else {
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                }
                beginTransaction.replace(R.id.mrn_popup_fragment_container, a, j());
                beginTransaction.commitAllowingStateLoss();
                this.c.executePendingTransactions();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c793af062529054fd2eb5dd0c6e43747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c793af062529054fd2eb5dd0c6e43747");
        } else if (this.c == null) {
        } else {
            try {
                Fragment findFragmentByTag = this.c.findFragmentByTag(j());
                FragmentTransaction beginTransaction = this.c.beginTransaction();
                if (this.i == b.BOTTOM_UP) {
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_bottom_in, R.anim.wm_common_dialog_bottom_out);
                } else {
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                }
                beginTransaction.remove(findFragmentByTag).commitAllowingStateLoss();
                this.c.executePendingTransactions();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }
}
