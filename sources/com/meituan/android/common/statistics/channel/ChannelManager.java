package com.meituan.android.common.statistics.channel;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Interface.AbsEnvironment;
import com.meituan.android.common.statistics.Interface.IEnvironment;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.cache.CacheFactory;
import com.meituan.android.common.statistics.cache.ICacheHandler;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.report.Reporter;
import com.meituan.android.common.statistics.strategy.IReportStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ChannelManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ICacheHandler mCacheHandler;
    private Map<String, Channel> mChannels;
    private Context mContext;
    private DefaultEnvironment mDefaultEnvironment;
    private IEnvironment mIEnvironment;
    private Reporter mReporter;

    public IReportStrategy getReportStrategy() {
        return null;
    }

    public void setReportStrategy(IReportStrategy iReportStrategy) {
    }

    public ChannelManager(Context context, DefaultEnvironment defaultEnvironment, IEnvironment iEnvironment) {
        Object[] objArr = {context, defaultEnvironment, iEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08bdddd62c57759e407edb95e79785a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08bdddd62c57759e407edb95e79785a0");
            return;
        }
        this.mContext = context;
        this.mChannels = new HashMap();
        this.mDefaultEnvironment = defaultEnvironment;
        this.mIEnvironment = iEnvironment;
        this.mCacheHandler = CacheFactory.getDBCacheHandler(context);
        this.mReporter = new Reporter(context, this.mCacheHandler, defaultEnvironment);
        if (ProcessUtils.isMainProcess(context)) {
            this.mReporter.scheduledReport();
        } else if (Statistics.isSubprocessIndependence()) {
            this.mReporter.scheduledIndependenceReport(context);
        }
    }

    public Channel getChannel(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e25e03396d244e945690d6006342173f", 6917529027641081856L)) {
            return (Channel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e25e03396d244e945690d6006342173f");
        }
        if (TextUtils.isEmpty(str)) {
            str2 = Constants.SDK_INTERNAL_CHANNEL_NAME;
        } else {
            str2 = Constants.PREFIX + str;
        }
        synchronized (this.mChannels) {
            if (this.mChannels.containsKey(str2)) {
                return this.mChannels.get(str2);
            }
            Channel channel = new Channel(str2, this, this.mContext);
            addChannel(str2, channel);
            return channel;
        }
    }

    public Map<String, Channel> getAllChannel() {
        return this.mChannels;
    }

    public boolean checkDPID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "148ea4b9d1779434d78672167fe34839", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "148ea4b9d1779434d78672167fe34839")).booleanValue() : !TextUtils.isEmpty(this.mDefaultEnvironment.getEnvironment().get("dpid"));
    }

    public boolean checkUUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c5564f1d7e903d853678e09ce601389", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c5564f1d7e903d853678e09ce601389")).booleanValue() : !TextUtils.isEmpty(this.mDefaultEnvironment.getEnvironment().get("uuid"));
    }

    public String getDownloadChannelByDefault() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "532c1df0c5b1fbe96d657e1372be9bc2", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "532c1df0c5b1fbe96d657e1372be9bc2") : this.mDefaultEnvironment.initChannel();
    }

    public Map<String, String> getDefaultEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b57bf10c4bf6b4be716ce304e0e6bc74", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b57bf10c4bf6b4be716ce304e0e6bc74");
        }
        try {
            if (this.mIEnvironment != null) {
                this.mDefaultEnvironment.getEnvironment().putAll(getIEnvironment(this.mIEnvironment));
            }
        } catch (Exception unused) {
        }
        return this.mDefaultEnvironment.getEnvironment();
    }

    public ICacheHandler getCacheHandler() {
        return this.mCacheHandler;
    }

    public Reporter getReporter() {
        return this.mReporter;
    }

    public Context getApplicationContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c3716e201e3727b8755747a0cbde901", 6917529027641081856L)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c3716e201e3727b8755747a0cbde901");
        }
        if (this.mContext == null) {
            return null;
        }
        return this.mContext.getApplicationContext();
    }

    public void addChannel(String str, Channel channel) {
        Object[] objArr = {str, channel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99c5156e169295b63f4e73a054acce0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99c5156e169295b63f4e73a054acce0d");
        } else {
            this.mChannels.put(str, channel);
        }
    }

    public void removeChannel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9368983ddc9ef64bffb38315faf8fc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9368983ddc9ef64bffb38315faf8fc6");
        } else {
            this.mChannels.remove(str);
        }
    }

    private Map<String, String> getIEnvironment(IEnvironment iEnvironment) {
        Object[] objArr = {iEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c948562254665819ec15a9426f470749", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c948562254665819ec15a9426f470749");
        }
        HashMap hashMap = new HashMap();
        if (iEnvironment != null) {
            try {
                String appName = iEnvironment.getAppName();
                if (!TextUtils.isEmpty(appName)) {
                    hashMap.put(Constants.Environment.KEY_APPNM, appName);
                }
                String ch = iEnvironment.getCh();
                if (!TextUtils.isEmpty(ch)) {
                    hashMap.put(Constants.Environment.KEY_CH, ch);
                }
                String lat = iEnvironment.getLat();
                if (!TextUtils.isEmpty(lat)) {
                    hashMap.put("lat", lat);
                }
                String lng = iEnvironment.getLng();
                if (!TextUtils.isEmpty(lng)) {
                    hashMap.put("lng", lng);
                }
                String subcid = iEnvironment.getSubcid();
                if (!TextUtils.isEmpty(subcid)) {
                    hashMap.put(Constants.Environment.KEY_SUBCID, subcid);
                }
                String imsi = iEnvironment.getImsi();
                if (!TextUtils.isEmpty(imsi)) {
                    hashMap.put(Constants.Environment.KEY_IMSI, imsi);
                }
                String uid = iEnvironment.getUid();
                if (!TextUtils.isEmpty(uid)) {
                    hashMap.put("uid", uid);
                }
                String loginType = iEnvironment.getLoginType();
                if (!TextUtils.isEmpty(loginType)) {
                    hashMap.put(Constants.Environment.KEY_LOGINTYPE, loginType);
                } else {
                    hashMap.put(Constants.Environment.KEY_LOGINTYPE, "");
                }
                String cityId = iEnvironment.getCityId();
                if (!TextUtils.isEmpty(cityId)) {
                    hashMap.put(Constants.Environment.KEY_CITYID, cityId);
                }
                String mno = iEnvironment.getMno();
                if (!TextUtils.isEmpty(mno)) {
                    hashMap.put(Constants.Environment.KEY_MNO, mno);
                }
                if (iEnvironment instanceof AbsEnvironment) {
                    AbsEnvironment absEnvironment = (AbsEnvironment) iEnvironment;
                    String locateTime = absEnvironment.getLocateTime();
                    if (!TextUtils.isEmpty(locateTime)) {
                        hashMap.put("locate_tm", locateTime);
                    }
                    String locateCityId = absEnvironment.getLocateCityId();
                    if (!TextUtils.isEmpty(locateCityId)) {
                        hashMap.put("locate_city_id", locateCityId);
                    }
                    String localSource = absEnvironment.getLocalSource();
                    if (!TextUtils.isEmpty(localSource)) {
                        hashMap.put(Constants.Environment.KEY_LOCAL_SOURCE, localSource);
                    }
                    String iccId = absEnvironment.getIccId();
                    if (!TextUtils.isEmpty(iccId)) {
                        hashMap.put(Constants.Environment.KEY_ICCID, iccId);
                    }
                    String apn = absEnvironment.getApn();
                    if (!TextUtils.isEmpty(apn)) {
                        hashMap.put(Constants.Environment.KEY_APN, apn);
                    }
                    String sc = absEnvironment.getSc();
                    if (!TextUtils.isEmpty(sc)) {
                        hashMap.put(Constants.Environment.KEY_SC, sc);
                    }
                    String app = absEnvironment.getAPP();
                    if (!TextUtils.isEmpty(app)) {
                        hashMap.put("app", app);
                    }
                    String canaryRelease = absEnvironment.getCanaryRelease();
                    if (!TextUtils.isEmpty(canaryRelease)) {
                        hashMap.put(Constants.Environment.KEY_CANARY_RELEASE, canaryRelease);
                    }
                    String adid = absEnvironment.getAdid();
                    if (!TextUtils.isEmpty(adid)) {
                        hashMap.put(Constants.Environment.KEY_ADVERTISING_ID, adid);
                    }
                    String category = absEnvironment.getCategory();
                    if (!TextUtils.isEmpty(category)) {
                        hashMap.put("category", category);
                    }
                    String androidId = absEnvironment.getAndroidId();
                    if (!TextUtils.isEmpty(androidId)) {
                        hashMap.put("android_id", androidId);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public Map<String, Object> getEventExtraData(String str, String str2, String str3, EventName eventName) {
        Object[] objArr = {str, str2, str3, eventName};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ae45fcd9f60e80d45b94b009dd43c8b", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ae45fcd9f60e80d45b94b009dd43c8b");
        }
        if (this.mIEnvironment == null || !(this.mIEnvironment instanceof AbsEnvironment)) {
            return null;
        }
        return ((AbsEnvironment) this.mIEnvironment).getEventExtraData(str, str2, str3, eventName);
    }
}
