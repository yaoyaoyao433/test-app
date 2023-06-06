package com.sankuai.waimai.restaurant.shopcart.ui;

import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final w b;
    View c;
    FrameLayout d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a implements Serializable {
        public abstract void a();

        public abstract void b();
    }

    public b(w wVar) {
        Object[] objArr = {wVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e431a472e1a3105d0568c3dbde0001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e431a472e1a3105d0568c3dbde0001");
        } else {
            this.b = wVar;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cfb6b05d541bb84bade3af069e8943c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cfb6b05d541bb84bade3af069e8943c");
        } else if (this.c == null || this.d == null) {
        } else {
            this.c.setVisibility(0);
            this.d.setVisibility(4);
            FragmentTransaction beginTransaction = ((FragmentActivity) this.c.getContext()).getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.wm_discount_detail_mach_pro_container, DiscountDetailMachProFragment.a(new a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.restaurant.shopcart.ui.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd99a7bae8de92e726ae86f04575c632", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd99a7bae8de92e726ae86f04575c632");
                    } else if (b.this.d != null) {
                        b.this.d.setVisibility(0);
                    }
                }

                @Override // com.sankuai.waimai.restaurant.shopcart.ui.b.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90ee5222da0990a7f8f33530a85d560e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90ee5222da0990a7f8f33530a85d560e");
                    } else if (b.this.b != null) {
                        b.this.b.a();
                    }
                }
            }, this.b.b != null ? this.b.b.f() : ""));
            beginTransaction.commitNowAllowingStateLoss();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee7f603f997a9f795b30bb4cf9a4369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee7f603f997a9f795b30bb4cf9a4369");
        } else if (this.c == null) {
        } else {
            this.d.setVisibility(8);
            this.c.setVisibility(8);
            FragmentManager supportFragmentManager = ((FragmentActivity) this.c.getContext()).getSupportFragmentManager();
            Fragment findFragmentById = supportFragmentManager.findFragmentById(R.id.wm_discount_detail_mach_pro_container);
            if (findFragmentById != null) {
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.remove(findFragmentById);
                beginTransaction.commitNowAllowingStateLoss();
            }
        }
    }
}
