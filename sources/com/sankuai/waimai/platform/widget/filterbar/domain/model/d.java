package com.sankuai.waimai.platform.widget.filterbar.domain.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    @SerializedName("need_dot")
    public boolean b;
    @SerializedName("dot_max_version")
    public int c;
    @SerializedName("need_pop")
    public boolean d;
    @SerializedName("pop_max_version")
    public int e;
    @SerializedName("pop_text: string")
    public String f;
    @SerializedName("group_id")
    public long g;
    @SerializedName("group_name")
    public String h;
    @SerializedName("is_show")
    public boolean i;

    public static ArrayList<d> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5602101fd79becbb2b04f2a3c0fcc9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5602101fd79becbb2b04f2a3c0fcc9b");
        }
        try {
            return (ArrayList) new Gson().fromJson(str, new TypeToken<ArrayList<d>>() { // from class: com.sankuai.waimai.platform.widget.filterbar.domain.model.d.1
            }.getType());
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            return null;
        }
    }
}
