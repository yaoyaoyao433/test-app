package com.meituan.msi.api.component.canvas.path;

import android.graphics.Path;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.meituan.msi.api.component.canvas.bean.RendParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static a b = new a();
    private Map<String, b> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f75cd26142f250847f18cb70f8d6657", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f75cd26142f250847f18cb70f8d6657");
            return;
        }
        this.c = new HashMap();
        a(new h());
        a(new e());
        a(new g());
        a(new i());
        a(new f());
        a(new c());
        a(new d());
        a(new j());
    }

    public final Path a(List<RendParam> list) {
        b bVar;
        int i;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5012d8a6affe11f8f5bb8592e6b908", RobustBitConfig.DEFAULT_VALUE)) {
            return (Path) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5012d8a6affe11f8f5bb8592e6b908");
        }
        Path path = new Path();
        if (list == null || list.size() == 0) {
            return path;
        }
        for (RendParam rendParam : list) {
            if (rendParam != null && (bVar = this.c.get(rendParam.method)) != null) {
                double[] dArr = null;
                JsonArray asJsonArray = rendParam.data.getAsJsonArray();
                if (asJsonArray != null) {
                    dArr = new double[asJsonArray.size()];
                    Iterator<JsonElement> it = rendParam.data.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        JsonElement next = it.next();
                        if (next instanceof JsonPrimitive) {
                            JsonPrimitive jsonPrimitive = (JsonPrimitive) next;
                            if (jsonPrimitive.isNumber()) {
                                dArr[i2] = next.getAsDouble();
                                i2++;
                            } else if (jsonPrimitive.isBoolean()) {
                                if (jsonPrimitive.getAsBoolean()) {
                                    i = i2 + 1;
                                    dArr[i2] = 2.0d;
                                } else {
                                    i = i2 + 1;
                                    dArr[i2] = 0.0d;
                                }
                                i2 = i;
                            }
                        }
                    }
                }
                bVar.a(path, dArr);
            }
        }
        return path;
    }

    private void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cba3d719da333e69f8b604eccbdfe0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cba3d719da333e69f8b604eccbdfe0b");
        } else {
            this.c.put(bVar.a(), bVar);
        }
    }
}
