package com.dianping.shield.node.adapter;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.dianping.agentsdk.framework.f;
import com.dianping.shield.agent.LightAgent;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.monitor.ShieldGAInterface;
import com.dianping.shield.monitor.ShieldMonitorUtil;
import com.dianping.shield.node.adapter.AttachStatusManager;
import com.dianping.shield.node.adapter.status.ElementStatusEventListener;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class VerticalAttachStatusManager extends AttachStatusManager<ShieldDisplayNode> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<ShieldViewCell> cells;

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public VerticalAttachStatusManager(ViewLocationRectInterface viewLocationRectInterface) {
        super(viewLocationRectInterface);
        Object[] objArr = {viewLocationRectInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be4477961d5f120d7c04e31c89fc769d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be4477961d5f120d7c04e31c89fc769d");
        } else {
            initAppearanceInterceptor();
        }
    }

    public void dispatchDestoryAgentStatus(ArrayList<ShieldViewCell> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "505ca86789974664799363adb8b54026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "505ca86789974664799363adb8b54026");
            return;
        }
        this.cells = arrayList;
        if (this.statusHashMap == null || this.statusHashMap.size() == 0 || this.positionHashMap == null || this.positionHashMap.size() == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ShieldDisplayNode shieldDisplayNode : this.statusHashMap.keySet()) {
            if (needCheckNodeRemoved(shieldDisplayNode) && this.statusHashMap.get(shieldDisplayNode) != AttachStatus.DETACHED) {
                arrayList2.add(shieldDisplayNode);
                if (this.targetDispatchers != null && !this.targetDispatchers.isEmpty()) {
                    Iterator it = this.targetDispatchers.iterator();
                    while (it.hasNext()) {
                        ((ElementStatusEventListener) it.next()).onElementStatusChanged(new AppearanceDispatchData(this.positionHashMap.get(shieldDisplayNode).intValue(), shieldDisplayNode, this.statusHashMap.get(shieldDisplayNode), AttachStatus.DETACHED, ScrollDirection.OUT_STATIC, null));
                    }
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ShieldDisplayNode shieldDisplayNode2 = (ShieldDisplayNode) it2.next();
            this.statusHashMap.remove(shieldDisplayNode2);
            this.positionHashMap.remove(shieldDisplayNode2);
        }
    }

    private void initAppearanceInterceptor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db8bdaf4ed15e066ab6a3f77015ca784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db8bdaf4ed15e066ab6a3f77015ca784");
        } else {
            getAppearanceComputeInterceptorRules().add(new b<AttachStatusManager.AppearanceComputeInterceptorRulesBean<ShieldDisplayNode>, Boolean>() { // from class: com.dianping.shield.node.adapter.VerticalAttachStatusManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // kotlin.jvm.functions.b
                public Boolean invoke(AttachStatusManager.AppearanceComputeInterceptorRulesBean<ShieldDisplayNode> appearanceComputeInterceptorRulesBean) {
                    boolean z = true;
                    Object[] objArr2 = {appearanceComputeInterceptorRulesBean};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4b0ab3bf57817202ba2545e194b3322e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4b0ab3bf57817202ba2545e194b3322e");
                    }
                    return Boolean.valueOf(((appearanceComputeInterceptorRulesBean.getElement().rowParent != null ? appearanceComputeInterceptorRulesBean.getElement().rowParent.getExposeComputeMode() : null) != f.a.IgnoreScrolling || appearanceComputeInterceptorRulesBean.getScrollDirection() == ScrollDirection.STATIC) ? false : false);
                }
            });
        }
    }

    private boolean needCheckNodeRemoved(ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5658138d99ab29b0d080c26302f9b48f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5658138d99ab29b0d080c26302f9b48f")).booleanValue();
        }
        ShieldViewCell shieldViewCell = null;
        if (shieldDisplayNode.rowParent != null && shieldDisplayNode.rowParent.sectionParent != null) {
            shieldViewCell = shieldDisplayNode.rowParent.sectionParent.cellParent;
        }
        Iterator<ShieldViewCell> it = this.cells.iterator();
        while (it.hasNext()) {
            if (it.next().equals(shieldViewCell)) {
                return true;
            }
        }
        return false;
    }

    private List<String> getCurrentAgentList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07ddf81ec437b0ee0f5357a14940e116", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07ddf81ec437b0ee0f5357a14940e116");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            parseShieldNodeArray(getDisplayElementList(this.firstLastPositionInfo.completelyVisibleItemPositions), arrayList);
            parseShieldNodeArray(getDisplayElementList(this.firstLastPositionInfo.firstVisibleItemPositions), arrayList);
            parseShieldNodeArray(getDisplayElementList(this.firstLastPositionInfo.lastVisibleItemPositions), arrayList);
            return arrayList;
        }
        return arrayList;
    }

    private void parseShieldNodeArray(SparseArray<Pair<ShieldDisplayNode, ViewExtraInfo>> sparseArray, ArrayList<String> arrayList) {
        Object[] objArr = {sparseArray, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b1d22a39c1fed8ad68cf8026040d03c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b1d22a39c1fed8ad68cf8026040d03c");
        } else if (sparseArray != null && sparseArray.size() > 0) {
            for (int i = 0; i < sparseArray.size(); i++) {
                String moduleKeyForFMP = getModuleKeyForFMP((ShieldDisplayNode) sparseArray.valueAt(i).first);
                if (!TextUtils.isEmpty(moduleKeyForFMP) && !arrayList.contains(moduleKeyForFMP)) {
                    arrayList.add(moduleKeyForFMP);
                }
            }
        }
    }

    private String getModuleKeyForFMP(ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5959d427077228b29d4ff4d0f60a963c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5959d427077228b29d4ff4d0f60a963c");
        }
        if (shieldDisplayNode == null || shieldDisplayNode.rowParent == null || shieldDisplayNode.rowParent.sectionParent == null || shieldDisplayNode.rowParent.sectionParent.cellParent == null || !(shieldDisplayNode.rowParent.sectionParent.cellParent.owner instanceof ShieldGAInterface)) {
            return "";
        }
        String str = "";
        if ((shieldDisplayNode.rowParent.sectionParent.cellParent.owner instanceof LightAgent) && (((LightAgent) shieldDisplayNode.rowParent.sectionParent.cellParent.owner).getHostFragment() instanceof ShieldGAInterface)) {
            str = ((ShieldGAInterface) ((LightAgent) shieldDisplayNode.rowParent.sectionParent.cellParent.owner).getHostFragment()).getShieldGAInfo().getBusiness();
        }
        return ShieldMonitorUtil.getModuleKey(str, ((ShieldGAInterface) shieldDisplayNode.rowParent.sectionParent.cellParent.owner).getShieldGAInfo().getBusiness(), "");
    }

    @Override // com.dianping.shield.node.adapter.AttachStatusManager, com.dianping.shield.node.adapter.ViewLocationChangeProcessor, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6493752a5b593aa14933292afc4bf4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6493752a5b593aa14933292afc4bf4e7");
            return;
        }
        super.shieldRecycle();
        if (this.cells != null) {
            this.cells.clear();
        }
    }
}
