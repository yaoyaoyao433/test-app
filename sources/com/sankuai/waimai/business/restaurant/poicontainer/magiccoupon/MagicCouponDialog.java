package com.sankuai.waimai.business.restaurant.poicontainer.magiccoupon;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.model.MagicCouponPreUpgradeDialogInfo;
import com.sankuai.waimai.business.restaurant.base.repository.net.ShopApiService;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.restaurant.membercoupon.IMagicCouponDialog;
import com.sankuai.waimai.platform.widget.dialog.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MagicCouponDialog implements IMagicCouponDialog {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Activity mActivity;
    private String mCid;
    private String mCouponViewId;
    private DynamicDialog.f mDialogEventHandler;
    private DynamicDialog mDynamicDialog;
    private long mPoiId;
    private String mPoiIdStr;
    private String mVolleyTag;
    private Runnable onSuccess;

    public MagicCouponDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a22ee14073b8569d21089f957d1b64ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a22ee14073b8569d21089f957d1b64ee");
        } else {
            this.mDialogEventHandler = new DynamicDialog.f() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.magiccoupon.MagicCouponDialog.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.f
                public final void a(String str, Map<String, Object> map) {
                    Object[] objArr2 = {str, map};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b698d24e46253293c194985de11b568f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b698d24e46253293c194985de11b568f");
                    } else if ("close".equals(str)) {
                        if (MagicCouponDialog.this.mDynamicDialog != null) {
                            MagicCouponDialog.this.mDynamicDialog.dismiss();
                        }
                    } else if ("expand_success".equals(str)) {
                        if (MagicCouponDialog.this.onSuccess != null) {
                            MagicCouponDialog.this.onSuccess.run();
                        }
                    } else if (!"toast".equals(str) || map == null) {
                    } else {
                        try {
                            if (map.containsKey("msg") && (map.get("msg") instanceof String)) {
                                ae.a(MagicCouponDialog.this.mDynamicDialog.getDialog().getWindow().getDecorView(), (String) map.get("msg"));
                            }
                        } catch (Exception unused) {
                            ae.a(MagicCouponDialog.this.mActivity, (String) map.get("msg"));
                        }
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.IMagicCouponDialog
    public void showMagicCouponDialog(Activity activity, String str, long j, String str2, String str3, int i, Runnable runnable) {
        Object[] objArr = {activity, str, new Long(j), str2, str3, Integer.valueOf(i), runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3494535b29208cbf2ee2c5cc0b714c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3494535b29208cbf2ee2c5cc0b714c0b");
            return;
        }
        this.mActivity = activity;
        this.mVolleyTag = str;
        this.onSuccess = runnable;
        this.mPoiId = j;
        this.mPoiIdStr = str2;
        this.mCouponViewId = str3;
        getPreUpdateMagicCouponDialogInfo(str3);
    }

    public void setCid(String str) {
        this.mCid = str;
    }

    private void getPreUpdateMagicCouponDialogInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1ca4b6394aecc5b671d7c53d1a6a419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1ca4b6394aecc5b671d7c53d1a6a419");
            return;
        }
        final Dialog a = a.a(this.mActivity);
        b.a(((ShopApiService) b.a((Class<Object>) ShopApiService.class)).getMagicCouponPreUpgradeDialogInfo(str), new b.AbstractC1042b<BaseResponse<MagicCouponPreUpgradeDialogInfo>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.magiccoupon.MagicCouponDialog.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4e483a7248cfb18abe2224110819a545", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4e483a7248cfb18abe2224110819a545");
                } else if (MagicCouponDialog.this.isActivityFinished()) {
                } else {
                    a.b(a);
                    if (baseResponse != null) {
                        if (!baseResponse.isSuccess()) {
                            MagicCouponDialog.this.showToast(baseResponse.msg);
                            return;
                        }
                        MagicCouponPreUpgradeDialogInfo magicCouponPreUpgradeDialogInfo = (MagicCouponPreUpgradeDialogInfo) baseResponse.data;
                        if (magicCouponPreUpgradeDialogInfo == null || magicCouponPreUpgradeDialogInfo.alertInfo == null) {
                            return;
                        }
                        MagicCouponDialog.this.showMagicCouponExpandDialog(magicCouponPreUpgradeDialogInfo.alertInfo);
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c83ebc85e11185f5bd77a9261c4e983c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c83ebc85e11185f5bd77a9261c4e983c");
                } else if (MagicCouponDialog.this.isActivityFinished()) {
                } else {
                    a.b(a);
                    com.sankuai.waimai.platform.capacity.network.errorhanding.a.a(MagicCouponDialog.this.mActivity);
                }
            }
        }, this.mVolleyTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showToast(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a7692205d6faefcbeb5e0044eab4be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a7692205d6faefcbeb5e0044eab4be5");
        } else {
            ae.a(this.mActivity, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMagicCouponExpandDialog(AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6f7cd8456e1747efee0877e62596be2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6f7cd8456e1747efee0877e62596be2");
        } else if (alertInfo == null) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[MagicCouponDialog-showMagicCouponExpandDialog] poiIdStr：" + this.mPoiIdStr, new Object[0]);
            DynamicDialog.a aVar = new DynamicDialog.a(this.mActivity);
            aVar.c = this.mDialogEventHandler;
            if (!TextUtils.isEmpty(this.mCid)) {
                aVar.a(this.mCid);
            }
            aVar.g = new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.magiccoupon.MagicCouponDialog.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3ab462b4cf7cf3fbb24de2eb619961ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3ab462b4cf7cf3fbb24de2eb619961ed");
                    } else if (MagicCouponDialog.this.mDynamicDialog != null) {
                        com.sankuai.waimai.touchmatrix.views.b.a().b(MagicCouponDialog.this.mDynamicDialog.getDialog());
                    }
                }
            };
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", Long.valueOf(this.mPoiId));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.mPoiIdStr);
            hashMap.put("coupon_view_id", this.mCouponViewId);
            this.mDynamicDialog = aVar.a(hashMap).a();
            this.mDynamicDialog.show(alertInfo);
            com.sankuai.waimai.touchmatrix.views.b.a().a(this.mDynamicDialog.getDialog());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isActivityFinished() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aa0264f9c3071d71eb3e3a58f49b908", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aa0264f9c3071d71eb3e3a58f49b908")).booleanValue() : this.mActivity == null || this.mActivity.isFinishing() || this.mActivity.isDestroyed();
    }
}
