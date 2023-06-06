package com.sankuai.waimai.business.page.home.locate;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.home.preload.e;
import com.sankuai.waimai.foundation.location.LocationCatReporter;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends CustomDialog.a {
    public static ChangeQuickRedirect a;
    private Context d;
    private HomePageFragment e;
    private List<AddressItem> f;
    private boolean g;

    @Override // com.sankuai.waimai.platform.widget.dialog.CustomDialog.a
    public final CustomDialog a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fc1959ff164d2b271b69df47b7df13", RobustBitConfig.DEFAULT_VALUE)) {
            return (CustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fc1959ff164d2b271b69df47b7df13");
        }
        CustomDialog a2 = super.a();
        int a3 = g.a(this.d, 12.0f);
        ListView listView = (ListView) a2.findViewById(R.id.dialog_list_view);
        listView.setDividerHeight(0);
        listView.setVerticalScrollBarEnabled(false);
        listView.setOnItemClickListener(new C0789b(this.e, a2, this.f));
        listView.setPadding(0, 0, 0, a3);
        LinearLayout linearLayout = (LinearLayout) a2.findViewById(R.id.dialog_root_panel);
        linearLayout.setPadding(a3, 0, a3, a3);
        linearLayout.setBackgroundResource(R.drawable.wm_page_home_location_recommend_dialog_bg);
        ((ViewGroup) a2.findViewById(R.id.dialog_button_panel)).getChildAt(0).setVisibility(8);
        Button button = (Button) a2.findViewById(R.id.dialog_button_negative);
        button.setBackgroundResource(R.drawable.wm_page_home_location_recommend_button_bg);
        button.setTextColor(-14539738);
        return a2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends BaseAdapter {
        public static ChangeQuickRedirect a;
        private Context b;
        private List<AddressItem> c;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        private a(Context context, @NonNull List<AddressItem> list) {
            Object[] objArr = {context, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae06611c624cfe3dfe47d1d664376aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae06611c624cfe3dfe47d1d664376aa");
                return;
            }
            this.b = context;
            this.c = list;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5add32498b906e87e8236338d9408f61", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5add32498b906e87e8236338d9408f61")).intValue() : this.c.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ec415f7263fd51a7f4561618edd1322", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ec415f7263fd51a7f4561618edd1322") : this.c.get(i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            C0788a c0788a;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01473c23d8b65a03f3e2fb8e871d07e4", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01473c23d8b65a03f3e2fb8e871d07e4");
            }
            if (view == null) {
                view = LayoutInflater.from(this.b).inflate(R.layout.wm_page_home_location_recommend_dialog_item, viewGroup, false);
                c0788a = new C0788a();
                c0788a.a = (TextView) view.findViewById(R.id.address_brief);
                c0788a.b = (ImageView) view.findViewById(R.id.address_selected_status);
                view.setTag(c0788a);
            } else {
                c0788a = (C0788a) view.getTag();
            }
            AddressItem addressItem = this.c.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(addressItem.addrBrief);
            if (!TextUtils.isEmpty(addressItem.addrBuildingNum)) {
                sb.append(StringUtil.SPACE);
                sb.append(addressItem.addrBuildingNum);
            }
            c0788a.a.setText(sb.toString());
            return view;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.business.page.home.locate.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static class C0788a {
            public TextView a;
            public ImageView b;

            public C0788a() {
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.locate.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0789b implements AdapterView.OnItemClickListener {
        public static ChangeQuickRedirect a;
        private List<AddressItem> b;
        private HomePageFragment c;
        private CustomDialog d;

        private C0789b(HomePageFragment homePageFragment, CustomDialog customDialog, List<AddressItem> list) {
            Object[] objArr = {homePageFragment, customDialog, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1ee6381cb0c0dc318c8eb53c8bb982", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1ee6381cb0c0dc318c8eb53c8bb982");
                return;
            }
            this.c = homePageFragment;
            this.d = customDialog;
            this.b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f6d0f7950b18b139ec93295bedeeba8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f6d0f7950b18b139ec93295bedeeba8");
                return;
            }
            JudasManualManager.a("b_waimai_jpi99hfe_mc").a("status", 1).a("c_m84bv26").a(this.c).a();
            LocationCatReporter.c(2000);
            com.sankuai.waimai.foundation.location.a.b(2);
            PreloadDataModel.get().setLocationTimeoutState(false);
            AddressItem addressItem = this.b.get(i);
            WmAddress wmAddress = new WmAddress();
            wmAddress.setStatusCode(1200);
            WMLocation wMLocation = new WMLocation(WMLocation.WM_MANUALLY_LOCATE_PROVIDER);
            wMLocation.setLatitude(addressItem.lat / 1000000.0d);
            wMLocation.setLongitude(addressItem.lng / 1000000.0d);
            wMLocation.setCreateTime(System.currentTimeMillis());
            wmAddress.setWMLocation(wMLocation);
            wmAddress.setCreateTime(System.currentTimeMillis());
            wmAddress.setAddress(addressItem.addrBrief);
            if (!TextUtils.isEmpty(addressItem.cityCode)) {
                City city = new City();
                city.setCityCode(addressItem.cityCode);
                city.setCityName(addressItem.cityName);
                wmAddress.setMafCity(city);
            }
            e.b();
            if (this.c.j != null) {
                this.c.j.a();
                com.sankuai.waimai.foundation.location.v2.g.a().a(wmAddress, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), false);
            }
            com.sankuai.waimai.platform.domain.manager.location.a.b(this.c.getActivity(), addressItem);
            com.sankuai.waimai.platform.domain.manager.location.a.b(addressItem);
            h.a(wMLocation);
            com.sankuai.waimai.foundation.location.g.a(wMLocation.getLatitude(), wMLocation.getLongitude(), wmAddress.getAddress());
            int i2 = addressItem.recommendStrategyCode * 100;
            switch (i) {
                case 0:
                    c.a(i2 + 6);
                    break;
                case 1:
                    c.a(i2 + 7);
                    break;
                case 2:
                    c.a(i2 + 8);
                    break;
            }
            com.sankuai.waimai.foundation.location.v2.g a2 = com.sankuai.waimai.foundation.location.v2.g.a();
            long j2 = addressItem.id;
            Object[] objArr2 = {new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.location.v2.g.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "57cefd94739c692acedcd5c710b18617", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "57cefd94739c692acedcd5c710b18617");
            } else if (a2.d != null) {
                com.sankuai.waimai.foundation.location.v2.b bVar = a2.d;
                Object[] objArr3 = {new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.foundation.location.v2.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "3a3314267b20db8b2692d535afd84bf3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "3a3314267b20db8b2692d535afd84bf3");
                } else {
                    bVar.b = j2;
                }
            }
            this.d.dismiss();
        }
    }

    public b(@NonNull final HomePageFragment homePageFragment, List<AddressItem> list, boolean z) {
        super(homePageFragment.F);
        Object[] objArr = {homePageFragment, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92302275fe0190fa57840f9390a77e34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92302275fe0190fa57840f9390a77e34");
            return;
        }
        this.e = homePageFragment;
        this.f = list;
        this.d = homePageFragment.F;
        this.g = z;
        a aVar = new a(homePageFragment.getActivity(), list);
        a(homePageFragment.getString(this.g ? R.string.wm_page_home_title_location_recommend_dialog_locating : R.string.wm_page_home_title_location_recommend_dialog));
        this.c.m = aVar;
        this.c.n = null;
        b(homePageFragment.getString(R.string.wm_page_home_cancel_location_service), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.locate.b.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1de07d8045857648f438d45079c8451e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1de07d8045857648f438d45079c8451e");
                    return;
                }
                PreloadDataModel.get().setLocationTimeoutState(false);
                JudasManualManager.a("b_waimai_jpi99hfe_mc").a("status", 0).a("c_m84bv26").a(homePageFragment).a();
                c.a(9);
            }
        });
        a(false);
    }
}
