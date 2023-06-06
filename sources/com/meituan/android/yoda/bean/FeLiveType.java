package com.meituan.android.yoda.bean;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FeLiveType {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int faceBlockDet;
    public int faceLivenessDet;
    public int faceMaskDet;
    public String feLiveType;
    public int picQualityDet;

    public FeLiveType(String str) {
        this.feLiveType = str;
        if (str.contains("1")) {
            this.faceLivenessDet = 1;
        } else {
            this.faceLivenessDet = 0;
        }
        if (str.contains("2")) {
            this.faceBlockDet = 1;
        } else {
            this.faceBlockDet = 0;
        }
        if (str.contains("3")) {
            this.faceMaskDet = 1;
        } else {
            this.faceMaskDet = 0;
        }
        if (str.contains("4")) {
            this.picQualityDet = 1;
        } else {
            this.picQualityDet = 0;
        }
    }
}
