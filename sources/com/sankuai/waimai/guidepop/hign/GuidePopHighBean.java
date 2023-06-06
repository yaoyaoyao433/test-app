package com.sankuai.waimai.guidepop.hign;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GuidePopHighBean {
    @SerializedName("positions")
    public ArrayList<a> a;
    @SerializedName("frequency")
    public Frequency b;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class Frequency {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("count")
        public int count;
        @SerializedName("frequency_key")
        public String frequencyKey;
        @SerializedName("time")
        public long time;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("resources")
        public ArrayList<AlertInfo> a;
    }
}
