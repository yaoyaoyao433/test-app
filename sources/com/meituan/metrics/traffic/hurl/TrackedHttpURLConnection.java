package com.meituan.metrics.traffic.hurl;

import android.content.Context;
import android.support.annotation.RequiresApi;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.metrics.traffic.HttpConnectionTracker;
import com.meituan.metrics.traffic.HttpTracker;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class TrackedHttpURLConnection {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean myConnectTracked;
    private final HttpConnectionTracker myConnectionTracker;
    private boolean myResponseTracked;
    private OutputStream myTrackedRequestStream;
    private InputStream myTrackedResponseStream;
    private final HttpURLConnection myWrapped;

    public TrackedHttpURLConnection(HttpURLConnection httpURLConnection) {
        Object[] objArr = {httpURLConnection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c10a8aed382b63020611a6907beac6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c10a8aed382b63020611a6907beac6f");
            return;
        }
        this.myWrapped = httpURLConnection;
        this.myConnectionTracker = HttpTracker.trackConnection(httpURLConnection.getURL().toString(), MetricsTrafficManager.getInstance());
        TrafficRecord.Detail detail = new TrafficRecord.Detail();
        detail.networkTunnel = TrafficRecord.Detail.TUNNEL_URL_CONNECTION;
        Context context = ContextProvider.getInstance().getContext();
        if (context != null) {
            detail.requestNetworkType = NetWorkUtils.getNetWorkTypeForBabel(context);
        }
        this.myConnectionTracker.reportDetail(detail);
    }

    private void trackPreConnect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee5a6132dbe52063c23efdf693448112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee5a6132dbe52063c23efdf693448112");
        } else if (this.myConnectTracked) {
        } else {
            try {
                this.myConnectionTracker.trackRequest(getRequestMethod(), getRequestProperties());
            } finally {
                this.myConnectTracked = true;
            }
        }
    }

    private void trackResponse() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a68d187eeae942c84849cc9ba746cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a68d187eeae942c84849cc9ba746cbb");
        } else if (this.myResponseTracked) {
        } else {
            try {
                this.myConnectionTracker.trackResponse(this.myWrapped.getResponseCode(), this.myWrapped.getResponseMessage(), this.myWrapped.getHeaderFields());
            } finally {
                this.myResponseTracked = true;
            }
        }
    }

    private void tryTrackResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caa090c8eecf5437a91abf051a79aa96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caa090c8eecf5437a91abf051a79aa96");
            return;
        }
        try {
            if (!this.myConnectTracked) {
                trackPreConnect();
            }
            trackResponse();
        } catch (IOException unused) {
        }
    }

    public final void disconnect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4ebd28637ff8c6bd7b5aa9784e96e39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4ebd28637ff8c6bd7b5aa9784e96e39");
            return;
        }
        if (this.myTrackedRequestStream != null) {
            try {
                this.myTrackedRequestStream.close();
            } catch (Exception unused) {
            }
        }
        if (this.myTrackedResponseStream != null) {
            try {
                this.myTrackedResponseStream.close();
            } catch (Exception unused2) {
            }
        }
        this.myWrapped.disconnect();
        this.myConnectionTracker.disconnect();
    }

    public final void connect() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa808153bccfd215321b387ff7cadb7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa808153bccfd215321b387ff7cadb7a");
            return;
        }
        trackPreConnect();
        try {
            this.myWrapped.connect();
        } catch (IOException e) {
            this.myConnectionTracker.error(e);
            throw e;
        }
    }

    public final InputStream getErrorStream() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c009db2cf113bdf23d0874eeb03e33f", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c009db2cf113bdf23d0874eeb03e33f") : this.myWrapped.getErrorStream();
    }

    public final Permission getPermission() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5191454ca121727d835f7b0619878b6", RobustBitConfig.DEFAULT_VALUE) ? (Permission) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5191454ca121727d835f7b0619878b6") : this.myWrapped.getPermission();
    }

    public final String getRequestMethod() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7646d46227a99312c1f9ab5db224742a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7646d46227a99312c1f9ab5db224742a") : (this.myWrapped.getDoOutput() && this.myWrapped.getRequestMethod().equals("GET")) ? "POST" : this.myWrapped.getRequestMethod();
    }

    public final void setRequestMethod(String str) throws ProtocolException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "708f79025c29855f2434d4e2edffa745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "708f79025c29855f2434d4e2edffa745");
        } else {
            this.myWrapped.setRequestMethod(str);
        }
    }

    public final boolean usingProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f30ddcaf031c1af48bae0ea249d7713a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f30ddcaf031c1af48bae0ea249d7713a")).booleanValue() : this.myWrapped.usingProxy();
    }

    public final String getContentEncoding() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52863642745ea4db56d1f04f99bf5c27", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52863642745ea4db56d1f04f99bf5c27") : this.myWrapped.getContentEncoding();
    }

    public final boolean getInstanceFollowRedirects() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bd21d1c4f29184e39e093dbb7833f34", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bd21d1c4f29184e39e093dbb7833f34")).booleanValue() : this.myWrapped.getInstanceFollowRedirects();
    }

    public final void setInstanceFollowRedirects(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b65f37c9463a386e5fa13a9af24460a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b65f37c9463a386e5fa13a9af24460a3");
        } else {
            this.myWrapped.setInstanceFollowRedirects(z);
        }
    }

    public final void setChunkedStreamingMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3774ec72a59439b3897e1d08cdc8ed6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3774ec72a59439b3897e1d08cdc8ed6d");
        } else {
            this.myWrapped.setChunkedStreamingMode(i);
        }
    }

    public final boolean getAllowUserInteraction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe110ebc53a51613cd3584ccfb131171", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe110ebc53a51613cd3584ccfb131171")).booleanValue() : this.myWrapped.getAllowUserInteraction();
    }

    public final long getDate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7296da575a75a76c3c3baab2bc617db9", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7296da575a75a76c3c3baab2bc617db9")).longValue() : this.myWrapped.getDate();
    }

    public final boolean getDefaultUseCaches() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cc84c1b4cba95abae38889580495ddf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cc84c1b4cba95abae38889580495ddf")).booleanValue() : this.myWrapped.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75563f48da123c729545fc8218318a98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75563f48da123c729545fc8218318a98")).booleanValue() : this.myWrapped.getDoInput();
    }

    public final boolean getDoOutput() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3db312ee69e066b1d452aa0f1a9b953d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3db312ee69e066b1d452aa0f1a9b953d")).booleanValue() : this.myWrapped.getDoOutput();
    }

    public final long getExpiration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c33541f887ca2a34f3763c0e613f274", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c33541f887ca2a34f3763c0e613f274")).longValue() : this.myWrapped.getExpiration();
    }

    public final Map<String, List<String>> getRequestProperties() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3dea5fc4f6bdd0ed373cace2b9551c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3dea5fc4f6bdd0ed373cace2b9551c4");
        }
        try {
            return this.myWrapped.getRequestProperties();
        } catch (IllegalStateException unused) {
            return Collections.emptyMap();
        }
    }

    public final void addRequestProperty(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08fcb6945a3f397190ecef319c59b521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08fcb6945a3f397190ecef319c59b521");
        } else {
            this.myWrapped.addRequestProperty(str, str2);
        }
    }

    public final long getIfModifiedSince() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e26c8ae929c2ad3e16e2e1eacb3418af", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e26c8ae929c2ad3e16e2e1eacb3418af")).longValue() : this.myWrapped.getIfModifiedSince();
    }

    public final long getLastModified() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc5f70d1b0018e2c011f51950abf7281", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc5f70d1b0018e2c011f51950abf7281")).longValue() : this.myWrapped.getLastModified();
    }

    public final String getRequestProperty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c962e41c346e4b06ced40187b0c31be2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c962e41c346e4b06ced40187b0c31be2") : this.myWrapped.getRequestProperty(str);
    }

    public final URL getURL() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd0383532c497f5ede3def3f072d088f", RobustBitConfig.DEFAULT_VALUE) ? (URL) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd0383532c497f5ede3def3f072d088f") : this.myWrapped.getURL();
    }

    public final boolean getUseCaches() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b83dc282c5b5c49d376bee0708e7f07", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b83dc282c5b5c49d376bee0708e7f07")).booleanValue() : this.myWrapped.getUseCaches();
    }

    public final void setAllowUserInteraction(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f67da4113da8679b45a80a9bd3756902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f67da4113da8679b45a80a9bd3756902");
        } else {
            this.myWrapped.setAllowUserInteraction(z);
        }
    }

    public final void setDefaultUseCaches(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3319953afb649937b16e7ce9614d9938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3319953afb649937b16e7ce9614d9938");
        } else {
            this.myWrapped.setDefaultUseCaches(z);
        }
    }

    public final void setDoInput(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22bbaa2573db3e6228c0fdb99b7c9015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22bbaa2573db3e6228c0fdb99b7c9015");
        } else {
            this.myWrapped.setDoInput(z);
        }
    }

    public final void setDoOutput(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b48c4ad1ff45f75373436aeb1221a335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b48c4ad1ff45f75373436aeb1221a335");
        } else {
            this.myWrapped.setDoOutput(z);
        }
    }

    public final void setIfModifiedSince(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "923b3029096a645a4f36ab16a0406de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "923b3029096a645a4f36ab16a0406de9");
        } else {
            this.myWrapped.setIfModifiedSince(j);
        }
    }

    public final void setRequestProperty(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2571f03afc5da58639b5595768194332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2571f03afc5da58639b5595768194332");
        } else {
            this.myWrapped.setRequestProperty(str, str2);
        }
    }

    public final void setUseCaches(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a584a45166c65b30535b53320121d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a584a45166c65b30535b53320121d82");
        } else {
            this.myWrapped.setUseCaches(z);
        }
    }

    public final void setConnectTimeout(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f63a7bb064ce5c5945120960adc2dc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f63a7bb064ce5c5945120960adc2dc9");
        } else {
            this.myWrapped.setConnectTimeout(i);
        }
    }

    public final int getConnectTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf2748edbe890ec4990b9b4749f18255", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf2748edbe890ec4990b9b4749f18255")).intValue() : this.myWrapped.getConnectTimeout();
    }

    public final void setReadTimeout(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a0396bae0fbd82d7ef3df2fc4d1c813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a0396bae0fbd82d7ef3df2fc4d1c813");
        } else {
            this.myWrapped.setReadTimeout(i);
        }
    }

    public final int getReadTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b773ab9857405f12d774fafcd9291f38", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b773ab9857405f12d774fafcd9291f38")).intValue() : this.myWrapped.getReadTimeout();
    }

    public final void setFixedLengthStreamingMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25073e108ecc5cb7701703b03053f3ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25073e108ecc5cb7701703b03053f3ea");
        } else {
            this.myWrapped.setFixedLengthStreamingMode(i);
        }
    }

    @RequiresApi(api = 19)
    public final void setFixedLengthStreamingMode(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c7919223cb581b2da9d75b9234ddbeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c7919223cb581b2da9d75b9234ddbeb");
        } else {
            this.myWrapped.setFixedLengthStreamingMode(j);
        }
    }

    public final OutputStream getOutputStream() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de4819a9ccfb9cc30467981c4b716ffb", RobustBitConfig.DEFAULT_VALUE)) {
            return (OutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de4819a9ccfb9cc30467981c4b716ffb");
        }
        trackPreConnect();
        try {
            this.myTrackedRequestStream = this.myConnectionTracker.trackRequestBody(this.myWrapped.getOutputStream());
            return this.myTrackedRequestStream;
        } catch (IOException e) {
            this.myConnectionTracker.error(e);
            throw e;
        }
    }

    public final int getResponseCode() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71d2d4b5f1af5afd4a9b4017e302f0e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71d2d4b5f1af5afd4a9b4017e302f0e0")).intValue();
        }
        if (!this.myConnectTracked) {
            try {
                getInputStream();
            } catch (Exception unused) {
            }
        }
        tryTrackResponse();
        return this.myWrapped.getResponseCode();
    }

    public final String getResponseMessage() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2292c189a27c076b2aeebb2c1d121a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2292c189a27c076b2aeebb2c1d121a5");
        }
        tryTrackResponse();
        return this.myWrapped.getResponseMessage();
    }

    public final String getHeaderField(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69d4de1a2bce3cf133a614837841c39e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69d4de1a2bce3cf133a614837841c39e");
        }
        tryTrackResponse();
        return this.myWrapped.getHeaderField(i);
    }

    public final Map<String, List<String>> getHeaderFields() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cce80bf2f3022b5f6075335f236e3f6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cce80bf2f3022b5f6075335f236e3f6b");
        }
        tryTrackResponse();
        return this.myWrapped.getHeaderFields();
    }

    public final String getHeaderField(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d689d3776db6d497d59e222c5226762f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d689d3776db6d497d59e222c5226762f");
        }
        tryTrackResponse();
        return this.myWrapped.getHeaderField(str);
    }

    public final int getHeaderFieldInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4467a23426e8a1aa4e22b091befe7590", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4467a23426e8a1aa4e22b091befe7590")).intValue();
        }
        tryTrackResponse();
        return this.myWrapped.getHeaderFieldInt(str, i);
    }

    public final String getHeaderFieldKey(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b3ba9a4fda09637db8fbdcd977aabe3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b3ba9a4fda09637db8fbdcd977aabe3");
        }
        tryTrackResponse();
        return this.myWrapped.getHeaderFieldKey(i);
    }

    public final long getHeaderFieldDate(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0c7fb3ccdf4297e30ce09688566fa58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0c7fb3ccdf4297e30ce09688566fa58")).longValue();
        }
        tryTrackResponse();
        return this.myWrapped.getHeaderFieldDate(str, j);
    }

    @RequiresApi(api = 24)
    public final long getHeaderFieldLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1442d67dcb10c189a47af170d2994f19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1442d67dcb10c189a47af170d2994f19")).longValue();
        }
        tryTrackResponse();
        return this.myWrapped.getHeaderFieldLong(str, j);
    }

    public final InputStream getInputStream() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "196b24969ab43240caa5c0a9310983fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "196b24969ab43240caa5c0a9310983fc");
        }
        trackPreConnect();
        try {
            InputStream inputStream = this.myWrapped.getInputStream();
            trackResponse();
            this.myTrackedResponseStream = this.myConnectionTracker.trackResponseBody(inputStream);
            return this.myTrackedResponseStream;
        } catch (IOException e) {
            this.myConnectionTracker.error(e);
            throw e;
        }
    }

    public final Object getContent() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5ccc8d8309ac8a5aefa4f444df72945", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5ccc8d8309ac8a5aefa4f444df72945");
        }
        tryTrackResponse();
        return this.myWrapped.getContent();
    }

    public final Object getContent(Class[] clsArr) throws IOException {
        Object[] objArr = {clsArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "496dad1506d247742f9eccda29c519b2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "496dad1506d247742f9eccda29c519b2");
        }
        tryTrackResponse();
        return this.myWrapped.getContent(clsArr);
    }

    public final int getContentLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d77dff39e8b8658744e153c0cfa1a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d77dff39e8b8658744e153c0cfa1a2")).intValue();
        }
        tryTrackResponse();
        return this.myWrapped.getContentLength();
    }

    @RequiresApi(api = 24)
    public final long getContentLengthLong() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c9fbe217d96d42b0c5334396db1dae3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c9fbe217d96d42b0c5334396db1dae3")).longValue();
        }
        tryTrackResponse();
        return this.myWrapped.getContentLengthLong();
    }

    public final String getContentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1571441466508f8a50982a231804d9b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1571441466508f8a50982a231804d9b8");
        }
        tryTrackResponse();
        return this.myWrapped.getContentType();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aa5a1dd289f206d7cd776e5979ede24", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aa5a1dd289f206d7cd776e5979ede24") : this.myWrapped.toString();
    }
}
