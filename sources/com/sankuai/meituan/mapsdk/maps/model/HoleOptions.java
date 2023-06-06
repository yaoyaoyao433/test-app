package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class HoleOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<LatLng> a;

    public HoleOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce28e95c67c1156125db1a814004dc8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce28e95c67c1156125db1a814004dc8e");
        } else {
            this.a = new LinkedList();
        }
    }

    public final HoleOptions add(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f497e0c11e69ba57c303fea6bc6d8666", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoleOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f497e0c11e69ba57c303fea6bc6d8666");
        }
        if (latLng == null) {
            return this;
        }
        this.a.add(latLng);
        return this;
    }

    public final HoleOptions add(Iterable<LatLng> iterable) {
        Object[] objArr = {iterable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8361e3824bf7d057a68f1d4d59eaef1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoleOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8361e3824bf7d057a68f1d4d59eaef1e");
        }
        if (iterable == null) {
            return this;
        }
        for (LatLng latLng : iterable) {
            this.a.add(latLng);
        }
        return this;
    }

    public final List<LatLng> getPoints() {
        return this.a;
    }
}
