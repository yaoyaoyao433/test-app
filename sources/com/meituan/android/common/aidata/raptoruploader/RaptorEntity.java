package com.meituan.android.common.aidata.raptoruploader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RaptorEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, String> mExtraMap;
    private Map<String, String> mTagMap;
    private Map<String, Float> mValueMap;

    public Map<String, Float> getValueMap() {
        return this.mValueMap;
    }

    public void setValueMap(Map<String, Float> map) {
        this.mValueMap = map;
    }

    public Map<String, String> getTagMap() {
        return this.mTagMap;
    }

    public void setTagMap(Map<String, String> map) {
        this.mTagMap = map;
    }

    public Map<String, String> getExtraMap() {
        return this.mExtraMap;
    }

    public void setExtraMap(Map<String, String> map) {
        this.mExtraMap = map;
    }

    public RaptorEntity addValue(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "542c73c11297a475973f5220ef15885d", RobustBitConfig.DEFAULT_VALUE)) {
            return (RaptorEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "542c73c11297a475973f5220ef15885d");
        }
        if (this.mValueMap == null) {
            this.mValueMap = new HashMap();
        }
        this.mValueMap.put(str, Float.valueOf(f));
        return this;
    }

    public RaptorEntity addTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9248103151f8e6a3b05f31a1c3685fb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (RaptorEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9248103151f8e6a3b05f31a1c3685fb1");
        }
        if (this.mTagMap == null) {
            this.mTagMap = new HashMap();
        }
        this.mTagMap.put(str, str2);
        return this;
    }

    public RaptorEntity addExtra(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8ffbf36f678ec6ab9c0b8456e79674a", RobustBitConfig.DEFAULT_VALUE)) {
            return (RaptorEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8ffbf36f678ec6ab9c0b8456e79674a");
        }
        if (this.mExtraMap == null) {
            this.mExtraMap = new HashMap();
        }
        this.mExtraMap.put(str, str2);
        return this;
    }

    public void send() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e5f613d1f7c059bddf84b2511e8fc68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e5f613d1f7c059bddf84b2511e8fc68");
        } else {
            new RaptorUploaderImpl().commonRaptorUploader(this, 100);
        }
    }

    public void send(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c799f56c4a92e50812392e4eca0ece2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c799f56c4a92e50812392e4eca0ece2d");
        } else {
            new RaptorUploaderImpl().commonRaptorUploader(this, i);
        }
    }
}
