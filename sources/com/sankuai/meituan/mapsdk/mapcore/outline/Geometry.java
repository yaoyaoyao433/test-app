package com.sankuai.meituan.mapsdk.mapcore.outline;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.rj;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class Geometry {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("dalu")
    @Keep
    private ArrayList<ArrayList<ArrayList<Double>>> mainlands;
    @SerializedName(rj.h)
    @Keep
    private ArrayList<ArrayList<ArrayList<Double>>> taiwans;
    @Keep
    private String version;

    @Keep
    public void setVersion(String str) {
        this.version = str;
    }

    @Keep
    public void setMainlands(ArrayList<ArrayList<ArrayList<Double>>> arrayList) {
        this.mainlands = arrayList;
    }

    @Keep
    public void setTaiwans(ArrayList<ArrayList<ArrayList<Double>>> arrayList) {
        this.taiwans = arrayList;
    }

    @Keep
    public String getVersion() {
        return this.version;
    }

    @Keep
    public Mainland getMainlands() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "107d7e175cbefb6933e200bc077c56aa", RobustBitConfig.DEFAULT_VALUE) ? (Mainland) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "107d7e175cbefb6933e200bc077c56aa") : new Mainland(this.mainlands);
    }

    @Keep
    public Taiwan getTaiwan() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffecfdf9f87001c41346b0cfb543e423", RobustBitConfig.DEFAULT_VALUE) ? (Taiwan) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffecfdf9f87001c41346b0cfb543e423") : new Taiwan(this.taiwans);
    }
}
