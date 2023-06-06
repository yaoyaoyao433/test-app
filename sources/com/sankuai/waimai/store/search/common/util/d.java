package com.sankuai.waimai.store.search.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        List<com.sankuai.waimai.store.search.model.d> list = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cae418cec9261ab4448c0866e157fc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cae418cec9261ab4448c0866e157fc1");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ebb0dfab35cd2dd19ccb1ec8ee1d0725", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ebb0dfab35cd2dd19ccb1ec8ee1d0725");
        } else if (!TextUtils.isEmpty(str)) {
            Gson gson = new Gson();
            ArrayList arrayList = new ArrayList();
            JsonElement parse = new JsonParser().parse(str);
            JsonArray asJsonArray = parse.isJsonArray() ? parse.getAsJsonArray() : null;
            if (asJsonArray != null) {
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    arrayList.add((com.sankuai.waimai.store.search.model.d) gson.fromJson(it.next(), (Class<Object>) com.sankuai.waimai.store.search.model.d.class));
                }
            }
            list = arrayList;
        }
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            return;
        }
        for (com.sankuai.waimai.store.search.model.d dVar : list) {
            if (dVar != null) {
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = context;
                a2.c = dVar.b;
                a2.a(new b.a() { // from class: com.sankuai.waimai.store.search.common.util.d.1
                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                    }
                });
            }
        }
    }
}
