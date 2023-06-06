package com.sankuai.meituan.mtlive.ugc.library.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTPartInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long duration;
    private String path;

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e696fbdc93c7d0aa584d65114b42c694", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e696fbdc93c7d0aa584d65114b42c694");
        } else {
            this.duration = j;
        }
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }
}
