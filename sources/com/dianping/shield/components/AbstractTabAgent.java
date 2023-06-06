package com.dianping.shield.components;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.v;
import com.dianping.agentsdk.manager.b;
import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.widgets.container.IPageContainerFunc;
import com.dianping.shield.components.model.AbsTabModel;
import com.dianping.shield.consts.ShieldConst;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.feature.HotZoneObserverInterface;
import com.dianping.shield.feature.HotZoneStatusInterface;
import com.dianping.shield.layoutmanager.TopLinearLayoutManager;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.dianping.shield.node.adapter.hotzone.AgentHotZoneInfo;
import com.dianping.shield.node.useritem.HoverState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class AbstractTabAgent extends HoloAgent implements HotZoneObserverInterface, HotZoneStatusInterface {
    public static final int INITIAL_INDEX = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<AbsTabModel, ArrayList<String>> agentShowMap;
    private int autoOffset;
    private boolean disableAutoScroll;
    private RecyclerView.k fixScrollListener;
    private boolean hasScrollToFirst;
    protected HotZoneYRange hotZoneStatusYRange;
    protected HotZoneYRange hotZoneYRange;
    protected int hoverOffset;
    private HoverState hoverState;
    private boolean isTabInHotZoneVisable;
    protected int minTabCount;
    protected boolean needAutoOffset;
    private OnTabHoverEndListener onTabHoverEndListener;
    private int scrollIndex;
    private int selectedIndex;
    private ArrayList<String> tabAgentsOrder;
    private ArrayList<AbsTabModel> tabModels;
    private HashMap<AbsTabModel, ArrayList<String>> tabRelatedMap;
    public ArrayList<AbsTabModel> tabStrArray;
    private ArrayList<k> tabSubList;
    private AbstractTabInterface tabWidgets;
    private TopLinearLayoutManager.TopState topState;
    private ArrayList<String> visibleAgentList;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnTabHoverEndListener {
        void onTabHoverEnd(HoverState hoverState);
    }

    public AbstractTabAgent(Fragment fragment, v vVar, ab abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c2d512f01bd5f6f04954b612d2d7920", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c2d512f01bd5f6f04954b612d2d7920");
            return;
        }
        this.tabStrArray = new ArrayList<>();
        this.hotZoneYRange = new HotZoneYRange(0, 0);
        this.hotZoneStatusYRange = new HotZoneYRange(0, 0);
        this.minTabCount = 2;
        this.tabAgentsOrder = new ArrayList<>();
        this.tabModels = new ArrayList<>();
        this.selectedIndex = 0;
        this.scrollIndex = -1;
        this.autoOffset = 0;
        this.hoverOffset = 0;
        this.agentShowMap = new HashMap<>();
        this.tabRelatedMap = new HashMap<>();
        this.tabSubList = new ArrayList<>();
        this.visibleAgentList = new ArrayList<>();
        this.isTabInHotZoneVisable = false;
    }

    public void setTabWidgets(AbstractTabInterface abstractTabInterface) {
        Object[] objArr = {abstractTabInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea00072260ab05d9a60f9b7f8f523068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea00072260ab05d9a60f9b7f8f523068");
            return;
        }
        this.tabWidgets = abstractTabInterface;
        this.tabWidgets.setVisibility(8);
    }

    public void setHotZoneYRange(HotZoneYRange hotZoneYRange) {
        this.hotZoneYRange = hotZoneYRange;
    }

    public void setHotZoneStatusYRange(HotZoneYRange hotZoneYRange) {
        this.hotZoneStatusYRange = hotZoneYRange;
    }

    public void setNeedAutoOffset(boolean z) {
        this.needAutoOffset = z;
    }

    public void setHoverOffset(int i) {
        this.hoverOffset = i;
    }

    public void setAutoOffset(int i) {
        this.autoOffset = i;
    }

    public void setTabModels(ArrayList<AbsTabModel> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85fc32fa0f7ebd786415e974f7559c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85fc32fa0f7ebd786415e974f7559c0b");
        } else if (arrayList == null) {
        } else {
            this.tabModels = arrayList;
            this.tabAgentsOrder.clear();
            Iterator<AbsTabModel> it = arrayList.iterator();
            while (it.hasNext()) {
                this.tabAgentsOrder.addAll(it.next().agentKeys);
            }
        }
    }

    public void setMinTabCount(int i) {
        this.minTabCount = i;
    }

    public void setTopState(TopLinearLayoutManager.TopState topState) {
        this.topState = topState;
    }

    public void setTopState(HoverState hoverState) {
        this.hoverState = hoverState;
    }

    public void setTabHoverEndListener(OnTabHoverEndListener onTabHoverEndListener) {
        this.onTabHoverEndListener = onTabHoverEndListener;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d8a0fc7a49c18a572758cc67b22d3e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d8a0fc7a49c18a572758cc67b22d3e8");
            return;
        }
        super.onCreate(bundle);
        registerAgentsObs();
        if (this.pageContainer instanceof IPageContainerFunc) {
            this.fixScrollListener = new RecyclerView.k() { // from class: com.dianping.shield.components.AbstractTabAgent.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.support.v7.widget.RecyclerView.k
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f6b065d1f68b497c1dbdf4f12ec98cb7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f6b065d1f68b497c1dbdf4f12ec98cb7");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 1 && AbstractTabAgent.this.scrollIndex != AbstractTabAgent.this.selectedIndex && AbstractTabAgent.this.tabWidgets != null) {
                        AbstractTabAgent.this.tabWidgets.setSelected(AbstractTabAgent.this.selectedIndex, g.AUTO);
                    }
                    if (i == 1) {
                        AbstractTabAgent.this.disableAutoScroll = false;
                        AbstractTabAgent.this.hasScrollToFirst = false;
                        return;
                    }
                    AbstractTabAgent.this.disableAutoScroll = AbstractTabAgent.this.hasScrollToFirst;
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "784eb8b8af2d259f56b0317cb4248ca0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "784eb8b8af2d259f56b0317cb4248ca0");
                    } else {
                        super.onScrolled(recyclerView, i, i2);
                    }
                }
            };
            ((IPageContainerFunc) this.pageContainer).addScrollListener(this.fixScrollListener);
        }
    }

    public void setTabs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45336b14cc5c64afdcf19f938b362a9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45336b14cc5c64afdcf19f938b362a9d");
            return;
        }
        sortArray(this.tabStrArray);
        if (this.tabWidgets == null) {
            return;
        }
        if (shouldShowTabs()) {
            String[] strArr = new String[this.tabStrArray.size()];
            for (int i = 0; i < this.tabStrArray.size(); i++) {
                strArr[i] = this.tabStrArray.get(i).key;
            }
            this.tabWidgets.setTabs(strArr);
            this.tabWidgets.setVisibility(0);
            return;
        }
        this.tabWidgets.setVisibility(8);
    }

    private void sortArray(ArrayList arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb3b3e26bb3bc35d87749f05517c7e69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb3b3e26bb3bc35d87749f05517c7e69");
        } else {
            Collections.sort(arrayList, new Comparator<AbsTabModel>() { // from class: com.dianping.shield.components.AbstractTabAgent.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                public int compare(AbsTabModel absTabModel, AbsTabModel absTabModel2) {
                    Object[] objArr2 = {absTabModel, absTabModel2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "76645f6c91f040511413aaaacd3c3324", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "76645f6c91f040511413aaaacd3c3324")).intValue() : AbstractTabAgent.this.tabModels.indexOf(absTabModel) > AbstractTabAgent.this.tabModels.indexOf(absTabModel2) ? 1 : -1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sortShowList(ArrayList arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7a762930f86de5f8ac4352f8efd0b27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7a762930f86de5f8ac4352f8efd0b27");
        } else {
            Collections.sort(arrayList, new Comparator<String>() { // from class: com.dianping.shield.components.AbstractTabAgent.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                public int compare(String str, String str2) {
                    Object[] objArr2 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "530f4e50235e6b2f08eda81970a6eec7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "530f4e50235e6b2f08eda81970a6eec7")).intValue() : AbstractTabAgent.this.tabAgentsOrder.indexOf(str) > AbstractTabAgent.this.tabAgentsOrder.indexOf(str2) ? 1 : -1;
                }
            });
        }
    }

    public void startObserver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fd7338aaee2018d58620f788a7e9d49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fd7338aaee2018d58620f788a7e9d49");
            return;
        }
        if (getHostCellManager() instanceof b) {
            ((b) getHostCellManager()).a(this, getHostName());
        }
        if (getHostCellManager() instanceof ShieldNodeCellManager) {
            ((ShieldNodeCellManager) getHostCellManager()).addHotZoneStatusObserver(this, getHostName(), true, true);
        }
    }

    public void stopObserver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bee6ecb867016151282c413f9cf7c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bee6ecb867016151282c413f9cf7c3b");
            return;
        }
        if (getHostCellManager() instanceof b) {
            ((b) getHostCellManager()).a((HotZoneObserverInterface) this);
        }
        if (getHostCellManager() instanceof ShieldNodeCellManager) {
            ((ShieldNodeCellManager) getHostCellManager()).removeHotZoneStatusObserver(this);
        }
    }

    public boolean isTabVisable() {
        return this.isTabInHotZoneVisable;
    }

    @Override // com.dianping.shield.feature.HotZoneObserverInterface
    public HotZoneYRange defineHotZone() {
        return this.hotZoneYRange;
    }

    @Override // com.dianping.shield.feature.HotZoneStatusInterface
    public HotZoneYRange defineStatusHotZone() {
        return this.hotZoneStatusYRange;
    }

    @Override // com.dianping.shield.feature.HotZoneObserverInterface, com.dianping.shield.feature.HotZoneStatusInterface
    public Set<String> observerAgents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c256af4503776a7f3accfe75258cd79", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c256af4503776a7f3accfe75258cd79");
        }
        HashSet hashSet = new HashSet();
        Iterator<AbsTabModel> it = this.tabModels.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().agentKeys);
        }
        return hashSet;
    }

    @Override // com.dianping.shield.feature.HotZoneObserverInterface
    public void scrollReach(String str, ScrollDirection scrollDirection) {
        Object[] objArr = {str, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fdc39853684583338a60a27b4a77707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fdc39853684583338a60a27b4a77707");
            return;
        }
        for (int i = 0; i < this.tabStrArray.size(); i++) {
            ArrayList<String> arrayList = this.agentShowMap.get(this.tabStrArray.get(i));
            if ((scrollDirection == ScrollDirection.UP || scrollDirection == ScrollDirection.STATIC) && arrayList.get(0).equals(getAgentInnerName(str)) && (scrollDirection != ScrollDirection.STATIC || i == this.scrollIndex)) {
                setTabSelectIndex(i);
                if (this.scrollIndex != -1) {
                    this.scrollIndex = -1;
                }
            }
            if (i == this.tabStrArray.size() - 1 && scrollDirection == ScrollDirection.DOWN && arrayList.get(arrayList.size() - 1).equals(getAgentInnerName(str)) && this.tabStrArray.size() >= this.minTabCount) {
                this.tabWidgets.setVisibility(0);
            }
        }
    }

    @Override // com.dianping.shield.feature.HotZoneObserverInterface
    public void scrollOut(String str, ScrollDirection scrollDirection) {
        Object[] objArr = {str, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cb34d356f59f245896ca6294d26752d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cb34d356f59f245896ca6294d26752d");
            return;
        }
        for (int i = 0; i < this.tabStrArray.size(); i++) {
            ArrayList<String> arrayList = this.agentShowMap.get(this.tabStrArray.get(i));
            if (scrollDirection == ScrollDirection.DOWN && i != 0 && arrayList.get(0).equals(getAgentInnerName(str))) {
                setTabSelectIndex(i - 1);
                if (this.scrollIndex != -1) {
                    this.scrollIndex = -1;
                }
            }
            if (scrollDirection == ScrollDirection.UP && i != this.tabStrArray.size() - 1 && arrayList.get(arrayList.size() - 1).equals(getAgentInnerName(str))) {
                setTabSelectIndex(i + 1);
                if (this.scrollIndex != -1) {
                    this.scrollIndex = -1;
                }
            }
            if (i == this.tabStrArray.size() - 1 && scrollDirection == ScrollDirection.UP && arrayList.get(arrayList.size() - 1).equals(getAgentInnerName(str))) {
                this.tabWidgets.setVisibility(8);
            }
        }
    }

    @Override // com.dianping.shield.feature.HotZoneStatusInterface
    public void onHotZoneLocationChanged(ArrayList<AgentHotZoneInfo> arrayList, ScrollDirection scrollDirection) {
        Object[] objArr = {arrayList, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53a7627edcf747bd4a2046367081c43e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53a7627edcf747bd4a2046367081c43e");
        } else if (shouldShowTabs()) {
            if (arrayList.size() == 0 && (this.topState == TopLinearLayoutManager.TopState.TOP || this.hoverState == HoverState.HOVER)) {
                this.tabWidgets.setVisibility(8);
                this.isTabInHotZoneVisable = false;
            }
            Iterator<AgentHotZoneInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                AgentHotZoneInfo next = it.next();
                String str = next.agentHostName;
                if (next.hotZoneLocation != null) {
                    for (int i = 0; i < this.tabStrArray.size(); i++) {
                        Iterator<String> it2 = this.tabStrArray.get(i).agentKeys.iterator();
                        while (it2.hasNext()) {
                            String str2 = getHostName() + "@" + it2.next();
                            String[] split = str.split("@");
                            String[] split2 = str2.split("@");
                            boolean z = split.length > split2.length && Arrays.equals((String[]) Arrays.copyOf(split, split2.length), split2);
                            if (!str.equals(str2)) {
                                if (z) {
                                }
                            }
                            this.tabWidgets.setVisibility(0);
                            this.isTabInHotZoneVisable = true;
                            if (i == this.selectedIndex || i == this.scrollIndex || this.disableAutoScroll) {
                                return;
                            }
                            setTabSelectIndex(i);
                            this.scrollIndex = -1;
                            this.hasScrollToFirst = false;
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    private String getAgentInnerName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bc2407cd8fb3891fb2bd6c801e599da", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bc2407cd8fb3891fb2bd6c801e599da");
        }
        return str.replace(getHostName() + "@", "");
    }

    private void setTabSelectIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0072adfc8be684deab0d7005fe46598a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0072adfc8be684deab0d7005fe46598a");
        } else if (this.tabWidgets == null || i == this.selectedIndex) {
        } else {
            this.tabWidgets.setSelected(i, g.USER_SCROLL);
            this.selectedIndex = i;
        }
    }

    @Override // com.dianping.agentsdk.agent.HoloAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86a13cd09ea6ab029fe5913e6f3e3d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86a13cd09ea6ab029fe5913e6f3e3d3e");
            return;
        }
        unregisterAgentsObs();
        stopObserver();
        if (this.pageContainer instanceof IPageContainerFunc) {
            ((IPageContainerFunc) this.pageContainer).removeScrollListener(this.fixScrollListener);
        }
        super.onDestroy();
    }

    public void resetTabRegister() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff9054c5a8d0b11e10323575ddb7a44a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff9054c5a8d0b11e10323575ddb7a44a");
            return;
        }
        unregisterAgentsObs();
        this.tabStrArray.clear();
        this.agentShowMap.clear();
        registerAgentsObs();
        if (getHostCellManager() instanceof b) {
            ((b) getHostCellManager()).a((HotZoneObserverInterface) this);
            ((b) getHostCellManager()).a(this, getHostName());
        } else if (getHostCellManager() instanceof ShieldNodeCellManager) {
            ((ShieldNodeCellManager) getHostCellManager()).removeHotZoneStatusObserver(this);
            ((ShieldNodeCellManager) getHostCellManager()).addHotZoneStatusObserver(this, getHostName(), true, true);
        }
    }

    public void scrollToFirstAgent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbc10deb54b15a8f854bf08738ae0f46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbc10deb54b15a8f854bf08738ae0f46");
        } else if (this.tabStrArray == null || this.tabStrArray.size() > i) {
            this.disableAutoScroll = true;
            this.hasScrollToFirst = true;
            this.scrollIndex = i;
            this.selectedIndex = i;
            ArrayList<String> arrayList = this.agentShowMap.get(this.tabStrArray.get(i));
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ShieldGlobalFeatureInterface feature = getFeature();
            AgentInterface findAgent = feature.findAgent(getHostName() + "@" + arrayList.get(0));
            if (getHostCellManager() instanceof b) {
                getFeature().scrollToNode(AgentScrollerParams.toAgent(findAgent).setOffset((defineHotZone().endY - defineStatusHotZone().startY) - aq.a(getContext(), 10.0f)).setNeedAutoOffset(this.needAutoOffset));
            } else if (getHostCellManager() instanceof ShieldNodeCellManager) {
                getFeature().scrollToNode(AgentScrollerParams.toAgent(findAgent).setOffset((defineStatusHotZone().endY - defineStatusHotZone().startY) + this.hoverOffset).setNeedAutoOffset(this.needAutoOffset));
            }
        }
    }

    private void registerAgentsObs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a15e4247773bd5e7edcc90aa61f38b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a15e4247773bd5e7edcc90aa61f38b5");
            return;
        }
        if (this.tabSubList == null) {
            this.tabSubList = new ArrayList<>();
        }
        this.tabSubList.add(getWhiteBoard().b(ShieldConst.AGENT_VISIBILITY_LIST_KEY).c(new rx.functions.b() { // from class: com.dianping.shield.components.AbstractTabAgent.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public void call(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "23d8fde90d14eca8ed2abaa12071c00d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "23d8fde90d14eca8ed2abaa12071c00d");
                } else if (obj instanceof ArrayList) {
                    AbstractTabAgent.this.visibleAgentList = (ArrayList) obj;
                    ArrayList<AbsTabModel> arrayList = new ArrayList<>();
                    if (AbstractTabAgent.this.visibleAgentList.size() == 0) {
                        return;
                    }
                    Iterator it = AbstractTabAgent.this.tabModels.iterator();
                    while (it.hasNext()) {
                        AbsTabModel absTabModel = (AbsTabModel) it.next();
                        ArrayList arrayList2 = (ArrayList) AbstractTabAgent.this.agentShowMap.get(absTabModel);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        Iterator<String> it2 = absTabModel.agentKeys.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            String next = it2.next();
                            if (!z) {
                                Iterator it3 = AbstractTabAgent.this.visibleAgentList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((String) it3.next()).startsWith(AbstractTabAgent.this.getHostName() + "@" + next)) {
                                            if (!arrayList2.contains(next)) {
                                                arrayList2.add(next);
                                                AbstractTabAgent.this.sortShowList(arrayList2);
                                                AbstractTabAgent.this.agentShowMap.put(absTabModel, arrayList2);
                                            }
                                            if ((absTabModel.releatedKeys.size() > 0 && absTabModel.releatedKeys.contains(next)) || absTabModel.releatedKeys.size() == 0) {
                                                arrayList.add(absTabModel);
                                            }
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.size() == AbstractTabAgent.this.tabStrArray.size() && arrayList.equals(AbstractTabAgent.this.tabStrArray)) {
                        return;
                    }
                    AbstractTabAgent.this.tabStrArray = arrayList;
                    AbstractTabAgent.this.setTabs();
                    AbstractTabAgent.this.updateAgentCell();
                }
            }
        }));
    }

    public boolean shouldShowTabs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6f36e9a441c9c560c6906469657b616", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6f36e9a441c9c560c6906469657b616")).booleanValue() : this.tabStrArray != null && this.tabStrArray.size() >= this.minTabCount;
    }

    private void unregisterAgentsObs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d79221021bccd13ca46f71c7b5e26e70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d79221021bccd13ca46f71c7b5e26e70");
        } else if (this.tabSubList != null) {
            Iterator<k> it = this.tabSubList.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next != null) {
                    next.unsubscribe();
                }
            }
            this.tabSubList = null;
        }
    }
}
