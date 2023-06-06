package com.meituan.android.common.statistics.flowmanager;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.flowmanager.FlowManager;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.DESHelper;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ServerInteceptStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mAppName;
    public boolean mEmpty_bid_blk;
    public long mFileLastModified;
    public String mFileMd5Lasted;
    public ConcurrentHashMap<String, Set> mFilterBidList;
    public Set<String> mFilterCidList;
    public long mLastUpdateTm;
    public FlowManager.Stat mStat;
    public int mVersion;

    public ServerInteceptStrategy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac6216b0c61419edfce5bf5f1d468cfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac6216b0c61419edfce5bf5f1d468cfa");
            return;
        }
        this.mVersion = 0;
        this.mLastUpdateTm = -1L;
        this.mEmpty_bid_blk = false;
        this.mAppName = null;
        this.mFileLastModified = 0L;
        this.mFileMd5Lasted = null;
        this.mFilterBidList = null;
        this.mFilterCidList = null;
        this.mStat = null;
        this.mFilterCidList = Collections.synchronizedSet(new HashSet());
        this.mFilterBidList = new ConcurrentHashMap<>();
    }

    public void injectStat(FlowManager.Stat stat) {
        this.mStat = stat;
    }

    public boolean intercept(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2868aac3f64e9bd7529656fd3cce52dd", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2868aac3f64e9bd7529656fd3cce52dd")).booleanValue();
        }
        if (!EventName.isPageEvent(str) && !EventName.isApplicationEvent(str) && !EventName.MODEL_DISAPPEAR.equals(str)) {
            LogUtil.log("intercept: cid:" + str2 + " webcid:" + str3 + " bid:" + str4);
            if (!TextUtils.isEmpty(str3) && this.mFilterCidList.contains(str3)) {
                LogUtil.log("intercept: webcid:" + str3 + " bid:" + str4 + " == cid matched");
                if (this.mStat != null) {
                    this.mStat.hitByCid(str3);
                    return true;
                }
                return true;
            } else if (!TextUtils.isEmpty(str2) && this.mFilterCidList.contains(str2)) {
                LogUtil.log("intercept: cid:" + str2 + " bid:" + str4 + " == cid matched");
                if (this.mStat != null) {
                    this.mStat.hitByCid(str2);
                    return true;
                }
                return true;
            } else if (!TextUtils.isEmpty(str4) && this.mFilterBidList.containsKey(str4)) {
                Set set = this.mFilterBidList.get(str4);
                if (set.size() == 0) {
                    LogUtil.log("intercept: cid:" + str2 + " bid:" + str4 + " == bid matched");
                    if (this.mStat != null) {
                        this.mStat.hitByBid(str4);
                        return true;
                    }
                    return true;
                } else if (TextUtils.isEmpty(str2) || !set.contains(str2)) {
                    return false;
                } else {
                    LogUtil.log("intercept: cid:" + str2 + " bid:" + str4 + " == bid matched");
                    if (this.mStat != null) {
                        this.mStat.hitByBid(str4);
                        return true;
                    }
                    return true;
                }
            } else if (TextUtils.isEmpty(str4) && this.mEmpty_bid_blk) {
                if (this.mStat != null) {
                    this.mStat.hitNullBid();
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbc3e65f6f8db5aece63537e994241f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbc3e65f6f8db5aece63537e994241f1");
            return;
        }
        this.mLastUpdateTm = -1L;
        this.mEmpty_bid_blk = false;
        this.mAppName = null;
        this.mFilterBidList.clear();
        this.mFilterCidList.clear();
    }

    public void ruleParse(Context context, String str) {
        boolean z = true;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20cefa27e6cd5cc90d48d81c4899ca2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20cefa27e6cd5cc90d48d81c4899ca2b");
        } else if (TextUtils.isEmpty(str)) {
            reset();
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("app_name");
                long optLong = jSONObject.optLong(Constant.TAG_TM);
                if (!needUpdate(context, this, optString, optLong)) {
                    LogUtil.log("flow interceptor file no need update");
                    return;
                }
                reset();
                this.mAppName = optString;
                this.mEmpty_bid_blk = jSONObject.optBoolean(Constant.TAG_EMPTY_BID_BLK);
                this.mLastUpdateTm = optLong;
                JSONObject optJSONObject = jSONObject.optJSONObject("bid");
                boolean z2 = optJSONObject != null;
                if (optJSONObject.length() <= 0) {
                    z = false;
                }
                if (z2 & z) {
                    LogUtil.log("file rule bid parse:" + optJSONObject.toString());
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                        HashSet hashSet = new HashSet();
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString2 = optJSONArray.optString(i);
                                if (!TextUtils.isEmpty(optString2)) {
                                    hashSet.add(optString2);
                                }
                            }
                        }
                        this.mFilterBidList.put(next, hashSet);
                    }
                }
                for (Map.Entry<String, Set> entry : this.mFilterBidList.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        sb.append("   " + ((String) it.next()) + "  ");
                    }
                    LogUtil.log("parsed bid key :" + entry.getKey() + " cidlist:" + ((Object) sb));
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("cid");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    LogUtil.log("file rule cid parse:" + optJSONArray2.toString());
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        String optString3 = optJSONArray2.optString(i2);
                        if (!TextUtils.isEmpty(optString3)) {
                            this.mFilterCidList.add(optString3);
                        }
                    }
                }
                Iterator<String> it2 = this.mFilterCidList.iterator();
                while (it2.hasNext()) {
                    LogUtil.log("parsed cid item :" + it2.next());
                }
            } catch (Throwable th) {
                th.getStackTrace();
            }
        }
    }

    public boolean checkFileModified(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "955c81e85bc4fd10ff4358f534c06d4e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "955c81e85bc4fd10ff4358f534c06d4e")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            long lastModified = file.exists() ? file.lastModified() : 0L;
            if (lastModified == this.mFileLastModified) {
                return false;
            }
            this.mFileLastModified = lastModified;
        }
        return true;
    }

    public boolean checkFileMd5(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b1961adda1d3245c7a2a90e0875850f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b1961adda1d3245c7a2a90e0875850f")).booleanValue();
        }
        File file = new File(str);
        if (!TextUtils.isEmpty(str) && file.length() > 0) {
            String md5 = DESHelper.getMD5(file);
            if (md5 != null && md5.equals(this.mFileMd5Lasted)) {
                return false;
            }
            this.mFileMd5Lasted = md5;
        }
        return true;
    }

    public String getFileMd5() {
        return this.mFileMd5Lasted;
    }

    public boolean needUpdate(Context context, ServerInteceptStrategy serverInteceptStrategy, String str, long j) {
        Object[] objArr = {context, serverInteceptStrategy, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9daad9eb4d7081ac221b6f45723e28c0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9daad9eb4d7081ac221b6f45723e28c0")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(AppUtil.getApplicationName(context))) {
            return serverInteceptStrategy == null || j != serverInteceptStrategy.mLastUpdateTm;
        }
        return false;
    }
}
