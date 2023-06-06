package com.sankuai.xm.imui.session.view.adapter;

import android.view.View;
import com.sankuai.xm.im.message.bean.TemplateMessage;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ITemplateMsgAdapter extends IExtraAdapter<TemplateMessage> {
    void onCustomButtonClick(View view, b<TemplateMessage> bVar, String str);

    void onCustomLinkClick(View view, b<TemplateMessage> bVar, String str);

    void onLinkClick(View view, b<TemplateMessage> bVar);
}
