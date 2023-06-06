package com.meituan.android.common.statistics.channel;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.networklog.c;
import com.meituan.android.common.analyse.BuildConfig;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.ipc.independent.SyncInfoHandler;
import com.meituan.android.common.statistics.session.SessionManager;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.DeviceUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.common.statistics.utils.NetworkUtils;
import com.meituan.android.common.statistics.utils.TrackIDUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.common.utils.ProcessUtils;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DefaultEnvironment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;
    private Map<String, String> mEnvironment;

    /* JADX INFO: Access modifiers changed from: private */
    public String getClientType() {
        return "android";
    }

    public DefaultEnvironment(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1dd0bc397eb13874134528744d147be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1dd0bc397eb13874134528744d147be");
            return;
        }
        this.mContext = context;
        this.mEnvironment = new ConcurrentHashMap<String, String>() { // from class: com.meituan.android.common.statistics.channel.DefaultEnvironment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
            public String put(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8ec3dd5663e4c9594beab75a4cb6f0ff", 6917529027641081856L)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8ec3dd5663e4c9594beab75a4cb6f0ff");
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                return (String) super.put((AnonymousClass1) str, str2);
            }
        };
        init();
    }

    public Map<String, String> getEnvironment() {
        return this.mEnvironment;
    }

    public boolean setEnvironment(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70e38435c9b29bd290992330da341fed", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70e38435c9b29bd290992330da341fed")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (this.mEnvironment.containsKey(str) || "lch".equals(str)) {
            this.mEnvironment.put(str, str2);
            return true;
        }
        return false;
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "235eb4bf1a1ea064a32141f327229499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "235eb4bf1a1ea064a32141f327229499");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.DefaultEnvironment.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ed0364e447bcb99086c88983fb457d3c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ed0364e447bcb99086c88983fb457d3c");
                        return;
                    }
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_APPNM, AppUtil.getApplicationName(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("did", AppUtil.getDeviceId(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("msid", SessionManager.getMSID(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_APP_SESSION, SessionManager.getAppMSID(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_CT, DefaultEnvironment.this.getClientType());
                    DefaultEnvironment.this.mEnvironment.put("app", AppUtil.getVersionName(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_VERSION_CODE, AppUtil.getVersionCode(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("meid", AppUtil.getMEID(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("imei", AppUtil.getIMEI(DefaultEnvironment.this.mContext));
                    String imei2 = AppUtil.getIMEI2(DefaultEnvironment.this.mContext);
                    if (!TextUtils.isEmpty(imei2)) {
                        DefaultEnvironment.this.mEnvironment.put("imei2", imei2);
                    }
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_ICCID, AppUtil.getICCID(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_MNO, AppUtil.getMNO(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_APN, AppUtil.getAPN(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_IMSI, AppUtil.getIMSI(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("net", AppUtil.getNetWorkType(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("sdk_ver", BuildConfig.LX_VERSION_NAME);
                    DefaultEnvironment.this.mEnvironment.put("wifi", AppUtil.getWifiState(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("mac", NetworkUtils.mac(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_BSSID, NetworkUtils.getBSSID(DefaultEnvironment.this.mContext));
                    String str = Build.MODEL == null ? "unknown" : Build.MODEL;
                    String str2 = Build.BRAND == null ? "unknown" : Build.BRAND;
                    String str3 = Build.VERSION.RELEASE == null ? "unknown" : Build.VERSION.RELEASE;
                    String str4 = Build.HOST == null ? "unknown" : Build.HOST;
                    DefaultEnvironment.this.mEnvironment.put("os", str3);
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_OSN, str4);
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_DM, str);
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_SERIAL_NUMBER, DefaultEnvironment.this.getSerial(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("brand", str2);
                    DefaultEnvironment.this.mEnvironment.put("android_id", AppUtil.getAndroidId(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_SC, AppUtil.getDisplayScreenResolution(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_BUILD_VERSION, AppUtil.getBuildNum(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_APP_ARCH, String.valueOf(ProcessUtils.is64Bit()));
                    DefaultEnvironment.this.mEnvironment.put("scale", DeviceUtil.getScreenDPI(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("pn", DefaultEnvironment.this.mContext.getPackageName());
                    String trackId = TrackIDUtil.getTrackId(DefaultEnvironment.this.mContext);
                    if (!TextUtils.isEmpty(trackId)) {
                        DefaultEnvironment.this.mEnvironment.put(Constants.Environment.MK_TRACK_ID, trackId);
                    }
                    try {
                        JSONObject mapToJSONObject = JsonUtil.mapToJSONObject(DefaultEnvironment.this.mEnvironment);
                        if (mapToJSONObject != null) {
                            c.a(mapToJSONObject.toString(), 8);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    SyncInfoHandler.getInstance().handleSyncInfoOnStart(SyncInfoHandler.getInstance().getSyncInfoStr());
                }
            });
        }
    }

    public void update() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaebef1a0a5f24936283dd7f31dde17a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaebef1a0a5f24936283dd7f31dde17a");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.DefaultEnvironment.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1327756ee972aec15d6123e994c3bb9f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1327756ee972aec15d6123e994c3bb9f");
                        return;
                    }
                    DefaultEnvironment.this.mEnvironment.put("did", AppUtil.getDeviceId(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("meid", AppUtil.getMEID(DefaultEnvironment.this.mContext));
                    DefaultEnvironment.this.mEnvironment.put("imei", AppUtil.getIMEI(DefaultEnvironment.this.mContext));
                    String imei2 = AppUtil.getIMEI2(DefaultEnvironment.this.mContext);
                    if (!TextUtils.isEmpty(imei2)) {
                        DefaultEnvironment.this.mEnvironment.put("imei2", imei2);
                    }
                    DefaultEnvironment.this.mEnvironment.put(Constants.Environment.KEY_IMSI, AppUtil.getIMSI(DefaultEnvironment.this.mContext));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSerial(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b20040fa5d3f67f2d3d7c5d04b65e94", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b20040fa5d3f67f2d3d7c5d04b65e94") : com.meituan.android.common.unionid.oneid.util.AppUtil.getSerial(context);
    }

    private String getChannel() {
        ZipFile zipFile;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39c73419de74f251c88994214b673033", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39c73419de74f251c88994214b673033");
        }
        String str = "";
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(this.mContext.getApplicationInfo().sourceDir);
            } catch (Throwable th) {
                th = th;
                zipFile = null;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (true) {
                if (!entries.hasMoreElements()) {
                    break;
                }
                String name = entries.nextElement().getName();
                if (name.startsWith(Constants.CHANNEL_NAME)) {
                    str = name;
                    break;
                }
            }
            String[] split = str.split(CommonConstant.Symbol.UNDERLINE);
            if (split == null || split.length < 2) {
                try {
                    zipFile.close();
                } catch (Throwable th2) {
                    LogUtil.log("statistics", "DefaultEnvironment - getChannel:" + th2.getMessage());
                }
                return Constants.UNDEFINED;
            }
            String substring = str.substring(split[0].length() + 1);
            try {
                zipFile.close();
            } catch (Throwable th3) {
                LogUtil.log("statistics", "DefaultEnvironment - getChannel:" + th3.getMessage());
            }
            return substring;
        } catch (Exception e2) {
            e = e2;
            zipFile2 = zipFile;
            LogUtil.log("statistics", "DefaultEnvironment - getChannel:" + e.getMessage());
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (Throwable th4) {
                    LogUtil.log("statistics", "DefaultEnvironment - getChannel:" + th4.getMessage());
                }
            }
            return Constants.UNDEFINED;
        } catch (Throwable th5) {
            th = th5;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (Throwable th6) {
                    LogUtil.log("statistics", "DefaultEnvironment - getChannel:" + th6.getMessage());
                }
            }
            throw th;
        }
    }

    public String initChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e8c90abec350f595b0ec73f23ce48b9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e8c90abec350f595b0ec73f23ce48b9");
        }
        if (this.mEnvironment.containsKey(Constants.Environment.KEY_CH)) {
            return null;
        }
        String channel = getChannel();
        this.mEnvironment.put(Constants.Environment.KEY_CH, channel);
        return channel;
    }

    public void update(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bae8982e1cb2b4d661b3e51c2d200c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bae8982e1cb2b4d661b3e51c2d200c2");
        } else {
            this.mEnvironment.put(str, str2);
        }
    }

    public void update(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4d844652a1deb0053315eee404a46e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4d844652a1deb0053315eee404a46e0");
        } else {
            this.mEnvironment.putAll(map);
        }
    }
}
