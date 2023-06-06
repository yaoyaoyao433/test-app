package com.unionpay.tsmservice;

import android.content.Context;
import android.os.RemoteException;
import com.unionpay.tsmservice.request.AcquireSEAppListRequestParams;
import com.unionpay.tsmservice.request.ActivateVendorPayRequestParams;
import com.unionpay.tsmservice.request.AddCardToVendorPayRequestParams;
import com.unionpay.tsmservice.request.AppDataUpdateRequestParams;
import com.unionpay.tsmservice.request.AppDeleteRequestParams;
import com.unionpay.tsmservice.request.AppDownloadApplyRequestParams;
import com.unionpay.tsmservice.request.AppDownloadRequestParams;
import com.unionpay.tsmservice.request.AppLockRequestParams;
import com.unionpay.tsmservice.request.AppUnlockRequestParams;
import com.unionpay.tsmservice.request.CardListStatusChangedRequestParams;
import com.unionpay.tsmservice.request.CheckSSamsungPayRequestParams;
import com.unionpay.tsmservice.request.CloseChannelRequestParams;
import com.unionpay.tsmservice.request.ECashTopUpRequestParams;
import com.unionpay.tsmservice.request.EncryptDataRequestParams;
import com.unionpay.tsmservice.request.ExecuteCmdRequestParams;
import com.unionpay.tsmservice.request.GetAccountBalanceRequestParams;
import com.unionpay.tsmservice.request.GetAccountInfoRequestParams;
import com.unionpay.tsmservice.request.GetAppDetailRequestParams;
import com.unionpay.tsmservice.request.GetAppListRequestParams;
import com.unionpay.tsmservice.request.GetAppStatusRequestParams;
import com.unionpay.tsmservice.request.GetAssociatedAppRequestParams;
import com.unionpay.tsmservice.request.GetCardInfoBySpayRequestParams;
import com.unionpay.tsmservice.request.GetCardInfoRequestParams;
import com.unionpay.tsmservice.request.GetDefaultCardRequestParams;
import com.unionpay.tsmservice.request.GetEncryptDataRequestParams;
import com.unionpay.tsmservice.request.GetMessageDetailsRequestParams;
import com.unionpay.tsmservice.request.GetSMSAuthCodeRequestParams;
import com.unionpay.tsmservice.request.GetSeAppListRequestParams;
import com.unionpay.tsmservice.request.GetSeIdRequestParams;
import com.unionpay.tsmservice.request.GetTransElementsRequestParams;
import com.unionpay.tsmservice.request.GetTransRecordRequestParams;
import com.unionpay.tsmservice.request.GetTransactionDetailsRequestParams;
import com.unionpay.tsmservice.request.GetVendorPayStatusRequestParams;
import com.unionpay.tsmservice.request.HideAppApplyRequestParams;
import com.unionpay.tsmservice.request.InitRequestParams;
import com.unionpay.tsmservice.request.OnlinePaymentVerifyRequestParams;
import com.unionpay.tsmservice.request.OpenChannelRequestParams;
import com.unionpay.tsmservice.request.PreDownloadRequestParams;
import com.unionpay.tsmservice.request.QueryVendorPayStatusRequestParams;
import com.unionpay.tsmservice.request.RequestParams;
import com.unionpay.tsmservice.request.SafetyKeyboardRequestParams;
import com.unionpay.tsmservice.request.SendApduRequestParams;
import com.unionpay.tsmservice.request.SendCustomDataRequestParams;
import com.unionpay.tsmservice.request.SetDefaultCardRequestParams;
import com.unionpay.tsmservice.request.SetSamsungDefWalletRequestParams;
import com.unionpay.tsmservice.request.UniteRequestParams;
import com.unionpay.tsmservice.utils.IUPJniInterface;
/* loaded from: classes6.dex */
public class SessionKeyReExchange {
    private UPTsmAddon a;
    private int b;
    private RequestParams c;
    private ITsmCallback d;
    private ITsmProgressCallback e;
    private int f;
    private OnSafetyKeyboardCallback g;
    private Context h;
    private int i;

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, ITsmCallback iTsmCallback) {
        this(uPTsmAddon, i, null, iTsmCallback);
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, RequestParams requestParams, ITsmCallback iTsmCallback) {
        this(uPTsmAddon, i, requestParams, iTsmCallback, null);
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, RequestParams requestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) {
        this(uPTsmAddon, i, requestParams, iTsmCallback, iTsmProgressCallback, 1000);
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, RequestParams requestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback, int i2) {
        this.b = -1;
        this.f = 1000;
        this.a = uPTsmAddon;
        this.b = i;
        this.c = requestParams;
        this.d = iTsmCallback;
        this.e = iTsmProgressCallback;
        this.f = i2;
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, SafetyKeyboardRequestParams safetyKeyboardRequestParams, int i2, OnSafetyKeyboardCallback onSafetyKeyboardCallback, Context context) {
        this.b = -1;
        this.f = 1000;
        this.a = uPTsmAddon;
        this.b = i;
        this.i = i2;
        this.c = safetyKeyboardRequestParams;
        this.g = onSafetyKeyboardCallback;
        this.h = context;
    }

    public int reExchangeKey() throws RemoteException {
        String[] strArr = new String[1];
        int pubKey = this.a.getPubKey(1000, strArr);
        if (pubKey != 0) {
            return pubKey;
        }
        int exchangeKey = this.a.exchangeKey(IUPJniInterface.rER(strArr[0], IUPJniInterface.mSK()), strArr);
        if (exchangeKey != 0) {
            return exchangeKey;
        }
        String dMG = IUPJniInterface.dMG(strArr[0], this.a.getCryptType());
        IUPJniInterface.sSK(dMG);
        Context context = this.a.getContext();
        if (context != null) {
            IUPJniInterface.uSKT(context.getPackageName(), dMG);
        }
        int i = this.b;
        if (i == 1000) {
            return this.a.showSafetyKeyboard((SafetyKeyboardRequestParams) this.c, this.i, this.g, this.h);
        }
        switch (i) {
            case 0:
                return this.a.init((InitRequestParams) this.c, this.d);
            case 1:
                return this.a.getAssociatedApp((GetAssociatedAppRequestParams) this.c, this.d);
            case 2:
                return this.a.getAppList((GetAppListRequestParams) this.c, this.d);
            case 3:
                return this.a.getSEAppList((GetSeAppListRequestParams) this.c, this.d);
            case 4:
                return this.a.getAppDetail((GetAppDetailRequestParams) this.c, this.d);
            case 5:
                return this.a.getAppStatus((GetAppStatusRequestParams) this.c, this.d);
            case 6:
                return this.a.getCardInfo((GetCardInfoRequestParams) this.c, this.d);
            case 7:
                return this.a.getAccountInfo((GetAccountInfoRequestParams) this.c, this.d);
            case 8:
                return this.a.getAccountBalance((GetAccountBalanceRequestParams) this.c, this.d);
            case 9:
                return this.a.getTransElements((GetTransElementsRequestParams) this.c, this.d);
            case 10:
                return this.a.getTransRecord((GetTransRecordRequestParams) this.c, this.d);
            case 11:
                return this.a.getSMSAuthCode((GetSMSAuthCodeRequestParams) this.c, this.d);
            case 12:
                return this.a.getSeId((GetSeIdRequestParams) this.c, this.d);
            case 13:
                return this.a.getDefaultCard((GetDefaultCardRequestParams) this.c, this.d);
            case 14:
                return this.a.setDefaultCard((SetDefaultCardRequestParams) this.c, this.d);
            case 15:
                return this.a.appDownloadApply((AppDownloadApplyRequestParams) this.c, this.d);
            case 16:
                return this.a.appDownload((AppDownloadRequestParams) this.c, this.d, this.e);
            case 17:
                return this.a.appDelete((AppDeleteRequestParams) this.c, this.d, this.e);
            case 18:
                return this.a.appDataUpdate((AppDataUpdateRequestParams) this.c, this.d, this.e);
            case 19:
                return this.a.eCashTopUp((ECashTopUpRequestParams) this.c, this.d);
            case 20:
                return this.a.openChannel((OpenChannelRequestParams) this.c, this.d);
            case 21:
                return this.a.closeChannel((CloseChannelRequestParams) this.c, this.d);
            case 22:
                return this.a.sendApdu((SendApduRequestParams) this.c, this.d);
            case 23:
                return this.a.encryptData((EncryptDataRequestParams) this.c, this.d);
            case 24:
                return this.a.hideAppApply((HideAppApplyRequestParams) this.c, this.d);
            case 25:
                return this.a.executeCmd((ExecuteCmdRequestParams) this.c, this.d, this.e);
            case 26:
                return this.a.appLock((AppLockRequestParams) this.c, this.d);
            case 27:
                return this.a.appUnlock((AppUnlockRequestParams) this.c, this.d);
            case 28:
                return this.a.getCardInfoBySamsungPay((GetCardInfoBySpayRequestParams) this.c, this.d);
            case 29:
                return this.a.checkSSamsungPay((CheckSSamsungPayRequestParams) this.c, this.d);
            case 30:
                return this.a.setSamsungDefaultWallet((SetSamsungDefWalletRequestParams) this.c, this.d);
            case 31:
                return this.a.getEncryptData((GetEncryptDataRequestParams) this.c, this.d);
            case 32:
                return this.a.setSafetyKeyboardBitmap((SafetyKeyboardRequestParams) this.c);
            case 33:
                return this.a.clearEncryptData(this.i);
            case 34:
                return this.a.hideKeyboard();
            case 35:
                return this.a.cardListStatusChanged((CardListStatusChangedRequestParams) this.c, this.d);
            case 36:
                return this.a.getVendorPayStatus((GetVendorPayStatusRequestParams) this.c, this.d);
            case 37:
                return this.a.activateVendorPay((ActivateVendorPayRequestParams) this.c, this.d);
            case 38:
                return this.a.addCardToVendorPay((AddCardToVendorPayRequestParams) this.c, this.d, this.e);
            case 39:
                return this.a.onlinePaymentVerify((OnlinePaymentVerifyRequestParams) this.c, this.d);
            case 40:
                return this.a.preDownload((PreDownloadRequestParams) this.c, this.d, this.e);
            case 41:
                return this.a.queryVendorPayStatus((QueryVendorPayStatusRequestParams) this.c, this.d);
            case 42:
                return this.a.acquireSEAppList((AcquireSEAppListRequestParams) this.c, this.d);
            case 43:
                return this.a.getTransactionDetails((GetTransactionDetailsRequestParams) this.c, this.d);
            case 44:
                return this.a.getMessageDetails((GetMessageDetailsRequestParams) this.c, this.d);
            case 45:
                return this.a.sendCustomData((SendCustomDataRequestParams) this.c, this.d);
            case 46:
                return this.a.createSSD((UniteRequestParams) this.c, this.d);
            default:
                return 0;
        }
    }
}
