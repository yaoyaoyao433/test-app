package com.meituan.android.legwork.monitor;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.bean.monitor.Node;
import com.meituan.android.legwork.bean.monitor.NodeLink;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private ConcurrentHashMap<String, Map<String, NodeLink>> b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d929fb317eb870a3974ec531f8e64d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d929fb317eb870a3974ec531f8e64d");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final e a = new e();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07745acf5b420ee03c8aac951c7a4ba7", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07745acf5b420ee03c8aac951c7a4ba7") : a.a;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82ad5ec18db9d481ba914946aad970fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82ad5ec18db9d481ba914946aad970fd");
        } else if (c()) {
        } else {
            try {
                ConcurrentHashMap<String, Map<String, NodeLink>> concurrentHashMap = (ConcurrentHashMap) com.meituan.android.legwork.net.util.b.a().fromJson(z.a(com.meituan.android.legwork.a.a()).b("node_monitor", ""), new TypeToken<ConcurrentHashMap<String, Map<String, NodeLink>>>() { // from class: com.meituan.android.legwork.monitor.e.1
                }.getType());
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap<>();
                }
                a(concurrentHashMap);
            } catch (Exception e) {
                x.e("NodeMonitorUtil", "new LinkMonitorUtil error,msg:" + e.getLocalizedMessage());
            }
        }
    }

    public final synchronized NodeLink a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c98727005466a29914bc0444923dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (NodeLink) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c98727005466a29914bc0444923dcf");
        } else if (c()) {
            return null;
        } else {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Map<String, NodeLink> map = this.b.get(str);
                if (map == null) {
                    map = new HashMap<>();
                    this.b.put(str, map);
                }
                NodeLink nodeLink = map.get(str2);
                if (nodeLink == null) {
                    nodeLink = new NodeLink(str, str2, str3);
                    map.put(str2, nodeLink);
                    z.a(com.meituan.android.legwork.a.a()).a("node_monitor", new Gson().toJson(this.b));
                }
                return nodeLink;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7 A[Catch: all -> 0x00da, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x002a, B:10:0x0036, B:14:0x003e, B:16:0x0044, B:19:0x004c, B:23:0x0058, B:27:0x0062, B:29:0x0066, B:30:0x006d, B:47:0x00a3, B:55:0x00bd, B:49:0x00a7, B:51:0x00ad, B:52:0x00b0, B:53:0x00b4, B:54:0x00b8, B:37:0x0084, B:40:0x008d, B:43:0x0098), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4 A[Catch: all -> 0x00da, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x002a, B:10:0x0036, B:14:0x003e, B:16:0x0044, B:19:0x004c, B:23:0x0058, B:27:0x0062, B:29:0x0066, B:30:0x006d, B:47:0x00a3, B:55:0x00bd, B:49:0x00a7, B:51:0x00ad, B:52:0x00b0, B:53:0x00b4, B:54:0x00b8, B:37:0x0084, B:40:0x008d, B:43:0x0098), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8 A[Catch: all -> 0x00da, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x002a, B:10:0x0036, B:14:0x003e, B:16:0x0044, B:19:0x004c, B:23:0x0058, B:27:0x0062, B:29:0x0066, B:30:0x006d, B:47:0x00a3, B:55:0x00bd, B:49:0x00a7, B:51:0x00ad, B:52:0x00b0, B:53:0x00b4, B:54:0x00b8, B:37:0x0084, B:40:0x008d, B:43:0x0098), top: B:63:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(java.lang.String r19, java.lang.String r20, com.meituan.android.legwork.bean.monitor.Node r21) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.monitor.e.a(java.lang.String, java.lang.String, com.meituan.android.legwork.bean.monitor.Node):boolean");
    }

    private void a(String str, Node node) {
        Object[] objArr = {str, node};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96eb93f8856fa864142c71dc0bd23880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96eb93f8856fa864142c71dc0bd23880");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("nodeName", node.nodeName);
        hashMap.put(Node.FILED_NODE_STATUS, node.nodeStatus);
        hashMap.put("errorCode", Integer.valueOf(node.errorCode));
        q.a(str, 1024, hashMap);
    }

    public final synchronized boolean b(String str, String str2, Node node) {
        Object[] objArr = {str, str2, node};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea264ec3046396b01faeb12214103b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea264ec3046396b01faeb12214103b6")).booleanValue();
        } else if (c()) {
            return false;
        } else {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Map<String, NodeLink> map = this.b.get(str);
                if (map == null) {
                    return false;
                }
                NodeLink nodeLink = map.get(str2);
                if (nodeLink != null && nodeLink.nodes != null && nodeLink.nodes.size() != 0) {
                    Node node2 = null;
                    int size = nodeLink.nodes.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            Node node3 = nodeLink.nodes.get(size);
                            if (node3 != null && TextUtils.equals(node3.nodeName, node.nodeName) && TextUtils.equals(node3.nodeType, node.nodeType)) {
                                node2 = node3;
                                break;
                            }
                            size--;
                        } else {
                            break;
                        }
                    }
                    if (node2 == null) {
                        return false;
                    }
                    node2.nodeStatus = node.nodeStatus;
                    node2.historyNodeStatus.add(node.nodeStatus);
                    node2.errorCode = node.errorCode;
                    node2.errorMsg = node.errorMsg;
                    z.a(com.meituan.android.legwork.a.a()).a("node_monitor", new Gson().toJson(this.b));
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024c73d5e3c50bc2d8214e70860d66ab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024c73d5e3c50bc2d8214e70860d66ab")).booleanValue() : !d.a();
    }

    private Node a(NodeLink nodeLink) {
        Node node;
        Object[] objArr = {nodeLink};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b91314d2530a2b6f43201895fd9342", RobustBitConfig.DEFAULT_VALUE)) {
            return (Node) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b91314d2530a2b6f43201895fd9342");
        }
        if (nodeLink == null || nodeLink.nodes == null || nodeLink.nodes.size() <= 0 || (node = nodeLink.nodes.get(nodeLink.nodes.size() - 1)) == null || !TextUtils.equals(node.nodeStatus, "2")) {
            return null;
        }
        if (node.historyNodeStatus != null) {
            for (String str : node.historyNodeStatus) {
                if (TextUtils.equals(str, "1")) {
                    return null;
                }
            }
        }
        return node;
    }

    private synchronized void a(ConcurrentHashMap<String, Map<String, NodeLink>> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad6002a227abca5f97bcfdc020b9484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad6002a227abca5f97bcfdc020b9484");
            return;
        }
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            Iterator<Map.Entry<String, Map<String, NodeLink>>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Map<String, NodeLink>> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    Map<String, NodeLink> value = next.getValue();
                    if (value != null && !value.isEmpty()) {
                        String key = next.getKey();
                        Iterator<Map.Entry<String, NodeLink>> it2 = value.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, NodeLink> next2 = it2.next();
                            if (next2 == null) {
                                it2.remove();
                            } else {
                                Node a2 = a(next2.getValue());
                                if (a2 != null) {
                                    a(key, a2);
                                }
                            }
                        }
                    }
                    it.remove();
                }
            }
            z.a(com.meituan.android.legwork.a.a()).a("node_monitor", "");
        }
    }
}
