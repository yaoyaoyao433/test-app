package com.meituan.android.common.aidata.resources.manager;

import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.download.model.DownloadInfo;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.android.common.aidata.async.AsyncHashSet;
import com.meituan.android.common.aidata.cep.rule.IRuleTrigger;
import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.android.common.aidata.resources.downloader.DDResResponse;
import com.meituan.android.common.aidata.utils.FileUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CepResourceManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile CepResourceManager sInstance;
    private Map<IRuleTrigger, EventData> cacheEventMap;
    private final ConcurrentHashMap<String, List<FeatureBean>> mFeatureConfigMap;
    private final Set<OnFeatureConfigUpdateListener> onFeatureConfigUpdateListenerList;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnFeatureConfigUpdateListener {
        void onFeatureConfigUpdate(List<FeatureBean> list, List<FeatureBean> list2, List<FeatureBean> list3);
    }

    public CepResourceManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63f1a8356da1d4c28b190f2019351703", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63f1a8356da1d4c28b190f2019351703");
            return;
        }
        this.mFeatureConfigMap = new AsyncHashMap();
        this.onFeatureConfigUpdateListenerList = new AsyncHashSet();
    }

    public static CepResourceManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4fdad9c5af5d1e611e75581ced024a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (CepResourceManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4fdad9c5af5d1e611e75581ced024a3");
        }
        if (sInstance == null) {
            synchronized (CepResourceManager.class) {
                if (sInstance == null) {
                    sInstance = new CepResourceManager();
                }
            }
        }
        return sInstance;
    }

    public void updateDebugFeatureConfigsWithBiz(String str, List<FeatureBean> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc5ff594c32cc7e6e47161e4bfa7f5dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc5ff594c32cc7e6e47161e4bfa7f5dd");
            return;
        }
        new StringBuilder("updateDebugFeatureConfigsWithBiz, biz=").append(str);
        if (list != null && list.size() > 0) {
            Iterator<FeatureBean> it = list.iterator();
            while (it.hasNext()) {
                FeatureBean next = it.next();
                new StringBuilder("parse feature item config :").append(next != null ? next.toString() : "");
            }
        }
        synchronized (this) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        ArrayList<FeatureBean> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        List<FeatureBean> list2 = this.mFeatureConfigMap.get(str);
                        if (list2 != null && list2.size() != 0) {
                            for (FeatureBean featureBean : list) {
                                new StringBuilder("newItem:").append(featureBean.ver);
                                if (getFeatureBean(featureBean.feature) != null) {
                                    arrayList2.add(featureBean);
                                    replaceFeatureBean(featureBean);
                                } else {
                                    arrayList.add(featureBean);
                                    addFeatureBean(featureBean);
                                }
                            }
                            notifyFeatureConfigUpdated(arrayList, arrayList2, null);
                        }
                        arrayList.addAll(list);
                        if (arrayList.size() > 0) {
                            for (FeatureBean featureBean2 : arrayList) {
                                addFeatureBean(featureBean2);
                            }
                        }
                        notifyFeatureConfigUpdated(arrayList, arrayList2, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void addFeatureBean(FeatureBean featureBean) {
        Object[] objArr = {featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93ae52b80737f8ac0089cfd8e6532efe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93ae52b80737f8ac0089cfd8e6532efe");
        } else if (featureBean == null || TextUtils.isEmpty(featureBean.biz)) {
        } else {
            synchronized (this) {
                List<FeatureBean> list = this.mFeatureConfigMap.get(featureBean.biz);
                if (list == null) {
                    list = new ArrayList<>();
                    this.mFeatureConfigMap.put(featureBean.biz, list);
                }
                list.add(featureBean);
            }
        }
    }

    public void removeFeatureBean(List<FeatureBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a562d800b9f73bffb8e0d049505bcf70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a562d800b9f73bffb8e0d049505bcf70");
        } else if (list != null && list.size() > 0) {
            synchronized (this) {
                for (FeatureBean featureBean : list) {
                    removeFeatureBean(featureBean);
                }
            }
        }
    }

    public void removeFeatureBean(FeatureBean featureBean) {
        Object[] objArr = {featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24802c4c071b4dc7ba232a2f9399b548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24802c4c071b4dc7ba232a2f9399b548");
            return;
        }
        synchronized (this) {
            List<FeatureBean> list = this.mFeatureConfigMap.get(featureBean.biz);
            if (list != null && list.size() < 0) {
                Iterator<FeatureBean> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    FeatureBean next = it.next();
                    if (next.feature != null && next.feature.equals(featureBean.feature)) {
                        list.remove(next);
                        break;
                    }
                }
            }
        }
    }

    public void addFeatureBeanList(String str, List<FeatureBean> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff39b668b119427acce7c77aced6cdad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff39b668b119427acce7c77aced6cdad");
        } else if (TextUtils.isEmpty(str) || list == null) {
        } else {
            synchronized (this) {
                List<FeatureBean> list2 = this.mFeatureConfigMap.get(str);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.mFeatureConfigMap.put(str, list2);
                }
                list2.addAll(list);
            }
        }
    }

    public void removeFeatureBeanList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54a3f2dbf82099fb5371444590c3f51c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54a3f2dbf82099fb5371444590c3f51c");
            return;
        }
        synchronized (this) {
            this.mFeatureConfigMap.remove(str);
        }
    }

    public FeatureBean getFeatureBean(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a40f904666c906843a9c075224b04ac8", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeatureBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a40f904666c906843a9c075224b04ac8");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            List<FeatureBean> list = this.mFeatureConfigMap.get(str);
            if (list != null && list.size() < 0) {
                for (FeatureBean featureBean : list) {
                    if (featureBean.feature != null && featureBean.feature.equals(str2)) {
                        return featureBean;
                    }
                }
            }
            return null;
        }
    }

    public FeatureBean replaceFeatureBean(FeatureBean featureBean) {
        Object[] objArr = {featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8a398f03f07ae679dc51d21040b1c66", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeatureBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8a398f03f07ae679dc51d21040b1c66");
        }
        if (featureBean == null || TextUtils.isEmpty(featureBean.biz)) {
            return null;
        }
        synchronized (this) {
            List<FeatureBean> list = this.mFeatureConfigMap.get(featureBean.biz);
            if (list != null && list.size() < 0) {
                Iterator<FeatureBean> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    FeatureBean next = it.next();
                    if (next.feature != null && next.feature.equals(featureBean.feature)) {
                        list.remove(next);
                        list.add(featureBean);
                        break;
                    }
                }
            }
        }
        return null;
    }

    public List<FeatureBean> getFeatureBeanList(String str) {
        List<FeatureBean> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43f6234a8c1c352c79306d94b91863a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43f6234a8c1c352c79306d94b91863a7");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            list = this.mFeatureConfigMap.get(str);
        }
        return list;
    }

    public FeatureBean getFeatureBeanList(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26af4d4911c51e0cdcec5566b791b6e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeatureBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26af4d4911c51e0cdcec5566b791b6e1");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            List<FeatureBean> list = this.mFeatureConfigMap.get(str);
            if (list != null && list.size() > 0) {
                for (FeatureBean featureBean : list) {
                    if (featureBean.feature != null && featureBean.feature.equals(str2)) {
                        return featureBean;
                    }
                }
            }
            return null;
        }
    }

    public FeatureBean getFeatureBean(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f901f514a0094ff4bd086172daaa2a93", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeatureBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f901f514a0094ff4bd086172daaa2a93");
        }
        synchronized (this) {
            if (this.mFeatureConfigMap != null && this.mFeatureConfigMap.size() > 0) {
                for (Map.Entry<String, List<FeatureBean>> entry : this.mFeatureConfigMap.entrySet()) {
                    List<FeatureBean> value = entry.getValue();
                    if (value != null && value.size() > 0) {
                        for (FeatureBean featureBean : value) {
                            if (featureBean.feature != null && featureBean.feature.equals(str)) {
                                return featureBean;
                            }
                        }
                        continue;
                    }
                }
            }
            return null;
        }
    }

    public List<FeatureBean> getFeatureBeanListByBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bc7c54e5b3c0ad24db345cabff93448", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bc7c54e5b3c0ad24db345cabff93448");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            if (this.mFeatureConfigMap.size() > 0) {
                ArrayList arrayList = new ArrayList();
                List<FeatureBean> list = this.mFeatureConfigMap.get(str);
                if (list != null) {
                    arrayList.addAll(list);
                }
                return arrayList;
            }
            return null;
        }
    }

    public void subscribeFeatureConfigListener(OnFeatureConfigUpdateListener onFeatureConfigUpdateListener) {
        Object[] objArr = {onFeatureConfigUpdateListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f8bfecb768f04229fd60f2a87e5b8b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f8bfecb768f04229fd60f2a87e5b8b7");
        } else if (onFeatureConfigUpdateListener != null) {
            this.onFeatureConfigUpdateListenerList.add(onFeatureConfigUpdateListener);
        }
    }

    public void unsubscribeFeatureConfigListener(OnFeatureConfigUpdateListener onFeatureConfigUpdateListener) {
        Object[] objArr = {onFeatureConfigUpdateListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84842b567206f9a8e51474f12ef394f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84842b567206f9a8e51474f12ef394f9");
        } else if (onFeatureConfigUpdateListener != null) {
            this.onFeatureConfigUpdateListenerList.remove(onFeatureConfigUpdateListener);
        }
    }

    public void notifyFeatureConfigUpdated(List<FeatureBean> list, List<FeatureBean> list2, List<FeatureBean> list3) {
        Object[] objArr = {list, list2, list3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5306045fbc42f9070b57ee0b46b404a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5306045fbc42f9070b57ee0b46b404a");
        } else if (this.onFeatureConfigUpdateListenerList != null && this.onFeatureConfigUpdateListenerList.size() > 0) {
            for (OnFeatureConfigUpdateListener onFeatureConfigUpdateListener : this.onFeatureConfigUpdateListenerList) {
                onFeatureConfigUpdateListener.onFeatureConfigUpdate(list, list2, list3);
            }
        }
    }

    public boolean isValid(IRuleTrigger iRuleTrigger, EventData eventData) {
        Object[] objArr = {iRuleTrigger, eventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "574cbcc51253d0af195fd389f4c91f7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "574cbcc51253d0af195fd389f4c91f7c")).booleanValue();
        }
        if (iRuleTrigger == null || eventData == null || this.cacheEventMap == null || this.cacheEventMap.isEmpty() || this.cacheEventMap.get(iRuleTrigger) != eventData) {
            return true;
        }
        this.cacheEventMap.remove(iRuleTrigger);
        return false;
    }

    public static List<FeatureBean> parsePackageContent(List<DDResResponse.PackageBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f679d7ec3a802c7236a6bdb4532a7e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f679d7ec3a802c7236a6bdb4532a7e5");
        }
        if (list != null && list.size() > 0) {
            arrayList = new ArrayList();
            for (DDResResponse.PackageBean packageBean : list) {
                try {
                    if (!TextUtils.isEmpty(packageBean.mFileContent)) {
                        JSONArray jSONArray = new JSONArray(packageBean.mFileContent);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(new FeatureBean(jSONArray.getJSONObject(i), packageBean.mPackName, packageBean.mPackVer));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public List<FeatureBean> parseDebugPackageContent(List<DownloadInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daf5b6e145a7fa62beae3713ea242de4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daf5b6e145a7fa62beae3713ea242de4");
        }
        ArrayList arrayList = null;
        if (list != null && list.size() > 0) {
            arrayList = new ArrayList();
            for (DownloadInfo downloadInfo : list) {
                try {
                    String readFileAsString = FileUtil.readFileAsString(new File(downloadInfo.getDownloadDirPath(), "temp").getAbsolutePath());
                    if (!TextUtils.isEmpty(readFileAsString)) {
                        JSONArray jSONArray = new JSONArray(readFileAsString);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(new FeatureBean(jSONArray.getJSONObject(i)));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public void updateFeatureResourceForDebug(List<DownloadInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdaac1df86f7c25a7c0d85f8bccd6323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdaac1df86f7c25a7c0d85f8bccd6323");
            return;
        }
        List<FeatureBean> parseDebugPackageContent = parseDebugPackageContent(list);
        if (parseDebugPackageContent == null || parseDebugPackageContent.size() <= 0) {
            return;
        }
        updateDebugFeatureConfigsWithBiz(parseDebugPackageContent.get(0).biz, parseDebugPackageContent);
    }

    public void clearFeatureBeanList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4d6a0847ce2d6649d4f0e3c5ce2abd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4d6a0847ce2d6649d4f0e3c5ce2abd1");
            return;
        }
        synchronized (this) {
            this.mFeatureConfigMap.clear();
        }
    }

    public void cacheEvent4InValid(IRuleTrigger iRuleTrigger, EventData eventData) {
        Object[] objArr = {iRuleTrigger, eventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8627a25734a53e6dc313d4c9951d470e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8627a25734a53e6dc313d4c9951d470e");
            return;
        }
        if (this.cacheEventMap == null) {
            this.cacheEventMap = new HashMap();
        }
        this.cacheEventMap.put(iRuleTrigger, eventData);
    }
}
