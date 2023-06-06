package com.sankuai.waimai.business.order.api.confirm.block;

import android.arch.lifecycle.k;
import android.view.View;
import com.meituan.android.cube.pga.common.b;
import com.meituan.android.cube.pga.common.g;
import com.meituan.android.cube.pga.common.h;
import com.meituan.android.cube.pga.common.i;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface a extends com.meituan.android.cube.pga.type.a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.order.api.confirm.block.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0751a {
        public boolean a;
        public boolean b;
        public String c;
    }

    void a(int i);

    void a(View view);

    g<Long> i();

    k<List<ExpInfo>> j();

    g<Map> k();

    g<String> l();

    b<Integer> m();

    b<i.c<Integer, Map<String, Object>>> n();

    b<i.c<Integer, Map<String, Object>>> o();

    b<i.c<Integer, Map<String, Object>>> p();

    b<C0751a> q();

    b<Void> r();

    g<Map<String, Object>> s();

    g<Boolean> t();

    g<String> u();

    g<Boolean> v();

    h w();
}
