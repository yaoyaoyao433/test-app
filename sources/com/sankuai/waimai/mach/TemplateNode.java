package com.sankuai.waimai.mach;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TemplateNode {
    public static ChangeQuickRedirect a;
    @Keep
    private String activeBackgroundColor;
    @Keep
    private String activeOpacity;
    @Keep
    public Map<String, Object> attrs;
    public String b;
    @Keep
    public List<TemplateNode> children;
    @SerializedName(":key")
    @Keep
    public String colonKey;
    @SerializedName(":style")
    @Keep
    public String dynamicStyle;
    @Keep
    public Map<String, Object> events;
    @SerializedName(":expr")
    @Keep
    public String expr;
    @Keep
    public String mUUID;
    @Keep
    public TemplateNode parent;
    @Keep
    private Map<String, Object> statement;
    @Keep
    public Map<String, Object> style;
    @Keep
    public String tag;

    public TemplateNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3b1492383c84ff786f0efd6cca7118", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3b1492383c84ff786f0efd6cca7118");
            return;
        }
        this.attrs = Collections.EMPTY_MAP;
        this.style = Collections.EMPTY_MAP;
        this.events = Collections.EMPTY_MAP;
        this.statement = Collections.EMPTY_MAP;
        this.children = Collections.EMPTY_LIST;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7789c1973b862835ad5a9ef7b693fd1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7789c1973b862835ad5a9ef7b693fd1d");
        } else {
            this.mUUID = UUID.randomUUID().toString().substring(0, 8);
        }
    }

    public TemplateNode(TemplateNode templateNode) {
        Object[] objArr = {templateNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f345d7a1e4b5b30179dcd24f04011d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f345d7a1e4b5b30179dcd24f04011d9");
            return;
        }
        this.attrs = Collections.EMPTY_MAP;
        this.style = Collections.EMPTY_MAP;
        this.events = Collections.EMPTY_MAP;
        this.statement = Collections.EMPTY_MAP;
        this.children = Collections.EMPTY_LIST;
        if (templateNode.tag != null) {
            this.tag = templateNode.tag;
        }
        if (templateNode.attrs != null) {
            this.attrs = new HashMap(templateNode.attrs);
        }
        if (templateNode.style != null) {
            this.style = new HashMap(templateNode.style);
        }
        if (templateNode.events != null) {
            this.events = new HashMap(templateNode.events);
        }
        if (templateNode.statement != null) {
            this.statement = new HashMap(templateNode.statement);
        }
        if (templateNode.expr != null) {
            this.expr = templateNode.expr;
        }
        if (templateNode.dynamicStyle != null) {
            this.dynamicStyle = templateNode.dynamicStyle;
        }
        if (templateNode.activeBackgroundColor != null) {
            this.activeBackgroundColor = templateNode.activeBackgroundColor;
        }
        if (templateNode.activeOpacity != null) {
            this.activeOpacity = templateNode.activeOpacity;
        }
        if (templateNode.mUUID != null) {
            this.mUUID = templateNode.mUUID;
        }
        if (templateNode.colonKey != null) {
            this.colonKey = templateNode.colonKey;
        }
        if (templateNode.b != null) {
            this.b = templateNode.b;
        }
        if (templateNode.children != null) {
            this.children = new ArrayList();
            for (int i = 0; i < templateNode.children.size(); i++) {
                TemplateNode templateNode2 = new TemplateNode(templateNode.children.get(i));
                templateNode2.parent = this;
                this.children.add(templateNode2);
            }
        }
    }

    public final Map<String, Object> a() {
        return this.style;
    }

    public final int a(TemplateNode templateNode) {
        Object[] objArr = {templateNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "597aed97e7bcea5354de8f20f1f80392", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "597aed97e7bcea5354de8f20f1f80392")).intValue();
        }
        int indexOf = this.children.indexOf(templateNode);
        this.children.remove(templateNode);
        return indexOf;
    }

    public final void b(TemplateNode templateNode) {
        Object[] objArr = {templateNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d60b90f07c63c63e453b38a640f4626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d60b90f07c63c63e453b38a640f4626");
        } else {
            this.children.add(templateNode);
        }
    }

    public final void a(int i, TemplateNode templateNode) {
        Object[] objArr = {Integer.valueOf(i), templateNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7edf306f7e645e47e839f9fe663f765", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7edf306f7e645e47e839f9fe663f765");
        } else {
            this.children.add(i, templateNode);
        }
    }
}
