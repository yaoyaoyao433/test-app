package com.sankuai.waimai.platform.config.serviceloader;

import android.app.Activity;
import android.content.Intent;
import com.sankuai.waimai.platform.config.bean.TreeNode;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface BusinessNodeProvider {
    TreeNode getNode(Activity activity);

    void onActivityResult(int i, int i2, Intent intent);
}
