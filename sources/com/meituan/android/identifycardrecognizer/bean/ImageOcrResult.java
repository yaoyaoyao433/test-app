package com.meituan.android.identifycardrecognizer.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class ImageOcrResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5096961910075489219L;
    private IdentifyInfo identifyInfo;
    private PassportInfo passportInfo;

    public PassportInfo getPassportInfo() {
        return this.passportInfo;
    }

    public void setPassportInfo(PassportInfo passportInfo) {
        this.passportInfo = passportInfo;
    }

    public IdentifyInfo getIdentifyInfo() {
        return this.identifyInfo;
    }

    public void setIdentifyInfo(IdentifyInfo identifyInfo) {
        this.identifyInfo = identifyInfo;
    }
}
