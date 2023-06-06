package com.sankuai.waimai.bussiness.order.confirm.coupon.controller;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.d;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.g;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.restaurant.membercoupon.IExchangeCouponDialogNew;
import java.util.Map;
import kotlin.jvm.functions.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ExchangeCouponDialog implements IExchangeCouponDialogNew {
    public static final int EXCHANGE_BUY_REFUEL_COUPON = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Activity mActivity;
    private String mActualSecondCityId;
    private String mActualThirdCityId;
    private String mAddressSecondCityId;
    private String mAddressThirdCityId;
    private int mCardType;
    private String mCid;
    private int mCoinCount;
    private String mCoinTransToken;
    private String mCouponViewId;
    private DynamicDialog.f mDialogEventHandler;
    private int mExchangeType;
    private String mExtendInfo;
    private Runnable mOnExchangeFailCallback;
    private Runnable mOnExchangeSuccessCallback;
    private a mOnExchangeSuccessCallbackWithParams;
    private String mOtherPoiSelectedCouponViewIds;
    private String mOuterCode;
    private long mPoiId;
    private String mPoiIdStr;
    private DynamicDialog mPreExchangeDynamicDialog;
    private long mProductId;
    private int mRequestPageSource;
    private String mSelectSecondCityId;
    private String mSelectThirdCityId;
    private String mTransToken;
    private String mVolleyTag;
    private b<String, Void> toastCallback;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(WritableMap writableMap);
    }

    public ExchangeCouponDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4efbe91aea174d010ee17df7e2c1227", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4efbe91aea174d010ee17df7e2c1227");
            return;
        }
        this.mActualSecondCityId = "0";
        this.mActualThirdCityId = "0";
        this.mSelectSecondCityId = "0";
        this.mSelectThirdCityId = "0";
        this.mAddressSecondCityId = "0";
        this.mAddressThirdCityId = "0";
        this.mDialogEventHandler = new DynamicDialog.f() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.controller.ExchangeCouponDialog.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.f
            public final void a(String str, Map<String, Object> map) {
                Object[] objArr2 = {str, map};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d83ff38461e524bc39fb1bdb99e09e38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d83ff38461e524bc39fb1bdb99e09e38");
                } else if ("exchange".equals(str)) {
                    ExchangeCouponDialog.this.handleExchangeCouponClick(map);
                    if (ExchangeCouponDialog.this.mPreExchangeDynamicDialog != null) {
                        ExchangeCouponDialog.this.mPreExchangeDynamicDialog.dismiss();
                    }
                } else if ("buy_coupon".equals(str)) {
                    ExchangeCouponDialog.this.handleBuyCouponClick(map);
                    if (ExchangeCouponDialog.this.mPreExchangeDynamicDialog != null) {
                        ExchangeCouponDialog.this.mPreExchangeDynamicDialog.dismiss();
                    }
                }
            }
        };
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.IExchangeCouponDialogNew
    public void showExchangeCouponDialog(Activity activity, String str, Runnable runnable, Runnable runnable2, long j, String str2, int i, String str3, int i2) {
        Object[] objArr = {activity, str, runnable, runnable2, new Long(j), str2, Integer.valueOf(i), str3, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28b53c51d6b9f939a9b295e6d358cb73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28b53c51d6b9f939a9b295e6d358cb73");
        } else {
            showExchangeCouponDialog(activity, str, runnable, runnable2, null, j, str2, i, str3, i2);
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.IExchangeCouponDialogNew
    public void showExchangeCouponDialog(Activity activity, String str, Runnable runnable, Runnable runnable2, b<String, Void> bVar, long j, String str2, int i, String str3, int i2) {
        Object[] objArr = {activity, str, runnable, runnable2, bVar, new Long(j), str2, Integer.valueOf(i), str3, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5af6ecc33210211c7a9b781354da8d49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5af6ecc33210211c7a9b781354da8d49");
        } else {
            showExchangeCouponDialog(activity, str, runnable, runnable2, bVar, j, str2, i, str3, i2, "");
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.IExchangeCouponDialogNew
    public void showExchangeCouponDialog(Activity activity, String str, Runnable runnable, Runnable runnable2, b<String, Void> bVar, long j, String str2, int i, String str3, int i2, String str4) {
        Object[] objArr = {activity, str, runnable, runnable2, bVar, new Long(j), str2, Integer.valueOf(i), str3, Integer.valueOf(i2), str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5db14bc87e8041c34e45e8c152b0afb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5db14bc87e8041c34e45e8c152b0afb2");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[ExchangeCouponDialog-showExchangeCouponDialog] poiIdStr：" + str2, new Object[0]);
        this.mActivity = activity;
        this.mVolleyTag = str;
        this.mOnExchangeSuccessCallback = runnable;
        this.mOnExchangeFailCallback = runnable2;
        this.toastCallback = bVar;
        this.mPoiId = j;
        this.mPoiIdStr = str2;
        this.mCouponViewId = str3;
        this.mRequestPageSource = i2;
        this.mExchangeType = i;
        this.mExtendInfo = str4 == null ? "" : str4;
        setCityId();
        getPreExchangeCouponDialogInfo();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r4.level != 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (android.text.TextUtils.isEmpty(r4.id) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        r11.mActualThirdCityId = r4.id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r1.level != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
        if (android.text.TextUtils.isEmpty(r1.id) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
        r11.mSelectThirdCityId = r1.id;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setCityId() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.bussiness.order.confirm.coupon.controller.ExchangeCouponDialog.changeQuickRedirect
            java.lang.String r10 = "8149d9611057f26cd7898ed4e697edb6"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            java.util.List r0 = com.sankuai.waimai.foundation.location.v2.h.s()
            java.util.List r1 = com.sankuai.waimai.foundation.location.v2.h.u()
            r2 = 3
            r3 = 2
            if (r0 == 0) goto L5a
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r0.next()
            com.sankuai.waimai.foundation.location.model.MtBackCityInfo r4 = (com.sankuai.waimai.foundation.location.model.MtBackCityInfo) r4
            if (r4 == 0) goto L47
            int r5 = r4.level
            if (r5 != r3) goto L47
            java.lang.String r5 = r4.id
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L47
            java.lang.String r4 = r4.id
            r11.mActualSecondCityId = r4
            goto L28
        L47:
            if (r4 == 0) goto L28
            int r5 = r4.level
            if (r5 != r2) goto L28
            java.lang.String r5 = r4.id
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L28
            java.lang.String r4 = r4.id
            r11.mActualThirdCityId = r4
            goto L28
        L5a:
            if (r1 == 0) goto L92
            java.util.Iterator r0 = r1.iterator()
        L60:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r0.next()
            com.sankuai.waimai.foundation.location.model.MtBackCityInfo r1 = (com.sankuai.waimai.foundation.location.model.MtBackCityInfo) r1
            if (r1 == 0) goto L7f
            int r4 = r1.level
            if (r4 != r3) goto L7f
            java.lang.String r4 = r1.id
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L7f
            java.lang.String r1 = r1.id
            r11.mSelectSecondCityId = r1
            goto L60
        L7f:
            if (r1 == 0) goto L60
            int r4 = r1.level
            if (r4 != r2) goto L60
            java.lang.String r4 = r1.id
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L60
            java.lang.String r1 = r1.id
            r11.mSelectThirdCityId = r1
            goto L60
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.coupon.controller.ExchangeCouponDialog.setCityId():void");
    }

    public ExchangeCouponDialog setCid(String str) {
        this.mCid = str;
        return this;
    }

    public ExchangeCouponDialog setOtherCouponViewIds(String str) {
        this.mOtherPoiSelectedCouponViewIds = str;
        return this;
    }

    public ExchangeCouponDialog setCounponOuterCode(String str) {
        this.mOuterCode = str;
        return this;
    }

    public ExchangeCouponDialog setCouponCardType(int i) {
        this.mCardType = i;
        return this;
    }

    public ExchangeCouponDialog setCouponProductId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7863d15b968f60185dfc857cc5678bbe", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExchangeCouponDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7863d15b968f60185dfc857cc5678bbe");
        }
        this.mProductId = j;
        return this;
    }

    public ExchangeCouponDialog setExchangeType(int i) {
        this.mExchangeType = i;
        return this;
    }

    public ExchangeCouponDialog setOnExchangeSuccessCallbackWithParams(a aVar) {
        this.mOnExchangeSuccessCallbackWithParams = aVar;
        return this;
    }

    private void getPreExchangeCouponDialogInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37bfcccc12f77c981d7427cd4b7fc4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37bfcccc12f77c981d7427cd4b7fc4c8");
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.mActivity);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).getPreExchangeCouponDialogInfo(this.mPoiId, this.mPoiIdStr, this.mCouponViewId, this.mActualSecondCityId, this.mActualThirdCityId, this.mSelectSecondCityId, this.mSelectThirdCityId, this.mAddressSecondCityId, this.mAddressThirdCityId, this.mOtherPoiSelectedCouponViewIds, this.mCardType, this.mOuterCode, this.mProductId, this.mRequestPageSource, this.mExchangeType, this.mExtendInfo), new b.AbstractC1042b<BaseResponse<d>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.controller.ExchangeCouponDialog.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f622b1a0da102237b58a90c905cfc03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f622b1a0da102237b58a90c905cfc03");
                } else if (ExchangeCouponDialog.this.isActivityFinished()) {
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    if (baseResponse != null) {
                        if (!baseResponse.isSuccess()) {
                            ExchangeCouponDialog.this.showToast(baseResponse.msg);
                            return;
                        }
                        d dVar = (d) baseResponse.data;
                        if (dVar != null) {
                            if (dVar.a != null) {
                                ExchangeCouponDialog.this.showPreExchangeDynamicDialog(dVar.a);
                            } else if (dVar.b != null) {
                                ExchangeCouponDialog.this.showFailDialog(dVar.b);
                            }
                        }
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4f24907c45b9bb75bc42db022c0f938e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4f24907c45b9bb75bc42db022c0f938e");
                } else if (ExchangeCouponDialog.this.isActivityFinished()) {
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    com.sankuai.waimai.platform.capacity.network.errorhanding.a.a(ExchangeCouponDialog.this.mActivity);
                }
            }
        }, this.mVolleyTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPreExchangeDynamicDialog(AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41960a5627cfb1bf847799df356d5d85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41960a5627cfb1bf847799df356d5d85");
        } else if (alertInfo == null) {
        } else {
            DynamicDialog.a aVar = new DynamicDialog.a(this.mActivity);
            aVar.c = this.mDialogEventHandler;
            if (!TextUtils.isEmpty(this.mCid)) {
                aVar.a(this.mCid);
            }
            aVar.g = new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.controller.ExchangeCouponDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0dc96d757191442537b2c8465b176b16", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0dc96d757191442537b2c8465b176b16");
                    } else if (ExchangeCouponDialog.this.mPreExchangeDynamicDialog != null) {
                        com.sankuai.waimai.touchmatrix.views.b.a().b(ExchangeCouponDialog.this.mPreExchangeDynamicDialog.getDialog());
                    }
                }
            };
            this.mPreExchangeDynamicDialog = aVar.a();
            this.mPreExchangeDynamicDialog.show(alertInfo);
            com.sankuai.waimai.touchmatrix.views.b.a().a(this.mPreExchangeDynamicDialog.getDialog());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBuyCouponClick(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ee47dce0c219346dac3b0a0dc215edf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ee47dce0c219346dac3b0a0dc215edf");
        } else if (map != null && (map.get(RegionLinkDao.TABLENAME) instanceof String)) {
            String str = (String) map.get(RegionLinkDao.TABLENAME);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.sankuai.waimai.foundation.router.a.a(this.mActivity, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleExchangeCouponClick(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c091dfd06d1f8d9e5a6bd0b9c328041b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c091dfd06d1f8d9e5a6bd0b9c328041b");
        } else if (map != null) {
            if (map.get("exchange_type") instanceof Long) {
                this.mExchangeType = ((Long) map.get("exchange_type")).intValue();
            }
            if (map.get("coin_count") instanceof Long) {
                this.mCoinCount = ((Long) map.get("coin_count")).intValue();
            }
            if (map.get("coupon_view_id") instanceof String) {
                this.mCouponViewId = (String) map.get("coupon_view_id");
            }
            String str = map.get(RegionLinkDao.TABLENAME) instanceof String ? (String) map.get(RegionLinkDao.TABLENAME) : "";
            if (map.get("trans_token") instanceof String) {
                this.mTransToken = (String) map.get("trans_token");
            }
            if (map.get("coin_trans_token") instanceof String) {
                this.mCoinTransToken = (String) map.get("coin_trans_token");
            }
            if (this.mExchangeType == 4) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.sankuai.waimai.foundation.router.a.a(this.mActivity, str);
                return;
            }
            submitExchangeCoupon();
        }
    }

    private void submitExchangeCoupon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c69d9882f0e97b247510b9fca2b1e4b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c69d9882f0e97b247510b9fca2b1e4b6");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[MemberExchangeHelper-submitExchangeCoupon] poiIdStr：" + this.mPoiIdStr, new Object[0]);
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.mActivity);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).submitExchangeCoupon(this.mActualSecondCityId, this.mActualThirdCityId, this.mSelectSecondCityId, this.mSelectThirdCityId, this.mAddressSecondCityId, this.mAddressThirdCityId, this.mPoiId, this.mPoiIdStr, this.mCouponViewId, this.mOtherPoiSelectedCouponViewIds, this.mOuterCode, this.mCardType, this.mProductId, this.mExchangeType, this.mCoinCount, this.mTransToken, this.mRequestPageSource, this.mCoinTransToken), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.bussiness.order.confirm.coupon.model.b>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.controller.ExchangeCouponDialog.4
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e1581b3e27a2de792a0d47f57c3b1307", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e1581b3e27a2de792a0d47f57c3b1307");
                } else if (ExchangeCouponDialog.this.isActivityFinished()) {
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    if (baseResponse != null) {
                        if (!baseResponse.isSuccess()) {
                            if (ExchangeCouponDialog.this.mOnExchangeFailCallback != null) {
                                ExchangeCouponDialog.this.mOnExchangeFailCallback.run();
                            }
                            if (baseResponse.data == 0) {
                                ExchangeCouponDialog.this.showToast(baseResponse.msg);
                                return;
                            } else if (((com.sankuai.waimai.bussiness.order.confirm.coupon.model.b) baseResponse.data).a == 0) {
                                ExchangeCouponDialog.this.showToast(((com.sankuai.waimai.bussiness.order.confirm.coupon.model.b) baseResponse.data).b);
                                return;
                            } else if (((com.sankuai.waimai.bussiness.order.confirm.coupon.model.b) baseResponse.data).a != 1) {
                                ExchangeCouponDialog.this.showToast(baseResponse.msg);
                                return;
                            } else if (((com.sankuai.waimai.bussiness.order.confirm.coupon.model.b) baseResponse.data).c != null) {
                                ExchangeCouponDialog.this.showFailDialog(((com.sankuai.waimai.bussiness.order.confirm.coupon.model.b) baseResponse.data).c.b);
                                return;
                            } else {
                                return;
                            }
                        }
                        String str = baseResponse.msg;
                        if (baseResponse.data != 0 && !TextUtils.isEmpty(((com.sankuai.waimai.bussiness.order.confirm.coupon.model.b) baseResponse.data).b)) {
                            str = ((com.sankuai.waimai.bussiness.order.confirm.coupon.model.b) baseResponse.data).b;
                        }
                        ExchangeCouponDialog.this.showToast(str);
                        if (ExchangeCouponDialog.this.mOnExchangeSuccessCallback != null) {
                            ExchangeCouponDialog.this.mOnExchangeSuccessCallback.run();
                        }
                        if (ExchangeCouponDialog.this.mOnExchangeSuccessCallbackWithParams != null) {
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("coupon_view_id", ((com.sankuai.waimai.bussiness.order.confirm.coupon.model.b) baseResponse.data).d);
                            createMap.putString("coupon_outer_code", ((com.sankuai.waimai.bussiness.order.confirm.coupon.model.b) baseResponse.data).e);
                            ExchangeCouponDialog.this.mOnExchangeSuccessCallbackWithParams.a(createMap);
                        }
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c27fa055ce11714f527890d7c7f76d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c27fa055ce11714f527890d7c7f76d8");
                } else if (ExchangeCouponDialog.this.isActivityFinished()) {
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    com.sankuai.waimai.platform.capacity.network.errorhanding.a.a(ExchangeCouponDialog.this.mActivity);
                    if (ExchangeCouponDialog.this.mOnExchangeFailCallback != null) {
                        ExchangeCouponDialog.this.mOnExchangeFailCallback.run();
                    }
                }
            }
        }, this.mVolleyTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showToast(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "379858a0c3ff6aff0f2dd099c924cff9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "379858a0c3ff6aff0f2dd099c924cff9");
        } else if (this.toastCallback != null) {
            this.toastCallback.invoke(str);
        } else {
            ae.a(this.mActivity, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFailDialog(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aff4b509c95a5974954ef882ef6d194a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aff4b509c95a5974954ef882ef6d194a");
        } else if (gVar == null) {
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(this.mActivity, 2131558962)).a(gVar.a).b(gVar.b).a(gVar.c, (DialogInterface.OnClickListener) null).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isActivityFinished() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "356a147fa67ab6015f10622b64b529df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "356a147fa67ab6015f10622b64b529df")).booleanValue() : this.mActivity == null || this.mActivity.isFinishing() || this.mActivity.isDestroyed();
    }
}
