package com.meituan.metrics.traffic.hurl;

import android.support.annotation.RequiresApi;
import com.meituan.metrics.Metrics;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class HttpURLWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static URLConnection wrapURLConnectionHelper(URLConnection uRLConnection) {
        final boolean z = false;
        Object[] objArr = {uRLConnection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ce808f43b576004cdd4904617f778ac0", RobustBitConfig.DEFAULT_VALUE)) {
            return (URLConnection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ce808f43b576004cdd4904617f778ac0");
        }
        if (Metrics.getInstance().getAppConfig().isTrafficStatDisabled() || (uRLConnection instanceof HttpURLConnection$)) {
            return uRLConnection;
        }
        if (PrivacyUtil.a() && PrivacyUtil.a(uRLConnection.getURL())) {
            PrivacyUtil.b a = PrivacyUtil.a(4, uRLConnection.getURL());
            if (a.a == 2) {
                z = true;
            } else if (a.a == 1) {
                try {
                    uRLConnection = new URL(a.b).openConnection();
                } catch (Throwable unused) {
                }
            }
        }
        if (uRLConnection instanceof HttpsURLConnection) {
            final HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            return new HttpsURLConnection(httpsURLConnection, z) { // from class: com.meituan.metrics.traffic.hurl.HttpsURLConnection$
                public static ChangeQuickRedirect changeQuickRedirect;
                private final boolean isBlack;
                private final TrackedHttpURLConnection myTrackedConnection;
                private final HttpsURLConnection myWrappedHttps;

                {
                    super(httpsURLConnection.getURL());
                    Object[] objArr2 = {httpsURLConnection, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "70083017682d6395bb3c6f6b1301ce7d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "70083017682d6395bb3c6f6b1301ce7d");
                        return;
                    }
                    this.myTrackedConnection = new TrackedHttpURLConnection(httpsURLConnection);
                    this.myWrappedHttps = httpsURLConnection;
                    this.isBlack = z;
                }

                @Override // javax.net.ssl.HttpsURLConnection
                public final String getCipherSuite() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c102e274a214654e570a3e94378d4306", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c102e274a214654e570a3e94378d4306") : this.myWrappedHttps.getCipherSuite();
                }

                @Override // javax.net.ssl.HttpsURLConnection
                public final Certificate[] getLocalCertificates() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aaad2ffd88cc623e4a4c35d7c14065c2", RobustBitConfig.DEFAULT_VALUE) ? (Certificate[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aaad2ffd88cc623e4a4c35d7c14065c2") : this.myWrappedHttps.getLocalCertificates();
                }

                @Override // javax.net.ssl.HttpsURLConnection
                public final Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cb4d1f5c8e398b4c99bf401001285fc8", RobustBitConfig.DEFAULT_VALUE) ? (Certificate[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cb4d1f5c8e398b4c99bf401001285fc8") : this.myWrappedHttps.getServerCertificates();
                }

                @Override // javax.net.ssl.HttpsURLConnection
                public final Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3438e1b59fdd1a58f659baa326236a88", RobustBitConfig.DEFAULT_VALUE) ? (Principal) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3438e1b59fdd1a58f659baa326236a88") : this.myWrappedHttps.getPeerPrincipal();
                }

                @Override // javax.net.ssl.HttpsURLConnection
                public final Principal getLocalPrincipal() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b2ae41fa8902b0713874bd510d69a48", RobustBitConfig.DEFAULT_VALUE) ? (Principal) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b2ae41fa8902b0713874bd510d69a48") : this.myWrappedHttps.getLocalPrincipal();
                }

                @Override // javax.net.ssl.HttpsURLConnection
                public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
                    Object[] objArr2 = {hostnameVerifier};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d98f01b053e4633e4493927ed18c2786", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d98f01b053e4633e4493927ed18c2786");
                    } else {
                        this.myWrappedHttps.setHostnameVerifier(hostnameVerifier);
                    }
                }

                @Override // javax.net.ssl.HttpsURLConnection
                public final HostnameVerifier getHostnameVerifier() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a94cd77a8007fe0a5ca960bae362c342", RobustBitConfig.DEFAULT_VALUE) ? (HostnameVerifier) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a94cd77a8007fe0a5ca960bae362c342") : this.myWrappedHttps.getHostnameVerifier();
                }

                @Override // javax.net.ssl.HttpsURLConnection
                public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
                    Object[] objArr2 = {sSLSocketFactory};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "46facc5d7f80ea5c8192c02dfce8b01b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "46facc5d7f80ea5c8192c02dfce8b01b");
                    } else {
                        this.myWrappedHttps.setSSLSocketFactory(sSLSocketFactory);
                    }
                }

                @Override // javax.net.ssl.HttpsURLConnection
                public final SSLSocketFactory getSSLSocketFactory() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "23d223dc34347d439831957966b36061", RobustBitConfig.DEFAULT_VALUE) ? (SSLSocketFactory) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "23d223dc34347d439831957966b36061") : this.myWrappedHttps.getSSLSocketFactory();
                }

                @Override // java.net.HttpURLConnection, java.net.URLConnection
                public final String getHeaderFieldKey(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "93a6603c9f90e75be9875c85b15665fd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "93a6603c9f90e75be9875c85b15665fd") : this.myTrackedConnection.getHeaderFieldKey(i);
                }

                @Override // java.net.HttpURLConnection
                public final void setFixedLengthStreamingMode(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "06c8b568c88378203b437d45e041989d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "06c8b568c88378203b437d45e041989d");
                    } else {
                        this.myTrackedConnection.setFixedLengthStreamingMode(i);
                    }
                }

                @Override // java.net.HttpURLConnection
                @RequiresApi(api = 19)
                public final void setFixedLengthStreamingMode(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b64b2f57f59718f8f807b2632d1ff07c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b64b2f57f59718f8f807b2632d1ff07c");
                    } else {
                        this.myTrackedConnection.setFixedLengthStreamingMode(j);
                    }
                }

                @Override // java.net.HttpURLConnection
                public final void setChunkedStreamingMode(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0d58c7845c28c1a6f542dd550aad9778", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0d58c7845c28c1a6f542dd550aad9778");
                    } else {
                        this.myTrackedConnection.setChunkedStreamingMode(i);
                    }
                }

                @Override // java.net.HttpURLConnection, java.net.URLConnection
                public final String getHeaderField(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "98f637218374f956cf1af7612b7512fd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "98f637218374f956cf1af7612b7512fd") : this.myTrackedConnection.getHeaderField(i);
                }

                @Override // java.net.HttpURLConnection
                public final void setInstanceFollowRedirects(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1fb2c2ee8e157cec209f99d45b46cee1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1fb2c2ee8e157cec209f99d45b46cee1");
                    } else {
                        this.myTrackedConnection.setInstanceFollowRedirects(z2);
                    }
                }

                @Override // java.net.HttpURLConnection
                public final boolean getInstanceFollowRedirects() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a92282f9bb5a64dad9048c28ddd8634f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a92282f9bb5a64dad9048c28ddd8634f")).booleanValue() : this.myTrackedConnection.getInstanceFollowRedirects();
                }

                @Override // java.net.HttpURLConnection
                public final void setRequestMethod(String str) throws ProtocolException {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b721b9eee1324c62c223a520e7f9f74c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b721b9eee1324c62c223a520e7f9f74c");
                    } else {
                        this.myTrackedConnection.setRequestMethod(str);
                    }
                }

                @Override // java.net.HttpURLConnection
                public final String getRequestMethod() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "29132bb1eca7de3fcd996d73a65a136f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "29132bb1eca7de3fcd996d73a65a136f") : this.myTrackedConnection.getRequestMethod();
                }

                @Override // java.net.HttpURLConnection
                public final int getResponseCode() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e76f7f1744ada0b70c25fa022e3ee208", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e76f7f1744ada0b70c25fa022e3ee208")).intValue();
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getResponseCode();
                }

                @Override // java.net.HttpURLConnection
                public final String getResponseMessage() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7f2b97fe116f57873fa7ee248e90f913", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7f2b97fe116f57873fa7ee248e90f913");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getResponseMessage();
                }

                @Override // java.net.HttpURLConnection, java.net.URLConnection
                public final long getHeaderFieldDate(String str, long j) {
                    Object[] objArr2 = {str, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b68ee5a9a92dc4374f5191f284df8d13", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b68ee5a9a92dc4374f5191f284df8d13")).longValue() : this.myTrackedConnection.getHeaderFieldDate(str, j);
                }

                @Override // java.net.HttpURLConnection, java.net.URLConnection
                public final Permission getPermission() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "20e12e7a60e6a1bd6f500fa52e79269e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Permission) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "20e12e7a60e6a1bd6f500fa52e79269e");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getPermission();
                }

                @Override // java.net.HttpURLConnection
                public final InputStream getErrorStream() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "293319ea37168a8f1eb81038dc94af4d", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "293319ea37168a8f1eb81038dc94af4d") : this.myTrackedConnection.getErrorStream();
                }

                @Override // java.net.URLConnection
                public final void setConnectTimeout(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88b67e15daa541cafb1ccff92035735c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88b67e15daa541cafb1ccff92035735c");
                    } else {
                        this.myTrackedConnection.setConnectTimeout(i);
                    }
                }

                @Override // java.net.URLConnection
                public final int getConnectTimeout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a4bc3a5edf7539d6136a5e24d8596540", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a4bc3a5edf7539d6136a5e24d8596540")).intValue() : this.myTrackedConnection.getConnectTimeout();
                }

                @Override // java.net.URLConnection
                public final void setReadTimeout(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "59c263f142d8b356201a43ccc3419607", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "59c263f142d8b356201a43ccc3419607");
                    } else {
                        this.myTrackedConnection.setReadTimeout(i);
                    }
                }

                @Override // java.net.URLConnection
                public final int getReadTimeout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "69a12d22410f1879c2df502776a1b741", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "69a12d22410f1879c2df502776a1b741")).intValue() : this.myTrackedConnection.getReadTimeout();
                }

                @Override // java.net.URLConnection
                public final URL getURL() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5499faa8e7abe42798ddaba09332e7af", RobustBitConfig.DEFAULT_VALUE) ? (URL) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5499faa8e7abe42798ddaba09332e7af") : this.myTrackedConnection.getURL();
                }

                @Override // java.net.URLConnection
                public final int getContentLength() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "be0ed2c6be3993c7e2b5a913aa6a6cda", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "be0ed2c6be3993c7e2b5a913aa6a6cda")).intValue() : this.myTrackedConnection.getContentLength();
                }

                @Override // java.net.URLConnection
                @RequiresApi(api = 24)
                public final long getContentLengthLong() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df82f4536f53dcfd6c3616ca1a4b480f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df82f4536f53dcfd6c3616ca1a4b480f")).longValue() : this.myTrackedConnection.getContentLengthLong();
                }

                @Override // java.net.URLConnection
                public final String getContentType() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e25a42e4f3d8b8ac0154785ffab21e01", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e25a42e4f3d8b8ac0154785ffab21e01") : this.myTrackedConnection.getContentType();
                }

                @Override // java.net.URLConnection
                public final String getContentEncoding() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8d6c14980a3d537ff1ade42c5e9de170", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8d6c14980a3d537ff1ade42c5e9de170") : this.myTrackedConnection.getContentEncoding();
                }

                @Override // java.net.URLConnection
                public final long getExpiration() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3feca9bb713836b49ef230a6a06f8e5", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3feca9bb713836b49ef230a6a06f8e5")).longValue() : this.myTrackedConnection.getExpiration();
                }

                @Override // java.net.URLConnection
                public final long getDate() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1feeae6327495d9d5e4f3b62087d45b4", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1feeae6327495d9d5e4f3b62087d45b4")).longValue() : this.myTrackedConnection.getDate();
                }

                @Override // java.net.URLConnection
                public final long getLastModified() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9df273ad22a203f19b2cba7c540b9995", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9df273ad22a203f19b2cba7c540b9995")).longValue() : this.myTrackedConnection.getLastModified();
                }

                @Override // java.net.URLConnection
                public final String getHeaderField(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e9f14bd958cc1afd7453ce8bee076444", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e9f14bd958cc1afd7453ce8bee076444") : this.myTrackedConnection.getHeaderField(str);
                }

                @Override // java.net.URLConnection
                public final Map<String, List<String>> getHeaderFields() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2646b6f9d7c7f6b3080a0ebd40d0066c", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2646b6f9d7c7f6b3080a0ebd40d0066c") : this.myTrackedConnection.getHeaderFields();
                }

                @Override // java.net.URLConnection
                public final int getHeaderFieldInt(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c372c1d8069cb8863ed227d1a4c3d064", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c372c1d8069cb8863ed227d1a4c3d064")).intValue() : this.myTrackedConnection.getHeaderFieldInt(str, i);
                }

                @Override // java.net.URLConnection
                @RequiresApi(api = 24)
                public final long getHeaderFieldLong(String str, long j) {
                    Object[] objArr2 = {str, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5285e0f8fcd4d8179ebcfb0285acd690", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5285e0f8fcd4d8179ebcfb0285acd690")).longValue() : this.myTrackedConnection.getHeaderFieldLong(str, j);
                }

                @Override // java.net.URLConnection
                public final Object getContent() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33d33a878600715b01754a7d85be616f", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33d33a878600715b01754a7d85be616f");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getContent();
                }

                @Override // java.net.URLConnection
                public final Object getContent(Class[] clsArr) throws IOException {
                    Object[] objArr2 = {clsArr};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2d7c993c19725241429eb4540fd17b44", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2d7c993c19725241429eb4540fd17b44");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getContent(clsArr);
                }

                @Override // java.net.URLConnection
                public final InputStream getInputStream() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0d6fcaeab71c5481356f63700ff5d7e3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0d6fcaeab71c5481356f63700ff5d7e3");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getInputStream();
                }

                @Override // java.net.URLConnection
                public final OutputStream getOutputStream() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dbcb42dad5a6fe69192a4beee291b39d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (OutputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dbcb42dad5a6fe69192a4beee291b39d");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getOutputStream();
                }

                @Override // java.net.URLConnection
                public final String toString() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "60f25be06647aca30202af2f2a370709", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "60f25be06647aca30202af2f2a370709") : this.myTrackedConnection.toString();
                }

                @Override // java.net.URLConnection
                public final void setDoInput(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "640d7c5efdbc334536d6ccf4ddbeffff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "640d7c5efdbc334536d6ccf4ddbeffff");
                    } else {
                        this.myTrackedConnection.setDoInput(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final boolean getDoInput() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c5e9d23549292bbf9b38ffd3eb811492", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c5e9d23549292bbf9b38ffd3eb811492")).booleanValue() : this.myTrackedConnection.getDoInput();
                }

                @Override // java.net.URLConnection
                public final void setDoOutput(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8c0d813b461e91444623a106d364d5e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8c0d813b461e91444623a106d364d5e4");
                    } else {
                        this.myTrackedConnection.setDoOutput(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final boolean getDoOutput() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c6459ef8460a80bd0978822499e0b668", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c6459ef8460a80bd0978822499e0b668")).booleanValue() : this.myTrackedConnection.getDoOutput();
                }

                @Override // java.net.URLConnection
                public final void setAllowUserInteraction(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e6cd114026cc326bf8895c3d699d97cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e6cd114026cc326bf8895c3d699d97cf");
                    } else {
                        this.myTrackedConnection.setAllowUserInteraction(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final boolean getAllowUserInteraction() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "32d0c2b7301ea8954338c5d38d763733", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "32d0c2b7301ea8954338c5d38d763733")).booleanValue() : this.myTrackedConnection.getAllowUserInteraction();
                }

                @Override // java.net.URLConnection
                public final void setUseCaches(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "005011f3df824babb2feb0a72f1e9e6c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "005011f3df824babb2feb0a72f1e9e6c");
                    } else {
                        this.myTrackedConnection.setUseCaches(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final boolean getUseCaches() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f1a1f3fac7a376a7f4b6cb4926db2baf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f1a1f3fac7a376a7f4b6cb4926db2baf")).booleanValue() : this.myTrackedConnection.getUseCaches();
                }

                @Override // java.net.URLConnection
                public final void setIfModifiedSince(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc794c27a24ce0682db8b0c248dee08e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc794c27a24ce0682db8b0c248dee08e");
                    } else {
                        this.myTrackedConnection.setIfModifiedSince(j);
                    }
                }

                @Override // java.net.URLConnection
                public final long getIfModifiedSince() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb426f052a6da7954a9c688f19b170af", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb426f052a6da7954a9c688f19b170af")).longValue() : this.myTrackedConnection.getIfModifiedSince();
                }

                @Override // java.net.URLConnection
                public final boolean getDefaultUseCaches() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4de4c415be8a46598277be7478865f52", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4de4c415be8a46598277be7478865f52")).booleanValue() : this.myTrackedConnection.getDefaultUseCaches();
                }

                @Override // java.net.URLConnection
                public final void setDefaultUseCaches(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f03fd5b2d70253cf4177701d6ad887a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f03fd5b2d70253cf4177701d6ad887a");
                    } else {
                        this.myTrackedConnection.setDefaultUseCaches(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final void setRequestProperty(String str, String str2) {
                    Object[] objArr2 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3c44ec80fa5d879d91df285ade6f9bb3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3c44ec80fa5d879d91df285ade6f9bb3");
                    } else {
                        this.myTrackedConnection.setRequestProperty(str, str2);
                    }
                }

                @Override // java.net.URLConnection
                public final void addRequestProperty(String str, String str2) {
                    Object[] objArr2 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33dee6c71774c71181168990b489442e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33dee6c71774c71181168990b489442e");
                    } else {
                        this.myTrackedConnection.addRequestProperty(str, str2);
                    }
                }

                @Override // java.net.URLConnection
                public final String getRequestProperty(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2851618241f440c7bdd185677b6ff87b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2851618241f440c7bdd185677b6ff87b") : this.myTrackedConnection.getRequestProperty(str);
                }

                @Override // java.net.URLConnection
                public final Map<String, List<String>> getRequestProperties() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "083f54d30e8c62fd5e8d160547963e5c", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "083f54d30e8c62fd5e8d160547963e5c") : this.myTrackedConnection.getRequestProperties();
                }

                @Override // java.net.HttpURLConnection
                public final void disconnect() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a806deb1ad8482bb56b0af3acd007863", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a806deb1ad8482bb56b0af3acd007863");
                    } else {
                        this.myTrackedConnection.disconnect();
                    }
                }

                @Override // java.net.HttpURLConnection
                public final boolean usingProxy() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "47db0ebe24171240aaf8c776afd2c5d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "47db0ebe24171240aaf8c776afd2c5d2")).booleanValue() : this.myTrackedConnection.usingProxy();
                }

                @Override // java.net.URLConnection
                public final void connect() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a327bacb9a75082c5800be34e3dad123", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a327bacb9a75082c5800be34e3dad123");
                        return;
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    this.myTrackedConnection.connect();
                }
            };
        } else if (uRLConnection instanceof HttpURLConnection) {
            final HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            return new HttpURLConnection(httpURLConnection, z) { // from class: com.meituan.metrics.traffic.hurl.HttpURLConnection$
                public static ChangeQuickRedirect changeQuickRedirect;
                private final boolean isBlack;
                private final TrackedHttpURLConnection myTrackedConnection;

                {
                    super(httpURLConnection.getURL());
                    Object[] objArr2 = {httpURLConnection, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "045a81570024de8a0f57f9fc59559fba", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "045a81570024de8a0f57f9fc59559fba");
                        return;
                    }
                    this.myTrackedConnection = new TrackedHttpURLConnection(httpURLConnection);
                    this.isBlack = z;
                }

                @Override // java.net.HttpURLConnection, java.net.URLConnection
                public final String getHeaderFieldKey(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "589f2b4cfc465deaf837845cce5bf49e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "589f2b4cfc465deaf837845cce5bf49e") : this.myTrackedConnection.getHeaderFieldKey(i);
                }

                @Override // java.net.HttpURLConnection
                public final void setFixedLengthStreamingMode(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cc17ec1d341a75621dd95563f0b116b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cc17ec1d341a75621dd95563f0b116b7");
                    } else {
                        this.myTrackedConnection.setFixedLengthStreamingMode(i);
                    }
                }

                @Override // java.net.HttpURLConnection
                @RequiresApi(api = 19)
                public final void setFixedLengthStreamingMode(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9ddb3509e19c2b06dba02c22a42696de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9ddb3509e19c2b06dba02c22a42696de");
                    } else {
                        this.myTrackedConnection.setFixedLengthStreamingMode(j);
                    }
                }

                @Override // java.net.HttpURLConnection
                public final void setChunkedStreamingMode(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6fd35f634200a8b09eaac6877de7d90f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6fd35f634200a8b09eaac6877de7d90f");
                    } else {
                        this.myTrackedConnection.setChunkedStreamingMode(i);
                    }
                }

                @Override // java.net.HttpURLConnection, java.net.URLConnection
                public final String getHeaderField(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25ecc188e868228b9c6ef4023a25518c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25ecc188e868228b9c6ef4023a25518c") : this.myTrackedConnection.getHeaderField(i);
                }

                @Override // java.net.HttpURLConnection
                public final void setInstanceFollowRedirects(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba675f12ab89cb996946286ea7d202c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba675f12ab89cb996946286ea7d202c5");
                    } else {
                        this.myTrackedConnection.setInstanceFollowRedirects(z2);
                    }
                }

                @Override // java.net.HttpURLConnection
                public final boolean getInstanceFollowRedirects() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b9d83c60816f2f411e629db22866763c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b9d83c60816f2f411e629db22866763c")).booleanValue() : this.myTrackedConnection.getInstanceFollowRedirects();
                }

                @Override // java.net.HttpURLConnection
                public final void setRequestMethod(String str) throws ProtocolException {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a851fd3348cda2fce912b3f470b00a96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a851fd3348cda2fce912b3f470b00a96");
                    } else {
                        this.myTrackedConnection.setRequestMethod(str);
                    }
                }

                @Override // java.net.HttpURLConnection
                public final String getRequestMethod() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3d426c6ae5c7e4a904f77be3805aeec", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3d426c6ae5c7e4a904f77be3805aeec") : this.myTrackedConnection.getRequestMethod();
                }

                @Override // java.net.HttpURLConnection
                public final int getResponseCode() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5065455f78a99a3ac830d455a70f5abd", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5065455f78a99a3ac830d455a70f5abd")).intValue();
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getResponseCode();
                }

                @Override // java.net.HttpURLConnection
                public final String getResponseMessage() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9d97545b58530b4e3cc094442e42e7d1", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9d97545b58530b4e3cc094442e42e7d1");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getResponseMessage();
                }

                @Override // java.net.HttpURLConnection, java.net.URLConnection
                public final long getHeaderFieldDate(String str, long j) {
                    Object[] objArr2 = {str, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0946ef67b865b8e53491089a1b9d9d96", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0946ef67b865b8e53491089a1b9d9d96")).longValue() : this.myTrackedConnection.getHeaderFieldDate(str, j);
                }

                @Override // java.net.HttpURLConnection, java.net.URLConnection
                public final Permission getPermission() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb931bcbf33d82e9a2527d474fda7c8d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Permission) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb931bcbf33d82e9a2527d474fda7c8d");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getPermission();
                }

                @Override // java.net.HttpURLConnection
                public final InputStream getErrorStream() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4eeacf4bc6df4e83d44b5a6d547f628b", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4eeacf4bc6df4e83d44b5a6d547f628b") : this.myTrackedConnection.getErrorStream();
                }

                @Override // java.net.URLConnection
                public final void setConnectTimeout(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "188350ea623050f4f79b14c1a317b210", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "188350ea623050f4f79b14c1a317b210");
                    } else {
                        this.myTrackedConnection.setConnectTimeout(i);
                    }
                }

                @Override // java.net.URLConnection
                public final int getConnectTimeout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "73bda7611460c5975a191688e0363ef0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "73bda7611460c5975a191688e0363ef0")).intValue() : this.myTrackedConnection.getConnectTimeout();
                }

                @Override // java.net.URLConnection
                public final void setReadTimeout(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "289474f3193d293399efac873b15a5d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "289474f3193d293399efac873b15a5d0");
                    } else {
                        this.myTrackedConnection.setReadTimeout(i);
                    }
                }

                @Override // java.net.URLConnection
                public final int getReadTimeout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1a8d4058ad4eebf1c129d823f01f094c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1a8d4058ad4eebf1c129d823f01f094c")).intValue() : this.myTrackedConnection.getReadTimeout();
                }

                @Override // java.net.URLConnection
                public final URL getURL() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e21505fe57ab02a58babca0e71ab51ae", RobustBitConfig.DEFAULT_VALUE) ? (URL) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e21505fe57ab02a58babca0e71ab51ae") : this.myTrackedConnection.getURL();
                }

                @Override // java.net.URLConnection
                public final int getContentLength() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "77f17f3c1bedc98fd877809befd3432f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "77f17f3c1bedc98fd877809befd3432f")).intValue() : this.myTrackedConnection.getContentLength();
                }

                @Override // java.net.URLConnection
                @RequiresApi(api = 24)
                public final long getContentLengthLong() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e8c5d4e4c84e3ba63f3d0b83946844f2", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e8c5d4e4c84e3ba63f3d0b83946844f2")).longValue() : this.myTrackedConnection.getContentLengthLong();
                }

                @Override // java.net.URLConnection
                public final String getContentType() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "48dd070a768abe6decbf190b4b13917a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "48dd070a768abe6decbf190b4b13917a") : this.myTrackedConnection.getContentType();
                }

                @Override // java.net.URLConnection
                public final String getContentEncoding() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e510266c3dae6c332e30687e98f9b15d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e510266c3dae6c332e30687e98f9b15d") : this.myTrackedConnection.getContentEncoding();
                }

                @Override // java.net.URLConnection
                public final long getExpiration() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b5497d1c8970d325fbb3954c462c3d9", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b5497d1c8970d325fbb3954c462c3d9")).longValue() : this.myTrackedConnection.getExpiration();
                }

                @Override // java.net.URLConnection
                public final long getDate() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e20cbb54aa691af274f4067e7eae204f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e20cbb54aa691af274f4067e7eae204f")).longValue() : this.myTrackedConnection.getDate();
                }

                @Override // java.net.URLConnection
                public final long getLastModified() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "609674ad8ce9a43162d202f91baec6a5", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "609674ad8ce9a43162d202f91baec6a5")).longValue() : this.myTrackedConnection.getLastModified();
                }

                @Override // java.net.URLConnection
                public final String getHeaderField(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e0ace021ba3e792851f339f249b7e698", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e0ace021ba3e792851f339f249b7e698") : this.myTrackedConnection.getHeaderField(str);
                }

                @Override // java.net.URLConnection
                public final Map<String, List<String>> getHeaderFields() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a5305a660b8271ce29aecb047c07a8b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a5305a660b8271ce29aecb047c07a8b") : this.myTrackedConnection.getHeaderFields();
                }

                @Override // java.net.URLConnection
                public final int getHeaderFieldInt(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "56a4848dd21c35078b33fcd6908ceda1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "56a4848dd21c35078b33fcd6908ceda1")).intValue() : this.myTrackedConnection.getHeaderFieldInt(str, i);
                }

                @Override // java.net.URLConnection
                @RequiresApi(api = 24)
                public final long getHeaderFieldLong(String str, long j) {
                    Object[] objArr2 = {str, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aed68108fb502e4f8dcbf79de9a2b23a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aed68108fb502e4f8dcbf79de9a2b23a")).longValue() : this.myTrackedConnection.getHeaderFieldLong(str, j);
                }

                @Override // java.net.URLConnection
                public final Object getContent() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0fa4cb90bc714ff3bbcf7acebdfc0f59", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0fa4cb90bc714ff3bbcf7acebdfc0f59");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getContent();
                }

                @Override // java.net.URLConnection
                public final Object getContent(Class[] clsArr) throws IOException {
                    Object[] objArr2 = {clsArr};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "034e65d98a096fac01c5341fc94d446b", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "034e65d98a096fac01c5341fc94d446b");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getContent(clsArr);
                }

                @Override // java.net.URLConnection
                public final InputStream getInputStream() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "447159a6b8befe9b42d3dd8cfb712a8a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "447159a6b8befe9b42d3dd8cfb712a8a");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getInputStream();
                }

                @Override // java.net.URLConnection
                public final OutputStream getOutputStream() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8e74533f8fdaee2957eced95e66f5733", RobustBitConfig.DEFAULT_VALUE)) {
                        return (OutputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8e74533f8fdaee2957eced95e66f5733");
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    return this.myTrackedConnection.getOutputStream();
                }

                @Override // java.net.URLConnection
                public final String toString() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d6381870eb36517f1d8b2b194642eec", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d6381870eb36517f1d8b2b194642eec") : this.myTrackedConnection.toString();
                }

                @Override // java.net.URLConnection
                public final void setDoInput(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "10c1f2f3792deb5291528d243b7f9d0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "10c1f2f3792deb5291528d243b7f9d0d");
                    } else {
                        this.myTrackedConnection.setDoInput(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final boolean getDoInput() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d3edc1c1c76398cfd98d7ea699d6243d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d3edc1c1c76398cfd98d7ea699d6243d")).booleanValue() : this.myTrackedConnection.getDoInput();
                }

                @Override // java.net.URLConnection
                public final void setDoOutput(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e0d86b3f4d328cc0c11b453122675abe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e0d86b3f4d328cc0c11b453122675abe");
                    } else {
                        this.myTrackedConnection.setDoOutput(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final boolean getDoOutput() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cfdf87bf45034ca596ce79aa94d7f41a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cfdf87bf45034ca596ce79aa94d7f41a")).booleanValue() : this.myTrackedConnection.getDoOutput();
                }

                @Override // java.net.URLConnection
                public final void setAllowUserInteraction(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fe7bec3fbe666e8fccc59397e8308f23", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fe7bec3fbe666e8fccc59397e8308f23");
                    } else {
                        this.myTrackedConnection.setAllowUserInteraction(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final boolean getAllowUserInteraction() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "63db2a450b177f623d8bcae45453ca11", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "63db2a450b177f623d8bcae45453ca11")).booleanValue() : this.myTrackedConnection.getAllowUserInteraction();
                }

                @Override // java.net.URLConnection
                public final void setUseCaches(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7540e7df6f55699773d4351359ab2cfb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7540e7df6f55699773d4351359ab2cfb");
                    } else {
                        this.myTrackedConnection.setUseCaches(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final boolean getUseCaches() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "16d7e1b63f818c34ce49b6c9a8dc2899", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "16d7e1b63f818c34ce49b6c9a8dc2899")).booleanValue() : this.myTrackedConnection.getUseCaches();
                }

                @Override // java.net.URLConnection
                public final void setIfModifiedSince(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c9e380184d4614a9fbadfaf6b054ce51", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c9e380184d4614a9fbadfaf6b054ce51");
                    } else {
                        this.myTrackedConnection.setIfModifiedSince(j);
                    }
                }

                @Override // java.net.URLConnection
                public final long getIfModifiedSince() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6059a74cd5d5221da76ad851ca591556", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6059a74cd5d5221da76ad851ca591556")).longValue() : this.myTrackedConnection.getIfModifiedSince();
                }

                @Override // java.net.URLConnection
                public final boolean getDefaultUseCaches() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9c87595bc08ad01a1e85ce4d76bce7c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9c87595bc08ad01a1e85ce4d76bce7c3")).booleanValue() : this.myTrackedConnection.getDefaultUseCaches();
                }

                @Override // java.net.URLConnection
                public final void setDefaultUseCaches(boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0d767e17114c70c8bbb044824c909cd0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0d767e17114c70c8bbb044824c909cd0");
                    } else {
                        this.myTrackedConnection.setDefaultUseCaches(z2);
                    }
                }

                @Override // java.net.URLConnection
                public final void setRequestProperty(String str, String str2) {
                    Object[] objArr2 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "00c6bb2011034a8abdb15934529ead0b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "00c6bb2011034a8abdb15934529ead0b");
                    } else {
                        this.myTrackedConnection.setRequestProperty(str, str2);
                    }
                }

                @Override // java.net.URLConnection
                public final void addRequestProperty(String str, String str2) {
                    Object[] objArr2 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b78255c3ab9d999ddc4a88710ff6a038", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b78255c3ab9d999ddc4a88710ff6a038");
                    } else {
                        this.myTrackedConnection.addRequestProperty(str, str2);
                    }
                }

                @Override // java.net.URLConnection
                public final String getRequestProperty(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ca268bd7775f1e23c7c362687bdc807", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ca268bd7775f1e23c7c362687bdc807") : this.myTrackedConnection.getRequestProperty(str);
                }

                @Override // java.net.URLConnection
                public final Map<String, List<String>> getRequestProperties() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "834a1b95ba0b9bf19c71fd557771150f", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "834a1b95ba0b9bf19c71fd557771150f") : this.myTrackedConnection.getRequestProperties();
                }

                @Override // java.net.HttpURLConnection
                public final void disconnect() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e17df8b2866162d0ffcec26604575db7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e17df8b2866162d0ffcec26604575db7");
                    } else {
                        this.myTrackedConnection.disconnect();
                    }
                }

                @Override // java.net.HttpURLConnection
                public final boolean usingProxy() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eb366e9aa7fe53ba6cb8ef0bf201e867", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eb366e9aa7fe53ba6cb8ef0bf201e867")).booleanValue() : this.myTrackedConnection.usingProxy();
                }

                @Override // java.net.URLConnection
                public final void connect() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bc5e674399382138634f6154f9679a19", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bc5e674399382138634f6154f9679a19");
                        return;
                    }
                    PrivacyForbiddenException.throwBlackException(this.isBlack);
                    this.myTrackedConnection.connect();
                }
            };
        } else {
            return uRLConnection;
        }
    }

    public static URLConnection wrapURLConnection(URLConnection uRLConnection) {
        Object[] objArr = {uRLConnection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9a0540b02a8296cd97a8eff66443e59", RobustBitConfig.DEFAULT_VALUE) ? (URLConnection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9a0540b02a8296cd97a8eff66443e59") : wrapURLConnectionHelper(uRLConnection);
    }

    public static InputStream wrapOpenStream(URL url) throws IOException {
        Object[] objArr = {url};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95edf8c3442407e22b37c729be0dd721", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95edf8c3442407e22b37c729be0dd721") : wrapURLConnectionHelper(url.openConnection()).getInputStream();
    }

    public static Object wrapGetContent(URL url) throws IOException {
        Object[] objArr = {url};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7dd6d8a07ec4e2556d29e36f9d09370", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7dd6d8a07ec4e2556d29e36f9d09370") : wrapURLConnectionHelper(url.openConnection()).getContent();
    }

    public static Object wrapGetContent(URL url, Class[] clsArr) throws IOException {
        Object[] objArr = {url, clsArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "387da718725ce13ade7de3ae5789f6c1", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "387da718725ce13ade7de3ae5789f6c1") : wrapURLConnectionHelper(url.openConnection()).getContent(clsArr);
    }
}
