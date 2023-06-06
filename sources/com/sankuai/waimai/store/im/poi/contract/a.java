package com.sankuai.waimai.store.im.poi.contract;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {
    @Nullable
    String C();

    void a(com.sankuai.waimai.store.im.delegate.a aVar);

    void a(Map<String, Object> map);

    void a_(Map<String, Object> map);

    void ah_();

    void aj_();

    Map<String, Object> ak_();

    String bt_();

    UserGroupImInfo bu_();

    void bv_();

    Context bw_();

    ICommonAdapter bx_();

    String by_();

    @NonNull
    Map<String, Object> h();

    SGCommonDataInfo m();

    @Nullable
    String r();

    @Nullable
    String s();

    int v();
}
