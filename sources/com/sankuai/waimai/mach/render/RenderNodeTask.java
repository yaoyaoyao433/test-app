package com.sankuai.waimai.mach.render;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ASTTemplate;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.MachMetaData;
import com.sankuai.waimai.mach.h;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import com.sankuai.waimai.mach.model.value.i;
import com.sankuai.waimai.mach.node.VirtualNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RenderNodeTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int height;
    private AtomicBoolean isCancelled;
    private Mach mMach;
    private com.sankuai.waimai.mach.model.data.a mRecord;
    private final h progressListener;
    private final int width;

    static {
        try {
            Class.forName(MachMetaData.class.getName());
            Class.forName(i.class.getName());
        } catch (Exception e) {
            com.sankuai.waimai.mach.log.b.b("RenderNodeTask", "初始化类失败" + e.getMessage());
        }
    }

    public RenderNodeTask(Mach mach, int i, int i2, com.sankuai.waimai.mach.model.data.a aVar, h hVar) {
        Object[] objArr = {mach, Integer.valueOf(i), Integer.valueOf(i2), aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2686eab1186f4f56834fdc346ea5f79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2686eab1186f4f56834fdc346ea5f79");
            return;
        }
        this.isCancelled = new AtomicBoolean(false);
        this.mMach = mach;
        this.width = i;
        this.height = i2;
        this.mRecord = aVar;
        this.progressListener = hVar;
    }

    public AtomicBoolean getIsCancelled() {
        return this.isCancelled;
    }

    public com.sankuai.waimai.mach.node.a createRenderNode(Map<String, Object> map, @Nullable Map<String, Object> map2) {
        com.sankuai.waimai.mach.common.d dataProcessor;
        com.sankuai.waimai.mach.parser.c templateParser;
        int i;
        com.sankuai.waimai.mach.exception.a aVar;
        ASTTemplate aSTTemplate;
        String str;
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd60d74770c6ec9d9a0b39744d2f9ef5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd60d74770c6ec9d9a0b39744d2f9ef5");
        }
        e machBundle = this.mMach.getMachBundle();
        if (machBundle == null || (dataProcessor = this.mMach.getDataProcessor()) == null || (templateParser = this.mMach.getTemplateParser()) == null || this.isCancelled.get()) {
            return null;
        }
        if (machBundle.k == null || map == null) {
            d.a(this.mMach, 5, new NullPointerException("template or data is null"));
            return null;
        }
        try {
            com.sankuai.waimai.mach.model.data.a aVar2 = this.mRecord;
            Object[] objArr2 = {machBundle, map2, aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.common.d.a;
            if (PatchProxy.isSupport(objArr2, dataProcessor, changeQuickRedirect3, false, "249be119bdca7184a714e1768b71a326", RobustBitConfig.DEFAULT_VALUE)) {
                aSTTemplate = (ASTTemplate) PatchProxy.accessDispatch(objArr2, dataProcessor, changeQuickRedirect3, false, "249be119bdca7184a714e1768b71a326");
            } else {
                com.sankuai.waimai.mach.log.b.a("MachTemplate", "template start parse " + machBundle.j);
                if (dataProcessor.b.containsKey(machBundle.j)) {
                    aSTTemplate = dataProcessor.b.get(machBundle.j);
                } else {
                    MonitorManager.RECORD_STEP(aVar2, "templateParser_start");
                    ASTTemplate aSTTemplate2 = (ASTTemplate) com.sankuai.waimai.mach.utils.b.a().fromJson(machBundle.k, (Class<Object>) ASTTemplate.class);
                    dataProcessor.b.put(machBundle.j, aSTTemplate2);
                    MonitorManager.RECORD_STEP(aVar2, "templateParser_end");
                    aSTTemplate = aSTTemplate2;
                }
                com.sankuai.waimai.mach.log.b.a("MachTemplate", "template parse succeed " + machBundle.j);
            }
            if (this.isCancelled.get()) {
                return null;
            }
            com.sankuai.waimai.mach.log.b.a("MachFillData", "fillData start " + machBundle.j);
            MonitorManager.RECORD_STEP(this.mRecord, "dataFillerV3_start");
            VirtualNode a2 = templateParser.a(aSTTemplate, map, mergeValueMap(aSTTemplate, map2), this.mMach.getEnvParamsMap());
            MonitorManager.RECORD_STEP(this.mRecord, "dataFillerV3_end");
            com.sankuai.waimai.mach.log.b.a("MachFillData", "fillData end " + machBundle.j);
            if (a2 == null) {
                d.a(this.mMach, 1, new NullPointerException("VirtualNode is null"));
                return null;
            } else if (this.isCancelled.get()) {
                return null;
            } else {
                a2.setMach(this.mMach);
                if (m.c()) {
                    MonitorManager.RECORD_STEP(this.mRecord, "createRNode_Opt_start");
                } else {
                    MonitorManager.RECORD_STEP(this.mRecord, "createRNode_start");
                }
                com.sankuai.waimai.mach.node.a a3 = this.mMach.getRenderEngine().a(a2);
                MonitorManager.RECORD_STEP(this.mRecord, "createRNode_end");
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = e.i;
                if (PatchProxy.isSupport(objArr3, machBundle, changeQuickRedirect4, false, "f83a874fe80b8bba30153fe37ee6cf12", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr3, machBundle, changeQuickRedirect4, false, "f83a874fe80b8bba30153fe37ee6cf12");
                } else {
                    str = "";
                    if (machBundle.q != null) {
                        str = machBundle.q.d;
                    }
                }
                a3.a(str);
                Object[] objArr4 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.mach.node.a.a;
                if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect5, false, "b05170838afac24219e020dceda2979f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect5, false, "b05170838afac24219e020dceda2979f");
                } else {
                    a3.c().y = true;
                }
                com.sankuai.waimai.mach.log.b.a("MachRender", "render build render node tree ");
                MonitorManager.RECORD_STEP(this.mRecord, "yogaLayout_start");
                this.mMach.getRenderEngine().a(new a(a3), this.width, this.height);
                MonitorManager.RECORD_STEP(this.mRecord, "yogaLayout_end");
                com.sankuai.waimai.mach.log.b.a("MachRender", "render yoga layout succeed ");
                if (this.isCancelled.get()) {
                    return null;
                }
                optimizeRenderNodeTreeHierarchy(a3);
                return a3;
            }
        } catch (com.sankuai.waimai.mach.exception.a e) {
            int i2 = e.a;
            if (e.a == 1) {
                com.sankuai.waimai.mach.log.b.b("MachTemplate", "template parse error templates:" + machBundle.k, "templateID:" + machBundle.j, "errorMessage:" + e.toString());
            }
            i = i2;
            aVar = e;
            d.a(this.mMach, i, aVar);
            return null;
        } catch (Exception e2) {
            i = -1;
            aVar = e2;
            d.a(this.mMach, i, aVar);
            return null;
        }
    }

    private Map<String, Object> mergeValueMap(ASTTemplate aSTTemplate, Map<String, Object> map) {
        Object[] objArr = {aSTTemplate, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e53e1f94b45d0570f16c5259a77433c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e53e1f94b45d0570f16c5259a77433c3");
        }
        HashMap hashMap = new HashMap();
        if (aSTTemplate != null && aSTTemplate.script != null && (aSTTemplate.script.get("value") instanceof Map)) {
            hashMap.putAll((Map) aSTTemplate.script.get("value"));
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        HashMap hashMap2 = new HashMap();
        if (hashMap.size() > 0) {
            hashMap2.put("value", hashMap);
        }
        return hashMap2;
    }

    private List<com.sankuai.waimai.mach.node.a> removeLayoutNodeInTree(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbdcc03bb4a924f2eede9b165fd39048", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbdcc03bb4a924f2eede9b165fd39048");
        }
        if (aVar == null) {
            return new ArrayList();
        }
        if (aVar.j()) {
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
            for (com.sankuai.waimai.mach.node.a aVar2 : b) {
                if (aVar2 instanceof com.sankuai.waimai.mach.node.a) {
                    arrayList.addAll(removeLayoutNodeInTree(aVar2));
                }
            }
            aVar.b().clear();
            for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                if (aVar3 != null) {
                    aVar.b().add(aVar3);
                    aVar3.e = aVar;
                }
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.node.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "3eaf9e26cbd1e4b9dde13a02de1702ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "3eaf9e26cbd1e4b9dde13a02de1702ac");
        } else {
            aVar.l = aVar.c.q();
            aVar.k = true;
            aVar.n = aVar.c.r();
            aVar.m = true;
        }
        if (aVar.h instanceof com.sankuai.waimai.mach.component.d) {
            List<com.sankuai.waimai.mach.node.a> b2 = aVar.b();
            for (com.sankuai.waimai.mach.node.a aVar4 : b2) {
                if (aVar4 instanceof com.sankuai.waimai.mach.node.a) {
                    com.sankuai.waimai.mach.node.a aVar5 = aVar4;
                    aVar5.l = aVar5.d() + aVar.d();
                    aVar5.k = true;
                    aVar5.n = aVar5.e() + aVar.e();
                    aVar5.m = true;
                }
            }
            return b2;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(aVar);
        return arrayList2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.sankuai.waimai.mach.model.b {
        public static ChangeQuickRedirect a;
        @NonNull
        public com.sankuai.waimai.mach.node.a b;

        private a(@NonNull com.sankuai.waimai.mach.node.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0585c7c47e0d26432038818f913553f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0585c7c47e0d26432038818f913553f");
            } else {
                this.b = aVar;
            }
        }

        @Override // com.sankuai.waimai.mach.model.b
        public final void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc6bcdf9ca4662de672d3218bc93204", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc6bcdf9ca4662de672d3218bc93204");
                return;
            }
            com.facebook.yoga.d dVar = this.b.c;
            if (dVar != null) {
                dVar.a(i == 0 ? Float.NaN : i, i2 != 0 ? i2 : Float.NaN);
            }
            this.b.f();
        }
    }

    private void optimizeRenderNodeTreeHierarchy(com.sankuai.waimai.mach.node.a aVar) throws com.sankuai.waimai.mach.exception.a {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fd5ed0f7bf3c88b8ff5acc64a2bf039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fd5ed0f7bf3c88b8ff5acc64a2bf039");
        } else if (aVar == null) {
            throw new com.sankuai.waimai.mach.exception.a("optimize RenderNode tree error : root is null", 7);
        } else {
            if (aVar.h == null) {
                throw new com.sankuai.waimai.mach.exception.a("optimize RenderNode tree error: root.component is null", 7);
            }
            if (aVar.h instanceof com.sankuai.waimai.mach.component.d) {
                throw new com.sankuai.waimai.mach.exception.a("optimize RenderNode tree error: root node is \"layout\" node", 7);
            }
            if (aVar.j()) {
                removeLayoutNodeInTree(aVar);
            }
        }
    }
}
