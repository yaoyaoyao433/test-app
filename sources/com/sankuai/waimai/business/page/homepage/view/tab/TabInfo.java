package com.sankuai.waimai.business.page.homepage.view.tab;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.mine.MineMPFragment;
import com.sankuai.waimai.business.page.mine.MineRNFagment;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TabInfo implements Parcelable {
    public static final Parcelable.Creator<TabInfo> CREATOR = new Parcelable.Creator<TabInfo>() { // from class: com.sankuai.waimai.business.page.homepage.view.tab.TabInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TabInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0947bc4e79019209dd6d041fdacca505", RobustBitConfig.DEFAULT_VALUE) ? (TabInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0947bc4e79019209dd6d041fdacca505") : new TabInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TabInfo[] newArray(int i) {
            return new TabInfo[i];
        }
    };
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public Fragment h;
    public boolean i;
    public int j;
    public boolean k;
    public Class l;
    private int m;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TabInfo(int i, String str, int i2, Class cls) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3362f5e84bbc5c36441931b73c2d94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3362f5e84bbc5c36441931b73c2d94");
            return;
        }
        this.c = null;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = false;
        this.h = null;
        this.i = false;
        this.j = -1;
        this.k = false;
        this.l = null;
        this.c = str;
        this.b = i;
        this.j = i2;
        this.l = cls;
    }

    public TabInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31614d32b83781287b1085deab7dc7ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31614d32b83781287b1085deab7dc7ef");
            return;
        }
        this.c = null;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = false;
        this.h = null;
        this.i = false;
        this.j = -1;
        this.k = false;
        this.l = null;
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.m = parcel.readInt();
        this.i = parcel.readInt() == 1;
    }

    public final Fragment a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db9271058512a9d73a65e0e7fa7d7ada", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db9271058512a9d73a65e0e7fa7d7ada");
        }
        if (this.h == null) {
            try {
                this.h = (Fragment) this.l.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                com.sankuai.waimai.foundation.utils.log.a.b(getClass().getSimpleName(), e.getMessage(), e);
            }
        }
        return this.h;
    }

    public final Fragment b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7325156c05f3acfe8d7a32373bd33c27", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7325156c05f3acfe8d7a32373bd33c27");
        }
        ABStrategy strategy = ABTestManager.getInstance().getStrategy("mine_machPro_change", null);
        if (this.h == null) {
            try {
                this.h = MineRNFagment.a("waimai", "wm-mine-page", "wm-mine-page");
                if (strategy != null && strategy.expName.equals("A")) {
                    this.h = MineMPFragment.a("mach_pro_waimai_mine");
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                com.sankuai.waimai.foundation.utils.log.a.b(getClass().getSimpleName(), e.getMessage(), e);
            }
        }
        return this.h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0805852ddc1439f1c56715be5e6bf27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0805852ddc1439f1c56715be5e6bf27");
            return;
        }
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.m);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
