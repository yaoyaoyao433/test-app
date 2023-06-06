package com.sankuai.waimai.platform.widget.filterbar.implement.storage;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.BubbleHistory;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.d;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.c;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.BubbleInfoBean;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.FilterConditionBean;
import com.sankuai.waimai.platform.widget.filterbar.implement.net.FilterApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.platform.widget.filterbar.domain.repository.a {
    public static ChangeQuickRedirect l;
    private Context m;
    private com.sankuai.waimai.platform.widget.filterbar.implement.converter.a n;
    private Object o;
    private c p;
    private ArrayList<d> q;

    public a(Context context, Object obj) {
        Object[] objArr = {context, obj};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80bb9535b05fa23b98a493d531313d7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80bb9535b05fa23b98a493d531313d7e");
            return;
        }
        this.p = c.GLOBAL;
        if (context != null) {
            this.m = context.getApplicationContext();
        }
        this.n = new com.sankuai.waimai.platform.widget.filterbar.implement.converter.a();
        this.o = obj;
    }

    public a(Context context, c cVar, Object obj) {
        this(context, obj);
        Object[] objArr = {context, cVar, obj};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea4901ac34dba0aa69a55e84f0a771f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea4901ac34dba0aa69a55e84f0a771f8");
        } else {
            this.p = cVar;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final com.sankuai.waimai.platform.widget.filterbar.domain.model.a C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994c05d2a176c3c8c49ab5d2671083a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.filterbar.domain.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994c05d2a176c3c8c49ab5d2671083a2");
        }
        com.sankuai.waimai.platform.widget.filterbar.domain.model.a aVar = null;
        if (this.m == null) {
            return null;
        }
        ArrayList<d> G = G();
        if (G == null || G.isEmpty()) {
            return null;
        }
        Iterator<d> it = G.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next != null) {
                long j = next.g;
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.filterbar.domain.repository.a.a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f49557502ae38ab0ef4e2d85a39bd4c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f49557502ae38ab0ef4e2d85a39bd4c3")).booleanValue() : j == -1) {
                    return new com.sankuai.waimai.platform.widget.filterbar.domain.model.a(next.b, next.c);
                }
            }
            aVar = null;
        }
        return aVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final d D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "909102be35ff37a29e1a8cf5eebf49fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "909102be35ff37a29e1a8cf5eebf49fe");
        }
        ArrayList<d> G = G();
        if (G != null && !G.isEmpty()) {
            Iterator<d> it = G.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next != null && next.i) {
                    return next;
                }
            }
        }
        d dVar = new d();
        dVar.h = "速度";
        dVar.g = 27L;
        dVar.i = true;
        return dVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final List<BubbleHistory> c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a26255b40f318b084c63586907ec04fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a26255b40f318b084c63586907ec04fb");
        }
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.m, "filter_bar_bubble_history_list", ""));
            int length = jSONArray.length();
            if (length > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                com.sankuai.waimai.platform.widget.filterbar.implement.converter.a aVar = new com.sankuai.waimai.platform.widget.filterbar.implement.converter.a();
                for (int i = 0; i < length; i++) {
                    BubbleHistory a = aVar.a(com.sankuai.waimai.platform.widget.filterbar.implement.model.a.a(jSONArray.optJSONObject(i)));
                    if (a != null && a.a() && (j <= 0 || currentTimeMillis - a.e <= j)) {
                        linkedList.add(a);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return linkedList;
    }

    private ArrayList<d> G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4136d302d82b8e7e3866171fbc7a438e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4136d302d82b8e7e3866171fbc7a438e");
        }
        if (this.q != null && !this.q.isEmpty()) {
            return this.q;
        }
        this.q = d.a(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.m, "filter_bar_group_resource", ""));
        return this.q;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void b(List<BubbleHistory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045f8f330ae221c5b7d086674d95e5cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045f8f330ae221c5b7d086674d95e5cf");
            return;
        }
        String str = "";
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (BubbleHistory bubbleHistory : list) {
                if (bubbleHistory != null && bubbleHistory.a()) {
                    com.sankuai.waimai.platform.widget.filterbar.implement.model.a aVar = new com.sankuai.waimai.platform.widget.filterbar.implement.model.a();
                    aVar.b = bubbleHistory.b;
                    aVar.c = bubbleHistory.c;
                    aVar.d = new BubbleInfoBean();
                    aVar.d.version = bubbleHistory.d.b;
                    aVar.d.isShow = bubbleHistory.d.a;
                    aVar.e = bubbleHistory.e;
                    JSONObject a = aVar.a();
                    if (a != null && a.length() != 0) {
                        jSONArray.put(a);
                    }
                }
            }
            str = jSONArray.toString();
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.m, "filter_bar_bubble_history_list", str);
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void b(Map<c, h> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0195a437bbd773674f7d8d42b14503ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0195a437bbd773674f7d8d42b14503ab");
        } else if (this.m != null && !map.isEmpty()) {
            Gson gson = new Gson();
            for (Map.Entry<c, h> entry : map.entrySet()) {
                h value = entry.getValue();
                if (value != null) {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.m, a(entry.getKey()), gson.toJson(value));
                }
            }
        }
    }

    private static String a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "630b232d04e9f9708434e458b7a0c288", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "630b232d04e9f9708434e458b7a0c288");
        }
        return "filter_bar_sort_condition_" + cVar.g;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void b(b.a<h> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f2fa162a136c18c3c45f4bb86d012f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f2fa162a136c18c3c45f4bb86d012f");
            return;
        }
        h E = E();
        if (E == null) {
            a((b.a) aVar, new Exception("context is null!"));
        } else {
            a((b.a<b.a<h>>) aVar, (b.a<h>) E);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    @Nullable
    public final h E() {
        h hVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f69422818316617a0899abbd3e1162b", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f69422818316617a0899abbd3e1162b");
        }
        if (this.m == null) {
            return null;
        }
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.m, a(this.p), "");
        if (TextUtils.isEmpty(b)) {
            b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.m, a(c.GLOBAL), "");
        }
        if (TextUtils.isEmpty(b)) {
            return H();
        }
        try {
            hVar = (h) new Gson().fromJson(b, (Class<Object>) h.class);
        } catch (Exception unused) {
            hVar = null;
        }
        return hVar == null ? H() : hVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(final long j, final long j2, final int i, int i2, final b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b> aVar) {
        com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar;
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96dfedb2a2ae00c4db313dc3c3f3b342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96dfedb2a2ae00c4db313dc3c3f3b342");
        } else if (a(j, j2, i) && (bVar = this.b) != null && bVar.b != null && !bVar.b.isEmpty()) {
            a((b.a<b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>>) aVar, (b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>) bVar);
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FilterApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FilterApi.class)).getFilterConditionByType(j, j2, i, 0, -1L, F(), i2), new b.AbstractC1042b<BaseResponse<FilterConditionBean>>() { // from class: com.sankuai.waimai.platform.widget.filterbar.implement.storage.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c841e70c1d392efa56c7a12b92cbd9bb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c841e70c1d392efa56c7a12b92cbd9bb");
                    } else if (baseResponse == null || baseResponse.data == 0 || baseResponse.code != 0) {
                        a.this.a(aVar, new Exception(baseResponse == null ? "" : baseResponse.msg));
                    } else {
                        com.sankuai.waimai.platform.widget.filterbar.domain.model.b a2 = a.this.n.a((FilterConditionBean) baseResponse.data);
                        a.this.b(j, j2, i);
                        a.this.a((b.a<b.a>) aVar, (b.a) a2);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d355f61d86bd6dff928fa8c6ca8b006d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d355f61d86bd6dff928fa8c6ca8b006d");
                    } else {
                        a.this.a(aVar, new Exception(th));
                    }
                }
            }, this.o);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(final long j, final long j2, final int i, final b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b> aVar) {
        com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar;
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b4536c24de4844b2fb8c76e49f16eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b4536c24de4844b2fb8c76e49f16eb");
        } else if (c(j, j2, i) && (bVar = this.d) != null && bVar.b != null && !bVar.b.isEmpty()) {
            a((b.a<b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>>) aVar, (b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>) bVar);
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FilterApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FilterApi.class)).getFilterConditionByType(j, j2, i, 0, D().g, true, 0), new b.AbstractC1042b<BaseResponse<FilterConditionBean>>() { // from class: com.sankuai.waimai.platform.widget.filterbar.implement.storage.a.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "805e191930ce13b7af84f70cde696a1a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "805e191930ce13b7af84f70cde696a1a");
                    } else if (baseResponse == null || baseResponse.data == 0 || baseResponse.code != 0) {
                        a.this.a(aVar, new Exception(baseResponse == null ? "" : baseResponse.msg));
                    } else {
                        com.sankuai.waimai.platform.widget.filterbar.domain.model.b a2 = a.this.n.a((FilterConditionBean) baseResponse.data);
                        a.this.d(j, j2, i);
                        a.this.a((b.a<b.a>) aVar, (b.a) a2);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0de0f054a257e46185f831a461be99b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0de0f054a257e46185f831a461be99b7");
                    } else {
                        a.this.a(aVar, new Exception(th));
                    }
                }
            }, this.o);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(boolean z, final long j, final long j2, final int i, final b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b> aVar) {
        boolean z2;
        com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), new Long(j2), Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ae6c7d152c55f9a00a638a95c0cb08b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ae6c7d152c55f9a00a638a95c0cb08b");
            return;
        }
        if (z) {
            Object[] objArr2 = {new Long(j), new Long(j2), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.filterbar.domain.repository.a.a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae0a2ba63d6f0c9f8b3e80c2b6c9f9ad", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae0a2ba63d6f0c9f8b3e80c2b6c9f9ad")).booleanValue();
            } else {
                if (this.j && this.g == j && this.h == j2) {
                    if (this.i == i) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (z2 && (bVar = this.c) != null && bVar.b != null && (this.k || !bVar.b.isEmpty())) {
                a((b.a<b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>>) aVar, (b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>) bVar);
                return;
            }
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FilterApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FilterApi.class)).getFilterConditionByType(j, j2, i, 1, -1L, F(), 0), new b.AbstractC1042b<BaseResponse<FilterConditionBean>>() { // from class: com.sankuai.waimai.platform.widget.filterbar.implement.storage.a.3
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr3 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20d9df37fa40ca491913c40566965ac3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20d9df37fa40ca491913c40566965ac3");
                } else if (baseResponse == null || baseResponse.data == 0 || baseResponse.code != 0) {
                    a.this.a(aVar, new Exception(baseResponse == null ? "" : baseResponse.msg));
                } else {
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.b a2 = a.this.n.a((FilterConditionBean) baseResponse.data);
                    a.this.e(j, j2, i);
                    a.this.a((b.a<b.a>) aVar, (b.a) a2);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "57a6b309c2ab4804319ae8793f837f4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "57a6b309c2ab4804319ae8793f837f4d");
                } else {
                    a.this.a(aVar, new Exception(th));
                }
            }
        }, this.o);
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(final String str, int i, final b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b> aVar) {
        com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar;
        Object[] objArr = {str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea6bf5b7cf38707aa92d061f89dad1c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea6bf5b7cf38707aa92d061f89dad1c4");
        } else if (this.e && c(str) && (bVar = this.b) != null) {
            a((b.a<b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>>) aVar, (b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>) bVar);
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FilterApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FilterApi.class)).getFilterCondition(i, str), new b.AbstractC1042b<BaseResponse<FilterConditionBean>>() { // from class: com.sankuai.waimai.platform.widget.filterbar.implement.storage.a.4
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfa65755d4687035a8b73b6ff84d880b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfa65755d4687035a8b73b6ff84d880b");
                    } else if (baseResponse == null || baseResponse.data == 0 || baseResponse.code != 0) {
                        a.this.a(aVar, new Exception(baseResponse == null ? "" : baseResponse.msg));
                    } else {
                        com.sankuai.waimai.platform.widget.filterbar.domain.model.b a2 = a.this.n.a((FilterConditionBean) baseResponse.data);
                        a.this.d(str);
                        a.this.a((b.a<b.a>) aVar, (b.a) a2);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "294b295be2aa93227b2b09372a9a06d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "294b295be2aa93227b2b09372a9a06d5");
                    } else {
                        a.this.a(aVar, new Exception(th));
                    }
                }
            }, this.o);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void c(final b.a<CategoryBean> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d30fc992b4ac9ba9823204a3d21126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d30fc992b4ac9ba9823204a3d21126");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FilterApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FilterApi.class)).getFilterCategory(), new b.AbstractC1042b<BaseResponse<CategoryBean>>() { // from class: com.sankuai.waimai.platform.widget.filterbar.implement.storage.a.5
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "976c661801ea99d401b8943428978ead", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "976c661801ea99d401b8943428978ead");
                    } else if (baseResponse == null || baseResponse.data == 0 || baseResponse.code != 0) {
                        a.this.a(aVar, new Exception(baseResponse == null ? "" : baseResponse.msg));
                    } else {
                        a.this.a((b.a<b.a>) aVar, (b.a) ((CategoryBean) baseResponse.data));
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccc90f9bba297d38c651c02df119c586", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccc90f9bba297d38c651c02df119c586");
                    } else {
                        a.this.a(aVar, new Exception(th));
                    }
                }
            }, this.o);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32ed884f653764014eeff8ba17ea145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32ed884f653764014eeff8ba17ea145");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.m, "filter_bar_group_resource", str);
        }
    }

    private h H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74832557025355ab6d09854150416559", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74832557025355ab6d09854150416559");
        }
        h hVar = new h();
        hVar.a = new ArrayList<>();
        hVar.b = new ArrayList<>();
        try {
            return this.n.a(com.sankuai.waimai.platform.widget.filterbar.implement.model.b.a(new JSONArray(ab.a(R.string.takeout_widget_filter_bar_default_sort_item_data_json))));
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void a(b.a<T> aVar, T t) {
        Object[] objArr = {aVar, t};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "212463abab0f7a5ce51afd45a8997ce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "212463abab0f7a5ce51afd45a8997ce8");
        } else if (aVar != null) {
            aVar.a((b.a<T>) t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void a(b.a<T> aVar, Exception exc) {
        Object[] objArr = {aVar, exc};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "473720e5d9eeabafdac8349b29315844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "473720e5d9eeabafdac8349b29315844");
        } else if (aVar != null) {
            aVar.a(exc);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final boolean F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b4a56b66cb93442fca272eba5528e6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b4a56b66cb93442fca272eba5528e6")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.m, "is_new_filter_bar_style", false);
    }
}
