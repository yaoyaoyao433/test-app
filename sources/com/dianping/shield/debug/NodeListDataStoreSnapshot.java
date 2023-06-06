package com.dianping.shield.debug;

import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NodeListDataStoreSnapshot {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile NodeListDataStoreSnapshot instance;
    private ArrayList<ShieldCellGroup> allDataTempo;

    public NodeListDataStoreSnapshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ca2343a6503ad59bb382cddd8d6991f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ca2343a6503ad59bb382cddd8d6991f");
        } else {
            this.allDataTempo = new ArrayList<>();
        }
    }

    public static NodeListDataStoreSnapshot getSingleton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "574ba8485ddd21ae9d012785dcaaf3cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (NodeListDataStoreSnapshot) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "574ba8485ddd21ae9d012785dcaaf3cd");
        }
        if (instance == null) {
            synchronized (NodeListDataStoreSnapshot.class) {
                if (instance == null) {
                    instance = new NodeListDataStoreSnapshot();
                }
            }
        }
        return instance;
    }

    public void releaseNodeListDataSource() {
        this.allDataTempo = null;
    }

    public void setNodeListForTempShow(ArrayList<ShieldCellGroup> arrayList) {
        this.allDataTempo = arrayList;
    }

    public List<ShieldCellGroup> getAllDataTempo() {
        return this.allDataTempo;
    }
}
