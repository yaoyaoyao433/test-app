package com.sankuai.waimai.bussiness.order.confirm.request.preview;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b.a {
    public static ChangeQuickRedirect a;
    protected View b;
    protected Activity c;
    protected Dialog d;
    public com.sankuai.waimai.platform.domain.core.response.a e;
    public com.sankuai.waimai.platform.domain.manager.order.a f;
    public com.sankuai.waimai.bussiness.order.confirm.extra.a g;
    public com.sankuai.waimai.bussiness.order.transfer.base.c h;
    private boolean i;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.request.preview.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0905a {
        boolean a(OrderResponse orderResponse);
    }

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0f8c78602271d2e5bc3bf37651da1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0f8c78602271d2e5bc3bf37651da1e");
            return;
        }
        this.i = false;
        this.c = activity;
        this.g = new com.sankuai.waimai.bussiness.order.confirm.extra.b();
        if (activity instanceof TransferActivity) {
            this.g.a(activity);
        }
    }

    public final a a(View view) {
        this.b = view;
        return this;
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cbbccb4c84015bb0c3932c067bd4612", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cbbccb4c84015bb0c3932c067bd4612")).booleanValue();
        }
        if (this.c.isFinishing()) {
            return false;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.d);
        this.d = null;
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.b.a
    public final boolean a(@NonNull com.sankuai.waimai.bussiness.order.confirm.request.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ddb001955e33c74d996e5754698674", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ddb001955e33c74d996e5754698674")).booleanValue();
        }
        if (!this.i && this.e != null && this.e.c) {
            a(this.b, this.e.a(), this.e.d);
            return false;
        }
        a();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.b.a
    public final void b(@NonNull com.sankuai.waimai.bussiness.order.confirm.request.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "452d836a5c169b2b57b3f897990d6ebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "452d836a5c169b2b57b3f897990d6ebf");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b976c654b0ebf3e0f1ba5a926e2b7cc", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b976c654b0ebf3e0f1ba5a926e2b7cc")).booleanValue();
            return;
        }
        if (this.d != null) {
            a();
        }
        this.d = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
        if (this.d != null) {
            this.d.isShowing();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.b.a
    public final void a(@NonNull com.sankuai.waimai.bussiness.order.confirm.request.b bVar, Throwable th) {
        Object[] objArr = {bVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1b37e9bcd011d592daffa3722aafee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1b37e9bcd011d592daffa3722aafee");
            return;
        }
        a();
        if (bVar.e.c != 2 && bVar.e.c != 4 && this.b != null) {
            this.b.setEnabled(true);
        }
        com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(this.c, th);
        this.g.c();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.b.a
    public final void a(@NonNull com.sankuai.waimai.bussiness.order.confirm.request.b bVar, final OrderResponse orderResponse) {
        b bVar2;
        Object[] objArr = {bVar, orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34efb0cef3d1f8a7b636d07191ad93c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34efb0cef3d1f8a7b636d07191ad93c9");
            return;
        }
        a();
        b bVar3 = null;
        if (this.h != null) {
            this.h.a(orderResponse.e, null, orderResponse.f);
        }
        if (bVar.e.c == 2) {
            if (orderResponse == null) {
                ae.a(this.c, (int) R.string.wm_order_refresh_success_error);
                this.g.c();
                return;
            } else if (orderResponse.e == 19) {
                new CustomDialog.a(this.c).c(R.string.wm_order_base_remind).b(!TextUtils.isEmpty(orderResponse.f) ? orderResponse.f : this.c.getString(R.string.wm_loading_fail_try_afterwhile)).a(R.string.wm_dialog_common_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa2c4463b5652273d3c318ce80a7adb6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa2c4463b5652273d3c318ce80a7adb6");
                            return;
                        }
                        if (!TextUtils.isEmpty(orderResponse.m)) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("is_restrict_restaurant", true);
                            bundle.putBoolean("NO_OBTAIN_MULTI_PERSON_DATA", true);
                            com.sankuai.waimai.foundation.router.a.a(a.this.c, orderResponse.m, bundle);
                        }
                        dialogInterface.dismiss();
                    }
                }).b();
                this.g.c();
                return;
            } else if (orderResponse.e == 0) {
                com.sankuai.waimai.business.order.submit.b.a(this.c, orderResponse, bVar.e.i, true, bVar.e.n, bVar.e.a, bVar.e.b, bVar.e.f);
                com.sankuai.waimai.platform.utils.sharedpreference.a.n();
                this.g.c();
                return;
            }
        }
        if (a(orderResponse)) {
            this.g.c();
            return;
        }
        Object[] objArr2 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4667fbcc9529249f120bb3b08578feff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4667fbcc9529249f120bb3b08578feff");
        } else {
            Object[] objArr3 = {orderResponse};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4010c8b2ff01c69ce0206d976c961f76", RobustBitConfig.DEFAULT_VALUE)) {
                bVar2 = (b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4010c8b2ff01c69ce0206d976c961f76");
            } else {
                b.C0904b c0904b = orderResponse.c;
                if (c0904b != null) {
                    switch (c0904b.c) {
                        case 0:
                        case 2:
                            bVar3 = new c(this.c, c0904b, this.f, this.b);
                            break;
                        case 1:
                        case 5:
                            bVar3 = new e(this.c, c0904b, this.f);
                            break;
                        case 4:
                            bVar3 = new f(this.c, c0904b, this.f, this.g);
                            break;
                    }
                }
                bVar2 = bVar3;
            }
            if (!(bVar2 != null && bVar2.a(orderResponse))) {
                Object[] objArr4 = {orderResponse};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "044fbc3c3514a6f929d182e936754836", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "044fbc3c3514a6f929d182e936754836");
                } else if (!TextUtils.isEmpty(orderResponse.f)) {
                    ae.a(this.c, orderResponse.f);
                } else {
                    ae.a(this.c, (int) R.string.wm_loading_fail_try_afterwhile);
                }
                com.sankuai.waimai.bussiness.order.base.log.b a2 = com.sankuai.waimai.bussiness.order.base.log.b.a();
                a2.a("sg_order_preview_response_error_code", "response code=" + orderResponse.e + ";msg=" + orderResponse.f, "");
            } else {
                com.sankuai.waimai.platform.utils.sharedpreference.a.n();
            }
        }
        this.g.b();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.sankuai.waimai.platform.capacity.network.errorhanding.e, java.lang.Exception] */
    private boolean a(@Nullable OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f24dd4aefbab248d19ba53cd58424497", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f24dd4aefbab248d19ba53cd58424497")).booleanValue();
        }
        if (this.b != null) {
            this.b.setEnabled(true);
        }
        if (orderResponse == null) {
            ae.a(this.c, (int) R.string.wm_order_refresh_success_error);
            this.b = null;
            com.sankuai.waimai.bussiness.order.base.log.b.a().a("sg_order_preview_error", "response = null", "");
            return true;
        } else if (this.e != null && this.e.a(orderResponse.e, orderResponse.f, orderResponse)) {
            a(this.b, orderResponse.f, this.e.d);
            com.sankuai.waimai.bussiness.order.base.log.b a2 = com.sankuai.waimai.bussiness.order.base.log.b.a();
            a2.a("sg_order_preview_error", "isForbidReq=true; code=" + orderResponse.e + "; msg=" + orderResponse.f, orderResponse.c);
            return true;
        } else {
            try {
                new com.sankuai.waimai.platform.capacity.network.errorhanding.d().a(orderResponse.e, orderResponse.f);
                return false;
            } catch (com.sankuai.waimai.platform.capacity.network.errorhanding.e e) {
                com.sankuai.waimai.platform.capacity.network.errorhanding.f.a((Exception) e, this.c);
                this.b = null;
                com.sankuai.waimai.bussiness.order.base.log.b a3 = com.sankuai.waimai.bussiness.order.base.log.b.a();
                a3.a("sg_order_preview_error", "handleUserLockedError; code=" + orderResponse.e + "; msg=" + orderResponse.f, e.getMessage());
                return true;
            }
        }
    }

    private void a(@Nullable final View view, @Nullable String str, int i) {
        Object[] objArr = {view, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f4d231a53bb09e3cd32d3c18cee0d34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f4d231a53bb09e3cd32d3c18cee0d34");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ae.a(this.c, str);
        } else {
            ae.a(this.c, (int) R.string.wm_order_base_server_error);
        }
        if (view != null) {
            view.setEnabled(false);
            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7f6a2741478bd9c30fae5aa9ed43b96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7f6a2741478bd9c30fae5aa9ed43b96");
                    } else {
                        view.setEnabled(true);
                    }
                }
            }, i);
        }
    }
}
