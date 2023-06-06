package com.meituan.android.common.statistics.tag;

import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class TagNode {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, Map<String, Object>> dataNode;
    private Set<TagNode> mChildTagNode;
    private TagNode mParentTagNode;
    private String pageName;

    public TagNode(String str, TagNode tagNode) {
        Object[] objArr = {str, tagNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c032003308e23913a2b99770be23745f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c032003308e23913a2b99770be23745f");
            return;
        }
        this.pageName = str;
        this.dataNode = new ConcurrentHashMap();
        this.mParentTagNode = tagNode;
    }

    public TagNode(String str, Map<String, Map<String, Object>> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "359e3f9e9e6722384d3dd948ad2eb41d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "359e3f9e9e6722384d3dd948ad2eb41d");
            return;
        }
        this.pageName = str;
        this.dataNode = map;
    }

    public final void setPageName(String str) {
        this.pageName = str;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final Map<String, Map<String, Object>> getDataNode() {
        return this.dataNode;
    }

    public final boolean addChildTagNode(TagNode tagNode) {
        Object[] objArr = {tagNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e98db7b0e78d8abb9e73b4b09890072", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e98db7b0e78d8abb9e73b4b09890072")).booleanValue();
        }
        synchronized (this) {
            if (this.mChildTagNode == null) {
                this.mChildTagNode = new LinkedHashSet();
            }
            if (this.mChildTagNode != null) {
                this.mChildTagNode.add(tagNode);
                return true;
            }
            return false;
        }
    }

    public final boolean removeChildTagNode(TagNode tagNode) {
        Object[] objArr = {tagNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19834efbcd03ead45dbef3549d880da6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19834efbcd03ead45dbef3549d880da6")).booleanValue();
        }
        synchronized (this) {
            if (this.mChildTagNode != null) {
                this.mChildTagNode.remove(tagNode);
                return true;
            }
            return false;
        }
    }

    public final boolean remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "649392cc39f313fff8711543bac301ae", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "649392cc39f313fff8711543bac301ae")).booleanValue();
        }
        synchronized (this) {
            if (this.mChildTagNode != null) {
                this.mChildTagNode.clear();
            }
            if (this.mParentTagNode != null) {
                this.mParentTagNode.removeChildTagNode(this);
            }
        }
        return false;
    }

    public final boolean containChildTagNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2921de060d64e4e341dd91c997a0bfb9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2921de060d64e4e341dd91c997a0bfb9")).booleanValue();
        }
        synchronized (this) {
            return this.mChildTagNode != null && this.mChildTagNode.size() > 0;
        }
    }

    public final String getLastChildPageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "999d59628c04eeea7746565bd087b99e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "999d59628c04eeea7746565bd087b99e");
        }
        synchronized (this) {
            if (this.mChildTagNode != null && this.mChildTagNode.size() > 0) {
                Iterator<TagNode> it = this.mChildTagNode.iterator();
                TagNode tagNode = null;
                while (it.hasNext()) {
                    tagNode = it.next();
                }
                if (tagNode != null) {
                    return tagNode.getPageName();
                }
            }
            return "";
        }
    }

    public final JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c93c23cbe4b44322085b559b97c7a06e", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c93c23cbe4b44322085b559b97c7a06e");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageName", this.pageName);
            jSONObject.put("dataNode", JsonUtil.mapToJSONObject(this.dataNode));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
