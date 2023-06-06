package com.sankuai.waimai.business.page.common.list.listfloat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.view.listfloat.e;
import com.sankuai.waimai.business.page.home.model.MvpCouponAPI;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Activity b;
    public ViewGroup c;
    ImageView d;
    public e e;
    MvpCouponAPI.a f;
    boolean g;
    public InterfaceC0762a h;
    @SuppressLint({"HandlerLeak"})
    Handler i;
    private boolean j;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.common.list.listfloat.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0762a {
        void a(View view, @NonNull MvpCouponAPI.a aVar);

        void a(@NonNull MvpCouponAPI.a aVar);

        void b(@NonNull MvpCouponAPI.a aVar);

        boolean c(@NonNull MvpCouponAPI.a aVar);

        @DrawableRes
        int d(MvpCouponAPI.a aVar);
    }

    public a(Activity activity, View view) {
        Object[] objArr = {activity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10ecdd78f46d02a2427cd6a7638281a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10ecdd78f46d02a2427cd6a7638281a");
            return;
        }
        this.g = true;
        this.i = new Handler() { // from class: com.sankuai.waimai.business.page.common.list.listfloat.a.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca9d8608bf4fe146a13f1213fd354733", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca9d8608bf4fe146a13f1213fd354733");
                } else if (message.what == 0) {
                    a.this.g = true;
                }
            }
        };
        this.b = activity;
        this.c = (ViewGroup) view.findViewById(R.id.layout_floating_icon);
        this.e = new e(this.c, activity);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.list.listfloat.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e302eaac7c9d0eb3a222402947e6cca9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e302eaac7c9d0eb3a222402947e6cca9");
                } else if (a.this.g) {
                    a.this.g = false;
                    if (a.this.h != null && a.this.f != null) {
                        a.this.h.a(a.this.c, a.this.f);
                        a.this.h.a(a.this.f);
                    }
                    a.this.i.sendEmptyMessageDelayed(0, 200L);
                }
            }
        });
        this.d = (ImageView) this.c.findViewById(R.id.btn_floating_icon);
        this.j = true;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e568ffa2af42a80130eab1cd4b59bd4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e568ffa2af42a80130eab1cd4b59bd4b");
            return;
        }
        this.j = z;
        a();
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5392a18000b44dc2400f25d493d6490e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5392a18000b44dc2400f25d493d6490e");
        } else if (!this.j || this.c.getVisibility() != 0 || this.h == null || this.f == null) {
        } else {
            this.h.b(this.f);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f061d701bb46a1d10d9c7195802f1356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f061d701bb46a1d10d9c7195802f1356");
        } else if (this.c != null) {
            this.c.setVisibility(z ? 0 : 8);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2e4729941b10ef51267bab613d92556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2e4729941b10ef51267bab613d92556");
        } else if (this.c.getVisibility() != 0) {
        } else {
            this.e.b();
        }
    }
}
