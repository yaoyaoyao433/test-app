package com.sankuai.waimai.bussiness.order.confirm.request.update;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.platform.utils.m;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b.a {
    public static ChangeQuickRedirect a;
    public boolean b;
    protected View c;
    protected Activity d;
    protected Dialog e;
    public com.sankuai.waimai.platform.domain.core.response.a f;
    public b g;
    public boolean h;
    protected boolean i;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.request.update.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0906a {
        boolean a(OrderResponse orderResponse);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void a(int i);

        void a(@NonNull OrderResponse orderResponse);

        void a(OrderResponse orderResponse, double d);

        void a(boolean z);

        void b();

        void b(@NonNull OrderResponse orderResponse);

        void b(boolean z);

        void c();

        void d();
    }

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7decff6aabeb4390e9e353a36b76c6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7decff6aabeb4390e9e353a36b76c6f");
            return;
        }
        this.h = false;
        this.i = false;
        this.d = activity;
    }

    public final a a(View view) {
        this.c = view;
        return this;
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbabb9e22248492f909323f01de350dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbabb9e22248492f909323f01de350dd")).booleanValue();
        }
        if (this.d.isFinishing()) {
            return false;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.e);
        this.e = null;
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.b.a
    public final boolean a(@NonNull com.sankuai.waimai.bussiness.order.confirm.request.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79bcec07117599d166e333771c79955e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79bcec07117599d166e333771c79955e")).booleanValue();
        }
        a();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.b.a
    public final void b(@NonNull com.sankuai.waimai.bussiness.order.confirm.request.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cda9421520a3af16a0fbd18e93bae4c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cda9421520a3af16a0fbd18e93bae4c7");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5c38bb5be6999f94efd744f75c237ff", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5c38bb5be6999f94efd744f75c237ff")).booleanValue();
            return;
        }
        if (this.e != null) {
            a();
        }
        this.e = com.sankuai.waimai.platform.widget.dialog.a.a(this.d);
        if (this.e != null) {
            this.e.isShowing();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.b.a
    public final void a(@NonNull com.sankuai.waimai.bussiness.order.confirm.request.b bVar, Throwable th) {
        Object[] objArr = {bVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "836c0efb53b0664576cbc444b151b2bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "836c0efb53b0664576cbc444b151b2bc");
            return;
        }
        if (this.b) {
            com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
        }
        if (this.g != null) {
            this.g.c();
        }
        if (this.g != null) {
            this.g.a(false);
        }
        if (this.d.isFinishing()) {
            return;
        }
        a();
        if (this.g != null) {
            this.g.a();
        }
        com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(this.d, th);
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.b.a
    public final void a(@NonNull com.sankuai.waimai.bussiness.order.confirm.request.b bVar, OrderResponse orderResponse) {
        boolean z;
        boolean z2;
        com.sankuai.waimai.bussiness.order.confirm.request.update.b bVar2;
        Object[] objArr = {bVar, orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1442de036eb0edafb1618bedf22f3850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1442de036eb0edafb1618bedf22f3850");
            return;
        }
        a();
        String b2 = bVar.b();
        Object[] objArr2 = {orderResponse, b2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86042709d1ab97a3b8e0819959e9fc30", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86042709d1ab97a3b8e0819959e9fc30")).booleanValue();
        } else {
            if (this.b) {
                com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
            }
            if (!this.d.isFinishing()) {
                if (orderResponse == null) {
                    m.a(this.d, this.d.getResources().getString(R.string.wm_order_base_refresh_success_error), (Throwable) new com.sankuai.waimai.platform.widget.emptylayout.a("B_-2", b2));
                } else {
                    if (orderResponse.e != 0 && this.g != null) {
                        this.g.c();
                    }
                    if (this.g != null) {
                        this.g.a(false);
                    }
                    Object[] objArr3 = {orderResponse, b2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6eee9ea39929764c14d7fa1ed78133fe", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6eee9ea39929764c14d7fa1ed78133fe")).booleanValue();
                    } else if (this.f == null || !this.f.a(orderResponse.e, orderResponse.f, orderResponse)) {
                        z = false;
                    } else {
                        Activity activity = this.d;
                        String string = !TextUtils.isEmpty(orderResponse.f) ? orderResponse.f : this.d.getString(R.string.wm_order_base_server_error);
                        m.a(activity, string, (Throwable) new com.sankuai.waimai.platform.widget.emptylayout.a("B_" + orderResponse.e, b2));
                        final View view = this.c;
                        if (view != null) {
                            view.setEnabled(false);
                            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.a.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ad6dc235ef66b034e855758dd9cf24ed", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ad6dc235ef66b034e855758dd9cf24ed");
                                    } else {
                                        view.setEnabled(true);
                                    }
                                }
                            }, this.f.d);
                        }
                        z = true;
                    }
                    if (!z) {
                        z2 = false;
                    }
                }
            }
            z2 = true;
        }
        if (z2) {
            return;
        }
        String b3 = bVar.b();
        Object[] objArr4 = {orderResponse, b3};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d1fb83cb4aa62a378b76f534d2d61011", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d1fb83cb4aa62a378b76f534d2d61011");
        } else if (orderResponse.e == 0) {
            if (this.g != null) {
                this.g.a(orderResponse);
            }
        } else {
            if (this.g != null) {
                this.g.b(orderResponse);
            }
            Object[] objArr5 = {orderResponse};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ed4b4ac9fdab1bc63dd3d58d618f9af2", RobustBitConfig.DEFAULT_VALUE)) {
                bVar2 = (com.sankuai.waimai.bussiness.order.confirm.request.update.b) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ed4b4ac9fdab1bc63dd3d58d618f9af2");
            } else {
                b.C0904b c0904b = orderResponse.c;
                com.sankuai.waimai.bussiness.order.confirm.request.update.b bVar3 = null;
                if (c0904b != null) {
                    switch (c0904b.c) {
                        case 0:
                        case 2:
                            c0904b.e = this.h;
                            bVar3 = new c(this.d, c0904b, this.g);
                            break;
                        case 1:
                        case 5:
                            bVar3 = new d(this.d, c0904b, this.g);
                            break;
                        case 4:
                            bVar3 = new e(this.d, c0904b, this.g);
                            break;
                    }
                }
                bVar2 = bVar3;
            }
            if (bVar2 != null && bVar2.a(orderResponse)) {
                return;
            }
            Object[] objArr6 = {orderResponse, b3};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "51d5d40c6ba2976f2f613b5a8c19711f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "51d5d40c6ba2976f2f613b5a8c19711f");
                return;
            }
            Activity activity2 = this.d;
            String string2 = TextUtils.isEmpty(orderResponse.f) ? this.d.getString(R.string.takeout_loading_fail_try_afterwhile) : orderResponse.f;
            m.a(activity2, string2, (Throwable) new com.sankuai.waimai.platform.widget.emptylayout.a("B_" + orderResponse.e, b3));
        }
    }
}
