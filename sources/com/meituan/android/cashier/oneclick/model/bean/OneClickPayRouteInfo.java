package com.meituan.android.cashier.oneclick.model.bean;

import com.google.gson.JsonObject;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OneClickPayRouteInfo implements Serializable {
    public static final int ROUTE_STATUS_CASHIER = 1;
    public static final int ROUTE_STATUS_ONECLICKPAY = 0;
    public static final int ROUTE_STATUS_ONECLICKPAY_OLD = 2;
    public static final String SCENE_ONE_CLICK_PAY_CONFIRM = "oneClickPayConfirm";
    public static final String SCENE_ONE_CLICK_PAY_CREDIT_PAY_OPEN = "oneClickPayCreditPayOpen";
    public static final String SCENE_ONE_CLICK_PAY_DEGRADE = "oneClickPayDegrade";
    public static final String SCENE_ONLY_USE_ONE_CLICK_PAY = "onlyUseOneClickPay";
    public static final String SCENE_OPEN_ONE_CLICK_PAY_ADJUST_PAYLIST = "openOneClickPayAdjustPayList";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6474845490739271588L;
    private OneClickPayExtendInfo extendInfo;
    private OneClickPayOpenInfo guideOpenInfo;
    private JsonObject halfScreenWindow;
    private String routePath;
    private int routeStatus;
    private String scene;

    public JsonObject getHalfScreenWindow() {
        return this.halfScreenWindow;
    }

    public void setHalfScreenWindow(JsonObject jsonObject) {
        this.halfScreenWindow = jsonObject;
    }

    public int getRouteStatus() {
        return this.routeStatus;
    }

    public void setRouteStatus(int i) {
        this.routeStatus = i;
    }

    public String getRoutePath() {
        return this.routePath;
    }

    public void setRoutePath(String str) {
        this.routePath = str;
    }

    public String getScene() {
        return this.scene;
    }

    public void setScene(String str) {
        this.scene = str;
    }

    public OneClickPayOpenInfo getOpenInfo() {
        return this.guideOpenInfo;
    }

    public void setOpenInfo(OneClickPayOpenInfo oneClickPayOpenInfo) {
        this.guideOpenInfo = oneClickPayOpenInfo;
    }

    public OneClickPayExtendInfo getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(OneClickPayExtendInfo oneClickPayExtendInfo) {
        this.extendInfo = oneClickPayExtendInfo;
    }
}
