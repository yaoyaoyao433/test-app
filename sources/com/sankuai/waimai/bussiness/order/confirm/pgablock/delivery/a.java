package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.BusinessType;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.ExpectedArrivalInfoInput;
import com.sankuai.waimai.bussiness.order.base.model.c;
import com.sankuai.waimai.bussiness.order.base.utils.e;
import com.sankuai.waimai.bussiness.order.confirm.model.PhoneInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.root.CallbackInfo;
import com.sankuai.waimai.bussiness.order.confirm.preview.model.DeliveryListResponse;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.v2.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected Activity b;
    protected Context c;
    public com.sankuai.waimai.bussiness.order.confirm.a d;
    protected DeliveryInfo e;
    public AddressItem f;
    public PhoneInfo g;
    protected com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.b h;
    protected boolean i;
    protected boolean j;
    public List<BusinessType> k;
    protected Dialog l;
    protected DeliveryListResponse m;
    protected int n;
    protected Map<String, Object> o;

    private static boolean b(int i) {
        return i == 0 || i == 3;
    }

    public abstract void c();

    public a(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar, com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.b bVar) {
        Object[] objArr = {context, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1607d97aff6ddcb065b99b9a577dd33f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1607d97aff6ddcb065b99b9a577dd33f");
            return;
        }
        this.i = false;
        this.j = true;
        this.o = new HashMap();
        this.b = (Activity) context;
        this.c = context;
        this.d = aVar;
        this.h = bVar;
    }

    public final void a() {
        Dialog dialog;
        int i;
        String str;
        int i2;
        AddressItem addressItem;
        String str2;
        String str3;
        int c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fab400a6e206266163413a174c825e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fab400a6e206266163413a174c825e4");
        } else if (this.m != null && !j()) {
            b();
        } else {
            Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.b);
            StringBuilder sb = new StringBuilder();
            sb.append(this.d.aL_());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.d.aH_());
            String sb4 = sb3.toString();
            String aI_ = this.d.aI_();
            String token = SubmitOrderManager.getInstance().getToken();
            if (b(this.d.aL_())) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                dialog = a2;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4b4819a8769e0e4f18af9ad84a9e275", RobustBitConfig.DEFAULT_VALUE)) {
                    c = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4b4819a8769e0e4f18af9ad84a9e275")).intValue();
                } else {
                    c = this.d.bl.a().c();
                    if (c == 0) {
                        c = 1;
                    }
                }
                i = c;
            } else {
                dialog = a2;
                i = 2;
            }
            AddressItem addressItem2 = this.f;
            int i3 = this.e == null ? 0 : this.e.wmOrderTagType;
            if (this.e == null) {
                str = "";
            } else {
                CallbackInfo callbackInfo = this.e.extendsInfo;
                str = callbackInfo == null ? "" : callbackInfo.previewOrderCallbackInfo;
            }
            String str4 = str;
            if (b(this.d.aL_())) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                i2 = i;
                addressItem = addressItem2;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9b7bd2d60a6f156bd19297938bd6f90c", RobustBitConfig.DEFAULT_VALUE)) {
                    str2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9b7bd2d60a6f156bd19297938bd6f90c");
                } else {
                    str2 = (this.e == null || com.sankuai.waimai.foundation.utils.b.b(this.e.foodList)) ? "" : d.a().toJson(this.e.foodList);
                }
            } else {
                i2 = i;
                addressItem = addressItem2;
                str2 = "";
            }
            String str5 = str2;
            if (b(this.d.aL_())) {
                str3 = (this.e == null || this.e.cyclePurchaseInfo == null) ? "" : this.e.cyclePurchaseInfo;
            } else {
                str3 = "";
            }
            final Dialog dialog2 = dialog;
            new com.sankuai.waimai.bussiness.order.confirm.preview.request.a(sb2, sb4, aI_, token, i2, addressItem, i3, str4, str5, str3).a(this.d.t.a(), new com.sankuai.waimai.bussiness.order.confirm.submit.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
                public final void a(Throwable th) {
                    Object[] objArr4 = {th};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fd6b3e8b40b05dd07bff55d7a26ee5ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fd6b3e8b40b05dd07bff55d7a26ee5ba");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(dialog2);
                    ae.a(a.this.b, (int) R.string.wm_order_confirm_fail_to_load_pre_delivery_time_list);
                }

                @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
                public final void a(BaseResponse baseResponse) {
                    Object[] objArr4 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "03ce7d38646de2e1730456be16c9ec66", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "03ce7d38646de2e1730456be16c9ec66");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(dialog2);
                    String a3 = com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(a.this.b, baseResponse, (int) R.string.wm_order_confirm_fail_to_load_pre_delivery_time_list);
                    if (!TextUtils.isEmpty(a3)) {
                        ae.a(a.this.b, a3);
                    } else if (baseResponse.data == 0) {
                        ae.a(a.this.b, (int) R.string.wm_order_confirm_fail_to_load_pre_delivery_time_list);
                    } else {
                        a.this.a(false);
                        a.this.m = (DeliveryListResponse) baseResponse.data;
                        a.this.b();
                    }
                }
            });
        }
    }

    public final void b() {
        com.sankuai.waimai.bussiness.order.base.callback.a o;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a5e06cb3bdb4d865c3a84cf014671d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a5e06cb3bdb4d865c3a84cf014671d");
        } else if ((this.l != null && this.l.isShowing()) || this.m == null || this.m.list == null || this.m.list.isEmpty()) {
        } else {
            if (k() || l()) {
                o = o();
            } else {
                o = n();
            }
            this.l = e.a(this.b, this.m.title, this.m.hint, this.m.hintBg, this.m.list, com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.containsKey("sg_chosenTime") ? r.a(String.valueOf(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("sg_chosenTime")), 0) : e(), !m(), o, true);
        }
    }

    private com.sankuai.waimai.bussiness.order.base.callback.a n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a965b97306d73eeb1273c820dd89bf2", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.base.callback.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a965b97306d73eeb1273c820dd89bf2") : new com.sankuai.waimai.bussiness.order.base.callback.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.base.callback.a
            public final void a(int i, int i2, com.sankuai.waimai.bussiness.order.base.model.c cVar, c.a aVar) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), cVar, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49a3b5b05cf8e7bae754d1a5cade77e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49a3b5b05cf8e7bae754d1a5cade77e7");
                    return;
                }
                if (aVar == null) {
                    a.this.g();
                    a.this.c();
                } else {
                    String str = "";
                    String i3 = a.this.i();
                    String h = a.this.h();
                    if (TextUtils.equals(h, "立即送出")) {
                        str = i3.contains(CommonConstant.Symbol.MINUS) ? "1" : "2";
                    } else if (TextUtils.equals(h, "指定时间")) {
                        str = "3";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("etaformat", str);
                    hashMap.put("etavalue", i3);
                    JudasManualManager.a("b_8Xs6V").a((Map<String, Object>) hashMap).a(a.this.b).a();
                    a.this.b(aVar.g);
                    if (a.this.m != null) {
                        a.this.m.position = i;
                        a.this.m.subPosition = i2;
                    }
                    a aVar2 = a.this;
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "568e680c8670549f894b1c413a860a2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "568e680c8670549f894b1c413a860a2c");
                    } else {
                        aVar2.a(aVar.c);
                        int i4 = aVar.e;
                        Object[] objArr4 = {Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "903be74dc9c471a3c05a147fc32d1533", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "903be74dc9c471a3c05a147fc32d1533");
                        } else {
                            aVar2.a(i4);
                        }
                    }
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "expected_arrival_time", Integer.valueOf(aVar.e));
                    a.this.h.a(a.this.d.aL_(), true, false);
                }
                a.this.l = null;
            }
        };
    }

    private com.sankuai.waimai.bussiness.order.base.callback.a o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cb04ea89c167d668b1cc11e326702ad", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.base.callback.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cb04ea89c167d668b1cc11e326702ad") : new com.sankuai.waimai.bussiness.order.base.callback.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.base.callback.a
            public final void a(int i, int i2, com.sankuai.waimai.bussiness.order.base.model.c cVar, c.a aVar) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), cVar, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bc006ee0b05c94982beb8a7afb7b50c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bc006ee0b05c94982beb8a7afb7b50c");
                    return;
                }
                if (aVar != null) {
                    a.this.b(aVar.g);
                    if (a.this.m != null) {
                        a.this.m.position = i;
                        a.this.m.subPosition = i2;
                    }
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "expected_arrival_time", Integer.valueOf(aVar.e));
                    a.this.h.a(a.this.d.aL_(), true, false);
                }
                a.this.l = null;
            }
        };
    }

    private String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8da8281414db81f5dd270d113d1f6f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8da8281414db81f5dd270d113d1f6f") : this.b.getString(R.string.wm_order_confirm_not_choose_time);
    }

    public final void d() {
        this.m = null;
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e25b065840b566c92f868cc804ecce", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e25b065840b566c92f868cc804ecce")).intValue() : a("mChosenTime", 0);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1413fcb38fa9d41872b1b40563298bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1413fcb38fa9d41872b1b40563298bea");
        } else {
            b("mChosenTime", i);
        }
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d899e50b69af098fb5ce30e19f13ba05", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d899e50b69af098fb5ce30e19f13ba05") : a("mExpectedDeliveryTimeString", "");
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32992845c0a54c5d2877ac9b6b4a9aa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32992845c0a54c5d2877ac9b6b4a9aa0");
        } else {
            b("mExpectedDeliveryTimeString", str);
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40b3701ad4475e96c0e9513563e031b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40b3701ad4475e96c0e9513563e031b8");
        } else {
            b("mExpectedDeliveryTimeString", "");
        }
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dbd7f1bdda311491718b4844e88d152", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dbd7f1bdda311491718b4844e88d152") : a("mTimeTip", "");
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f0cc7360a59fcdda369220467caf77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f0cc7360a59fcdda369220467caf77");
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("mTimeTip", str);
        b("mTimeTip", str);
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23f589cacf76a1e5f6fd0306c1d35788", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23f589cacf76a1e5f6fd0306c1d35788") : a("mSelectViewTime", "");
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5566ef8151f3fd29c29aefbaa5ed0e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5566ef8151f3fd29c29aefbaa5ed0e1f");
        } else {
            b("mSelectViewTime", str);
        }
    }

    public final void a(AddressItem addressItem) {
        Object[] objArr = {addressItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef5718c6583d9f47b9db1543eadeb3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef5718c6583d9f47b9db1543eadeb3b");
            return;
        }
        this.f = addressItem;
        if (addressItem != null) {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.d("addressid", Long.valueOf(addressItem.id));
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.d("seal", Integer.valueOf(addressItem.getAoiAddressSuggestType()));
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("submit_address", addressItem);
    }

    public final void a(PhoneInfo phoneInfo) {
        Object[] objArr = {phoneInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83d9bc059338c1441c44e13ab60e991d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83d9bc059338c1441c44e13ab60e991d");
            return;
        }
        this.g = phoneInfo;
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("phone", phoneInfo);
    }

    public boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "295f974ff08d04fb8389936ac1b54b15", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "295f974ff08d04fb8389936ac1b54b15")).booleanValue() : a("isDeliveryTimeTypeChange", false);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc5e639e1ac2ccf522ce9304939b31f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc5e639e1ac2ccf522ce9304939b31f7");
            return;
        }
        Object[] objArr2 = {"isDeliveryTimeTypeChange", Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06b7c69f4681b9565c73c4ddafc51d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06b7c69f4681b9565c73c4ddafc51d76");
        } else if (this.o != null) {
            this.o.put("isDeliveryTimeTypeChange", Boolean.valueOf(z));
        }
    }

    public final boolean k() {
        return this.e != null && this.e.isAssignDeliveryTime == 2;
    }

    public final boolean l() {
        return this.e != null && this.e.isAssignDeliveryTime == 3;
    }

    public final boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "396dd7ce48e1938c5d76d62a7bf3a7b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "396dd7ce48e1938c5d76d62a7bf3a7b7")).booleanValue();
        }
        String str = "";
        if (this.e != null && this.e.mExpectedArrivalInfo != null) {
            str = this.e.mExpectedArrivalInfo.selectViewTime;
        }
        return p().equals(str);
    }

    private int a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e14f2a06c70fbe706c51fe4f7503b49", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e14f2a06c70fbe706c51fe4f7503b49")).intValue();
        }
        try {
            if (this.o != null && this.o.containsKey(str)) {
                return Integer.parseInt(String.valueOf(this.o.get(str)));
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.location.utils.b.a("DeliveryEventProcessor", e.getMessage(), new Object[0]);
        }
        return 0;
    }

    private void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8ea6691ec98ba9a412876fc1136dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8ea6691ec98ba9a412876fc1136dbe");
        } else if (this.o != null) {
            this.o.put(str, Integer.valueOf(i));
        }
    }

    public final boolean a(String str, boolean z) {
        Object[] objArr = {str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef8e631db7f7239aa8f268565ef5f375", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef8e631db7f7239aa8f268565ef5f375")).booleanValue();
        }
        try {
            if (this.o != null && this.o.containsKey(str)) {
                return Boolean.parseBoolean(String.valueOf(this.o.get(str)));
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.location.utils.b.a("DeliveryEventProcessor", e.getMessage(), new Object[0]);
        }
        return false;
    }

    public final String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dabcd4bf15b1c497068f6cb074bdd591", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dabcd4bf15b1c497068f6cb074bdd591") : (this.o == null || !this.o.containsKey(str)) ? str2 : String.valueOf(this.o.get(str));
    }

    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae66f10f68fdce942a9380f5bb8332d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae66f10f68fdce942a9380f5bb8332d");
        } else if (this.o != null) {
            this.o.put(str, str2);
        }
    }

    private boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "195d085ed1cf0e4f3f69b301573f60b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "195d085ed1cf0e4f3f69b301573f60b8")).booleanValue() : r() == 0 || r() == 3;
    }

    private int r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a78be29a95025f3461efd68d73cf0601", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a78be29a95025f3461efd68d73cf0601")).intValue();
        }
        BusinessType s = s();
        if (s != null) {
            return s.type;
        }
        return -1;
    }

    private BusinessType s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "535da951887db13a4269d85e70017252", RobustBitConfig.DEFAULT_VALUE)) {
            return (BusinessType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "535da951887db13a4269d85e70017252");
        }
        if (this.k != null) {
            if (this.k.size() == 1) {
                return this.k.get(0);
            }
            for (BusinessType businessType : this.k) {
                if (businessType.selected == 1) {
                    return businessType;
                }
            }
            return null;
        }
        return null;
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a470f1034be6082e28b0340f38371907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a470f1034be6082e28b0340f38371907");
            return;
        }
        AddressItem a2 = com.sankuai.waimai.platform.domain.manager.location.a.a(this.c);
        if (a2 == null || this.i) {
            a2 = new AddressItem();
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "addr_id", Long.valueOf(a2.id));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "recipient_phone", a2.phone);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "recipient_name", a2.userName);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "recipient_address", a2.addrBrief);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "house_number", a2.addrBuildingNum);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "recipient_gender", a2.gender);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "addr_latitude", Integer.valueOf(a2.lat));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "addr_longitude", Integer.valueOf(a2.lng));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "address_districts", a2.addressDistricts);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "expected_arrival_info", new ExpectedArrivalInfoInput(f()));
        HashMap hashMap = new HashMap();
        if (a2.addressPoiId != 0) {
            hashMap.put("poi_id", Long.valueOf(a2.addressPoiId));
        }
        if (a2.hasOriginalAddress()) {
            hashMap.put("origin_address_info", a2.originAddressInfo);
        }
        hashMap.put("need_recommend_aoi_address", Integer.valueOf(com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a.a(a2.id)));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "address_info", hashMap);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "address_category", Integer.valueOf(a2.category));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "location_way", 0);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "gps_accuracy", Integer.valueOf(g.l()));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "ahead_discount_time", this.e != null ? this.e.aheadDiscountTime : "");
        if (q()) {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "self_delivery_agree_selected", 0);
        } else {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "self_delivery_agree_selected", Integer.valueOf(a("agreeIsSelected", false) ? 1 : 0));
        }
        AddressItem addressItem = this.f;
        if (addressItem == null) {
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "addr_id", Long.valueOf(addressItem.id));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "recipient_phone", addressItem.phone);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "recipient_name", addressItem.userName);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "recipient_address", addressItem.addrBrief);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "house_number", addressItem.addrBuildingNum);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "recipient_gender", addressItem.gender);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "addr_latitude", Integer.valueOf(addressItem.lat));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "addr_longitude", Integer.valueOf(addressItem.lng));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "address_districts", addressItem.addressDistricts);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "address_category", Integer.valueOf(addressItem.category));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "bind_type", Integer.valueOf(addressItem.bindType));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "bind_type", Integer.valueOf(addressItem.bindType));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "building_id", Integer.valueOf(addressItem.relatedId >= 0 ? addressItem.relatedId : 0));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "expected_arrival_info", new ExpectedArrivalInfoInput(f()));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "ahead_discount_time", this.e != null ? this.e.aheadDiscountTime : "");
        if (q()) {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "self_delivery_agree_selected", 0);
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "check_shipping_distance", Integer.valueOf((q() || !z) ? 0 : 1));
    }
}
