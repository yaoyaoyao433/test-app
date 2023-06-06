package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CardScenes implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("need_top_scenes")
    public boolean needTopScene;
    @SerializedName("positions")
    public List<Position> positions;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String sceneScheme;
    @SerializedName("scenes")
    public List<CardScene> scenes;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CardScene implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public String sceneCode;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String sceneIcon;
        @SerializedName("sub_title")
        public String sceneSubTitle;
        @SerializedName("title")
        public String sceneTitle;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Position implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("index")
        public int cardIndex;
        @SerializedName("title")
        public String cardTitle;
    }
}
