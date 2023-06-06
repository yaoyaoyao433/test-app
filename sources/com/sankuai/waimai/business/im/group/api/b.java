package com.sankuai.waimai.business.im.group.api;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.im.api.WaimaiIMService;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.utils.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends h {
    public static ChangeQuickRedirect a;
    Dialog b;
    private RooAlertDialog c;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cff25b9e25b51cfeda445e25b0b21a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cff25b9e25b51cfeda445e25b0b21a");
        } else {
            this.b = null;
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull final j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c0f1df7567d2aa40ebafe5c79edf90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c0f1df7567d2aa40ebafe5c79edf90");
            return;
        }
        Object[] objArr2 = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "930a1a2e685a6454ac1418452ff8ff0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "930a1a2e685a6454ac1418452ff8ff0c");
        } else if (this.c == null || !this.c.isShowing()) {
            this.c = new RooAlertDialog.a(new ContextThemeWrapper(jVar.c, 2131558962)).a(R.string.wm_im_refuse_contact_title).b(R.string.wm_im_refuse_contact_message).a(false).b(IPaymentManager.NO_ACTION, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.api.b.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "349cbd4659930064b1eaa37088efc7eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "349cbd4659930064b1eaa37088efc7eb");
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            }).a("确认", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.api.b.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2fd9926ef84cce2fafadd799008f804f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2fd9926ef84cce2fafadd799008f804f");
                        return;
                    }
                    dialogInterface.dismiss();
                    final b bVar = b.this;
                    j jVar2 = jVar;
                    Object[] objArr4 = {jVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "ba85eca652889899561ea561e5aadae7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "ba85eca652889899561ea561e5aadae7");
                        return;
                    }
                    Uri uri = jVar2.d;
                    String queryParameter = uri.getQueryParameter("refuse_type");
                    String queryParameter2 = uri.getQueryParameter("commentid");
                    String queryParameter3 = uri.getQueryParameter("groupid");
                    String queryParameter4 = uri.getQueryParameter("poiid");
                    String queryParameter5 = uri.getQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR);
                    final Activity activity = (Activity) jVar2.c;
                    int a2 = r.a(queryParameter, 1);
                    long a3 = r.a(queryParameter2, 0L);
                    long a4 = r.a(queryParameter3, 0L);
                    long a5 = r.a(queryParameter4, 0L);
                    Object[] objArr5 = {activity};
                    ChangeQuickRedirect changeQuickRedirect5 = b.a;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "98f9afaafde7018db5e6541349698455", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "98f9afaafde7018db5e6541349698455");
                    } else if (!activity.isFinishing()) {
                        d.a(bVar.b);
                        bVar.b = d.a(activity);
                    }
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).refuseContact(a2, a3, a5, queryParameter5, a4), new com.sankuai.waimai.platform.capacity.network.rxsupport.b<BaseResponse>() { // from class: com.sankuai.waimai.business.im.group.api.b.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                        public final /* synthetic */ void a(BaseResponse baseResponse) {
                            BaseResponse baseResponse2 = baseResponse;
                            Object[] objArr6 = {baseResponse2};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cb6bd82169842143d818e6271eb62ac3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cb6bd82169842143d818e6271eb62ac3");
                                return;
                            }
                            b.this.a(activity);
                            if (baseResponse2 == null) {
                                ae.a(activity, "拒绝失败，请稍后重试");
                            } else if (baseResponse2.code != 0) {
                                ae.a(activity, baseResponse2.msg);
                            }
                        }

                        @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                        public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                            Object[] objArr6 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d81b56d0b121bdc4b637784b3f03f4bd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d81b56d0b121bdc4b637784b3f03f4bd");
                                return;
                            }
                            b.this.a(activity);
                            String str = "拒绝失败，请稍后重试";
                            if (aVar != null && !TextUtils.isEmpty(aVar.getMessage())) {
                                str = aVar.a();
                            }
                            ae.a(activity, str);
                        }
                    }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
                }
            }).b();
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abbd0bbb7739a78865f2201e25b1bdf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abbd0bbb7739a78865f2201e25b1bdf6");
        } else if (activity.isFinishing()) {
        } else {
            d.a(this.b);
            this.b = null;
        }
    }
}
