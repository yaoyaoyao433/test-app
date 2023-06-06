package com.dianping.shield.debug;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.dianping.eunomia.ModulesConfig;
import com.dianping.eunomia.e;
import com.dianping.model.KV;
import com.dianping.shield.AgentRegisterKey;
import com.dianping.shield.AgentsRegisterMapping;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DebugAgentConfigListFragment extends Fragment implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<AgentRegisterKey, ShieldConfigInfo> agentMap;
    private String agentMapPath;
    private String cacheMode;
    private ConfigListAdapter configListAdapter;
    private List<ConfigData> dataList;
    private ListView listView;

    public DebugAgentConfigListFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed1d0734a8a818c81b7a4084ca3ed21f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed1d0734a8a818c81b7a4084ca3ed21f");
        } else {
            this.dataList = new ArrayList();
        }
    }

    public static boolean isJSONFormat(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef0b2f743b36fbd5c82b5d0962311c0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef0b2f743b36fbd5c82b5d0962311c0a")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c01d8785198e20cbc1dd64e5690a53c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c01d8785198e20cbc1dd64e5690a53c");
        }
        if ((getActivity() instanceof AppCompatActivity) && ((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().c();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return new View(getContext());
        }
        this.agentMap = AgentsRegisterMapping.getInstance().getGlobalAgentMap();
        this.agentMapPath = arguments.getString("agentmappath");
        ModulesConfig b = e.a().b();
        if (b == null || b.configs == null || b.configs.length == 0) {
            b = e.a().a(getContext());
            this.cacheMode = "加载保底";
        } else {
            this.cacheMode = "加载缓存";
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        DebugNabviBarView debugNabviBarView = new DebugNabviBarView(getContext());
        StringBuilder sb = new StringBuilder("模块配置列表");
        if (TextUtils.isEmpty(this.cacheMode)) {
            str = "";
        } else {
            str = CommonConstant.Symbol.BRACKET_LEFT + this.cacheMode + CommonConstant.Symbol.BRACKET_RIGHT;
        }
        sb.append(str);
        debugNabviBarView.setTitleView(sb.toString());
        debugNabviBarView.setRightViewVisible(true);
        debugNabviBarView.setOnRightClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugAgentConfigListFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cb2661d5e81a4ea56fea2ae8b56ff4d1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cb2661d5e81a4ea56fea2ae8b56ff4d1");
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("data", (Serializable) DebugAgentConfigListFragment.this.dataList);
                DebugFragmentUtils.showFragment((AppCompatActivity) null, DebugAgentConfigListFragment.this, DebugAgentSearchFragment.class, "DebugAgentSearchFragment", bundle2);
            }
        });
        debugNabviBarView.setOnBackClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugAgentConfigListFragment.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db98eeccbd052c466e60c1899051121e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db98eeccbd052c466e60c1899051121e");
                } else {
                    DebugAgentConfigListFragment.this.getActivity().onBackPressed();
                }
            }
        });
        linearLayout.addView(debugNabviBarView, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(getContext());
        view.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.divider_line_gray));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, 1));
        this.listView = new ListView(getContext());
        this.configListAdapter = new ConfigListAdapter();
        this.listView.setAdapter((ListAdapter) this.configListAdapter);
        this.listView.setOnItemClickListener(this);
        if (b != null) {
            KV[] kvArr = !b.isPresent ? new KV[0] : b.configs;
            if (kvArr.length > 0) {
                this.dataList = getConfigList(kvArr);
            }
        }
        this.configListAdapter.setData(this.dataList);
        linearLayout.addView(this.listView, new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    public List<ConfigData> getConfigList(KV[] kvArr) {
        Object[] objArr = {kvArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76c779287a0067427938c0c7518e1af2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76c779287a0067427938c0c7518e1af2");
        }
        ArrayList arrayList = new ArrayList();
        if (kvArr.length > 0) {
            for (KV kv : kvArr) {
                StringBuilder sb = new StringBuilder();
                JSONArray jSONArray = null;
                try {
                    jSONArray = new JSONArray(kv.e);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                int length = jSONArray == null ? 0 : jSONArray.length();
                for (int i = 0; i < length; i++) {
                    int length2 = jSONArray.optJSONArray(i) == null ? 0 : jSONArray.optJSONArray(i).length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        String optString = jSONArray.optJSONArray(i).optString(i2);
                        if (isJSONFormat(optString)) {
                            try {
                                optString = new JSONObject(optString).optString("n");
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                                optString = "";
                            }
                        }
                        if (!TextUtils.isEmpty(optString)) {
                            sb.append(optString);
                            sb.append(CommonConstant.Symbol.COMMA);
                        }
                    }
                    sb.append("|,");
                }
                arrayList.add(new ConfigData(kv.f, sb.toString()));
            }
        }
        sortDataOrder(arrayList);
        addResponseHeader(arrayList);
        if (this.agentMapPath != null) {
            addMappingInfo(arrayList);
        }
        return arrayList;
    }

    private void addResponseHeader(List<ConfigData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7e2c319d9e22fd1d49e3cd82013b191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7e2c319d9e22fd1d49e3cd82013b191");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        String string = getActivity().getSharedPreferences(getActivity().getPackageName(), 0).getString("module_req_time", "");
        stringBuffer.append("请求触发时间: ");
        stringBuffer.append(string);
        stringBuffer.append("\n");
        list.add(0, new ConfigData("modulesconfig基本信息", stringBuffer.toString()));
    }

    private void addMappingInfo(List<ConfigData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecb84b236627ebfeca4a0b8ec91f6664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecb84b236627ebfeca4a0b8ec91f6664");
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setText("本地Mapping文件：" + this.agentMapPath);
        this.listView.addHeaderView(textView);
    }

    private void sortDataOrder(List<ConfigData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15b23a7795410abe78f3eab2b2acbbb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15b23a7795410abe78f3eab2b2acbbb2");
        } else {
            Collections.sort(list, new Comparator<ConfigData>() { // from class: com.dianping.shield.debug.DebugAgentConfigListFragment.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                public int compare(ConfigData configData, ConfigData configData2) {
                    Object[] objArr2 = {configData, configData2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "32130b7e2f6644100e8df8bb9034af0e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "32130b7e2f6644100e8df8bb9034af0e")).intValue() : configData.key.compareToIgnoreCase(configData2.key);
                }
            });
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56ecddcfe873b64d0f2731d189642314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56ecddcfe873b64d0f2731d189642314");
            return;
        }
        ConfigData configData = (ConfigData) this.listView.getItemAtPosition(i);
        Bundle bundle = new Bundle();
        if (configData != null) {
            if (i == 0) {
                bundle.putString(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER, configData.agentList);
            } else {
                bundle.putString("data", configData.agentList);
            }
            DebugFragmentUtils.showFragment((AppCompatActivity) null, this, DebugAgentConfigDetailFragment.class, "DebugAgentConfigDetailFragment", bundle);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class ConfigListAdapter extends BaseAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<ConfigData> configDataList;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public ConfigListAdapter() {
            Object[] objArr = {DebugAgentConfigListFragment.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eda41ec5117e6edf7117cd8fbb0f378f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eda41ec5117e6edf7117cd8fbb0f378f");
            } else {
                this.configDataList = new ArrayList();
            }
        }

        public void setData(List<ConfigData> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe3d10e6099b844dc74d1874942277df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe3d10e6099b844dc74d1874942277df");
                return;
            }
            this.configDataList.clear();
            this.configDataList.addAll(list);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "739cb0e241091a86415f8a11c4663fa5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "739cb0e241091a86415f8a11c4663fa5")).intValue() : this.configDataList.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23316e68242b27ea86c9c5bc0ad04178", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23316e68242b27ea86c9c5bc0ad04178") : this.configDataList.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8ec6ca2f35084f7ba522ac90775184a", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8ec6ca2f35084f7ba522ac90775184a");
            }
            if (view == null) {
                view = LayoutInflater.from(DebugAgentConfigListFragment.this.getContext().getApplicationContext()).inflate(R.layout.shield_debug_agent_config_list_item, viewGroup, false);
            }
            ((TextView) view.findViewById(R.id.name)).setText(this.configDataList.get(i).key);
            return view;
        }
    }
}
