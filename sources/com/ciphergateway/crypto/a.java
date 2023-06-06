package com.ciphergateway.crypto;

import com.meituan.robust.common.CommonConstant;
import com.tencent.rtmp.downloader.TXVodDownloadManager;
import com.tencent.ugc.TXVideoEditConstants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum a {
    UNKNOW_ERROR("unknow error", -1),
    INVALID_PARAMETER("invalid parameter", -1000),
    INVALID_ENGINE("invalid engine", -1001),
    ALLOCATE_MEMORY_FAILED("allocate memory failed", -1002),
    INVALID_ALGORITHM("illegal algorithm", TXVideoEditConstants.ERR_UNFOUND_FILEINFO),
    NOT_INIT("not init", -5000),
    INIT_FAILED("init failed", TXVodDownloadManager.DOWNLOAD_AUTH_FAILED);
    
    private String h;
    private int i;

    a(String str, int i) {
        this.h = str;
        this.i = i;
    }

    private String d(String str) {
        return this.i + ": " + this.h + " [" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }

    public static Error a(String str) {
        return new Error(INVALID_PARAMETER.d(str));
    }

    public static Error b(String str) {
        return new Error(INVALID_ALGORITHM.d(str));
    }

    public static Error c(String str) {
        return new Error(INIT_FAILED.d(str));
    }
}
