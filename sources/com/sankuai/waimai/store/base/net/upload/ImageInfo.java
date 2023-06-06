package com.sankuai.waimai.store.base.net.upload;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ImageInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(QuickReportConstants.CONFIG_FILE_NAME)
    public String fileName;
    @SerializedName("path")
    public String filePath;
    @SerializedName("url")
    public String url;
}
