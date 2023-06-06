package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PrimaryFilterCondList implements Serializable {
    public static final int OPEN_GRAY_IMG = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bubble")
    public Bubble bubble;
    @SerializedName("code")
    public long code;
    @SerializedName("float_selected_bg")
    public String floatSelectedBg;
    @SerializedName("gray_switch")
    public int graySwitch;
    @SerializedName("gray_url")
    private String grayUrl;
    @SerializedName("guide_text_a")
    public String guideTextMain;
    @SerializedName("guide_text_b")
    public String guideTextSub;
    @SerializedName("url")
    public String iconUrl;
    public boolean isSelected;
    @SerializedName("drug_king_kong_toast")
    public String kingkongToast;
    public long lastClicked;
    @SerializedName("name")
    public String name;
    @SerializedName("search_category_type")
    public long searchCategoryType;
    @SerializedName("skip_protocol")
    public String skipProtocol;
    @SerializedName("target_channel_id")
    public String targetChannelId;
    @SerializedName("target_channel_text")
    public String targetChannelText;

    public PrimaryFilterCondList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67314d0f78dd9b1be732aa8600109c4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67314d0f78dd9b1be732aa8600109c4c");
            return;
        }
        this.isSelected = false;
        this.lastClicked = 0L;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Bubble implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bg_color")
        public String bgColor;
        @SerializedName("bubble_id")
        public int bubbleId;
        public long clickTime;
        @SerializedName("color")
        public String color;
        @SerializedName("content")
        public String content;
        @SerializedName("etime")
        public long etime;
        public boolean isShow;
        @SerializedName("priority")
        public int priority;
        @SerializedName("show_strategy")
        public int showLoop;
        @SerializedName("stime")
        public long stime;
        @SerializedName("strategy_id")
        public String strategyId;
        @SerializedName("type")
        public int type;

        public Bubble() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c673ae9666c4dbb924ac942e109cf27", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c673ae9666c4dbb924ac942e109cf27");
            } else {
                this.clickTime = -1L;
            }
        }

        public boolean showLoop() {
            return this.showLoop == 1;
        }

        public void parseBubble(Bubble bubble) {
            Object[] objArr = {bubble};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "582ab80d3b4fb26cdc20754506068d46", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "582ab80d3b4fb26cdc20754506068d46");
                return;
            }
            this.strategyId = bubble.strategyId;
            this.bubbleId = bubble.bubbleId;
            this.bgColor = bubble.bgColor;
            this.color = bubble.color;
            this.etime = bubble.etime;
            this.showLoop = bubble.showLoop;
            this.stime = bubble.stime;
            this.type = bubble.type;
            this.content = bubble.content;
            this.priority = bubble.priority;
        }
    }

    public String getIconUrl() {
        if (this.graySwitch == 1) {
            return this.grayUrl;
        }
        return this.iconUrl;
    }
}
