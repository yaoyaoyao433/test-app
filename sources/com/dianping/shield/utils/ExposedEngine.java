package com.dianping.shield.utils;

import android.util.Pair;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.sectionrecycler.section.c;
import com.dianping.shield.entity.AdapterExposedList;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ExposedAction;
import com.dianping.shield.entity.ExposedInfo;
import com.dianping.shield.entity.MoveStatusAction;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.feature.CellExposedInterface;
import com.dianping.shield.feature.CellMoveStatusInterface;
import com.dianping.shield.feature.ExposedInterface;
import com.dianping.shield.feature.ExtraCellExposedInterface;
import com.dianping.shield.feature.ExtraCellMoveStatusInterface;
import com.dianping.shield.feature.MoveStatusInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ExposedEngine {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap<c, AdapterExposedList> adapterMap;
    public HashMap<c, AdapterExposedList> adapterStatusMap;
    public ExposedDispatcher dispatcher;
    public ArrayList<ExposedInfo> innerInfos;
    public boolean isPageResumed;
    public MoveStatusDispatcher moveStatusDispatcher;
    public HashMap<c, AdapterExposedList> resumeStatusMap;

    public ExposedEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afdca14445292e0c817eb87cdd4c2959", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afdca14445292e0c817eb87cdd4c2959");
            return;
        }
        this.innerInfos = new ArrayList<>();
        this.adapterMap = new HashMap<>();
        this.adapterStatusMap = new HashMap<>();
        this.resumeStatusMap = new HashMap<>();
        this.dispatcher = new ExposedDispatcher();
        this.moveStatusDispatcher = new MoveStatusDispatcher();
        this.isPageResumed = false;
    }

    public void setNeedResendDisappearList(ArrayList<c> arrayList) {
        ArrayList<c> arrayList2 = arrayList;
        Object[] objArr = {arrayList2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95881cf9f50705e4315a6df2b09054e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95881cf9f50705e4315a6df2b09054e3");
        } else if (this.adapterMap.size() != 0) {
            for (Map.Entry<c, AdapterExposedList> entry : this.adapterMap.entrySet()) {
                c key = entry.getKey();
                if (needCheckNodeRemoved(key, arrayList2)) {
                    af sectionCellInterface = key.getSectionCellInterface();
                    if (sectionCellInterface instanceof MoveStatusInterface) {
                        callCellDisappear(sectionCellInterface, ExposeScope.COMPLETE, ScrollDirection.STATIC, -1, -1, null, false, true);
                    }
                    if (sectionCellInterface instanceof CellMoveStatusInterface) {
                        ArrayList<Pair<Integer, Integer>> arrayList3 = entry.getValue().completeExposedList;
                        Iterator<Pair<Integer, Integer>> it = entry.getValue().partExposedList.iterator();
                        while (it.hasNext()) {
                            Pair<Integer, Integer> next = it.next();
                            CellType cellType = entry.getKey().getCellType(((Integer) next.first).intValue(), ((Integer) next.second).intValue());
                            Pair<Integer, Integer> innerPosition = entry.getKey().getInnerPosition(((Integer) next.first).intValue(), ((Integer) next.second).intValue());
                            callCellDisappear(sectionCellInterface, ExposeScope.COMPLETE, ScrollDirection.STATIC, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType, false, false);
                        }
                        Iterator<Pair<Integer, Integer>> it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Pair<Integer, Integer> next2 = it2.next();
                            CellType cellType2 = entry.getKey().getCellType(((Integer) next2.first).intValue(), ((Integer) next2.second).intValue());
                            Pair<Integer, Integer> innerPosition2 = entry.getKey().getInnerPosition(((Integer) next2.first).intValue(), ((Integer) next2.second).intValue());
                            callCellDisappear(sectionCellInterface, ExposeScope.PX, ScrollDirection.STATIC, ((Integer) next2.first).intValue(), ((Integer) innerPosition2.second).intValue(), cellType2, false, false);
                            callCellDisappear(sectionCellInterface, ExposeScope.COMPLETE, ScrollDirection.STATIC, ((Integer) innerPosition2.first).intValue(), ((Integer) innerPosition2.second).intValue(), cellType2, false, false);
                        }
                    }
                }
                arrayList2 = arrayList;
            }
            Iterator<c> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c next3 = it3.next();
                ArrayList arrayList4 = new ArrayList();
                Iterator<ExposedInfo> it4 = this.innerInfos.iterator();
                while (it4.hasNext()) {
                    ExposedInfo next4 = it4.next();
                    if (next4.owner == next3) {
                        arrayList4.add(next4);
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    this.innerInfos.remove((ExposedInfo) it5.next());
                }
                this.adapterMap.remove(next3);
                this.adapterStatusMap.remove(next3);
                this.resumeStatusMap.remove(next3);
            }
        }
    }

    public synchronized void updateExposedSections(ArrayList<ExposedInfo> arrayList, ScrollDirection scrollDirection) {
        Iterator<ExposedInfo> it;
        ExposeScope exposeScope;
        Iterator<ExposedInfo> it2;
        Pair<Integer, Integer> pair;
        ExposedInfo exposedInfo;
        ExposeScope exposeScope2;
        Pair<Integer, Integer> pair2;
        CellType cellType;
        af afVar;
        boolean z = false;
        Object[] objArr = {arrayList, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77aa0a677f45217db3c0be529828cfdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77aa0a677f45217db3c0be529828cfdf");
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        HashMap hashMap = (HashMap) this.adapterMap.clone();
        this.adapterMap.clear();
        Iterator<ExposedInfo> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ExposedInfo next = it3.next();
            if (!this.adapterMap.containsKey(next.owner)) {
                AdapterExposedList adapterExposedList = new AdapterExposedList();
                adapterExposedList.addToList(next.details);
                this.adapterMap.put(next.owner, adapterExposedList);
            } else {
                AdapterExposedList adapterExposedList2 = this.adapterMap.get(next.owner);
                adapterExposedList2.addToList(next.details);
                this.adapterMap.put(next.owner, adapterExposedList2);
            }
            if (this.innerInfos.contains(next)) {
                arrayList2.remove(next);
                this.innerInfos.remove(next);
            } else {
                af sectionCellInterface = next.owner.getSectionCellInterface();
                if (!(sectionCellInterface instanceof CellExposedInterface)) {
                    if (!(sectionCellInterface instanceof ExtraCellExposedInterface)) {
                        if (!(sectionCellInterface instanceof CellMoveStatusInterface)) {
                            if (sectionCellInterface instanceof ExtraCellMoveStatusInterface) {
                            }
                            z = false;
                        }
                    }
                }
                CellType cellType2 = next.owner.getCellType(next.details.section, next.details.row);
                Pair<Integer, Integer> innerPosition = next.owner.getInnerPosition(next.details.section, next.details.row);
                ExposeScope scope = getScope(sectionCellInterface, cellType2, innerPosition);
                if (next.details.isComplete) {
                    ExposedInfo exposedInfo2 = new ExposedInfo();
                    exposedInfo2.owner = next.owner;
                    exposedInfo2.details.section = next.details.section;
                    exposedInfo2.details.row = next.details.row;
                    exposedInfo2.details.cellType = next.details.cellType;
                    exposedInfo2.details.isComplete = z;
                    if (this.innerInfos.contains(exposedInfo2)) {
                        if (this.isPageResumed) {
                            exposedInfo = exposedInfo2;
                            exposeScope2 = scope;
                            pair2 = innerPosition;
                            cellType = cellType2;
                            afVar = sectionCellInterface;
                        } else {
                            exposedInfo = exposedInfo2;
                            exposeScope2 = scope;
                            pair2 = innerPosition;
                            cellType = cellType2;
                            afVar = sectionCellInterface;
                            dispatchCellMove(sectionCellInterface, ExposeScope.COMPLETE, scrollDirection, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType2, true, false);
                        }
                        this.innerInfos.remove(exposedInfo);
                        if (exposeScope2 == ExposeScope.COMPLETE) {
                            Pair<Integer, Integer> pair3 = pair2;
                            this.dispatcher.exposedAction(new ExposedAction(afVar, ((Integer) pair3.first).intValue(), ((Integer) pair3.second).intValue(), cellType, true, false));
                        }
                    } else {
                        if (!this.isPageResumed) {
                            dispatchCellMove(sectionCellInterface, ExposeScope.PX, scrollDirection, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType2, true, false);
                            dispatchCellMove(sectionCellInterface, ExposeScope.COMPLETE, scrollDirection, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType2, true, false);
                        }
                        this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType2, true, false));
                    }
                } else {
                    ExposedInfo exposedInfo3 = new ExposedInfo();
                    exposedInfo3.owner = next.owner;
                    exposedInfo3.details.section = next.details.section;
                    exposedInfo3.details.row = next.details.row;
                    exposedInfo3.details.cellType = next.details.cellType;
                    exposedInfo3.details.isComplete = true;
                    if (this.innerInfos.contains(exposedInfo3)) {
                        this.innerInfos.remove(exposedInfo3);
                        if (!this.isPageResumed) {
                            dispatchCellMove(sectionCellInterface, ExposeScope.PX, scrollDirection, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType2, false, false);
                        }
                        if (scope == ExposeScope.COMPLETE) {
                            this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType2, false, false));
                        }
                    } else {
                        if (!this.isPageResumed) {
                            dispatchCellMove(sectionCellInterface, ExposeScope.PX, scrollDirection, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType2, true, false);
                        }
                        if (scope == ExposeScope.PX) {
                            this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType2, true, false));
                        }
                    }
                }
                z = false;
            }
        }
        Iterator<ExposedInfo> it4 = this.innerInfos.iterator();
        while (it4.hasNext()) {
            ExposedInfo next2 = it4.next();
            af sectionCellInterface2 = next2.owner.getSectionCellInterface();
            if (((sectionCellInterface2 instanceof CellExposedInterface) || (sectionCellInterface2 instanceof ExtraCellExposedInterface) || (sectionCellInterface2 instanceof CellMoveStatusInterface) || (sectionCellInterface2 instanceof ExtraCellMoveStatusInterface)) && next2.owner.getSectionCount() > next2.details.section && next2.owner.getRowCount(next2.details.section) > next2.details.row) {
                CellType cellType3 = next2.owner.getCellType(next2.details.section, next2.details.row);
                Pair<Integer, Integer> innerPosition2 = next2.owner.getInnerPosition(next2.details.section, next2.details.row);
                ExposeScope scope2 = getScope(sectionCellInterface2, cellType3, innerPosition2);
                if (next2.details.isComplete) {
                    if (this.isPageResumed) {
                        it2 = it4;
                        pair = innerPosition2;
                    } else {
                        it2 = it4;
                        pair = innerPosition2;
                        dispatchCellMove(sectionCellInterface2, ExposeScope.PX, scrollDirection, ((Integer) innerPosition2.first).intValue(), ((Integer) innerPosition2.second).intValue(), cellType3, false, false);
                        dispatchCellMove(sectionCellInterface2, ExposeScope.COMPLETE, scrollDirection, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), cellType3, false, false);
                    }
                    this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface2, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), cellType3, false, false));
                    it4 = it2;
                } else {
                    it = it4;
                    if (this.isPageResumed) {
                        exposeScope = scope2;
                    } else {
                        exposeScope = scope2;
                        dispatchCellMove(sectionCellInterface2, ExposeScope.COMPLETE, scrollDirection, ((Integer) innerPosition2.first).intValue(), ((Integer) innerPosition2.second).intValue(), cellType3, false, false);
                    }
                    if (exposeScope == ExposeScope.PX) {
                        this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface2, ((Integer) innerPosition2.first).intValue(), ((Integer) innerPosition2.second).intValue(), cellType3, false, false));
                    }
                }
            } else {
                it = it4;
            }
            it4 = it;
        }
        this.innerInfos = arrayList;
        new ArrayList();
        for (Map.Entry<c, AdapterExposedList> entry : this.adapterMap.entrySet()) {
            af sectionCellInterface3 = entry.getKey().getSectionCellInterface();
            if (!(sectionCellInterface3 instanceof ExposedInterface) && !(sectionCellInterface3 instanceof MoveStatusInterface)) {
            }
            if (!hashMap.containsKey(entry.getKey())) {
                AdapterExposedList value = entry.getValue();
                if (value.partExposedList.isEmpty() && value.completeExposedList.size() == entry.getKey().getItemCount()) {
                    if (scrollDirection != ScrollDirection.STATIC || !this.isPageResumed || !this.resumeStatusMap.containsKey(entry.getKey())) {
                        dispatchCellMove(sectionCellInterface3, ExposeScope.PX, scrollDirection, -1, -1, null, true, true);
                        dispatchCellMove(sectionCellInterface3, ExposeScope.COMPLETE, scrollDirection, -1, -1, null, true, true);
                    }
                    this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface3, -1, -1, null, true, true));
                } else {
                    if (scrollDirection != ScrollDirection.STATIC || !this.isPageResumed || !this.resumeStatusMap.containsKey(entry.getKey())) {
                        dispatchCellMove(sectionCellInterface3, ExposeScope.PX, scrollDirection, -1, -1, null, true, true);
                    }
                    if ((sectionCellInterface3 instanceof ExposedInterface) && ((ExposedInterface) sectionCellInterface3).getExposeScope() == ExposeScope.PX) {
                        this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface3, -1, -1, null, true, true));
                    }
                }
            } else {
                AdapterExposedList value2 = entry.getValue();
                AdapterExposedList adapterExposedList3 = (AdapterExposedList) hashMap.get(entry.getKey());
                if (value2 != null && adapterExposedList3 != null && (!value2.completeExposedList.equals(adapterExposedList3.completeExposedList) || !value2.partExposedList.equals(adapterExposedList3.partExposedList))) {
                    if (value2.partExposedList.isEmpty() && value2.completeExposedList.size() == entry.getKey().getItemCount()) {
                        if (scrollDirection != ScrollDirection.STATIC || !this.isPageResumed || !this.resumeStatusMap.containsKey(entry.getKey())) {
                            dispatchCellMove(sectionCellInterface3, ExposeScope.COMPLETE, scrollDirection, -1, -1, null, true, true);
                        }
                        if ((sectionCellInterface3 instanceof ExposedInterface) && ((ExposedInterface) sectionCellInterface3).getExposeScope() == ExposeScope.COMPLETE) {
                            this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface3, -1, -1, null, true, true));
                        }
                    } else if (adapterExposedList3.partExposedList.isEmpty() && adapterExposedList3.completeExposedList.size() == entry.getKey().getItemCount()) {
                        dispatchCellMove(sectionCellInterface3, ExposeScope.PX, scrollDirection, -1, -1, null, false, true);
                        if ((sectionCellInterface3 instanceof ExposedInterface) && ((ExposedInterface) sectionCellInterface3).getExposeScope() == ExposeScope.COMPLETE) {
                            this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface3, -1, -1, null, false, true));
                        }
                    }
                }
                hashMap.remove(entry.getKey());
                this.isPageResumed = false;
                this.resumeStatusMap.clear();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            af sectionCellInterface4 = ((c) entry2.getKey()).getSectionCellInterface();
            if ((sectionCellInterface4 instanceof ExposedInterface) || (sectionCellInterface4 instanceof MoveStatusInterface)) {
                AdapterExposedList adapterExposedList4 = (AdapterExposedList) entry2.getValue();
                if (adapterExposedList4.partExposedList.isEmpty() && adapterExposedList4.completeExposedList.size() == ((c) entry2.getKey()).getItemCount()) {
                    dispatchCellMove(sectionCellInterface4, ExposeScope.PX, scrollDirection, -1, -1, null, false, true);
                    dispatchCellMove(sectionCellInterface4, ExposeScope.COMPLETE, scrollDirection, -1, -1, null, false, true);
                    this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface4, -1, -1, null, false, true));
                } else {
                    dispatchCellMove(sectionCellInterface4, ExposeScope.COMPLETE, scrollDirection, -1, -1, null, false, true);
                    if ((sectionCellInterface4 instanceof ExposedInterface) && ((ExposedInterface) sectionCellInterface4).getExposeScope() == ExposeScope.PX) {
                        this.dispatcher.exposedAction(new ExposedAction(sectionCellInterface4, -1, -1, null, false, true));
                    }
                }
            }
        }
    }

    private ExposeScope getScope(af afVar, CellType cellType, Pair<Integer, Integer> pair) {
        Object[] objArr = {afVar, cellType, pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73162c4f3fd73c689237f1ab1b927d47", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExposeScope) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73162c4f3fd73c689237f1ab1b927d47");
        }
        if ((afVar instanceof CellExposedInterface) && cellType == CellType.NORMAL) {
            return ((CellExposedInterface) afVar).getExposeScope(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
        }
        if (afVar instanceof ExtraCellExposedInterface) {
            if (cellType == CellType.HEADER || cellType == CellType.FOOTER) {
                return ((ExtraCellExposedInterface) afVar).getExtraCellExposeScope(((Integer) pair.first).intValue(), cellType);
            }
            return null;
        }
        return null;
    }

    public void stopExposedDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f39c274165f80743dccd2b3bc83d4db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f39c274165f80743dccd2b3bc83d4db");
            return;
        }
        this.innerInfos.clear();
        this.adapterMap.clear();
        this.dispatcher.finishExposed();
    }

    public void pauseExposedDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b62770dd1528bd4b0abcd8d8f439c561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b62770dd1528bd4b0abcd8d8f439c561");
            return;
        }
        this.innerInfos.clear();
        this.adapterMap.clear();
        this.dispatcher.pauseExposed();
    }

    public void stopMoveStatusDispatch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43ed54bf496a3d19a9e5f4f7305b90f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43ed54bf496a3d19a9e5f4f7305b90f7");
        } else {
            this.moveStatusDispatcher.stopDispatch();
        }
    }

    public void storeMoveStatusMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36786477e89375e47a36dfc4451fe064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36786477e89375e47a36dfc4451fe064");
        } else if (this.adapterMap.isEmpty()) {
        } else {
            this.adapterStatusMap = (HashMap) this.adapterMap.clone();
        }
    }

    public void clearMoveStatusMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8040a2071bc6c46d43327e069c260772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8040a2071bc6c46d43327e069c260772");
        } else {
            this.adapterStatusMap.clear();
        }
    }

    public void dispatchAgentDisappearWithLifecycle(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9324925233553ec5cfdc969f0ece877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9324925233553ec5cfdc969f0ece877");
            return;
        }
        for (Map.Entry<c, AdapterExposedList> entry : this.adapterMap.entrySet()) {
            af sectionCellInterface = entry.getKey().getSectionCellInterface();
            if (sectionCellInterface instanceof MoveStatusInterface) {
                dispatchCellMove(sectionCellInterface, ExposeScope.COMPLETE, scrollDirection, -1, -1, null, false, true);
            }
            if (sectionCellInterface instanceof CellMoveStatusInterface) {
                ArrayList<Pair<Integer, Integer>> arrayList = entry.getValue().completeExposedList;
                Iterator<Pair<Integer, Integer>> it = entry.getValue().partExposedList.iterator();
                while (it.hasNext()) {
                    Pair<Integer, Integer> next = it.next();
                    CellType cellType = entry.getKey().getCellType(((Integer) next.first).intValue(), ((Integer) next.second).intValue());
                    Pair<Integer, Integer> innerPosition = entry.getKey().getInnerPosition(((Integer) next.first).intValue(), ((Integer) next.second).intValue());
                    dispatchCellMove(sectionCellInterface, ExposeScope.COMPLETE, scrollDirection, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType, false, false);
                }
                Iterator<Pair<Integer, Integer>> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Pair<Integer, Integer> next2 = it2.next();
                    CellType cellType2 = entry.getKey().getCellType(((Integer) next2.first).intValue(), ((Integer) next2.second).intValue());
                    Pair<Integer, Integer> innerPosition2 = entry.getKey().getInnerPosition(((Integer) next2.first).intValue(), ((Integer) next2.second).intValue());
                    dispatchCellMove(sectionCellInterface, ExposeScope.PX, scrollDirection, ((Integer) next2.first).intValue(), ((Integer) innerPosition2.second).intValue(), cellType2, false, false);
                    dispatchCellMove(sectionCellInterface, ExposeScope.COMPLETE, scrollDirection, ((Integer) innerPosition2.first).intValue(), ((Integer) innerPosition2.second).intValue(), cellType2, false, false);
                }
            }
        }
    }

    public void dispatchAgentAappearWithLifecycle(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2afc1919112abeb5742e00a413bacc16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2afc1919112abeb5742e00a413bacc16");
            return;
        }
        for (Map.Entry<c, AdapterExposedList> entry : this.adapterStatusMap.entrySet()) {
            af sectionCellInterface = entry.getKey().getSectionCellInterface();
            if (sectionCellInterface instanceof MoveStatusInterface) {
                AdapterExposedList value = entry.getValue();
                if (value.partExposedList.isEmpty() && value.completeExposedList.size() == entry.getKey().getItemCount()) {
                    dispatchCellMove(sectionCellInterface, ExposeScope.PX, scrollDirection, -1, -1, null, true, true);
                    dispatchCellMove(sectionCellInterface, ExposeScope.COMPLETE, scrollDirection, -1, -1, null, true, true);
                } else {
                    dispatchCellMove(sectionCellInterface, ExposeScope.PX, scrollDirection, -1, -1, null, true, true);
                }
            }
            if (sectionCellInterface instanceof CellMoveStatusInterface) {
                ArrayList<Pair<Integer, Integer>> arrayList = entry.getValue().completeExposedList;
                Iterator<Pair<Integer, Integer>> it = entry.getValue().partExposedList.iterator();
                while (it.hasNext()) {
                    Pair<Integer, Integer> next = it.next();
                    CellType cellType = entry.getKey().getCellType(((Integer) next.first).intValue(), ((Integer) next.second).intValue());
                    Pair<Integer, Integer> innerPosition = entry.getKey().getInnerPosition(((Integer) next.first).intValue(), ((Integer) next.second).intValue());
                    dispatchCellMove(sectionCellInterface, ExposeScope.PX, scrollDirection, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), cellType, true, false);
                }
                Iterator<Pair<Integer, Integer>> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Pair<Integer, Integer> next2 = it2.next();
                    CellType cellType2 = entry.getKey().getCellType(((Integer) next2.first).intValue(), ((Integer) next2.second).intValue());
                    Pair<Integer, Integer> innerPosition2 = entry.getKey().getInnerPosition(((Integer) next2.first).intValue(), ((Integer) next2.second).intValue());
                    dispatchCellMove(sectionCellInterface, ExposeScope.PX, scrollDirection, ((Integer) innerPosition2.first).intValue(), ((Integer) innerPosition2.second).intValue(), cellType2, true, false);
                    dispatchCellMove(sectionCellInterface, ExposeScope.COMPLETE, scrollDirection, ((Integer) innerPosition2.first).intValue(), ((Integer) innerPosition2.second).intValue(), cellType2, true, false);
                }
            }
            if (scrollDirection == ScrollDirection.PAGE_BACK) {
                this.resumeStatusMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (scrollDirection == ScrollDirection.PAGE_BACK) {
            this.isPageResumed = true;
        }
    }

    public ArrayList<ExposedInfo> getInnerInfos() {
        return this.innerInfos;
    }

    private void dispatchCellMove(af afVar, ExposeScope exposeScope, ScrollDirection scrollDirection, int i, int i2, CellType cellType, boolean z, boolean z2) {
        Object[] objArr = {afVar, exposeScope, scrollDirection, Integer.valueOf(i), Integer.valueOf(i2), cellType, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9929434d10c9442fece7656459923f81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9929434d10c9442fece7656459923f81");
        } else if ((afVar instanceof MoveStatusInterface) && z2) {
            MoveStatusAction moveStatusAction = new MoveStatusAction(exposeScope, scrollDirection, i, i2, cellType, z, z2);
            moveStatusAction.moveStatusInterface = (MoveStatusInterface) afVar;
            this.moveStatusDispatcher.moveAction(moveStatusAction);
        } else if (cellType == CellType.NORMAL && (afVar instanceof CellMoveStatusInterface) && !z2) {
            MoveStatusAction moveStatusAction2 = new MoveStatusAction(exposeScope, scrollDirection, i, i2, cellType, z, z2);
            moveStatusAction2.cellMoveStatusInterface = (CellMoveStatusInterface) afVar;
            this.moveStatusDispatcher.moveAction(moveStatusAction2);
        } else if (cellType == CellType.NORMAL || !(afVar instanceof ExtraCellMoveStatusInterface) || z2) {
        } else {
            MoveStatusAction moveStatusAction3 = new MoveStatusAction(exposeScope, scrollDirection, i, i2, cellType, z, z2);
            moveStatusAction3.extraCellMoveStatusInterface = (ExtraCellMoveStatusInterface) afVar;
            this.moveStatusDispatcher.moveAction(moveStatusAction3);
        }
    }

    private void callCellDisappear(af afVar, ExposeScope exposeScope, ScrollDirection scrollDirection, int i, int i2, CellType cellType, boolean z, boolean z2) {
        Object[] objArr = {afVar, exposeScope, scrollDirection, Integer.valueOf(i), Integer.valueOf(i2), cellType, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66880235bd88cdd4d1ee07d7353236f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66880235bd88cdd4d1ee07d7353236f6");
        } else if ((afVar instanceof MoveStatusInterface) && z2) {
            ((MoveStatusInterface) afVar).onDisappear(exposeScope, scrollDirection);
        } else if (cellType == CellType.NORMAL && (afVar instanceof CellMoveStatusInterface) && !z2) {
            ((CellMoveStatusInterface) afVar).onDisappear(exposeScope, scrollDirection, i, i2);
        } else if (cellType == CellType.NORMAL || !(afVar instanceof ExtraCellMoveStatusInterface) || z2) {
        } else {
            ((ExtraCellMoveStatusInterface) afVar).onDisappear(exposeScope, scrollDirection, i, cellType);
        }
    }

    private boolean needCheckNodeRemoved(c cVar, ArrayList<c> arrayList) {
        Object[] objArr = {cVar, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fce455865b75ce87de2c804ffe589a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fce455865b75ce87de2c804ffe589a7")).booleanValue();
        }
        Iterator<c> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(cVar)) {
                return true;
            }
        }
        return false;
    }
}
