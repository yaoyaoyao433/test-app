package com.dianping.titans.offline.entity;

import android.support.annotation.NonNull;
import com.dianping.titans.offline.util.GsonProvider;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OfflineConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    private String bundleMd5;
    @Expose
    public String bundleName;
    @Expose
    public String dioPath;
    @Expose
    private String group;
    @Expose
    private List<OfflineRuleItem> resource;
    @Expose
    private String scope;
    @Expose
    public long updateTime;
    @Expose
    public String version;

    public String getScope() {
        return this.scope;
    }

    public void setScope(String str) {
        this.scope = str;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public String getBundleMd5() {
        return this.bundleMd5;
    }

    public void setBundleMd5(String str) {
        this.bundleMd5 = str;
    }

    @NonNull
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d1d79b780c7735d7de23e112b82c39d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d1d79b780c7735d7de23e112b82c39d") : GsonProvider.getGson().toJson(this);
    }

    public List<OfflineRuleItem> getResource() {
        return this.resource;
    }

    public void setResource(List<OfflineRuleItem> list) {
        this.resource = list;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class PushOfflineConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Expose
        private List<BundleInfo> bundleInfoList;
        @Expose
        private List<String> closedProjectList;

        public PushOfflineConfig() {
            Object[] objArr = {OfflineConfig.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7760e889f56a5156869746b4a527cb5c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7760e889f56a5156869746b4a527cb5c");
            }
        }

        public List<String> getClosedProjectList() {
            return this.closedProjectList;
        }

        public void setClosedProjectList(List<String> list) {
            this.closedProjectList = list;
        }

        public List<BundleInfo> getBundleInfoList() {
            return this.bundleInfoList;
        }

        public void setBundleInfoList(List<BundleInfo> list) {
            this.bundleInfoList = list;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public class BundleInfo {
            public static ChangeQuickRedirect changeQuickRedirect;
            @Expose
            private List<Diff> diff;
            @Expose
            private String hash;
            @Expose
            private String project;
            @Expose
            private long size;
            @Expose
            private String url;
            @Expose
            private String zip0Hash;

            public BundleInfo() {
                Object[] objArr = {PushOfflineConfig.this};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac2c6f922bf8c7357fe1a8a22e6841d9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac2c6f922bf8c7357fe1a8a22e6841d9");
                }
            }

            public String getProject() {
                return this.project;
            }

            public void setProject(String str) {
                this.project = str;
            }

            public String getUrl() {
                return this.url;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public String getZip0Hash() {
                return this.zip0Hash;
            }

            public void setZip0Hash(String str) {
                this.zip0Hash = str;
            }

            public long getSize() {
                return this.size;
            }

            public void setSize(long j) {
                Object[] objArr = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d876b9ae1bb5e4a3dfb26c90d7ffc208", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d876b9ae1bb5e4a3dfb26c90d7ffc208");
                } else {
                    this.size = j;
                }
            }

            public String getHash() {
                return this.hash;
            }

            public void setHash(String str) {
                this.hash = str;
            }

            public List<Diff> getDiff() {
                return this.diff;
            }

            public void setDiff(List<Diff> list) {
                this.diff = list;
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public class Diff {
            public static ChangeQuickRedirect changeQuickRedirect;
            @Expose
            private String from;
            @Expose
            private String hash;
            @Expose
            private long size;
            @Expose
            private String url;

            public Diff() {
                Object[] objArr = {PushOfflineConfig.this};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5df47da0919045e3e259e200b1585f9e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5df47da0919045e3e259e200b1585f9e");
                }
            }

            public String getFrom() {
                return this.from;
            }

            public void setFrom(String str) {
                this.from = str;
            }

            public String getHash() {
                return this.hash;
            }

            public void setHash(String str) {
                this.hash = str;
            }

            public String getUrl() {
                return this.url;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public long getSize() {
                return this.size;
            }

            public void setSize(long j) {
                Object[] objArr = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76def066a5d6bb669b99eb986f09d95c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76def066a5d6bb669b99eb986f09d95c");
                } else {
                    this.size = j;
                }
            }
        }
    }
}
