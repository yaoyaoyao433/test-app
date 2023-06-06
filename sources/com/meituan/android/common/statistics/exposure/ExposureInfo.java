package com.meituan.android.common.statistics.exposure;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExposureInfo {
    private static final String TAG = "ExposureInfo";
    public static ChangeQuickRedirect changeQuickRedirect;
    private AbstractExposureInfo mExposureInfo;
    private boolean mIsValid;

    public ExposureInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map, int i, String str9, long j, EventName eventName) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, map, Integer.valueOf(i), str9, new Long(j), eventName};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2988d9e546d7ddb7232760fa3ae7ece8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2988d9e546d7ddb7232760fa3ae7ece8");
            return;
        }
        this.mIsValid = true;
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            this.mExposureInfo = new ExposureInfoRemote(str, str2, str3, str4, str5, str6, str7, str8, map, i, str9, j, eventName);
        } else {
            this.mExposureInfo = new ExposureInfoLocal(str, str2, str3, str4, str5, str6, str7, str8, map, i, str9, j, eventName);
        }
    }

    public void mv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48fc7dabfaab7a42b70a126c8206a8e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48fc7dabfaab7a42b70a126c8206a8e6");
        } else if (isValid()) {
            this.mExposureInfo.mv();
        }
    }

    public void md() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f536e69ce0b9a871a05b44fc9315b008", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f536e69ce0b9a871a05b44fc9315b008");
        } else if (isValid()) {
            this.mExposureInfo.md();
        }
    }

    public void md(AbstractExposureInfo abstractExposureInfo) {
        Object[] objArr = {abstractExposureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f8c337210aecba4337f351881448698", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f8c337210aecba4337f351881448698");
        } else if (isValid()) {
            this.mExposureInfo.md(abstractExposureInfo);
        }
    }

    public void mrnModelDisappear(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f777791373a0d04eba883e6cfaea1cab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f777791373a0d04eba883e6cfaea1cab");
        } else if (isValid()) {
            this.mExposureInfo.mrnModelDisappear(j, j2, i);
        }
    }

    public void modelDisappear(AbstractExposureInfo abstractExposureInfo) {
        Object[] objArr = {abstractExposureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b80e95abae116a5515ec3dd6d9fc37ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b80e95abae116a5515ec3dd6d9fc37ef");
        } else if (isValid()) {
            this.mExposureInfo.modelDisappear(abstractExposureInfo);
        }
    }

    public void commit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "852f658de392381d2933afe628beb164", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "852f658de392381d2933afe628beb164");
        } else if (isValid()) {
            this.mExposureInfo.commit();
        }
    }

    public void updateReqId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1995a914660f84458f2bc9dc30db5be4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1995a914660f84458f2bc9dc30db5be4");
        } else {
            this.mExposureInfo.updateReqId(str);
        }
    }

    public void updateSession(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e1dc05938a4f274fc30c50a6474cd4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e1dc05938a4f274fc30c50a6474cd4f");
        } else {
            this.mExposureInfo.updateSession(str);
        }
    }

    public void updateAppSession(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af19860b937b5fa398f675f2408a6d0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af19860b937b5fa398f675f2408a6d0b");
        } else {
            this.mExposureInfo.updateAppSession(str);
        }
    }

    public void updateCid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e437aafd084994e2afe37c36f04c66b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e437aafd084994e2afe37c36f04c66b0");
        } else {
            this.mExposureInfo.updateCid(str);
        }
    }

    public String getCid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66be9f5db65989397177cc50ad4ef3f3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66be9f5db65989397177cc50ad4ef3f3") : this.mExposureInfo.getValCid();
    }

    public String getMreqId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a048dcc4c8e7a4c65e6a193439650bbc", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a048dcc4c8e7a4c65e6a193439650bbc") : this.mExposureInfo.getMreqId();
    }

    public String getReqId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b646c67cf9d659975527ba955041d47e", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b646c67cf9d659975527ba955041d47e") : this.mExposureInfo.getReqId();
    }

    public String getMsid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecc856aab2f5b31fc49cf50816449d73", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecc856aab2f5b31fc49cf50816449d73") : this.mExposureInfo.getMsid();
    }

    public String getAppMsid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c69a41eecbf6bc2b15ae9be4d38e2a7", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c69a41eecbf6bc2b15ae9be4d38e2a7") : this.mExposureInfo.getAppMsid();
    }

    public void setValid(boolean z) {
        this.mIsValid = z;
    }

    public boolean isValid() {
        return this.mIsValid;
    }
}
