package dianping.com.nvlinker;

import android.text.TextUtils;
import dianping.com.nvlinker.stub.IRequestBuilder;
import dianping.com.nvlinker.stub.IResponse;
import dianping.com.nvlinker.stub.ISharkService;
import dianping.com.nvlinker.util.ReflectionHelper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NVHttpCon extends HttpURLConnection {
    public static final String KEY_DISABLE_CAT = "X-Shark-disableStatistics";
    public static final String KEY_DISABLE_INTERCEPTOR = "X-Shark-disableInterceptor";
    public static final String KEY_FORCE_HTTP_TUNNEL = "X-Shark-forceHttpTunnel";
    private static Method disableInterceptor;
    private static Method disableStatisticsMethod;
    private static Method forceHttpTunnelMethod;
    private boolean doExec;
    private InputStream inputStream;
    private ISharkService networkService;
    private ByteArrayOutputStream outputStream;
    private HashMap<String, String> reqHeaders;
    private Map<String, List<String>> respHeaders;
    private IResponse response;
    private int timeout;

    @Override // java.net.URLConnection
    public void connect() throws IOException {
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return false;
    }

    public NVHttpCon(URL url, ISharkService iSharkService) {
        super(url);
        this.doExec = false;
        this.networkService = iSharkService;
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        super.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        if (str == null) {
            return;
        }
        if (this.reqHeaders == null) {
            this.reqHeaders = new HashMap<>();
        }
        if (str2 == null) {
            this.reqHeaders.remove(str);
        } else {
            this.reqHeaders.put(str, str2);
        }
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        super.setConnectTimeout(i);
        if (this.timeout > i) {
            i = this.timeout;
        }
        this.timeout = i;
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        super.setReadTimeout(i);
        if (this.timeout > i) {
            i = this.timeout;
        }
        this.timeout = i;
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        if (str != null) {
            return this.reqHeaders.get(str);
        }
        return null;
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        if (this.outputStream == null) {
            this.outputStream = new ByteArrayOutputStream();
        }
        return this.outputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[LOOP:0: B:5:0x0015->B:58:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135 A[EDGE_INSN: B:81:0x0135->B:59:0x0135 ?: BREAK  , SYNTHETIC] */
    @Override // java.net.URLConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream getInputStream() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dianping.com.nvlinker.NVHttpCon.getInputStream():java.io.InputStream");
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        if (this.response == null || this.response.statusCode() < 400) {
            return null;
        }
        return new ByteArrayInputStream(this.response.result());
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        if (!this.doExec) {
            getInputStream();
        }
        if (this.response != null) {
            return this.response.statusCode();
        }
        return -1;
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return super.getContentLength();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return (this.response == null || this.response.result() == null || !this.response.isSuccess()) ? "" : new String(this.response.result());
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        if (i != 0 || this.response == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.response.statusCode());
        return sb.toString();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        if (this.response == null || this.response.headers() == null) {
            return null;
        }
        if (this.respHeaders == null) {
            this.respHeaders = new HashMap();
            for (String str : this.response.headers().keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.response.headers().get(str));
                this.respHeaders.put(str, arrayList);
            }
        }
        return this.respHeaders;
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        if (this.response == null || this.response.headers() == null || str == null) {
            return null;
        }
        for (String str2 : this.response.headers().keySet()) {
            if (str2.equalsIgnoreCase(str)) {
                return this.response.headers().get(str2);
            }
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        throw new UnsupportedOperationException("unsupported operation!");
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        super.setInstanceFollowRedirects(z);
    }

    private void disableStatistics(IRequestBuilder iRequestBuilder, String str) throws InvocationTargetException, IllegalAccessException {
        if (iRequestBuilder == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (disableStatisticsMethod == null) {
            synchronized (NVHttpCon.class) {
                if (disableStatisticsMethod == null) {
                    disableStatisticsMethod = ReflectionHelper.getMethod(iRequestBuilder, "disableStatistics", new Class[]{Boolean.TYPE});
                }
            }
        }
        if (disableStatisticsMethod != null) {
            disableStatisticsMethod.invoke(iRequestBuilder, Boolean.valueOf(str));
            return;
        }
        Method method = ReflectionHelper.getMethod(iRequestBuilder, "samplingRate", new Class[]{Integer.TYPE});
        if (method != null) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(Boolean.parseBoolean(str) ? 0 : 100);
            method.invoke(iRequestBuilder, objArr);
            return;
        }
        throw new IllegalAccessException();
    }

    private void forceHttpTunnel(IRequestBuilder iRequestBuilder, String str) throws InvocationTargetException, IllegalAccessException {
        if (iRequestBuilder == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (forceHttpTunnelMethod == null) {
            synchronized (NVHttpCon.class) {
                if (forceHttpTunnelMethod == null) {
                    forceHttpTunnelMethod = ReflectionHelper.getMethod(iRequestBuilder, "isForceHttpTunnel", new Class[]{Boolean.TYPE});
                }
            }
        }
        if (forceHttpTunnelMethod != null) {
            forceHttpTunnelMethod.invoke(iRequestBuilder, Boolean.valueOf(Boolean.parseBoolean(str)));
            return;
        }
        throw new IllegalAccessException();
    }

    private void disableInterceptor(IRequestBuilder iRequestBuilder, String str) throws InvocationTargetException, IllegalAccessException, NumberFormatException {
        if (iRequestBuilder == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (disableInterceptor == null) {
            synchronized (NVHttpCon.class) {
                if (disableInterceptor == null) {
                    disableInterceptor = ReflectionHelper.getMethod(iRequestBuilder, "disableInterceptors", new Class[]{Integer.TYPE});
                }
            }
        }
        if (disableInterceptor != null) {
            disableInterceptor.invoke(iRequestBuilder, Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        throw new IllegalAccessException();
    }
}
