package com.sankuai.waimai.mach.node;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.TemplateNode;
import com.sankuai.waimai.mach.expose.b;
import com.sankuai.waimai.mach.parser.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class VirtualNode implements com.sankuai.waimai.mach.model.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, Object> attrs;
    private List<VirtualNode> children;
    private Map<String, Object> events;
    private b mMachExpose;
    private TemplateNode mTemplateNode;
    private Mach mach;
    private String machTag;
    private String nodeUUID;
    private VirtualNode parent;
    private Map<String, Object> style;

    public String getMachTag() {
        return this.machTag;
    }

    public TemplateNode getTemplateNode() {
        return this.mTemplateNode;
    }

    public b getMachExpose() {
        return this.mMachExpose;
    }

    public VirtualNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a15cc515019ec9a42ba485582e5f80f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a15cc515019ec9a42ba485582e5f80f");
            return;
        }
        this.mMachExpose = new b();
        this.children = new ArrayList();
    }

    public Mach getMach() {
        return this.mach;
    }

    public void setNodeUUID(String str) {
        this.nodeUUID = str;
    }

    public String getNodeUUID() {
        return this.nodeUUID;
    }

    public List<VirtualNode> getChildren() {
        return this.children;
    }

    public Map<String, Object> getAttrs() {
        return this.attrs;
    }

    public Map<String, Object> getStyle() {
        return this.style;
    }

    public Map<String, Object> getEvents() {
        return this.events;
    }

    public boolean hasViewLxReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07f38795735099c4c108b5a263b98506", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07f38795735099c4c108b5a263b98506")).booleanValue() : (getViewLxReport() != null && getViewLxReport().size() > 0) || getViewLxReportJSFunction() != null;
    }

    public Map<String, Object> getViewLxReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "756dd1284df332bc449c98c2cdf1c813", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "756dd1284df332bc449c98c2cdf1c813") : this.mMachExpose.m;
    }

    public Map<String, Object> getViewShReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70ce8ae11dc78dd393873c951bd6bb0", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70ce8ae11dc78dd393873c951bd6bb0") : this.mMachExpose.o;
    }

    public d getViewLxReportJSFunction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59a19d80851c8500af66738d63d085ef", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59a19d80851c8500af66738d63d085ef") : this.mMachExpose.k;
    }

    public d getViewShReportJSFunction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5cf46213007fed1e9facb39c46e21aa", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5cf46213007fed1e9facb39c46e21aa") : this.mMachExpose.l;
    }

    public boolean hasChildren() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4055ea3f7ae2289d00521bce998bf84", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4055ea3f7ae2289d00521bce998bf84")).booleanValue() : getChildren() != null && getChildren().size() > 0;
    }

    @Override // com.sankuai.waimai.mach.model.a
    public void onBind(TemplateNode templateNode) {
        char c;
        Object[] objArr = {templateNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "220978fb783391e96cb1e523b35e37a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "220978fb783391e96cb1e523b35e37a3");
            return;
        }
        this.mTemplateNode = templateNode;
        this.machTag = templateNode.tag;
        this.attrs = templateNode.attrs;
        this.events = templateNode.events;
        this.style = templateNode.style;
        b bVar = this.mMachExpose;
        Object[] objArr2 = {templateNode};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "25cbf1e683674f75aa3a60c6e8738782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "25cbf1e683674f75aa3a60c6e8738782");
        } else if (templateNode != null && templateNode.events != null && !templateNode.events.isEmpty()) {
            try {
                for (Map.Entry<String, Object> entry : templateNode.events.entrySet()) {
                    Object[] objArr3 = {entry};
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "cf3661a66cf2b27bc3f47fba05c43871", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "cf3661a66cf2b27bc3f47fba05c43871");
                    } else {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            switch (key.hashCode()) {
                                case -1758154318:
                                    if (key.equals("long-press")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1157402032:
                                    if (key.equals("@click-lx-report")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -798924302:
                                    if (key.equals("@long-press")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -690060024:
                                    if (key.equals("@touch-cancel")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -430426713:
                                    if (key.equals("click-sh-report")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -363724883:
                                    if (key.equals("@view-lx-report")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 54766212:
                                    if (key.equals("view-sh-report")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 94750088:
                                    if (key.equals("click")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 270165012:
                                    if (key.equals("@touch-start")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 670657805:
                                    if (key.equals("@touch-end")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1255124327:
                                    if (key.equals("@click-sh-report")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1452014224:
                                    if (key.equals("click-lx-report")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1927015752:
                                    if (key.equals("@click")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1937207149:
                                    if (key.equals("view-lx-report")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2048801476:
                                    if (key.equals("@view-sh-report")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    bVar.b = value.toString();
                                    continue;
                                case 1:
                                    if (value instanceof d) {
                                        bVar.c = (d) value;
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 2:
                                    bVar.d = value.toString();
                                    continue;
                                case 3:
                                    if (value instanceof d) {
                                        bVar.e = (d) value;
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 4:
                                    if (value instanceof d) {
                                        bVar.f = (d) value;
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 5:
                                    if (value instanceof d) {
                                        bVar.g = (d) value;
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 6:
                                    if (value instanceof d) {
                                        bVar.h = (d) value;
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 7:
                                    bVar.m = (Map) value;
                                    continue;
                                case '\b':
                                    if (value instanceof d) {
                                        bVar.k = (d) value;
                                        break;
                                    } else {
                                        continue;
                                    }
                                case '\t':
                                    bVar.o = (Map) value;
                                    continue;
                                case '\n':
                                    if (value instanceof d) {
                                        bVar.l = (d) value;
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 11:
                                    bVar.n = (Map) value;
                                    continue;
                                case '\f':
                                    if (value instanceof d) {
                                        bVar.i = (d) value;
                                        break;
                                    } else {
                                        continue;
                                    }
                                case '\r':
                                    bVar.p = (Map) value;
                                    continue;
                                case 14:
                                    if (value instanceof d) {
                                        bVar.j = (d) value;
                                        break;
                                    } else {
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public void setMach(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b78313f92d7783b29be71d22243306ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b78313f92d7783b29be71d22243306ec");
            return;
        }
        this.mach = mach;
        if (this.children.size() > 0) {
            for (VirtualNode virtualNode : this.children) {
                virtualNode.setMach(mach);
            }
        }
    }

    public void setParent(VirtualNode virtualNode) {
        this.parent = virtualNode;
    }

    public VirtualNode getParent() {
        return this.parent;
    }

    public void addChild(VirtualNode virtualNode) {
        Object[] objArr = {virtualNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c102261fca8145f5e8d9031580649e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c102261fca8145f5e8d9031580649e1");
        } else {
            addChildAt(virtualNode, -1);
        }
    }

    public void addChildAt(VirtualNode virtualNode, int i) {
        Object[] objArr = {virtualNode, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10a4cc870c7dfb86ccc5849241cb5552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10a4cc870c7dfb86ccc5849241cb5552");
            return;
        }
        if (i == -1) {
            i = this.children.size();
        }
        this.children.add(i, virtualNode);
        virtualNode.setParent(this);
    }

    public int getMaxDepth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c47424c2ab95c68c7156d9f1efdee07f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c47424c2ab95c68c7156d9f1efdee07f")).intValue() : maxDepth(this);
    }

    private int maxDepth(VirtualNode virtualNode) {
        Object[] objArr = {virtualNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23c54d634e3631a0ed49ad28c998a524", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23c54d634e3631a0ed49ad28c998a524")).intValue();
        }
        if (virtualNode == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < virtualNode.children.size(); i2++) {
            i = Math.max(i, maxDepth(virtualNode.children.get(i2)));
        }
        return i + 1;
    }
}
