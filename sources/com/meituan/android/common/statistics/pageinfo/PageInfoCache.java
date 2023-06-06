package com.meituan.android.common.statistics.pageinfo;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PageInfoCache {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ConcurrentHashMap<String, PageInfo> mPageInfoCache;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        public static PageInfoCache STUB = new PageInfoCache();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public PageInfoCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50b792093122d52f7a57e3555633652c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50b792093122d52f7a57e3555633652c");
        } else {
            this.mPageInfoCache = new ConcurrentHashMap<String, PageInfo>() { // from class: com.meituan.android.common.statistics.pageinfo.PageInfoCache.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
                public PageInfo put(@NonNull String str, @NonNull PageInfo pageInfo) {
                    Object[] objArr2 = {str, pageInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "94fb006a5bae2b1c018db6243d800b55", 6917529027641081856L)) {
                        return (PageInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "94fb006a5bae2b1c018db6243d800b55");
                    }
                    if (TextUtils.isEmpty(str) || pageInfo == null) {
                        return null;
                    }
                    return (PageInfo) super.put((AnonymousClass1) str, (String) pageInfo);
                }
            };
        }
    }

    public static PageInfoCache getInstance() {
        return InnerClass.STUB;
    }

    public void setVallab(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d171c74c2b274b72ef023da78ef6e828", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d171c74c2b274b72ef023da78ef6e828");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            PageInfo pageInfo = this.mPageInfoCache.get(str);
            if (pageInfo == null) {
                pageInfo = new PageInfo();
                this.mPageInfoCache.put(str, pageInfo);
            }
            pageInfo.addValLab(map);
        }
    }

    public void setVallab(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adbb25bab781a914864c41da8749cfdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adbb25bab781a914864c41da8749cfdd");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            PageInfo pageInfo = this.mPageInfoCache.get(str);
            if (pageInfo == null) {
                pageInfo = new PageInfo();
                this.mPageInfoCache.put(str, pageInfo);
            }
            pageInfo.addValLab(str2, str3);
        }
    }

    public void setCid(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c21256818417245121ee7ad6fc36537", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c21256818417245121ee7ad6fc36537");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            PageInfo pageInfo = this.mPageInfoCache.get(str);
            if (pageInfo == null) {
                pageInfo = new PageInfo();
                this.mPageInfoCache.put(str, pageInfo);
            }
            pageInfo.setCid(str2);
        }
    }

    public String getCid(String str) {
        PageInfo pageInfo;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1e280aa83dbe3a40dd75a70b7965ebe", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1e280aa83dbe3a40dd75a70b7965ebe");
        }
        if (TextUtils.isEmpty(str) || (pageInfo = this.mPageInfoCache.get(str)) == null) {
            return null;
        }
        return pageInfo.getCid();
    }

    public void setProcName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e88a07543ea199efc49f56aaac6cc0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e88a07543ea199efc49f56aaac6cc0e");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            PageInfo pageInfo = this.mPageInfoCache.get(str);
            if (pageInfo == null) {
                pageInfo = new PageInfo();
                this.mPageInfoCache.put(str, pageInfo);
            }
            pageInfo.setProName(str2);
        }
    }

    public void setDefaultChannelName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49de55c2cb349453b5d03ba13e825740", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49de55c2cb349453b5d03ba13e825740");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            PageInfo pageInfo = this.mPageInfoCache.get(str);
            if (pageInfo == null) {
                pageInfo = new PageInfo();
                this.mPageInfoCache.put(str, pageInfo);
            }
            pageInfo.setCategory(str2);
        }
    }

    public PageInfo queryCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2db2ddeaeffd23fc5ae3eec0e2f8240b", 6917529027641081856L)) {
            return (PageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2db2ddeaeffd23fc5ae3eec0e2f8240b");
        }
        for (String str2 : this.mPageInfoCache.keySet()) {
            if (str2.equals(str)) {
                PageInfo pageInfo = this.mPageInfoCache.get(str);
                this.mPageInfoCache.remove(str);
                return pageInfo;
            }
        }
        return null;
    }
}
