package com.meituan.android.common.aidata.feature.persona;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.config.ConfigManager;
import com.meituan.android.common.aidata.database.BaseTable;
import com.meituan.android.common.aidata.database.DBManager;
import com.meituan.android.common.aidata.feature.bean.PersonaBean;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.android.common.aidata.net.HttpManager;
import com.meituan.android.common.aidata.net.HttpResult;
import com.meituan.android.common.aidata.net.HttpResultListener;
import com.meituan.android.common.aidata.net.RequestBuilder;
import com.meituan.android.common.aidata.utils.AESUtil;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PersonaManager implements LoginChangeListener {
    public static final String KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER = "cnf_ver";
    public static ChangeQuickRedirect changeQuickRedirect;
    private PersonaFeatureCache cacheFeature;
    private final Map<String, PersonaBean> configMap;
    private String content;
    private Map<String, Map<String, List<ResultRow>>> mCloudResultMap;
    private RequestBuilder requestBuilder;
    private final AtomicInteger requestCount;
    private String version;

    public PersonaManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55070f5dca5c9b00349653daeaea6be5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55070f5dca5c9b00349653daeaea6be5");
            return;
        }
        this.configMap = new HashMap();
        this.cacheFeature = new PersonaFeatureCache(UserCenterManager.getInstance().getUserProxy());
        this.requestBuilder = new RequestBuilder().url("https://oneservice.meituan.com/api/query/single").post().startHeader().addHeader("App-Key", "rB0Wq5NqVg6KUImNP/QmerulhSicaNjmX2umzdUsSXk=").addHeader("App-Version", AppUtil.getVersionName(AIData.getContext())).addHeader("App-SourceType", "").addHeader("SDK-Version", "1.17.13").endHeader();
        this.requestCount = new AtomicInteger();
        UserCenterManager.getInstance().addListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        private static final PersonaManager STUB = new PersonaManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static PersonaManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b8ce85d98030509237567c648356e17", RobustBitConfig.DEFAULT_VALUE) ? (PersonaManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b8ce85d98030509237567c648356e17") : InnerClass.STUB;
    }

    public void parseHorn(@NonNull String str) {
        JSONObject jSONObject;
        Iterator<String> keys;
        JSONObject optJSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4115b0fc9fd7efb666110a5610f27dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4115b0fc9fd7efb666110a5610f27dd4");
        } else if (this.content == null || !TextUtils.equals(this.content, str)) {
            this.content = str;
            this.requestCount.set(0);
            try {
                synchronized (this) {
                    this.configMap.clear();
                }
                jSONObject = new JSONObject(str);
                this.version = jSONObject.optString(KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, "");
                LoganManager.getInstance().recordHornConfig(ConfigManager.KEY_CLOUD_PUBLIC_VER, this.version);
                jSONObject.remove(KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER);
                keys = jSONObject.keys();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (keys == null) {
                return;
            }
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                    PersonaBean personaBean = new PersonaBean(optJSONObject);
                    personaBean.feature_identifier = next;
                    synchronized (this) {
                        this.configMap.put(next, personaBean);
                    }
                }
            }
            if (this.configMap.isEmpty()) {
                clearPersonaFeature();
                return;
            }
            checkConfig();
        }
    }

    private void clearPersonaFeature() {
        BaseTable table;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57be0e1a27ca7c833653b97622f0f1d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57be0e1a27ca7c833653b97622f0f1d3");
            return;
        }
        synchronized (this) {
            this.cacheFeature.clear();
        }
        if (this.cacheFeature.isInvalidUserId() || (table = DBManager.getInstance().getTable(PersonaTable.class)) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.cacheFeature.getUserId());
        table.deleteByCase("user_id=?", new String[]{sb.toString()});
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
        if ((r10 - r12.update_timestamp) > r13.update_period) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkConfig() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.feature.persona.PersonaManager.checkConfig():void");
    }

    public boolean isPersonaFeature(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62b5c3483d1473323c7b46f511aa406a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62b5c3483d1473323c7b46f511aa406a")).booleanValue() : this.configMap.containsKey(str) || (this.mCloudResultMap != null && this.mCloudResultMap.containsKey(str));
    }

    public Map<String, List<ResultRow>> getPersonaFeature(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48c62d4bae0c3cc865f91052b260b8b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48c62d4bae0c3cc865f91052b260b8b2");
        }
        StringBuilder sb = new StringBuilder("outside get persona feature,feature name is ");
        sb.append(str);
        sb.append(" ,originConsumeType is ");
        sb.append(i);
        sb.append(" cycleConsumeType is ");
        sb.append(i2);
        if (this.mCloudResultMap != null && this.mCloudResultMap.containsKey(str)) {
            return this.mCloudResultMap.get(str);
        }
        if (!isPersonaFeature(str) || this.cacheFeature.isInvalidUserId()) {
            if (LogUtil.isLogEnabled()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("isPersonaFeature ");
                sb2.append(isPersonaFeature(str));
                sb2.append(",user valid ");
                sb2.append(this.cacheFeature.isInvalidUserId());
                sb2.append(",cache user id is ");
                sb2.append(this.cacheFeature.getUserId());
            }
            return null;
        }
        new StringBuilder("cache user id is ").append(this.cacheFeature.getUserId());
        Map<String, List<ResultRow>> map = this.cacheFeature.get(str);
        if (map != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" hit cache,result is ");
            sb3.append(map);
            if (i != -1) {
                CatMonitorManager.getInstance().recordFeatureQuery(str, AppUtil.getUniqueId(), i, map);
            }
            if (i2 != -1) {
                CatMonitorManager.getInstance().recordFeatureQuery(str, AppUtil.getUniqueId(), i2, map);
            }
            return map;
        }
        BaseTable table = DBManager.getInstance().getTable(PersonaTable.class);
        if (table == null) {
            return null;
        }
        PersonaBean personaBean = (PersonaBean) table.querySingleByCase("user_id=? and feature_identifier=?", new String[]{String.valueOf(this.cacheFeature.getUserId()), str}, null);
        StringBuilder sb4 = new StringBuilder("query feature ");
        sb4.append(str);
        sb4.append(" from db,result is ");
        sb4.append(personaBean);
        if (personaBean == null) {
            return null;
        }
        this.cacheFeature.put(str, personaBean);
        Map<String, List<ResultRow>> map2 = this.cacheFeature.get(str);
        if (i != -1) {
            CatMonitorManager.getInstance().recordFeatureQuery(str, AppUtil.getUniqueId(), i, map);
        }
        if (i2 != -1) {
            CatMonitorManager.getInstance().recordFeatureQuery(str, AppUtil.getUniqueId(), i2, map);
        }
        return map2;
    }

    @Override // com.meituan.android.common.aidata.feature.persona.LoginChangeListener
    public void onLogin(UserProxy userProxy) {
        Object[] objArr = {userProxy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34d3d403923b82232aaa9404c193caae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34d3d403923b82232aaa9404c193caae");
            return;
        }
        this.requestCount.set(0);
        this.cacheFeature = new PersonaFeatureCache(userProxy);
        checkConfig();
        new StringBuilder("user login,user is ").append(userProxy.id);
    }

    @Override // com.meituan.android.common.aidata.feature.persona.LoginChangeListener
    public void onLogout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b60bb9ca2643dc0b1851cc55e09d325b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b60bb9ca2643dc0b1851cc55e09d325b");
            return;
        }
        new StringBuilder("user logout,user is ").append(this.cacheFeature.getUserId());
        this.cacheFeature = new PersonaFeatureCache(null);
    }

    public void requestFeature(final long j, final List<Integer> list, final Map<Integer, PersonaOption> map, final List<String> list2, final List<String> list3) {
        BaseTable table;
        Object[] objArr = {new Long(j), list, map, list2, list3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "883b04ea780c217c6aa944dd631d4f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "883b04ea780c217c6aa944dd631d4f4f");
        } else if (j == -1 || map == null || map.size() <= 0) {
            if (list2 == null || list2.size() <= 0 || (table = DBManager.getInstance().getTable(PersonaTable.class)) == null) {
                return;
            }
            for (String str : list2) {
                this.cacheFeature.remove(str);
                table.deleteByCase("feature_identifier=? and user_id=?", new String[]{str, String.valueOf(j)});
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(" request persona feature,list:\n ");
            sb.append(list);
            if (this.requestCount.getAndIncrement() >= 3) {
                return;
            }
            this.requestBuilder.startHeader().addHeader("X-Passport-Token", UserCenterManager.getInstance().getToken());
            try {
                String encryptCBC = AESUtil.encryptCBC(new JSONArray((Collection) list).toString(), PersonaBean.KEY_AES, PersonaBean.IV_AES);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j);
                sb2.append(" request persona feature,encrypt list:\n ");
                sb2.append(encryptCBC);
                this.requestBuilder.startParam().addBody("labelIds", encryptCBC);
                final String uniqueId = AppUtil.getUniqueId();
                final JSONArray jSONArray = new JSONArray((Collection) list3);
                CatMonitorManager.getInstance().reportRequestPersona(jSONArray, this.version, uniqueId, j);
                HttpManager.getInstance().asyncPost(this.requestBuilder, new HttpResultListener() { // from class: com.meituan.android.common.aidata.feature.persona.PersonaManager.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.net.HttpResultListener
                    public void onSuccess(HttpResult httpResult) {
                        Object[] objArr2 = {httpResult};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34fc9dd9798cf867541c33f79009e785", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34fc9dd9798cf867541c33f79009e785");
                            return;
                        }
                        PersonaManager.this.requestCount.set(0);
                        PersonaManager.this.handleData(j, httpResult.data, map, list2);
                        if (LogUtil.isLogEnabled()) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(j);
                            sb3.append(" request result is :\n");
                            sb3.append(httpResult);
                        }
                    }

                    @Override // com.meituan.android.common.aidata.net.HttpResultListener
                    public void onFail(int i, String str2) {
                        Object[] objArr2 = {Integer.valueOf(i), str2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "21fb09051421123b29ed264fc8701688", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "21fb09051421123b29ed264fc8701688");
                            return;
                        }
                        PersonaManager.this.requestFeature(j, list, map, list2, list3);
                        CatMonitorManager.getInstance().reportRequestPersonaFailed(jSONArray, PersonaManager.this.version, uniqueId, j, str2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(j);
                        sb3.append(" request is failed,code is ");
                        sb3.append(i);
                        sb3.append(" msg is ");
                        sb3.append(str2);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(j);
                sb3.append(" request persona feature, encrypt list fail");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleData(long j, String str, Map<Integer, PersonaOption> map, List<String> list) {
        PersonaOption personaOption;
        Object[] objArr = {new Long(j), str, map, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48528ca09d0bdc9519c090613e83f950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48528ca09d0bdc9519c090613e83f950");
        } else if (j == -1 || this.cacheFeature.getUserId() != j) {
            StringBuilder sb = new StringBuilder("userid which is request is ");
            sb.append(j);
            sb.append(" but now userid is ");
            sb.append(this.cacheFeature.getUserId());
        } else {
            List<PersonaBean> parseList = PersonaBean.parseList(j, str);
            if (parseList == null || parseList.size() <= 0) {
                if (list == null) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j);
                sb2.append(" clear all db feature");
                clearPersonaFeature();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            ArrayList<PersonaBean> arrayList = null;
            ArrayList<PersonaBean> arrayList2 = null;
            for (PersonaBean personaBean : parseList) {
                if (personaBean != null && (personaOption = map.get(Integer.valueOf(personaBean.label_id))) != null) {
                    if (personaOption.operate == 1) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        personaBean.feature_identifier = personaOption.feature_identifier;
                        personaBean.update_period = personaOption.update_period;
                        personaBean.update_timestamp = currentTimeMillis;
                        arrayList.add(personaBean);
                    } else if (personaOption.operate == 2) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        personaBean.feature_identifier = personaOption.feature_identifier;
                        personaBean.update_period = personaOption.update_period;
                        personaBean.update_timestamp = currentTimeMillis;
                        arrayList2.add(personaBean);
                    }
                }
            }
            BaseTable table = DBManager.getInstance().getTable(PersonaTable.class);
            if (table == null) {
                return;
            }
            if (list != null && list.size() > 0) {
                for (String str2 : list) {
                    this.cacheFeature.remove(str2);
                    table.deleteByCase("user_id=? and feature_identifier=?", new String[]{String.valueOf(j), str2});
                }
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                for (PersonaBean personaBean2 : arrayList2) {
                    if (personaBean2 != null) {
                        this.cacheFeature.update(personaBean2.feature_identifier, personaBean2);
                        table.updateByCase(personaBean2, "user_id=? and feature_identifier=?", new String[]{String.valueOf(j), personaBean2.feature_identifier});
                    }
                }
            }
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            for (PersonaBean personaBean3 : arrayList) {
                if (personaBean3 != null) {
                    table.insert((BaseTable) personaBean3);
                }
            }
        }
    }

    public void setCloudResultMap(Map<String, Map<String, List<ResultRow>>> map) {
        this.mCloudResultMap = map;
    }

    public Map<String, Map<String, List<ResultRow>>> getCloudResultMap() {
        return this.mCloudResultMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class PersonaOption {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String feature_identifier;
        public int operate;
        public long update_period;

        public PersonaOption(int i, String str, long j) {
            this.operate = i;
            this.feature_identifier = str;
            this.update_period = j;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class PersonaFeatureCache {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Map<String, Map<String, List<ResultRow>>> cache;
        private final UserProxy userProxy;

        public PersonaFeatureCache(UserProxy userProxy) {
            Object[] objArr = {userProxy};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "068c2a1c7880a66941061508ae43554a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "068c2a1c7880a66941061508ae43554a");
                return;
            }
            this.cache = new HashMap();
            this.userProxy = userProxy;
        }

        public final long getUserId() {
            if (this.userProxy == null) {
                return -1L;
            }
            return this.userProxy.id;
        }

        public final synchronized void remove(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a21841f6d65c53f5ff1757dac9fa66c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a21841f6d65c53f5ff1757dac9fa66c7");
            } else {
                this.cache.remove(str);
            }
        }

        public final synchronized void put(String str, PersonaBean personaBean) {
            Object[] objArr = {str, personaBean};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3de7724741437041c6788d48fbda759", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3de7724741437041c6788d48fbda759");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                if (personaBean == null) {
                    this.cache.put(str, null);
                } else {
                    this.cache.put(str, personaBean.getRealFeature());
                }
            }
        }

        public final void clear() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e45725bf920ba2a48aeaddc8c5e2372", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e45725bf920ba2a48aeaddc8c5e2372");
            } else {
                this.cache.clear();
            }
        }

        public final synchronized Map<String, List<ResultRow>> get(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83eabd2072d4ebef3e58de81855e2371", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83eabd2072d4ebef3e58de81855e2371");
            }
            return this.cache.get(str);
        }

        public final boolean isInvalidUserId() {
            return this.userProxy == null || this.userProxy.id == -1;
        }

        public final synchronized void update(String str, PersonaBean personaBean) {
            Object[] objArr = {str, personaBean};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e7784a7b7845ed6dbf8d9168654f490", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e7784a7b7845ed6dbf8d9168654f490");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                if (personaBean == null) {
                    this.cache.put(str, null);
                    return;
                }
                if (this.cache.containsKey(str)) {
                    this.cache.put(str, personaBean.getRealFeature());
                }
            }
        }
    }
}
