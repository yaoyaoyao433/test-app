package com.meituan.android.pike.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoginProto implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int command;
    private LoginProtoInner data;

    public LoginProto() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ef46c93276c7fd113a67266c1588753", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ef46c93276c7fd113a67266c1588753");
        } else {
            setCommand(1);
        }
    }

    public void setCommand(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }

    public void setData(LoginProtoInner loginProtoInner) {
        this.data = loginProtoInner;
    }

    public LoginProtoInner getData() {
        return this.data;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class LoginProtoInner implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String appName;
        private String businessId;
        private String deviceId;
        private HashMap<String, String> extra;
        private int network;
        private int platform;
        private String random;
        private String sdkVersion;
        private String sessionId;
        private String signature;

        public void setBusinessId(String str) {
            this.businessId = str;
        }

        public String getBusinessId() {
            return this.businessId;
        }

        public void setSdkVersion(String str) {
            this.sdkVersion = str;
        }

        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public void setAppName(String str) {
            this.appName = str;
        }

        public void setRandom(String str) {
            this.random = str;
        }

        public String getRandom() {
            return this.random;
        }

        public String getAppName() {
            return this.appName;
        }

        public void setSignature(String str) {
            this.signature = str;
        }

        public String getSignature() {
            return this.signature;
        }

        public void setPlatform(int i) {
            this.platform = i;
        }

        public int getPlatform() {
            return this.platform;
        }

        public void setNetwork(int i) {
            this.network = i;
        }

        public void setExtra(HashMap<String, String> hashMap) {
            this.extra = hashMap;
        }

        public HashMap<String, String> getExtra() {
            return this.extra;
        }

        public void setDeviceId(String str) {
            this.deviceId = str;
        }

        public String getDeviceId() {
            return this.deviceId;
        }

        public void setSessionId(String str) {
            this.sessionId = str;
        }

        public String getSessionId() {
            return this.sessionId;
        }
    }
}
