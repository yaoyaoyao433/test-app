package com.meituan.android.common.metricx.helpers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UrlFactory {
    public static final int NET_HUMAN = 1;
    public static final int NET_THING = 0;
    private static int NET_TYPE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final UrlFactory sInstance = new UrlFactory();

    public static void setNetType(int i) {
        NET_TYPE = i;
    }

    public static UrlFactory getInstance() {
        return sInstance;
    }

    public MetricxUrl createUrl(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9db3a5936c0ae9447f56efe6c65b4cb4", RobustBitConfig.DEFAULT_VALUE) ? (MetricxUrl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9db3a5936c0ae9447f56efe6c65b4cb4") : new MetricxUrl(str, str2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class MetricxUrl {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String iohUrl;
        private String iotUrl;

        public MetricxUrl(String str, String str2) {
            Object[] objArr = {UrlFactory.this, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c3c962d0c36570878563be9ac4817bf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c3c962d0c36570878563be9ac4817bf");
                return;
            }
            this.iotUrl = "";
            this.iohUrl = "";
            this.iotUrl = str;
            this.iohUrl = str2;
        }

        public String getUrl() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "791ef0ba87de1331399dd05a9d8082c4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "791ef0ba87de1331399dd05a9d8082c4") : UrlFactory.NET_TYPE == 0 ? this.iotUrl : this.iohUrl;
        }
    }
}
