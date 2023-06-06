package com.sankuai.xm.imui.session.view.adapter.impl;

import android.content.Context;
import android.support.constraint.R;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CommonSideAdapter extends BaseMsgAdapter implements ICommonSideAdapter {
    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getBottomSideLayout(Context context, b bVar) {
        return R.layout.xm_sdk_msg_side_bottom_default;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getInnerSideLayout(Context context, b bVar) {
        return R.layout.xm_sdk_msg_side_inner_default;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public final int getOuterSideLayout(Context context, b bVar) {
        return 0;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getTopSideLayout(Context context, b bVar) {
        return R.layout.xm_sdk_msg_side_top_default;
    }
}
