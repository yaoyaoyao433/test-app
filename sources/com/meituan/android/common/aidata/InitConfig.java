package com.meituan.android.common.aidata;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InitConfig {
    public static final int DEFAULT_DB_DATA_PERIOD = 2;
    public static final String ENV_DEBUG = "debug";
    public static final String ENV_PROD = "prod";
    public static final String ENV_TEST = "test";
    public static final int MAX_DB_DATA_PERIOD = 7;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String env;
    private int mPeriod;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface EnvType {
    }

    public InitConfig(Builer builer) {
        Object[] objArr = {builer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07e10130f7d72e6e3a4b83cb30161bc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07e10130f7d72e6e3a4b83cb30161bc9");
            return;
        }
        this.mPeriod = builer.mPeriod;
        this.env = builer.env;
    }

    public void checkValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ff14e03aa3752481738146346b12eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ff14e03aa3752481738146346b12eae");
        } else if (this.mPeriod <= 0) {
            this.mPeriod = 2;
        } else if (this.mPeriod > 7) {
            this.mPeriod = 7;
        }
    }

    public int getCachePeriod() {
        return this.mPeriod;
    }

    public String getEnv() {
        return this.env;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Builer {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String env;
        private int mPeriod;

        public final Builer cachePeriod(int i) {
            this.mPeriod = i;
            return this;
        }

        public final Builer envType(String str) {
            this.env = str;
            return this;
        }

        public final InitConfig build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e48206fbb80e1e775e8c532a25ce815", RobustBitConfig.DEFAULT_VALUE) ? (InitConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e48206fbb80e1e775e8c532a25ce815") : new InitConfig(this);
        }
    }
}
