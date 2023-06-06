package com.meituan.msc.modules.api.msi.api;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class PullDownRefreshParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int pageId;

    public PullDownRefreshParam(int i) {
        this.pageId = i;
    }
}
