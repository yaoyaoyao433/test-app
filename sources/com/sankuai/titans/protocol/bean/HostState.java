package com.sankuai.titans.protocol.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HostState {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("appear")
    @Expose
    public boolean appear;
    @SerializedName("current_download_url")
    @Expose
    public String currentDownloadUrl;
    @SerializedName("foreground")
    @Expose
    public boolean foreground;
    @SerializedName("page_start_load_time")
    @Expose
    public long page_start_load_time;
    @SerializedName("page_tti_done")
    @Expose
    public boolean page_tti_done;
}
