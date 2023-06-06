package com.sankuai.waimai.store.im.poi.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.base.i;
import com.sankuai.waimai.store.im.poi.model.SGIMRobotReplyData;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends i {
    public static ChangeQuickRedirect i;
    public SGIMRobotReplyData j;
    public TextView k;

    @Override // com.sankuai.waimai.store.im.base.d
    public final void a(Object obj, int i2, Map<String, Object> map, View view) {
    }

    @Override // com.sankuai.waimai.store.im.base.d
    public final void a(Map<String, Object> map) {
    }

    public f(@NonNull Context context, String str, @NonNull com.sankuai.waimai.store.expose.v2.a aVar) {
        super(context, str, aVar);
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fa7448eeb51bbd131f2a6eec930c55e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fa7448eeb51bbd131f2a6eec930c55e");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.i, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88c4102b32758c254a6c6ce111d63b60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88c4102b32758c254a6c6ce111d63b60");
            return;
        }
        super.onViewCreated();
        this.k = (TextView) findView(R.id.sg_im_robot_reply_content);
        View findView = findView(R.id.ll_praise_root);
        if (findView != null) {
            a(findView);
        }
    }
}
