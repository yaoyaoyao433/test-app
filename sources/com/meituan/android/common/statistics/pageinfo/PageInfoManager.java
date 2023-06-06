package com.meituan.android.common.statistics.pageinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.SharedPreferencesHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PageInfoManager {
    private static final int MIN_CAPABILITY = 10;
    public static final String UNKNOWN_KEY = "unknown_string_0123456";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mCapability;
    private String mLastPageInfoKey;
    private LinkedHashMap<String, PageInfo> mPageInfoMap;
    private String mPreviousPageInfoKey;
    private ReentrantReadWriteLock mReadWriteLock;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static PageInfoManager mPageInfoManager = new PageInfoManager();
    }

    public PageInfoManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db7dcf55288418b1c1557cf74d1973a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db7dcf55288418b1c1557cf74d1973a8");
            return;
        }
        this.mCapability = 30;
        this.mLastPageInfoKey = null;
        this.mPreviousPageInfoKey = null;
        this.mReadWriteLock = new ReentrantReadWriteLock();
        this.mPageInfoMap = new LinkedHashMap<>(64);
    }

    public static PageInfoManager getInstance() {
        return InnerClass.mPageInfoManager;
    }

    public String getPrePageInfoKey() {
        return this.mPreviousPageInfoKey;
    }

    public String getLastPageInfoKey() {
        return this.mLastPageInfoKey;
    }

    public void setLastPageInfoKey(String str) {
        this.mLastPageInfoKey = str;
    }

    public void setPrePageInfoKey(String str) {
        this.mPreviousPageInfoKey = str;
    }

    public void parsePageInfoMap(Map<String, JSONObject> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23830f0a9bba506d3a634d64717d6d0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23830f0a9bba506d3a634d64717d6d0c");
        } else if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
                String key = entry.getKey();
                if (this.mPageInfoMap != null && !this.mPageInfoMap.containsKey(key)) {
                    PageInfo pageInfo = new PageInfo();
                    pageInfo.parse(entry.getValue());
                    this.mPageInfoMap.put(key, pageInfo);
                }
            }
        }
    }

    public Map<String, JSONObject> getSerializePageInfoMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7c551a82d7a9bd7713b4398d4d8e8ae", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7c551a82d7a9bd7713b4398d4d8e8ae");
        }
        HashMap hashMap = new HashMap();
        if (this.mPageInfoMap != null && !this.mPageInfoMap.isEmpty()) {
            for (Map.Entry<String, PageInfo> entry : this.mPageInfoMap.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toJsonObject());
            }
        }
        return hashMap;
    }

    public void changeCapability(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66f2dbdf06165af1d8d840d759401ced", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66f2dbdf06165af1d8d840d759401ced");
            return;
        }
        if (i < 10) {
            i = 10;
        }
        try {
            try {
                this.mReadWriteLock.writeLock().lock();
                this.mCapability = i;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.mReadWriteLock.writeLock().unlock();
        }
    }

    public PageInfo addPageInfo(@NonNull String str, @NonNull String str2) {
        PageInfo queryCache;
        PageInfo pageInfo;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03cddc7ee366557cdac2d3461fad16ce", 6917529027641081856L)) {
            return (PageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03cddc7ee366557cdac2d3461fad16ce");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.mReadWriteLock.writeLock().lock();
            if (this.mPageInfoMap.containsKey(str)) {
                queryCache = this.mPageInfoMap.get(str);
                if (queryCache != null && str.equals(this.mLastPageInfoKey)) {
                    queryCache.setRef(queryCache.getCid());
                    queryCache.setRequestRefId(queryCache.getRequestId());
                } else {
                    this.mPageInfoMap.remove(str);
                    if (this.mLastPageInfoKey != null) {
                        PageInfo pageInfo2 = this.mPageInfoMap.get(this.mLastPageInfoKey);
                        if (queryCache != null && pageInfo2 != null) {
                            queryCache.setRef(pageInfo2.getCid());
                            queryCache.setRequestRefId(pageInfo2.getRequestId());
                        }
                    }
                    this.mPageInfoMap.put(str, queryCache);
                }
            } else {
                int size = (this.mPageInfoMap.size() - this.mCapability) + 1;
                if (size > 0) {
                    Iterator<String> it = this.mPageInfoMap.keySet().iterator();
                    while (size > 0 && it.hasNext()) {
                        this.mPageInfoMap.remove(it.next());
                        size--;
                    }
                }
                queryCache = PageInfoCache.getInstance().queryCache(str);
                if (queryCache == null) {
                    queryCache = new PageInfo();
                }
                this.mPageInfoMap.put(str, queryCache);
                if (this.mLastPageInfoKey != null && (pageInfo = this.mPageInfoMap.get(this.mLastPageInfoKey)) != null) {
                    queryCache.setRef(pageInfo.getCid());
                    queryCache.setRequestRefId(pageInfo.getRequestId());
                }
            }
            if (queryCache != null) {
                if (TextUtils.isEmpty(queryCache.getCid())) {
                    queryCache.setCid(str2);
                    SharedPreferencesHelper.getInstance(Statistics.getContext()).setLastPageCid(str2);
                }
                queryCache.setRequestId(AppUtil.generateRequestId());
            }
            this.mPreviousPageInfoKey = this.mLastPageInfoKey;
            this.mLastPageInfoKey = str;
            return queryCache;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            this.mReadWriteLock.writeLock().unlock();
        }
    }

    public PageInfo getPageInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddb2315e23133f3c34c695f356249a69", 6917529027641081856L)) {
            return (PageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddb2315e23133f3c34c695f356249a69");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.mReadWriteLock.readLock().lock();
            return this.mPageInfoMap.get(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public PageInfo getPageInfo(Context context, SearchIndexKey searchIndexKey) {
        Object[] objArr = {context, searchIndexKey};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfa8d59b315cfd53e210cea1c33ce566", 6917529027641081856L)) {
            return (PageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfa8d59b315cfd53e210cea1c33ce566");
        }
        if (searchIndexKey == null || TextUtils.isEmpty(searchIndexKey.primaryKey)) {
            return null;
        }
        try {
            this.mReadWriteLock.readLock().lock();
            int i = TextUtils.isEmpty(searchIndexKey.secondaryKey) ? 1 : 8;
            searchIndexKey.matchMode = 2;
            PageInfo searchPageInfo = searchPageInfo(searchIndexKey, i);
            if (searchPageInfo == null && !TextUtils.isEmpty(searchIndexKey.secondaryKey) && !ConfigManager.getInstance(context).isLazyMatchMode()) {
                searchIndexKey.matchMode = 1;
                searchPageInfo = searchPageInfo(searchIndexKey, 1);
            }
            return searchPageInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    private PageInfo searchPageInfo(SearchIndexKey searchIndexKey, int i) {
        Object[] objArr = {searchIndexKey, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c38dc3739b05c70c5e2598efd853d57", 6917529027641081856L)) {
            return (PageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c38dc3739b05c70c5e2598efd853d57");
        }
        ListIterator listIterator = new ArrayList(this.mPageInfoMap.entrySet()).listIterator(this.mPageInfoMap.size());
        while (i > 0 && listIterator.hasPrevious()) {
            PageInfo pageInfo = (PageInfo) ((Map.Entry) listIterator.previous()).getValue();
            if (pageInfo != null && pageInfo.match(searchIndexKey)) {
                return pageInfo;
            }
            i--;
        }
        return null;
    }

    public boolean containsPageInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c87f886f6a52559bdc4f76d27982b78", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c87f886f6a52559bdc4f76d27982b78")).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            this.mReadWriteLock.readLock().lock();
            return this.mPageInfoMap.containsKey(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public String getCurrentPageInfoKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        try {
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7edefc39301004efdeac51fc9961244f", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7edefc39301004efdeac51fc9961244f");
            }
            try {
                this.mReadWriteLock.readLock().lock();
                return this.mLastPageInfoKey;
            } catch (Exception e) {
                e.printStackTrace();
                this.mReadWriteLock.readLock().unlock();
                return "";
            }
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public PageInfo getPreviousPageInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b0e5fd37820f811f125509c32dd8438", 6917529027641081856L)) {
            return (PageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b0e5fd37820f811f125509c32dd8438");
        }
        try {
            this.mReadWriteLock.readLock().lock();
            if (this.mLastPageInfoKey != null && this.mPreviousPageInfoKey != null) {
                return this.mPageInfoMap.get(this.mPreviousPageInfoKey);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public PageInfo getCurrentPageInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7226b17da39decd24b9d5ba95c3ada2b", 6917529027641081856L)) {
            return (PageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7226b17da39decd24b9d5ba95c3ada2b");
        }
        try {
            this.mReadWriteLock.readLock().lock();
            if (this.mLastPageInfoKey == null) {
                return null;
            }
            return this.mPageInfoMap.get(this.mLastPageInfoKey);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public void setValLab(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b497389eeb1a409c4a45d878c7cd850b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b497389eeb1a409c4a45d878c7cd850b");
            return;
        }
        PageInfo pageInfo = getPageInfo(str);
        if (pageInfo != null) {
            pageInfo.addValLab(str2, str3);
        } else {
            PageInfoCache.getInstance().setVallab(str, str2, str3);
        }
    }

    public void setValLab(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0d4a903393a8fd3b8e49b0279df3585", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0d4a903393a8fd3b8e49b0279df3585");
            return;
        }
        PageInfo pageInfo = getPageInfo(str);
        if (pageInfo != null) {
            pageInfo.addValLab(map);
        } else {
            PageInfoCache.getInstance().setVallab(str, map);
        }
    }

    public void clearValLab(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff8ce7728b71add01a661fe2c467bbe1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff8ce7728b71add01a661fe2c467bbe1");
            return;
        }
        PageInfo pageInfo = this.mPageInfoMap.get(str);
        if (pageInfo != null) {
            pageInfo.clearValLab();
        }
    }

    public void setCid(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6ab9da8ab347d55fb0a63643cfde0c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6ab9da8ab347d55fb0a63643cfde0c8");
            return;
        }
        PageInfo pageInfo = getPageInfo(str);
        if (pageInfo != null) {
            pageInfo.setCid(str2);
        } else {
            PageInfoCache.getInstance().setCid(str, str2);
        }
    }

    public String getCid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "539cfac540161e24359afee432a9e1a3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "539cfac540161e24359afee432a9e1a3");
        }
        PageInfo pageInfo = getPageInfo(str);
        if (pageInfo != null) {
            return pageInfo.getCid();
        }
        return PageInfoCache.getInstance().getCid(str);
    }

    public void setProcName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9697cb6ecd20c01c5fe8902a35c78b8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9697cb6ecd20c01c5fe8902a35c78b8c");
            return;
        }
        PageInfo pageInfo = getPageInfo(str);
        if (pageInfo != null) {
            pageInfo.setProName(str2);
        } else {
            PageInfoCache.getInstance().setProcName(str, str2);
        }
    }

    public PageInfo setDefaultChannelName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c709b670b7a55a898c6271aa139fff3", 6917529027641081856L)) {
            return (PageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c709b670b7a55a898c6271aa139fff3");
        }
        PageInfo pageInfo = getInstance().getPageInfo(str);
        if (pageInfo != null) {
            pageInfo.setCategory(str2);
        } else {
            PageInfoCache.getInstance().setDefaultChannelName(str, str2);
        }
        return pageInfo;
    }
}
