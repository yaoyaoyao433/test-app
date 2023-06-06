package com.meituan.msi.api.component.video.bean;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class VideoProgressEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public float currentTime;
    public int duration;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae743e21e3ae0cbbdbf8bf894a9c42d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae743e21e3ae0cbbdbf8bf894a9c42d2");
        }
        return "VideoPlayProgress{currentTime=" + this.currentTime + ", duration=" + this.duration + '}';
    }
}
