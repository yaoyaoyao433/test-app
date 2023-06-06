package com.sankuai.waimai.bussiness.order.detailnew.controller;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.Keep;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogCallback;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController;
import com.sankuai.waimai.business.order.api.detail.network.response.EnvelopeShareTip;
import com.sankuai.waimai.business.order.api.model.DynamicDialogInfoWrapper;
import com.sankuai.waimai.bussiness.order.detailnew.util.l;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DynamicRedpacketDialog implements IDynamicDialogController {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Activity mActivity;
    private AlertInfo mAlertInfo;
    private IDynamicDialogCallback mCallback;
    private DynamicDialog mDynamicDialog;
    private boolean mIsFirst;
    private boolean mIsImmersive;
    private DynamicDialogInfoWrapper mModuleData;
    private l.c mOnDyRedPacketDialogStatusListener;
    private boolean mOnlyKangaroo;
    private String mOrderId;
    private EnvelopeShareTip mRedpacketInfo;
    private boolean mShouldPop;
    private l.e onRedPacketSharedListener;

    public DynamicRedpacketDialog(Activity activity, AlertInfo alertInfo, String str, EnvelopeShareTip envelopeShareTip, DynamicDialogInfoWrapper dynamicDialogInfoWrapper, l.e eVar, IDynamicDialogCallback iDynamicDialogCallback, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {activity, alertInfo, str, envelopeShareTip, dynamicDialogInfoWrapper, eVar, iDynamicDialogCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e2e678b1b681beee04c7a80eecdbfa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e2e678b1b681beee04c7a80eecdbfa4");
            return;
        }
        this.mActivity = activity;
        this.mAlertInfo = alertInfo;
        this.mCallback = iDynamicDialogCallback;
        this.mOrderId = str;
        this.mShouldPop = z;
        this.mModuleData = dynamicDialogInfoWrapper;
        this.mIsFirst = z2;
        this.mRedpacketInfo = envelopeShareTip;
        this.onRedPacketSharedListener = eVar;
        this.mIsImmersive = z3;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController
    public void showDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02beeba7cccd288ad423fbc6b9ab742b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02beeba7cccd288ad423fbc6b9ab742b");
        } else if (this.mModuleData.pos_datas == null || this.mModuleData.pos_datas.size() <= 0) {
            com.dianping.judas.util.a.a("template dialog redpacket data error", new Object[0]);
        } else {
            if (this.mRedpacketInfo == null) {
                this.mRedpacketInfo = new EnvelopeShareTip();
            }
            if (this.mModuleData.pos_datas.size() == 1 && this.mModuleData.pos_datas.get(0).pos_code.equals("position_APPdingdanwanchengyedanchuang_fenxiangA_ps_code")) {
                this.mOnlyKangaroo = true;
            } else {
                this.mOnlyKangaroo = false;
                for (DynamicDialogInfoWrapper.PosDatasBean posDatasBean : this.mModuleData.pos_datas) {
                    if (posDatasBean != null && "position_APPdingdanwanchengyedanchuang_fenxiangB_ps_code".equals(posDatasBean.pos_code)) {
                        this.mRedpacketInfo = com.sankuai.waimai.bussiness.order.detailnew.util.c.a(posDatasBean.pos_data);
                    }
                }
            }
            if (!this.mShouldPop) {
                this.mCallback.failedWithParam(this.mRedpacketInfo, Boolean.valueOf(this.mOnlyKangaroo));
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.EventConstants.KEY_ORDER_ID, this.mOrderId);
            hashMap.put("isFirst", Integer.valueOf(this.mIsFirst ? 1 : 0));
            DynamicDialog.a aVar = new DynamicDialog.a(this.mActivity);
            aVar.c = new DynamicDialog.f() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicRedpacketDialog.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.f
                public final void a(String str, Map<String, Object> map) {
                    Object[] objArr2 = {str, map};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "85e08f8913b28e26b8f3cf2e31ff7347", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "85e08f8913b28e26b8f3cf2e31ff7347");
                        return;
                    }
                    if (str.equals("share_red_packet")) {
                        if (DynamicRedpacketDialog.this.mRedpacketInfo == null) {
                            DynamicRedpacketDialog.this.mRedpacketInfo = new EnvelopeShareTip();
                        }
                        DynamicRedpacketDialog.this.mRedpacketInfo = com.sankuai.waimai.bussiness.order.detailnew.util.c.a(map);
                        if (DynamicRedpacketDialog.this.onRedPacketSharedListener != null) {
                            if (DynamicRedpacketDialog.this.mDynamicDialog.isShowing()) {
                                DynamicRedpacketDialog.this.mDynamicDialog.dismiss();
                            }
                            DynamicRedpacketDialog.this.onRedPacketSharedListener.a(true, DynamicRedpacketDialog.this.mRedpacketInfo, DynamicRedpacketDialog.this.mOrderId);
                            DynamicRedpacketDialog.this.onRedPacketSharedListener.a(DynamicRedpacketDialog.this.mRedpacketInfo.channels, DynamicRedpacketDialog.this.mOrderId);
                        }
                    }
                    if (str.equals("jump_with_close")) {
                        com.sankuai.waimai.foundation.router.a.a(DynamicRedpacketDialog.this.mActivity, map.get("url").toString());
                        if (DynamicRedpacketDialog.this.mDynamicDialog.isShowing()) {
                            DynamicRedpacketDialog.this.mDynamicDialog.dismiss();
                        }
                    }
                }
            };
            DynamicDialog.a a = aVar.a(hashMap);
            a.b = 2131559186;
            this.mDynamicDialog = a.a();
            this.mDynamicDialog.show(this.mAlertInfo);
            this.mCallback.successWithParam(this.mRedpacketInfo, Boolean.valueOf(this.mOnlyKangaroo));
            if (this.mOnDyRedPacketDialogStatusListener != null) {
                this.mOnDyRedPacketDialogStatusListener.a(this.mDynamicDialog.getDialog().getWindow());
            }
            this.mDynamicDialog.getDialog().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicRedpacketDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f6690af84b33c17acbca02c4e2172213", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f6690af84b33c17acbca02c4e2172213");
                        return;
                    }
                    DynamicRedpacketDialog.this.mCallback.onDismiss(null);
                    if (DynamicRedpacketDialog.this.mOnDyRedPacketDialogStatusListener != null) {
                        DynamicRedpacketDialog.this.mOnDyRedPacketDialogStatusListener.P();
                    }
                }
            });
        }
    }

    public void setOnDyRedPacketDialogStatusListener(l.c cVar) {
        this.mOnDyRedPacketDialogStatusListener = cVar;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController
    public DynamicDialog getDialog() {
        return this.mDynamicDialog;
    }
}
