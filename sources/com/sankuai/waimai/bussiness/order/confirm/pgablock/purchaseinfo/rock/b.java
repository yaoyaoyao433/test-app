package com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker;
import com.sankuai.waimai.bussiness.order.detailnew.util.d;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.location.PhoneCodeOption;
import com.sankuai.waimai.platform.utils.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public boolean b;
    public List<PhoneCodeOption> c;
    public int d;
    public PhoneCodeOption e;
    public String f;
    private Context g;
    private RecyclerView h;
    private ArrayList<String> i;
    private int j;
    private com.sankuai.waimai.bussiness.order.confirm.a k;
    private a l;

    public b(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "852f239626bb423d970ac076dae65812", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "852f239626bb423d970ac076dae65812");
            return;
        }
        this.b = true;
        this.i = new ArrayList<>();
        this.j = 0;
        this.g = context;
        this.k = aVar;
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35be06cfcbb509bcadf5950ad169b0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35be06cfcbb509bcadf5950ad169b0d");
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -757923959:
                if (str.equals("close_hint_event")) {
                    c = 5;
                    break;
                }
                break;
            case -593210244:
                if (str.equals("phone_change_event")) {
                    c = 4;
                    break;
                }
                break;
            case -437014542:
                if (str.equals("cake_change_event")) {
                    c = 3;
                    break;
                }
                break;
            case 683001417:
                if (str.equals("phone_show_event")) {
                    c = 1;
                    break;
                }
                break;
            case 984320606:
                if (str.equals("content_show_event")) {
                    c = 2;
                    break;
                }
                break;
            case 1175642793:
                if (str.equals("code_select_event")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                try {
                    final ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = new JSONObject(d.a().toJson(map)).optJSONArray("phoneCodeOptions");
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add((PhoneCodeOption) d.a().fromJson(optJSONArray.optJSONObject(i).toString(), (Class<Object>) PhoneCodeOption.class));
                    }
                    PhoneCodeOption phoneCodeOption = (PhoneCodeOption) d.a().fromJson(d.a().toJson(map.get("phoneCode")), (Class<Object>) PhoneCodeOption.class);
                    Object[] objArr2 = {arrayList, phoneCodeOption};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c7c88854561a9ae71738cbd7385ab3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c7c88854561a9ae71738cbd7385ab3d");
                        return;
                    } else if (arrayList.size() > 0) {
                        SingleWheelPicker a2 = SingleWheelPicker.a(new ArrayList<com.sankuai.waimai.platform.ui.a>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b.2
                            {
                                addAll(arrayList);
                            }
                        });
                        a2.b = phoneCodeOption;
                        Object[] objArr3 = {phoneCodeOption, arrayList};
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        a2.d = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "09857a2159e491abacbeaf31d303b411", RobustBitConfig.DEFAULT_VALUE) ? (SingleWheelPicker.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "09857a2159e491abacbeaf31d303b411") : new c(phoneCodeOption, arrayList);
                        a2.a(((FragmentActivity) this.g).getSupportFragmentManager());
                        return;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 1:
            case 2:
                b(str, map);
                return;
            case 3:
            case 4:
                Object[] objArr4 = {map};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "171a9937bb3d5ce9e15e6646ee9c41bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "171a9937bb3d5ce9e15e6646ee9c41bb");
                    return;
                }
                String valueOf = String.valueOf(map.get("inputText"));
                if (this.l == null || this.i.size() <= 0 || this.j <= 0) {
                    return;
                }
                this.l.a(valueOf, this.i, this.j);
                return;
            case 5:
                a();
                return;
            default:
                return;
        }
    }

    private void b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c67492324a162b199589e08f0899a77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c67492324a162b199589e08f0899a77");
            return;
        }
        a();
        if (this.h == null) {
            this.h = this.k.R.a().b;
        }
        this.l = new a(this.g, str, this.h);
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            JSONArray optJSONArray = new JSONObject(d.a().toJson(map)).optJSONArray("defaultValue");
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(String.valueOf(optJSONArray.optString(i)));
            }
            this.i = arrayList;
            int a2 = r.a(String.valueOf(map.get("width")), 0);
            String valueOf = String.valueOf(map.get("inputText"));
            this.j = g.a(this.g, a2) - 60;
            this.l.a(valueOf, arrayList, this.j);
            int a3 = g.a(this.g, r.a(String.valueOf(map.get("top")), 0)) - g.a(this.g, 110.0f);
            int a4 = g.a(this.g, r.a(String.valueOf(map.get("left")), 0));
            View findViewByPosition = ((LinearLayoutManager) this.h.getLayoutManager()).findViewByPosition(this.d);
            if (this.l.b) {
                p.a(this.l, findViewByPosition, a4, a3);
            }
        } catch (Exception unused) {
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1f6ccf6e0ce96000240f722cdcb569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1f6ccf6e0ce96000240f722cdcb569");
        } else if (this.l == null || !this.l.isShowing()) {
        } else {
            p.b(this.l);
            this.l = null;
        }
    }
}
