package com.sankuai.android.share.bean;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SharePanelData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean imageType;
    public ShareBaseBean shareBaseBean;
    public ShareExtraInfo shareExtraInfo;

    public SharePanelData(@NonNull ShareExtraInfo shareExtraInfo, ShareBaseBean shareBaseBean) {
        this.imageType = false;
        this.shareBaseBean = shareBaseBean;
        this.shareExtraInfo = shareExtraInfo;
    }

    public SharePanelData(@NonNull ShareExtraInfo shareExtraInfo, ShareBaseBean shareBaseBean, boolean z) {
        this.imageType = false;
        this.shareBaseBean = shareBaseBean;
        this.imageType = z;
        this.shareExtraInfo = shareExtraInfo;
    }
}
