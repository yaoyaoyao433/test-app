package com.meituan.android.common.statistics.tag;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.ipc.independent.ProcessController;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TagManager implements ITagManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile TagManager mInstance;
    private ITagManager mTagManager;

    public TagManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb3486ee78b31ea136acb9c2047c8e3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb3486ee78b31ea136acb9c2047c8e3f");
            return;
        }
        this.mTagManager = null;
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            this.mTagManager = ProcessController.getInstance().selectTagManager(Statistics.getContext());
        } else {
            this.mTagManager = LocalTagManager.getInstance();
        }
    }

    public static TagManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "459f8fcc24743c9f541758a92be1a62a", 6917529027641081856L)) {
            return (TagManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "459f8fcc24743c9f541758a92be1a62a");
        }
        if (mInstance == null) {
            synchronized (TagManager.class) {
                if (mInstance == null) {
                    mInstance = new TagManager();
                }
            }
        }
        return mInstance;
    }

    public boolean insertPageName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8c6dd6d27c4942897e75a358f259dc7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8c6dd6d27c4942897e75a358f259dc7")).booleanValue();
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().insertPageName(str, null, false);
        }
        return this.mTagManager.insertPageName(str, null, false);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean insertPageName(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89ff5c4efc0807d7b1667e3091dc55df", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89ff5c4efc0807d7b1667e3091dc55df")).booleanValue();
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().insertPageName(str, str2, z);
        }
        return this.mTagManager.insertPageName(str, str2, z);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean updatePageName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d9a243074e8a7c0175d09982a340553", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d9a243074e8a7c0175d09982a340553")).booleanValue();
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().updatePageName(str, str2);
        }
        return this.mTagManager.updatePageName(str, str2);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93740a8840ac1b36acaf92798821d51f", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93740a8840ac1b36acaf92798821d51f")).booleanValue() : writeTag((String) null, str, map);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b622c1c71a591fdcf1a5bd2435aeb1a8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b622c1c71a591fdcf1a5bd2435aeb1a8")).booleanValue();
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().writeTag(str2, map);
        }
        return this.mTagManager.writeTag(str, str2, map);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64a6a9c48ec58a2b74c1c4e9ebfd7c88", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64a6a9c48ec58a2b74c1c4e9ebfd7c88")).booleanValue() : writeTag((String) null, str, jSONObject);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edbf272cfefa1843068f00cd2046cd55", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edbf272cfefa1843068f00cd2046cd55")).booleanValue();
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().writeTag(str, str2, jSONObject);
        }
        return this.mTagManager.writeTag(str, str2, jSONObject);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean removeTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a06a9859bd839f1104b2342a3333965", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a06a9859bd839f1104b2342a3333965")).booleanValue();
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().removeTag(str);
        }
        return this.mTagManager.removeTag(str);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean removeTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e79e9f86cfbcf0f9366621151281fb40", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e79e9f86cfbcf0f9366621151281fb40")).booleanValue();
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().removeTag(str2);
        }
        return this.mTagManager.removeTag(str2);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public Map<String, Object> getTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e37b733f4ca93c63dd7c7ce855f18ae", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e37b733f4ca93c63dd7c7ce855f18ae") : this.mTagManager.getTags();
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public Map<String, Object> getTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3da462e070d5ad1b821daccc9aaea39b", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3da462e070d5ad1b821daccc9aaea39b") : this.mTagManager.getTag(str);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public Map<String, Object> getTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edd2595eee3837fc4095393b555ffa17", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edd2595eee3837fc4095393b555ffa17") : this.mTagManager.getTag(str, str2);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2e56cefb2d5c02c59a9c682a5fa854e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2e56cefb2d5c02c59a9c682a5fa854e");
            return;
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().clear();
        }
        this.mTagManager.clear();
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clear(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34ab9b18c5a4b9021a91b19f43bf289d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34ab9b18c5a4b9021a91b19f43bf289d");
            return;
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().clear(str);
        }
        this.mTagManager.clear(str);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clearMmpTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96b2e0579c09e9878544cc4b47cc4817", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96b2e0579c09e9878544cc4b47cc4817");
            return;
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().clearMmpTag(str);
        }
        this.mTagManager.clearMmpTag(str);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clearMmpTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ef7568a85785c256a8476464461a5e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ef7568a85785c256a8476464461a5e0");
            return;
        }
        if (ConfigManager.getInstance(Statistics.getContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(Statistics.getContext())) {
            LocalTagManager.getInstance().clearMmpTag(str, str2);
        }
        this.mTagManager.clearMmpTag(str, str2);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public String getCurrentTagNodePageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9902b72c20efab108bfbcaf71f068df8", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9902b72c20efab108bfbcaf71f068df8") : this.mTagManager.getCurrentTagNodePageName();
    }
}
