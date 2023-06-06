package com.sankuai.waimai.mach.parser;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ASTTemplate;
import com.sankuai.waimai.mach.TemplateNode;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.node.VirtualNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements c {
    public static ChangeQuickRedirect a;
    b b;

    public e(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "228781b77d88032cf1887c4b7599692f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "228781b77d88032cf1887c4b7599692f");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.mach.parser.c
    public final synchronized VirtualNode a(ASTTemplate aSTTemplate, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        Object[] objArr = {aSTTemplate, map, map2, map3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03cd1e0f5059518b100f5eb2d7fbce5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (VirtualNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03cd1e0f5059518b100f5eb2d7fbce5e");
        }
        VirtualNode a2 = new a(aSTTemplate).a(map, map2, map3);
        if (m.e() && (this.b instanceof com.sankuai.waimai.mach.parser.a)) {
            com.sankuai.waimai.mach.parser.a aVar = (com.sankuai.waimai.mach.parser.a) this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.parser.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4d4964b55b0a70007e9426d5f8a59689", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4d4964b55b0a70007e9426d5f8a59689");
            } else {
                aVar.b.clear();
            }
        }
        return a2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a {
        public static ChangeQuickRedirect a;
        private ASTTemplate c;
        private b d;

        private a(ASTTemplate aSTTemplate) {
            Object[] objArr = {e.this, aSTTemplate};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49ccbf41b1b0d70e3de68e2d5fc6c6a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49ccbf41b1b0d70e3de68e2d5fc6c6a");
                return;
            }
            this.c = aSTTemplate;
            this.d = e.this.b;
        }

        VirtualNode a(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
            Map<String, Object> map4;
            VirtualNode a2;
            Map hashMap;
            Object[] objArr = {map, map2, map3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45f941d73583ffb639bc1a3686630fd", RobustBitConfig.DEFAULT_VALUE)) {
                return (VirtualNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45f941d73583ffb639bc1a3686630fd");
            }
            try {
                if (this.c != null && map != null) {
                    this.d.a("api", map);
                    this.d.a("env", map3);
                    if (map2 != null) {
                        map4 = a(map2);
                        Map<String, Object> a3 = a(map2);
                        Object[] objArr2 = {a3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a337a5a1724bbb82e85f2108ab121960", RobustBitConfig.DEFAULT_VALUE)) {
                            hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a337a5a1724bbb82e85f2108ab121960");
                        } else {
                            hashMap = new HashMap();
                            if (a3 != null) {
                                Object obj = a3.get("value");
                                if (obj instanceof Map) {
                                    Map map5 = (Map) obj;
                                    b(map5);
                                    hashMap = map5;
                                }
                            }
                        }
                        this.d.a("value", hashMap);
                        if (map4 != null) {
                            a(map4, (Map<String, Object>) null);
                            for (Map.Entry<String, Object> entry : map4.entrySet()) {
                                this.d.a(entry.getKey(), entry.getValue());
                            }
                        }
                    } else {
                        map4 = null;
                    }
                    TemplateNode templateNode = new TemplateNode(this.c.template);
                    Object[] objArr3 = {templateNode};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae733ecd99543eef90adeb836eadb177", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (VirtualNode) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae733ecd99543eef90adeb836eadb177");
                    } else {
                        Object[] objArr4 = {templateNode, null};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ec93bcaa7cc6e52ef9210b62c8a33a1a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ec93bcaa7cc6e52ef9210b62c8a33a1a");
                        } else {
                            a(templateNode, (TemplateNode) null, (Map<String, Object>) null);
                        }
                        a2 = a(templateNode);
                    }
                    a(a2);
                    if (map4 != null) {
                        for (Map.Entry<String, Object> entry2 : map4.entrySet()) {
                            this.d.a(entry2.getKey());
                        }
                    }
                    return a2;
                }
                return null;
            } catch (Exception e) {
                throw new com.sankuai.waimai.mach.exception.a("parse template error.", e, 1);
            }
        }

        private void a(VirtualNode virtualNode) {
            Object[] objArr = {virtualNode};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b4710508199b1e98113a4f65f7e2e13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b4710508199b1e98113a4f65f7e2e13");
            } else if (virtualNode != null && virtualNode.hasChildren()) {
                List<VirtualNode> children = virtualNode.getChildren();
                for (int i = 0; i < children.size(); i++) {
                    VirtualNode virtualNode2 = children.get(i);
                    virtualNode2.setNodeUUID(virtualNode2.getParent().getNodeUUID() + CommonConstant.Symbol.MINUS + virtualNode2.getNodeUUID());
                    a(virtualNode2);
                }
            }
        }

        private Map<String, Object> a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00fee7c09c6c8227b805ff42516e1877", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00fee7c09c6c8227b805ff42516e1877") : com.sankuai.waimai.mach.utils.b.a(new Gson().toJson(map));
        }

        private VirtualNode a(TemplateNode templateNode) {
            Object[] objArr = {templateNode};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca14be0e19dd528bcfa74e1c17bcc9e7", RobustBitConfig.DEFAULT_VALUE)) {
                return (VirtualNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca14be0e19dd528bcfa74e1c17bcc9e7");
            }
            VirtualNode virtualNode = new VirtualNode();
            virtualNode.setNodeUUID(templateNode.mUUID);
            virtualNode.onBind(templateNode);
            List<TemplateNode> list = templateNode.children;
            if (list != null && list.size() > 0) {
                for (TemplateNode templateNode2 : list) {
                    if (templateNode2 != null) {
                        VirtualNode a2 = a(templateNode2);
                        virtualNode.addChild(a2);
                        a2.setParent(virtualNode);
                    }
                }
            }
            return virtualNode;
        }

        private void a(TemplateNode templateNode, TemplateNode templateNode2, Map<String, Object> map) {
            Object[] objArr = {templateNode, templateNode2, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee7e9818982a80a24adfcb705ffc9573", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee7e9818982a80a24adfcb705ffc9573");
            } else if (templateNode != null) {
                ArrayList arrayList = new ArrayList(templateNode.children);
                templateNode.parent = templateNode2;
                a(templateNode.attrs, map);
                a(templateNode.style, map);
                a(templateNode.events, map);
                a(templateNode, map);
                e(templateNode, map);
                if (!TextUtils.isEmpty(templateNode.b) && !TextUtils.isEmpty(templateNode.mUUID)) {
                    templateNode.mUUID += "#" + templateNode.b;
                }
                if (b(templateNode, map)) {
                    return;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    TemplateNode templateNode3 = (TemplateNode) arrayList.get(i);
                    if (templateNode3 != null) {
                        a(templateNode3, templateNode, map);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00e7 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(java.util.Map<java.lang.String, java.lang.Object> r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.parser.e.a.a(java.util.Map, java.util.Map):void");
        }

        private List<Map<String, Object>> a(String str, Map<String, Object> map) {
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c55f6d345e02d172b417b746853e4109", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c55f6d345e02d172b417b746853e4109");
            }
            try {
                return (List) a("for", str, map);
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Object a(String str, String str2, Map<String, Object> map) {
            Object[] objArr = {str, str2, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f1095cc78b49c0755bac1d8734e370a", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f1095cc78b49c0755bac1d8734e370a");
            }
            if (this.c == null) {
                return null;
            }
            return this.d.a(str, str2, this.c.exprAst != null ? this.c.exprAst.get(str2) : null, map);
        }

        private Boolean b(String str, String str2, Map<String, Object> map) {
            Object[] objArr = {str, str2, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84bd0bd59700593fc4797c481f597905", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84bd0bd59700593fc4797c481f597905");
            }
            if (this.c == null) {
                return null;
            }
            return this.d.b(str, str2, this.c.exprAst != null ? this.c.exprAst.get(str2) : null, map);
        }

        private void b(Map map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e636ce17dc2d7c4e959ffba4f84226", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e636ce17dc2d7c4e959ffba4f84226");
            } else if (map == null || map.isEmpty()) {
            } else {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) next;
                        Object key = entry.getKey();
                        if (key instanceof String) {
                            if (((String) key).startsWith(CommonConstant.Symbol.COLON)) {
                                it.remove();
                            } else {
                                Object value = entry.getValue();
                                if (value instanceof Map) {
                                    b((Map) value);
                                }
                            }
                        }
                    }
                }
            }
        }

        private void a(TemplateNode templateNode, Map<String, Object> map) {
            Object[] objArr = {templateNode, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d602f4156822c8b0a054cabf9df5cb27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d602f4156822c8b0a054cabf9df5cb27");
            } else if (TextUtils.isEmpty(templateNode.dynamicStyle)) {
            } else {
                Object a2 = a(":style", templateNode.dynamicStyle, map);
                if (a2 instanceof Map) {
                    try {
                        Map<String, Object> map2 = (Map) a2;
                        a(map2, map);
                        if (map2.isEmpty()) {
                            return;
                        }
                        templateNode.style.putAll(map2);
                    } catch (Exception unused) {
                        com.sankuai.waimai.mach.log.b.b(com.sankuai.waimai.mach.log.b.b, "dynamicStyle Error", new Object[0]);
                    }
                }
            }
        }

        private boolean b(TemplateNode templateNode, Map<String, Object> map) {
            Object[] objArr = {templateNode, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e2f1d9ebcfb296e906d7ee22fb4bd3c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e2f1d9ebcfb296e906d7ee22fb4bd3c")).booleanValue();
            }
            if ("if".equals(templateNode.tag)) {
                c(templateNode, map);
                return true;
            } else if ("for".equals(templateNode.tag)) {
                d(templateNode, map);
                return true;
            } else {
                return false;
            }
        }

        private void c(TemplateNode templateNode, Map<String, Object> map) {
            TemplateNode templateNode2;
            Object[] objArr = {templateNode, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b163c5144fcb7b06662df1e352785a70", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b163c5144fcb7b06662df1e352785a70");
                return;
            }
            TemplateNode templateNode3 = templateNode.parent;
            if (templateNode3 == null) {
                return;
            }
            int a2 = templateNode3.a(templateNode);
            List<TemplateNode> list = templateNode.children;
            if (list == null || list.size() == 0) {
                return;
            }
            Iterator<TemplateNode> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    templateNode2 = null;
                    break;
                }
                templateNode2 = it.next();
                Boolean b = b("if", templateNode2.expr, map);
                if (b != null && b.booleanValue()) {
                    break;
                }
            }
            if (templateNode2 != null) {
                templateNode3.a(a2, templateNode2);
                a(templateNode2, templateNode3, map);
                return;
            }
            templateNode3.a(a2, null);
        }

        private void d(TemplateNode templateNode, Map<String, Object> map) {
            List<Map<String, Object>> a2;
            Object[] objArr = {templateNode, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9147455e28ec827bc10d6913907e7b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9147455e28ec827bc10d6913907e7b4");
                return;
            }
            List<TemplateNode> list = templateNode.children;
            TemplateNode templateNode2 = templateNode.parent;
            if (templateNode2 == null) {
                return;
            }
            int a3 = templateNode2.a(templateNode);
            if (list == null || list.size() == 0) {
                return;
            }
            String str = templateNode.expr;
            if (TextUtils.isEmpty(str) || (a2 = a(str, map)) == null) {
                return;
            }
            Iterator<Map<String, Object>> it = a2.iterator();
            while (it.hasNext()) {
                Map<String, Object> next = it.next();
                List<TemplateNode> list2 = templateNode.children;
                int i = a3;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    TemplateNode templateNode3 = new TemplateNode(list2.get(i2));
                    if (map != null) {
                        map.putAll(next);
                        next = map;
                    }
                    if (!TextUtils.isEmpty(templateNode3.mUUID)) {
                        e(templateNode3, next);
                        if (TextUtils.isEmpty(templateNode3.b)) {
                            templateNode3.mUUID += "#" + i;
                        }
                    }
                    if (i >= templateNode2.children.size()) {
                        templateNode2.b(templateNode3);
                    } else {
                        templateNode2.a(i, templateNode3);
                    }
                    a(templateNode3, templateNode2, next);
                    i++;
                }
                a3 = i;
            }
        }

        private void e(TemplateNode templateNode, Map<String, Object> map) {
            Object[] objArr = {templateNode, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "996c290455842aca569961e2aca0064a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "996c290455842aca569961e2aca0064a");
            } else if (templateNode.colonKey == null) {
            } else {
                Object a2 = a(":key", templateNode.colonKey, map);
                if (!(a2 instanceof Double)) {
                    if (!(a2 instanceof Integer)) {
                        if (!(a2 instanceof Long)) {
                            if (a2 instanceof String) {
                                templateNode.b = (String) a2;
                                return;
                            }
                            return;
                        }
                        templateNode.b = String.valueOf(((Long) a2).longValue());
                        return;
                    }
                    templateNode.b = String.valueOf(((Integer) a2).intValue());
                    return;
                }
                templateNode.b = String.valueOf((Double) a2);
            }
        }
    }
}
