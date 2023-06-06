package com.huawei.updatesdk.service.otaupdate;

import com.huawei.updatesdk.service.appmgr.bean.Param;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UpdateParams {
    private boolean isShowImmediate;
    private int minIntervalDay;
    private boolean mustBtnOne;
    private List<String> packageList;
    private List<Param> paramList;
    private String serviceZone;
    private String targetPkgName;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean isShowImmediate;
        private int minIntervalDay;
        private boolean mustBtnOne;
        private List<String> packageList;
        private List<Param> paramList;
        private String serviceZone = f.f().b();
        private String targetPkgName;

        public final UpdateParams build() {
            return new UpdateParams(this);
        }

        public final Builder setIsShowImmediate(boolean z) {
            this.isShowImmediate = z;
            return this;
        }

        public final Builder setMinIntervalDay(int i) {
            this.minIntervalDay = i;
            return this;
        }

        public final Builder setMustBtnOne(boolean z) {
            this.mustBtnOne = z;
            return this;
        }

        public final Builder setPackageList(List<String> list) {
            this.packageList = list;
            return this;
        }

        public final Builder setParamList(List<Param> list) {
            this.paramList = list;
            return this;
        }

        public final Builder setServiceZone(String str) {
            this.serviceZone = str;
            return this;
        }

        public final Builder setTargetPkgName(String str) {
            this.targetPkgName = str;
            return this;
        }
    }

    private UpdateParams(Builder builder) {
        this.isShowImmediate = false;
        this.minIntervalDay = 0;
        this.mustBtnOne = false;
        this.serviceZone = builder.serviceZone;
        this.targetPkgName = builder.targetPkgName;
        this.isShowImmediate = builder.isShowImmediate;
        this.minIntervalDay = builder.minIntervalDay;
        this.mustBtnOne = builder.mustBtnOne;
        this.packageList = builder.packageList;
        this.paramList = builder.paramList;
    }

    public int getMinIntervalDay() {
        return this.minIntervalDay;
    }

    public List<String> getPackageList() {
        return this.packageList;
    }

    public List<Param> getParamList() {
        return this.paramList;
    }

    public String getServiceZone() {
        return this.serviceZone;
    }

    public String getTargetPkgName() {
        return this.targetPkgName;
    }

    public boolean isMustBtnOne() {
        return this.mustBtnOne;
    }

    public boolean isShowImmediate() {
        return this.isShowImmediate;
    }

    public void resetParamList() {
        this.paramList = null;
    }
}
