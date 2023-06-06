package com.meituan.android.aurora;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AuroraPageInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Builder builder;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AuroraPageInfoType {
        public static final int TYPE_DEFAULT = 0;
        public static final int TYPE_PRELOAD = 1;
    }

    public AuroraPageInfo(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57441088703beab2ed796266cc4a3880", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57441088703beab2ed796266cc4a3880");
        } else {
            this.builder = builder;
        }
    }

    public List<String> getClassNameList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "131ab486d5bc3c95754645e9d3d7e4d7", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "131ab486d5bc3c95754645e9d3d7e4d7") : this.builder.classNameList;
    }

    public List<String> getBaseClassNameList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d6d9b80304f91d33f6fe07a098fdc94", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d6d9b80304f91d33f6fe07a098fdc94") : this.builder.baseClassNameList;
    }

    public List<String> getPkgNameList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "478400bf598ece599bcfa93a3e975d1e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "478400bf598ece599bcfa93a3e975d1e") : this.builder.pkgNameList;
    }

    public List<String> getUriStrList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b421d59679e87b3645793ac56961d48", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b421d59679e87b3645793ac56961d48") : this.builder.uriStrList;
    }

    public int getTaskType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "367b8b9d1204938a3413f3873e15eb76", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "367b8b9d1204938a3413f3873e15eb76")).intValue() : this.builder.taskType;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<String> baseClassNameList;
        private List<String> classNameList;
        private List<String> pkgNameList;
        private int taskType;
        private List<String> uriStrList;

        public Builder setClassNameList(List<String> list) {
            this.classNameList = list;
            return this;
        }

        public Builder setBaseClassNameList(List<String> list) {
            this.baseClassNameList = list;
            return this;
        }

        public Builder setPkgNameList(List<String> list) {
            this.pkgNameList = list;
            return this;
        }

        public Builder setUriStrList(List<String> list) {
            this.uriStrList = list;
            return this;
        }

        public Builder setTaskType(int i) {
            this.taskType = i;
            return this;
        }

        public AuroraPageInfo build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02ffad4eab1d694d73ba5ecdb77653e7", RobustBitConfig.DEFAULT_VALUE) ? (AuroraPageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02ffad4eab1d694d73ba5ecdb77653e7") : new AuroraPageInfo(this);
        }
    }
}
