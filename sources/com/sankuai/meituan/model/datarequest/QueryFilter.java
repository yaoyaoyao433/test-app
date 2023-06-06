package com.sankuai.meituan.model.datarequest;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.NoProguard;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Observable;
/* compiled from: ProGuard */
@NoProguard
/* loaded from: classes4.dex */
public class QueryFilter extends LinkedHashMap<String, String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private transient Observable observable;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4c87ec0b9965b6b02ee453daf5fae47", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4c87ec0b9965b6b02ee453daf5fae47");
        }
        String str3 = (String) super.put(str, str2);
        this.observable.notifyObservers();
        return str3;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object remove(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d489cb2090239210eb879470f8dd4952", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d489cb2090239210eb879470f8dd4952");
        }
        String str = (String) super.remove(obj);
        this.observable.notifyObservers();
        return str;
    }

    public QueryFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feb1810ac832d815cbb38cfb9e0fc488", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feb1810ac832d815cbb38cfb9e0fc488");
        } else {
            this.observable = new Observable() { // from class: com.sankuai.meituan.model.datarequest.QueryFilter.1
                @Override // java.util.Observable
                public final synchronized boolean hasChanged() {
                    return true;
                }
            };
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a225e1fa621ddee9e47a221dcd137f8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a225e1fa621ddee9e47a221dcd137f8a");
            return;
        }
        super.clear();
        this.observable.notifyObservers();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends String, ? extends String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63cedd0644590202ced21b273715603d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63cedd0644590202ced21b273715603d");
            return;
        }
        super.putAll(map);
        this.observable.notifyObservers();
    }
}
