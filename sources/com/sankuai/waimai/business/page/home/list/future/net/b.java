package com.sankuai.waimai.business.page.home.list.future.net;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.helper.f;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.e;
import com.sankuai.waimai.platform.widget.filterbar.view.model.SliderSelectData;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    private ArrayList<String> d;

    public b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "330922636d02f1955b25831869848db7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "330922636d02f1955b25831869848db7");
            return;
        }
        this.b = "";
        this.c = "";
        if (cVar == null) {
            return;
        }
        this.d = a(cVar);
        ArrayList<String> arrayList = this.d;
        Object[] objArr2 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45647454d1898e6084f117eda14ef57f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45647454d1898e6084f117eda14ef57f");
        } else {
            this.b = f.a(arrayList);
        }
        a(SliderSelectData.a(cVar.c));
    }

    public b(c cVar, int i) {
        this(cVar);
        Object[] objArr = {cVar, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412a2c3e25b737a829fbcfd55c365203", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412a2c3e25b737a829fbcfd55c365203");
        } else {
            JudasManualManager.a("b_waimai_u31wd7zv_mc").a("c_m84bv26").a("code", a()).a();
        }
    }

    private ArrayList<String> a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2eb6077f4c520a7f8ac6f0b30d4fe22", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2eb6077f4c520a7f8ac6f0b30d4fe22");
        }
        ArrayList<String> arrayList = null;
        if (cVar.b != null) {
            arrayList = new ArrayList<>();
            for (String str : cVar.b) {
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a7596b46f14e4361e8e843e84d5c69a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a7596b46f14e4361e8e843e84d5c69a") : e.a(this.d);
    }

    private void a(ArrayList<SliderSelectData> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18fc3cd5812377b37b98c0ece73f2b10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18fc3cd5812377b37b98c0ece73f2b10");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList != null && !arrayList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<SliderSelectData> it = arrayList.iterator();
            while (it.hasNext()) {
                SliderSelectData next = it.next();
                if (next != null && !TextUtils.isEmpty(next.b)) {
                    JSONObject a2 = next.a();
                    if (a2.length() > 0) {
                        jSONArray.put(a2);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                sb.append(jSONArray.toString());
            }
        }
        this.c = sb.toString();
    }
}
