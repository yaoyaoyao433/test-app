package com.meituan.android.cashier.oneclick.model.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OpenOneClickPay implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1509204748239167146L;
    private int closeTime;
    private String creditPayOpenMsg;
    private String message;
    private boolean opened;
    private int scene;
    private String secondToastMessage;
    private String secondToastSubText;
    private boolean secondToastSwitch;
    private String secondToastText;
    private String secondToastTitle;
    private boolean showCloseBtn;
    private String url;

    public boolean isOpened() {
        return this.opened;
    }

    public boolean isSecondToastSwitch() {
        return this.secondToastSwitch;
    }

    public int getScene() {
        return this.scene;
    }

    public String getUrl() {
        return this.url;
    }

    public String getMessage() {
        return this.message;
    }

    public String getSecondToastMessage() {
        return this.secondToastMessage;
    }

    public void setOpened(boolean z) {
        this.opened = z;
    }

    public void setSecondToastSwitch(boolean z) {
        this.secondToastSwitch = z;
    }

    public void setSecondToastMessage(String str) {
        this.secondToastMessage = str;
    }

    public void setScene(int i) {
        this.scene = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public boolean isShowCloseBtn() {
        return this.showCloseBtn;
    }

    public void setShowCloseBtn(boolean z) {
        this.showCloseBtn = z;
    }

    public int getCloseTime() {
        return this.closeTime;
    }

    public void setCloseTime(int i) {
        this.closeTime = i;
    }

    public String getCreditPayOpenMsg() {
        return this.creditPayOpenMsg;
    }

    public void setCreditPayOpenMsg(String str) {
        this.creditPayOpenMsg = str;
    }

    public String getSecondToastTitle() {
        return this.secondToastTitle;
    }

    public void setSecondToastTitle(String str) {
        this.secondToastTitle = str;
    }

    public String getSecondToastSubText() {
        return this.secondToastSubText;
    }

    public void setSecondToastSubText(String str) {
        this.secondToastSubText = str;
    }

    public String getSecondToastText() {
        return this.secondToastText;
    }

    public void setSecondToastText(String str) {
        this.secondToastText = str;
    }
}
