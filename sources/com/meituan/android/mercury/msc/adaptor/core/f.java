package com.meituan.android.mercury.msc.adaptor.core;

import android.text.TextUtils;
import android.util.LruCache;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.android.mercury.msc.adaptor.bean.MSCAppMetaInfo;
import com.meituan.android.mercury.msc.adaptor.bean.MSCCacheIndexInfo;
import com.meituan.android.mercury.msc.adaptor.bean.MSCPackageInfo;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.met.mercury.load.bean.MSCAppIdPublishId;
import com.meituan.met.mercury.load.bean.ResourceIdVersion;
import com.meituan.met.mercury.load.core.r;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f c;
    HashMap<String, MSCCacheIndexInfo> b;
    private final q d;
    private LruCache<String, MSCAppMetaInfo> e;
    private final ag<MSCAppMetaInfo> f;
    private final ag<HashMap<String, MSCCacheIndexInfo>> g;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b475d3fdabe074df69a9fdcb437719f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b475d3fdabe074df69a9fdcb437719f");
            return;
        }
        this.e = new LruCache<>(10);
        this.f = new ag<MSCAppMetaInfo>() { // from class: com.meituan.android.mercury.msc.adaptor.core.f.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.ag
            public final /* synthetic */ MSCAppMetaInfo deserializeFromString(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a83e9184342c619ff7f9eab6253a0431", RobustBitConfig.DEFAULT_VALUE) ? (MSCAppMetaInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a83e9184342c619ff7f9eab6253a0431") : (MSCAppMetaInfo) com.meituan.met.mercury.load.utils.a.a(str, (Class<Object>) MSCAppMetaInfo.class);
            }

            @Override // com.meituan.android.cipstorage.ag
            public final /* synthetic */ String serializeAsString(MSCAppMetaInfo mSCAppMetaInfo) {
                MSCAppMetaInfo mSCAppMetaInfo2 = mSCAppMetaInfo;
                Object[] objArr2 = {mSCAppMetaInfo2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1db1a6619ac9eac84f255aa53366ce4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1db1a6619ac9eac84f255aa53366ce4") : com.meituan.met.mercury.load.utils.a.a(mSCAppMetaInfo2);
            }
        };
        this.g = new ag<HashMap<String, MSCCacheIndexInfo>>() { // from class: com.meituan.android.mercury.msc.adaptor.core.f.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.ag
            public final /* synthetic */ HashMap<String, MSCCacheIndexInfo> deserializeFromString(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00effea20622703ca225eca7ad6fb2b2", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00effea20622703ca225eca7ad6fb2b2") : (HashMap) com.meituan.met.mercury.load.utils.a.a(str, new TypeToken<HashMap<String, MSCCacheIndexInfo>>() { // from class: com.meituan.android.mercury.msc.adaptor.core.f.2.1
                }.getType());
            }

            @Override // com.meituan.android.cipstorage.ag
            public final /* synthetic */ String serializeAsString(HashMap<String, MSCCacheIndexInfo> hashMap) {
                HashMap<String, MSCCacheIndexInfo> hashMap2 = hashMap;
                Object[] objArr2 = {hashMap2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "636e4eb32c82939b3bee6c3288121bd9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "636e4eb32c82939b3bee6c3288121bd9") : com.meituan.met.mercury.load.utils.a.a(hashMap2);
            }
        };
        this.d = com.meituan.met.mercury.load.core.e.a("msc_adaptor");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c344d70527a4bd6ed322e24131d2686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c344d70527a4bd6ed322e24131d2686");
            return;
        }
        this.b = (HashMap) this.d.a("msc_appId_cache", this.g);
        if (this.b == null) {
            this.b = new HashMap<>();
        }
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92513ba3acfea3598ee8f034d40a073d", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92513ba3acfea3598ee8f034d40a073d");
        }
        if (c == null) {
            synchronized (f.class) {
                if (c == null) {
                    c = new f();
                }
            }
        }
        return c;
    }

    public final synchronized List<MSCAppIdPublishId> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82622d702d36fbd53a06dd976adf0d9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82622d702d36fbd53a06dd976adf0d9b");
        }
        HashMap hashMap = new HashMap(this.b);
        ArrayList arrayList = new ArrayList();
        if (hashMap.size() > 0) {
            for (MSCCacheIndexInfo mSCCacheIndexInfo : hashMap.values()) {
                arrayList.add(new MSCAppIdPublishId(mSCCacheIndexInfo.appId, mSCCacheIndexInfo.publishId));
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
            return null;
        }
        return null;
    }

    public final synchronized MSCAppMetaInfo a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db2788aeb117cce2c516351b02a66a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCAppMetaInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db2788aeb117cce2c516351b02a66a0");
        } else if (this.b.containsKey(str)) {
            MSCAppMetaInfo mSCAppMetaInfo = this.e.get(str);
            if (mSCAppMetaInfo != null) {
                return mSCAppMetaInfo;
            }
            MSCAppMetaInfo mSCAppMetaInfo2 = (MSCAppMetaInfo) this.d.a(b(str), this.f);
            if (mSCAppMetaInfo2 != null && !TextUtils.isEmpty(mSCAppMetaInfo2.getAppId())) {
                this.e.put(mSCAppMetaInfo2.getAppId(), mSCAppMetaInfo2);
            }
            return mSCAppMetaInfo2;
        } else {
            return null;
        }
    }

    public final synchronized MSCAppMetaInfo a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0877497d951f41bc15da09a7f1eb7575", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCAppMetaInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0877497d951f41bc15da09a7f1eb7575");
        } else if (this.b.containsKey(str)) {
            if (System.currentTimeMillis() - this.b.get(str).getTime >= j * 1000) {
                return null;
            }
            MSCAppMetaInfo mSCAppMetaInfo = this.e.get(str);
            if (mSCAppMetaInfo != null) {
                return mSCAppMetaInfo;
            }
            MSCAppMetaInfo mSCAppMetaInfo2 = (MSCAppMetaInfo) this.d.a(b(str), this.f);
            if (mSCAppMetaInfo2 != null && !TextUtils.isEmpty(mSCAppMetaInfo2.getAppId())) {
                this.e.put(mSCAppMetaInfo2.getAppId(), mSCAppMetaInfo2);
            }
            return mSCAppMetaInfo2;
        } else {
            return null;
        }
    }

    private synchronized void a(MSCAppMetaInfo mSCAppMetaInfo) {
        Object[] objArr = {mSCAppMetaInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de7f2c59934263db383e6cbc9001423f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de7f2c59934263db383e6cbc9001423f");
            return;
        }
        MSCCacheIndexInfo mSCCacheIndexInfo = this.b.get(mSCAppMetaInfo.getAppId());
        MSCAppMetaInfo mSCAppMetaInfo2 = null;
        if (mSCCacheIndexInfo != null && !TextUtils.equals(mSCCacheIndexInfo.publishId, mSCAppMetaInfo.getPublishId())) {
            mSCAppMetaInfo2 = (MSCAppMetaInfo) this.d.a(b(mSCAppMetaInfo.getAppId()), this.f);
        }
        this.b.put(mSCAppMetaInfo.getAppId(), new MSCCacheIndexInfo(mSCAppMetaInfo.getAppId(), mSCAppMetaInfo.getPublishId(), System.currentTimeMillis()));
        if (mSCAppMetaInfo != null && !TextUtils.isEmpty(mSCAppMetaInfo.getAppId())) {
            this.e.put(mSCAppMetaInfo.getAppId(), mSCAppMetaInfo);
        }
        this.d.a("msc_appId_cache", (String) this.b, (ag<String>) this.g);
        this.d.a(b(mSCAppMetaInfo.getAppId()), (String) mSCAppMetaInfo, (ag<String>) this.f);
        if (mSCAppMetaInfo2 != null) {
            a(mSCAppMetaInfo2, 1);
        }
        a(mSCAppMetaInfo, 0);
    }

    public final synchronized void a(List<MSCAppMetaInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7bb251c9356f0eeaa87a4fd6020f470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7bb251c9356f0eeaa87a4fd6020f470");
            return;
        }
        if (list != null && list.size() != 0) {
            for (MSCAppMetaInfo mSCAppMetaInfo : list) {
                a(mSCAppMetaInfo);
            }
        }
    }

    public final synchronized void b(List<MSCAppIdPublishId> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "880722f5e9e5dd69af3a887420fa0b26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "880722f5e9e5dd69af3a887420fa0b26");
            return;
        }
        if (list != null && list.size() != 0) {
            for (MSCAppIdPublishId mSCAppIdPublishId : list) {
                MSCCacheIndexInfo mSCCacheIndexInfo = this.b.get(mSCAppIdPublishId.getAppId());
                if (mSCCacheIndexInfo != null && TextUtils.equals(mSCCacheIndexInfo.publishId, mSCAppIdPublishId.getPublishId())) {
                    this.b.remove(mSCAppIdPublishId.getAppId());
                    this.e.remove(mSCAppIdPublishId.getAppId());
                    this.d.a("msc_appId_cache", (String) this.b, (ag<String>) this.g);
                    this.d.b(b(mSCAppIdPublishId.getAppId()));
                    a((MSCAppMetaInfo) this.d.a(b(mSCAppIdPublishId.getAppId()), this.f), 1);
                }
            }
        }
    }

    private synchronized void a(MSCAppMetaInfo mSCAppMetaInfo, int i) {
        Object[] objArr = {mSCAppMetaInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7175cf1105524d0272819141bc5bbb90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7175cf1105524d0272819141bc5bbb90");
            return;
        }
        if (mSCAppMetaInfo != null) {
            ArrayList arrayList = new ArrayList();
            if (mSCAppMetaInfo.getMainPackage() != null && mSCAppMetaInfo.getMainPackage().getDdd() != null) {
                BundleData ddd = mSCAppMetaInfo.getMainPackage().getDdd();
                arrayList.add(new ResourceIdVersion(ddd.bundleName, ddd.getBundleVersion()));
            }
            if (mSCAppMetaInfo.getSubPackages() != null && mSCAppMetaInfo.getSubPackages().size() > 0) {
                for (MSCPackageInfo mSCPackageInfo : mSCAppMetaInfo.getSubPackages()) {
                    if (mSCPackageInfo != null && mSCPackageInfo.getDdd() != null) {
                        BundleData ddd2 = mSCPackageInfo.getDdd();
                        arrayList.add(new ResourceIdVersion(ddd2.bundleName, ddd2.getBundleVersion()));
                    }
                }
            }
            if (arrayList.size() > 0) {
                r.a(ContainerInfo.ENV_MSC).b(arrayList, i);
            }
        }
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "817e68ae76e063ebd767c1fdc2011411", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "817e68ae76e063ebd767c1fdc2011411");
        }
        return "msc_info_cache_" + str;
    }
}
