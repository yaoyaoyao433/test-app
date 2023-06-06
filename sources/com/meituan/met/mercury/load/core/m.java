package com.meituan.met.mercury.load.core;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.met.mercury.load.bean.PresetData;
import com.meituan.met.mercury.load.bean.PresetInfo;
import com.meituan.met.mercury.load.bean.ResourceIdVersion;
import com.meituan.met.mercury.load.bean.ResourceNameVersion;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.core.r;
import com.meituan.met.mercury.load.repository.CheckResourceRequest;
import com.meituan.met.mercury.load.repository.FetchResourceRequest;
import com.meituan.met.mercury.load.repository.PresetResourceRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class m {
    public static ChangeQuickRedirect a;
    public static final ScheduledExecutorService b = com.meituan.met.mercury.load.utils.g.a("LocalLoader", 2);
    private static volatile m c;

    public static /* synthetic */ List d(String str, Set set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77070de7de0920f178d59d4b1b109604", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77070de7de0920f178d59d4b1b109604");
        }
        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(11);
        r.b a2 = r.b.a();
        a2.e = hashSet;
        a2.c = set;
        a2.g = 0;
        return r.a(str).a(a2.b());
    }

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68cb94bbcdfd1877259b1d7c934d377a", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68cb94bbcdfd1877259b1d7c934d377a");
        }
        if (c == null) {
            synchronized (m.class) {
                if (c == null) {
                    c = new m();
                }
            }
        }
        return c;
    }

    public final void a(CheckResourceRequest checkResourceRequest) {
        Object[] objArr = {checkResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b6a5750b21437b8f7f28d6902d24a99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b6a5750b21437b8f7f28d6902d24a99");
        } else {
            b.execute(new a(checkResourceRequest));
        }
    }

    public final void a(FetchResourceRequest fetchResourceRequest) {
        Object[] objArr = {fetchResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d877bad800a3c6b21233fd26a279962b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d877bad800a3c6b21233fd26a279962b");
        } else {
            b.execute(new c(fetchResourceRequest));
        }
    }

    public final void a(final PresetResourceRequest presetResourceRequest) {
        Object[] objArr = {presetResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845f7185c2eabacc0891a223a5c4edee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845f7185c2eabacc0891a223a5c4edee");
        } else {
            b.execute(new i(presetResourceRequest) { // from class: com.meituan.met.mercury.load.core.m.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.i
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e48a75df864553427818653f3a6be00", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e48a75df864553427818653f3a6be00");
                        return;
                    }
                    List<DDResource> d = m.d(presetResourceRequest.getBusiness(), null);
                    if (presetResourceRequest.getLoadCallback() != null) {
                        presetResourceRequest.getLoadCallback().onSuccess(d);
                    }
                }
            });
        }
    }

    public static List<DDResource> a(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0de2243a8858ddc903d016738319a90", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0de2243a8858ddc903d016738319a90");
        }
        HashSet hashSet = new HashSet();
        hashSet.add(0);
        r.b a2 = r.b.a();
        a2.f = 1;
        a2.g = 0;
        a2.c = set;
        a2.h = hashSet;
        return r.a(str).a(a2.b());
    }

    private static List<DDResource> e(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20e41db09cc4e268474eebc1c9332bc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20e41db09cc4e268474eebc1c9332bc7");
        }
        HashSet hashSet = new HashSet();
        hashSet.add(0);
        r.b a2 = r.b.a();
        a2.g = 0;
        a2.c = set;
        a2.h = hashSet;
        return r.a(str).a(a2.b());
    }

    public static List<ResourceIdVersion> b(String str, Set<String> set) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "646998b78c82896c6e15f3a6d52e6dae", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "646998b78c82896c6e15f3a6d52e6dae") : ResourceIdVersion.transformToList(e(str, null));
    }

    public static List<ResourceNameVersion> c(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89f5aad22d402655f05716b85d146288", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89f5aad22d402655f05716b85d146288") : ResourceNameVersion.transformToList(e(str, set));
    }

    public static List<DDResource> a(String str, List<ResourceNameVersion> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b0a742bebad9d21e799a54708725110", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b0a742bebad9d21e799a54708725110");
        }
        HashSet hashSet = new HashSet();
        hashSet.add(0);
        r.b a2 = r.b.a();
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = r.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "1880422efdb40f4197ee6c998523c617", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (r.b) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "1880422efdb40f4197ee6c998523c617");
        } else if (list != null && list.size() > 0) {
            a2.b = new ArrayList();
            a2.b.addAll(list);
        }
        a2.h = hashSet;
        return r.a(str).a(a2.b());
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ec4f4b367b89c44f09a2f6d6548ecf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ec4f4b367b89c44f09a2f6d6548ecf1");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        e.b("DDDPresetIsScanned_", sb.toString());
    }

    public static void b() {
        int i;
        boolean z;
        boolean equals;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        int i3 = 1;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "712cdcbde5d5f6b0e2ba489afdee6c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "712cdcbde5d5f6b0e2ba489afdee6c40");
            return;
        }
        if (!e.l()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "40793042aea55d0a280ae6798016e431", RobustBitConfig.DEFAULT_VALUE)) {
                equals = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "40793042aea55d0a280ae6798016e431")).booleanValue();
            } else {
                String c2 = e.c("DDDPresetIsScanned_", "");
                equals = TextUtils.isEmpty(c2) ? false : TextUtils.equals("true", c2);
            }
            if (equals) {
                return;
            }
        }
        com.meituan.met.mercury.load.utils.c.a("LocalResourceLoader start scanPresetResource");
        AssetManager assets = e.b().getAssets();
        try {
            String[] list = assets.list("DDDPreset");
            if (list == null || list.length <= 0) {
                com.meituan.met.mercury.load.utils.c.a("LocalResourceLoader scanPresetResource not have preset business!");
                return;
            }
            int length = list.length;
            int i4 = 0;
            while (i4 < length) {
                String str = list[i4];
                String str2 = "DDDPreset" + File.separator + str;
                String str3 = str2 + File.separator + "dddpreset.json";
                try {
                    com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource assets.open(businessPresetJsonFile)");
                    bVar.a("businessPresetJsonFile", str3);
                    com.meituan.met.mercury.load.utils.c.a(bVar);
                    PresetData presetData = (PresetData) com.meituan.met.mercury.load.utils.a.a(assets.open(str3), PresetData.class);
                    com.meituan.met.mercury.load.utils.b bVar2 = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource parse PresetData");
                    bVar2.a("presetData", presetData);
                    com.meituan.met.mercury.load.utils.c.a(bVar2);
                    if (presetData != null && !CollectionUtils.isEmpty(presetData.presetList)) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (PresetInfo presetInfo : presetData.presetList) {
                            if (presetInfo != null && TextUtils.equals(str, presetInfo.business) && !TextUtils.isEmpty(presetInfo.name) && !TextUtils.isEmpty(presetInfo.version) && !TextUtils.isEmpty(presetInfo.originMd5) && !TextUtils.isEmpty(presetInfo.file)) {
                                DDResource b2 = r.a(str).b(presetInfo.originMd5);
                                if (b2 != null && b2.isLocalCacheValid()) {
                                    com.meituan.met.mercury.load.utils.b bVar3 = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource 本地已有预置包数据");
                                    bVar3.a("presetInfo", presetInfo).a("localResource", b2);
                                    com.meituan.met.mercury.load.utils.c.a(bVar3);
                                } else {
                                    DDResource.a aVar = new DDResource.a();
                                    aVar.b = str;
                                    aVar.c = presetInfo.name;
                                    aVar.d = presetInfo.version;
                                    aVar.e = presetInfo.originMd5;
                                    r.b a2 = r.b.a();
                                    a2.g = Integer.valueOf(i2);
                                    a2.d = presetInfo.name;
                                    List<DDResource> a3 = r.a(str).a(a2.b());
                                    if (CollectionUtils.isEmpty(a3)) {
                                        i = 1;
                                    } else {
                                        i = 1;
                                        for (DDResource dDResource : a3) {
                                            if (dDResource.isPreset()) {
                                                dDResource.setDeleteState(i3);
                                                arrayList2.add(dDResource);
                                                r.a(str, dDResource, 50);
                                            } else if (dDResource.getNoVersion() == i3) {
                                                if (dDResource.getIsNewest() == i3) {
                                                    i = 0;
                                                }
                                            } else if (dDResource.getIsNewest() == i3 && com.meituan.met.mercury.load.utils.h.a(dDResource.getVersion(), presetInfo.version) > 0) {
                                                i = 0;
                                            }
                                        }
                                    }
                                    if ("zip".equals(presetInfo.fileType)) {
                                        aVar.i = 11;
                                        File a4 = e.a(presetInfo.business, presetInfo.name, presetInfo.version, presetInfo.file);
                                        if (!a4.exists() || !com.meituan.met.mercury.load.utils.e.a(a4, presetInfo.originMd5)) {
                                            try {
                                                if (!com.meituan.met.mercury.load.utils.e.a(assets.open(str2 + File.separator + presetInfo.file), presetInfo.xZipMd5)) {
                                                    com.meituan.met.mercury.load.utils.b bVar4 = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource xZip文件md5不一致");
                                                    bVar4.a("presetInfo", presetInfo);
                                                    com.meituan.met.mercury.load.utils.c.a(bVar4);
                                                } else {
                                                    File a5 = com.meituan.met.mercury.load.utils.e.a(assets.open(str2 + File.separator + presetInfo.file), a4, presetInfo.originMd5);
                                                    if (com.meituan.met.mercury.load.utils.e.a(a5, presetInfo.originMd5)) {
                                                        a4 = a5;
                                                    } else {
                                                        com.meituan.met.mercury.load.utils.b bVar5 = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource解压后文件md5不一致");
                                                        bVar5.a("presetInfo", presetInfo).a("destFile", a5);
                                                        com.meituan.met.mercury.load.utils.c.a(bVar5);
                                                    }
                                                }
                                            } catch (IOException e) {
                                                com.meituan.met.mercury.load.utils.b bVar6 = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource unzip IOException");
                                                bVar6.a("presetInfo", presetInfo).a("destFile", a4).a(e).a(e.toString());
                                                com.meituan.met.mercury.load.utils.c.b(bVar6);
                                            }
                                            i2 = 0;
                                            i3 = 1;
                                        }
                                        aVar.h = a4.getAbsolutePath();
                                    } else {
                                        aVar.i = 10;
                                        try {
                                            try {
                                                String[] list2 = assets.list(str2);
                                                if (list2 != null && list2.length > 0) {
                                                    int length2 = list2.length;
                                                    int i5 = 0;
                                                    while (i5 < length2) {
                                                        String[] strArr = list2;
                                                        if (presetInfo.file.equals(list2[i5])) {
                                                            z = true;
                                                            break;
                                                        } else {
                                                            i5++;
                                                            list2 = strArr;
                                                        }
                                                    }
                                                }
                                                z = false;
                                                if (z) {
                                                    aVar.h = str2 + File.separator + presetInfo.file;
                                                }
                                            } catch (IOException e2) {
                                                com.meituan.met.mercury.load.utils.b bVar7 = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource 非zip IOException");
                                                bVar7.a("presetInfo", presetInfo).a(e2).a(e2.toString());
                                                com.meituan.met.mercury.load.utils.c.b(bVar7);
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        i2 = 0;
                                        i3 = 1;
                                    }
                                    aVar.j = i;
                                    arrayList.add(aVar.a());
                                    i2 = 0;
                                    i3 = 1;
                                }
                            }
                        }
                        arrayList.addAll(arrayList2);
                        r.a(str).a(arrayList);
                        com.meituan.met.mercury.load.utils.b bVar8 = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource batchUpdate presetResourceList");
                        bVar8.a(ShieldMonitorKey.TAG_BUSINESS, str).a("presetResourceList", arrayList);
                        com.meituan.met.mercury.load.utils.c.a(bVar8);
                    }
                } catch (IOException e3) {
                    com.meituan.met.mercury.load.utils.b bVar9 = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource assets.open(businessPresetJsonFile) IOException");
                    bVar9.a("businessPresetJsonFile", str3).a(e3).a(e3.toString());
                    com.meituan.met.mercury.load.utils.c.b(bVar9);
                }
                i4++;
                i2 = 0;
                i3 = 1;
            }
            a(true);
        } catch (IOException e4) {
            com.meituan.met.mercury.load.utils.b bVar10 = new com.meituan.met.mercury.load.utils.b("LocalResourceLoader scanPresetResource assets.list PRESET_DIR IOException");
            bVar10.a(e4).a("PRESET_DIR", "DDDPreset").a(e4.toString());
            com.meituan.met.mercury.load.utils.c.b(bVar10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends i {
        public static ChangeQuickRedirect a;
        private CheckResourceRequest b;
        private Set<String> c;

        public a(CheckResourceRequest checkResourceRequest) {
            super(checkResourceRequest);
            Object[] objArr = {checkResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2311b904c85f747bb92c8b0b59b35352", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2311b904c85f747bb92c8b0b59b35352");
                return;
            }
            this.b = checkResourceRequest;
            this.c = new HashSet(checkResourceRequest.getRequestResources());
        }

        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            List<DDResource> d;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "537619c2b511e4fd13de80a51aa672e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "537619c2b511e4fd13de80a51aa672e8");
                return;
            }
            try {
                List<DDResource> a2 = m.a(this.b.getBusiness(), this.b.getRequestResources());
                HashSet<String> hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                if (this.b.getRequestResources() != null && !this.b.getRequestResources().isEmpty()) {
                    hashSet.addAll(this.b.getRequestResources());
                    if (!CollectionUtils.isEmpty(a2)) {
                        for (DDResource dDResource : a2) {
                            hashSet.remove(dDResource.getName());
                            hashSet2.add(dDResource.getName());
                        }
                    }
                }
                if (!hashSet.isEmpty() && this.b.getLoadCallback() != null && this.b.getParams() != null && this.b.getParams().getUseCurrPreset() && (d = m.d(this.b.getBusiness(), hashSet)) != null && !d.isEmpty()) {
                    for (DDResource dDResource2 : d) {
                        if (hashSet.contains(dDResource2.getName())) {
                            hashSet.remove(dDResource2.getName());
                            hashSet2.add(dDResource2.getName());
                            this.c.remove(dDResource2.getName());
                        }
                    }
                    this.b.getLoadCallback().onSuccess(d);
                }
                if (!CollectionUtils.isEmpty(a2) && this.b.getLoadCallback() != null) {
                    for (DDResource dDResource3 : a2) {
                        dDResource3.setFromNet(false);
                        dDResource3.refreshLastUseMillis();
                        this.c.remove(dDResource3.getName());
                    }
                    this.b.getLoadCallback().onSuccess(a2);
                    r.a(this.b.getBusiness()).a(a2);
                    if (this.b.getStrategy() == DDLoadStrategy.LOCAL_FIRST) {
                        o.a().a(new CheckResourceRequest(this.b.getBusiness(), this.b.getStrategy(), this.b.getParams(), null, hashSet2));
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                switch (this.b.getStrategy()) {
                    case LOCAL_FIRST:
                    case LOCAL_OR_NET:
                        o.a().a(new CheckResourceRequest(this.b.getBusiness(), this.b.getStrategy(), this.b.getParams(), this.b.getLoadCallback(), hashSet));
                        return;
                    default:
                        if (this.b.getLoadCallback() != null) {
                            for (String str : hashSet) {
                                this.c.remove(str);
                                this.b.getLoadCallback().onFail(new f((short) 9, "check newest resource not found at local", str));
                            }
                            return;
                        }
                        return;
                }
            } catch (Exception e) {
                com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("CheckNewestRunnable 意料之外异常");
                bVar.a("notCallBackRequestResources", this.c);
                com.meituan.met.mercury.load.utils.c.a(bVar);
                for (String str2 : this.c) {
                    f fVar = new f((short) -1, "check newest exception:" + e.toString(), str2);
                    if (this.b.getLoadCallback() != null) {
                        this.b.getLoadCallback().onFail(fVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c extends i {
        public static ChangeQuickRedirect a;
        private FetchResourceRequest b;

        public c(FetchResourceRequest fetchResourceRequest) {
            super(fetchResourceRequest);
            Object[] objArr = {fetchResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a029dcf881baac0483e2189988158ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a029dcf881baac0483e2189988158ee");
            } else {
                this.b = fetchResourceRequest;
            }
        }

        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc59e2e808c0eacca9617bceb4ad52a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc59e2e808c0eacca9617bceb4ad52a");
                return;
            }
            boolean z = true;
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ResourceNameVersion(this.b.getResourceName(), this.b.getResourceVersion()));
                List<DDResource> a2 = m.a(this.b.getBusiness(), arrayList);
                try {
                    if (CollectionUtils.isEmpty(a2)) {
                        o.a().a(this.b);
                        return;
                    }
                    for (DDResource dDResource : a2) {
                        dDResource.setFromNet(false);
                        dDResource.refreshLastUseMillis();
                    }
                    if (this.b.getLoadCallback() != null) {
                        this.b.getLoadCallback().onSuccess(a2);
                    }
                    r.a(this.b.getBusiness()).a(a2);
                } catch (Exception unused) {
                    if (z) {
                        return;
                    }
                    o.a().a(this.b);
                }
            } catch (Exception unused2) {
                z = false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends i {
        public static ChangeQuickRedirect a;
        private com.meituan.met.mercury.load.repository.b b;
        private List<ResourceNameVersion> c;

        public b(com.meituan.met.mercury.load.repository.b bVar) {
            super(bVar);
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9ccfa527659af15149ff1f527a7c59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9ccfa527659af15149ff1f527a7c59");
                return;
            }
            this.b = bVar;
            this.c = new ArrayList(bVar.b);
        }

        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b954d4aa187eda3d4995545b99130c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b954d4aa187eda3d4995545b99130c");
                return;
            }
            try {
                List<DDResource> a2 = m.a(this.b.getBusiness(), this.b.b);
                if (CollectionUtils.isEmpty(a2)) {
                    com.meituan.met.mercury.load.utils.c.a("FetchSpecifiedListRunnable 无本地资源");
                    o.a().a(this.b);
                } else if (this.b.getLoadCallback() != null) {
                    com.meituan.met.mercury.load.utils.c.a("FetchSpecifiedListRunnable 本地资源:" + a2);
                    for (DDResource dDResource : a2) {
                        dDResource.setFromNet(false);
                        dDResource.refreshLastUseMillis();
                        Iterator<ResourceNameVersion> it = this.c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ResourceNameVersion next = it.next();
                            if (next != null && TextUtils.equals(dDResource.getName(), next.getName()) && TextUtils.equals(dDResource.getVersion(), next.getVersion())) {
                                it.remove();
                                break;
                            }
                        }
                    }
                    this.b.getLoadCallback().onSuccess(a2);
                    if (this.c.isEmpty()) {
                        return;
                    }
                    com.meituan.met.mercury.load.repository.b bVar = new com.meituan.met.mercury.load.repository.b(this.b.getBusiness(), this.b.getStrategy(), this.b.getParams(), this.c, this.b.getLoadCallback());
                    com.meituan.met.mercury.load.utils.b bVar2 = new com.meituan.met.mercury.load.utils.b("FetchSpecifiedListRunnable 去掉本地已存在资源后重新封装请求");
                    bVar2.a("needRequest", bVar);
                    com.meituan.met.mercury.load.utils.c.a(bVar2);
                    o.a().a(bVar);
                }
            } catch (Exception e) {
                com.meituan.met.mercury.load.repository.b bVar3 = new com.meituan.met.mercury.load.repository.b(this.b.getBusiness(), this.b.getStrategy(), this.b.getParams(), this.c, this.b.getLoadCallback());
                com.meituan.met.mercury.load.utils.b bVar4 = new com.meituan.met.mercury.load.utils.b("FetchSpecifiedListRunnable 意料之外异常");
                bVar4.a(LogMonitor.EXCEPTION_TAG, e.toString());
                bVar4.a("needRequest", bVar3);
                com.meituan.met.mercury.load.utils.c.a(bVar4);
                o.a().a(bVar3);
            }
        }
    }
}
