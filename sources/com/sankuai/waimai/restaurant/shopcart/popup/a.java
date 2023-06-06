package com.sankuai.waimai.restaurant.shopcart.popup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.RoundedFrameLayout;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    public FragmentManager b;
    public View c;
    public RoundedFrameLayout d;
    public int e;
    public int f;
    public int[] g;
    public c h;
    public int i;
    public int j;
    public String k;
    public String l;
    public String m;
    public ViewGroup n;
    public Animation o;
    public Animation p;
    public boolean q;

    public abstract int e();

    public abstract int f();

    public abstract int[] g();

    public abstract c h();

    public abstract Bundle i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract List<i> n();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a480c8d1d47cbfda4984300175f91ce9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a480c8d1d47cbfda4984300175f91ce9");
        } else {
            this.q = false;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277a89b7d94c98104e5f9ddc93c809c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277a89b7d94c98104e5f9ddc93c809c7");
        } else {
            b();
        }
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9a30d6d4aaa1f453b8cca4123503e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9a30d6d4aaa1f453b8cca4123503e5");
            return;
        }
        a(8);
        c();
        o();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0116a08b8a7624951d94fbc8f1e91c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0116a08b8a7624951d94fbc8f1e91c6c");
            return;
        }
        if (this.c.getParent() != null) {
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
        if (this.n != null) {
            this.n.setVisibility(8);
            this.n = null;
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65e538a611d974123ecaf2354aeaf169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65e538a611d974123ecaf2354aeaf169");
        } else if (this.b == null) {
        } else {
            try {
                Fragment findFragmentByTag = this.b.findFragmentByTag(m());
                if (findFragmentByTag != null) {
                    this.b.beginTransaction().remove(findFragmentByTag).commitNowAllowingStateLoss();
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc537fcb96f4cfa0d38eb685f5d3579b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc537fcb96f4cfa0d38eb685f5d3579b");
            return;
        }
        if (this.n != null) {
            this.n.setVisibility(i);
        }
        if (this.c != null) {
            this.c.setVisibility(i);
        }
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f9093183f3954fbe6b2d69fbf497490", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f9093183f3954fbe6b2d69fbf497490")).booleanValue() : this.n != null ? this.n.getVisibility() == 0 && this.c != null && this.c.getVisibility() == 0 : this.c != null && this.c.getVisibility() == 0;
    }
}
