package com.meituan.android.common.dfingerprint.update;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.dfingerprint.bean.DFPID;
import com.meituan.android.common.dfingerprint.collection.utils.StringUtils;
import com.meituan.android.common.dfingerprint.collection.workers.EnvInfoWorker;
import com.meituan.android.common.dfingerprint.impl.DFPReporter;
import com.meituan.android.common.dfingerprint.interfaces.ICypher;
import com.meituan.android.common.dfingerprint.network.ContentType;
import com.meituan.android.common.dfingerprint.network.IResponseParser;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.mtguard.collect.e;
import com.meituan.android.common.mtguard.collect.k;
import com.meituan.android.common.mtguard.collect.p;
import com.meituan.android.common.mtguard.utils.c;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* loaded from: classes2.dex */
public class MiniBat {
    public static final long MINI_BAT_DELAY_TIME = 10000;
    public static final long MINI_BAT_PERIOD_TIME = 1800000;
    private static final String TAG = "MiniBat";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Context mContext;
    private static ICypher mCypher;

    /* loaded from: classes2.dex */
    public static class MiniBatBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String data;
        private String idid;
        private Context mContext;
        private String mDFPID;
        private String mXid;

        public MiniBatBean(Context context, String str, String str2) {
            Object[] objArr = {context, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23bba2b0ee6231cf430d4f4f51eb0070", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23bba2b0ee6231cf430d4f4f51eb0070");
                return;
            }
            this.mDFPID = "";
            this.mXid = "";
            this.idid = "";
            this.data = "";
            this.mContext = context;
            this.mDFPID = str;
            this.mXid = str2;
        }

        public void getLocal(File file, String str, JsonArray jsonArray) {
            Object[] objArr = {file, str, jsonArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61927de60ed43662208b3148dc464c25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61927de60ed43662208b3148dc464c25");
                return;
            }
            try {
                File[] listFiles = new File(file.getParentFile().getCanonicalPath() + File.separator + str).listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        String[] split = file2.getName().split(CommonConstant.Symbol.UNDERLINE);
                        if (split != null && split.length == 2) {
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.addProperty("id", split[0]);
                            jsonObject.addProperty("md5", split[1]);
                            jsonArray.add(jsonObject);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }

        public MiniBatBean setData(String str) {
            this.data = str;
            return this;
        }

        public MiniBatBean setIdid(String str) {
            this.idid = str;
            return this;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac628467fcb2f3e8fb100e3dab065681", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac628467fcb2f3e8fb100e3dab065681");
            }
            try {
                String str = c.a() ? "64" : "32";
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("brand", Build.BRAND);
                jsonObject.addProperty("version", Integer.valueOf(Build.VERSION.SDK_INT));
                jsonObject.addProperty("display", Build.DISPLAY);
                String b = k.a(this.mContext).b();
                if (b.isEmpty()) {
                    b = StringUtils.change(b);
                }
                jsonObject.addProperty("coordinates", b);
                jsonObject.addProperty("pkgname", this.mContext.getPackageName());
                jsonObject.addProperty("dfpid", this.mDFPID);
                jsonObject.addProperty("xid", this.mXid);
                jsonObject.addProperty("cpuABI", UpdateUtil.cpuABI());
                jsonObject.addProperty("md5", UpdateUtil.uMD5(this.mContext, str));
                jsonObject.addProperty("sov", NBridge.main1(49, new Object[0]));
                if (!TextUtils.isEmpty(this.data)) {
                    jsonObject.addProperty("data", this.data);
                    jsonObject.addProperty("time", Long.valueOf(System.currentTimeMillis()));
                }
                if (!TextUtils.isEmpty(this.idid)) {
                    jsonObject.addProperty("idid", this.idid);
                }
                jsonObject.addProperty("uuid", p.a(this.mContext).a());
                jsonObject.addProperty(DeviceInfo.USER_ID, EnvInfoWorker.getUserId(MTGuard.getAdapter().a));
                jsonObject.addProperty("arch", str);
                JsonArray jsonArray = new JsonArray();
                JsonArray jsonArray2 = new JsonArray();
                File a = q.a(this.mContext, "mtg_dfp", "m", u.e);
                if (a != null) {
                    getLocal(a, "32", jsonArray);
                    getLocal(a, "64", jsonArray2);
                }
                jsonObject.add(PackageLoadReporter.LoadType.LOCAL, jsonArray);
                jsonObject.add("local64", jsonArray2);
                return jsonObject.toString();
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    public MiniBat(Context context, ICypher iCypher) {
        Object[] objArr = {context, iCypher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2097b357b359dfad1a7d6fa3fb266487", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2097b357b359dfad1a7d6fa3fb266487");
            return;
        }
        mContext = context;
        mCypher = iCypher;
    }

    public static /* synthetic */ String access$000() {
        return getDFPID();
    }

    public static void doMiniBat(Context context, ICypher iCypher) {
        Object[] objArr = {context, iCypher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "81c2d075da3822e7ddea4a35aeab8831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "81c2d075da3822e7ddea4a35aeab8831");
        } else {
            new MiniBat(context, iCypher).miniBat();
        }
    }

    public static Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f24f26c04b2ce4c53ee36bc3c2cb09e7", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f24f26c04b2ce4c53ee36bc3c2cb09e7") : MTGuard.getAdapter().a;
    }

    private static String getDFPID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac6f6230bb8e47fefd22ff3dc2459406", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac6f6230bb8e47fefd22ff3dc2459406") : DFPID.getDFPID();
    }

    public static byte[] getM(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f91a9b146b5ddbb7a2965af0f0349847", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f91a9b146b5ddbb7a2965af0f0349847");
        }
        try {
            return new DFPReporter.Builder().addInterceptor(e.a.getInterceptor()).build().getCommon(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getXid() {
        return SyncStoreManager.sXid == null ? "" : SyncStoreManager.sXid.id;
    }

    private boolean post(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f8e69300b8f7a57a1cf4db45a6b6f46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f8e69300b8f7a57a1cf4db45a6b6f46")).booleanValue();
        }
        try {
            boolean requestMiniBat = new DFPReporter.Builder().addInterceptor(e.a.getInterceptor()).addResponseParser(new IResponseParser() { // from class: com.meituan.android.common.dfingerprint.update.MiniBat.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
                public boolean onError(int i, String str2) {
                    return false;
                }

                @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
                public boolean onResponse(int i, byte[] bArr, long j, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), bArr, new Long(j), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c8f63905b338f5504ad9930a2f9b63c0", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c8f63905b338f5504ad9930a2f9b63c0")).booleanValue();
                    }
                    if (bArr != null) {
                        try {
                            if (bArr.length != 0 && i == 200) {
                                MiniBat.this.report(NBridge.main1(46, new Object[]{new String(bArr), MiniBat.access$000(), MiniBat.mContext}), true);
                                return true;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return false;
                }
            }).build().requestMiniBat(str, ContentType.application_json);
            if (!requestMiniBat && z) {
                try {
                    return post(str, false);
                } catch (Throwable unused) {
                }
            }
            return requestMiniBat;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public static byte[] postM(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a8e514cf944bd1e14da114f5042142c", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a8e514cf944bd1e14da114f5042142c");
        }
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return new DFPReporter.Builder().addInterceptor(e.a.getInterceptor()).build().postCommon(str, new MiniBatBean(getContext(), getDFPID(), getXid()).setData(str2).setIdid(str3).toString());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public void miniBat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70ec7e8ec5d557e27e4aaf7d77150b29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70ec7e8ec5d557e27e4aaf7d77150b29");
            return;
        }
        try {
            if (mContext != null && mCypher != null) {
                String miniBatBean = new MiniBatBean(mContext, getDFPID(), getXid()).toString();
                if (TextUtils.isEmpty(miniBatBean)) {
                    return;
                }
                String encrypt = UpdateUtil.encrypt(mCypher, miniBatBean);
                if (TextUtils.isEmpty(encrypt)) {
                    return;
                }
                UpdateRequestBody updateRequestBody = new UpdateRequestBody(encrypt);
                Gson create = new GsonBuilder().disableHtmlEscaping().create();
                if (create != null) {
                    post(create.toJson(updateRequestBody), true);
                }
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    public boolean report(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96ddb247bd6e370c525a398270c6ed2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96ddb247bd6e370c525a398270c6ed2b")).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            boolean reportMiniBat = new DFPReporter.Builder().addInterceptor(e.a.getInterceptor()).addResponseParser(new IResponseParser() { // from class: com.meituan.android.common.dfingerprint.update.MiniBat.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
                public boolean onError(int i, String str2) {
                    return true;
                }

                @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
                public boolean onResponse(int i, byte[] bArr, long j, int i2) {
                    return i == 200;
                }
            }).build().reportMiniBat(str, ContentType.plain_text);
            if (!reportMiniBat && z) {
                try {
                    return post(str, false);
                } catch (Throwable unused) {
                }
            }
            return reportMiniBat;
        } catch (Throwable unused2) {
            return true;
        }
    }
}
