package com.sankuai.waimai.kit.share.bean;

import android.support.constraint.R;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AppBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String activityName;
    private int appIcon;
    private String appName;
    private int id;
    private String packageName;

    public AppBean(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "353e391d93a53ee6b2fcae5243c29f7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "353e391d93a53ee6b2fcae5243c29f7c");
            return;
        }
        this.id = i;
        this.appIcon = i2;
        int i3 = this.id;
        if (i3 == 4) {
            this.appName = b.a.getString(R.string.kit_wechat_moments);
        } else if (i3 != 8) {
            switch (i3) {
                case 1:
                    this.appName = b.a.getString(R.string.kit_qq_zone);
                    return;
                case 2:
                    this.appName = b.a.getString(R.string.kit_wechat_friends);
                    return;
                default:
                    return;
            }
        } else {
            this.appName = b.a.getString(R.string.kit_qq_friends);
        }
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String getActivityName() {
        return this.activityName;
    }

    public void setActivityName(String str) {
        this.activityName = str;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getAppIcon() {
        return this.appIcon;
    }

    public void setAppIcon(int i) {
        this.appIcon = i;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }
}
