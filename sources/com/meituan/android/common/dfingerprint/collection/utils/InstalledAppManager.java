package com.meituan.android.common.dfingerprint.collection.utils;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.interfaces.ICypher;
import com.meituan.android.common.dfingerprint.interfaces.IDFPManager;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class InstalledAppManager {
    private static final String BASE_URL = "https://mobile.meituan.com";
    private static final String DEFAULT_APP_LIST = "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";
    private static final int MAX_RETRY = 3;
    private static final String PATH = "/push/launch/v3/android";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AtomicReference<List<String>> mApps;
    private Runnable mAppListFetcher;
    private IDFPManager manager;

    /* loaded from: classes2.dex */
    public class AppListFetcher implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int mRetryTime = 0;

        public AppListFetcher() {
        }

        public boolean doLoad(String str) throws IOException {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cd23a25ac362f096969452c8c111a87", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cd23a25ac362f096969452c8c111a87")).booleanValue();
            }
            byte[] loadFromUrl = loadFromUrl(str);
            if (loadFromUrl == null) {
                return false;
            }
            return InstalledAppManager.this.doLoadContent(loadFromUrl);
        }

        public int getmRetryTime() {
            return this.mRetryTime;
        }

        public byte[] loadFromUrl(String str) throws IOException {
            InputStream inputStream;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77c09159a91a7e57c113602e43d819ee", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77c09159a91a7e57c113602e43d819ee");
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                if (200 != httpURLConnection.getResponseCode()) {
                    httpURLConnection.disconnect();
                    return null;
                }
                try {
                    inputStream = httpURLConnection.getInputStream();
                } catch (Throwable th) {
                    th = th;
                    inputStream = null;
                }
                try {
                    byte[] readBytes = InstalledAppManager.readBytes(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                    if (readBytes.length <= 0) {
                        return null;
                    }
                    return readBytes;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    MTGuardLog.setErrorLogan(th);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return null;
                }
            } catch (Throwable th3) {
                MTGuardLog.setErrorLogan(th3);
                return null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2de0df1474e7510e71742d2b9b431d1f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2de0df1474e7510e71742d2b9b431d1f");
                return;
            }
            this.mRetryTime = 0;
            while (!z && this.mRetryTime < 3) {
                this.mRetryTime++;
                try {
                    z = doLoad("https://mobile.meituan.com/push/launch/v3/android");
                } catch (Throwable th) {
                    MTGuardLog.setErrorLogan(th);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class DataWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("data")
        public List<String> data;
    }

    public InstalledAppManager(IDFPManager iDFPManager) {
        Object[] objArr = {iDFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dbe2ca2e4c9bb4dd4f9106c842ff4ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dbe2ca2e4c9bb4dd4f9106c842ff4ae");
            return;
        }
        this.manager = null;
        this.mAppListFetcher = new AppListFetcher();
        if (mApps == null) {
            mApps = new AtomicReference<>(null);
        }
        if (iDFPManager != null) {
            this.manager = iDFPManager;
        }
        doLoadContent(DEFAULT_APP_LIST.getBytes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] readBytes(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df5ad2527b1d415f1f3a373ca3b77ef3", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df5ad2527b1d415f1f3a373ca3b77ef3");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return new byte[0];
        }
    }

    public List<String> applist() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (List) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81aa1be25280a7f3c516e1bbe0384f8f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81aa1be25280a7f3c516e1bbe0384f8f") : mApps.get());
    }

    public String decrypt(byte[] bArr) {
        ICypher cypher;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c03a7c1b1d3fbac0b94f0a59c9033209", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c03a7c1b1d3fbac0b94f0a59c9033209");
        }
        byte[] decode = Base64.decode(new String(bArr, Charset.defaultCharset()), 0);
        if (decode == null || decode.length <= 0 || (cypher = this.manager.getCypher()) == null) {
            return DFPConfigs.API_RET_NULL;
        }
        byte[] decrypt = cypher.decrypt(decode);
        return decrypt.length <= 0 ? DFPConfigs.API_RET_NULL : new String(decrypt, Charset.defaultCharset());
    }

    public boolean doLoadContent(byte[] bArr) {
        DataWrapper dataWrapper;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48702b23ffd5d399446b634193ebaf89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48702b23ffd5d399446b634193ebaf89")).booleanValue();
        }
        String decrypt = decrypt(bArr);
        if (decrypt != null && decrypt.length() > 0) {
            try {
                dataWrapper = (DataWrapper) new Gson().fromJson(decrypt, new TypeToken<DataWrapper>() { // from class: com.meituan.android.common.dfingerprint.collection.utils.InstalledAppManager.1
                    public static ChangeQuickRedirect changeQuickRedirect;
                }.getType());
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
                dataWrapper = null;
            }
            if (dataWrapper != null && dataWrapper.data.size() > 0) {
                mApps.set(Collections.unmodifiableList(dataWrapper.data));
                return true;
            }
        }
        return false;
    }

    public boolean fetchFailed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d07cfa87a7ee5924592c1f306e3edf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d07cfa87a7ee5924592c1f306e3edf")).booleanValue() : mApps.get() == null;
    }

    public void updateAppList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4b0bb3c27e175a72fc296b957916238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4b0bb3c27e175a72fc296b957916238");
            return;
        }
        try {
            b.a(DFPTask.obtainExecutor(), this.mAppListFetcher);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    public void updateAppList(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e532aa3301db8cbbcbc5b1bf07d56894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e532aa3301db8cbbcbc5b1bf07d56894");
        } else if (fetchFailed() || z) {
            updateAppList();
        }
    }
}
