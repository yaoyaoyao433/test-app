package com.sankuai.waimai.business.search.common.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends AbstractList<Serializable> {
    public static ChangeQuickRedirect a;
    public List<Serializable> b;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        Serializable serializable = (Serializable) obj;
        Object[] objArr = {serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73800d1fe3220160653b5426ebf850bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73800d1fe3220160653b5426ebf850bd")).booleanValue() : this.b != null && this.b.add(serializable);
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c2b9f3a55d48d950a0d41fe7151378", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c2b9f3a55d48d950a0d41fe7151378");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public final Serializable get(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6401a97665412be70759cfc548aeb866", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6401a97665412be70759cfc548aeb866");
        }
        if (i >= 0 && i < this.b.size()) {
            return this.b.get(i);
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8d445f34fbef7719d1d8778f4f519f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8d445f34fbef7719d1d8778f4f519f")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9eac8de499541669ceb90b098e7da42", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9eac8de499541669ceb90b098e7da42")).booleanValue() : this.b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Serializable> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fcbd2b17e51d238433df5d6f38631c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fcbd2b17e51d238433df5d6f38631c9")).booleanValue() : this.b != null && this.b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4a17662797b25ec1446f1e639dcc254", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4a17662797b25ec1446f1e639dcc254")).booleanValue() : this.b == null || this.b.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        com.sankuai.waimai.pouch.a pouchAds;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8538f080db77854442f86c283b602836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8538f080db77854442f86c283b602836");
        } else if (this.b != null) {
            for (Serializable serializable : this.b) {
                if (serializable instanceof CommonMachData) {
                    CommonMachData commonMachData = (CommonMachData) serializable;
                    if (commonMachData.mItem != null) {
                        commonMachData.mItem.f();
                    }
                }
                if ((serializable instanceof PouchDynamicAd) && (pouchAds = ((PouchDynamicAd) serializable).getPouchAds()) != null) {
                    pouchAds.f();
                }
            }
            this.b.clear();
        }
    }
}
