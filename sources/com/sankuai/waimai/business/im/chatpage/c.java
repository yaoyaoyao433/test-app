package com.sankuai.waimai.business.im.chatpage;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface c {
    View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void a();

    void a(int i, IMMessage iMMessage);

    void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z);

    void a(long j);

    void a(@NonNull View view, @Nullable Bundle bundle);

    void a(d.a aVar);

    void a(IMMessage iMMessage);

    boolean a(com.sankuai.xm.imui.session.entity.b bVar);

    void a_(long j);

    void al_();

    void an_();

    void b();

    ISendPanelAdapter bq_();

    void br_();

    void bs_();

    boolean d();

    IMsgViewAdapter e();

    TitleBarAdapter g();

    void k();

    boolean n();
}
