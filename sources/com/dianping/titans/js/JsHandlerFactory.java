package com.dianping.titans.js;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.networklog.c;
import com.dianping.titans.js.jshandler.ActionSheetJsHandler;
import com.dianping.titans.js.jshandler.AddRequestSignatureJsHandler;
import com.dianping.titans.js.jshandler.AlertJsHandler;
import com.dianping.titans.js.jshandler.AutoLockJsHandler;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.js.jshandler.BindJsHandler;
import com.dianping.titans.js.jshandler.BleRequestPermissionJsHandler;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.dianping.titans.js.jshandler.CheckAuthorizationJsHandler;
import com.dianping.titans.js.jshandler.CheckVersionJsHandler;
import com.dianping.titans.js.jshandler.ChooseFileJsHandler;
import com.dianping.titans.js.jshandler.ChooseImageJsHandler;
import com.dianping.titans.js.jshandler.ChooseMediaJsHandler;
import com.dianping.titans.js.jshandler.ChooseVideoJsHandler;
import com.dianping.titans.js.jshandler.ClearStorageJsHandler;
import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.dianping.titans.js.jshandler.CloseWindowJsHandler;
import com.dianping.titans.js.jshandler.CompressImageJsHandler;
import com.dianping.titans.js.jshandler.ConfirmJsHandler;
import com.dianping.titans.js.jshandler.ConnectWifiJsHandler;
import com.dianping.titans.js.jshandler.DecryptDataJsHandler;
import com.dianping.titans.js.jshandler.DownloadImageJsHandler;
import com.dianping.titans.js.jshandler.EditMediaJsHandler;
import com.dianping.titans.js.jshandler.EncryptDataJsHandler;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.dianping.titans.js.jshandler.GetBrightnessJsHandler;
import com.dianping.titans.js.jshandler.GetCityInfoJsHandler;
import com.dianping.titans.js.jshandler.GetClipboardJsHandler;
import com.dianping.titans.js.jshandler.GetDeviceInfoJsHandler;
import com.dianping.titans.js.jshandler.GetFingerprintJsHandler;
import com.dianping.titans.js.jshandler.GetImageInfoJsHandler;
import com.dianping.titans.js.jshandler.GetLocationJsHandler;
import com.dianping.titans.js.jshandler.GetMediaFrameJsHandler;
import com.dianping.titans.js.jshandler.GetNetworkTimeJsHandler;
import com.dianping.titans.js.jshandler.GetNetworkTypeJsHandler;
import com.dianping.titans.js.jshandler.GetOfflineBundleJsHandler;
import com.dianping.titans.js.jshandler.GetResultJsHandler;
import com.dianping.titans.js.jshandler.GetSafeAreaJsHandler;
import com.dianping.titans.js.jshandler.GetServiceInfoJsHandler;
import com.dianping.titans.js.jshandler.GetStorageJsHandler;
import com.dianping.titans.js.jshandler.GetUserInfoJsHandler;
import com.dianping.titans.js.jshandler.GetWifiInfoJsHandler;
import com.dianping.titans.js.jshandler.GetWifiListJsHandler;
import com.dianping.titans.js.jshandler.GetWifiSwitchStatusJsHandler;
import com.dianping.titans.js.jshandler.InvalidJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.js.jshandler.JumpToSchemeJsHandler;
import com.dianping.titans.js.jshandler.LogJsHandler;
import com.dianping.titans.js.jshandler.LoginJsHandler;
import com.dianping.titans.js.jshandler.LogoutJsHandler;
import com.dianping.titans.js.jshandler.OpenAppSettingHandler;
import com.dianping.titans.js.jshandler.OpenMiniProgramJsHandler;
import com.dianping.titans.js.jshandler.OpenSchemeJsHandler;
import com.dianping.titans.js.jshandler.PayJsHandler;
import com.dianping.titans.js.jshandler.PickContactJsHandler;
import com.dianping.titans.js.jshandler.PlayMediaJsHandler;
import com.dianping.titans.js.jshandler.PlayVideoJsHandler;
import com.dianping.titans.js.jshandler.PreviewImageJsHandler;
import com.dianping.titans.js.jshandler.PromptJsHandler;
import com.dianping.titans.js.jshandler.PublishJsHandler;
import com.dianping.titans.js.jshandler.ReadyJsHandler;
import com.dianping.titans.js.jshandler.RequestPermissionJsHandler;
import com.dianping.titans.js.jshandler.SendBabelLogJsHandler;
import com.dianping.titans.js.jshandler.SendInnerLogJsHandler;
import com.dianping.titans.js.jshandler.SendSnifferLogJsHandler;
import com.dianping.titans.js.jshandler.SetClipboardJsHandler;
import com.dianping.titans.js.jshandler.SetResultJsHandler;
import com.dianping.titans.js.jshandler.SetStorageJsHandler;
import com.dianping.titans.js.jshandler.SetupEventJsHandler;
import com.dianping.titans.js.jshandler.ShareImageJsHandler;
import com.dianping.titans.js.jshandler.ShareJsHandler;
import com.dianping.titans.js.jshandler.ShareMiniProgramJsHandler;
import com.dianping.titans.js.jshandler.ShowKeyboardJsHandler;
import com.dianping.titans.js.jshandler.StartAdvertisingJsHandler;
import com.dianping.titans.js.jshandler.StartScanDataJsHandler;
import com.dianping.titans.js.jshandler.StatisticsJsHandler;
import com.dianping.titans.js.jshandler.StopAdvertisingJsHandler;
import com.dianping.titans.js.jshandler.StopLocatingJsHandler;
import com.dianping.titans.js.jshandler.StopScanDataJsHandler;
import com.dianping.titans.js.jshandler.SubscribeJsHandler;
import com.dianping.titans.js.jshandler.ToastJsHandler;
import com.dianping.titans.js.jshandler.UnregisterServiceWorkerJsHandler;
import com.dianping.titans.js.jshandler.UnsubscribeJsHandler;
import com.dianping.titans.js.jshandler.UploadFileJsHandler;
import com.dianping.titans.js.jshandler.UploadLogJsHandler;
import com.dianping.titans.js.jshandler.UploadMediaJsHandler;
import com.dianping.titans.js.jshandler.UploadPhotoJsHandler;
import com.dianping.titans.js.jshandler.VibrateJsHandler;
import com.dianping.titans.utils.Constants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.titans.protocol.utils.PublishCenter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class JsHandlerFactory {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Set<String> VALID_DOMAINS = new HashSet(Arrays.asList(AbsApiFactory.PASSPORT_ONLINE_URL, "dianping", "maoyan", "jiudian", "daxiang", "lvyou", "waimai", "lingshou", "mtalog", "hb", "moma", "basic", "titans", "traffic", "tower"));
    private static final String PRESENT = Object.class.getName();
    private static final HashMap<String, String> METHOD_CLASS_MAP = new HashMap<>();
    private static final HashSet<JsHost> sJsHosts = new HashSet<>();

    public static void registerJsHandlerForKNB() {
    }

    static {
        registerJsHandlers();
        registerMethod();
        PublishCenter.getInstance().registerCallback(new PublishCenter.ReceivedActionCallback() { // from class: com.dianping.titans.js.JsHandlerFactory.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.protocol.utils.PublishCenter.ReceivedActionCallback
            public final void onReceivedAction(String str, JSONObject jSONObject) {
                Object[] objArr = {str, jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b759d530f1d38f98d8bc4ea82cb4bb2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b759d530f1d38f98d8bc4ea82cb4bb2");
                } else {
                    JsHandlerFactory.publishJsHost(jSONObject);
                }
            }
        });
    }

    private static void registerMethod() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5faaf5543eade05012e552bdb1c02a03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5faaf5543eade05012e552bdb1c02a03");
            return;
        }
        METHOD_CLASS_MAP.put("traffic.options", PRESENT);
        METHOD_CLASS_MAP.put("traffic.timeTable", PRESENT);
        METHOD_CLASS_MAP.put("traffic.selectDate", PRESENT);
        METHOD_CLASS_MAP.put("traffic.selectDateStudent", PRESENT);
        METHOD_CLASS_MAP.put("traffic.selectDateRush", PRESENT);
        METHOD_CLASS_MAP.put("traffic.selectStation", PRESENT);
        METHOD_CLASS_MAP.put("traffic.setResult", PRESENT);
        METHOD_CLASS_MAP.put("traffic.selectFlightDate", PRESENT);
        METHOD_CLASS_MAP.put("traffic.selectFlightRoundDate", PRESENT);
        METHOD_CLASS_MAP.put("traffic.getLinkman", PRESENT);
        METHOD_CLASS_MAP.put("traffic.getExpress", PRESENT);
        METHOD_CLASS_MAP.put("traffic.request", PRESENT);
        METHOD_CLASS_MAP.put("traffic.loadHtml", PRESENT);
        METHOD_CLASS_MAP.put("traffic.loadingStart", PRESENT);
        METHOD_CLASS_MAP.put("traffic.loadingStop", PRESENT);
        METHOD_CLASS_MAP.put("traffic.ringtone", PRESENT);
        METHOD_CLASS_MAP.put("traffic.cashier", PRESENT);
        METHOD_CLASS_MAP.put("traffic.modal", PRESENT);
        METHOD_CLASS_MAP.put("traffic.dismiss", PRESENT);
        METHOD_CLASS_MAP.put("tower.setGData", PRESENT);
        METHOD_CLASS_MAP.put("loginsuccess", PRESENT);
        METHOD_CLASS_MAP.put("show_alert", PRESENT);
        METHOD_CLASS_MAP.put("getdevice", PRESENT);
        METHOD_CLASS_MAP.put("version", PRESENT);
        METHOD_CLASS_MAP.put("getNetworkStatus", PRESENT);
        METHOD_CLASS_MAP.put("uploadImage", PRESENT);
        METHOD_CLASS_MAP.put("getRequestId", PRESENT);
        METHOD_CLASS_MAP.put("mapi", PRESENT);
        METHOD_CLASS_MAP.put("updateAccount", PRESENT);
        METHOD_CLASS_MAP.put("uploadContactList", PRESENT);
        METHOD_CLASS_MAP.put("jumpToWeChatProfile", PRESENT);
        METHOD_CLASS_MAP.put("bindPhone", PRESENT);
        METHOD_CLASS_MAP.put("setBarrageEnabled", PRESENT);
        METHOD_CLASS_MAP.put("pickCity", PRESENT);
        METHOD_CLASS_MAP.put("analyticsTag", PRESENT);
        METHOD_CLASS_MAP.put("getCX", PRESENT);
        METHOD_CLASS_MAP.put("getCityId", PRESENT);
        METHOD_CLASS_MAP.put("scanQRCode", PRESENT);
        METHOD_CLASS_MAP.put("zhangyu.addGoodsToShoppingCart", PRESENT);
        METHOD_CLASS_MAP.put("traffic.trainBaseInfo", PRESENT);
        METHOD_CLASS_MAP.put("traffic.trainJsApiDecode", PRESENT);
        METHOD_CLASS_MAP.put("traffic.operateStorageInfo", PRESENT);
        METHOD_CLASS_MAP.put("traffic.identityCode", PRESENT);
        METHOD_CLASS_MAP.put("traffic.catReport", PRESENT);
        METHOD_CLASS_MAP.put("tripBiz.getAppInfo", PRESENT);
        METHOD_CLASS_MAP.put("tripBiz.getPosInfo", PRESENT);
        METHOD_CLASS_MAP.put("tripBiz.offline", PRESENT);
        METHOD_CLASS_MAP.put("tripBiz.checkPrintStatus", PRESENT);
        METHOD_CLASS_MAP.put("tripBiz.print", PRESENT);
        METHOD_CLASS_MAP.put("tripBiz.tripBizLogin", PRESENT);
        METHOD_CLASS_MAP.put("tripBiz.tripBizLogout", PRESENT);
        METHOD_CLASS_MAP.put("tripBiz.tripBizSetTooBarInfo", PRESENT);
        METHOD_CLASS_MAP.put("tripBiz.tripBizSetTabInfo", PRESENT);
        METHOD_CLASS_MAP.put("tower.getUuid", PRESENT);
        METHOD_CLASS_MAP.put("tower.comment", PRESENT);
        METHOD_CLASS_MAP.put("waimai.waimaiGetPushToken", PRESENT);
        METHOD_CLASS_MAP.put("waimai.waimaiPayForWMVIP", PRESENT);
        METHOD_CLASS_MAP.put("waimai.waimaiSetTitleImageURL", PRESENT);
        METHOD_CLASS_MAP.put("waimai.hertzMetric", PRESENT);
        METHOD_CLASS_MAP.put("waimai.getRiderMessage", PRESENT);
        METHOD_CLASS_MAP.put("waimai.shareCommon", PRESENT);
        METHOD_CLASS_MAP.put("waimai.clearRiderMessage", PRESENT);
        METHOD_CLASS_MAP.put("waimai.clearHistory", PRESENT);
        METHOD_CLASS_MAP.put("waimai.passCrawlerVerification", PRESENT);
        METHOD_CLASS_MAP.put("waimai.waimaieExit", PRESENT);
        METHOD_CLASS_MAP.put("waimai.waimaieGetBdPhone", PRESENT);
        METHOD_CLASS_MAP.put("waimai.waimaieGoSettingGuide", PRESENT);
        METHOD_CLASS_MAP.put("waimai.getPoiMessage", PRESENT);
        METHOD_CLASS_MAP.put("waimai.dailPrivacyTEL", PRESENT);
        METHOD_CLASS_MAP.put("waimai.changeStealCouponStatus", PRESENT);
        METHOD_CLASS_MAP.put("paotuib.getWebViewStackInfo", PRESENT);
        METHOD_CLASS_MAP.put("paotuib.getQuickOrderDetail", PRESENT);
        METHOD_CLASS_MAP.put("paotuib.getWaimaiFingerprint", PRESENT);
        METHOD_CLASS_MAP.put("paotuib.getAbnormalWaybillInfo", PRESENT);
        METHOD_CLASS_MAP.put("paotuib.uploadInfoToCat", PRESENT);
        METHOD_CLASS_MAP.put("topstar.zzCertificate", PRESENT);
        METHOD_CLASS_MAP.put("topstar.checkFavorite", PRESENT);
        METHOD_CLASS_MAP.put("topstar.setFavorite", PRESENT);
        METHOD_CLASS_MAP.put("pay.pickContactPhone", PRESENT);
        METHOD_CLASS_MAP.put("pay.copy2Clipboard", PRESENT);
        METHOD_CLASS_MAP.put("pay.open3rdPartyWallet", PRESENT);
        METHOD_CLASS_MAP.put("pay.openWeixinNoPassword", PRESENT);
        METHOD_CLASS_MAP.put("pay.noticeOpenCreditPayResult", PRESENT);
        METHOD_CLASS_MAP.put("pay.identityAuthenticationUnregister", PRESENT);
        METHOD_CLASS_MAP.put("pay.quickPassHCEManage", PRESENT);
        METHOD_CLASS_MAP.put("pay.setCashierPayResult", PRESENT);
        METHOD_CLASS_MAP.put("pay.startLivenessDetection", PRESENT);
        METHOD_CLASS_MAP.put("pay.quickpassTrafficCard", PRESENT);
        METHOD_CLASS_MAP.put("pay.isInAppProvisioningAvailable", PRESENT);
        METHOD_CLASS_MAP.put("pay.startInAppProvisioning", PRESENT);
        METHOD_CLASS_MAP.put("pay.startLotteryAnimation", PRESENT);
        METHOD_CLASS_MAP.put("pay.syncBarCodeOffline", PRESENT);
        METHOD_CLASS_MAP.put("pay.callMeituanPay", PRESENT);
        METHOD_CLASS_MAP.put("pay.openMailLoginWebview", PRESENT);
        METHOD_CLASS_MAP.put("dpwaimai.highlightedDialog", PRESENT);
        METHOD_CLASS_MAP.put("phx.request", PRESENT);
        METHOD_CLASS_MAP.put("phx.data", PRESENT);
        METHOD_CLASS_MAP.put("legwork.getPushToken", PRESENT);
        METHOD_CLASS_MAP.put("legwork.payForWMVIP", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.menuTitle", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.datePicker", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.cacheSave", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.cacheLoad", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.cacheDelete", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.cacheClear", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.setSegments", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.getWiFiInfo", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.getReplyLayout", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.stopMusic", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.queryCalendersEvent", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.deleteCalendersEvent", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.setCalendersEvent", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.getAppInfo", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.showImages", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.getPrintDevice", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.uploadImage", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.print", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.editPhoto", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.scanQRCode", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.selectTab", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.cancelUploadImage", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.setBadge", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.checkDeal", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.setTitleRedDot", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.getEnv", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.ajax", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.reuploadImage", PRESENT);
        METHOD_CLASS_MAP.put("dpmerchant.getWebViewCapture", PRESENT);
        METHOD_CLASS_MAP.put("overseas.getViewCity", PRESENT);
        METHOD_CLASS_MAP.put("dx.getChatList", PRESENT);
        METHOD_CLASS_MAP.put("dx.deleteChat", PRESENT);
        METHOD_CLASS_MAP.put("dx.queryPeerInfoByChatID", PRESENT);
        METHOD_CLASS_MAP.put("food.passCrawlerVerification", PRESENT);
        METHOD_CLASS_MAP.put("gc.customEduShare", PRESENT);
        METHOD_CLASS_MAP.put("eh.show", PRESENT);
        METHOD_CLASS_MAP.put("eh.open", PRESENT);
        METHOD_CLASS_MAP.put("eh.actionsheet", PRESENT);
        METHOD_CLASS_MAP.put("eh.config", PRESENT);
        METHOD_CLASS_MAP.put("eh.event", PRESENT);
        METHOD_CLASS_MAP.put("eh.trans", PRESENT);
        METHOD_CLASS_MAP.put("eh.transComplete", PRESENT);
        METHOD_CLASS_MAP.put("eh.closeTrans", PRESENT);
        METHOD_CLASS_MAP.put("meituan.pushGuideNotification", PRESENT);
        METHOD_CLASS_MAP.put("mhotel.captureWebView", PRESENT);
        METHOD_CLASS_MAP.put("mhotel.clearCapturedWebView", PRESENT);
        METHOD_CLASS_MAP.put("mhotel.shareCapturedWebView", PRESENT);
        METHOD_CLASS_MAP.put("mhotel.saveCapturedWebView", PRESENT);
        METHOD_CLASS_MAP.put("travel.setGData", PRESENT);
        METHOD_CLASS_MAP.put("seagull.getImage", PRESENT);
        METHOD_CLASS_MAP.put("knb.shortcut.support", PRESENT);
        METHOD_CLASS_MAP.put("knb.shortcut.add", PRESENT);
        METHOD_CLASS_MAP.put("knb.shortcut.query", PRESENT);
        METHOD_CLASS_MAP.put("knb.shortcut.update", PRESENT);
        METHOD_CLASS_MAP.put("knb.shortcut.delete", PRESENT);
    }

    private static void registerJsHandlers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fa98064d1a3b836104c12bbd1670b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fa98064d1a3b836104c12bbd1670b69");
            return;
        }
        METHOD_CLASS_MAP.put("ready", ReadyJsHandler.class.getName());
        METHOD_CLASS_MAP.put("subscribe", SubscribeJsHandler.class.getName());
        METHOD_CLASS_MAP.put("unsubscribe", UnsubscribeJsHandler.class.getName());
        METHOD_CLASS_MAP.put(Constants.MULTI_PROCESS_PUBLISH_DATA, PublishJsHandler.class.getName());
        METHOD_CLASS_MAP.put("openScheme", OpenSchemeJsHandler.class.getName());
        METHOD_CLASS_MAP.put("closeWindow", CloseWindowJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getNetworkType", GetNetworkTypeJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getNetworkTime", GetNetworkTimeJsHandler.class.getName());
        METHOD_CLASS_MAP.put("alert", AlertJsHandler.class.getName());
        METHOD_CLASS_MAP.put("confirm", ConfirmJsHandler.class.getName());
        METHOD_CLASS_MAP.put("prompt", PromptJsHandler.class.getName());
        METHOD_CLASS_MAP.put("actionSheet", ActionSheetJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getDeviceInfo", GetDeviceInfoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("pickContact", PickContactJsHandler.class.getName());
        METHOD_CLASS_MAP.put("checkVersion", CheckVersionJsHandler.class.getName());
        METHOD_CLASS_MAP.put("toast", ToastJsHandler.class.getName());
        METHOD_CLASS_MAP.put("vibrate", VibrateJsHandler.class.getName());
        METHOD_CLASS_MAP.put("autoLock", AutoLockJsHandler.class.getName());
        METHOD_CLASS_MAP.put("checkAuthorization", CheckAuthorizationJsHandler.class.getName());
        METHOD_CLASS_MAP.put("showKeyboard", ShowKeyboardJsHandler.class.getName());
        METHOD_CLASS_MAP.put("addRequestSignature", AddRequestSignatureJsHandler.class.getName());
        METHOD_CLASS_MAP.put("share", ShareJsHandler.class.getName());
        METHOD_CLASS_MAP.put("shareImage", ShareImageJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getUserInfo", GetUserInfoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getLocation", GetLocationJsHandler.class.getName());
        METHOD_CLASS_MAP.put("stopLocating", StopLocatingJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getFingerprint", GetFingerprintJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getCityInfo", GetCityInfoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("previewImage", PreviewImageJsHandler.class.getName());
        METHOD_CLASS_MAP.put("bind", BindJsHandler.class.getName());
        METHOD_CLASS_MAP.put("chooseImage", ChooseImageJsHandler.class.getName());
        METHOD_CLASS_MAP.put("chooseFile", ChooseFileJsHandler.class.getName());
        METHOD_CLASS_MAP.put("downloadImage", DownloadImageJsHandler.class.getName());
        METHOD_CLASS_MAP.put("logout", LogoutJsHandler.class.getName());
        METHOD_CLASS_MAP.put(Constants.EventType.PAY, PayJsHandler.class.getName());
        METHOD_CLASS_MAP.put("uploadPhoto", UploadPhotoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("login", LoginJsHandler.class.getName());
        METHOD_CLASS_MAP.put("jumpToScheme", JumpToSchemeJsHandler.class.getName());
        METHOD_CLASS_MAP.put("chooseMedia", ChooseMediaJsHandler.class.getName());
        METHOD_CLASS_MAP.put("playMedia", PlayMediaJsHandler.class.getName());
        METHOD_CLASS_MAP.put("uploadMedia", UploadMediaJsHandler.class.getName());
        METHOD_CLASS_MAP.put("editMedia", EditMediaJsHandler.class.getName());
        METHOD_CLASS_MAP.put("sendLog", LogJsHandler.class.getName());
        METHOD_CLASS_MAP.put("shareMiniProgram", ShareMiniProgramJsHandler.class.getName());
        METHOD_CLASS_MAP.put("setStorage", SetStorageJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getStorage", GetStorageJsHandler.class.getName());
        METHOD_CLASS_MAP.put("clearStorage", ClearStorageJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getAppInfo", GetAppInfoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getWifiInfo", GetWifiInfoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getImageInfo", GetImageInfoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("setupEvent", SetupEventJsHandler.class.getName());
        METHOD_CLASS_MAP.put("openMiniProgram", OpenMiniProgramJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getMediaFrame", GetMediaFrameJsHandler.class.getName());
        METHOD_CLASS_MAP.put("lxlog", StatisticsJsHandler.class.getName());
        METHOD_CLASS_MAP.put("requestPermission", RequestPermissionJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getServiceInfo", GetServiceInfoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("sendInnerLog", SendInnerLogJsHandler.class.getName());
        METHOD_CLASS_MAP.put("openAppSetting", OpenAppSettingHandler.class.getName());
        METHOD_CLASS_MAP.put("setResult", SetResultJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getResult", GetResultJsHandler.class.getName());
        METHOD_CLASS_MAP.put("capture", CaptureJsHandler.class.getName());
        METHOD_CLASS_MAP.put("sendSnifferLog", SendSnifferLogJsHandler.class.getName());
        METHOD_CLASS_MAP.put("setBrightness", SetBrightnessJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getBrightness", GetBrightnessJsHandler.class.getName());
        METHOD_CLASS_MAP.put("uploadFile", UploadFileJsHandler.class.getName());
        METHOD_CLASS_MAP.put("encryptData", EncryptDataJsHandler.class.getName());
        METHOD_CLASS_MAP.put("decryptData", DecryptDataJsHandler.class.getName());
        METHOD_CLASS_MAP.put("chooseVideo", ChooseVideoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("playVideo", PlayVideoJsHandler.class.getName());
        METHOD_CLASS_MAP.put("compressImage", CompressImageJsHandler.class.getName());
        METHOD_CLASS_MAP.put("uploadLog", UploadLogJsHandler.class.getName());
        METHOD_CLASS_MAP.put("setClipboard", SetClipboardJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getClipboard", GetClipboardJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getSafeArea", GetSafeAreaJsHandler.class.getName());
        METHOD_CLASS_MAP.put(ClosePageWithKeysJsHandler.TAG, ClosePageWithKeysJsHandler.class.getName());
        METHOD_CLASS_MAP.put("ble.startAdvertising", StartAdvertisingJsHandler.class.getName());
        METHOD_CLASS_MAP.put("ble.stopAdvertising", StopAdvertisingJsHandler.class.getName());
        METHOD_CLASS_MAP.put("ble.startScanData", StartScanDataJsHandler.class.getName());
        METHOD_CLASS_MAP.put("ble.stopScanData", StopScanDataJsHandler.class.getName());
        METHOD_CLASS_MAP.put("ble.requestPermission", BleRequestPermissionJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getWifiSwitchStatus", GetWifiSwitchStatusJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getWifiList", GetWifiListJsHandler.class.getName());
        METHOD_CLASS_MAP.put("connectWifi", ConnectWifiJsHandler.class.getName());
        METHOD_CLASS_MAP.put("sendBabelLog", SendBabelLogJsHandler.class.getName());
        METHOD_CLASS_MAP.put("getOfflineBundle", GetOfflineBundleJsHandler.class.getName());
        METHOD_CLASS_MAP.put("unregisterServiceWorker", UnregisterServiceWorkerJsHandler.class.getName());
    }

    public static void registerJsHandler(String str, Class<?> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "104c80c196a21fce90694364cbba3172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "104c80c196a21fce90694364cbba3172");
        } else if (isMethodValid(str) && METHOD_CLASS_MAP.get(str).equals(PRESENT)) {
            METHOD_CLASS_MAP.put(str, cls.getName());
        }
    }

    public static void registerJsHandler(String str, String str2, Class<?> cls) {
        Object[] objArr = {str, str2, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "56bed2ceafd2b86ef618d859ae3b905b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "56bed2ceafd2b86ef618d859ae3b905b");
        } else {
            registerJsHandler(str, str2, cls.getName());
        }
    }

    public static void registerJsHandler(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "452f16b977707363238fe032bfd7c493", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "452f16b977707363238fe032bfd7c493");
        } else {
            METHOD_CLASS_MAP.put(str, str3);
        }
    }

    public static String getRegisterJsHandlerName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b6fc02f24ca3ebd591f7a7303287ec0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b6fc02f24ca3ebd591f7a7303287ec0") : METHOD_CLASS_MAP.get(str);
    }

    public static JsHandler createJsHandler(JsHost jsHost, String str) {
        Object[] objArr = {jsHost, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00c7013d6e0501aae72a8b19fd7eadd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00c7013d6e0501aae72a8b19fd7eadd0");
        }
        Uri parse = Uri.parse(str);
        JsHandler createJsHandler = createJsHandler(jsHost, parse.isHierarchical() ? parse.getQueryParameter("method") : "", str, JsHandler.Source.TITANS);
        try {
            createJsHandler.parseJsScheme(str);
        } catch (Exception e) {
            if (createJsHandler instanceof InvalidJsHandler) {
                ((InvalidJsHandler) createJsHandler).setErrMsg("JsHandlerFactory_parseJsScheme", Log.getStackTraceString(e));
            }
        }
        createJsHandler.setJsHost(jsHost);
        return createJsHandler;
    }

    private static JsHandler createJsHandler(JsHost jsHost, String str, String str2, JsHandler.Source source) {
        JsHandler loadFromServiceLoader;
        Object[] objArr = {jsHost, str, str2, source};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83750f1f606ee8798f360bfa139fe4ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83750f1f606ee8798f360bfa139fe4ee");
        }
        if (!isMethodValid(str) || PRESENT.equals(METHOD_CLASS_MAP.get(str))) {
            loadFromServiceLoader = loadFromServiceLoader(str);
            if (loadFromServiceLoader == null) {
                loadFromServiceLoader = new InvalidJsHandler();
                ((InvalidJsHandler) loadFromServiceLoader).setErrMsg("JsHandlerFactory_createJsHandlerFromServiceLoader", "can not find JsHandler");
            }
        } else {
            try {
                loadFromServiceLoader = (BaseJsHandler) jsHost.getContext().getClassLoader().loadClass(METHOD_CLASS_MAP.get(str)).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                InvalidJsHandler invalidJsHandler = new InvalidJsHandler();
                invalidJsHandler.setErrMsg("JsHandlerFactory_createJsHandlerFromMap", Log.getStackTraceString(e));
                loadFromServiceLoader = invalidJsHandler;
            }
        }
        loadFromServiceLoader.jsBean().source = source;
        return loadFromServiceLoader;
    }

    public static JsHandler createJsHandler(JsHost jsHost, String str, String str2, String str3) {
        Object[] objArr = {jsHost, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3add7bbf5b2863b638d5ef30abe89622", RobustBitConfig.DEFAULT_VALUE) ? (JsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3add7bbf5b2863b638d5ef30abe89622") : createJsHandler(jsHost, str, str2, str3, JsHandler.Source.THRID);
    }

    public static JsHandler createJsHandler(JsHost jsHost, String str, String str2, String str3, JsHandler.Source source) {
        JSONObject jSONObject;
        Object[] objArr = {jsHost, str, str2, str3, source};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ab30800f847378f8a3ca14ba4a82f10", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ab30800f847378f8a3ca14ba4a82f10");
        }
        JsHandler createJsHandler = createJsHandler(jsHost, str, str, source);
        try {
            jSONObject = new JSONObject(str2);
        } catch (Exception e) {
            JSONObject jSONObject2 = new JSONObject();
            if (createJsHandler instanceof InvalidJsHandler) {
                ((InvalidJsHandler) createJsHandler).setErrMsg("JsHandlerFactory_parseArgs", Log.getStackTraceString(e));
            }
            jSONObject = jSONObject2;
        }
        createJsHandler.setJsHost(jsHost);
        createJsHandler.jsBean().method = str;
        createJsHandler.jsBean().args = str2;
        createJsHandler.jsBean().argsJson = jSONObject;
        createJsHandler.jsBean().callbackId = str3;
        return createJsHandler;
    }

    private static JsHandler loadFromServiceLoader(String str) {
        List list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BaseJsHandler baseJsHandler = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0e29b23a78ac66676b17045ff4a463c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0e29b23a78ac66676b17045ff4a463c");
        }
        try {
            list = b.a(BaseJsHandler.class, str);
        } catch (Throwable unused) {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            baseJsHandler = (BaseJsHandler) list.get(0);
        }
        if (baseJsHandler != null) {
            METHOD_CLASS_MAP.put(str, baseJsHandler.getClass().getName());
        }
        return baseJsHandler;
    }

    public static void removeJsHost(JsHost jsHost) {
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "10994d3eb687c59371d030b49f1b7fed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "10994d3eb687c59371d030b49f1b7fed");
            return;
        }
        synchronized (sJsHosts) {
            sJsHosts.remove(jsHost);
        }
    }

    public static void addJsHost(JsHost jsHost) {
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c0ab84cc27824e3dabc7f75def8bd50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c0ab84cc27824e3dabc7f75def8bd50");
            return;
        }
        synchronized (sJsHosts) {
            sJsHosts.add(jsHost);
        }
    }

    public static List<String> closePageWithKeys(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b350dceb2ff1a97b6de0a437e9665470", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b350dceb2ff1a97b6de0a437e9665470");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<JsHost> arrayList2 = new ArrayList();
        synchronized (sJsHosts) {
            Iterator<JsHost> it = sJsHosts.iterator();
            while (it.hasNext()) {
                JsHost next = it.next();
                if (set.contains(Uri.parse(next.getUrl()).getQueryParameter(ClosePageWithKeysJsHandler.URL_KEY))) {
                    arrayList2.add(next);
                }
            }
        }
        for (JsHost jsHost : arrayList2) {
            try {
                arrayList.add(jsHost.getUrl());
                jsHost.finish();
            } catch (Throwable th) {
                c.a("matchPageKeysFailed: " + Log.getStackTraceString(th), 35, new String[]{ClosePageWithKeysJsHandler.TAG});
            }
        }
        return arrayList;
    }

    @Deprecated
    public static void publish(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "723315fff1bd49dffc19f60906c7561c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "723315fff1bd49dffc19f60906c7561c");
        } else {
            PublishCenter.getInstance().publish(jSONObject.optString("action"), jSONObject);
        }
    }

    @Deprecated
    public static void publishOnReceive(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "98e25899f3e25f14e4cc2a8f63c07b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "98e25899f3e25f14e4cc2a8f63c07b45");
        } else {
            PublishCenter.getInstance().publish(jSONObject.optString("action"), jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void publishJsHost(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aed7ed66b89daac44ea38d521592a7eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aed7ed66b89daac44ea38d521592a7eb");
        } else if (jSONObject == null) {
        } else {
            synchronized (sJsHosts) {
                Iterator<JsHost> it = sJsHosts.iterator();
                while (it.hasNext()) {
                    it.next().publish(jSONObject);
                }
            }
        }
    }

    @Deprecated
    public static void publish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "739d0fa14ecf4f800f2af1dedab05b78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "739d0fa14ecf4f800f2af1dedab05b78");
            return;
        }
        synchronized (sJsHosts) {
            Iterator<JsHost> it = sJsHosts.iterator();
            while (it.hasNext()) {
                it.next().loadJs(str);
            }
        }
    }

    private static boolean isNameSpaceValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "043049e5141135cfe42c8e826142688d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "043049e5141135cfe42c8e826142688d")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\.");
            if (split.length == 0) {
                if (METHOD_CLASS_MAP.containsKey(str)) {
                    return true;
                }
            } else if (split.length == 1) {
                if (METHOD_CLASS_MAP.containsKey(split[0])) {
                    return true;
                }
            } else if (!VALID_DOMAINS.contains(split[0])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMethodValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a7150c21382dc3afc0ac872f71aa9d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a7150c21382dc3afc0ac872f71aa9d6")).booleanValue() : METHOD_CLASS_MAP.containsKey(str);
    }
}
