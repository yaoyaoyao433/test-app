package com.sankuai.xm.file.bean;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class StatisticEntry {
    public static final String DOWNLOAD_URL = "api.neixin.cn/sdk/file/download";
    public static final String UPLOAD_URL = "api.neixin.cn/sdk/file/upload";
    public static ChangeQuickRedirect changeQuickRedirect;
    public long calculateMD5Time;
    public long checkExistTime;
    public long createPathTime;
    public long divideBlockTime;
    public long getUrlTime;
    public int httpCode;
    public long registerBlockTime;
    public long startSize;
    public long taskEndTime;
    public long taskStartTime;
    public int bizCode = 0;
    public String msg = "";
    public String url = "";
    public String realDownloadUrl = "";
    public boolean useCdn = false;
    public String localIP = "";
}
