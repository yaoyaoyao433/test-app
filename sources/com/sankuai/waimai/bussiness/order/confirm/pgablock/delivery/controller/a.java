package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller;

import android.app.Activity;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.utils.d;
import com.sankuai.waimai.bussiness.order.base.utils.e;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.manager.location.geo.UserAddressAPI;
import com.sankuai.waimai.platform.domain.manager.location.model.SaveCategoryResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Activity b;
    InterfaceC0896a c;
    private String d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0896a {
        void a(String str, int i);
    }

    public static /* synthetic */ void a(a aVar, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4ad17457debd20ac0a7cc5655e2a98a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4ad17457debd20ac0a7cc5655e2a98a1");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            JudasManualManager.a(str).a("c_ykhs39e").a(aVar.b).a();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        JudasManualManager.b(str2).a("c_ykhs39e").a(aVar.b).a();
    }

    public a(Activity activity, String str, InterfaceC0896a interfaceC0896a) {
        Object[] objArr = {activity, str, interfaceC0896a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "547597c04f60c584189c7f3597d053bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "547597c04f60c584189c7f3597d053bd");
            return;
        }
        this.b = activity;
        this.d = str;
        this.c = interfaceC0896a;
    }

    public final void a(final long j, final int i, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad6a185627e732dbe8499168ffb5fe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad6a185627e732dbe8499168ffb5fe7");
            return;
        }
        ((BaseActivity) this.b).u();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((UserAddressAPI) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) UserAddressAPI.class)).saveCategory(j, i, i2), new b.AbstractC1042b<SaveCategoryResponse>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                SaveCategoryResponse saveCategoryResponse = (SaveCategoryResponse) obj;
                Object[] objArr2 = {saveCategoryResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfa69c7dbce5b1bceffd11501abde15c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfa69c7dbce5b1bceffd11501abde15c");
                } else if (a.this.b.isFinishing()) {
                } else {
                    ((BaseActivity) a.this.b).v();
                    if (saveCategoryResponse != null) {
                        if (saveCategoryResponse.b == 2) {
                            e.a(a.this.b, R.string.confirm, R.string.wm_order_confirm_address_dialog_btn_cancel, saveCategoryResponse, new d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.a.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.bussiness.order.base.utils.d
                                public final void a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31fa22d9fb394e1f97c4fae244a35f43", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31fa22d9fb394e1f97c4fae244a35f43");
                                        return;
                                    }
                                    a.a(a.this, "b_27Z6u", (String) null);
                                    a.this.a(j, i, 1);
                                }

                                @Override // com.sankuai.waimai.bussiness.order.base.utils.d
                                public final void cancel() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "87d009bfc4ad5b3fcdb945b3b69ba343", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "87d009bfc4ad5b3fcdb945b3b69ba343");
                                    } else {
                                        a.a(a.this, "b_8k9S9", (String) null);
                                    }
                                }

                                @Override // com.sankuai.waimai.bussiness.order.base.utils.d
                                public final void b() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "13224bf62d6996de30b22732c1b25933", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "13224bf62d6996de30b22732c1b25933");
                                    } else {
                                        a.a(a.this, (String) null, "b_BHMKt");
                                    }
                                }
                            });
                        }
                        if (TextUtils.isEmpty(saveCategoryResponse.d) || a.this.c == null) {
                            return;
                        }
                        a.this.c.a(saveCategoryResponse.d, i);
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c0e3f3d6d582ab075199b361e13f9c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c0e3f3d6d582ab075199b361e13f9c1");
                    return;
                }
                ae.a(a.this.b, a.this.b.getResources().getString(R.string.wm_order_base_net_error_toast));
                ((BaseActivity) a.this.b).v();
            }
        }, this.d);
    }
}
