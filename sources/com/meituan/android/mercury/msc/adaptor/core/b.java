package com.meituan.android.mercury.msc.adaptor.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.mercury.msc.adaptor.bean.MSCAdaptorLog;
import com.meituan.android.mercury.msc.adaptor.bean.MSCAppMetaInfo;
import com.meituan.android.mercury.msc.adaptor.bean.MSCMetaInfo;
import com.meituan.android.mercury.msc.adaptor.bean.MSCMetaInfoRequest;
import com.meituan.android.mercury.msc.adaptor.bean.MSCPackageInfo;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.met.mercury.load.bean.MSCAppIdPublishId;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.core.d;
import com.meituan.met.mercury.load.core.g;
import com.meituan.met.mercury.load.core.k;
import com.meituan.met.mercury.load.core.o;
import com.meituan.met.mercury.load.core.q;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static com.meituan.android.mercury.msc.adaptor.callback.c b;
    private static final AtomicBoolean c = new AtomicBoolean(false);

    public static void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c7a4e17675ac0e832165f80df4113ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c7a4e17675ac0e832165f80df4113ac");
        } else if (c.compareAndSet(false, true)) {
            if (cVar != null && a.b == null) {
                a.b = cVar;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "245a02e9c12273b49be1a091cf4d390a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "245a02e9c12273b49be1a091cf4d390a");
                return;
            }
            g.a(ContainerInfo.ENV_MSC).d = new q() { // from class: com.meituan.android.mercury.msc.adaptor.core.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.q
                public final void a(String str, String str2, String str3) {
                    Object[] objArr3 = {str, str2, str3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c0bdd27fb21c1cdca3d7324d16d38b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c0bdd27fb21c1cdca3d7324d16d38b0");
                        return;
                    }
                    MSCAdaptorLog mSCAdaptorLog = new MSCAdaptorLog("offlineResource");
                    mSCAdaptorLog.putExtra("appId", str2);
                    mSCAdaptorLog.putExtra("publisId", str3);
                    com.meituan.android.mercury.msc.adaptor.utils.a.a(mSCAdaptorLog);
                    f.a().b(Collections.singletonList(new MSCAppIdPublishId(str2, str3)));
                    if (b.b != null) {
                        b.b.a(str2, str3);
                    }
                }
            };
            com.meituan.android.mercury.msc.adaptor.utils.a.a(new MSCAdaptorLog("initPushOffline"));
        }
    }

    public static void a(@NonNull List<String> list, com.meituan.android.mercury.msc.adaptor.callback.a aVar) {
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c18857840a2f159cf3f1103bc5bfd6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c18857840a2f159cf3f1103bc5bfd6d");
        } else {
            d.a().b(new MSCMetaInfoRequest(list, true, "", aVar));
        }
    }

    public static void a(String str, final com.meituan.android.mercury.msc.adaptor.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79a70319441b16ecad8c7b9ac8c7ae21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79a70319441b16ecad8c7b9ac8c7ae21");
        } else if (TextUtils.isEmpty(str)) {
            bVar.a(new e((short) 1, "bundleInfo is null or BundleData is null"));
        } else {
            DDLoadParams dDLoadParams = new DDLoadParams(a.b());
            dDLoadParams.setBusinessSdkVersion(a.a());
            com.meituan.met.mercury.load.core.d a2 = g.a("mscsdk");
            a2.c = a.c();
            a2.a(str, DDLoadStrategy.LOCAL_OR_NET, dDLoadParams, new k() { // from class: com.meituan.android.mercury.msc.adaptor.core.b.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.k
                public final void onSuccess(@Nullable DDResource dDResource) {
                    Object[] objArr2 = {dDResource};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6359ad06cab9dfc52e0569af219dfe3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6359ad06cab9dfc52e0569af219dfe3");
                    } else if (com.meituan.android.mercury.msc.adaptor.callback.b.this != null) {
                        com.meituan.android.mercury.msc.adaptor.callback.b.this.a(dDResource);
                    }
                }

                @Override // com.meituan.met.mercury.load.core.k
                public final void onFail(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23f550574190aed8f4ecfb78b0290215", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23f550574190aed8f4ecfb78b0290215");
                    } else if (com.meituan.android.mercury.msc.adaptor.callback.b.this != null) {
                        com.meituan.android.mercury.msc.adaptor.callback.b.this.a(e.a(exc));
                    }
                }
            });
        }
    }

    public static void a(MSCPackageInfo mSCPackageInfo, final com.meituan.android.mercury.msc.adaptor.callback.b bVar) {
        Object[] objArr = {mSCPackageInfo, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11227f7c40e06790554c28e4dcd81a2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11227f7c40e06790554c28e4dcd81a2b");
        } else if (mSCPackageInfo == null || mSCPackageInfo.getDdd() == null) {
            bVar.a(new e((short) 1, "bundleInfo is null or BundleData is null"));
        } else {
            DDLoadParams dDLoadParams = new DDLoadParams(a.b());
            String type = mSCPackageInfo.getDdd().getType();
            if (TextUtils.isEmpty(type)) {
                type = ContainerInfo.ENV_MSC;
            }
            com.meituan.met.mercury.load.core.d a2 = g.a(type);
            BundleData ddd = mSCPackageInfo.getDdd();
            k kVar = new k() { // from class: com.meituan.android.mercury.msc.adaptor.core.b.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.k
                public final void onSuccess(@Nullable DDResource dDResource) {
                    Object[] objArr2 = {dDResource};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8267b29dcd406ac546906d655bfc8e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8267b29dcd406ac546906d655bfc8e6");
                    } else if (com.meituan.android.mercury.msc.adaptor.callback.b.this != null) {
                        com.meituan.android.mercury.msc.adaptor.callback.b.this.a(dDResource);
                    }
                }

                @Override // com.meituan.met.mercury.load.core.k
                public final void onFail(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c01dc26a445516f02e02d525e729aff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c01dc26a445516f02e02d525e729aff");
                    } else if (com.meituan.android.mercury.msc.adaptor.callback.b.this != null) {
                        com.meituan.android.mercury.msc.adaptor.callback.b.this.a(e.a(exc));
                    }
                }
            };
            Object[] objArr2 = {ddd, dDLoadParams, kVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.met.mercury.load.core.d.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "7e7cf2b20718e1615380edcafa2ca62c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "7e7cf2b20718e1615380edcafa2ca62c");
                return;
            }
            d.a aVar = new d.a(DDLoadStrategy.LOCAL_DOWNLOAD, kVar);
            if (ddd != null && TextUtils.isEmpty(ddd.getBundleVersion())) {
                ddd.setMd5ToVersion();
            }
            com.meituan.met.mercury.load.repository.a aVar2 = new com.meituan.met.mercury.load.repository.a(a2.b, ddd, dDLoadParams, aVar);
            o a3 = o.a();
            Object[] objArr3 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = o.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "f47f5dfd5445a81fcf532d4836caa6de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "f47f5dfd5445a81fcf532d4836caa6de");
            } else {
                o.b.execute(new o.b(aVar2));
            }
        }
    }

    public static void a(String str, com.meituan.android.mercury.msc.adaptor.callback.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22258eea20709753bc159d77abf56876", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22258eea20709753bc159d77abf56876");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MSCAppMetaInfo a2 = f.a().a(str);
            if (a2 == null) {
                aVar.a(new e((short) 9, "local not match appId package"));
                return;
            }
            a2.setFrom(1);
            ArrayList arrayList = new ArrayList();
            MSCMetaInfo mSCMetaInfo = new MSCMetaInfo();
            arrayList.add(a2);
            mSCMetaInfo.setMscApps(arrayList);
            aVar.a(mSCMetaInfo);
        }
    }

    public static void a(String str, String str2, com.meituan.android.mercury.msc.adaptor.callback.a aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "944401366496869ced28291de414bbcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "944401366496869ced28291de414bbcf");
        } else {
            d.a().a(new MSCMetaInfoRequest(str, true, str2, aVar));
        }
    }

    public static void a(String str, long j, String str2, com.meituan.android.mercury.msc.adaptor.callback.a aVar) {
        Object[] objArr = {str, new Long(j), str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c20beab1926b81e7823dc72effb869c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c20beab1926b81e7823dc72effb869c9");
        } else {
            d.a().a(new MSCMetaInfoRequest(str, j, false, str2, aVar));
        }
    }

    public static void a(String str, boolean z, final com.meituan.android.mercury.msc.adaptor.callback.b bVar) {
        Object[] objArr = {str, (byte) 0, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "989d859e1303ba676f06729bbc572b31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "989d859e1303ba676f06729bbc572b31");
        } else if (TextUtils.isEmpty(str)) {
            bVar.a(new e((short) 1, "bundleInfo is null or BundleData is null"));
        } else {
            DDLoadParams dDLoadParams = new DDLoadParams(a.b());
            dDLoadParams.setBusinessSdkVersion(a.a());
            com.meituan.met.mercury.load.core.d a2 = g.a("mscsdk");
            a2.c = false;
            a2.a(str, DDLoadStrategy.NET_ONLY, dDLoadParams, new k() { // from class: com.meituan.android.mercury.msc.adaptor.core.b.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.k
                public final void onSuccess(@Nullable DDResource dDResource) {
                    Object[] objArr2 = {dDResource};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce29846dbefb7e33d405883c18791bcc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce29846dbefb7e33d405883c18791bcc");
                    } else if (com.meituan.android.mercury.msc.adaptor.callback.b.this != null) {
                        com.meituan.android.mercury.msc.adaptor.callback.b.this.a(dDResource);
                    }
                }

                @Override // com.meituan.met.mercury.load.core.k
                public final void onFail(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af8b3859650bb209e06a4111d3eecc0c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af8b3859650bb209e06a4111d3eecc0c");
                    } else if (com.meituan.android.mercury.msc.adaptor.callback.b.this != null) {
                        com.meituan.android.mercury.msc.adaptor.callback.b.this.a(e.a(exc));
                    }
                }
            });
        }
    }

    public static void a(com.meituan.android.mercury.msc.adaptor.callback.c cVar) {
        b = cVar;
    }
}
