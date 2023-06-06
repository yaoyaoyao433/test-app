package com.meituan.android.common.statistics.tag;

import android.text.TextUtils;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.tag.TagList;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LocalTagManager implements ITagManager, TagList.TagNodeRemoveListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isTagChanged;
    private Set<String> mBackgroudPageSet;
    private TagList mTagList;
    private Map<String, Object> tagCache;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class TagManagerHelper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static LocalTagManager tagManager = new LocalTagManager();
    }

    public LocalTagManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4c7513e82d0d3fd5ded31c046b65913", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4c7513e82d0d3fd5ded31c046b65913");
            return;
        }
        this.mBackgroudPageSet = null;
        this.mTagList = new TagList();
        this.mBackgroudPageSet = new HashSet();
    }

    public static LocalTagManager getInstance() {
        return TagManagerHelper.tagManager;
    }

    public TagList getTagList() {
        return this.mTagList;
    }

    public void setAppForeground(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c97b6f68d483de1101e45af80de61519", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c97b6f68d483de1101e45af80de61519");
            return;
        }
        synchronized (this.mBackgroudPageSet) {
            TagNode tagNode = this.mTagList.get(str);
            if (tagNode != null) {
                if (!z) {
                    this.mBackgroudPageSet.add(str);
                    this.mBackgroudPageSet.add(tagNode.getLastChildPageName());
                } else {
                    this.mBackgroudPageSet.remove(str);
                }
            }
        }
    }

    public boolean isAppOnBackground(String str) {
        boolean contains;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "033e0e2522dd4cf1fe64eeccbdf491ee", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "033e0e2522dd4cf1fe64eeccbdf491ee")).booleanValue();
        }
        synchronized (this.mBackgroudPageSet) {
            contains = this.mBackgroudPageSet.contains(str);
        }
        return contains;
    }

    public void removePageOnBackground(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "092f91949ee77cb480dca67e629828a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "092f91949ee77cb480dca67e629828a1");
            return;
        }
        synchronized (this.mBackgroudPageSet) {
            this.mBackgroudPageSet.remove(str);
        }
    }

    @Override // com.meituan.android.common.statistics.tag.TagList.TagNodeRemoveListener
    public void onTagNodeRemoved(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a87ffd057ce9c86b0da06b9e50cc9360", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a87ffd057ce9c86b0da06b9e50cc9360");
        } else {
            removePageOnBackground(str);
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean insertPageName(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b0a7ca6a5a3688c0baaf2ec9b67bf32", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b0a7ca6a5a3688c0baaf2ec9b67bf32")).booleanValue();
        }
        try {
            LogUtil.log("lxsdk_tag", "insertPageName pageName:" + str + " parentPageName:" + str2 + " attachToParent" + z);
            synchronized (this.mTagList) {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                long nanoTime = System.nanoTime();
                if (isAppOnBackground(str)) {
                    LogUtil.log("lxsdk_tag", "insertPageName isAppOnBackground true:" + str);
                    removePageOnBackground(str);
                    return true;
                }
                if (this.mTagList.contains(str)) {
                    LogUtil.log("lxsdk_tag", "insertPageName mTagList contains:" + str);
                    if (this.mTagList.get(str) != null && this.mTagList.get(str).containChildTagNode()) {
                        LogUtil.log("lxsdk_tag", "insertPageName containChildTagNode removeToLast pageName:" + this.mTagList.get(str).getLastChildPageName());
                        this.mTagList.removeToLast(this.mTagList.get(str).getLastChildPageName(), this);
                    } else {
                        LogUtil.log("lxsdk_tag", "insertPageName dont containChildTagNode removeToLast pageName:" + str + " parentPageName:" + str2);
                        this.mTagList.removeToLast(str, this);
                        this.mTagList.add(str, str2, z);
                    }
                } else {
                    LogUtil.log("lxsdk_tag", "insertPageName add mTagList:" + str);
                    this.mTagList.add(str, str2, z);
                }
                this.isTagChanged = true;
                this.tagCache = null;
                CatMonitorManager.getInstance().reportInsertPageNameTime(System.nanoTime() - nanoTime);
                return true;
            }
        } catch (Exception e) {
            LogUtil.log("statistics", "TagManager - insertPageName: " + e.getMessage());
            return false;
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean updatePageName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd86bbace7bedf7f0c9503fc0b479d8d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd86bbace7bedf7f0c9503fc0b479d8d")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            synchronized (this.mTagList) {
                if (this.mTagList.contains(str2)) {
                    this.mTagList.get(str2).setPageName(str);
                }
                this.isTagChanged = true;
                this.tagCache = null;
            }
            return true;
        } catch (Exception e) {
            LogUtil.log("statistics", "TagManager - writeTag: " + e.getMessage());
            return false;
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "638a574f130700512147254bec8f4fc4", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "638a574f130700512147254bec8f4fc4")).booleanValue() : writeTag((String) null, str, map);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, String str2, Map<String, Object> map) {
        TagNode tagNode;
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98a11ac1a3321c19c8dbc8f42dfcb599", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98a11ac1a3321c19c8dbc8f42dfcb599")).booleanValue();
        }
        try {
            synchronized (this.mTagList) {
                long nanoTime = System.nanoTime();
                if (TextUtils.isEmpty(str)) {
                    tagNode = this.mTagList.getCurrent();
                } else {
                    tagNode = this.mTagList.get(str);
                }
                if (tagNode == null) {
                    return false;
                }
                Map<String, Object> cloneMap = JsonUtil.cloneMap(map);
                fillTagTm(cloneMap);
                Map<String, Map<String, Object>> dataNode = tagNode.getDataNode();
                if (dataNode.containsKey(str2)) {
                    dataNode.get(str2).putAll(cloneMap);
                } else {
                    dataNode.put(str2, cloneMap);
                }
                this.isTagChanged = true;
                this.tagCache = null;
                CatMonitorManager.getInstance().reportSetTagTime(System.nanoTime() - nanoTime);
                return true;
            }
        } catch (Exception e) {
            LogUtil.log("statistics", "TagManager - writeTag: " + e.getMessage());
            return false;
        }
    }

    private void fillTagTm(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ef14e484403d46c41bfc326f50305e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ef14e484403d46c41bfc326f50305e8");
        } else if (map != null && map.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null) {
                    if (entry.getValue() instanceof Map) {
                        Map map2 = (Map) entry.getValue();
                        if (map2.get("lx_tag_tm") == null) {
                            map2.put("lx_tag_tm", Long.valueOf(currentTimeMillis));
                        }
                    } else if (entry.getValue() instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        try {
                            if (!jSONObject.has("lx_tag_tm")) {
                                jSONObject.put("lx_tag_tm", currentTimeMillis);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "070c747ec011ade6c41969de5559d644", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "070c747ec011ade6c41969de5559d644")).booleanValue() : writeTag((String) null, str, jSONObject);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22ef1e7f36de2d47328dc343fe8572fa", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22ef1e7f36de2d47328dc343fe8572fa")).booleanValue();
        }
        try {
            return writeTag(str, str2, JsonUtil.jsonObjectToMap(jSONObject));
        } catch (Exception e) {
            LogUtil.log("statistics", "TagManager - writeTag: " + e.getMessage());
            return false;
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean removeTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59bacab2938024dcf76a148a2534ebe1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59bacab2938024dcf76a148a2534ebe1")).booleanValue() : removeTag(null, str);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean removeTag(String str, String str2) {
        TagNode tagNode;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b6f6ed3d3f17cc8faf5709fcd0429b5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b6f6ed3d3f17cc8faf5709fcd0429b5")).booleanValue();
        }
        try {
            synchronized (this.mTagList) {
                if (TextUtils.isEmpty(str)) {
                    tagNode = this.mTagList.getCurrent();
                } else {
                    tagNode = this.mTagList.get(str);
                }
                if (tagNode != null) {
                    tagNode.getDataNode().remove(str2);
                    this.isTagChanged = true;
                    this.tagCache = null;
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            LogUtil.log("statistics", "TagManager - removeTag: " + e.getMessage());
            return false;
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public Map<String, Object> getTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4db6e6f567ae1b12b35d51f1afb3cc52", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4db6e6f567ae1b12b35d51f1afb3cc52");
        }
        if (this.mTagList == null || this.mTagList.size() == 0) {
            return null;
        }
        synchronized (this.mTagList) {
            if (!this.isTagChanged && this.tagCache != null && this.tagCache.size() > 0) {
                return this.tagCache;
            }
            HashMap hashMap = new HashMap();
            int size = this.mTagList.size();
            for (int i = 0; i < size; i++) {
                for (Map.Entry<String, Map<String, Object>> entry : this.mTagList.get(i).getDataNode().entrySet()) {
                    String key = entry.getKey();
                    if (hashMap.containsKey(key)) {
                        Map map = (Map) hashMap.get(key);
                        if (map != null) {
                            map.putAll(entry.getValue());
                        }
                    } else {
                        Map<String, Object> value = entry.getValue();
                        if (value != null) {
                            hashMap.put(key, new HashMap(value));
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                hashMap2.put(entry2.getKey(), JsonUtil.mapToJSONObject((Map) entry2.getValue()));
            }
            this.tagCache = hashMap2;
            this.isTagChanged = false;
            return hashMap2;
        }
    }

    private void copyMap2(Map<String, Map<String, Object>> map, Map<String, Map<String, Object>> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81ac457342d73558ac1ca3e44e0fb398", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81ac457342d73558ac1ca3e44e0fb398");
            return;
        }
        for (Map.Entry<String, Map<String, Object>> entry : map2.entrySet()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry2 : entry.getValue().entrySet()) {
                hashMap.put(entry2.getKey(), entry2.getValue());
            }
            map.put(entry.getKey(), hashMap);
        }
    }

    private void copyMap(Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85eb8eea4046f4ab4007b44d900729d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85eb8eea4046f4ab4007b44d900729d1");
            return;
        }
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public Map<String, Object> getTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8800f0c93159b6197e367f8fcb36128b", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8800f0c93159b6197e367f8fcb36128b") : getTag(null, str);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public Map<String, Object> getTag(String str, String str2) {
        TagNode tagNode;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "424f755b2adfe97fe22ae477d75b18d8", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "424f755b2adfe97fe22ae477d75b18d8");
        }
        if (this.mTagList == null || this.mTagList.size() == 0) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            tagNode = this.mTagList.getCurrent();
        } else {
            tagNode = this.mTagList.get(str);
        }
        if (tagNode != null) {
            return tagNode.getDataNode().get(str2);
        }
        return null;
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1711385add33574ad5520c56e7a711d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1711385add33574ad5520c56e7a711d");
        } else if (this.mTagList != null) {
            synchronized (this.mTagList) {
                int size = this.mTagList.size();
                for (int i = 0; i < size; i++) {
                    Map<String, Map<String, Object>> dataNode = this.mTagList.get(i).getDataNode();
                    if (dataNode != null && dataNode.size() > 0) {
                        dataNode.clear();
                    }
                }
                this.isTagChanged = true;
                this.tagCache = null;
            }
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clear(String str) {
        TagNode tagNode;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efdb1b855cd3dca9e1e5d881a827e732", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efdb1b855cd3dca9e1e5d881a827e732");
        } else if (this.mTagList == null || this.mTagList.size() == 0) {
        } else {
            if (TextUtils.isEmpty(str)) {
                tagNode = this.mTagList.getCurrent();
            } else {
                tagNode = this.mTagList.get(str);
            }
            if (tagNode != null) {
                Map<String, Map<String, Object>> dataNode = tagNode.getDataNode();
                if (dataNode != null && dataNode.size() > 0) {
                    dataNode.clear();
                }
                this.isTagChanged = true;
                this.tagCache = null;
            }
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clearMmpTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "379d8865be52db50d369372116636a16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "379d8865be52db50d369372116636a16");
        } else if (this.mTagList != null) {
            synchronized (this.mTagList) {
                int size = this.mTagList.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    TagNode tagNode = this.mTagList.get(i);
                    if (tagNode != null) {
                        if (z) {
                            Map<String, Map<String, Object>> dataNode = tagNode.getDataNode();
                            if (dataNode != null && dataNode.size() > 0) {
                                dataNode.clear();
                            }
                        } else {
                            String pageName = tagNode.getPageName();
                            if (pageName.startsWith("LX_IOR")) {
                                String[] split = pageName.split("->");
                                if (split.length >= 2 && split[1].equals(str)) {
                                    Map<String, Map<String, Object>> dataNode2 = tagNode.getDataNode();
                                    if (dataNode2 != null && dataNode2.size() > 0) {
                                        dataNode2.clear();
                                    }
                                    z = true;
                                }
                            }
                        }
                    }
                }
                this.isTagChanged = true;
                this.tagCache = null;
            }
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clearMmpTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8516333815e0b1b5f425966ea0d0f1a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8516333815e0b1b5f425966ea0d0f1a9");
        } else if (this.mTagList != null) {
            synchronized (this.mTagList) {
                int size = this.mTagList.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    TagNode tagNode = this.mTagList.get(i);
                    if (tagNode != null) {
                        if (z) {
                            Map<String, Map<String, Object>> dataNode = tagNode.getDataNode();
                            if (dataNode != null && dataNode.size() > 0) {
                                dataNode.clear();
                            }
                        } else {
                            String pageName = tagNode.getPageName();
                            if (pageName.startsWith("LX_IOR")) {
                                String[] split = pageName.split("->");
                                if (split.length >= 3) {
                                    String str3 = split[1];
                                    String str4 = split[2];
                                    if (str3.equals(str) && str4.equals(str2)) {
                                        Map<String, Map<String, Object>> dataNode2 = tagNode.getDataNode();
                                        if (dataNode2 != null && dataNode2.size() > 0) {
                                            dataNode2.clear();
                                        }
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                this.isTagChanged = true;
                this.tagCache = null;
            }
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public String getCurrentTagNodePageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fde218b0fe13afb01e2d5976a02640e", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fde218b0fe13afb01e2d5976a02640e") : (this.mTagList == null || this.mTagList.size() == 0 || this.mTagList.getCurrent() == null) ? "" : this.mTagList.getCurrent().getPageName();
    }
}
