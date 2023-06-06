package com.dianping.gcmrnmodule.objects;

import com.dianping.shield.dynamic.model.vc.ModuleKeyUnionType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012,\u0010\u0002\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005`\u0005\u0012:\u0010\u0006\u001a6\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0007j\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t`\u000b¢\u0006\u0002\u0010\fJ/\u0010\u0011\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005`\u0005HÆ\u0003J=\u0010\u0012\u001a6\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0007j\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t`\u000bHÆ\u0003Jw\u0010\u0013\u001a\u00020\u00002.\b\u0002\u0010\u0002\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005`\u00052<\b\u0002\u0010\u0006\u001a6\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0007j\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t`\u000bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\nHÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R7\u0010\u0002\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eRE\u0010\u0006\u001a6\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0007j\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/dianping/gcmrnmodule/objects/ModuleKeys;", "", "keys", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType;", "Lkotlin/collections/ArrayList;", "map", "Ljava/util/HashMap;", "", "Lkotlin/Pair;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/ArrayList;Ljava/util/HashMap;)V", "getKeys", "()Ljava/util/ArrayList;", "getMap", "()Ljava/util/HashMap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "replace", "", "moduleKey", "replacedValue", "toString", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    @NotNull
    public final ArrayList<ArrayList<ModuleKeyUnionType>> b;
    @NotNull
    private final HashMap<String, k<Integer, Integer>> c;

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f08d7939a88aa12bb5f4f55ea33ff96e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f08d7939a88aa12bb5f4f55ea33ff96e")).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!h.a(this.b, dVar.b) || !h.a(this.c, dVar.c)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e990f56d1eb148e92d6ffb98ab316f33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e990f56d1eb148e92d6ffb98ab316f33")).intValue();
        }
        ArrayList<ArrayList<ModuleKeyUnionType>> arrayList = this.b;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        HashMap<String, k<Integer, Integer>> hashMap = this.c;
        return hashCode + (hashMap != null ? hashMap.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a849dbdf05f527fe3b869a0f82e0acc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a849dbdf05f527fe3b869a0f82e0acc");
        }
        return "ModuleKeys(keys=" + this.b + ", map=" + this.c + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    public d(@NotNull ArrayList<ArrayList<ModuleKeyUnionType>> arrayList, @NotNull HashMap<String, k<Integer, Integer>> hashMap) {
        h.b(arrayList, "keys");
        h.b(hashMap, "map");
        Object[] objArr = {arrayList, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc29af9e076bcf75bed12774b2761c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc29af9e076bcf75bed12774b2761c5");
            return;
        }
        this.b = arrayList;
        this.c = hashMap;
    }

    public final void a(@NotNull String str, @NotNull ModuleKeyUnionType moduleKeyUnionType) {
        Object[] objArr = {str, moduleKeyUnionType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c893e16fd4a15b472cce2a9c1f777059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c893e16fd4a15b472cce2a9c1f777059");
            return;
        }
        h.b(str, "moduleKey");
        h.b(moduleKeyUnionType, "replacedValue");
        k<Integer, Integer> kVar = this.c.get(str);
        if (kVar != null) {
            this.b.get(kVar.a.intValue()).set(kVar.b.intValue(), moduleKeyUnionType);
        }
    }
}
