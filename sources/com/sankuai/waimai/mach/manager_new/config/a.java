package com.sankuai.waimai.mach.manager_new.config;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.h;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import com.sankuai.waimai.mach.manager.download.update.UpdateResponse;
import com.sankuai.waimai.mach.manager_new.config.b;
import com.sankuai.waimai.mach.manager_new.config.c;
import com.sankuai.waimai.mach.manager_new.d;
import com.sankuai.waimai.mach.utils.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static String f = "";
    public static List<String> g = new LinkedList();
    public com.sankuai.waimai.mach.manager_new.config.c b;
    public volatile _BundleConfigRecord c;
    public c d;
    public b e;
    public List<InterfaceC1017a> h;
    private boolean i;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.manager_new.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1017a {
        void a(List<BundleInfo> list);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(com.sankuai.waimai.mach.manager_new.config.b bVar);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f93d2bfc3ed544fef328e3ac503a91e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f93d2bfc3ed544fef328e3ac503a91e");
        } else {
            this.h = new ArrayList();
        }
    }

    public void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df4b3dd3428f09ff4f8daed5e22814b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df4b3dd3428f09ff4f8daed5e22814b3");
        } else if (hVar.a.q == null) {
            this.b.a((c.b) null);
        } else {
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.sankuai.waimai.mach.manager_new.config.b a(_BundleConfigRecord _bundleconfigrecord, _BundleConfigRecord _bundleconfigrecord2) {
        Object[] objArr = {_bundleconfigrecord, _bundleconfigrecord2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a5737b2030382005a94443aa3f6161", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager_new.config.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a5737b2030382005a94443aa3f6161");
        }
        HashMap hashMap = new HashMap();
        if (_bundleconfigrecord != null && _bundleconfigrecord.getLocalBundle() != null) {
            for (int i = 0; i < _bundleconfigrecord.getLocalBundle().size(); i++) {
                BundleInfo bundleInfo = _bundleconfigrecord.getLocalBundle().get(i);
                hashMap.put(com.sankuai.waimai.mach.manager_new.common.a.a(bundleInfo), bundleInfo);
            }
        }
        com.sankuai.waimai.mach.manager_new.config.b bVar = new com.sankuai.waimai.mach.manager_new.config.b();
        if (_bundleconfigrecord2 != null && _bundleconfigrecord2.getLocalBundle() != null) {
            for (int i2 = 0; i2 < _bundleconfigrecord2.getLocalBundle().size(); i2++) {
                BundleInfo bundleInfo2 = _bundleconfigrecord2.getLocalBundle().get(i2);
                if (hashMap.containsKey(com.sankuai.waimai.mach.manager_new.common.a.a(bundleInfo2))) {
                    BundleInfo bundleInfo3 = (BundleInfo) hashMap.get(com.sankuai.waimai.mach.manager_new.common.a.a(bundleInfo2));
                    if (bundleInfo3 != null) {
                        int a2 = e.a(bundleInfo2.getBundleVersion(), bundleInfo3.getBundleVersion());
                        if (a2 > 0) {
                            bVar.a(new b.a(com.sankuai.waimai.mach.manager_new.config.b.b, bundleInfo2));
                            com.sankuai.waimai.mach.manager_new.common.c.c(bundleInfo2.getName() + " | 升级版本号：" + bundleInfo3.getBundleVersion() + " -> " + bundleInfo2.getBundleVersion());
                        } else if (a2 < 0) {
                            bVar.a(new b.a(com.sankuai.waimai.mach.manager_new.config.b.c, bundleInfo2));
                            g.add(bundleInfo2.getMachId());
                            com.sankuai.waimai.mach.manager_new.common.c.c(bundleInfo2.getName() + " | 回滚版本号：" + bundleInfo3.getBundleVersion() + " -> " + bundleInfo2.getBundleVersion());
                        }
                        hashMap.put(com.sankuai.waimai.mach.manager_new.common.a.a(bundleInfo2), null);
                    }
                } else {
                    bVar.a(new b.a(com.sankuai.waimai.mach.manager_new.config.b.b, bundleInfo2));
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                bVar.a(new b.a(com.sankuai.waimai.mach.manager_new.config.b.d, (BundleInfo) value));
            }
        }
        return bVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd9c18bf409dc65373af56d823d0478d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd9c18bf409dc65373af56d823d0478d");
        } else {
            this.b.a((c.b) null);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4345e36ce2fee6e45108276084d7022", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4345e36ce2fee6e45108276084d7022")).booleanValue() : this.b.b;
    }

    public final synchronized _BundleConfigRecord c() {
        return this.c;
    }

    public final synchronized BundleInfo a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "491832467073b8c3000605dd26c8e541", RobustBitConfig.DEFAULT_VALUE)) {
            return (BundleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "491832467073b8c3000605dd26c8e541");
        } else if (this.c == null) {
            com.sankuai.waimai.mach.manager_new.monitor.a.a(str, com.sankuai.waimai.mach.manager_new.b.a().d);
            return null;
        } else {
            List<BundleInfo> localBundle = this.c.getLocalBundle();
            for (int i = 0; i < localBundle.size(); i++) {
                if (localBundle.get(i) != null && str.equals(localBundle.get(i).getMachId())) {
                    return localBundle.get(i);
                }
            }
            com.sankuai.waimai.mach.manager_new.monitor.a.b(str, com.sankuai.waimai.mach.manager_new.b.a().d);
            return null;
        }
    }

    public final synchronized List<BundleInfo> b(String str) {
        List<BundleInfo> bundlesWithTag;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980d0f482b7dc66d1d0a1b1c0588ec36", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980d0f482b7dc66d1d0a1b1c0588ec36");
        }
        ArrayList arrayList = null;
        try {
            if (this.c != null && (bundlesWithTag = this.c.getBundlesWithTag(str)) != null) {
                arrayList = new ArrayList(bundlesWithTag);
            }
            return arrayList;
        } catch (Exception e) {
            com.sankuai.waimai.mach.manager_new.common.c.b("_BundleConfigCenter.getBundlesWithTag | " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(List<BundleInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d39538d5158da37cdcd87a4e242be37b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d39538d5158da37cdcd87a4e242be37b");
            return;
        }
        _BundleConfigRecord _bundleconfigrecord = new _BundleConfigRecord();
        _bundleconfigrecord.setLocalBundle(list);
        this.c = _bundleconfigrecord;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        String b;

        public c(Context context, h hVar) {
            Object[] objArr = {context, hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f22d514ebc621126d5d4802259d11140", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f22d514ebc621126d5d4802259d11140");
                return;
            }
            this.b = q.a(context, "wm_mach", "mach" + File.separator + "checkupdate" + File.separator + com.sankuai.waimai.mach.manager_new.common.a.a(hVar.b.b), u.e).getAbsolutePath();
        }

        public final UpdateResponse a() {
            ObjectInputStream objectInputStream = null;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd055ac6c511f34cd22cae6005e03b3b", RobustBitConfig.DEFAULT_VALUE)) {
                return (UpdateResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd055ac6c511f34cd22cae6005e03b3b");
            }
            File file = new File(this.b);
            if (!file.exists()) {
                com.sankuai.waimai.mach.manager_new.b.a().a(true);
                return null;
            }
            File file2 = new File(file, "checkupdate.json");
            if (!file2.exists()) {
                com.sankuai.waimai.mach.manager_new.b.a().a(true);
                return null;
            }
            com.sankuai.waimai.mach.manager_new.b.a().a(false);
            try {
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file2));
                    try {
                        UpdateResponse updateResponse = (UpdateResponse) objectInputStream.readObject();
                        e.a(objectInputStream);
                        return updateResponse;
                    } catch (Exception e) {
                        e = e;
                        com.sankuai.waimai.mach.manager_new.common.c.b("download-2.0 unable to read checkupdate.json | " + e.getMessage());
                        i.a().e().a("mach_download_v2_read_config", e.getMessage(), "配置文件读取失败", new HashMap());
                        e.a(objectInputStream);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    e.a(objectInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = null;
                e.a(objectInputStream);
                throw th;
            }
        }

        public final List<BundleInfo> b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd026e20c2cc28a16647f48421ead35", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd026e20c2cc28a16647f48421ead35");
            }
            File file = new File(this.b);
            if (!file.exists()) {
                com.sankuai.waimai.mach.manager_new.b.a().a(true);
                return null;
            }
            File file2 = new File(file, "machcheckupdate.json");
            if (!file2.exists()) {
                com.sankuai.waimai.mach.manager_new.b.a().a(true);
                return null;
            }
            String c = com.sankuai.waimai.mach.manager_new.common.a.c(file2.getAbsolutePath());
            if (!TextUtils.isEmpty(c)) {
                try {
                    return (List) com.sankuai.waimai.mach.utils.b.a().fromJson(c, new TypeToken<List<BundleInfo>>() { // from class: com.sankuai.waimai.mach.manager_new.config.a.c.1
                    }.getType());
                } catch (Exception e) {
                    com.sankuai.waimai.mach.manager_new.common.c.b("checkupdate-2.0 unable to read machcheckupdate.json | " + e.getMessage());
                }
            }
            return null;
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a6720391cde588b33c8599807435a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a6720391cde588b33c8599807435a8");
            return;
        }
        if (this.c != null && !e.a(this.c.getLocalBundle())) {
            for (BundleInfo bundleInfo : this.c.getLocalBundle()) {
                if (bundleInfo != null && com.sankuai.waimai.mach.manager_new.common.a.e(bundleInfo)) {
                    d a2 = d.a();
                    String b2 = com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo);
                    Object[] objArr2 = {b2};
                    ChangeQuickRedirect changeQuickRedirect2 = d.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "91eb624bead62a631bfd864aef4ca94a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "91eb624bead62a631bfd864aef4ca94a");
                    } else {
                        com.sankuai.waimai.mach.manager_new.c a3 = a2.a(b2);
                        if (a3 == com.sankuai.waimai.mach.manager_new.c.b) {
                            a2.b(b2);
                        } else if (a3.a() == 1) {
                            a2.a(a3.a(), 3);
                            a3.a(3);
                            com.sankuai.waimai.mach.manager_new.common.c.e(b2 + " | 归档成功 | " + com.sankuai.waimai.mach.manager_new.c.b(1) + " -> " + com.sankuai.waimai.mach.manager_new.c.b(3));
                        }
                    }
                }
            }
        }
        this.i = true;
    }

    public final synchronized boolean e() {
        return this.i;
    }

    public final void a(InterfaceC1017a interfaceC1017a) {
        Object[] objArr = {interfaceC1017a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f2da6e525a4e258ec17962e71aef9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f2da6e525a4e258ec17962e71aef9a");
        } else {
            this.h.add(interfaceC1017a);
        }
    }
}
