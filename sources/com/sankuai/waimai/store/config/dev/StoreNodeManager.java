package com.sankuai.waimai.store.config.dev;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.config.bean.TreeNode;
import com.sankuai.waimai.platform.config.bean.TreeNodeGenerator;
import com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider;
import com.sankuai.waimai.store.config.e;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.am;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StoreNodeManager implements BusinessNodeProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getCid() {
        return "";
    }

    @Override // com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider
    public TreeNode getNode(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3791cf3e1423310c5edc453c775bebf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (TreeNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3791cf3e1423310c5edc453c775bebf6");
        }
        TreeNode treeNode = TreeNodeGenerator.getTreeNode("闪购业务");
        addMrnSetting(activity, treeNode);
        addHornDebug(activity, treeNode);
        return treeNode;
    }

    private void addHornDebug(final Activity activity, TreeNode treeNode) {
        Object[] objArr = {activity, treeNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a2f9633826c30f9105b9f4028169f2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a2f9633826c30f9105b9f4028169f2b");
        } else {
            treeNode.addChild(TreeNodeGenerator.getTreeNode("闪购Horn#Debug").setIsShowSwitch(true).setKey("__horn_debug__", e.b(activity)).setOnClickBooleanHandler(new TreeNode.OnClickBooleanHandler() { // from class: com.sankuai.waimai.store.config.dev.StoreNodeManager.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.config.bean.TreeNode.OnClickBooleanHandler
                public final boolean onClick(String str, boolean z, boolean z2) {
                    Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fd0f7236ad2357a03b8fb3290537a155", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fd0f7236ad2357a03b8fb3290537a155")).booleanValue();
                    }
                    e.a(activity, z);
                    am.a(activity, "1分钟内自动生效");
                    return z;
                }
            }));
        }
    }

    private void addMrnSetting(final Activity activity, TreeNode treeNode) {
        Object[] objArr = {activity, treeNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "025ad365d444813a8734934d7e386de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "025ad365d444813a8734934d7e386de7");
        } else {
            treeNode.addChild(TreeNodeGenerator.getTreeNode("RN工具").setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.config.dev.StoreNodeManager.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d7ebeaac7ec460dc9e4d3774a4b41470", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d7ebeaac7ec460dc9e4d3774a4b41470");
                    } else {
                        d.a(activity, "meituanwaimai://waimai.meituan.com/addMrnSetting?mrn_biz=supermarket&mrn_entry=flashbuy-check&mrn_component=flashbuy-check");
                    }
                }
            }));
        }
    }
}
