package com.sankuai.meituan.mtlive.rtmp.impl.tx.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ugc.TXRecordCommon;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VideoRecordResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String coverPath;
    public String descMsg;
    public int retCode;
    public String videoPath;

    public static VideoRecordResult convert(TXRecordCommon.TXRecordResult tXRecordResult) {
        Object[] objArr = {tXRecordResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38dfe8f8d00e94bdcd8ba68445f64655", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoRecordResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38dfe8f8d00e94bdcd8ba68445f64655");
        }
        if (tXRecordResult == null) {
            return null;
        }
        VideoRecordResult videoRecordResult = new VideoRecordResult();
        videoRecordResult.retCode = tXRecordResult.retCode;
        videoRecordResult.descMsg = tXRecordResult.descMsg;
        videoRecordResult.videoPath = tXRecordResult.videoPath;
        videoRecordResult.coverPath = tXRecordResult.coverPath;
        return videoRecordResult;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59bf2975600de69a00161f019a0f4f38", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59bf2975600de69a00161f019a0f4f38");
        }
        return "retCode: " + this.retCode + " videoPath : " + this.videoPath + " coverPath: " + this.coverPath;
    }
}
