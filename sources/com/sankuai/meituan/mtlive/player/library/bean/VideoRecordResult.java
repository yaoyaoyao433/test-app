package com.sankuai.meituan.mtlive.player.library.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VideoRecordResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String coverPath;
    private String descMsg;
    private int retCode;
    private String videoPath;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e529562778d53f25cb367f0cd5510d6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e529562778d53f25cb367f0cd5510d6e");
        }
        return "retCode: " + this.retCode + " videoPath : " + this.videoPath + " coverPath: " + this.coverPath;
    }

    public void setRetCode(int i) {
        this.retCode = i;
    }

    public String getDescMsg() {
        return this.descMsg;
    }

    public void setDescMsg(String str) {
        this.descMsg = str;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setCoverPath(String str) {
        this.coverPath = str;
    }

    public String getCoverPath() {
        return this.coverPath;
    }

    public String getVideoPath() {
        return this.videoPath;
    }
}
