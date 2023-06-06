package com.dianping.shield.debug;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.dianping.shield.AgentRegisterKey;
import com.dianping.shield.AgentsRegisterMapping;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DebugAgentSearchResultFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<AgentRegisterKey, ShieldConfigInfo> agentMap;
    private List<ConfigData> mConfigDataList;

    public DebugAgentSearchResultFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51110dfbe1532af25b1eb8ef870f2287", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51110dfbe1532af25b1eb8ef870f2287");
        } else {
            this.mConfigDataList = new ArrayList();
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e6b097bd1206746cf9b9b0f38b5ec8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e6b097bd1206746cf9b9b0f38b5ec8f");
        }
        if ((getActivity() instanceof AppCompatActivity) && ((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().c();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return new View(getContext());
        }
        this.mConfigDataList = (List) f.a(arguments, "search_shop_config");
        this.agentMap = AgentsRegisterMapping.getInstance().getGlobalAgentMap();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        DebugNabviBarView debugNabviBarView = new DebugNabviBarView(getContext());
        debugNabviBarView.setTitleView("搜索结果");
        debugNabviBarView.setOnBackClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugAgentSearchResultFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8cd16d3cf150efa2032f909ed474a1bc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8cd16d3cf150efa2032f909ed474a1bc");
                } else {
                    DebugAgentSearchResultFragment.this.getActivity().onBackPressed();
                }
            }
        });
        linearLayout.addView(debugNabviBarView, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(getContext());
        view.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.divider_line_gray));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, 1));
        final ListView listView = new ListView(getActivity());
        ShopAdapter shopAdapter = new ShopAdapter();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.dianping.shield.debug.DebugAgentSearchResultFragment.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view2, int i, long j) {
                Object[] objArr2 = {adapterView, view2, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "075112cc64f750b27d62114508e34113", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "075112cc64f750b27d62114508e34113");
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("data", ((ConfigData) listView.getItemAtPosition(i)).agentList);
                DebugFragmentUtils.showFragment((AppCompatActivity) null, DebugAgentSearchResultFragment.this, DebugAgentConfigDetailFragment.class, "DebugAgentConfigDetailFragment", bundle2);
            }
        });
        shopAdapter.setData(this.mConfigDataList);
        listView.setAdapter((ListAdapter) shopAdapter);
        return listView;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class ShopAdapter extends BaseAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<ConfigData> mConfigDataList;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public ShopAdapter() {
            Object[] objArr = {DebugAgentSearchResultFragment.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37dca7f4261ce2ce624a3d87d1fcc6d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37dca7f4261ce2ce624a3d87d1fcc6d9");
            } else {
                this.mConfigDataList = new ArrayList();
            }
        }

        public void setData(List<ConfigData> list) {
            this.mConfigDataList = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e47dd1feb43f87bd079be2168c53648a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e47dd1feb43f87bd079be2168c53648a")).intValue();
            }
            if (this.mConfigDataList == null) {
                return 0;
            }
            return this.mConfigDataList.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad1ec91c0e9f13746de03d1209c68b82", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad1ec91c0e9f13746de03d1209c68b82") : this.mConfigDataList.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f89ebfd3a3c7086fe0fd602f14254012", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f89ebfd3a3c7086fe0fd602f14254012");
            }
            if (view == null) {
                view = LayoutInflater.from(DebugAgentSearchResultFragment.this.getActivity().getApplicationContext()).inflate(R.layout.shield_debug_config_list_item, viewGroup, false);
            }
            ((TextView) view.findViewById(R.id.name)).setText(this.mConfigDataList.get(i).key);
            return view;
        }
    }
}
