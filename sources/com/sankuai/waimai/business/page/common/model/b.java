package com.sankuai.waimai.business.page.common.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.widget.filterbar.view.model.SliderSelectData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    public long b;
    public ArrayList<String> c;
    public String d;
    public ArrayList<SliderSelectData> e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public String j;

    public b(long j, long j2, long j3, ArrayList<String> arrayList, ArrayList<SliderSelectData> arrayList2, long j4, boolean z, String str) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), arrayList, arrayList2, new Long(j4), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e661cc0bf5be74b9d034d1fe56648bd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e661cc0bf5be74b9d034d1fe56648bd9");
            return;
        }
        this.b = 0L;
        this.d = "";
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = true;
        this.h = j;
        this.f = j2;
        this.b = j3;
        this.c = arrayList;
        this.e = arrayList2;
        this.g = j4;
        this.i = z;
        this.j = str;
        this.d = a(this.c);
    }

    public static String a(List<String> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f55360c7a02c4072a1cbe9017ae23b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f55360c7a02c4072a1cbe9017ae23b8");
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                if (i == 0) {
                    sb.append(str);
                } else {
                    sb.append(CommonConstant.Symbol.COMMA);
                    sb.append(str);
                }
                i++;
            }
        }
        return sb.toString();
    }

    public static String b(List<SliderSelectData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4729abd1967ee34bc762c989d3b1f39f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4729abd1967ee34bc762c989d3b1f39f");
        }
        if (d.a(list)) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (SliderSelectData sliderSelectData : list) {
            if (sliderSelectData != null && !TextUtils.isEmpty(sliderSelectData.b)) {
                JSONObject a2 = sliderSelectData.a();
                if (a2.length() > 0) {
                    jSONArray.put(a2);
                }
            }
        }
        return jSONArray.length() > 0 ? jSONArray.toString() : "";
    }
}
