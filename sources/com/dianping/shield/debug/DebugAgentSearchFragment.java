package com.dianping.shield.debug;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.dianping.shield.AgentRegisterKey;
import com.dianping.shield.AgentsRegisterMapping;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.dianping.util.f;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DebugAgentSearchFragment extends Fragment implements AdapterView.OnItemClickListener {
    private static final int SEARCH_MODE_AGENT = 1;
    private static final int SEARCH_MODE_CONFIG = 0;
    private static final String UNNECESSARY_BLANK = "这可能是一个多余的空格，请检查在线配置";
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<AgentRegisterKey, ShieldConfigInfo> agentMap;
    private View contentView;
    private List<ConfigData> mConfigDataList;
    private DataConfigAdapter mDataConfigAdapter;
    private HashMap<String, List<ConfigData>> mHashMapAgentToConfigDataList;
    private ListView mListView;
    private EditText mSearchEditText;
    private TextView mSpinner;
    private View.OnTouchListener onTouchListener;
    private PopupWindow popupWindow;
    private int search_mode_flag;

    public DebugAgentSearchFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45d8a4b900243567ac58c866bd80e646", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45d8a4b900243567ac58c866bd80e646");
            return;
        }
        this.search_mode_flag = 0;
        this.mHashMapAgentToConfigDataList = new HashMap<>();
        this.onTouchListener = new View.OnTouchListener() { // from class: com.dianping.shield.debug.DebugAgentSearchFragment.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "50adeaf2b51e758fcdcf84fbfab944a7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "50adeaf2b51e758fcdcf84fbfab944a7")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    f.a(DebugAgentSearchFragment.this.mSearchEditText);
                }
                return false;
            }
        };
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "483cafc980a825e6f339367dcf328133", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "483cafc980a825e6f339367dcf328133");
        }
        if ((getActivity() instanceof AppCompatActivity) && ((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().c();
        }
        View inflate = layoutInflater.inflate(R.layout.shield_debug_config_search, viewGroup, false);
        initView(inflate);
        initData(inflate);
        return inflate;
    }

    private void initData(View view) {
        String[] split;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d397fd6d013d379f83c3e874ecffa544", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d397fd6d013d379f83c3e874ecffa544");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.mConfigDataList = (ArrayList) com.sankuai.waimai.platform.utils.f.a(arguments, "data");
        this.agentMap = AgentsRegisterMapping.getInstance().getGlobalAgentMap();
        if (checkConfigDataValid()) {
            for (ConfigData configData : this.mConfigDataList) {
                for (String str : configData.agentList.split(CommonConstant.Symbol.COMMA)) {
                    if (!HiAnalyticsConstant.REPORT_VAL_SEPARATOR.equals(str) && !UNNECESSARY_BLANK.equals(str)) {
                        if (this.mHashMapAgentToConfigDataList.containsKey(str)) {
                            List<ConfigData> list = this.mHashMapAgentToConfigDataList.get(str);
                            list.add(configData);
                            this.mHashMapAgentToConfigDataList.put(str, list);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(configData);
                            this.mHashMapAgentToConfigDataList.put(str, arrayList);
                        }
                    }
                }
            }
        }
    }

    private void initView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "309ab5961dbe366724659f8e313de380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "309ab5961dbe366724659f8e313de380");
            return;
        }
        this.mDataConfigAdapter = new DataConfigAdapter();
        this.mListView = new ListView(getContext());
        this.mListView.setAdapter((ListAdapter) this.mDataConfigAdapter);
        this.mListView.setOnItemClickListener(this);
        initPopupWindow();
        ((FrameLayout) view.findViewById(R.id.debug_search_content)).addView(this.mListView);
        this.mSearchEditText = (EditText) view.findViewById(R.id.debug_search_edit);
        final ImageButton imageButton = (ImageButton) view.findViewById(R.id.debug_clearBtn);
        this.mSpinner = (TextView) view.findViewById(R.id.debug_spinner);
        this.mSpinner.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugAgentSearchFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eabd0393958df8f5bf418b15b4a7e2be", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eabd0393958df8f5bf418b15b4a7e2be");
                } else {
                    DebugAgentSearchFragment.this.showPopupWindow(view2);
                }
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugAgentSearchFragment.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a2c921ed761982ae6e0c05bb4ded23af", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a2c921ed761982ae6e0c05bb4ded23af");
                    return;
                }
                DebugAgentSearchFragment.this.mSearchEditText.setText("");
                if (DebugAgentSearchFragment.this.search_mode_flag == 0) {
                    DebugAgentSearchFragment.this.mDataConfigAdapter.clearShopViewData();
                } else if (DebugAgentSearchFragment.this.search_mode_flag == 1) {
                    DebugAgentSearchFragment.this.mDataConfigAdapter.clearAgentData();
                }
                DebugAgentSearchFragment.this.mDataConfigAdapter.notifyDataSetChanged();
            }
        });
        this.mSearchEditText.addTextChangedListener(new TextWatcher() { // from class: com.dianping.shield.debug.DebugAgentSearchFragment.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "02ebab773540921c4dfd30f4ff7a64c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "02ebab773540921c4dfd30f4ff7a64c6");
                    return;
                }
                String trim = editable.toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    if (imageButton.getVisibility() != 4) {
                        imageButton.setVisibility(4);
                        if (DebugAgentSearchFragment.this.search_mode_flag == 0) {
                            DebugAgentSearchFragment.this.mDataConfigAdapter.clearShopViewData();
                        } else if (DebugAgentSearchFragment.this.search_mode_flag == 1) {
                            DebugAgentSearchFragment.this.mDataConfigAdapter.clearAgentData();
                        }
                        DebugAgentSearchFragment.this.mDataConfigAdapter.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                imageButton.setVisibility(0);
                if (DebugAgentSearchFragment.this.search_mode_flag != 0) {
                    if (DebugAgentSearchFragment.this.search_mode_flag == 1) {
                        DebugAgentSearchFragment.this.mHashMapAgentToConfigDataList.entrySet().iterator();
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : DebugAgentSearchFragment.this.mHashMapAgentToConfigDataList.entrySet()) {
                            String str = (String) entry.getKey();
                            if (str.contains(trim)) {
                                hashMap.put(str, entry.getValue());
                            }
                        }
                        DebugAgentSearchFragment.this.mDataConfigAdapter.setAgentData(hashMap);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (DebugAgentSearchFragment.this.checkConfigDataValid()) {
                        for (ConfigData configData : DebugAgentSearchFragment.this.mConfigDataList) {
                            if (configData.key.contains(trim)) {
                                arrayList.add(configData);
                            }
                        }
                    }
                    DebugAgentSearchFragment.this.mDataConfigAdapter.setConfigListData(arrayList);
                }
                DebugAgentSearchFragment.this.mDataConfigAdapter.notifyDataSetChanged();
            }
        });
        ((TextView) view.findViewById(R.id.debug_searchBtn)).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugAgentSearchFragment.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4c7c8cef30971b5936f7ca79cdd7da5f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4c7c8cef30971b5936f7ca79cdd7da5f");
                    return;
                }
                f.a(DebugAgentSearchFragment.this.mSearchEditText);
                DebugAgentSearchFragment.this.search(DebugAgentSearchFragment.this.mSearchEditText.getText().toString().trim());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkConfigDataValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94f98fb191a72344f3e1febeec0d98be", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94f98fb191a72344f3e1febeec0d98be")).booleanValue() : this.mConfigDataList != null && this.mConfigDataList.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void search(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c38687da9608fec0dabf1210ee2804d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c38687da9608fec0dabf1210ee2804d4");
        } else if (checkConfigDataValid() && !str.equals("")) {
            switch (this.search_mode_flag) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    for (ConfigData configData : this.mConfigDataList) {
                        if (configData.key.contains(str)) {
                            arrayList.add(configData);
                        }
                    }
                    this.mDataConfigAdapter.setConfigListData(arrayList);
                    this.mDataConfigAdapter.notifyDataSetChanged();
                    return;
                case 1:
                    HashMap<String, List<ConfigData>> hashMap = new HashMap<>();
                    for (Map.Entry<String, List<ConfigData>> entry : this.mHashMapAgentToConfigDataList.entrySet()) {
                        String key = entry.getKey();
                        if (key.contains(str)) {
                            hashMap.put(key, entry.getValue());
                        }
                    }
                    this.mDataConfigAdapter.setAgentData(hashMap);
                    this.mDataConfigAdapter.notifyDataSetChanged();
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class DataConfigAdapter extends BaseAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<ConfigData> configDataList;
        public List<String> mAgentNameList;
        public HashMap<String, List<ConfigData>> mAngetDataMap;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public DataConfigAdapter() {
            Object[] objArr = {DebugAgentSearchFragment.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "973e79ace1411f233251c3d6d0333e3d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "973e79ace1411f233251c3d6d0333e3d");
                return;
            }
            this.configDataList = new ArrayList();
            this.mAngetDataMap = new HashMap<>();
            this.mAgentNameList = new ArrayList();
        }

        public List<ConfigData> getShopViewData() {
            return this.configDataList;
        }

        public HashMap<String, List<ConfigData>> getAgentData() {
            return this.mAngetDataMap;
        }

        public List<String> getAgentList() {
            return this.mAgentNameList;
        }

        public void setConfigListData(List<ConfigData> list) {
            this.configDataList = list;
        }

        public void setAgentData(HashMap<String, List<ConfigData>> hashMap) {
            Object[] objArr = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e57c94f30fe624a80bc5624efcffd711", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e57c94f30fe624a80bc5624efcffd711");
                return;
            }
            clearAgentData();
            this.mAngetDataMap = hashMap;
            for (String str : this.mAngetDataMap.keySet()) {
                this.mAgentNameList.add(str);
            }
            Collections.sort(this.mAgentNameList);
        }

        public void clearShopViewData() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84da2213b017cf59b5d62308b59c1ee0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84da2213b017cf59b5d62308b59c1ee0");
            } else {
                this.configDataList.clear();
            }
        }

        public void clearAgentData() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "758917741b84084295365eb98d2fe94b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "758917741b84084295365eb98d2fe94b");
                return;
            }
            this.mAngetDataMap.clear();
            this.mAgentNameList.clear();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c97c1e22cb60598915914cceeb22a22a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c97c1e22cb60598915914cceeb22a22a")).intValue();
            }
            if (DebugAgentSearchFragment.this.search_mode_flag != 0) {
                if (DebugAgentSearchFragment.this.search_mode_flag != 1 || this.mAgentNameList == null) {
                    return 0;
                }
                return this.mAgentNameList.size();
            } else if (this.configDataList == null) {
                return 0;
            } else {
                return this.configDataList.size();
            }
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe9734f06501e70807eb68405137e3a1", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe9734f06501e70807eb68405137e3a1");
            }
            if (DebugAgentSearchFragment.this.search_mode_flag != 0) {
                if (DebugAgentSearchFragment.this.search_mode_flag == 1) {
                    return this.mAgentNameList.get(i);
                }
                return null;
            }
            return this.configDataList.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ca111694adfa707ef9e54ed00ca66b7", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ca111694adfa707ef9e54ed00ca66b7");
            }
            if (view == null) {
                view = LayoutInflater.from(DebugAgentSearchFragment.this.getContext().getApplicationContext()).inflate(R.layout.shield_debug_agent_config_list_item, viewGroup, false);
            }
            TextView textView = (TextView) view.findViewById(R.id.name);
            if (DebugAgentSearchFragment.this.search_mode_flag != 0) {
                if (DebugAgentSearchFragment.this.search_mode_flag == 1) {
                    textView.setText(this.mAgentNameList.get(i));
                }
            } else {
                textView.setText(this.configDataList.get(i).key);
            }
            view.setOnTouchListener(DebugAgentSearchFragment.this.onTouchListener);
            return view;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d8bbc6a706bd030910f82b8a6aee0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d8bbc6a706bd030910f82b8a6aee0ed");
        } else if (this.search_mode_flag == 0) {
            Bundle bundle = new Bundle();
            bundle.putString("data", this.mDataConfigAdapter.getShopViewData().get(i).agentList);
            DebugFragmentUtils.showFragment((AppCompatActivity) null, this, DebugAgentConfigDetailFragment.class, "DebugAgentConfigDetailFragment", bundle);
        } else if (this.search_mode_flag == 1) {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("search_shop_config", (Serializable) this.mHashMapAgentToConfigDataList.get(this.mDataConfigAdapter.getAgentList().get(i)));
            DebugFragmentUtils.showFragment((AppCompatActivity) null, this, DebugAgentSearchResultFragment.class, "DebugAgentSearchResultFragment", bundle2);
        }
    }

    public void showPopupWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff9fe6c181225e97b4620b120b16ea38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff9fe6c181225e97b4620b120b16ea38");
        } else {
            p.a(this.popupWindow, view, 20, 0);
        }
    }

    public void initPopupWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d949c01f72126040621ff72dc310e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d949c01f72126040621ff72dc310e07");
            return;
        }
        this.contentView = LayoutInflater.from(getContext()).inflate(R.layout.shield_debug_search_popup_window, (ViewGroup) null);
        this.popupWindow = new PopupWindow(this.contentView, -2, -2, true);
        ((TextView) this.contentView.findViewById(R.id.key)).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugAgentSearchFragment.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2a9725eccd5420a33996b0b3cce4b908", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2a9725eccd5420a33996b0b3cce4b908");
                    return;
                }
                DebugAgentSearchFragment.this.search_mode_flag = 0;
                DebugAgentSearchFragment.this.mSearchEditText.setText("");
                DebugAgentSearchFragment.this.mSpinner.setText("配置");
                DebugAgentSearchFragment.this.mDataConfigAdapter.clearAgentData();
                DebugAgentSearchFragment.this.mDataConfigAdapter.notifyDataSetChanged();
                p.b(DebugAgentSearchFragment.this.popupWindow);
                DebugAgentSearchFragment.this.mSearchEditText.setHint("搜索配置");
            }
        });
        ((TextView) this.contentView.findViewById(R.id.agent)).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugAgentSearchFragment.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a035c92b86460d6e8c5ddc2cd518cb3d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a035c92b86460d6e8c5ddc2cd518cb3d");
                    return;
                }
                DebugAgentSearchFragment.this.search_mode_flag = 1;
                DebugAgentSearchFragment.this.mSearchEditText.setText("");
                DebugAgentSearchFragment.this.mSpinner.setText("模块");
                DebugAgentSearchFragment.this.mDataConfigAdapter.clearShopViewData();
                DebugAgentSearchFragment.this.mDataConfigAdapter.notifyDataSetChanged();
                p.b(DebugAgentSearchFragment.this.popupWindow);
                DebugAgentSearchFragment.this.mSearchEditText.setHint("搜索模块");
            }
        });
        this.popupWindow.setTouchable(true);
        this.popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: com.dianping.shield.debug.DebugAgentSearchFragment.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        this.popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.shield_debug_search_bar_bg));
    }
}
