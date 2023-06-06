package com.sankuai.waimai.bussiness.order.crossconfirm.request;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements b<CrossOrderResponse> {
    public static ChangeQuickRedirect a;
    public boolean b;
    Activity c;
    public g d;
    protected View e;
    protected Dialog f;
    public String g;
    protected com.sankuai.waimai.platform.domain.core.response.a h;

    public h(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975153b68ce9298ec6259812b0f568b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975153b68ce9298ec6259812b0f568b5");
        } else {
            this.c = activity;
        }
    }

    public final h a(com.sankuai.waimai.platform.domain.core.response.a aVar) {
        this.h = aVar;
        return this;
    }

    public final h a(View view) {
        this.e = view;
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [D, com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult] */
    public final void a(CrossOrderResponse crossOrderResponse) {
        BaseResponse baseResponse;
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String string2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        Object[] objArr = {crossOrderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7348bf4c9cd2c1d0e7157a8472ea7f13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7348bf4c9cd2c1d0e7157a8472ea7f13");
            return;
        }
        Object[] objArr2 = {crossOrderResponse};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6072fcba714bab0372199d790470a3ca", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6072fcba714bab0372199d790470a3ca")).booleanValue();
        } else {
            this.d.a(crossOrderResponse == null ? -1 : crossOrderResponse.a, this.b);
            if (crossOrderResponse == null) {
                com.sankuai.waimai.business.order.submit.b.b(this.c, this.c.getResources().getString(R.string.wm_order_base_refresh_success_error));
            } else {
                Object[] objArr3 = {crossOrderResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "30978531733a250a86c2170482cf3275", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "30978531733a250a86c2170482cf3275")).booleanValue();
                } else {
                    Object[] objArr4 = {crossOrderResponse};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2f40474a373fc7841b2f6a9ce4adee51", RobustBitConfig.DEFAULT_VALUE)) {
                        baseResponse = (BaseResponse) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2f40474a373fc7841b2f6a9ce4adee51");
                    } else {
                        baseResponse = new BaseResponse();
                        baseResponse.code = crossOrderResponse.a;
                        baseResponse.data = crossOrderResponse.c;
                        baseResponse.msg = crossOrderResponse.b;
                    }
                    if (this.h.a(baseResponse)) {
                        com.sankuai.waimai.business.order.submit.b.a(this.c, baseResponse, this.c.getString(R.string.wm_order_base_server_error));
                        this.e.setEnabled(false);
                        this.e = null;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (z2) {
            return;
        }
        Object[] objArr5 = {crossOrderResponse};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8f742f99de57441580fea5c8106fd8f5", RobustBitConfig.DEFAULT_VALUE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8f742f99de57441580fea5c8106fd8f5")).booleanValue();
        } else if (crossOrderResponse.a != 0) {
            z3 = false;
        } else {
            MultiPoiOrderPreviewResult multiPoiOrderPreviewResult = crossOrderResponse.c;
            if (this.d != null) {
                this.d.a((g) multiPoiOrderPreviewResult);
            }
            z3 = true;
        }
        if (!z3 && !c(crossOrderResponse)) {
            Object[] objArr6 = {crossOrderResponse};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c50879dfed2ee79497d9c238ce7a8031", RobustBitConfig.DEFAULT_VALUE)) {
                z4 = ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c50879dfed2ee79497d9c238ce7a8031")).booleanValue();
            } else if (crossOrderResponse.a != 4) {
                z4 = false;
            } else {
                if (!TextUtils.isEmpty(crossOrderResponse.b)) {
                    string = crossOrderResponse.b;
                } else {
                    string = this.c.getString(R.string.wm_order_base_poi_not_open);
                }
                new CustomDialog.a(this.c).c(R.string.wm_order_base_remind).b(string).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.h.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr7 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ac69f6a7bbcbba9522f232d5094dbeda", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ac69f6a7bbcbba9522f232d5094dbeda");
                        } else {
                            h.this.c.finish();
                        }
                    }
                }).b();
                z4 = true;
            }
            if (!z4) {
                Object[] objArr7 = {crossOrderResponse};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "50f68865171b61c23d2561f683929beb", RobustBitConfig.DEFAULT_VALUE)) {
                    z5 = ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "50f68865171b61c23d2561f683929beb")).booleanValue();
                } else if (crossOrderResponse.a != 8) {
                    z5 = false;
                } else {
                    this.d.a(crossOrderResponse.b, crossOrderResponse != null ? crossOrderResponse.i : 0.0d);
                    z5 = true;
                }
                if (!z5) {
                    Object[] objArr8 = {crossOrderResponse};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "cd8fe12be995c1b70add45547e4c3bf7", RobustBitConfig.DEFAULT_VALUE)) {
                        z6 = ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "cd8fe12be995c1b70add45547e4c3bf7")).booleanValue();
                    } else if (crossOrderResponse.a != 10) {
                        z6 = false;
                    } else {
                        if (this.d != null) {
                            this.d.a(true);
                        }
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = a;
                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "58393e46db2d1f57b009e2bb75eee9ce", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "58393e46db2d1f57b009e2bb75eee9ce");
                        } else {
                            com.sankuai.waimai.platform.domain.manager.user.a.a((Context) this.c);
                        }
                        z6 = true;
                    }
                    if (!z6) {
                        Object[] objArr10 = {crossOrderResponse};
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "4c3bab08917510e6e878be6aaa8a25d0", RobustBitConfig.DEFAULT_VALUE)) {
                            z7 = ((Boolean) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "4c3bab08917510e6e878be6aaa8a25d0")).booleanValue();
                        } else if (crossOrderResponse.a != 5) {
                            z7 = false;
                        } else {
                            new CustomDialog.a(this.c).b(crossOrderResponse.b).a(R.string.known, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.h.3
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Object[] objArr11 = {dialogInterface, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect11 = a;
                                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "1dbdfeead22f5421ffc7a48eb075dcbf", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "1dbdfeead22f5421ffc7a48eb075dcbf");
                                    } else {
                                        h.this.c.finish();
                                    }
                                }
                            }).a(false).b();
                            z7 = true;
                        }
                        if (!z7) {
                            Object[] objArr11 = {crossOrderResponse};
                            ChangeQuickRedirect changeQuickRedirect11 = a;
                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "83c3a2340ca30ad9ae3ba32db9964cf6", RobustBitConfig.DEFAULT_VALUE)) {
                                z8 = ((Boolean) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "83c3a2340ca30ad9ae3ba32db9964cf6")).booleanValue();
                            } else if (crossOrderResponse.a != 14) {
                                z8 = false;
                            } else {
                                Activity activity = this.c;
                                Object[] objArr12 = {activity};
                                ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.bussiness.order.base.a.a;
                                if (PatchProxy.isSupport(objArr12, null, changeQuickRedirect12, true, "550933ea638bfe29e0381699fb99e6aa", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr12, null, changeQuickRedirect12, true, "550933ea638bfe29e0381699fb99e6aa");
                                } else {
                                    com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.j);
                                }
                                z8 = true;
                            }
                            if (!z8) {
                                Object[] objArr13 = {crossOrderResponse};
                                ChangeQuickRedirect changeQuickRedirect13 = a;
                                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "64a68c11ec43b259344d9392675ea87b", RobustBitConfig.DEFAULT_VALUE)) {
                                    z9 = ((Boolean) PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "64a68c11ec43b259344d9392675ea87b")).booleanValue();
                                } else if (crossOrderResponse.a != 19) {
                                    z9 = false;
                                } else {
                                    new CustomDialog.a(this.c).c(R.string.wm_order_base_remind).b(crossOrderResponse.b).a(R.string.wm_order_submit_ok, (DialogInterface.OnClickListener) null).b();
                                    z9 = true;
                                }
                                if (!z9) {
                                    Object[] objArr14 = {crossOrderResponse};
                                    ChangeQuickRedirect changeQuickRedirect14 = a;
                                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "0703acab6509a986969793b6e0dc50ea", RobustBitConfig.DEFAULT_VALUE)) {
                                        z10 = ((Boolean) PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "0703acab6509a986969793b6e0dc50ea")).booleanValue();
                                    } else if (crossOrderResponse.a != 17) {
                                        z10 = false;
                                    } else {
                                        d(crossOrderResponse);
                                        if (this.d != null) {
                                            this.d.a();
                                        }
                                        z10 = true;
                                    }
                                    if (!z10) {
                                        Object[] objArr15 = {crossOrderResponse};
                                        ChangeQuickRedirect changeQuickRedirect15 = a;
                                        if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "0adea1324793650439a25cf1600a9f58", RobustBitConfig.DEFAULT_VALUE)) {
                                            z11 = ((Boolean) PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "0adea1324793650439a25cf1600a9f58")).booleanValue();
                                        } else if (crossOrderResponse.a != 39) {
                                            z11 = false;
                                        } else {
                                            if (!TextUtils.isEmpty(crossOrderResponse.b)) {
                                                string2 = crossOrderResponse.b;
                                            } else {
                                                string2 = this.c.getString(R.string.wm_order_base_essential_new_user);
                                            }
                                            new CustomDialog.a(this.c).c(R.string.wm_order_base_remind).b(string2).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.h.4
                                                public static ChangeQuickRedirect a;

                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    Object[] objArr16 = {dialogInterface, Integer.valueOf(i)};
                                                    ChangeQuickRedirect changeQuickRedirect16 = a;
                                                    if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "056820fa80d6d4475e50c3a6267226b7", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "056820fa80d6d4475e50c3a6267226b7");
                                                    } else {
                                                        h.this.c.finish();
                                                    }
                                                }
                                            }).b();
                                            z11 = true;
                                        }
                                        if (!z11) {
                                            Object[] objArr16 = {crossOrderResponse};
                                            ChangeQuickRedirect changeQuickRedirect16 = a;
                                            if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "1d1649f8be451554bb36a23c4a51c929", RobustBitConfig.DEFAULT_VALUE)) {
                                                z12 = ((Boolean) PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "1d1649f8be451554bb36a23c4a51c929")).booleanValue();
                                            } else if (crossOrderResponse.a != 44) {
                                                z12 = false;
                                            } else {
                                                com.sankuai.waimai.bussiness.order.confirm.submit.g.a(this.c, crossOrderResponse.m, (com.sankuai.waimai.bussiness.order.confirm.submit.b) null, Long.MIN_VALUE, (String) null, crossOrderResponse.a);
                                                z12 = true;
                                            }
                                            if (!z12 && !b(crossOrderResponse)) {
                                                Object[] objArr17 = {crossOrderResponse};
                                                ChangeQuickRedirect changeQuickRedirect17 = a;
                                                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "11cc55fc8958deed0e5ba6380d9b9aa2", RobustBitConfig.DEFAULT_VALUE)) {
                                                    z13 = ((Boolean) PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "11cc55fc8958deed0e5ba6380d9b9aa2")).booleanValue();
                                                } else if (crossOrderResponse.a != 51) {
                                                    z13 = false;
                                                } else {
                                                    com.sankuai.waimai.bussiness.order.confirm.submit.g.a(this.c, crossOrderResponse.m, (com.sankuai.waimai.bussiness.order.confirm.submit.b) null, Long.MIN_VALUE, (String) null, crossOrderResponse.a);
                                                    z13 = true;
                                                }
                                                if (!z13) {
                                                    z14 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z14) {
            return;
        }
        d(crossOrderResponse);
    }

    private boolean b(CrossOrderResponse crossOrderResponse) {
        Object[] objArr = {crossOrderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925d2d62eb2c319b0ca60f4c2df0b76a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925d2d62eb2c319b0ca60f4c2df0b76a")).booleanValue();
        }
        if (crossOrderResponse.a != 71) {
            return false;
        }
        try {
            if (crossOrderResponse.p != null) {
                com.sankuai.waimai.business.order.submit.b.b(this.c, crossOrderResponse.p, crossOrderResponse.n, crossOrderResponse.o, crossOrderResponse.f);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    private boolean c(final CrossOrderResponse crossOrderResponse) {
        Object[] objArr = {crossOrderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb5f6c864e106e582177e685f2fc1b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb5f6c864e106e582177e685f2fc1b2")).booleanValue();
        }
        if (crossOrderResponse.a == 3 || crossOrderResponse.a == 66) {
            if (crossOrderResponse.a == 66 && !aa.a(crossOrderResponse.k)) {
                com.sankuai.waimai.foundation.router.a.a(this.c, crossOrderResponse.k);
                return true;
            }
            JsonObject jsonObject = new JsonObject();
            try {
                Gson a2 = com.sankuai.waimai.mach.utils.b.a();
                jsonObject.add("missingfoods", a2.toJsonTree(crossOrderResponse.d));
                jsonObject.add("code", a2.toJsonTree(Integer.valueOf(crossOrderResponse.a)));
            } catch (Exception unused) {
            }
            if (jsonObject.has("missingfoods")) {
                com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a(this.c).a("waimai_order_order_confirm_soldout_alert_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.h.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                    public final void a(String str, Map<String, Object> map, DynamicDialog dynamicDialog) {
                        Object[] objArr2 = {str, map, dynamicDialog};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74bd2fe04531de377983bff27689e261", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74bd2fe04531de377983bff27689e261");
                        } else if ("alert_confirm".equals(str)) {
                            if (crossOrderResponse.d != null && !com.sankuai.waimai.foundation.utils.d.a(crossOrderResponse.d)) {
                                GlobalCartManager.getInstance().clearErrorFood(crossOrderResponse.f, crossOrderResponse.d, SubmitOrderManager.getInstance().getSourceType());
                                h.this.c.finish();
                            }
                            dynamicDialog.dismiss();
                        }
                    }
                }).a();
                return true;
            }
            return false;
        }
        return false;
    }

    private void d(CrossOrderResponse crossOrderResponse) {
        Object[] objArr = {crossOrderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec54e2e9b1be95c7bdc5cbb80875814f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec54e2e9b1be95c7bdc5cbb80875814f");
            return;
        }
        String str = crossOrderResponse.b;
        if (TextUtils.isEmpty(str)) {
            str = this.c.getString(R.string.takeout_loading_fail_try_afterwhile);
        }
        ae.a(this.c, str);
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6c9adf85c2ce86ea713e00465ed0e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6c9adf85c2ce86ea713e00465ed0e4");
            return;
        }
        this.f = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((CrossOrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) CrossOrderService.class)).crossOrderUpdate(str), new b.AbstractC1042b<CrossOrderResponse>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.h.5
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                CrossOrderResponse crossOrderResponse = (CrossOrderResponse) obj;
                Object[] objArr2 = {crossOrderResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3533c37828ef64c3be264890755035b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3533c37828ef64c3be264890755035b8");
                } else if (com.sankuai.waimai.foundation.utils.f.a(h.this.c)) {
                } else {
                    h.this.a();
                    if (crossOrderResponse == null) {
                        onError(new Exception());
                    } else {
                        h.this.a(crossOrderResponse);
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a806227621ffa352b0f523ff4fb49918", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a806227621ffa352b0f523ff4fb49918");
                } else if (com.sankuai.waimai.foundation.utils.f.a(h.this.c)) {
                } else {
                    h.this.a();
                    h hVar = h.this;
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = h.a;
                    if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "454f6e362e8e50080fa551efd3257e24", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "454f6e362e8e50080fa551efd3257e24");
                        return;
                    }
                    hVar.d.a(-1, hVar.b);
                    com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(hVar.c, (Throwable) null);
                }
            }
        }, this.g);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde91ea91c6d52319312ec5118632484", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde91ea91c6d52319312ec5118632484")).booleanValue();
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.f);
        this.f = null;
        return true;
    }
}
