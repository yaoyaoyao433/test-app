package com.sankuai.waimai.platform.widget.nestedlist.impl;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends b {
    public static ChangeQuickRedirect a;
    @NonNull
    protected com.sankuai.waimai.platform.widget.nestedlist.interfaces.e b;
    private final com.sankuai.waimai.platform.widget.recycler.e e;

    @Override // com.sankuai.waimai.platform.widget.nestedlist.impl.b
    public final /* bridge */ /* synthetic */ boolean a(int i, int i2) {
        return super.a(i, i2);
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.impl.b, com.sankuai.waimai.platform.widget.nestedlist.interfaces.b
    public final /* bridge */ /* synthetic */ int d(int i) {
        return super.d(i);
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.impl.b, com.sankuai.waimai.platform.widget.nestedlist.interfaces.b
    public final /* bridge */ /* synthetic */ boolean e(int i) {
        return super.e(i);
    }

    public a(@NonNull com.sankuai.waimai.platform.widget.nestedlist.interfaces.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74bb5a6701dc4297ab5ff70b1c76183c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74bb5a6701dc4297ab5ff70b1c76183c");
            return;
        }
        this.e = new com.sankuai.waimai.platform.widget.recycler.e() { // from class: com.sankuai.waimai.platform.widget.nestedlist.impl.a.1
        };
        this.b = eVar;
        this.b.a(this.e);
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.d
    @NonNull
    public final GroupItemInfo a(int i, @NonNull GroupItemInfo groupItemInfo) {
        Object[] objArr = {Integer.valueOf(i), groupItemInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "556a108280e44d4ba3c156e903ccd313", RobustBitConfig.DEFAULT_VALUE)) {
            return (GroupItemInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "556a108280e44d4ba3c156e903ccd313");
        }
        b(i, groupItemInfo);
        return groupItemInfo;
    }

    public int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf59026b612267b9734b34e1b65147de", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf59026b612267b9734b34e1b65147de")).intValue() : this.b.a();
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee503a7818ae746ff2d97db59a613f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee503a7818ae746ff2d97db59a613f2")).booleanValue() : i >= 0 && i < a();
    }

    public final Object c(int i, @NonNull GroupItemInfo groupItemInfo) {
        Object[] objArr = {Integer.valueOf(i), groupItemInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745ed71c24f12b88dc2164cfcc928cc9", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745ed71c24f12b88dc2164cfcc928cc9");
        }
        Object b = this.b.b(i);
        int a2 = this.b.a();
        int a3 = this.b.a(i);
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(a2), Integer.valueOf(a3)};
        ChangeQuickRedirect changeQuickRedirect2 = GroupItemInfo.a;
        if (PatchProxy.isSupport(objArr2, groupItemInfo, changeQuickRedirect2, false, "4f127d12e2bda61757517eb4f232b204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, groupItemInfo, changeQuickRedirect2, false, "4f127d12e2bda61757517eb4f232b204");
        } else {
            groupItemInfo.b = i;
            groupItemInfo.c = -2;
            groupItemInfo.d = a2;
            groupItemInfo.e = a3;
            groupItemInfo.f = false;
            groupItemInfo.g = null;
        }
        groupItemInfo.f = super.a(i, -2);
        return b;
    }

    public final Object a(int i, int i2, @NonNull GroupItemInfo groupItemInfo) {
        int a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), groupItemInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1dd8986507b17edceafde7d52af757", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1dd8986507b17edceafde7d52af757");
        }
        Object a3 = this.b.a(i, i2);
        int a4 = a();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e84932ef600c076e959d4b0896a8b01b", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e84932ef600c076e959d4b0896a8b01b")).intValue();
        } else {
            a2 = !a(i) ? 0 : this.b.a(i);
        }
        Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(a4), Integer.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect3 = GroupItemInfo.a;
        if (PatchProxy.isSupport(objArr3, groupItemInfo, changeQuickRedirect3, false, "2bb99c8e8dfa56e19bbbbe3e46ace111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, groupItemInfo, changeQuickRedirect3, false, "2bb99c8e8dfa56e19bbbbe3e46ace111");
        } else {
            groupItemInfo.b = i;
            groupItemInfo.c = i2;
            groupItemInfo.d = a4;
            groupItemInfo.e = a2;
            groupItemInfo.f = false;
            groupItemInfo.g = null;
        }
        groupItemInfo.f = super.a(i, i2);
        return a3;
    }
}
