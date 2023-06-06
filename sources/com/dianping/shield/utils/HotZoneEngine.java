package com.dianping.shield.utils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.agentsdk.sectionrecycler.section.c;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.feature.HotZoneObserverInterface;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class HotZoneEngine {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap<Integer, c> adaptersMap;
    public HotZoneObserverInterface hotZoneObserverInterface;
    public HotZoneYRange hotZoneYRange;
    public Set<String> observerAgents;

    private boolean isFirstItem(int i, int i2, c cVar) {
        return i == 0 && i2 == 0;
    }

    public HotZoneEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ce0a2e60a26a3b9245b084eb3530efb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ce0a2e60a26a3b9245b084eb3530efb");
        } else {
            this.adaptersMap = new LinkedHashMap();
        }
    }

    public void setHotZoneObserverInterface(HotZoneObserverInterface hotZoneObserverInterface, String str) {
        Object[] objArr = {hotZoneObserverInterface, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bfd40214c7ff4f5c48b96b05e202d7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bfd40214c7ff4f5c48b96b05e202d7e");
            return;
        }
        this.hotZoneObserverInterface = hotZoneObserverInterface;
        this.hotZoneYRange = hotZoneObserverInterface.defineHotZone();
        if (str != null) {
            HashSet hashSet = new HashSet();
            Iterator<String> it = hotZoneObserverInterface.observerAgents().iterator();
            while (it.hasNext()) {
                hashSet.add(str + "@" + it.next());
            }
            this.observerAgents = hashSet;
            return;
        }
        this.observerAgents = hotZoneObserverInterface.observerAgents();
    }

    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3ac05b003146cf97532f5516acf48e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3ac05b003146cf97532f5516acf48e3");
        } else {
            this.adaptersMap.clear();
        }
    }

    public void scroll(ScrollDirection scrollDirection, RecyclerView recyclerView, b bVar) {
        b.c a;
        c a2;
        Object[] objArr = {scrollDirection, recyclerView, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d6df5b3b760562a83c142624d944cd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d6df5b3b760562a83c142624d944cd3");
        } else if (bVar != null && scrollDirection != null && (recyclerView.getLayoutManager() instanceof ShieldLayoutManagerInterface) && this.hotZoneObserverInterface != null && recyclerView != null) {
            this.hotZoneYRange = this.hotZoneObserverInterface.defineHotZone();
            ShieldLayoutManagerInterface shieldLayoutManagerInterface = (ShieldLayoutManagerInterface) recyclerView.getLayoutManager();
            int findFirstVisibleItemPosition = shieldLayoutManagerInterface.findFirstVisibleItemPosition(false);
            int findLastVisibleItemPosition = shieldLayoutManagerInterface.findLastVisibleItemPosition(false);
            Pair<Integer, Integer> sectionIndex = bVar.getSectionIndex(findFirstVisibleItemPosition);
            b.c a3 = sectionIndex != null ? bVar.a(((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue()) : null;
            Pair<Integer, Integer> sectionIndex2 = bVar.getSectionIndex(findLastVisibleItemPosition);
            b.c a4 = sectionIndex2 != null ? bVar.a(((Integer) sectionIndex2.first).intValue(), ((Integer) sectionIndex2.second).intValue()) : null;
            if (a3 != null || a4 != null) {
                for (Map.Entry entry : ((HashMap) this.adaptersMap.clone()).entrySet()) {
                    if ((a3 != null && ((Integer) entry.getKey()).intValue() < a3.b) || (a4 != null && ((Integer) entry.getKey()).intValue() > a4.b)) {
                        this.hotZoneObserverInterface.scrollOut(this.adaptersMap.get(entry.getKey()).getAgentInterface().getHostName(), scrollDirection);
                        this.adaptersMap.remove(entry.getKey());
                    }
                }
            }
            while (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                Pair<Integer, Integer> sectionIndex3 = bVar.getSectionIndex(findFirstVisibleItemPosition);
                if (sectionIndex3 != null && (a = bVar.a(((Integer) sectionIndex3.first).intValue(), ((Integer) sectionIndex3.second).intValue())) != null && (a2 = bVar.a(a.b)) != null && this.observerAgents.contains(a2.getAgentInterface().getHostName()) && ((isFirstItem(a.c, a.d, a2) || isLastItem(a.c, a.d, a2)) && this.hotZoneYRange != null)) {
                    int headerCount = recyclerView instanceof ShieldRecyclerViewInterface ? ((ShieldRecyclerViewInterface) recyclerView).getHeaderCount() + findFirstVisibleItemPosition : findFirstVisibleItemPosition;
                    View view = null;
                    for (int i = 0; i < recyclerView.getChildCount(); i++) {
                        if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i)) == headerCount) {
                            view = recyclerView.getChildAt(i);
                        }
                    }
                    if (view != null) {
                        Rect rect = new Rect();
                        view.getHitRect(rect);
                        if (isFirstItem(a.c, a.d, a2) && scrollDirection != ScrollDirection.DOWN && rect.top <= this.hotZoneYRange.endY && rect.bottom > this.hotZoneYRange.startY && !this.adaptersMap.containsValue(a2)) {
                            this.adaptersMap.put(Integer.valueOf(a.b), a2);
                            this.hotZoneObserverInterface.scrollReach(a2.getAgentInterface().getHostName(), scrollDirection);
                        } else if (isFirstItem(a.c, a.d, a2) && scrollDirection != ScrollDirection.UP && rect.top > this.hotZoneYRange.endY && this.adaptersMap.containsValue(a2)) {
                            this.adaptersMap.remove(Integer.valueOf(a.b));
                            this.hotZoneObserverInterface.scrollOut(a2.getAgentInterface().getHostName(), scrollDirection);
                        } else if (isLastItem(a.c, a.d, a2) && scrollDirection == ScrollDirection.UP && rect.bottom < this.hotZoneYRange.startY && this.adaptersMap.containsValue(a2)) {
                            this.adaptersMap.remove(Integer.valueOf(a.b));
                            this.hotZoneObserverInterface.scrollOut(a2.getAgentInterface().getHostName(), scrollDirection);
                        } else if (isLastItem(a.c, a.d, a2) && scrollDirection == ScrollDirection.DOWN && rect.bottom >= this.hotZoneYRange.startY && rect.top < this.hotZoneYRange.endY && !this.adaptersMap.containsValue(a2)) {
                            this.adaptersMap.put(Integer.valueOf(a.b), a2);
                            this.hotZoneObserverInterface.scrollReach(a2.getAgentInterface().getHostName(), scrollDirection);
                        }
                    }
                }
                findFirstVisibleItemPosition++;
            }
        }
    }

    private boolean isLastItem(int i, int i2, c cVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32286a1a82b25ec36ac429dfd7491942", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32286a1a82b25ec36ac429dfd7491942")).booleanValue() : i == cVar.getSectionCount() - 1 && i2 == cVar.getRowCount(i) - 1;
    }
}
