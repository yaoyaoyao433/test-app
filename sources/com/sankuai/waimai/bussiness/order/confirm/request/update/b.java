package com.sankuai.waimai.bussiness.order.confirm.request.update;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.GetVerifyCodeResponse;
import com.sankuai.waimai.bussiness.order.confirm.model.PreviewSubmitModel;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.confirm.request.update.a;
import com.sankuai.waimai.bussiness.order.confirm.submit.g;
import com.sankuai.waimai.bussiness.order.confirm.submit.h;
import com.sankuai.waimai.bussiness.order.confirm.submit.i;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b implements a.InterfaceC0906a {
    public static ChangeQuickRedirect a;
    protected Activity b;
    protected boolean c;
    protected long d;
    protected String e;
    protected String f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected List<WmOrderedFood> j;
    protected int k;
    protected a.b l;
    protected boolean m;

    public boolean c(OrderResponse orderResponse) {
        return false;
    }

    public boolean d(OrderResponse orderResponse) {
        return false;
    }

    public boolean h(OrderResponse orderResponse) {
        return false;
    }

    public b(Activity activity, @NonNull b.C0904b c0904b, a.b bVar) {
        Object[] objArr = {activity, c0904b, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb38419a76c53f9fd2b94e469c28b57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb38419a76c53f9fd2b94e469c28b57");
            return;
        }
        this.b = activity;
        this.c = c0904b.r;
        this.d = c0904b.a;
        this.e = c0904b.b;
        this.f = c0904b.s;
        this.g = c0904b.u;
        this.h = c0904b.x;
        this.i = c0904b.f;
        this.j = c0904b.v;
        this.k = c0904b.g;
        this.l = bVar;
        this.m = c0904b.e;
    }

    public final void a(Activity activity, OrderResponse orderResponse, String str) {
        Object[] objArr = {activity, orderResponse, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f4bf1aad96fe45374063cb4c8f8b1e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f4bf1aad96fe45374063cb4c8f8b1e9");
            return;
        }
        if (!TextUtils.isEmpty(orderResponse.f)) {
            str = orderResponse.f;
        }
        com.sankuai.waimai.business.order.submit.b.b(activity, str);
    }

    public final boolean b(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b091608671f9a94d377f72ecfefa68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b091608671f9a94d377f72ecfefa68")).booleanValue();
        }
        if (orderResponse.e != 1) {
            return false;
        }
        a(this.b, orderResponse, this.b.getString(R.string.wm_order_base_server_error));
        this.b.finish();
        return true;
    }

    public boolean e(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8ba66ed4e62afc3152d53d7635bccf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8ba66ed4e62afc3152d53d7635bccf")).booleanValue();
        }
        if (orderResponse.e != 5) {
            return false;
        }
        if (orderResponse != null) {
            GetVerifyCodeResponse getVerifyCodeResponse = orderResponse.j;
            if (getVerifyCodeResponse != null) {
                if (this.c) {
                    com.sankuai.waimai.business.order.submit.b.a(this.b, getVerifyCodeResponse, this.d, this.e, this.k, 0);
                } else if (!TextUtils.isEmpty(getVerifyCodeResponse.requestCode)) {
                    com.sankuai.waimai.business.order.submit.b.a(this.b, getVerifyCodeResponse, this.d, this.e, this.k, 0);
                } else {
                    com.sankuai.waimai.business.order.submit.b.b(this.b, this.b.getString(R.string.wm_order_base_upload_failed_retry));
                }
            } else {
                com.sankuai.waimai.business.order.submit.b.b(this.b, this.b.getString(R.string.wm_order_base_upload_failed_retry));
            }
        } else {
            com.sankuai.waimai.business.order.submit.b.b(this.b, this.b.getString(R.string.wm_order_base_upload_failed_retry));
        }
        return true;
    }

    public final boolean f(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca67a60614b6a5f53217719caafe456a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca67a60614b6a5f53217719caafe456a")).booleanValue();
        }
        if (orderResponse.e != 7) {
            return false;
        }
        a(this.b, orderResponse, this.b.getString(R.string.wm_order_base_arrival_time_is_null));
        return true;
    }

    public boolean g(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed6d77b91487df3026fd222604144d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed6d77b91487df3026fd222604144d5")).booleanValue();
        }
        if (orderResponse.e != 8) {
            return false;
        }
        final Activity activity = this.b;
        String str = orderResponse.f;
        Object[] objArr2 = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.order.submit.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "848155957f6f6dc76976449df3ee0152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "848155957f6f6dc76976449df3ee0152");
        } else {
            RooAlertDialog.a a2 = new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558627)).a(R.string.wm_order_base_remind);
            if (TextUtils.isEmpty(str)) {
                str = activity.getString(R.string.wm_order_base_order_not_reach_min_price);
            }
            a2.b(str).a(R.string.wm_order_submit_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.order.submit.b.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "917ce9d56ff04da7c30d1270dafc0a9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "917ce9d56ff04da7c30d1270dafc0a9b");
                    } else {
                        activity.finish();
                    }
                }
            }).b(R.string.wm_order_base_that_is_ok, (DialogInterface.OnClickListener) null).b();
        }
        return true;
    }

    public boolean i(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca342bf2db612ad9fa9f5281efc35df3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca342bf2db612ad9fa9f5281efc35df3")).booleanValue();
        }
        if (orderResponse.e != 10) {
            return false;
        }
        SubmitOrderManager.getInstance().showLogin(this.b, this.d, this.e, a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER);
        return true;
    }

    public boolean j(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69a9b7838c43991aed6b61dffd5adb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69a9b7838c43991aed6b61dffd5adb3")).booleanValue();
        }
        if (orderResponse.e != 14) {
            return false;
        }
        SubmitOrderManager.getInstance().showBindPhone(this.b, this.d, this.e, a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER);
        return true;
    }

    public boolean k(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d8d2a66073d321b6327b456c05967c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d8d2a66073d321b6327b456c05967c5")).booleanValue();
        }
        if (orderResponse.e != 17) {
            return false;
        }
        a(this.b, orderResponse, this.b.getString(R.string.takeout_loading_fail_try_afterwhile));
        if (this.l != null) {
            this.l.b();
        }
        return true;
    }

    public final boolean l(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b4239895332dda69c15b19a6083a024", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b4239895332dda69c15b19a6083a024")).booleanValue();
        }
        if (orderResponse.e != 19) {
            return false;
        }
        com.sankuai.waimai.business.order.submit.b.a(this.b, orderResponse.f);
        return true;
    }

    public boolean m(OrderResponse orderResponse) {
        PreviewSubmitModel previewSubmitModel;
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329fce252af023bb6e47970fb09f72bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329fce252af023bb6e47970fb09f72bf")).booleanValue();
        }
        if (orderResponse.e != 44) {
            return false;
        }
        Activity activity = this.b;
        a.b bVar = this.l;
        Object[] objArr2 = {activity, orderResponse, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "605dfd6471b1f8aa1e9926710a240dca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "605dfd6471b1f8aa1e9926710a240dca");
        } else if (activity != null && orderResponse != null && !TextUtils.isEmpty(orderResponse.g)) {
            try {
                previewSubmitModel = (PreviewSubmitModel) new Gson().fromJson(orderResponse.g, (Class<Object>) PreviewSubmitModel.class);
            } catch (JsonSyntaxException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                previewSubmitModel = null;
            }
            if (previewSubmitModel != null) {
                RooAlertDialog.a aVar = new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558963));
                aVar.a(previewSubmitModel.title);
                aVar.b(previewSubmitModel.content);
                ArrayList<PreviewSubmitModel.ButtonItem> arrayList = previewSubmitModel.buttonItemArrayList;
                PreviewSubmitModel.ButtonItem buttonItem = (PreviewSubmitModel.ButtonItem) com.sankuai.waimai.foundation.utils.b.a(arrayList, 0);
                PreviewSubmitModel.ButtonItem buttonItem2 = (PreviewSubmitModel.ButtonItem) com.sankuai.waimai.foundation.utils.b.a(arrayList, 1);
                if (buttonItem != null) {
                    aVar.b(buttonItem.text, h.a(buttonItem, bVar));
                }
                if (buttonItem2 != null) {
                    aVar.a(buttonItem2.text, i.a(buttonItem2, bVar));
                }
                aVar.a(false);
                aVar.b();
            }
        }
        return true;
    }
}
