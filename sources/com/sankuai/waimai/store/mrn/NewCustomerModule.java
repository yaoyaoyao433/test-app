package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newcustomer.NewCustomerCouponListDialog;
import com.sankuai.waimai.store.newcustomer.b;
import com.sankuai.waimai.store.platform.domain.core.poi.CouponCollectionTip;
import com.sankuai.waimai.store.platform.domain.core.poi.NewCustomCouponDetail;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NewCustomerModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mCategoryId;
    private String mCid;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNNewCustomer";
    }

    public NewCustomerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c71a4b6f3942587b1cfaf152e9828e17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c71a4b6f3942587b1cfaf152e9828e17");
        }
    }

    @ReactMethod
    public void showNewCustomerCouponListDialog(String str, String str2, String str3, Promise promise) {
        Object[] objArr = {str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a64da31922fdda34a1fbfa1cc38270e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a64da31922fdda34a1fbfa1cc38270e1");
            return;
        }
        this.mCid = str2;
        this.mCategoryId = str3;
        final CouponCollectionTip couponCollectionTip = (CouponCollectionTip) i.a(str, CouponCollectionTip.class);
        if (couponCollectionTip == null || com.sankuai.shangou.stone.util.a.b(couponCollectionTip.getCouponDetailInfoList())) {
            return;
        }
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.store.mrn.NewCustomerModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db1f9a8a4fbe679eb7cbd948655594c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db1f9a8a4fbe679eb7cbd948655594c3");
                    return;
                }
                NewCustomerCouponListDialog newCustomerCouponListDialog = new NewCustomerCouponListDialog(NewCustomerModule.this.getCurrentActivity());
                newCustomerCouponListDialog.a(couponCollectionTip, new b.c() { // from class: com.sankuai.waimai.store.mrn.NewCustomerModule.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.newcustomer.b.c
                    public final void a(int i, NewCustomCouponDetail newCustomCouponDetail, String str4) {
                        Object[] objArr3 = {Integer.valueOf(i), newCustomCouponDetail, str4};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "46aa155c590693a988c1df0847690657", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "46aa155c590693a988c1df0847690657");
                        } else {
                            com.sankuai.waimai.store.manager.judas.b.a(NewCustomerModule.this.mCid, "b_uq5dapd9").a("order_view_id", 0).a("index", Integer.valueOf(i)).a("category_code", NewCustomerModule.this.mCategoryId).a("channel_url_key", newCustomCouponDetail.channelUrlKey).a();
                        }
                    }

                    @Override // com.sankuai.waimai.store.newcustomer.b.c
                    public final void b(int i, NewCustomCouponDetail newCustomCouponDetail, String str4) {
                        Object[] objArr3 = {Integer.valueOf(i), newCustomCouponDetail, str4};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6a1b64ad8dc7c95a0713d9d586235fe1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6a1b64ad8dc7c95a0713d9d586235fe1");
                        } else {
                            com.sankuai.waimai.store.manager.judas.b.b(NewCustomerModule.this.mCid, "b_waimai_zm7sq5vi_mv").a("order_view_id", 0).a("category_code", NewCustomerModule.this.mCategoryId).a("channel_url_key", newCustomCouponDetail.channelUrlKey).a("index", Integer.valueOf(i)).a();
                        }
                    }

                    @Override // com.sankuai.waimai.store.newcustomer.b.c
                    public final void a(String str4) {
                        Object[] objArr3 = {str4};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "897d212c8585be010449a52573d2d62c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "897d212c8585be010449a52573d2d62c");
                        } else {
                            com.sankuai.waimai.store.manager.judas.b.b(NewCustomerModule.this.mCid, "b_9vtgtrpx").a("category_code", NewCustomerModule.this.mCategoryId).a("channel_url_key", "-10101").a("order_view_id", 0).a();
                        }
                    }
                });
                newCustomerCouponListDialog.show();
            }
        });
        d.a(promise);
    }
}
