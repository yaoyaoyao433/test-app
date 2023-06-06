package com.sankuai.waimai.store.search.ui.result.locate;

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
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends CustomDialog.a {
    public static ChangeQuickRedirect a;

    public b(@NonNull Context context, List<AddressItem> list) {
        super(context);
        String string;
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4583307fe76e1de47b8b13be955b4b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4583307fe76e1de47b8b13be955b4b6");
            return;
        }
        if (com.sankuai.waimai.store.locate.a.f()) {
            string = this.c.getString(R.string.wm_sc_search_title_location_recommend_dialog_locating);
        } else {
            string = this.c.getString(R.string.wm_sc_search_title_location_recommend_dialog);
        }
        a(string);
        this.d.m = new a(context, list);
        this.d.n = null;
        b(this.c.getString(R.string.wm_sc_search_locating_permission_request_cancel), (DialogInterface.OnClickListener) null);
        a(false);
    }

    @Override // com.sankuai.waimai.store.ui.common.CustomDialog.a
    public final CustomDialog a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d47a8a8ad41ade160e19def99f0b074", RobustBitConfig.DEFAULT_VALUE)) {
            return (CustomDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d47a8a8ad41ade160e19def99f0b074");
        }
        final CustomDialog a2 = super.a();
        int a3 = g.a(this.c, 12.0f);
        ListView listView = (ListView) a2.findViewById(R.id.dialog_list_view);
        listView.setDividerHeight(0);
        listView.setVerticalScrollBarEnabled(false);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.locate.b.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2b0c4858714c0eb8515d3364cdc337c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2b0c4858714c0eb8515d3364cdc337c");
                    return;
                }
                b bVar = b.this;
                CustomDialog customDialog = a2;
                Object[] objArr3 = {customDialog, adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "37ce22a620b14c3bf72e1867fc5ec47a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "37ce22a620b14c3bf72e1867fc5ec47a");
                    return;
                }
                Object itemAtPosition = adapterView.getItemAtPosition(i);
                if (itemAtPosition instanceof AddressItem) {
                    AddressItem addressItem = (AddressItem) itemAtPosition;
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
                    com.sankuai.waimai.foundation.location.v2.g.a().a(wmAddress, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), false);
                    customDialog.dismiss();
                }
            }
        });
        listView.setPadding(0, 0, 0, a3);
        LinearLayout linearLayout = (LinearLayout) a2.findViewById(R.id.dialog_root_panel);
        linearLayout.setPadding(a3, 0, a3, a3);
        linearLayout.setBackground(e.b(this.c, (int) R.color.white, (int) R.dimen.wm_sc_common_dimen_12));
        ((ViewGroup) a2.findViewById(R.id.dialog_button_panel)).getChildAt(0).setVisibility(8);
        Button button = (Button) a2.findViewById(R.id.dialog_button_negative);
        button.setBackground(e.b(this.c, (int) R.color.wm_sg_color_F5F5F6, (int) R.dimen.wm_sc_common_dimen_6));
        button.setTextColor(-14539738);
        return a2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb9752bebfe3bf8c66563340b9dd5d34", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb9752bebfe3bf8c66563340b9dd5d34");
                return;
            }
            this.b = context;
            this.c = list;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c03e177ff784f96ad333ee010cb072", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c03e177ff784f96ad333ee010cb072")).intValue() : this.c.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd9fc801d44451ce95e14147a358826b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd9fc801d44451ce95e14147a358826b") : this.c.get(i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            C1325b c1325b;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5024bc7e938f2d3c73f1aa23b3316b1e", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5024bc7e938f2d3c73f1aa23b3316b1e");
            }
            if (view == null) {
                view = LayoutInflater.from(this.b).inflate(R.layout.wm_sc_global_search_location_recommend_dialog_item, viewGroup, false);
                c1325b = new C1325b();
                c1325b.a = (TextView) view.findViewById(R.id.address_brief);
                c1325b.b = (ImageView) view.findViewById(R.id.address_selected_status);
                view.setTag(c1325b);
            } else {
                c1325b = (C1325b) view.getTag();
            }
            AddressItem addressItem = this.c.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(addressItem.addrBrief);
            if (!TextUtils.isEmpty(addressItem.addrBuildingNum)) {
                sb.append(StringUtil.SPACE);
                sb.append(addressItem.addrBuildingNum);
            }
            c1325b.a.setText(sb.toString());
            return view;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.ui.result.locate.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1325b {
        public TextView a;
        public ImageView b;

        public C1325b() {
        }
    }
}
