package com.sankuai.xm.imui.session.view.adapter;

import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IGeneralMsgAdapter extends IExtraViewAdapter<GeneralMessage> {
    int getViewType(GeneralMessage generalMessage);

    Set<Integer> getViewTypes();
}
