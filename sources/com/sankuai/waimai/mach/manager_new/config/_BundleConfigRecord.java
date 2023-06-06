package com.sankuai.waimai.mach.manager_new.config;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import com.sankuai.waimai.mach.utils.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class _BundleConfigRecord implements Serializable {
    public static final String EMPTY_BUNDLE_TAG = "empty-tag";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BundleInfo> mLocalBundle;
    private final HashMap<String, List<BundleInfo>> mTagBundles;
    private List<String> mTemplateIdList;

    public _BundleConfigRecord() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d47af3ec3bc09a483073203bee1fd2b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d47af3ec3bc09a483073203bee1fd2b1");
            return;
        }
        this.mLocalBundle = new ArrayList();
        this.mTemplateIdList = new ArrayList();
        this.mTagBundles = new HashMap<>();
    }

    public List<BundleInfo> getLocalBundle() {
        return this.mLocalBundle;
    }

    public void setLocalBundle(List<BundleInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f2ca529753ca1b7223c698b8e941250", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f2ca529753ca1b7223c698b8e941250");
            return;
        }
        this.mLocalBundle = list;
        parserTags();
        saveAllTemplateIds();
    }

    private void saveAllTemplateIds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70ab24e6e2fc3a9f9c7029bef0fd8921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70ab24e6e2fc3a9f9c7029bef0fd8921");
            return;
        }
        this.mTemplateIdList.clear();
        if (e.a(this.mLocalBundle)) {
            return;
        }
        for (int i = 0; i < this.mLocalBundle.size(); i++) {
            BundleInfo bundleInfo = this.mLocalBundle.get(i);
            if (bundleInfo != null) {
                this.mTemplateIdList.add(bundleInfo.getMachId());
            }
        }
    }

    public String getAllTemplateIds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68d2f9cbea3a48d831320989b3e6ccbf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68d2f9cbea3a48d831320989b3e6ccbf") : this.mTemplateIdList.toString();
    }

    private void parserTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0b061e24883b485ce346366af143200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0b061e24883b485ce346366af143200");
            return;
        }
        synchronized (this.mTagBundles) {
            this.mTagBundles.clear();
            for (int i = 0; i < this.mLocalBundle.size(); i++) {
                BundleInfo bundleInfo = this.mLocalBundle.get(i);
                if (bundleInfo != null && !TextUtils.isEmpty(bundleInfo.getMachId()) && !TextUtils.isEmpty(bundleInfo.getName()) && !TextUtils.isEmpty(bundleInfo.getBundleVersion())) {
                    for (String str : correctTags(guardEmptyTags(this.mLocalBundle.get(i)).split(";"))) {
                        addBundleToTagList(bundleInfo, guardUnSupportTags(str));
                    }
                }
            }
        }
    }

    private String[] correctTags(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8ef377cd10e770455d4b095bb82f184", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8ef377cd10e770455d4b095bb82f184");
        }
        if (strArr == null || strArr.length == 0) {
            return new String[0];
        }
        for (String str : strArr) {
            if (TextUtils.equals(str, "lazy-download")) {
                return new String[]{"lazy-download"};
            }
        }
        return strArr;
    }

    private void addBundleToTagList(BundleInfo bundleInfo, String str) {
        List<BundleInfo> list;
        Object[] objArr = {bundleInfo, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d825b50fdc3f3cc5526eb69141c9a0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d825b50fdc3f3cc5526eb69141c9a0b");
            return;
        }
        if (this.mTagBundles.containsKey(str)) {
            list = this.mTagBundles.get(str);
            if (list == null) {
                com.sankuai.waimai.mach.manager_new.common.c.b("内部逻辑错误，标签对应链表为空");
                return;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            this.mTagBundles.put(str, arrayList);
            list = arrayList;
        }
        list.add(bundleInfo);
    }

    private String guardEmptyTags(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fd65233958a54a9d4f74335bba3847e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fd65233958a54a9d4f74335bba3847e") : TextUtils.isEmpty(bundleInfo.getTags()) ? "waimai-right-now" : bundleInfo.getTags();
    }

    private String guardUnSupportTags(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b36ffab42dd2a441c54dec1cc3449d5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b36ffab42dd2a441c54dec1cc3449d5") : EMPTY_BUNDLE_TAG.equals(str) ? "waimai-right-now" : str;
    }

    public void dumpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2445efff6d8221c821e4a58e683db479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2445efff6d8221c821e4a58e683db479");
            return;
        }
        synchronized (this.mTagBundles) {
            for (Map.Entry<String, List<BundleInfo>> entry : this.mTagBundles.entrySet()) {
                List<BundleInfo> value = entry.getValue();
                com.sankuai.waimai.mach.manager_new.common.c.c("tag | " + entry.getKey() + " | count | " + value.size());
                for (int i = 0; i < value.size(); i++) {
                    com.sankuai.waimai.mach.manager_new.common.c.e("\t bundle | " + com.sankuai.waimai.mach.manager_new.common.a.b(value.get(i)));
                }
            }
        }
    }

    public void dumpBundle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e99824884527fd0a544a2e10e25e245", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e99824884527fd0a544a2e10e25e245");
            return;
        }
        for (int i = 0; i < this.mLocalBundle.size(); i++) {
            BundleInfo bundleInfo = this.mLocalBundle.get(i);
            com.sankuai.waimai.mach.manager_new.common.c.c(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo) + " | " + bundleInfo.getMachId() + " | " + bundleInfo.getTags());
        }
    }

    public List<BundleInfo> getBundlesWithTag(String str) {
        List<BundleInfo> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "543bf6d99280bd78c24739c124630bc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "543bf6d99280bd78c24739c124630bc9");
        }
        synchronized (this.mTagBundles) {
            list = this.mTagBundles.get(str);
        }
        return list;
    }
}
