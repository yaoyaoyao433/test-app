package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGReceiveAddressData extends SGIMRobotPraiseData {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -709704252846095240L;
    @SerializedName(GearsLocator.ADDRESS)
    public ReceiveAddressData mAddressData;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ReceiveAddressData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("distance")
        public String distance;
        @SerializedName("mapPic")
        public String mapPic;
        @SerializedName("poiAddress")
        public String poiAddress;
        @SerializedName("poiName")
        public String poiName;
    }
}
