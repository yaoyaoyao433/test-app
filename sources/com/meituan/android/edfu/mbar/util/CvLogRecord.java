package com.meituan.android.edfu.mbar.util;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Queue;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class CvLogRecord {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean MBarMode;
    private int coreNum;
    private boolean detectSuccess;
    private String faildsession;
    private int imageHeight;
    private int imageWidth;
    private boolean isMBarScanSuccess;
    private Queue<float[]> mBarRectInfos;
    private long memInfo;
    private long memLeft;
    private long scanDuration;
    private String scanResult;

    public String getFaildsession() {
        return this.faildsession;
    }

    public void setFaildsession(String str) {
        this.faildsession = str;
    }

    public boolean isMBarScanSuccess() {
        return this.isMBarScanSuccess;
    }

    public void setMBarScanSuccess(boolean z) {
        this.isMBarScanSuccess = z;
    }

    public long getScanDuration() {
        return this.scanDuration;
    }

    public void setScanDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05d4c4fcaa21e61a3c70d28861ecfddc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05d4c4fcaa21e61a3c70d28861ecfddc");
        } else {
            this.scanDuration = j;
        }
    }

    public String getScanResult() {
        return this.scanResult;
    }

    public void setScanResult(String str) {
        this.scanResult = str;
    }

    public boolean isDetectSuccess() {
        return this.detectSuccess;
    }

    public void setDetectSuccess(boolean z) {
        this.detectSuccess = z;
    }

    public int getCoreNum() {
        return this.coreNum;
    }

    public void setCoreNum(int i) {
        this.coreNum = i;
    }

    public long getMemInfo() {
        return this.memInfo;
    }

    public void setMemInfo(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0788a0ed9eb91d0c6f9d0c80544eea0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0788a0ed9eb91d0c6f9d0c80544eea0f");
        } else {
            this.memInfo = j;
        }
    }

    public long getMemLeft() {
        return this.memLeft;
    }

    public void setMemLeft(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a531b9ac67e2f6a70f21ad2883b97956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a531b9ac67e2f6a70f21ad2883b97956");
        } else {
            this.memLeft = j;
        }
    }

    public boolean isMBarMode() {
        return this.MBarMode;
    }

    public void setMBarMode(boolean z) {
        this.MBarMode = z;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public void setImageWidth(int i) {
        this.imageWidth = i;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public void setImageHeight(int i) {
        this.imageHeight = i;
    }

    public Queue<float[]> getBarRectInfos() {
        return this.mBarRectInfos;
    }

    public void setBarRectInfos(Queue<float[]> queue) {
        this.mBarRectInfos = queue;
    }
}
