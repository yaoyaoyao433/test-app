package com.sankuai.android.share.bean;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.android.share.interfaces.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShareChannelData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ShareBaseBean shareBaseBean;
    public ShareExtraInfo shareExtraInfo;
    public b.a shareType;

    public ShareChannelData(@NonNull ShareExtraInfo shareExtraInfo, b.a aVar, ShareBaseBean shareBaseBean) {
        this.shareType = aVar;
        this.shareBaseBean = shareBaseBean;
        this.shareExtraInfo = shareExtraInfo;
    }
}
