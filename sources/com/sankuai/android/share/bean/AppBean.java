package com.sankuai.android.share.bean;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AppBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private transient int appIcon;
    private String appName;
    private String bubbleText;
    private transient Drawable icon;
    private int id;

    public AppBean() {
    }

    public AppBean(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed6c6135d70cb6d563eb687c96907cdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed6c6135d70cb6d563eb687c96907cdb");
            return;
        }
        this.id = i;
        this.appIcon = i2;
        this.appName = str;
    }

    public int getAppIcon() {
        return this.appIcon;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public void setAppIcon(int i) {
        this.appIcon = i;
    }

    public void setIcon(Drawable drawable) {
        this.icon = drawable;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setBubbleText(String str) {
        this.bubbleText = str;
    }

    public String getBubbleText() {
        return this.bubbleText;
    }
}
