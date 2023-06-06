package com.dianping.shield.node.adapter;

import android.support.v7.util.b;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.logger.SCLogger;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NodeListDiffCallback extends b.a {
    private static final boolean DEBUG = ShieldEnvironment.INSTANCE.isDebug();
    public static ChangeQuickRedirect changeQuickRedirect;
    private SCLogger logger;
    private ArrayList<ShieldDisplayNode> newNodeList;
    private ArrayList<ShieldDisplayNode> oldNodeList;

    public NodeListDiffCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b64119e26e10c70218e0113bbb057033", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b64119e26e10c70218e0113bbb057033");
        } else {
            this.logger = new SCLogger().setTag("DiffUtil");
        }
    }

    public void setNodeList(ArrayList<ShieldDisplayNode> arrayList, ArrayList<ShieldDisplayNode> arrayList2) {
        this.oldNodeList = arrayList;
        this.newNodeList = arrayList2;
    }

    @Override // android.support.v7.util.b.a
    public int getOldListSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9134b823813d1f61d1c0c882cc892e0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9134b823813d1f61d1c0c882cc892e0e")).intValue();
        }
        if (this.oldNodeList == null) {
            return 0;
        }
        return this.oldNodeList.size();
    }

    @Override // android.support.v7.util.b.a
    public int getNewListSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad8580586f7acb93ed9c7e34b4837796", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad8580586f7acb93ed9c7e34b4837796")).intValue();
        }
        if (this.newNodeList == null) {
            return 0;
        }
        return this.newNodeList.size();
    }

    @Override // android.support.v7.util.b.a
    public boolean areItemsTheSame(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3a335617df424f4efb12ece2108ec36", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3a335617df424f4efb12ece2108ec36")).booleanValue() : sameNodeData(this.oldNodeList.get(i), this.newNodeList.get(i2));
    }

    @Override // android.support.v7.util.b.a
    public boolean areContentsTheSame(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "941995c12d38f3dc2b97004608ffa97a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "941995c12d38f3dc2b97004608ffa97a")).booleanValue() : sameNodeData(this.oldNodeList.get(i), this.newNodeList.get(i2));
    }

    private boolean sameNodeData(ShieldDisplayNode shieldDisplayNode, ShieldDisplayNode shieldDisplayNode2) {
        Object[] objArr = {shieldDisplayNode, shieldDisplayNode2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3acb831a6e88c078cf71a44f284df515", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3acb831a6e88c078cf71a44f284df515")).booleanValue();
        }
        return (shieldDisplayNode != null ? shieldDisplayNode.viewItem : null) == (shieldDisplayNode2 != null ? shieldDisplayNode2.viewItem : null);
    }
}
