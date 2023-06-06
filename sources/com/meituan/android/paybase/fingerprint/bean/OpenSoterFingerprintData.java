package com.meituan.android.paybase.fingerprint.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OpenSoterFingerprintData implements Serializable {
    public static final int FINGER_TYPE = 2;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4655788762552332667L;
    private String challenge;
    private Map<String, String> passThroughParams;
    private String scene;
    private String submitUrl;

    public int getFingerType() {
        return 2;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public OpenSoterFingerprintData(String str, String str2, String str3, Map<String, String> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e923ba1b24ae2cf430e7e3524116951b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e923ba1b24ae2cf430e7e3524116951b");
            return;
        }
        this.submitUrl = str;
        this.challenge = str2;
        this.scene = str3;
        this.passThroughParams = map;
    }

    public String getChallenge() {
        return this.challenge;
    }

    public void setChallenge(String str) {
        this.challenge = str;
    }

    public OpenSoterFingerprintData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4e0571b73f1bf5830511554f613fb54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4e0571b73f1bf5830511554f613fb54");
        } else {
            this.challenge = str;
        }
    }

    public String getScene() {
        return this.scene;
    }

    public void setScene(String str) {
        this.scene = str;
    }

    public Map<String, String> getPassThroughParams() {
        return this.passThroughParams;
    }

    public void setPassThroughParams(HashMap<String, String> hashMap) {
        this.passThroughParams = hashMap;
    }
}
