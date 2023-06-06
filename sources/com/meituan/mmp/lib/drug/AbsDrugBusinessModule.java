package com.meituan.mmp.lib.drug;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsDrugBusinessModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsCollectPoi extends ApiFunction<RequestInfo, RequestInfo> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsGetNativeShopCartData extends ApiFunction<RequestInfo, RequestInfo> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsGetShopCartData extends ApiFunction<RequestInfo, RequestInfo> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsSubmitOrder extends ApiFunction<RequestInfo, RequestInfo> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsUpdateNativeShopCartDataextends extends ApiFunction<RequestInfo, RequestInfo> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class JumpToPoiChatPage extends ApiFunction<RequestInfo, RequestInfo> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class PurchaseNow extends ApiFunction<RequestInfo, RequestInfo> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class RequestInfo implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String jsonInfo;
    }
}
