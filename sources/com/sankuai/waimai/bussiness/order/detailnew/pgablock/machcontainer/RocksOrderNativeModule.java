package com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.addrsdk.manager.AddressApiManager;
import com.sankuai.waimai.bussiness.order.detail.WMOrderDetailActivity;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.utils.i;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class RocksOrderNativeModule implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    protected Context b;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class AddressItemParameter {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("addressItem")
        public AddressItem addressItem;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class CallbackStringInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public String content;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class ConfirmDialogParameter {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int cancelable;
        public boolean hasIcon;
        public String leftButtonTitle;
        public String message;
        public String rightButtonTitle;
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class DeleteAddressInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("address_view_id")
        public int id;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class LabelCloseCountParameter {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("addressId")
        public long addressId;
        @SerializedName("appUpgradeCheck")
        public int appUpgradeCheck;
        @SerializedName("write")
        public boolean write;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class Param {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("keys")
        public String[] keys;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class Parameter {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD)
        public int bold;
        @SerializedName("content")
        public String content;
        @SerializedName("contentList")
        public List<String> contentList;
        @SerializedName("fontSize")
        public int fontSize;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class PayRiderTipParameter {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("pay_token")
        public String pay_token;
        @SerializedName("pay_trade_no")
        public String pay_trade_no;
        @SerializedName(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)
        public int requestCode;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class ResponseDataString {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackStringInfo data;
        public int status = 0;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmrocksorder";
    }

    public RocksOrderNativeModule(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8816dfad9ae931b9dcd7005e3b4d00b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8816dfad9ae931b9dcd7005e3b4d00b");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d015e615c3e3a67fa2662d00004cd215", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d015e615c3e3a67fa2662d00004cd215") : new String[]{"openPush", "calculationStringWidth", "localToastIdentifier", "afterSaleGuideBubble", "currentDate", "cache", "showAddressGuide", "show_confirm_dialog", "startPay", "network_status", "order_confirm_data", "confirm_with_image_dialog", "delete_address_item"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, final String str3, final com.sankuai.waimai.mach.jsv8.a aVar) {
        char c;
        Object obj;
        Object obj2;
        Object b;
        int i;
        int j;
        int i2;
        String[] strArr;
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc90ad60172614026a084faa98c90aad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc90ad60172614026a084faa98c90aad");
        } else if (!TextUtils.isEmpty(str) || aa.a(str2)) {
            switch (str.hashCode()) {
                case -2132270676:
                    if (str.equals("calculationStringWidth")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1774480087:
                    if (str.equals("show_confirm_dialog")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1552334045:
                    if (str.equals("network_status")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1141464315:
                    if (str.equals("showAddressGuide")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -992383034:
                    if (str.equals("confirm_with_image_dialog")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -504753020:
                    if (str.equals("openPush")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -43878550:
                    if (str.equals("saveAddressItem")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 94416770:
                    if (str.equals("cache")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 418132581:
                    if (str.equals("afterSaleGuideBubble")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 600751303:
                    if (str.equals("currentDate")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 601235430:
                    if (str.equals("currentTime")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1271900954:
                    if (str.equals("order_confirm_data")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1316782310:
                    if (str.equals("startPay")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1352311442:
                    if (str.equals("delete_address_item")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1896845125:
                    if (str.equals("localToastIdentifier")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    CallbackTextInfo callbackTextInfo = new CallbackTextInfo();
                    ResponseText responseText = new ResponseText();
                    Parameter parameter = (Parameter) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(str2, new TypeToken<Parameter>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.1
                    }.getType());
                    Object[] objArr2 = {parameter};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    float f = 0.0f;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a97ffff7263416936e2c9717c496a782", RobustBitConfig.DEFAULT_VALUE)) {
                        f = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a97ffff7263416936e2c9717c496a782")).floatValue();
                    } else if (parameter != null) {
                        if (parameter.contentList != null) {
                            for (String str4 : parameter.contentList) {
                                if (a(str4, parameter.bold, parameter.fontSize) > f) {
                                    f = a(str4, parameter.bold, parameter.fontSize);
                                }
                            }
                        } else if (!TextUtils.isEmpty(parameter.content)) {
                            f = a(parameter.content, parameter.bold, parameter.fontSize);
                        }
                    }
                    callbackTextInfo.content = f;
                    responseText.data = callbackTextInfo;
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(responseText));
                    return;
                case 1:
                    if (this.b != null) {
                        i.b(this.b);
                        return;
                    }
                    return;
                case 2:
                    CallbackInfo callbackInfo = new CallbackInfo();
                    Response response = new Response();
                    boolean b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, "order_status_contact_poi_bubble", false);
                    if (!b2) {
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, "order_status_contact_poi_bubble", true);
                    }
                    callbackInfo.content = b2 ? 1 : 0;
                    response.data = callbackInfo;
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(response));
                    return;
                case 3:
                    CallbackInfo callbackInfo2 = new CallbackInfo();
                    Response response2 = new Response();
                    boolean b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, "after_sale_btn_prompt", false);
                    if (!b3) {
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, "after_sale_btn_prompt", true);
                    }
                    callbackInfo2.content = b3 ? 1 : 0;
                    response2.data = callbackInfo2;
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(response2));
                    return;
                case 4:
                    CallbackDateInfo callbackDateInfo = new CallbackDateInfo();
                    ResponseDateText responseDateText = new ResponseDateText();
                    callbackDateInfo.content = com.meituan.android.time.c.b() / 1000;
                    responseDateText.data = callbackDateInfo;
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(responseDateText));
                    return;
                case 5:
                    CallbackDateInfo callbackDateInfo2 = new CallbackDateInfo();
                    ResponseDateText responseDateText2 = new ResponseDateText();
                    callbackDateInfo2.content = System.currentTimeMillis();
                    responseDateText2.data = callbackDateInfo2;
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(responseDateText2));
                    return;
                case 6:
                    CallbackMapInfo callbackMapInfo = new CallbackMapInfo();
                    ResponseDataMap responseDataMap = new ResponseDataMap();
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "087027f665b8295312f0a0452d0c7498", RobustBitConfig.DEFAULT_VALUE)) {
                        obj = PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "087027f665b8295312f0a0452d0c7498");
                    } else {
                        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(str2);
                        if (a2 != null && a2.containsKey("state")) {
                            int a3 = r.a(String.valueOf(a2.get("type")), -1);
                            Object obj3 = a2.get("state");
                            switch (a3) {
                                case 0:
                                    Object[] objArr4 = {obj3};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8bd530d9a04f077d3ab63ece793a2dc6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8bd530d9a04f077d3ab63ece793a2dc6");
                                        break;
                                    } else {
                                        Map map = obj3 instanceof Map ? (Map) obj3 : null;
                                        if (map != null && map.containsKey("poiId")) {
                                            long parseLong = Long.parseLong(String.valueOf(map.get("poiId")));
                                            for (Map.Entry entry : map.entrySet()) {
                                                com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(parseLong, (String) entry.getKey(), entry.getValue());
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    Object[] objArr5 = {obj3};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "49babc1a83512ee6cb29dc69f7c18ec9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "49babc1a83512ee6cb29dc69f7c18ec9");
                                        break;
                                    } else {
                                        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                                        if (map2 != null) {
                                            String valueOf = String.valueOf(map2.get("stateKey"));
                                            if (!TextUtils.isEmpty(valueOf)) {
                                                Object obj4 = map2.get("stateValue");
                                                if (obj4 == null || "".equals(obj4)) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, (String) null);
                                                    break;
                                                } else if (obj4 instanceof Boolean) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, ((Boolean) obj4).booleanValue());
                                                    break;
                                                } else if (obj4 instanceof String) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, (String) obj4);
                                                    break;
                                                } else if (obj4 instanceof Integer) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, ((Integer) obj4).intValue());
                                                    break;
                                                } else if (obj4 instanceof Long) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, ((Long) obj4).longValue());
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Object[] objArr6 = {obj3};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e39c4b219c90839f456138f0bc8653b0", RobustBitConfig.DEFAULT_VALUE)) {
                                        Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
                                        if (map3 != null) {
                                            String valueOf2 = String.valueOf(map3.get("stateKey"));
                                            if (!TextUtils.isEmpty(valueOf2)) {
                                                Object obj5 = map3.get("stateValue");
                                                if (obj5 == null || "".equals(obj5)) {
                                                    b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, (String) null);
                                                } else if (obj5 instanceof Boolean) {
                                                    b = Boolean.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, ((Boolean) obj5).booleanValue()));
                                                } else if (obj5 instanceof String) {
                                                    b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, (String) obj5);
                                                } else if (obj5 instanceof Integer) {
                                                    b = Integer.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, ((Integer) obj5).intValue()));
                                                } else if (obj5 instanceof Long) {
                                                    b = Long.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, ((Long) obj5).longValue()));
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        obj = obj2;
                                        break;
                                    } else {
                                        b = PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e39c4b219c90839f456138f0bc8653b0");
                                    }
                                    obj2 = b;
                                    obj = obj2;
                                    break;
                                case 3:
                                    Object[] objArr7 = {obj3};
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "fd7a77de1cd42c55746c318aa57f3161", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "fd7a77de1cd42c55746c318aa57f3161");
                                        break;
                                    } else {
                                        Map map4 = obj3 instanceof Map ? (Map) obj3 : null;
                                        if (map4 != null) {
                                            String valueOf3 = String.valueOf(map4.get("stateKey"));
                                            if (!TextUtils.isEmpty(valueOf3)) {
                                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf3);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                            }
                        }
                        obj = null;
                    }
                    callbackMapInfo.content = obj;
                    responseDataMap.data = callbackMapInfo;
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(responseDataMap));
                    return;
                case 7:
                    CallbackInfo callbackInfo3 = new CallbackInfo();
                    Response response3 = new Response();
                    LabelCloseCountParameter labelCloseCountParameter = (LabelCloseCountParameter) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(str2, new TypeToken<LabelCloseCountParameter>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.2
                    }.getType());
                    Object[] objArr8 = {labelCloseCountParameter};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "28d9b4cdcaffdb849c72a18ebbd74fb0", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "28d9b4cdcaffdb849c72a18ebbd74fb0")).intValue();
                    } else if (labelCloseCountParameter == null) {
                        i = 0;
                    } else {
                        if (labelCloseCountParameter.appUpgradeCheck == 1 && (j = com.sankuai.waimai.platform.b.A().j()) > com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.OLD_VERSION, 0)) {
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a().b(PlatformSPKeys.WM_ORDER_CONFIRM_LABEL_COUNT);
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.OLD_VERSION, j);
                        }
                        int a4 = com.sankuai.waimai.platform.utils.sharedpreference.a.a(labelCloseCountParameter.addressId, 0);
                        if (labelCloseCountParameter.write) {
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a(labelCloseCountParameter.addressId, 1, 0);
                            i = 1;
                        } else {
                            i = a4;
                        }
                    }
                    callbackInfo3.content = i;
                    response3.data = callbackInfo3;
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(response3));
                    return;
                case '\b':
                    CallbackAddressItemInfo callbackAddressItemInfo = new CallbackAddressItemInfo();
                    ResponseDataAddressItem responseDataAddressItem = new ResponseDataAddressItem();
                    AddressItemParameter addressItemParameter = (AddressItemParameter) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(str2, new TypeToken<AddressItemParameter>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.3
                    }.getType());
                    if (addressItemParameter != null) {
                        com.sankuai.waimai.platform.domain.manager.location.a.b(this.b, addressItemParameter.addressItem);
                    }
                    callbackAddressItemInfo.content = null;
                    responseDataAddressItem.data = callbackAddressItemInfo;
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(responseDataAddressItem));
                    return;
                case '\t':
                    ConfirmDialogParameter confirmDialogParameter = (ConfirmDialogParameter) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(str2, (Class<Object>) ConfirmDialogParameter.class);
                    if (confirmDialogParameter != null) {
                        Object[] objArr9 = {confirmDialogParameter, aVar, str3};
                        ChangeQuickRedirect changeQuickRedirect9 = a;
                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "6b8862a484bf50968e8519817220bb9e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "6b8862a484bf50968e8519817220bb9e");
                            return;
                        }
                        final HashMap hashMap = new HashMap();
                        hashMap.put("status", 0);
                        final HashMap hashMap2 = new HashMap(1);
                        hashMap.put("data", hashMap2);
                        new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558963)).a(confirmDialogParameter.cancelable == 0).a(confirmDialogParameter.title).b(confirmDialogParameter.message).b(confirmDialogParameter.leftButtonTitle, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.8
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                Object[] objArr10 = {dialogInterface, Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "82262a7bdd786ce5a754ca8483131de8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "82262a7bdd786ce5a754ca8483131de8");
                                    return;
                                }
                                hashMap2.put("which", Integer.valueOf(i3));
                                aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap));
                            }
                        }).a(confirmDialogParameter.rightButtonTitle, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.7
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                Object[] objArr10 = {dialogInterface, Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "e04c362a0c99d6331d55901d200c9303", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "e04c362a0c99d6331d55901d200c9303");
                                    return;
                                }
                                hashMap2.put("which", Integer.valueOf(i3));
                                aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap));
                            }
                        }).b();
                        return;
                    }
                    return;
                case '\n':
                    PayRiderTipParameter payRiderTipParameter = (PayRiderTipParameter) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(str2, (Class<Object>) PayRiderTipParameter.class);
                    if (payRiderTipParameter != null) {
                        int i3 = payRiderTipParameter.requestCode;
                        com.sankuai.waimai.platform.capacity.pay.a.a((Activity) this.b, i3, payRiderTipParameter.pay_trade_no, payRiderTipParameter.pay_token);
                        if (this.b instanceof WMOrderDetailActivity) {
                            com.sankuai.waimai.bussiness.order.rocks.f fVar = ((WMOrderDetailActivity) this.b).b;
                            fVar.D = i3;
                            fVar.E = str3;
                            fVar.F = aVar;
                            return;
                        }
                        return;
                    }
                    return;
                case 11:
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("status", 0);
                    HashMap hashMap4 = new HashMap(1);
                    Object[] objArr10 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "4b842efe39f5807c0aa9d362faef0eac", RobustBitConfig.DEFAULT_VALUE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "4b842efe39f5807c0aa9d362faef0eac")).intValue();
                    } else if (p.f(this.b)) {
                        i2 = p.d(this.b) ? 2 : 3;
                    } else {
                        i2 = 1;
                    }
                    hashMap4.put("network", Integer.valueOf(i2));
                    hashMap3.put("data", hashMap4);
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap3));
                    return;
                case '\f':
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("status", 0);
                    HashMap hashMap6 = new HashMap();
                    for (String str5 : ((Param) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(str2, new TypeToken<Param>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.4
                    }.getType())).keys) {
                        Map<String, Object> a5 = com.sankuai.waimai.mach.utils.b.a(String.valueOf(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get(str5)));
                        if (a5 != null && a5.size() > 0) {
                            hashMap6.put(str5, a5);
                        } else {
                            hashMap6.put(str5, com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get(str5));
                        }
                    }
                    hashMap5.put("data", hashMap6);
                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap5));
                    return;
                case '\r':
                    final ConfirmDialogParameter confirmDialogParameter2 = (ConfirmDialogParameter) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(str2, (Class<Object>) ConfirmDialogParameter.class);
                    final HashMap hashMap7 = new HashMap();
                    hashMap7.put("status", 0);
                    final HashMap hashMap8 = new HashMap(1);
                    hashMap7.put("data", hashMap8);
                    Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr11 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect11 = a;
                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "f0c1cd3166754dd0d98849e9231e910c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "f0c1cd3166754dd0d98849e9231e910c");
                                return;
                            }
                            CustomDialog.a aVar2 = new CustomDialog.a(RocksOrderNativeModule.this.b);
                            aVar2.a(confirmDialogParameter2.title).b(confirmDialogParameter2.message).a(R.style.WmOrderDialogWindow).b(R.drawable.wm_order_confirm_address_not_in_range_2).a(confirmDialogParameter2.rightButtonTitle, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.5.2
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                    Object[] objArr12 = {dialogInterface, Integer.valueOf(i4)};
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "04ceac10c70ecd6dadd9056ab71e69d7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "04ceac10c70ecd6dadd9056ab71e69d7");
                                        return;
                                    }
                                    hashMap8.put("which", Integer.valueOf(i4));
                                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap7));
                                }
                            }).b(confirmDialogParameter2.leftButtonTitle, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.5.1
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                    Object[] objArr12 = {dialogInterface, Integer.valueOf(i4)};
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "0cca59f68116774167367f2bf5cd0cb3", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "0cca59f68116774167367f2bf5cd0cb3");
                                        return;
                                    }
                                    hashMap8.put("which", Integer.valueOf(i4));
                                    aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap7));
                                }
                            }).a(true);
                            aVar2.b();
                        }
                    };
                    Object[] objArr11 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "5292c693a5c42ed14cdd232155ca51c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "5292c693a5c42ed14cdd232155ca51c0");
                        return;
                    } else if (Looper.myLooper() == Looper.getMainLooper()) {
                        runnable.run();
                        return;
                    } else {
                        com.sankuai.waimai.touchmatrix.rebuild.utils.e.a(runnable);
                        return;
                    }
                case 14:
                    DeleteAddressInfo deleteAddressInfo = (DeleteAddressInfo) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(str2, (Class<Object>) DeleteAddressInfo.class);
                    if (deleteAddressInfo.id > 0) {
                        int i4 = deleteAddressInfo.id;
                        Object[] objArr12 = {Integer.valueOf(i4), aVar, str3};
                        ChangeQuickRedirect changeQuickRedirect12 = a;
                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "8dcd1df998f482423e7f66b3ee989f28", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "8dcd1df998f482423e7f66b3ee989f28");
                            return;
                        }
                        AddressApiManager addressApiManager = AddressApiManager.getInstance();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i4);
                        addressApiManager.delect(sb.toString(), new com.sankuai.waimai.addrsdk.mvp.model.d() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule.6
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.addrsdk.mvp.model.d
                            public final void a(Object obj6) {
                                Object[] objArr13 = {obj6};
                                ChangeQuickRedirect changeQuickRedirect13 = a;
                                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "69ca9337b255ed1b7348d998b2b41487", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "69ca9337b255ed1b7348d998b2b41487");
                                    return;
                                }
                                HashMap hashMap9 = new HashMap();
                                hashMap9.put("status", -1);
                                HashMap hashMap10 = new HashMap();
                                hashMap10.put("code", -1);
                                hashMap9.put("data", hashMap10);
                                aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap9));
                            }

                            @Override // com.sankuai.waimai.addrsdk.mvp.model.d
                            public final void b(Object obj6) {
                                Object[] objArr13 = {obj6};
                                ChangeQuickRedirect changeQuickRedirect13 = a;
                                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "7b5409e82626482c7fc40250b254ec15", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "7b5409e82626482c7fc40250b254ec15");
                                    return;
                                }
                                HashMap hashMap9 = new HashMap();
                                hashMap9.put("status", 0);
                                HashMap hashMap10 = new HashMap();
                                hashMap10.put("code", 0);
                                hashMap9.put("data", hashMap10);
                                aVar.a(str3, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap9));
                            }
                        });
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private float a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca36e2cb490a6ce60f5930bad71863d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca36e2cb490a6ce60f5930bad71863d3")).floatValue();
        }
        Paint paint = new Paint();
        paint.setTextSize(i2);
        paint.setTypeface(i == 1 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class CallbackInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public int content;

        public CallbackInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class CallbackTextInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public float content;

        public CallbackTextInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class CallbackDateInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public long content;

        public CallbackDateInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class CallbackMapInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public Object content;

        public CallbackMapInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class CallbackAddressItemInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public AddressItem content;

        public CallbackAddressItemInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class Response {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackInfo data;
        public int status;

        public Response() {
            this.status = 0;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class ResponseText {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackTextInfo data;
        public int status;

        public ResponseText() {
            this.status = 0;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class ResponseDateText {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackDateInfo data;
        public int status;

        public ResponseDateText() {
            this.status = 0;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class ResponseDataMap {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackMapInfo data;
        public int status;

        public ResponseDataMap() {
            this.status = 0;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static final class ResponseDataAddressItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackAddressItemInfo data;
        public int status;

        public ResponseDataAddressItem() {
            this.status = 0;
        }
    }
}
