package com.sankuai.xm.imui.session.view.adapter;

import android.view.View;
import com.sankuai.xm.im.message.bean.MultiLinkMessage;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IMultiLinkMsgAdapter extends IExtraAdapter<MultiLinkMessage> {
    int getOtherLinksDescriptionLine();

    void onArticleItemClick(View view, b<MultiLinkMessage> bVar, String str, String str2);

    boolean onArticleItemLongClick(View view, b<MultiLinkMessage> bVar, String str, String str2);
}
