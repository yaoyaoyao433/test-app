package com.hhmedic.android.sdk.module.call;

import android.content.Context;
import android.text.TextUtils;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.listener.HHVideoNotification;
import com.hhmedic.android.sdk.module.account.InitUserDC;
import com.hhmedic.android.sdk.module.call.data.CallDC;
import com.hhmedic.android.sdk.module.call.data.entity.Call;
import com.hhmedic.android.sdk.uikit.widget.HHTips;
import com.hhmedic.android.sdk.video.VideoCall;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHCall {
    private final Context mContext;
    private CallDC mDataController;
    private final HHTips mHHTips = new HHTips();
    private final HHDataControllerListener mNetListener = new HHDataControllerListener() { // from class: com.hhmedic.android.sdk.module.call.HHCall.2
        @Override // com.hhmedic.android.sdk.base.controller.HHDataControllerListener
        public void onResult(boolean z, String str) {
            HHCall.this.mHHTips.hideProgress(HHCall.this.mContext);
            LocalState.getInstance().release();
            if (z) {
                if (HHCall.this.getCallData().haveData()) {
                    Call call = (Call) HHCall.this.getCallData().mData;
                    if (HHCall.this.mPatientId > 0) {
                        call.realPatientUuid = HHCall.this.mPatientId;
                    }
                    if (call.realPatientUuid > 0) {
                        HHCall.this.mPatientId = call.realPatientUuid;
                    }
                    VideoCall.forCall(HHCall.this.mContext, call, call.realPatientUuid);
                } else if (HHCall.this.getCallData().isLimit()) {
                    HHCall.this.doctorBusy();
                    return;
                } else if (HHCall.this.getCallData().isAppointBusy()) {
                    HHCall.this.doctorBusy();
                    return;
                } else {
                    String str2 = null;
                    if (HHCall.this.getCallData().mData != 0 && ((Call) HHCall.this.getCallData().mData).order != null) {
                        str2 = ((Call) HHCall.this.getCallData().mData).order.orderid;
                    }
                    VideoCall.forLineUp(HHCall.this.mContext, str2, HHCall.this.mPatientId);
                }
            } else {
                if (HHConfig.ENABLE_CALL_ERROR_TOAST && !TextUtils.isEmpty(str)) {
                    HHCall.this.mHHTips.errorTips(HHCall.this.mContext, str);
                }
                HHVideoNotification.onFail(HHCall.this.getCallData().getNetCode());
            }
            HHCall.this.clear();
        }
    };
    private long mPatientId;
    private String mUserToken;

    private HHCall(Context context) {
        this.mContext = context;
    }

    public static HHCall create(Context context) {
        return new HHCall(context);
    }

    public void call(long j) {
        this.mPatientId = j;
        this.mUserToken = null;
        doLogin();
    }

    public void call(String str) {
        this.mUserToken = str;
        this.mPatientId = 0L;
        doLogin();
    }

    private void doLogin() {
        this.mHHTips.showProgress(this.mContext);
        new InitUserDC(this.mContext).getUserInfo(new HHDataControllerListener() { // from class: com.hhmedic.android.sdk.module.call.HHCall.1
            @Override // com.hhmedic.android.sdk.base.controller.HHDataControllerListener
            public void onResult(boolean z, String str) {
                if (z) {
                    HHCall.this.startCall();
                    return;
                }
                HHCall.this.mHHTips.hideProgress(HHCall.this.mContext);
                if (HHConfig.ENABLE_CALL_ERROR_TOAST) {
                    HHCall.this.mHHTips.errorTips(HHCall.this.mContext, str);
                }
                LocalState.getInstance().release();
                HHVideoNotification.onFail(-11L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCall() {
        if (this.mPatientId != 0) {
            getCallData().call(CallDC.create(this.mPatientId), this.mNetListener);
        } else if (!TextUtils.isEmpty(this.mUserToken)) {
            getCallData().call(CallDC.create(this.mUserToken), this.mNetListener);
        } else {
            getCallData().call(CallDC.create(600002, false, 0L), this.mNetListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CallDC getCallData() {
        if (this.mDataController == null) {
            this.mDataController = new CallDC(this.mContext);
        }
        return this.mDataController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clear() {
        this.mUserToken = null;
        this.mPatientId = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doctorBusy() {
        this.mHHTips.errorTips(this.mContext, "医生繁忙，请稍后重新呼叫");
    }
}
