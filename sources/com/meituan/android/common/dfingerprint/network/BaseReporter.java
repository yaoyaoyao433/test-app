package com.meituan.android.common.dfingerprint.network;

import android.text.TextUtils;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.j;
import com.dianping.nvnetwork.q;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.AppMockInterceptor;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.NVCandyInterceptor;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.Ok3NetworkInterceptor;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/* loaded from: classes2.dex */
public class BaseReporter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private OkHttpClient mOkClient;
    public IResponseParser mParser;
    private j mSharkService;

    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Interceptor interceptor;
        public IResponseParser parser;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2db5d38b02737674459dc9e049391335", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2db5d38b02737674459dc9e049391335");
                return;
            }
            this.parser = null;
            this.interceptor = null;
        }

        public Builder addInterceptor(Interceptor interceptor) {
            if (this.interceptor == null) {
                this.interceptor = interceptor;
            }
            return this;
        }

        public Builder addResponseParser(IResponseParser iResponseParser) {
            this.parser = iResponseParser;
            return this;
        }

        public BaseReporter build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac631173d558d26764b0a861caf802d0", RobustBitConfig.DEFAULT_VALUE) ? (BaseReporter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac631173d558d26764b0a861caf802d0") : new BaseReporter(this);
        }
    }

    private OkHttpClient newClient(Interceptor interceptor) {
        Object[] objArr = {interceptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fec71dbb81aedd896c292a4f4273b9c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fec71dbb81aedd896c292a4f4273b9c8");
        }
        Dispatcher dispatcher = new Dispatcher(c.c("OK-DSP"));
        dispatcher.setMaxRequests(1);
        int timeOut = DFPConfigs.getTimeOut();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        long j = timeOut;
        return builder.dispatcher(dispatcher).addInterceptor(new AppMockInterceptor()).addInterceptor(interceptor).addNetworkInterceptor(new Ok3NetworkInterceptor()).connectTimeout(j, TimeUnit.SECONDS).readTimeout(j, TimeUnit.SECONDS).writeTimeout(j, TimeUnit.SECONDS).build();
    }

    public boolean get(String str) {
        boolean z;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99583c4e4596029c101905b389d221e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99583c4e4596029c101905b389d221e2")).booleanValue();
        }
        try {
            Response execute = this.mOkClient.newCall(new Request.Builder().url(str).build()).execute();
            if (execute == null || execute.body() == null) {
                z = this.mParser.onError(-3001, "request error");
            } else {
                z = this.mParser.onResponse(execute.code(), execute.body().bytes(), 0L, 0);
                try {
                    execute.body().close();
                } catch (Throwable th) {
                    th = th;
                    MTGuardLog.setErrorLogan(th);
                    return z;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public byte[] getCommon(String str) {
        Response response;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d2e893a02f8319494e9cb63d92f3889", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d2e893a02f8319494e9cb63d92f3889");
        }
        Response response2 = null;
        try {
            response = this.mOkClient.newCall(new Request.Builder().url(str).build()).execute();
            try {
                byte[] bytes = response.body().bytes();
                if (response != null) {
                    response.body().close();
                }
                return bytes;
            } catch (Exception unused) {
                if (response != null) {
                    response.body().close();
                }
                return null;
            } catch (Throwable th) {
                response2 = response;
                th = th;
                if (response2 != null) {
                    response2.body().close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            response = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public byte[] postCommon(String str, String str2) {
        Response response;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a53ac6de77a69d104cd3bad7f59732db", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a53ac6de77a69d104cd3bad7f59732db");
        }
        Response response2 = null;
        try {
            OkHttpClient okHttpClient = this.mOkClient;
            String contentType = DFPConfigs.getContentType(ContentType.plain_text);
            response = okHttpClient.newCall(new Request.Builder().url(str).addHeader("Content-Type", contentType).post(RequestBody.create(MediaType.parse(contentType), str2)).build()).execute();
            try {
                byte[] bytes = response.body().bytes();
                if (response != null) {
                    response.body().close();
                }
                return bytes;
            } catch (Exception unused) {
                if (response != null) {
                    response.body().close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                response2 = response;
                if (response2 != null) {
                    response2.body().close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            response = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean postSync(String str, int i, String str2, String str3, ContentType contentType, String str4, IResponseParser iResponseParser, boolean z) throws IOException {
        String str5;
        String str6;
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, contentType, str4, iResponseParser, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a6fc9e473793abbce8c38ac3d0ff415", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a6fc9e473793abbce8c38ac3d0ff415")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        HttpUrl build = new HttpUrl.Builder().scheme(str2).port(i).host(str).encodedPath(str3).build();
        String contentType2 = DFPConfigs.getContentType(contentType);
        MTGuardLog.setLogan("postSync url:" + build.toString() + ", body length:" + str4.length() + ", use shark:" + z);
        if (z) {
            int i2 = str3.equals(DFPConfigs.getDFPIDPath()) ? 3010 : str3.equals(DFPConfigs.getXidPath()) ? 3020 : str3.equals(DFPConfigs.getDeviceInfoPath()) ? 3030 : str3.equals(DFPConfigs.getMiniFamaPath()) ? 3040 : 0;
            MTGlibInterface.raptorAPI(Ok3NetworkInterceptor.RAPTOR_MITM_KEY, i2, str4.length(), 0, 0L);
            q execSync = this.mSharkService.execSync(new Request.Builder().url(build.toString()).timeout(DFPConfigs.getTimeOut() * 1000).addHeaders("Content-Type", contentType2).input((InputStream) new ByteArrayInputStream(str4.getBytes())).post());
            StringBuilder sb = new StringBuilder("shark response, url: ");
            sb.append(build.toString());
            sb.append(", ");
            if (execSync == null) {
                str6 = StringUtil.NULL;
            } else {
                str6 = "status code:" + execSync.statusCode() + ", tunnel:" + execSync.c() + ", from:" + execSync.b();
            }
            sb.append(str6);
            MTGuardLog.setLogan(sb.toString());
            if (execSync == null || execSync.statusCode() <= 0) {
                return iResponseParser.onError(-3001, "request error");
            }
            if (execSync.statusCode() == 200 && execSync.b == 1) {
                MTGlibInterface.raptorAPI(Ok3NetworkInterceptor.RAPTOR_MITM_KEY, i2 + 1, str4.length(), 0, 0L);
            }
            return iResponseParser.onResponse(execSync.statusCode(), execSync.result(), currentTimeMillis, str4.length());
        }
        try {
            Response execute = this.mOkClient.newCall(new Request.Builder().url(build).addHeader("Content-Type", contentType2).post(RequestBody.create(MediaType.parse(contentType2), str4)).build()).execute();
            StringBuilder sb2 = new StringBuilder("okhttp response, url: ");
            sb2.append(build.toString());
            sb2.append(", ");
            if (execute == null) {
                str5 = StringUtil.NULL;
            } else {
                str5 = "status code:" + execute.code();
            }
            sb2.append(str5);
            MTGuardLog.setLogan(sb2.toString());
            if (execute == null || execute.body() == null) {
                return iResponseParser.onError(-3001, "request error");
            }
            byte[] bytes = execute.body().bytes();
            execute.body().close();
            return iResponseParser.onResponse(execute.code(), bytes, currentTimeMillis, str4.length());
        } catch (IOException e) {
            MTGuardLog.setLogan("post failed, url:" + build + ", because:" + e.getMessage());
            return "Canceled".equals(e.getMessage()) ? iResponseParser.onError(-3004, "Canceled") : iResponseParser.onError(-3001, "request error");
        }
    }

    public boolean reportDFPIDSync(String str, boolean z, boolean z2) throws IOException {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e64379d3a3fcb6f9ba17ac05e23b6703", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e64379d3a3fcb6f9ba17ac05e23b6703")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return postSync(z2 ? DFPConfigs.getMiniFamaHost() : DFPConfigs.getHost(), DFPConfigs.getPort(), DFPConfigs.getScheme(), z2 ? DFPConfigs.getMiniFamaPath() : DFPConfigs.getDFPIDPath(), ContentType.application_json, str, this.mParser, z);
        }
        MTGuardLog.setErrorLogan(new NullPointerException("report failed, content is null"));
        return false;
    }

    public boolean reportDeviceInfo(String str, boolean z) throws IOException {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "150b22099dcfa5e2d5f37e0a2aa65409", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "150b22099dcfa5e2d5f37e0a2aa65409")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            MTGuardLog.setErrorLogan(new NullPointerException("report failed, content is null"));
            return false;
        }
        return postSync(DFPConfigs.getHost(), DFPConfigs.getPort(), DFPConfigs.getScheme(), DFPConfigs.getDeviceInfoPath(), ContentType.application_json, str, this.mParser, z);
    }

    public boolean reportFingerprintBody(String str, String str2, boolean z) throws IOException {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a56f9863acf0a50d6db84975245f5d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a56f9863acf0a50d6db84975245f5d0")).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return postSync(DFPConfigs.getHost(), DFPConfigs.getPort(), DFPConfigs.getScheme(), str, ContentType.application_json, str2, this.mParser, z);
    }

    public BaseReporter(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8efce4a0001ec4a9afc5ba215b84b83a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8efce4a0001ec4a9afc5ba215b84b83a");
            return;
        }
        this.mParser = builder.parser;
        this.mOkClient = newClient(builder.interceptor);
        NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(MTGuard.getAdapter().a);
        SharkWrapper.addInterceptorToBuilder(aVar);
        aVar.e = true;
        this.mSharkService = aVar.a(new NVCandyInterceptor(MTGuard.getAdapter().a)).a();
    }
}
