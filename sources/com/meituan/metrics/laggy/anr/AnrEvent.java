package com.meituan.metrics.laggy.anr;

import android.support.annotation.NonNull;
import com.meituan.metrics.laggy.anr.AnrCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AnrEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String activity;
    public String allMainThreadStack;
    private String anrVersion;
    private String apkHash;
    private String appState;
    private String cActivity;
    private String ch;
    private long city;
    private AnrCallback.ANR_DETECT_TYPE detectType;
    private String errorMsg;
    private String guid;
    private boolean isErrorInfoEmpty;
    private boolean isMainThreadBlock;
    private String mainThread;
    private String net;
    private String otherThread;
    private int pid;
    private String shortMst;
    private String sid;
    private int signal;
    private String sliverTrace;
    private long timestamp;
    private String traceFile;
    private String uuid;

    public AnrEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23b94ab32ee8be82dde308d33038f504", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23b94ab32ee8be82dde308d33038f504");
            return;
        }
        this.pid = -1;
        this.isErrorInfoEmpty = false;
        this.signal = -1;
    }

    public void setMainThreadBlock(boolean z) {
        this.isMainThreadBlock = z;
    }

    public boolean getMainThreadBlock() {
        return this.isMainThreadBlock;
    }

    public void setDetectType(AnrCallback.ANR_DETECT_TYPE anr_detect_type) {
        this.detectType = anr_detect_type;
    }

    public AnrCallback.ANR_DETECT_TYPE getDetectType() {
        return this.detectType;
    }

    public void setSignal(int i) {
        this.signal = i;
    }

    public int getSignal() {
        return this.signal;
    }

    public void setAppState(String str) {
        this.appState = str;
    }

    public String getAppState() {
        return this.appState;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setPid(int i) {
        this.pid = i;
    }

    public String getSid() {
        return this.sid;
    }

    public int getPid() {
        return this.pid;
    }

    public String getCh() {
        return this.ch;
    }

    public void setCh(String str) {
        this.ch = str;
    }

    public long getCity() {
        return this.city;
    }

    public void setCity(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ef90df3e27bb001362bf10ff30caee4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ef90df3e27bb001362bf10ff30caee4");
        } else {
            this.city = j;
        }
    }

    public String getNet() {
        return this.net;
    }

    public void setNet(String str) {
        this.net = str;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public String getActivity() {
        return this.activity;
    }

    public void setActivity(String str) {
        this.activity = str;
    }

    public String getMainThread() {
        return this.mainThread;
    }

    public void setMainThread(String str) {
        this.mainThread = str;
    }

    public String getOtherThread() {
        return this.otherThread;
    }

    public void setOtherThread(String str) {
        this.otherThread = str;
    }

    public String getTraceFile() {
        return this.traceFile;
    }

    public void setTraceFile(String str) {
        this.traceFile = str;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac9c7ad831cc08f05b2930be161653e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac9c7ad831cc08f05b2930be161653e9");
        } else {
            this.timestamp = j;
        }
    }

    public String getShortMst() {
        return this.shortMst;
    }

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String str) {
        this.guid = str;
    }

    public String getAnrVersion() {
        return this.anrVersion;
    }

    public void setAnrVersion(String str) {
        this.anrVersion = str;
    }

    public void setShortMst(String str) {
        this.shortMst = str;
    }

    public String getcActivity() {
        return this.cActivity;
    }

    public void setcActivity(String str) {
        this.cActivity = str;
    }

    public String getApkHash() {
        return this.apkHash;
    }

    public void setApkHash(String str) {
        this.apkHash = str;
    }

    public void setErrorInfoStatus(boolean z) {
        this.isErrorInfoEmpty = z;
    }

    public boolean getErrorInfoStatus() {
        return this.isErrorInfoEmpty;
    }

    public void setSliverTrace(String str) {
        this.sliverTrace = str;
    }

    public String getSliverTrace() {
        return this.sliverTrace;
    }

    @NonNull
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1722b9fc0bea136c0a93eeb71968ad1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1722b9fc0bea136c0a93eeb71968ad1d");
        }
        return "AnrEvent{mainThread='" + this.mainThread + "', allMainThreadStack='" + this.allMainThreadStack + "', otherThread='" + this.otherThread + "', traceFile='" + this.traceFile + "', shortMst='" + this.shortMst + "', errorMsg='" + this.errorMsg + "', activity='" + this.activity + "', timestamp=" + this.timestamp + ", guid='" + this.guid + "', anrVersion='" + this.anrVersion + "', cActivity='" + this.cActivity + "', uuid='" + this.uuid + "', ch='" + this.ch + "', city=" + this.city + ", net='" + this.net + "', apkHash='" + this.apkHash + "', sid='" + this.sid + "', appState='" + this.appState + "', pid=" + this.pid + ", isErrorInfoEmpty=" + this.isErrorInfoEmpty + ", sliverTrace='" + this.sliverTrace + "'}";
    }
}
