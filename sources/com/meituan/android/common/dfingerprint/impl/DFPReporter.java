package com.meituan.android.common.dfingerprint.impl;

import com.meituan.android.common.dfingerprint.network.BaseReporter;
import com.meituan.android.common.dfingerprint.network.ContentType;
import com.meituan.android.common.dfingerprint.network.IResponseParser;
import com.meituan.android.common.mtguard.a;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
/* loaded from: classes2.dex */
public class DFPReporter extends BaseReporter {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes2.dex */
    public static final class Builder extends BaseReporter.Builder {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.common.dfingerprint.network.BaseReporter.Builder
        public final Builder addInterceptor(Interceptor interceptor) {
            Object[] objArr = {interceptor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cca8146676a712b6061c9c193a518fd", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cca8146676a712b6061c9c193a518fd");
            }
            super.addInterceptor(interceptor);
            return this;
        }

        @Override // com.meituan.android.common.dfingerprint.network.BaseReporter.Builder
        public final Builder addResponseParser(IResponseParser iResponseParser) {
            Object[] objArr = {iResponseParser};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7a35042a3032ffef33cd5e2b956e220", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7a35042a3032ffef33cd5e2b956e220");
            }
            super.addResponseParser(iResponseParser);
            return this;
        }

        @Override // com.meituan.android.common.dfingerprint.network.BaseReporter.Builder
        public final DFPReporter build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9d74fb03edeea3843f5cb6b2f419047", RobustBitConfig.DEFAULT_VALUE)) {
                return (DFPReporter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9d74fb03edeea3843f5cb6b2f419047");
            }
            super.build();
            return new DFPReporter(this);
        }
    }

    public DFPReporter(Builder builder) {
        super(builder);
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c76162e513790cb9b9716f3da2a8dd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c76162e513790cb9b9716f3da2a8dd2");
        }
    }

    private int getMiniPort() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33cf269466531321abf2567b2cb1987f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33cf269466531321abf2567b2cb1987f")).intValue() : a.h.booleanValue() ? 80 : 443;
    }

    private String getMiniScheme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26dae32ae2c8c7298201b8053f896615", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26dae32ae2c8c7298201b8053f896615") : a.h.booleanValue() ? "http" : "https";
    }

    private String getMiniUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50ba898b5a544da5848d7503f2e08716", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50ba898b5a544da5848d7503f2e08716") : a.h.booleanValue() ? "dynamic-fingerprint.sec.test.sankuai.com" : "dynamicf.sankuai.com";
    }

    public boolean reportMiniBat(String str, ContentType contentType) throws IOException {
        Object[] objArr = {str, contentType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b56aa48eb4eff5b5086dc8735685bd3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b56aa48eb4eff5b5086dc8735685bd3")).booleanValue();
        }
        if (str == null) {
            MTGuardLog.setErrorLogan(new NullPointerException("report failed, content is null"));
            return false;
        }
        return postSync(getMiniUrl(), getMiniPort(), getMiniScheme(), "/api/foreign/sendStrategyR", contentType, str, this.mParser, false);
    }

    public boolean reportUpdate(String str, ContentType contentType) throws IOException {
        Object[] objArr = {str, contentType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0783a995165329adec7c66a1ee9643e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0783a995165329adec7c66a1ee9643e")).booleanValue();
        }
        if (str == null) {
            MTGuardLog.setErrorLogan(new NullPointerException("report failed, content is null"));
            return false;
        }
        return postSync(getMiniUrl(), getMiniPort(), getMiniScheme(), "/api/foreign/sendSoftDevKitUR", contentType, str, this.mParser, false);
    }

    public boolean requestMiniBat(String str, ContentType contentType) throws IOException {
        Object[] objArr = {str, contentType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "914eabab7cd250d9513ff386ad42f4d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "914eabab7cd250d9513ff386ad42f4d8")).booleanValue();
        }
        if (str == null) {
            MTGuardLog.setErrorLogan(new NullPointerException("report failed, content is null"));
            return false;
        }
        return postSync(getMiniUrl(), getMiniPort(), getMiniScheme(), "/api/foreign/collectHeartbeat", contentType, str, this.mParser, false);
    }

    public boolean requestUpdate(String str, ContentType contentType) throws IOException {
        Object[] objArr = {str, contentType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa9bab58936366de697eeb2f0e4a58e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa9bab58936366de697eeb2f0e4a58e8")).booleanValue();
        }
        if (str == null) {
            MTGuardLog.setErrorLogan(new NullPointerException("report failed, content is null"));
            return false;
        }
        return postSync(getMiniUrl(), getMiniPort(), getMiniScheme(), "/api/foreign/querySoftDevKitU", contentType, str, this.mParser, false);
    }
}
