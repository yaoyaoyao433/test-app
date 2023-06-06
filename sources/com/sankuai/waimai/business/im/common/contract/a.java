package com.sankuai.waimai.business.im.common.contract;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.sankuai.waimai.business.im.group.model.i;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.session.entity.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface a {
    Map<String, Object> a(String str, b<GeneralMessage> bVar);

    void a(com.sankuai.waimai.business.im.delegate.a aVar);

    void a(i iVar);

    void a(b<GeneralMessage> bVar, Map<String, Object> map);

    void ah_();

    void ai_();

    void aj_();

    Map<String, Object> ak_();

    void b(long j);

    void b(IMMessage iMMessage);

    void b(b<GeneralMessage> bVar, Map<String, Object> map);

    void b(Map<String, Object> map);

    void b(boolean z);

    void b_(Map<String, Object> map);

    void c(Map<String, Object> map);

    @NonNull
    Map<String, Object> h();

    WMCommonDataInfo j();

    void l();

    void o();

    int p();

    @Nullable
    String q();

    @Nullable
    String r();

    @Nullable
    String s();
}
