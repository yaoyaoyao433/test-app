package com.sankuai.waimai.business.page.common.config;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.interfaces.b;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.platform.config.bean.TreeNode;
import com.sankuai.waimai.platform.config.bean.TreeNodeGenerator;
import com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NodeManagerImpl implements BusinessNodeProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider
    public TreeNode getNode(final Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51dc16243d4c790cc4d4f838b1c79102", RobustBitConfig.DEFAULT_VALUE)) {
            return (TreeNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51dc16243d4c790cc4d4f838b1c79102");
        }
        TreeNode treeNode = TreeNodeGenerator.getTreeNode("page库");
        treeNode.addChild(TreeNodeGenerator.getTreeNode("正常启动首页").setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.config.NodeManagerImpl.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "98670f740ca1db8a611386fc16672229", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "98670f740ca1db8a611386fc16672229");
                    return;
                }
                com.sankuai.waimai.foundation.router.a.a(activity, c.a);
                activity.finish();
            }
        }));
        treeNode.addChild(TreeNodeGenerator.getTreeNode("商家列表使用ConstraintLayout").setIsShowSwitch(true).setKey("test_poi_constraint_layout", true).setOnClickBooleanHandler(null));
        treeNode.addChild(TreeNodeGenerator.getTreeNode("铂金模板视频声音开关").setIsShowSwitch(true).setKey("develop_cpm_video_volume", false).setOnClickBooleanHandler(null));
        treeNode.addChild(TreeNodeGenerator.getTreeNode("去推荐落地页").setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.config.NodeManagerImpl.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "245f19c9b79e8bf2af7cd1a450e16f1e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "245f19c9b79e8bf2af7cd1a450e16f1e");
                } else {
                    com.sankuai.waimai.router.a.a(activity, c.W);
                }
            }
        }));
        treeNode.addChild(TreeNodeGenerator.getTreeNode("去推荐落地页外部").setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.config.NodeManagerImpl.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "616e7f3f6c379d1ea6f44719b40e2fdf", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "616e7f3f6c379d1ea6f44719b40e2fdf");
                    return;
                }
                Activity activity2 = activity;
                com.sankuai.waimai.router.a.a(activity2, b.c + "/todayrecommend");
            }
        }));
        treeNode.addChild(TreeNodeGenerator.getTreeNode("交互式推荐测试toast弹窗开关").setIsShowSwitch(true).setKey("test_personal_ai_recommend", false).setOnClickBooleanHandler(null));
        treeNode.addChild(TreeNodeGenerator.getTreeNode("poi动态刷新测试toast弹窗开关").setIsShowSwitch(true).setKey("silent_refresh_ai_recommend", false).setOnClickBooleanHandler(null));
        return treeNode;
    }
}
