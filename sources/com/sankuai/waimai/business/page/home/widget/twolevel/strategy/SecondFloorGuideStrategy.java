package com.sankuai.waimai.business.page.home.widget.twolevel.strategy;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SecondFloorGuideStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public int count;
    @Expose
    public int hours;
    @SerializedName("interval_minutes")
    @Expose
    public int intervalMinutes;
    @SerializedName("shown_list")
    @Expose
    public List<Long> shownList;
    @Expose
    public int version;

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int i) {
        this.hours = i;
    }

    public int getIntervalMinutes() {
        return this.intervalMinutes;
    }

    public void setIntervalMinutes(int i) {
        this.intervalMinutes = i;
    }

    public List<Long> getShownList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01fd7cd96d4d1d2e74b8dbb7be51ee02", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01fd7cd96d4d1d2e74b8dbb7be51ee02");
        }
        if (this.shownList == null) {
            this.shownList = new ArrayList();
        }
        return this.shownList;
    }

    public void setShownList(List<Long> list) {
        this.shownList = list;
    }
}
