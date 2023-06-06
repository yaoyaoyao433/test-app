package com.meituan.android.cashier.oneclick.model.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OneClickPayOpenInfo implements Serializable {
    public static final int SCENE_ONECLICKPAY = 2;
    public static final int SCENE_ONLY_OPEN_ONECLICKPAY = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4849478800434299753L;
    private String creditPayUtmSource;
    private String path;
    private int scene;

    public int getScene() {
        return this.scene;
    }

    public void setScene(int i) {
        this.scene = i;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getCreditPayUtmSource() {
        return this.creditPayUtmSource;
    }

    public void setCreditPayUtmSource(String str) {
        this.creditPayUtmSource = str;
    }
}
